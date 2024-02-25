package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import pojos.CreateUserRequest;
import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;
import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchemaInClasspath;


public class CreateUsersStepDefinitions {
	
	private Response response;
	private RequestSpecification request;
    private String usersEndpoint = "https://reqres.in/api";
    private String createUserPath = "/users";
	
	@Given("a user has name {string} and job {string}")
    public void a_user_has_name_and_job(String name, String job) {
        CreateUserRequest createUserRequest = new CreateUserRequest(name, job);
        request = given()
                .body(createUserRequest)
                .contentType("application/json");
    }

    @When("user creates a new user")
    public void user_creates_a_new_user() {
        response = request.when().post(usersEndpoint + createUserPath);
    }

    @Then("status code is {int}")
    public void status_code_is(Integer statusCode) {
        response.then().statusCode(statusCode);
    }

    @Then("user receives a valid response for {string} and job {string}")
    public void user_receives_a_valid_response(String name, String job) {
        response.then().body(matchesJsonSchemaInClasspath("users_schema.json"));
        assertThat(response.jsonPath().getString("name"), equalTo(name));
        assertThat(response.jsonPath().getString("job"), equalTo(job));
    }                                                                                                
}
