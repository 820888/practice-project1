package restassuredscripts;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

import io.restassured.response.Response;

public class Script008GitHubBearerToken {
	
	@Test(priority='1')
	public void Authorization_bearertoken() {
	Response res=given().baseUri("https://api.github.com")
			.basePath("/user/repos")
			.header("Authorization", "Bearer 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")
			.when().get()
			.then().statusCode(200)
			.extract().response();
			res.prettyPrint();
	}
}
