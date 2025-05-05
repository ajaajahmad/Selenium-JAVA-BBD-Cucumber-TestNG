package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class loginPage {
	protected WebDriver driver;
	private By txt_username = By.name("username");
	private By txt_password = By.name("password");
	private By btn_login = By.id("submit");
	private By txt_post_title = By.className("post-title");

	public loginPage(WebDriver driver) {
		this.driver = driver;
	}

	// Step-1
	public void enterUsername(String username) {
		driver.findElement(txt_username).sendKeys(username);
	}

	// Step-2
	public void eneterPassword(String password) {
		driver.findElement(txt_password).sendKeys(password);
	}

	// Step-3
	public void clicksOnLoginButton() {
		driver.findElement(btn_login).click();
	}

	// Step-4
	public void loginValidation() {
		System.out.println(driver.findElement(txt_post_title).isDisplayed());
	}

	// Combined Steps
	public void loginWithCredential(String username, String password) {

		driver.findElement(txt_username).sendKeys(username);
		driver.findElement(txt_password).sendKeys(password);
		driver.findElement(btn_login).click();
		System.out.println(driver.findElement(txt_post_title).getText());
	}
}