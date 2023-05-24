package authorizaztion;

import org.json.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class OAuth2 {
	
	@Test
	public void test() {
		String accessToken = tokenGeneration();
		
		Response response = RestAssured
		  .given()
		  .auth()
		  .oauth2(accessToken)
		  .post("http://coop.apps.symfonycasts.com/api/3948/chickens-feed");
		
		System.out.println("Status Code : "+response.getStatusCode());
		System.out.println("Body : "+response.getBody().asString());
		
	}
	
	public String tokenGeneration() {
		Response response = RestAssured
		  .given()
		  .formParam("client_id", "PrudhviApplication")
		  .formParam("client_secret","25240e6253735125c96cc22bc4fdf73d")
		  .formParam("grant_type","client_credentials")
		  .post("http://coop.apps.symfonycasts.com/token");
		
		System.out.println("Token Creation : "+response.jsonPath().prettify());
		
		return response.jsonPath().get("access_token");
	}
}
