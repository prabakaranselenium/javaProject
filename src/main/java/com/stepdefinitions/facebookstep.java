package com.stepdefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class facebookstep {
	static WebDriver driver;
	@Given("^User is in facebook page$")
	public void user_is_in_facebook_page() throws Throwable {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Computer\\workspace\\DemoqaRegisteration\\src\\test\\resources\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
	}

	@When("^User enters username and password$")
	public void user_enters_username_and_password() throws Throwable {
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("mail2prabakaran@gmail.com");
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("pragate12345");
		
	}

	@When("^User clicking login button$")
	public void user_clicking_login_button() throws Throwable {
		driver.findElement(By.xpath("//input[@value='Log In']")).click();
	}

	@Then("^Verify the user loggedin to the facebook Sucessfully$")
	public void verify_the_user_loggedin_to_the_facebook_Sucessfully() throws Throwable {
	   Assert.assertEquals("Prabakaran", driver.findElement(By.xpath("//span[text()='Prabakaran']")));
	}

}
