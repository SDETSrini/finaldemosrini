package com.techprimers.testing;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import junit.framework.Assert;

public class TestStepDefn {
	
	WebDriver driver;
	
	
	
	@Given("User is on home page")
	public void user_is_on_home_page() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\srinaika\\Desktop\\driver\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.google.com");
		  
	}

	@Then("Verify title of the homepage")
	public void verify_title_of_the_homepage() {
		String pageTitle  = driver.getTitle();
		System.out.println(pageTitle);
		Assert.assertEquals("Google", pageTitle);
		driver.quit();
		
	    
	}


}
