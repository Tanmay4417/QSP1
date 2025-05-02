package typesOfParameter;
import static io.restassured.RestAssured.*;
import org.testng.annotations.Test;

public class FormParamTest {
	
	@Test
	public void sampleTest() {
		given()
		.formParam( "projectName","Airtel_1445")
		.log().all()
		.when()
		     .post("http://49.249.28.218:8091/project")
		.then()
		.log().all();
		
	}

}
