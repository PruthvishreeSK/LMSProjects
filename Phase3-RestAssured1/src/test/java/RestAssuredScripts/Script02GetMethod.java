package RestAssuredScripts;

import org.testng.Assert;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class Script02GetMethod {

	
	@Test
	public void getresponse() {
		//use http get method
		Response res = RestAssured.get("https://reqres.in/api/users?page=2");
		//System.out.println(res.asString());
		
		res.prettyPrint();
		//System.out.println(res.getBody().asString());
		System.out.println(res.getTime());
		System.out.println(res.getContentType());
		
		int expectedstatuscode = 200;
		int actualstatuscode = res.getStatusCode();
		System.out.println(actualstatuscode);
		
		Assert.assertEquals(expectedstatuscode, actualstatuscode);
		
	}

	//Method chaining concept for API testing
	@Test
	public void GetMethodBDDStyle()
	{
		RestAssured.given()
		.baseUri("https://reqres.in/api/users")
		.queryParam("page", "2")
		.when().get()
		.then()
		.statusCode(200) //it is validation method, checks if status code is 200 or not
		.log().all(); //fetch all logs
		
	}
	
	
	
	
	
	
	
	
	
}
