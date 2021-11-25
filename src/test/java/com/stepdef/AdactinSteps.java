package com.stepdef;

import static org.junit.Assert.assertTrue;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.*;

public class AdactinSteps {
	
	WebDriver driver;
	@Given("User launch the brower and navigates to hotel booking app")
	public void user_launch_the_brower_and_navigates_to_hotel_booking_app() {
		System.setProperty("webdriver.chrome.driver", "D:\\eclipse\\Online9AMNov15\\driver\\chromedriver.exe");
		 driver = new ChromeDriver();
		 driver.get("https://adactinhotelapp.com/");
	   
	}

	@When("User enters the credentials in hotel booking app")
	public void user_enters_the_credentials_in_hotel_booking_app() {
		WebElement Usertext = driver.findElement(By.id("username"));
		Usertext.sendKeys("John123");
		WebElement txtpass = driver.findElement(By.id("password"));
		txtpass.sendKeys("1234567");
	   
	}

	@When("User clicks the login button")
	public void user_clicks_the_login_button() {
		driver.findElement(By.id("login")).click();
	  
	}

	@Then("User validates the error mesaage")
	public void user_validates_the_error_mesaage() {
		WebElement authMsg = driver.findElement(By.xpath("<div@class=\"auth_error\">"));
		Assert.assertTrue("Auth error messgae is not displayed ", authMsg.isDisplayed());
	}

	
	
	
	
	
	
	
}
