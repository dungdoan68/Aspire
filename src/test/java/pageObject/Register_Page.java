package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import resources.Base;

public class Register_Page extends Base{
	public Register_Page (WebDriver driver) {
		super();
		this.driver = driver;
	}
	
	By fullName = By.xpath("");
	By preferred = By.xpath("");
	By email = By.xpath("");
	By mobileNumber = By.xpath("");
	By getInfoForm = By.xpath("");
	By promoCode = By.xpath("");
	By agreeCheckbox = By.xpath("");
	By btnContinue = By.xpath("");
	By loginPage = By.xpath("");
	By iframe = By.xpath("");
}
