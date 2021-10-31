package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import resources.Base;

public class Login_page extends Base {
	
	public Login_page(WebDriver driver) {
		this.driver=driver;
	}
	
	By userName = By.xpath("//input[@name='username']");
	By rememberMe = By.xpath("//*[name()='svg']");
	By register = By.xpath("//span[contains(text(),'Reg')]");
	By btnNext = By.xpath("//span[contains(text(),'Next')]");
	
	public WebElement userName() {
		return driver.findElement(userName);
	}
	public WebElement rememberMe() {
		return driver.findElement(rememberMe);
	}
	public Register_Page register() {
		driver.findElement(register).click();
		Register_Page r = new Register_Page(driver);
		return r;
		
	}
	public WebElement btnNext() {
		return driver.findElement(btnNext);
	}
	
}
