package com.sample.crud.withBdd.copy;



import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class SampleTestForPartialUpdateTest {
	
	@Test
	public void PatchDataToServer() {
		
		JSONObject jsonobj = new JSONObject();
		
		jsonobj.put("projectName","The Tanmay");
		
		
		given()
		   .contentType(ContentType.JSON)
		   .body(jsonobj.toJSONString())
		.when()
		   .patch("http://49.249.28.218:8091/project/NH_PROJ_15206")
		.then()
		   .assertThat().statusCode(200)
		   .log().all();
	}	
		

}


