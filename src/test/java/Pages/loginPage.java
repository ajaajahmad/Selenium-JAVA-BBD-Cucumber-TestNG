package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class loginPage {
	WebDriver driver;
	By txt_username = By.name("username");
	By txt_password = By.name("password");
	By btn_login = By.id("submit");
	//Step-1
	public void enterUsername(String username) {
		driver.findElement(txt_username).sendKeys(username);
	}
	//Step-2
	public void eneterPassword(String password) {
		driver.findElement(txt_password).sendKeys(password);
	}
	//Step-3
	public void clicksOnLoginButton() {
		driver.findElement(btn_login).click();
	}

	//We can mention all steps at one place.
	public void loginValidUser(String username, String password) {

		driver.findElement(txt_username).sendKeys(username);
		driver.findElement(txt_password).sendKeys(password);
		driver.findElement(btn_login).click();
	}
}
