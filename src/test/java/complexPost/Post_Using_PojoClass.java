package complexPost;

import static io.restassured.RestAssured.*;

import java.util.Random;

import org.testng.annotations.Test;

import POJO_Utility.POJO_class;
import io.restassured.http.ContentType;



public class Post_Using_PojoClass {
	
	 @Test
		public void postDataToServer() {
			
		 //Create an object to Pojo class
		 
		 Random random=new Random();
		 int ranNum = random.nextInt(5000);
			
			POJO_class pojo=new POJO_class("Hlo"+ranNum,"Created","Tanmay",0);
			
			given()
			.contentType(ContentType.JSON)
			.body(pojo)
		.when()
			  .post("http://49.249.28.218:8091/addProject")
			.then()
			  .assertThat().statusCode(201)
			  .log().all();
			
			
			
		}


}
