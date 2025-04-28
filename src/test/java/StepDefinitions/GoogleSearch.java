package StepDefinitions;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;

public class GoogleSearch {

	WebDriver driver;

	@Given("browser is open")
	public void browser_is_oppned() {
		System.out.println("Inside Step - Browser is opened");

		driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(40));
	}

	@And("user is on google search page")
	public void user_is_on_google_search_page() {
		System.out.println("Inside Step - User is on Google search page");
		driver.navigate().to("https://google.com");
	}

	@When("user enters a text in search box")
	public void user_enters_a_text_in_search_box() throws InterruptedException {
		System.out.println("Inside Step - User enters a text in search box");
		driver.findElement(By.name("q")).sendKeys("Automation Step By Step");
		Thread.sleep(2000);
	}

	@And("hits search box")
	public void hits_search_box() {
		System.out.println("Inside Step - User hits search button");
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
	}

	@Then("user is navigated to search result page")
	public void user_is_navigated_to_search_result_page() throws InterruptedException {
		System.out.println("Inside Step - User is navigated to search result page");
		driver.getPageSource().contains("Online Courses");
		Thread.sleep(2000);
		driver.close();
		driver.quit();
	}

}