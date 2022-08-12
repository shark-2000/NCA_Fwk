package utils;

import java.io.IOException;
import java.util.ArrayList;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class ParsedAPIData {

	public static ArrayList<String> bookTitles() throws IOException, ParseException {
		Response res = RestAssured.get(API_Initializer.baseURI() + API_Initializer.endPoint());
		JSONParser jsonparser = new JSONParser();
		Object obj = jsonparser.parse(res.asString());
		JSONArray books = (JSONArray) obj;
		ArrayList<String> bookTitles = new ArrayList<String>();
		for (int i = 0; i < books.size(); i++) {
			JSONObject book = (JSONObject) books.get(i);
			bookTitles.add((String) book.get(API_Initializer.objectKey()));
		}

		return bookTitles;

	}

}
