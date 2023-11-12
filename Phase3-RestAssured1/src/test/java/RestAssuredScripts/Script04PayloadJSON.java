package RestAssuredScripts;

import org.json.JSONObject;

import org.testng.annotations.Test;
import static org.hamcrest.Matchers.equalTo;

import io.restassured.RestAssured;

public class Script04PayloadJSON {
		
		// Send the body with the post request with content type as JSON
		
		// Sending JSON data directly from test method
		

		@Test(enabled=true)
		public void postusingJSON()
		{
			
			JSONObject body = new JSONObject();
			body.put("name", "Pruthvi");
			body.put("salary", "16573");
			body.put("age", "23");
			
			RestAssured.given()
			.baseUri("https://dummy.restapiexample.com/api/v1")
			.contentType("application/json")
			.body(body.toString())
			.when().post("/create")
			.then()
			.statusCode(200).log().all();
			
		}
		
		@Test(enabled=false)
		public void getresponseid()
		{
			JSONObject body = new JSONObject();
			body.put("name", "Pruthvishree");
			body.put("salary", "56666");
			body.put("age", "67");
			
			int responseid = RestAssured.given()
			.baseUri("https://dummy.restapiexample.com")
			.basePath("/api/v1")
			.contentType("application/json")
			.body(body.toString())
			.when().post("/create")
			.then().statusCode(200)
			.body("data.name", equalTo("Pruthvishree"))
			.extract().path("data.id");
			
			System.out.println(responseid);
			
		}
	
}
