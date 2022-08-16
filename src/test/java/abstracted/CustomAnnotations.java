package abstracted;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import pages.DashBoard;
import pages.LoginPage;
import utils.BrowserManager;
import utils.ConfigurationReader;
import utils.Screenshot;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;

public class CustomAnnotations {
	public ExtentReports report;
	public ExtentTest logger;
	public WebDriver driver;

	@AfterMethod
	public void afterMethod(ITestResult res) throws IOException {
		if (res.getStatus() == ITestResult.FAILURE) {
			String path = Screenshot.takeScreenshotAs(driver, res.getTestName());
			String imagePath = logger.addScreenCapture(path);
			logger.log(LogStatus.FAIL, res.getMethod().getMethodName(), imagePath);

		} else if (res.getStatus() == ITestResult.SKIP) {
			logger.log(LogStatus.SKIP, res.getMethod().getMethodName());
		} else {
			logger.log(LogStatus.PASS, res.getMethod().getMethodName());
		}

	}

	@Parameters({ "browser" })
	@BeforeTest
	public void beforeTest(String browser) throws IOException {
		driver = BrowserManager.setProperty(driver, ConfigurationReader.readbrowserName(browser));
		openURL(browser, driver);

	}

	@AfterClass
	public void afterClass() {
		report.endTest(logger);
		report.flush();
	}

	public void openURL(String browser, WebDriver driver) throws IOException {
		driver.get(ConfigurationReader.readbaseURL());
	}

	public void login() throws IOException {
		LoginPage pe = new LoginPage(driver);
		pe.login(ConfigurationReader.username(), ConfigurationReader.password());

	}

	public void search(String books) {
		DashBoard db = new DashBoard(driver);
		db.sendAPIData(books);
	}

}
