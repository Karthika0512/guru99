package com.fb.stepdefinition;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginPageSteps {
	WebDriver d;
	@Given("user launch the browser")
	public void user_launch_the_browser() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Uer\\eclipse-workspace---Karthi1234\\Cucumbernew\\Driver\\chromedriver.exe");
		d = new ChromeDriver();
		d.get("http://demo.guru99.com/telecom/");
	}

	@When("user enter all fields")
	public void user_enter_all_fields() {
		WebElement g = d.findElement(By.xpath("(//a[text()='Add Customer'])[1]"));
	    g.click();
	    WebElement g1 = d.findElement(By.xpath("//label[@for='done']"));
	    g1.click();
	    WebElement a = d.findElement(By.xpath("//input[@id='fname']"));
	    a.sendKeys("Karthika");
	    WebElement a1 = d.findElement(By.xpath("//input[@id='lname']"));
	    a1.sendKeys("R");
	    WebElement a2 = d.findElement(By.xpath("//input[@id='email']"));
	    a2.sendKeys("Karthika@gmail.com");
	    WebElement a3 = d.findElement(By.xpath("//textarea[@id='message']"));
	    a3.sendKeys("chennai");
	    WebElement a4 = d.findElement(By.xpath("//input[@id='telephoneno']"));
	    a4.sendKeys("5874961235");
	    WebElement g5 = d.findElement(By.xpath("//input[@type='submit']"));
	    g5.click();
	   	}

	@Then("verify id is displayed or not")
	public void verify_id_is_displayed_or_not() {
	   String n=d.getCurrentUrl();
	   boolean b=n.contains("addcustomer");
	   Assert.assertTrue(b);
	   System.out.println(b);
	}

	}
