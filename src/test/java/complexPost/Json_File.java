package complexPost;

import static io.restassured.RestAssured.given;

import java.io.File;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class Json_File {

	@Test
	public void CreateData() {

		File f = new File("./JsonFolder/New.json");

		given()
		        .contentType(ContentType.JSON)
		.body(f)
		        .when().post("http://49.249.28.218:8091/addProject")
		.then()
				.assertThat().statusCode(201)
				.log().all();

	}

}
