package base;

import java.io.IOException;
import org.testng.annotations.Test;

import abstracted.CustomAnnotations;
import utils.ExtentReport;

public class TestScript extends CustomAnnotations {
	@Test(priority = 1)
	public void prerequisite() throws IOException {
		report = ExtentReport.init();
		logger = report.startTest("NCA");
		login();

		

	}

	
}
