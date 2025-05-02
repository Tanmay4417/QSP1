package AutjTest;
import static io.restassured.RestAssured.*;
import org.testng.annotations.Test;

public class BasicAuthorization {
	
	@Test
	public void sampleTest()
	
	{
		given()
		  .auth().basic("rmgyantra", "rmgy@9999")
		  .when()
		   .get("http://49.249.29.5:8091/login")
		   .then()
		   .log().all();
	}

}
