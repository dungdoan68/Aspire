package pojo;

import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import pageObject.Register_Page;
import resources.Base;

public class Data extends Base {
	public static void addCustomer(Register_Page r,String country, int suggestnu) {
		r.fullName().sendKeys("Test1");
		r.preferred().sendKeys("Test2");
		r.email().sendKeys("tsstss1@gmail.com");
		r.selectCountry().click();
		//
				r.selectCountry()
				.findElement(By.xpath("//div[@class='q-item__label']//span[contains(text(),'"+country+"')]")).click();
				r.mobileNumber().sendKeys("123455850");
				r.getInfoForm().click();
				//WebElement w= r.getInfoForm().findElement(By.xpath("//div[@id='f_de11c5fe-2a3f-4829-aafe-c07a03c83d2c_lb']"));
				 r.getInfoForm().findElement(By.xpath("//div[@class='q-item__label']//span[contains(text(),'Ins')]")).click();
				 
					/*
					 * List<WebElement> getInfo =
					 * r.getInfoForm().findElements(By.xpath("//div[@class='q-item__label']"));
					 * //getInfo.stream().filter(f->f.getText().equalsIgnoreCase(suggest)).map(m->m.
					 * findElement(By.xpath(""))); getInfo.stream().collect(Collectors.toList())
					 * .forEach(f->System.out.println(f)); WebElement a
					 * =r.getInfoForm().findElement(By.xpath("//div[@class='q-item__label']"));
					 * a.findElement(By.xpath("//div[@id='f_de11c5fe-2a3f-4829-aafe-c07a03c83d2c_"+
					 * suggestnu+"']")).click();
					 */
			r.promoCode().sendKeys("123");
			r.applyCode().click();
			
			r.chkAgree().click();
			r.btnContinue();
			r.skip().click();
			r.btnContinue();
	}

	private static String getSug(WebElement s) {
		List<WebElement> getInfo = s.findElements(By.xpath("//div[@class='q-item__label']"));
		String 	a ="";
		//getInfo.stream().filter(f->f.getText().contains("Google"));
		for(int i=0;i<getInfo.size();i++) {
			if(getInfo.get(i).getText().equalsIgnoreCase("Google")) {
				a=getInfo.get(i).getText();			}
		}
		return a;
	}
}
