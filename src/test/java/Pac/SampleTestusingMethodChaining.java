package Pac;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import io.restassured.response.Response;

public class SampleTestusingMethodChaining {
	
	@Test
	public void getRequestTest() {
		
		get("https://reqres.in/api/users?page=2")
		.then()
		.log()
		.all();
		
		
//		Response Resp=RestAssured.get("https://reqres.in/api/users?page=2");
//		System.out.println(Resp.prettyPrint());
	}

}
