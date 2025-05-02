package com.sample.crud.withoutBdd;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class SampleTestForCompleteUpdateTest {
	
	@Test
	public void putDataToServer() {
		
		JSONObject jsonobj = new JSONObject();
		jsonobj.put("createdBy","Tanmay");
		jsonobj.put("Status","Created");
		jsonobj.put("teamSize", 0);
		jsonobj.put("projectName","The_Tanmay");
		
		
		
		RequestSpecification req = RestAssured.given();
		req.contentType(ContentType.JSON);
		req.body(jsonobj.toJSONString());
		
		Response resp = req.put("http://49.249.28.218:8091/project/NH_PROJ_15197");
		resp.then().log().all();
		resp.then().assertThat().statusCode(200);
	}

}

