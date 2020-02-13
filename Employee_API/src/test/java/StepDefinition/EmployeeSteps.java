package StepDefinition;



import Employess_Pages.GetData;
import Employess_Pages.PostData;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class EmployeeSteps {
	GetData getdata = new GetData();
	PostData postdata = new PostData();
	
	public EmployeeSteps() {
		//this.data = data;
	}
	

	@Given("^GET all employee service api endpoint$")
	public void i_set_get_all_employee_service_api_endpoint() throws Throwable {
		getdata.GetBaseURL();
	}

	@When("^Send a GET HTTP request$")
	public void send_a_get_http_request() throws Throwable {
		getdata.GetRequestAll();
	}

	@Then("^I receive get valid Response$")
	public void i_receive_get_valid_response() throws Throwable {
		getdata.GetResponse();
	}

	@Given("^Post employee data$")
	public void post_employee_data() throws Throwable {
	    
		postdata.postBaseURL();
	}

	@When("^send a Post request$")
	public void send_a_Post_request() throws Throwable {
		postdata.CresteANewEmployeeSerilization();
		postdata.postRequest();
	}

	@Then("^recive the valide data$")
	public void recive_the_vail_data() throws Throwable {
	   
		postdata.postResponse();
	}

   @Then("^I validate the user$")
   public void i_validate_the_user() throws Throwable {
	   System.out.println("i_validate_the_user function ");
	  // getdata.getSingleRequest(16);
	  // getdata.GetResponse();
	  
	   
    // Write code here that turns the phrase above into concrete actions
   
}

	
}

