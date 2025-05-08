package stepDefinitions;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;
import pages.LoginPage;

public class LoginDemo_POM {

	WebDriver driver = null;
	LoginPage login;

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

		login = new LoginPage(driver);

		System.out.println("Step-3: User enters valid username and password");

		login.enterUsername(username);
		login.eneterPassword(password);

	}

	@And("clicks on login button")
	public void clicks_on_login_button() {
		System.out.println("Step-4: User clicks on submit button");
		
		login.clicksOnLoginButton();
		

	}

	@Then("user is navigated to homepage")
	public void user_is_navigated_to_homepage() throws InterruptedException {
		System.out.println("Step-5: User is navigated to homepage");
		Thread.sleep(2000);
		
		login.loginValidation();
		
		driver.close();
		driver.quit();
	}
}
