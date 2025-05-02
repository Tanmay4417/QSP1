package com.sample.crud.withBdd.copy;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import io.restassured.http.ContentType;


public class SampleTestForCreate {
	
	@Test
	public void postDataToServer() {
		
		JSONObject jsonobj = new JSONObject();
		
		jsonobj.put("createdBy", "Tanmay");
		jsonobj.put("status", "Created");
		jsonobj.put("teamSize", 0);
		jsonobj.put("projectName", "Tanmay1");
		
		
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
