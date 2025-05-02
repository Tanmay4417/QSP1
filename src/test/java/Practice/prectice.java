package Practice;

import org.hamcrest.Matcher;
import org.hamcrest.Matchers;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import com.google.gson.JsonObject;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import static io.restassured.RestAssured.*;

public class prectice {

	@Test
	public void createTest() {
		
//		JSONObject jsonobj=new JSONObject();
//		
//		jsonobj.put("createdBy", "Tanmay");
//		jsonobj.put("status", "Created");
//		jsonobj.put("teamSize", 0);
//		jsonobj.put("projectName", "Tanmay101");
		
		given()
		.pathParam( "projectId","NH_PROJ_16981")
		.log().all()
//		.contentType(ContentType.JSON)
//		.body(jsonobj.toJSONString())
//	.when()
	    .get("http://49.249.28.218:8091/project/{projectId}")
	 .then()
	     .log().all()
	     .assertThat().statusCode(200)
	     .assertThat().contentType(ContentType.JSON)
	     .assertThat().statusLine("HTTP/1.1 200 ")
	     .assertThat().time(Matchers.greaterThan(300L))
	     .assertThat().time(Matchers.lessThan(3000L))
	     .assertThat().time(Matchers.both(Matchers.lessThan(3000L)).and(Matchers.greaterThan(200L)))
	     .assertThat().body("projectName",Matchers.equalTo("Tanmay101"))
	     .assertThat().body("projectId",Matchers.equalTo("NH_PROJ_16981"));
		
		
		
		
		

		
		
		
		

	}

}
