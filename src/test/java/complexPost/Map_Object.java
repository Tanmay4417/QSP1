package complexPost;


import static io.restassured.RestAssured.*;
import java.util.HashMap;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class Map_Object {
	
   @Test
	public void postDataToServer() {
		
		HashMap<String,Object> map=new HashMap<String, Object>();
		
		map.put("createdBy", "Tanmay");
		map.put("status", "Created");
		map.put("teamSize", 0);
		map.put("projectName", "TAN");
		
		
	given()
		.contentType(ContentType.JSON)
		.body(map)
	.when()
		  .post("http://49.249.28.218:8091/addProject")
		.then()
		  .assertThat().statusCode(201)
		  .log().all();
		
		
		
	}


}
