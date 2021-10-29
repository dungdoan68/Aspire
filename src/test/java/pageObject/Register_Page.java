package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import resources.Base;

public class Register_Page extends Base{
	public Register_Page (WebDriver driver) {
		super();
		this.driver = driver;
	}
	
	By fullName = By.xpath("//input[@id='f_9b198be0-1ad6-4a85-add7-809fbd4951c1']");
	By preferred = By.xpath("//input[@id='f_77c5155e-4cc5-4069-a523-719fa35e3a66']");
	By email = By.xpath("//input[@id='f_1f3d2e43-5b37-43cc-8fc4-dcb72c0de608']");
	By selectCountry = By.xpath("//div[@class='flag-select__icon q-img overflow-hidden']");
	By mobileNumber = By.xpath("//input[@id='f_b6885ad2-0769-4ce2-bd3a-5d4e646d2c46']");
	By getInfoForm = By.xpath("//input[@id='f_6696780d-8d7e-4138-b67f-abcb798627a9']");
	By promoCode = By.xpath("");
	By agreeCheckbox = By.xpath("");
	By btnContinue = By.xpath("");
	By loginPage = By.xpath("");
	By iframe = By.xpath("");
	
	public WebElement fullName() {
		return driver.findElement(fullName);
	}
	public WebElement preferred() {
		return driver.findElement(preferred);
	}
	public WebElement email() {
		return driver.findElement(fullName);
	}
	public WebElement selectCountry() {
		return driver.findElement(selectCountry);
	}
	public WebElement mobileNumber() {
		return driver.findElement(mobileNumber);
	}
	public WebElement getInfoForm() {
		return driver.findElement(getInfoForm);
	}
	public WebElement promoCode() {
		return driver.findElement(promoCode);
	}
	public WebElement agreeCheckbox() {
		return driver.findElement(agreeCheckbox);
	}
	public WebElement btnContinue() {
		return driver.findElement(btnContinue);
	}
	public WebElement loginPage() {
		return driver.findElement(loginPage);
	}
	public WebElement iframe() {
		return driver.findElement(iframe);
	}
}
