package base;

import java.io.IOException;
import org.testng.annotations.Test;

import abstracted.CustomAnnotations;
import dataProvider.Data;
import utils.ExtentReport;

public class TestScript extends CustomAnnotations {
	@Test(priority = 1, dataProvider = "books", dataProviderClass = Data.class)
	public void prerequisite(String books) throws IOException {
		report = ExtentReport.init();
		logger = report.startTest("NCA");
		search(books);

	}

}
