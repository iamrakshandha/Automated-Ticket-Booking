package StepDefinitions;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.junit.Cucumber;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import Cucumber.AutomatedTicketBooking.Base;
import PageObjects.HomePage;

@RunWith(Cucumber.class)
public class StepDefinitionBookFlights {
	
	public WebDriver driver;

    @Given("^User is on SpiceJet landing page$")
    public void user_is_on_spicejet_landing_page() throws Throwable {
    	driver = Base.getDriver();
    	System.out.println("User is on SpiceJet landing page");
    	System.out.println(driver.getTitle());
    }
    
    @Then("^Respective flights are displayed$")
    public void respective_flights_are_displayed() throws Throwable {
    	System.out.println("Respective flights are displayed");
      	System.out.println(driver.getTitle());
      	System.out.println("StepDefinitonBookFlights Feature Scenario 1 Exits");
    }
    
    @After("@afterScenarioFlights")
	public void afterScenarioFlights()
	{
		driver.close();		
	}
    
}