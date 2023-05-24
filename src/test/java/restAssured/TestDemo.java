package restAssured;

import org.json.JSONArray;
import org.json.JSONObject;
import org.testng.annotations.Test;

public class TestDemo {
	@Test
	public void test() {
			JSONObject json1 = new JSONObject();
			JSONObject json2 = new JSONObject();
			json1.put("A", "a");
			json1.put("B", "b");
			json1.put("A", "A");
			
			json2.put("C", "c");
			json2.put("D", "d");
			json2.put("A", "a");
	//		json1 = ((Object) json1).putAll(json2);
			
			System.out.println(json1);
			String str = json1.toString();
			System.out.println(str);
			
			JSONArray array = new JSONArray();
			array.put(10);
			array.put(20);
			
			System.out.println(array);
			System.out.println(array.get(2));
	}
}
