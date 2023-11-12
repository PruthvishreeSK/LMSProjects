package RestAssuredScripts;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

public class LoggingMethods {

	@Test
	public void auth()
	{
		String PMapikey = "PMAK-654481c877960233d5d43ecc-f6d705001072cebc0068233b023034227f";
		
		//https://api.postman.com/workspaces
		
		given().baseUri("https://api.postman.com")
		//.basePath("/workspaces/incorrect")
		.basePath("/workspaces")
		.header("x-api-key", PMapikey)
		.when().get()
		.then()
		//.log().ifStatusCodeIsEqualTo(201);
		//.statusCode(200)
		//.log().all();
		//.log().headers();
		//.log().ifError();
		.log().body();
		//.log().cookies();
		
		
	}
	
}
