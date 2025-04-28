package StepDefinitions;

import io.cucumber.java.en.*;

public class Login {

	@Given("user in on login page")
	public void user_in_on_login_page() {
		System.out.println("Inside Step: user is on login page");
	}

	@When("user enters username and password")
	public void user_enters_username_and_password() {
		System.out.println("Inside Step: user enters username and password");
	}

	@And("clicks on login button")
	public void clicks_on_login_button() {
		System.out.println("Inside Step: clicks on login button");
	}

	@Then("user logged in and navigated to home page")
	public void user_logged_in_and_navigated_to_home_page() {
		System.out.println("Inside Step:'user logged in and navigated to home page");
	}

	@When("user enters user1 and pass1")
	public void user_enters_user1_and_pass1() {
		System.out.println("Inside Step: user enters user1 and pass1");
	}

	@When("user enters user2 and pass2")
	public void user_enters_user2_and_pass2() {
		System.out.println("Inside Step: user enters user2 and pass2");
	}

}