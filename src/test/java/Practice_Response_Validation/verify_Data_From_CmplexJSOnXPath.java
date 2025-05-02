
package Practice_Response_Validation;

import static io.restassured.RestAssured.given;
import static org.testng.Assert.assertEquals;

import java.util.List;

import org.testng.annotations.Test;

import com.aventstack.extentreports.util.Assert;
import com.jayway.jsonpath.JsonPath;

import io.restassured.response.Response;

 @Test
 
 
 public class verify_Data_From_CmplexJSOnXPath {
	@Test
	public void SampleTest() {
		
   Response resp = given()
		   .get("http://49.249.28.218:8091/projects-paginated");
		
		   resp.then()
		       .log().all();
		   
		   
		  
		   List<String> PName = JsonPath.read(resp.asString(),"content[*].projectName");
		   System.out.println(PName);
		   
		   for(String data : PName) {
			   System.out.println(data);
		   }
		   
		   List<String> PName1 = JsonPath.read(resp.asString(),".content[*].[?(@.projectName=='H_M')].projectId");
		   String actprojectId=PName1.get(0);
		   
		  org.testng.Assert.assertEquals(actprojectId,"TY_PROJ_422");


}
}
