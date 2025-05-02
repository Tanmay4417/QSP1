package Practice_Response_Validation;

import org.hamcrest.Matchers;
import org.testng.annotations.Test;

import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

public class Vrify_ResponseBody_viaJSONPath {
	
	
	@Test
	public void SampleTest() {
		
 Response resp = given()
		   .get("http://49.249.28.218:8091/projects-paginated");
		
		   resp.then()
		       .log().all();
		   
		  //RestAssured inbuild Assertion 
		   resp.then().assertThat().body("numberOfElements",Matchers.greaterThanOrEqualTo(20));
		   resp.then().assertThat().body("pageable.sort.sorted",Matchers.equalTo(false));
		   resp.then().assertThat().body("content[0].projectId",Matchers.equalTo("TY_PROJ_422"));
		   
		   
		    //For extracting data from Json file.
		   
		   int data = resp.jsonPath().get("numberOfElements");
		   System.out.println(data);
		   
		   boolean value=resp.jsonPath().get("pageable.sort.sorted");
		   System.out.println(value);
		   
		 String  data3=resp.jsonPath().get("content[0].projectId");
		 System.out.println(data3);
		 
		
	}

}
