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
	
	By fullName = By.xpath("//input[@name='full_name']");
	By preferred =  By.xpath("//input[@name='preferred_name']");
	By email = By.xpath("//input[@name='email']");
	By selectCountry = By.xpath("//img[@class='q-img__image q-img__image--with-transition q-img__image--loaded']");
	By mobileNumber = By.xpath("//input[@name='phone']");
	By getInfoForm = By.xpath("//input[@class='q-field__input q-placeholder col']");
	By promoCode = By.xpath("//input[@data-cy='register-person-referral-code']");
	By chkAgree = By.xpath("//div[@class='q-checkbox__bg absolute']");
	By applyCode = By.xpath("//span[contains(text(),'Apply')]");
	By btnContinue = By.xpath("//span[contains(text(),'Con')]");
	By loginPage = By.xpath("//span[contains(text(),'Login')]");
	By skip = By.xpath("//span[contains(text(),'Skip')]");
	By iframe = By.xpath("//fc_widget");
	
	public WebElement fullName() {
		return driver.findElement(fullName);
	}
	public WebElement skip() {
		return driver.findElement(skip);
	}
	public WebElement preferred() {
		return driver.findElement(preferred);
	}
	public WebElement applyCode() {
		return driver.findElement(applyCode);
	}
	public WebElement email() {
		return driver.findElement(email);
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
	public WebElement chkAgree() {
		return driver.findElement(chkAgree);
	}
	public VerifyOTP_Page btnContinue() {
		driver.findElement(btnContinue).click();
		VerifyOTP_Page v = new VerifyOTP_Page(driver);
		return v;
	}
	public Login_page loginPage() {
		driver.findElement(loginPage).click();
		Login_page l = new Login_page(driver);
		return l;
				
	}
	public Chatbox_page iframe() {
		driver.switchTo().frame(driver.findElement(iframe));
		Chatbox_page c = new Chatbox_page(driver);
		return c;
	}
}
