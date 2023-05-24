package csv;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Date;
import java.util.Properties;

public class ReadDataFromPropertiesFile {

	public static void main(String[] args) throws IOException {
		/*
		 -> The Properties class represents a persistent set of properties. The Properties can be saved to a stream or loaded from a stream. Each key and its corresponding value in the property list is a string.
		 -> A property list can contain another property list as its "defaults"; this second property list is searched if the property key is not found in the original property list.
		 */
		Properties properties = new Properties();
		
		FileInputStream inputstream = new FileInputStream("C:\\eclipse-workspace\\SeleniumTesting\\src\\test\\resources\\properties\\testdata.properties");
		properties.load(inputstream);
		String browser = properties.getProperty("browser");
		String url = properties.getProperty("url");
		
		System.out.println(browser);
		System.out.println(url);
		
		FileOutputStream outputstream = new FileOutputStream("C:\\eclipse-workspace\\SeleniumTesting\\src\\test\\resources\\properties\\testdata.properties");
		properties.setProperty("testdate", new Date().toString());
		properties.store(outputstream, "This is customer data");

	}

}
