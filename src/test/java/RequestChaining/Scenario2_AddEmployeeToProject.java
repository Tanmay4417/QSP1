package RequestChaining;

import static io.restassured.RestAssured.given;

import java.util.Random;

import org.testng.annotations.Test;

import POJO_Utility.Employee_pojo;
import POJO_Utility.POJO_class;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class Scenario2_AddEmployeeToProject {

	@Test
	public void postDataToServer() {

		// Create an object to Pojo class

		Random random = new Random();
		int ranNum = random.nextInt(1000);

		// Api-1 ==> add a project in side server

		POJO_class pojo = new POJO_class("AIRTEL_" + ranNum, "Created", "Tanmay", 0);

		Response resp = given().contentType(ContentType.JSON).body(pojo).when()
				.post("http://49.249.28.218:8091/addProject");

		resp.then().assertThat().statusCode(201).log().all();

		// Capture Project Name from the Response.

		String projectName = resp.jsonPath().get("projectName");
		System.out.println(projectName);

		// Api 2 -- Add Employee to same project

		Employee_pojo emp = new Employee_pojo("Architect", "01/02/2000", "hii@gmail.com", "User_" + random, 18,
				"4521255452", projectName, "ROLE_EMPLOYEE", "User_" + random);

		given().contentType(ContentType.JSON).body(emp).when().post("http://49.249.28.218:8091/employees")
               .then().assertThat().statusCode(201)
               .log().all();

	}
}
