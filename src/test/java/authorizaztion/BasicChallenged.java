package authorizaztion;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class BasicChallenged {
	
	@Test
	void test1() {
		Response response = RestAssured
				.given()
				.auth()
				.basic("dprudhvi", "Prudhvimsp@1")
				.when()
				.get("https://cedar-qa01.msp.synopsys.com/portal_login.jsp");
			
			System.out.println("Response : "+response.asString());
			System.out.println("Response Status Code : "+response.getStatusCode());
	}
}
