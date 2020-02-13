package Employess_Pages;

import static io.restassured.RestAssured.given;

import org.junit.Assert;

import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class GetData {

	String BASE_URI;
	Response response;
	JsonPath jsonpath;

	public void GetBaseURL() {
		BASE_URI = "http://dummy.restapiexample.com/api/v1";
	}

	public void GetRequestAll() {
		System.out.println("Get RequestAll");
		response = given().when().get(BASE_URI + "/employees");
		System.out.println(response);
	}
	
	public void getSingleRequest(int empId) {
		System.out.println("Single Request");
		response = given().when().get(BASE_URI + "/employee/"+empId);
		System.out.println("getSingleRequest: \n"+response);
	}

	public void GetResponse() {
		String Employees = response.andReturn().asString();
		System.out.println(Employees);
		JsonPath json = new JsonPath(Employees);
		System.out.println(json);
		int ActualCode = response.getStatusCode();
		Assert.assertEquals(ActualCode, 200);
		System.out.println(response.getHeaders());
	}

}
