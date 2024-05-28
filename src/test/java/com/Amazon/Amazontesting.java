package com.Amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class Amazontesting {
	public WebDriver driver;
	@Given("i want to open empty chrome browser")
	public void i_want_to_open_empty_chrome_browser() {
	  driver=new ChromeDriver();
	  
	}

	@Given("open amazon application")
	public void open_amazon_application() {
	  driver.get("https://www.amazon.in/");
	}

	@When("click on mobiles")
	public void click_on_mobiles() {
	    driver.findElement(By.linkText("Mobiles")).click();
	}

	@When("click on i phone {int} pro max")
	public void click_on_i_phone_pro_max(Integer int1) {
	  driver.findElement(By.xpath("//a[@href='/b/?_encoding=UTF8&node=1389401031&ref_=sv_top_elec_mega_1']")).click();
	}
}
