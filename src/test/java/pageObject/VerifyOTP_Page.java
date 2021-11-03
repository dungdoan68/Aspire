package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

import resources.Base;

public class VerifyOTP_Page extends Base{

	public VerifyOTP_Page(WebDriver driver) {
		this.driver = driver;
	}
	
	By verifyOTP = By.xpath("//div[@class='auth-form__card']/form/div[2]/div/div");

	By verifyOTP = By.xpath("//div[@class='digit-input aspire-field']//div");

	By resendOTP = By.xpath("//span[contains(text(),'Res')]");
	public WebElement verifyOTP() {
		return driver.findElement(verifyOTP);
	}
	public WebElement resendOTP() {
		return driver.findElement(resendOTP);
	}
}
