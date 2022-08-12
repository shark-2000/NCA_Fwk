package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Prerequisite {
	public WebDriver driver;

	public Prerequisite(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "Input_emailVal")
	WebElement username;

	@FindBy(id = "input_password")
	WebElement pwd;

	@FindBy(tagName = "button")
	WebElement login_btn;
	
	@FindBy(tagName = "a")
	WebElement slash_eye;

	public void login(String uname, String password) {
		username.click();
		username.sendKeys(uname);
		pwd.click();
		pwd.sendKeys(password);
		slash_eye.click();
		login_btn.click();
	}

}
