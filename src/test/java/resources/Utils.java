package resources;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Utils {
	public static String getStringValue(String value) throws IOException {
		Properties p = new Properties();
		FileInputStream fis = new FileInputStream(new File(""));
		p.load(fis);
		return p.getProperty(value);
	}
}
