package com.sample.crud.withBdd.copy;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import io.restassured.response.Response;

public class SampleTestforDeleteTest {
	
	@Test
	public void DeleyteDataFromServer() {
		
		given()
		  .delete("http://49.249.28.218:8091/project/NH_PROJ_15206")
		.then()
		   .assertThat().statusCode(204)
		   .log().all();
		
		
	}}	
		

