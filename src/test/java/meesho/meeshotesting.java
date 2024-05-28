package meesho;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class meeshotesting {
	
	public static  WebDriver dr;
	
	@Given("website url")
	public void website_url() {
	     dr=new ChromeDriver();
	}

	@Given("navigate to appliaction home page")
	public void navigate_to_appliaction_home_page() {
	   dr.get("https://www.meesho.com/");
	}

	@Then("click on tops")
	public void click_on_tops() {
	   dr.findElement(By.xpath("//span[text()=\"Kids\"]")).click();
	}

	@Then("check more outcomes")
	public void check_more_outcomes() {
	    
	}


}
