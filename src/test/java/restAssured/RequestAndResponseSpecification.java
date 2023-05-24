package restAssured;

import org.hamcrest.Matchers;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

public class RequestAndResponseSpecification {

	public static void main(String[] args) {
		
		RequestSpecification requestSpecification = RestAssured.given().log().all().baseUri("https://restful-booker.herokuapp.com/").basePath("booking")
				.body("{\r\n"
						+ "					\"firstname\" : \"Prudhvi\",\r\n"
						+ "					\"lastname\" : \"Teja\",\r\n"
						+ "					\"totalprice\" : 15,\r\n"
						+ "					\"depositpaid\" : false,\r\n"
						+ "					\"bookingdates\" : {\r\n"
						+ "						\"checkin\" : \"2022-05-23\",\r\n"
						+ "						\"checkout\" : \"2022-05-23\"\r\n"
						+ "					},\r\n"
						+ "					\"additionalneeds\" : \"Lunch\"\r\n"
						+ "				}")
				.contentType(ContentType.JSON);
		
		ResponseSpecification responseSpecification = RestAssured.expect().log().all().statusCode(200).contentType(ContentType.JSON).time(Matchers.lessThanOrEqualTo(5000L));
		
		RestAssured
			.given(requestSpecification, responseSpecification)
			.post();
	}
}
