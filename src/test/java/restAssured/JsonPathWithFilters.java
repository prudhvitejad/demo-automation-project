package restAssured;

import java.util.List;

import org.testng.annotations.Test;

import io.restassured.path.json.JsonPath;

public class JsonPathWithFilters {

	@Test
	public void m1() {
		String jsonArray = "[{\r\n"
				+ "  \"id\": 1,\r\n"
				+ "  \"first_name\": \"Lothaire\",\r\n"
				+ "  \"last_name\": \"Benazet\",\r\n"
				+ "  \"email\": \"lbenazet0@tinyurl.com\",\r\n"
				+ "  \"gender\": \"Male\"\r\n"
				+ "}, {\r\n"
				+ "  \"id\": 2,\r\n"
				+ "  \"first_name\": \"Shellie\",\r\n"
				+ "  \"last_name\": \"Cowser\",\r\n"
				+ "  \"email\": \"scowser1@163.com\",\r\n"
				+ "  \"gender\": \"Female\"\r\n"
				+ "}, {\r\n"
				+ "  \"id\": 3,\r\n"
				+ "  \"first_name\": \"Sharl\",\r\n"
				+ "  \"last_name\": \"Hesbrook\",\r\n"
				+ "  \"email\": \"shesbrook2@economist.com\",\r\n"
				+ "  \"gender\": \"Female\"\r\n"
				+ "}, {\r\n"
				+ "  \"id\": 4,\r\n"
				+ "  \"first_name\": \"Merrili\",\r\n"
				+ "  \"last_name\": \"Acom\",\r\n"
				+ "  \"email\": \"macom3@goo.ne.jp\",\r\n"
				+ "  \"gender\": \"Female\"\r\n"
				+ "}, {\r\n"
				+ "  \"id\": 5,\r\n"
				+ "  \"first_name\": \"Remus\",\r\n"
				+ "  \"last_name\": \"Downgate\",\r\n"
				+ "  \"email\": \"rdowngate4@shinystat.com\",\r\n"
				+ "  \"gender\": \"Male\"\r\n"
				+ "}, {\r\n"
				+ "  \"id\": 6,\r\n"
				+ "  \"first_name\": \"Tatiana\",\r\n"
				+ "  \"last_name\": \"Tribble\",\r\n"
				+ "  \"email\": \"ttribble5@simplemachines.org\",\r\n"
				+ "  \"gender\": \"Female\"\r\n"
				+ "}, {\r\n"
				+ "  \"id\": 7,\r\n"
				+ "  \"first_name\": \"Wood\",\r\n"
				+ "  \"last_name\": \"Hebbes\",\r\n"
				+ "  \"email\": \"whebbes6@psu.edu\",\r\n"
				+ "  \"gender\": \"Male\"\r\n"
				+ "}, {\r\n"
				+ "  \"id\": 8,\r\n"
				+ "  \"first_name\": \"Kendall\",\r\n"
				+ "  \"last_name\": \"Bony\",\r\n"
				+ "  \"email\": \"kbony7@epa.gov\",\r\n"
				+ "  \"gender\": \"Male\"\r\n"
				+ "}, {\r\n"
				+ "  \"id\": 9,\r\n"
				+ "  \"first_name\": \"Robinet\",\r\n"
				+ "  \"last_name\": \"Gooday\",\r\n"
				+ "  \"email\": \"rgooday8@boston.com\",\r\n"
				+ "  \"gender\": \"Male\"\r\n"
				+ "}, {\r\n"
				+ "  \"id\": 10,\r\n"
				+ "  \"first_name\": \"Laural\",\r\n"
				+ "  \"last_name\": \"Krzysztofiak\",\r\n"
				+ "  \"email\": \"lkrzysztofiak9@sun.com\",\r\n"
				+ "  \"gender\": \"Female\"\r\n"
				+ "}]";
		
		JsonPath jsonPath = JsonPath.given(jsonArray);
		List<String> fnames = jsonPath.getList("findAll{prudhvi->prudhvi.gender == 'Female'}.first_name");
		System.out.println(fnames);
	}
	
	
}
