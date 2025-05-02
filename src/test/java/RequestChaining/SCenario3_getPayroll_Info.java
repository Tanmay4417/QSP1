package RequestChaining;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;

import com.aventstack.extentreports.gherkin.model.Given;

import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;

public class SCenario3_getPayroll_Info {
	
	@Test
	public void SampleTest() {
		
		//API1 - Get AUTH
		Response resp = given()
		.formParam("client_id","ninja-client")
		.formParam("client_secret","gpQBf1Yxew50MccMhzos1GefIyisnXzM")
		.formParam("grant_type","client_credintials")
		.when().post("http://49.249.28.218:8108/auth/realms/ninja/protocol/openid-connect/token");
		
		resp.then().log().all();
	
		//Capture the token from the response
		String token = resp.jsonPath().get("access_token");
		
		
	//API2 - Get Payroll Info	
		given()
		.auth().oauth2(token)
		.get("http://49.249.28.218:8091/admin/payrolls")
		.then()
		.log().all();
		
	}

}
