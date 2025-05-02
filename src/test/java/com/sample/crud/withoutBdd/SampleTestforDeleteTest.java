package com.sample.crud.withoutBdd;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class SampleTestforDeleteTest {
	
	@Test
	public void DeleyteDataFromServer() {
		
		Response resp = RestAssured.delete("http://49.249.28.218:8091/project/NH_PROJ_15197");
		//System.out.println(resp.prettyPrint());
		
		//resp.then().assertThat().statusCode(204);
		
		resp.then().log().all();
		
	}

}

