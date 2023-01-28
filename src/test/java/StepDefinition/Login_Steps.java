package StepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login_Steps {

	@Given("user is on login page")
	public void user_is_on_login_page() {
		System.out.println("Step to take user to login page");
	}

	@When("user enters <username> and <password>")
	public void user_enters_username_and_password() {
		System.out.println("Give un and pass");
	}

	@And("click on enter")
	public void click_on_enter() {
		System.out.println("Click on enter button");
	}

	@Then("user is navigated to the home page")
	public void user_is_navigated_to_the_home_page() {
		System.out.println("Home page should be displayed");
	}
}
