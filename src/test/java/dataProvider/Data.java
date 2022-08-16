package dataProvider;

import java.io.IOException;
import java.util.ArrayList;

import org.json.simple.parser.ParseException;
import org.testng.annotations.DataProvider;

import utils.ParsedAPIData;

public class Data {

	@DataProvider(name = "data")
	public Object[][] dp() {
		return new Object[][] { { "Watches" }, { "Caps" }, { "Kurti" }, { "Saree" } };
	}
	@DataProvider(name="books")
	public Object[] d() throws IOException, ParseException {
		ArrayList<String> books = ParsedAPIData.bookTitles();
		Object[] bookObjects = books.toArray();
		return bookObjects;
	}

}
