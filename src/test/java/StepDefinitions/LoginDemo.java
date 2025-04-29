package StepDefinitions;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;

public class LoginDemo {

	WebDriver driver = null;

	@Given("browser is opened")
	public void browser_is_opened() {
		System.out.println("Step-1: Browser is opened");
		driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(40));
	}

	@And("user is on login page")
	public void user_is_on_login_page() {
		System.out.println("Step-2: User is on login page");
		

	}

	@When("user enters valid username and password")
	public void user_enters_valid_username_and_password() {

	}

	@And("clicks on login button")
	public void clicks_on_login_button() {

	}

	@Then("user is navigated to homepage")
	public void user_is_navigated_to_homepage() {

	}
}
