package pojo;

import java.time.Duration;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import pageObject.Register_Page;
import pageObject.VerifyOTP_Page;
import resources.Base;

public class Data extends Base{
	static VerifyOTP_Page a;
	public static VerifyOTP_Page addCustomer(Register_Page r, String country, String suggestnu) throws InterruptedException {
		r.fullName().sendKeys("Test1");
		r.preferred().sendKeys("Test2");
		r.email().sendKeys("tsstss1@gmail.com");
		r.selectCountry().click();
		Thread.sleep(2000);
		r.selectCountry()
				.findElement(By.xpath("//div[@class='q-item__label']//span[contains(text(),'" + country + "')]"))
				.click();
		r.mobileNumber().sendKeys("123455850");
		r.getInfoForm().click();
		Thread.sleep(1000);
		r.getInfoForm()
				.findElement(By.xpath("//div[@class='q-item__label']//span[contains(text(),'" + suggestnu + "')]"))
				.click();

		// r.promoCode().sendKeys("123");
		// r.applyCode().click();

		r.chkAgree().click();
		a=r.btnContinue();
		/*
		 * if (r.skip().isDisplayed()==true) {
		 * driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
		 * System.out.println("Continue by click on SKip button"); r.skip().click();
		 * System.out.println("Continue by click on continue button");
		 * driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
		 * r.btnContinue(); System.out.println("Continue by moving to new screen"); }
		 * else { System.out.println("Continue by moving to new screen"); }
		 */

		System.out.println("Continue to verify b OTP");
		System.out.println("Continue to verify b OTP from master");
		return a;
	}

	private static String getSug(WebElement s) {
		List<WebElement> getInfo = s.findElements(By.xpath("//div[@class='q-item__label']"));
		String a = "";
		// getInfo.stream().filter(f->f.getText().contains("Google"));
		for (int i = 0; i < getInfo.size(); i++) {
			if (getInfo.get(i).getText().equalsIgnoreCase("Google")) {
				a = getInfo.get(i).getText();
			}
		}
		return a;
	}

	public static void verifyOTP_(String e, String f,String c, String d) {
	
		List<WebElement> b= a.verifyOTP().findElements(By.xpath("//div[@class='digit-input aspire-field']//div//div"));
		System.out.println(b.size());
		Actions s = new Actions(driver);
		
		for(int i=0; i<b.size();i++) {
			if(i==0) {
				s.moveToElement(a.verifyOTP()).sendKeys(e).build().perform();	
			}
			if(i==1)
				s.moveToElement(a.verifyOTP()).sendKeys(f).build().perform();	
			if(i==2)
				s.moveToElement(a.verifyOTP()).sendKeys(c).build().perform();
			if(i==3)
				s.moveToElement(a.verifyOTP()).sendKeys(d).build().perform();	
				
		}
		//body.desktop.no-touch.body--light:nth-child(2) div.q-layout.q-layout--standard div.q-page-container main.q-page.aspire-page div.auth-form__card form.q-form.verify-otp-form.text-center div.verify-otp-form__input.flex.flex-center div.digit-input.aspire-field div.digit-input__box.flex.justify-between.no-wrap > div.digit-input__input.flex.flex-center.text-weight-medium.cursor-pointer:nth-child(2)
	}
}
