package RestAssuredScripts;

import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;

import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class Script06PostmanAPIKey {
	
	String PMapikey = "PMAK-654481c877960233d5d43ecc-f6d705001072cebc0068233b023034227f";
	
	//@Test
	public void auth()
	{
		//https://api.postman.com/workspaces
		
		given().baseUri("https://api.postman.com")
		.basePath("/workspaces")
		.header("x-api-key", PMapikey)
		.when().get()
		.then().statusCode(200).log().all();
	}
	
	//@Test(priority='2')
	public void extract_value_response()
	{	
		String responseoutput = given().baseUri("https://api.postman.com")
		.basePath("/workspaces")
		.header("X-API-Key", PMapikey)
		.when().get()
		.then()
		.extract().path("workspaces[1].name"); // extracting the name and save it in a string
		
		System.out.println("The name of the workspace extracted is: " + responseoutput);
		
	}
	
	@Test(priority='3')
	public void extract_response_JSONPath()
	{
		
		Response res = given().baseUri("https://api.postman.com")
		.basePath("/workspaces")
		.header("X-API-Key", PMapikey)
		.when().get()
		.then()
		.extract().response(); // extracting the response and save it in a Response object
		
		JsonPath json = new JsonPath(res.asString());
		
		System.out.println(json.getString("workspaces[2]"));
		
	}

}
