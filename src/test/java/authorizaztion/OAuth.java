package authorizaztion;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class OAuth {
	
	@Test
	public void test() {
		String ConsumerKey="Aqfezf1ebrEkDMZdiriW80zN7";
		String ConsumerSecret="NFQKyDgvUCBlcAvFaofPppXg0FerSnlnCSLNHimtNdHTPHs3NC";
		String accessToken="1185811563615141893-aPaa8V1xJwjas5VxPU8jkfhbX9Rwdr";
		String secretToken="dJoe81gb0hsiYfguf7JOONYfaMrYZvs7sILiB02TecBZt";
		
		Response response = RestAssured
		.given()
		.auth()
		.oauth(ConsumerKey, ConsumerSecret, accessToken, secretToken)
		.post("https://api.twitter.com/1.1/statuses/update.json?status=This is my first tweet via API");
		
		System.out.println(response.getStatusCode());
		System.out.println(response.getBody().jsonPath().prettify());
		
		JsonPath jsonPath = response.jsonPath();
		
		String tweetID = jsonPath.getString("id_str");
		
		System.out.println("My tweet ID is :"+tweetID);
		
	}
}
