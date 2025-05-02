package DDT;
import static io.restassured.RestAssured.*;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


import io.restassured.http.ContentType;

public class AddMultipleProjectTest {
	
	@Test(dataProvider = "getData")
	public void sampleTest(String PName,String status) {
		
		
		String reqBody="{\r\n"
				+ "  \"createdBy\": \"string\",\r\n"
				+ "  \"projectName\": \""+PName+"\",\r\n"
				+ "  \"status\": \""+status+"\",\r\n"
				+ "  \"teamSize\": 0\r\n"
				+ "}";
		
		given()
		.contentType(ContentType.JSON)
		.body(reqBody)
	.when()
	     .post("http://49.249.28.218:8091/addProject")
	 .then()
	 .log().all();
		
		
	}
	
	@DataProvider
	public Object [][] getData() throws Throwable {
		
		ExcelUtility e=new ExcelUtility();
		int count = e.getRowCount("Project");
		
		Object [][] obj=new Object[count][2];
		
		
		for(int i=0;i<count;i++) {
			obj[i][0]=e.getDataFromExcel("Project", i+1,0);
			obj[i][1]=e.getDataFromExcel("Project", i+1,1);
		}
		
//		obj[0][0]="AIRINDIA1";
//		obj[0][1]="Created";
//		
//		obj[1][0]="AIRINDIA2";
//		obj[1][1]="Created";
//		
//		obj[2][0]="AIRINDIA3";
//		obj[2][1]="Created";
		
		return obj;
		
		
	}

}
