package stepsDefinition;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObject.Login_page;
import pageObject.Register_Page;
import pageObject.VerifyOTP_Page;
import pojo.Data;

import resources.Base;

public class Steps extends Base {
	WebDriver driver;
	Login_page l;
	Register_Page r;
	VerifyOTP_Page v;

	Data data ;
	@Given("Customer navigave to the website without account")
	public void customer_navigave_to_the_website_without_account() throws IOException, InterruptedException {
		driver = initBrowser();
		l= new Login_page(driver);
		Thread.sleep(2000);
		r=l.register();
	}
	@When("Customer click on dont have account")
	public void customer_click_on_dont_have_account() throws InterruptedException {
		Thread.sleep(5000);
	    data.addCustomer(r,"Viet","Ins");
	    Thread.sleep(3000);
	    //v =r.btnContinue(); 

	}
	@Then("They go and input all detail needed to create account")
	public void they_go_and_input_all_detail_needed_to_create_account() {
	    
	}
	
	@Given("Customer navigave to the OTP verify page")
	public void customer_navigave_to_the_otp_verify_page() {
	    
	}
	@When("Customer click and input <{string}> <{string}><{string}><{string}>")
	public void customer_click_and_input(String int1, String int2, String int3, String int4) {
		data.verifyOTP_(int1, int2,int3,int4);
	}
	@Then("they will landing to successfull page")
	public void they_will_landing_to_successfull_page() {
	  
	}
}
