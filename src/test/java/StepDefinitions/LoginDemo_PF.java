package stepDefinitions;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import PageFactory.LoginPage_PF;
import io.cucumber.java.en.*;
import pages.HomePage_PF;

public class LoginDemo_PF {

	WebDriver driver = null;
	LoginPage_PF login;
	HomePage_PF home;
	
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
		driver.navigate().to("URL");

	}

	
	@When("^user enters (.*) and (.*)$")
	public void user_enters_valid_username_and_password(String username, String password) {
		login=new LoginPage_PF(driver);
		System.out.println("Step-3: User enters valid username and password");
		login.enterUsername(username);
		login.enterPassword(password);

	}

	@And("clicks on login button")
	public void clicks_on_login_button() {
		System.out.println("Step-4: User clicks on submit button");
		login.clickOnLogin();

	}

	@Then("user is navigated to homepage")
	public void user_is_navigated_to_homepage() {
		home=new HomePage_PF(driver);
		System.out.println("Step-5: User is navigated to homepage");
		home.loginValidation();
	}
}