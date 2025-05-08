package PageFactory;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class LoginPage_PF {

	@FindBy(name = "username")
	@CacheLookup
	WebElement txt_username;

	@FindBy(name = "password")
	@CacheLookup
	WebElement txt_password;

	@FindBy(id = "submit")
	@CacheLookup
	WebElement btn_login;

	// We can get link texts as well in
	@FindBy(partialLinkText = "testlink")
	List<WebElement> myLinks;

	// Another way of getting elements
	@FindBy(how = How.ID, using = "name")
	WebElement test;

	WebDriver driver;

	public LoginPage_PF(WebDriver driver) {
		this.driver = driver;
		// AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(driver,
		// 30);
		PageFactory.initElements(new AjaxElementLocatorFactory(driver, 30), this);
	}

	public void enterUsername(String username) {
		txt_username.sendKeys(username);
	}

	public void enterPassword(String password) {
		txt_password.sendKeys(password);
	}

	public void clickOnLogin() {
		btn_login.click();

	}

}