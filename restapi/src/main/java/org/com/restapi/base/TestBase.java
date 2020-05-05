package org.com.restapi.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
//		import javax.imageio.stream.FileImageOutputStream;

public class TestBase {

	public Properties prop;

	// String mainurl;

	public TestBase() {
		// public static void main(String args[]) throws FileNotFoundException,
		// IOException {
		// Properties prop = new Properties();
		try {
			prop = new Properties();
			FileInputStream ip = new FileInputStream(
					System.getProperty("user.dir") + "\\src\\main\\java\\org\\com\\restapi\\config\\config.properties");
			prop.load(ip);
			// System.out.println(prop.getProperty("URL"));
			/*String mainurl = prop.getProperty("URL");
			// mainurl = "I love Coding";
			System.out.println("Test Base MainUrl" + mainurl);
			// System.out.println(prop.getProperty("serviceURL"));
*/		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
