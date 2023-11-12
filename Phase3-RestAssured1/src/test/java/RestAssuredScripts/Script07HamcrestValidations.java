package RestAssuredScripts;

import static io.restassured.RestAssured.given;

import static org.hamcrest.Matchers.*;

import org.testng.annotations.Test;

public class Script07HamcrestValidations {

	String PMapikey = "PMAK-654481c877960233d5d43ecc-f6d705001072cebc0068233b023034227f";
	
	// Hamcrest dependency has been added to your POM file
		// This depenedency provides us many validation methods that help us to validate the response code

		// equalTo() Hamcrest method
		//@Test(priority='1')
		public void ValidateRepsonseBody()
		{
			
			given().baseUri("https://api.postman.com")
			.basePath("/workspaces")
			.header("X-API-Key", PMapikey)
			.when().get()
			.then().statusCode(200)
			// fetch the repsonse body and validate if response includes corrrect values or not
			.body("workspaces[2].id", equalTo("6b8397ba-b5a8-4ab1-bc11-0e567e570148"),
				  "workspaces[2].name", equalTo("Post Request Workspace"),
				   "workspaces[2].type", equalTo("personal"));
			
		}
		
		@Test(priority='2')
		public void ValidateRepsonseBody_equlaTo()
		{
			/*
			 {
    "id": 100,
    "username": "Uname001",
    "email": "Positive@Attitude.com",
    "password": "12345",
    "userStatus": 1
} */
			 
			
			given().baseUri("https://petstore.swagger.io")
			.basePath("/v2/user/Uname001")
			.when().get()
			.then().statusCode(200)
			// fetch the repsonse body and validate if response includes corrrect values or not
			.body("username", equalTo("Uname001"),
				  "email", equalTo("Positive@Attitude.com"),
				  "userStatus", equalTo(1));

		}
		
		//@Test(priority='3')
		public void ValidateRepsonseBody_hasitems()
		{
			
			given().baseUri("https://api.postman.com")
			.basePath("/workspaces")
			.header("X-API-Key", PMapikey)
			.when().get()
			.then().statusCode(200)
			// fetch the repsonse body and validate if response includes corrrect values or not
			.body("workspaces.name", hasItems("Phase3 Lesson2 API Testing","Post Request Workspace1","My Workspace"),
					"workspaces.type", hasItems("personal"));
			
			
		}
	
}
