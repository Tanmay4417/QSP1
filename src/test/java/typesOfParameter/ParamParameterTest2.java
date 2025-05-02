package typesOfParameter;
import static io.restassured.RestAssured.*;
import org.testng.annotations.Test;

public class ParamParameterTest2 {
	
	@Test
	public void sampleTest() {
		given()
		.param("teamSize", 0)
		.log().all()
		.when()
		     .post("http://49.249.28.218:8091/project")
		.then()
		.log().all();
		
	}

}
