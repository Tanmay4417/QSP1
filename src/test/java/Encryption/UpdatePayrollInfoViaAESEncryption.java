package Encryption;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;

public class UpdatePayrollInfoViaAESEncryption {

	@Test
	public void sampleTest() {

		String jbody = "{ \"employee\": { \"empId\":\"string\", \"designation\": \"string\", \"dob\": \"dd/MM/yyyy\", \"email\": \"string\", \"empName\": \"string\", \"experience\": 0, \"mobileNo\": \"string\", \"project\": \"string\", \"role\": \"string\", \"username\": “string” }, \"basicPlusVda\": 0, \"hra\": 0, \"insurance\": 0, \"lta\": 0, \"lwf\": 0, \"netPay\": 0, \"payroll_id\": 0, \"pf\": 0, \"pt\": 0, \"stat_bonus\": 0, \"status\": “Active/Disabled” }";
		given()
		 .body("")
		.when().put("http://49.249.28.218:8091/payroll")
		 .then()
		   .log().all();

	}

}
