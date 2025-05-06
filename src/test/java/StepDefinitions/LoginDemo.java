//package stepDefinitions;
//
//import java.time.Duration;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import io.cucumber.java.en.*;
//
//public class LoginDemo {
//
//	WebDriver driver = null;
//
//	@Given("browser is opened")
//	public void browser_is_opened() {
//		System.out.println("Step-1: Browser is opened");
//		driver = new ChromeDriver();
//		driver.manage().window().maximize();
//
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
//		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(40));
//	}
//
//	@And("user is on login page")
//	public void user_is_on_login_page() {
//		System.out.println("Step-2: User is on login page");
//		driver.navigate().to("https://practicetestautomation.com/practice-test-login/");
//
//	}
//
//	@When("^user enters (.*) and (.*)$")
//	public void user_enters_valid_username_and_password(String username, String password) {
//		System.out.println("Step-3: User enters valid username and password");
//		driver.findElement(By.name("username")).sendKeys(username);
//		driver.findElement(By.name("password")).sendKeys(password);
//
//	}
//
//	@And("clicks on login button")
//	public void clicks_on_login_button() {
//		System.out.println("Step-4: User clicks on submit button");
//		driver.findElement(By.id("submit")).click();
//
//	}
//
//	@Then("user is navigated to homepage")
//	public void user_is_navigated_to_homepage() throws InterruptedException {
//		System.out.println("Step-5: User is navigated to homepage");
//		Thread.sleep(2000);
//		System.out.println("Message: " + driver.findElement(By.className("post-title")).getText());
//		driver.close();
//		driver.quit();
//	}
//}
