package Encryption;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;

public class ApiEncodeTest {
	
	@Test
	public void sampleTest() {
		
		given()
		.auth().preemptive().basic("regyantra","rmgy@9999")
		.log().all()
		.when()
		.get("http://49.249.28.218:8091/projects")
		.then().log().all();
		
		
		
	}

}
