package panCardMock;

import com.jayway.jsonpath.JsonPath;

import spark.Spark;

public class creditCardMock {

	public static void main(String[] args) {

		Spark.port(8889);
		Spark.post("/credit-card", (req, res) -> {

			String response="";
			String card = JsonPath.read(req.body().toString(), "$.creditcard"); // $ is used before any json path
			if(card.equals("1234567891234")) {
			        response="{\"status\":\"payment success\"}";
			        res.status(200);
			}
			else {
				response="{\"status\":\"payment Failed\"}";	
				res.status(404);
			}

			res.type("application/json");
			return response;

		});
		
		System.out.println(" ---- RUN ----");

	}
}

 
