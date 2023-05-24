package apis;

import org.json.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class SessionID {
	
	@Test
	void test1() throws Exception {
		String apiCall = "https://cedar-qa01.msp.synopsys.com/api/customer/service?viewtype=gantt&serviceObjIds=6675&serviceObjIds=7585";
		JSONObject response = getRequestJSON(apiCall);
		System.out.println(response);
	}
	
	public JSONObject getRequestJSON(String apiCall) throws Exception{
		JSONObject responseDetails = new JSONObject();

		try{
			 Response response = RestAssured.given().
					 header("Cookie", "eb22e3119b0a47c2db32a322bf868695a6b8d412").and().
					 header("Accept", "text/plain, application/json , text/javascript").and().
					 header("Connection", "keep-alive").when().
					 get(apiCall);
			 responseDetails.put("responseMessage", response.asString());
			 responseDetails.put("responseStatusCode", response.getStatusCode());
		 }catch(Exception e){
			 throw new Exception("Exception occured while performing the Get Request for the API call-- "+apiCall,e);
		 }
		return responseDetails;
	 }
}
