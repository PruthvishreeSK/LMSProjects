package RestAssuredScripts;

import org.json.JSONObject;
import org.testng.annotations.Test;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class LessonEndProject {

	/*Base URL: https://reqres.in/api

	Register User URL: https://reqres.in/api/register

	Get Users URL: https://reqres.in/api/users

	Logging Test URL: https://reqres.in/api/unknown*/
	
	
	
	@Test
	public void get_users()
	{
		
			JSONObject body = new JSONObject();
			body.put("name", "Pruthvishreesk");
			body.put("job", "singer");
			
			RestAssured.given()
			.baseUri("https://reqres.in")
			.basePath("/api/users")
			.contentType(ContentType.JSON)
			.body(body.toString())
			.when().post()
			.then().statusCode(201)
			.log().all();
					
	}
	
	
	@Test
	public void register_user()
	{
		
		  RestAssured.given().baseUri("https://reqres.in")
		  .contentType(ContentType.JSON)
		  .when().get("/api/register")
		  .then().statusCode(200)
		  .log().body();
	}
	
	@Test
	public void logging_test()
	{
		RestAssured.given()
		.baseUri("https://reqres.in")
		.basePath("/api/unknown")
		.when().get()
		.then().statusCode(200).
		log().all();
	}
	
}
	
