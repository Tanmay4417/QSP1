package Practice_Response_Validation;

import static io.restassured.RestAssured.given;

import java.util.concurrent.TimeUnit;


import org.hamcrest.Matchers;
import org.testng.annotations.Test;

import io.restassured.response.Response;

public class VerifyResponseTimeTest {

	@Test
	public void verifyTime() {

		Response res = given().get("http://49.249.28.218:8091/projects");

		res.then().log().all();

		Long timeTaken = res.time();
		Long timeTakenSec = res.timeIn(TimeUnit.SECONDS);

		System.out.println(timeTaken);
		System.out.println(timeTakenSec);

		res.then().assertThat().time(Matchers.lessThan(2000L));
		res.then().assertThat().time(Matchers.greaterThan(300L));
		
		res.then().assertThat().time(Matchers.both(Matchers.greaterThan(300L)).and(Matchers.lessThan(2000L)));

	}
}
