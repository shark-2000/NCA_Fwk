package utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class API_Initializer {
	public static String baseURI() throws IOException {
		File file = new File(System.getProperty("user.dir") + "/src/main/resources/configuration/api.properties");
		FileInputStream fis = new FileInputStream(file);
		Properties prop = new Properties();
		prop.load(fis);

		return prop.getProperty("baseURI");
	}

	public static String endPoint() throws IOException {
		File file = new File(System.getProperty("user.dir") + "/src/main/resources/configuration/api.properties");
		FileInputStream fis = new FileInputStream(file);
		Properties prop = new Properties();
		prop.load(fis);

		return prop.getProperty("endPoint");
	}

	public static String objectKey() throws IOException {
		File file = new File(System.getProperty("user.dir") + "/src/main/resources/configuration/api.properties");
		FileInputStream fis = new FileInputStream(file);
		Properties prop = new Properties();
		prop.load(fis);

		return prop.getProperty("objectkey");
	}

}
