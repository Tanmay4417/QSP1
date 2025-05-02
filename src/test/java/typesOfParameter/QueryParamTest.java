package typesOfParameter;
import static io.restassured.RestAssured.*;
import org.testng.annotations.Test;

public class QueryParamTest {
	
	@Test
	public void sampleTest() {
		given()
		.queryParam("projectName" ,"Airtel_1445")
		
		.when()
		     .get("http://49.249.28.218:8091/project")
		.then()
		.log().all();
		
	}

}
