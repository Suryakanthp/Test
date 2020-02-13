package Employess_Pages;

import static io.restassured.RestAssured.given;

import org.junit.Assert;

import EmployeeUtilites.EmployeeData;
//import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class PostData {
	String BASE_URI;
	Response response;
	JsonPath jsonpath;
	//EmployeeData employeeData;
	EmployeeData employeeData = new EmployeeData();
	public void CresteANewEmployeeSerilization()
	{
		//EmployeeData employeeData = new EmployeeData();
		 
		employeeData.setId(10);
		employeeData.setEmployeeName("Sumanth");
		employeeData.setEmployeeAge(30);
		employeeData.setEmployeeSalary(30000);
		//employeeData.setProfileImage(null);
		//System.out.println("CresteANewEmployeeSerilization function");
		
	}
		public void postBaseURL() {
			BASE_URI = "http://dummy.restapiexample.com/api/v1/create";
		}

		public void postRequest() {
			System.out.println("Emp data "+employeeData);
			response = given().body(employeeData).when().post(BASE_URI);
			System.out.println(response);
			
		}

		public void postResponse() {
			try{String Employees = response.andReturn().asString();
			System.out.println(Employees);
			JsonPath json = new JsonPath(Employees);
			System.out.println(json);
			}
			catch(Exception e){
				
			}
			int ActualCode = response.getStatusCode();
			System.out.println("Response Headers : "+response.getHeaders());
			Assert.assertEquals(ActualCode, 200);
			
		}
	
}
