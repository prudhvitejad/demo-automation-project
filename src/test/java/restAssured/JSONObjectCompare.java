package restAssured;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import org.json.JSONObject;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JSONObjectCompare {

	public static void main(String[] args ) throws JsonMappingException, JsonProcessingException {
		
		ObjectMapper mapper = new ObjectMapper();
		
		String s1 = "{ \r\n"
				+ "    \"employee\":\r\n"
				+ "    {\r\n"
				+ "        \"id\": \"1212\",\r\n"
				+ "        \"fullName\":\"John Miles\",\r\n"
				+ "        \"age\": 34,\r\n"
				+ "        \"contact\":\r\n"
				+ "        {\r\n"
				+ "            \"email\": \"john@xyz.com\",\r\n"
				+ "            \"phone\": \"9999999999\"\r\n"
				+ "        }\r\n"
				+ "    }\r\n"
				+ "}";
		
		String s2 = "{\r\n"
				+ "    \"employee\":\r\n"
				+ "    {\r\n"
				+ "        \"id\": \"1212\",\r\n"
				+ "        \"age\": 34,\r\n"
				+ "        \"fullName\": \"John Miles\",\r\n"
				+ "        \"contact\":\r\n"
				+ "        {\r\n"
				+ "            \"email\": \"john@xyz.com\",\r\n"
				+ "            \"phone\": \"9999999999\"\r\n"
				+ "        }\r\n"
				+ "    }\r\n"
				+ "}";

		JsonNode node1 = mapper.readTree(s1);
		JsonNode node2 = mapper.readTree(s2);
		
		System.out.println(node1);
		System.out.println(node2);
		
		boolean status1 = node1.equals(node2);
		System.out.println(status1);
		
		Map<String,Object> map1 = (Map<String,Object>)mapper.readValue(s1, Map.class);
		Map<String,Object> map2 = (Map<String,Object>)mapper.readValue(s2, Map.class);
		
		System.out.println(map1);
		System.out.println(map2);
		
		boolean status2 = map1.equals(map2);
		System.out.println(status2);
		
		String s3 = "{\r\n"
				+ "  \"firstname\": \"prudhvi\",\r\n"
				+ "  \"lastname\": \"teja\",\r\n"
				+ "  \"password\": \"password12345\"\r\n"
				+ "}";
		JSONObject json1 = new JSONObject(s3);
		Iterator<String> keys = json1.keys();
		System.out.println(keys);
		while(keys.hasNext())	{
			System.out.println(keys.next());
		}
	}

}
