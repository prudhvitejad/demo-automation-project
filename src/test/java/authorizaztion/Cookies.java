package authorizaztion;

import org.json.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class Cookies {
	
	@Test
	public void test() {
		JSONObject userDetails = new JSONObject();
		userDetails.put("username", "dprudhvi");
		userDetails.put("password", "Prudhvimsp@1");
		
		Response response = RestAssured
		  .given()
		  .header("Content-Type","application/json")
		  .body(userDetails)
		  .post("https://cedar-qa01.msp.synopsys.com/portal_login.jsp");
		
		System.out.println("Response : "+response.asString());
		System.out.println("Response Status Code : "+response.getStatusCode());
		
		String sessionID = response.getCookies().get("JSESSIONID");
		
		Response response2 = RestAssured
		  .given()
		  .contentType(ContentType.JSON)
		  .cookie("JSESSIONID",sessionID)
		  .body("")
		  .post();
		
		System.out.println("Response : "+response2.asString());
		
	}
}
