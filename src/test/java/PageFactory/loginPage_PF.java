package PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginPage_PF {

	@FindBy(name = "username")
	WebElement txt_username;

	@FindBy(name = "password")
	WebElement txt_password;

	@FindBy(id = "submit")
	WebElement btn_login;

	@FindBy(className = "post-title")
	WebElement post_title;

	WebDriver driver;

	public loginPage_PF(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver,loginPage_PF.class);
	}

	public void loginWithValidCred(String username,String password) {
		txt_username.sendKeys();
		txt_password.sendKeys();
		btn_login.click();
		post_title.isDisplayed();
	}
}