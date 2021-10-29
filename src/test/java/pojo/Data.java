package pojo;

import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import pageObject.Register_Page;
import resources.Base;

public class Data extends Base {
	public static void addCustomer(Register_Page r,String country) {
		r.fullName().sendKeys("Test1");
		r.preferred().sendKeys("Test2");
		r.email().sendKeys("test1@gmail.com");
		r.selectCountry().click();
		List<WebElement> countryListElement = driver.findElements(By.xpath("//div[@class='q-item__label']"));
		//List<String> countryL =.collect(Collectors.toList())
				//countryListElement.stream().filter(f->f.getText().contains("")).map(m->m.click());
	}
}
