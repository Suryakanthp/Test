package Employess_Pages;


import static io.restassured.RestAssured.given;

import org.junit.Assert;

import EmployeeUtilites.EmployeeData;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class Delete_Data {
	String BASE_URI;
	Response response;
	JsonPath jsonpath;
	EmployeeData employeeData;

	
	public void deleteBaseURL() {
		BASE_URI = " http://dummy.restapiexample.com/api/v1/delete/10";
	}

	public void deleteRequest() {
		response = given().when().delete(BASE_URI);
		System.out.println(response);
	}

	public void deleteResponse() {
		String Employees = response.andReturn().asString();
		System.out.println(Employees);
		JsonPath json = new JsonPath(Employees);
		System.out.println(json);
		int ActualCode = response.getStatusCode();
		Assert.assertEquals(ActualCode, 201);
		System.out.println(response.getHeaders());

}
}




