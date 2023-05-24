package restAssured;

import org.hamcrest.Matchers;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class PatchDemo {

	public static void main(String[] args) {
		
		String jsonString = "{\r\n" + 
				"    \"firstname\" : \"Amod\",\r\n" + 
				"    \"lastname\" : \"Mahajan\"}";
		
		RestAssured
			.given()
				.log()
				.all()
				.baseUri("https://restful-booker.herokuapp.com/")
				.basePath("booking/10")
				.contentType(ContentType.JSON)
				.cookie("token","6608dc75eedd44f")
				.body(jsonString)
			.when()
				.patch()
			.then()
				.log()
				.all()
				.assertThat()
				.statusCode(200)
				.body("firstname", Matchers.equalTo("Amod"))
				.body("lastname", Matchers.equalTo("Mahajan"));
				

	}

}
