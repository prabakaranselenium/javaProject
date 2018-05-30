package com.stepdefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class facebook1step {
	static WebDriver driver;
@Given("^User is on facebook page$")
public void user_is_on_facebook_page() throws Throwable {
	System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\Computer\\workspace\\DemoqaRegisteration\\src\\test\\resources\\Driver\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
}

@When("^User enters username and password \"([^\"]*)\",\"([^\"]*)\"$")
public void user_enters_username_and_password(String arg1, String arg2) throws Throwable {
	driver.findElement(By.xpath("//input[@id='email']")).sendKeys("mail2prabakaran@gmail.com");
	driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("pragate12345");
}

@Then("^Verify the user loggedin toi the facebook Sucessfully$")
public void verify_the_user_loggedin_toi_the_facebook_Sucessfully() throws Throwable {
	 Assert.assertEquals("Prabakaran", driver.findElement(By.xpath("//span[text()='Prabakaran']")));
}


}
