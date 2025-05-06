package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage_PF {

	@FindBy(className = "post-title")
	WebElement txt_post_title;

	WebDriver driver;

	public HomePage_PF(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver,this);
	}

	public void loginValidation() {
		System.out.println(txt_post_title.isDisplayed());
		driver.close();
		driver.quit();
	}

}
