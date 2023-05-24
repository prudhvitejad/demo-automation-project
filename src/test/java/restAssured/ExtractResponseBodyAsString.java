package restAssured;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

public class ExtractResponseBodyAsString {

	public static void main(String[] args) {
		
		 String res = RestAssured
			.given()
				.baseUri("https://restful-booker.herokuapp.com/")
				.basePath("booking")
				.body("{\r\n"
					+ "			\"firstname\" : \"Prudhvi\",\r\n"
					+ "			\"lastname\" : \"Teja\",\r\n"
					+ "			\"totalprice\" : 15,\r\n"
					+ "			\"depositpaid\" : false,\r\n"
					+ "			\"bookingdates\" : {\r\n"
					+ "				\"checkin\" : \"2022-05-23\",\r\n"
					+ "				\"checkout\" : \"2022-05-23\"\r\n"
					+ "			},\r\n"
					+ "			\"additionalneeds\" : \"Lunch\"\r\n"
					+ "		}")
				.contentType(ContentType.JSON)
			.when()
				.post()
			.then()
				.extract()
				.body().asString();
		 
		 System.out.println(res);
		
	}   
	
	public static void postRequest() {
		
		// Build Request
				RequestSpecification requestSpecification = RestAssured.given();
				requestSpecification = requestSpecification.log().all();
				requestSpecification.baseUri("https://restful-booker.herokuapp.com/");
				requestSpecification.basePath("booking");
				
				requestSpecification.body("{\r\n"
						+ "			\"firstname\" : \"Prudhvi\",\r\n"
						+ "			\"lastname\" : \"Teja\",\r\n"
						+ "			\"totalprice\" : 15,\r\n"
						+ "			\"depositpaid\" : false,\r\n"
						+ "			\"bookingdates\" : {\r\n"
						+ "				\"checkin\" : \"2022-05-23\",\r\n"
						+ "				\"checkout\" : \"2022-05-23\"\r\n"
						+ "			},\r\n"
						+ "			\"additionalneeds\" : \"Lunch\"\r\n"
						+ "		}");
				//requestSpecification.contentType("application/json");
				requestSpecification.contentType(ContentType.JSON);
				/*
				{
					"firstname" : "Prudhvi",
					"lastname" : "Teja",
					"totalprice" : 15,
					"depositpaid" : false,
					"bookingdates" : {
						"checkin" : "2022-05-23",
						"checkout" : "2022-05-23"
					},
					"additionalneeds" : "Lunch"
				}
				*/
				
				// Hit Request and get Response
				Response response = requestSpecification.post();
				
				// Validate response
				//ValidatableResponse validatableResponse = response.then();
				ValidatableResponse validatableResponse = response.then().log().all();
				validatableResponse.statusCode(200);
				
	}

}
