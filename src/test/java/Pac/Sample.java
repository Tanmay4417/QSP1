package Pac;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class Sample {
	@Test
	public void sampleGetRequest() {
		
		Response Resp=RestAssured.get("https://reqres.in/api/users?page=2");
		System.out.println(Resp.prettyPrint());
	}

}
