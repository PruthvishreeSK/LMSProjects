package RestAssuredScripts;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

import io.restassured.response.Response;

public class Script08GithubBearerToken {

	//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

	
		@Test(priority='1')
		public void Authorization_bearertoken()
		{
			
		Response res=	given().baseUri("https://api.github.com")
			.basePath("/user/repos")
			.header("Authorization","Bearer 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")
			.when().get()
			.then().statusCode(200)
			.extract().response();
		
			res.prettyPrint();
		}
		
		
		@Test(priority='2')
		public void Authorization_bearertoken_specificrepo()
		{
			
		Response res=	given().baseUri("https://api.github.com")
			.basePath("/repos/PruthvishreeSK/Postman-Api-195")
			.header("Authorization","Bearer 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")
			.when().get()
			.then().statusCode(200)
			.extract().response();
		
			res.prettyPrint();
		}
		
}
