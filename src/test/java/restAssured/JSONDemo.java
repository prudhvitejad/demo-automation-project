package restAssured;

import java.time.LocalDate;

import org.json.JSONObject;

import io.restassured.path.json.JsonPath;

public class JSONDemo {
	public static void main(String[] args) {
		
		JSONObject json = new JSONObject();
		json.put("firstname", "Prudhvi");
		json.put("secondname", "Teja");
		
		String startDate = "2022-08-11";

		String str = "Prudhvi\nTeja\rSree";
		System.out.println(str);
		
		System.out.println(json);
	//	System.out.println(json.getString(""));
	//	LocalDate start = LocalDate.of(Integer.parseInt(startDate.split("-")[0]), Integer.parseInt(startDate.split("-")[1]), Integer.parseInt(startDate.split("-")[2]));
		
	//	System.out.println(start);
		
		LocalDate start = LocalDate.of(2022, 07, 26);
		LocalDate end = LocalDate.of(2022, 02, 04);
		LocalDate test = LocalDate.of(2022, 02, 04);	//2022-02-04 , 2022-07-26
		
		System.out.println(test.isAfter(start));
		System.out.println(test.isBefore(end));
		System.out.println(test.equals(start));
		System.out.println(test.equals(end));
		
	if(	( test.isAfter(start) &&  test.isBefore(end) ) || ( test.equals(start) && test.isBefore(end) ) || ( test.equals(end) && test.isAfter(start) ) || ( test.equals(start) && test.equals(end) ) )
		System.out.println("Hello");
	else 
		System.out.println("World");
	}

}
