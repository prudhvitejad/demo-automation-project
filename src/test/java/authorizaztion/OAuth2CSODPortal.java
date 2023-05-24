package authorizaztion;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class OAuth2CSODPortal {
	
		@Test
		public void test() {
			String accessToken = tokenGeneration();
			
			Response response = RestAssured
			  .given()
			  .auth()
			  .oauth2(accessToken)
			  .get("https://synopsys-pilot.csod.com/services/api/x/users/v1/employees");
			
			System.out.println("Status Code : "+response.getStatusCode());
			System.out.println("Body : "+response.getBody().asString());
			
		}
	
	public String tokenGeneration() {
		Response response = RestAssured
		  .given()
		  .formParam("client_id", "1uu697g1i3tu8")
		  .formParam("client_secret","fea1de94598f838942dba6a4bf173f88905de0b259634404c4cdabaa03e265da")
		  .formParam("grant_type","client_credentials")
		  .formParam("scope", "all")
		  .post("https://synopsys-pilot.csod.com/services/api/oauth2/token");
		
		System.out.println("Token Creation : "+response.jsonPath().prettify());
		
		return response.jsonPath().get("access_token");
	}

}
