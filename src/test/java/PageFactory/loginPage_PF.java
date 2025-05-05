package PageFactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class loginPage_PF {

	@FindBy(name = "username")
	WebElement txt_username;
	@FindBy(name = "password")
	WebElement txt_password;
	@FindBy(className = "submit")
	WebElement btn_login;
	
	public void loginWithValidCred() {
		txt_username.sendKeys();
		txt_password.sendKeys();
		
	}
}