package resources;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
	public static WebDriver driver;
	public static WebDriver initBrowser() throws IOException {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/src/test/java/resources/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(Utils.getStringValue("baseURL"));
		driver.manage().window().maximize();
		return driver;
	}
}
