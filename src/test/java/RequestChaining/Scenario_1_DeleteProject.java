package RequestChaining;

import static io.restassured.RestAssured.given;

import java.util.Random;

import org.testng.annotations.Test;

import POJO_Utility.POJO_class;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class Scenario_1_DeleteProject {
	
	 @Test
		public void postDataToServer() {
			
		 //Create an object to Pojo class
		 
		 Random random=new Random();
		 int ranNum = random.nextInt();
			
		
		 //Api-1 ==> add a project in side server
		 POJO_class pojo=new POJO_class("AIRTEL_"+ranNum,"Created","Tanmay",0);
			
			Response resp = given()
			.contentType(ContentType.JSON)
			.body(pojo)
		.when()
			  .post("http://49.249.28.218:8091/addProject");
			
			resp.then()
			  .assertThat().statusCode(201)
			  .log().all();
			
			//Capture Project Name from the Response.
			
			String projectId=resp.jsonPath().get("projectId");
			System.out.println(projectId);
			
			//APi 2 -- Delete Project
			
			given()
			   .delete("http://49.249.28.218:8091/project/"+projectId)
			.then()
			     .log().all();
			
			
			
			
			
		}


}
