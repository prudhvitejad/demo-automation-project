package restAssured;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

public class GetBooking {

	public static void main(String[] args) {
		
		//Build request
		RequestSpecification requestSpecification = RestAssured.given().log().all();
		requestSpecification.baseUri("https://restful-booker.herokuapp.com/");
		requestSpecification.basePath("booking/{id}");
		requestSpecification.pathParam("id", 3);
		
		// https://restful-booker.herokuapp.com/booking/:id   -> id is the url parameter / path parameter 
		
		// hit request & get response
		Response response = requestSpecification.get();
		
		
		// validate response
		ValidatableResponse validateResponse =  response.then().log().all();
		validateResponse.statusCode(200);

	}
}
