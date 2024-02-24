package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CreateUsersStepDefinitions {
	
    private String usersEndpoint = "https://reqres.in/api";
    private String createUserPath = "/users";
	
	@Given("a user has name {string} and job {string}")
    public void a_user_has_name_and_job(String name, String job) {

    }

    @When("user creates a new user")
    public void user_creates_a_new_user() {
    
    }

    @Then("status code is {int}")
    public void status_code_is(Integer statusCode) {
   
    }

    @Then("user receives a valid response for {string} and job {string}")
    public void user_receives_a_valid_response(String name, String job) {

    }                                                                                                
}
