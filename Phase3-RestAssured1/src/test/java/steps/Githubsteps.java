package steps;

import static io.restassured.RestAssured.*;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;

public class Githubsteps {

	@Given("User enters github base url and auth")
	public void user_enters_github_base_url_and_auth() {
	    
		Response res = given().baseUri("https://api.github.com")
				.basePath("/user/repos")
				.header("Authorization","Bearer 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")
				.when().get()
				.then().statusCode(200)
				.extract().response();
			
				res.prettyPrint();
		
	}

	@When("user executes HTTP get method")
	public void user_executes_http_get_method() {
	    
	}

	@Then("validate the response status code")
	public void validate_the_response_status_code() {
	    
	}
	
}
