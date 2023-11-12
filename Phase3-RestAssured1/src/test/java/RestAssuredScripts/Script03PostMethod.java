package RestAssuredScripts;

import java.util.HashMap;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class Script03PostMethod {

	
	//create a user on the webpage using POST
	@Test
	public void postmethod()
	{
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("name", "John");
		map.put("job", "Tester");
		
		RestAssured.given()
		.baseUri("https://reqres.in")
		.basePath("/api/users")
		.contentType("application/json") //type of content body
		.body(map) //body to be sent
		.when().post()
		.then().statusCode(201)
		.log().body();
	}
	
}
