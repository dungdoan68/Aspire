package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import resources.Base;

public class VerifyOTP_Page extends Base{
	By verifyOTP = By.xpath("");
	public WebElement verifyOTP() {
		return driver.findElement(verifyOTP);
	}
}
