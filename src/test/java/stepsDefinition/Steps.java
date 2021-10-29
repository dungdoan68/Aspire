package stepsDefinition;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObject.Login_page;
import pageObject.Register_Page;
import resources.Base;

public class Steps extends Base {
	WebDriver driver;
	Login_page l;
	Register_Page r;
	@Given("Customer navigave to the website without account")
	public void customer_navigave_to_the_website_without_account() throws IOException {
		driver = initBrowser();
		l= new Login_page(driver);
		l.btnNext().click();
		l.userName().sendKeys("jjjdjdjd");
		l.register();
	}
	@When("Customer click on dont have account")
	public void customer_click_on_dont_have_account() {
	    
	}
	@Then("They go and input all detail needed to create account")
	public void they_go_and_input_all_detail_needed_to_create_account() {
	    
	}
}
