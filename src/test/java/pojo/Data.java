package pojo;

import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import pageObject.Register_Page;
import resources.Base;

public class Data extends Base {
	public static void addCustomer(Register_Page r,String country, String suggest) {
		r.fullName().sendKeys("Test1");
		r.preferred().sendKeys("Test2");
		r.email().sendKeys("test1@gmail.com");
		r.selectCountry().click();
		//
				r.selectCountry()
				.findElement(By.xpath("//div[@class='q-item__label']//span[contains(text(),'"+country+"')]")).click();
		//List<String> countryL =.collect(Collectors.toList())
				//countryListElement.stream().filter(f->f.getText().contains("")).map(m->m.click());
				r.mobileNumber().sendKeys("12345678");
				r.getInfoForm().sendKeys(suggest);
			List<WebElement> getInfo = r.getInfoForm().findElements(By.xpath("//div[@class='q-item__label']"));
			//getInfo.stream().filter(f->f.getText().equalsIgnoreCase(suggest)).map(m->m.findElement(By.xpath("")));
			getInfo.stream().filter(f->f.getText().contains(suggest)).map(m->getSug(m)).collect(Collectors.toList())
			.forEach(f->System.out.println(f));
			
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
