package pojo;

import java.time.Duration;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import pageObject.Register_Page;
import pageObject.VerifyOTP_Page;
import resources.Base;

public class Data{
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

	public static void verifyOTP_() {
		//a.resendOTP().click();
		a.verifyOTP().click();
		//.findElement(By.xpath("//div[@class='digit-input aspire-field']//div//div[1]")).sendKeys("1");
		List<WebElement> b= a.verifyOTP().findElements(By.xpath("//div[@class='digit-input aspire-field']//div//div"));
		System.out.println(b.size());
		for(int i=0; i<b.size();i++) {
			String c =b.get(i).getText();
			System.out.println("Element asddf: ");
			System.out.println(c);
			
		}
		a.verifyOTP().findElement(By.xpath("//div[@class='digit-input__input flex flex-center text-weight-medium cursor-pointer'][2]")).sendKeys(Keys.NUMPAD1);
		/*
		 * a.verifyOTP().findElement(By.xpath("//div[2]")).sendKeys("2");
		 * a.verifyOTP().findElement(By.xpath("//div[3]")).sendKeys("3");
		 * a.verifyOTP().findElement(By.xpath("//div[4]")).sendKeys("4");
		 */
	}
}
