package restassuredscripts;

import static org.hamcrest.Matchers.*;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class Script007HamcrestValidateMethods {
	
	// Hamcrest dependency has been added to your POM file
	// This dependency provides us many validation methods that help us to validate the response code
	
	// equalTo() Hamcrest method
	
	@Test(priority='1')
	public void ValidateResponseBody() {
		
		String PMapikey="PMAK-6579227644023b27b37e0890-09ece205c00a0e31ef21a0be9402e0e484";
		
		given().baseUri("https://api.postman.com")
		.basePath("/workspaces")
		.header("x-api-key",PMapikey )
		.when().get()
		.then().statusCode(200)
		//fetch the resonse body and validate if response includes correct values or not
		
		.body("workspaces[1].id", equalTo("c066f1da-db19-4da0-83e9-d28d0fa85c82"),
				"workspaces[1].name", equalTo("Phase-3-Postman"),
				"workspaces[1].type", equalTo("personal"));
			  	
	}
	
	@Test(priority='2')
	public void ValidateResponseBody_equalTo() {
		
		
		given().baseUri("https://petstore.swagger.io")
		.basePath("/v2/user/SameenaShaik")
		.when().get()
		.then().statusCode(200)
		//fetch the response body and validate if response includes correct values or not
		
		.body("username", equalTo("SameenaShaik"),
			 ("firstName"),equalTo("Sameena"),
			 ("lastName"),equalTo("Shaik"),
			 ("email"),equalTo("Positive@Attitude.com"),
			 ("userStatus"),equalTo(1));
			 
			 		
	}
}
