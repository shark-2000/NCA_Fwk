package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashBoard {
	public WebDriver driver;

	public DashBoard(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[@name='q']")
	WebElement inputBox;

	@FindBy(xpath = "//div[@class='FPdoLc lJ9FBc']/center/input[@name='btnK']")
	WebElement searchButton;

	public void sendAPIData(String book) {
		inputBox.sendKeys(book);
		inputBox.clear();

	}

}
