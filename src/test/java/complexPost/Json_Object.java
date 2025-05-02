package complexPost;

import static io.restassured.RestAssured.*;

import org.json.simple.JSONObject;

import io.restassured.http.ContentType;

public class Json_Object {
	
public void postDataToServer() {
		
		JSONObject jsonobj = new JSONObject();
		
		jsonobj.put("createdBy", "Tanmay");
		jsonobj.put("status", "Created");
		jsonobj.put("teamSize", 0);
		jsonobj.put("projectName", "TAN1");
		
		
	given()
		.contentType(ContentType.JSON)
		.body(jsonobj.toJSONString())
	.when()
		  .post("http://49.249.28.218:8091/addProject")
		.then()
		  .assertThat().statusCode(201)
		  .log().all();
		
		
		
	}


}
