package StepDefinitions;
import cucumber.api.PendingException;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.junit.Cucumber;

import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import Cucumber.AutomatedTicketBooking.Base;

@RunWith(Cucumber.class)
public class StepDefinitionBookHotels {
	
	public WebDriver driver;

    @Given("^User on SpiceJet landing page$")
    public void user_on_spicejet_landing_page() throws Throwable {
    	driver = Base.getDriver();
		System.out.println("User is on SpiceJet landing page");
		driver.getTitle();
    }

    @When("^User navigates to book hotels$")
    public void user_navigates_to_book_hotels() throws Throwable {
    	driver.findElement(By.className("myspice_trip")).click();
    }
    
    @And("^Enters hotel details and search$")
    public void enters_hotel_details_and_search() throws Throwable{
    	driver.findElement(By.xpath("//input[@name='MySpiceTripSearchView$TextBoxMarketOrigin1']")).sendKeys("Chennai");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@name='MySpiceTripSearchView$TextBoxMarketOrigin1']")).sendKeys(Keys.ARROW_DOWN);
        driver.findElement(By.xpath("//input[@name='MySpiceTripSearchView$TextBoxMarketOrigin1']")).sendKeys(Keys.ENTER);
        
        driver.findElement(By.xpath("(//button[@type='button'])[7]")).click();
        while(!driver.findElement(By.className("ui-datepicker-month")).getText().contains("July")) {
        	Thread.sleep(1000);
    		driver.findElement(By.cssSelector(".ui-datepicker-header.ui-widget-header.ui-helper-clearfix.ui-corner-right .ui-datepicker-next.ui-corner-all .ui-icon.ui-icon-circle-triangle-e")).click();
    	}
    	List<WebElement> checkin = driver.findElements(By.className("ui-state-default"));
    	for(int i=0;i<checkin.size();i++) {
    		String text = driver.findElements(By.className("ui-state-default")).get(i).getText();
    		if(text.equalsIgnoreCase("16")) {
    			driver.findElements(By.className("ui-state-default")).get(i).click();
    			break;
    		}
    	}
    	
    	driver.findElement(By.xpath("(//button[@type='button'])[8]")).click();
    	System.out.println(driver.findElement(By.className("ui-datepicker-month")).getText());
        while(!driver.findElement(By.xpath("(//span[@class='ui-datepicker-month'])[1]")).getText().contains("August")) {
        	Thread.sleep(1000);
    		driver.findElement(By.cssSelector(".ui-datepicker-next.ui-corner-all .ui-icon.ui-icon-circle-triangle-e")).click();
    	}
    	List<WebElement> checkout = driver.findElements(By.className("ui-state-default"));
    	for(int i=0;i<checkout.size();i++) {
    		String text = driver.findElements(By.className("ui-state-default")).get(i).getText();
    		if(text.equalsIgnoreCase("22")) {
    			driver.findElements(By.className("ui-state-default")).get(i).click();
    			break;
    		}
    	}
    	
    	Select s = new Select(driver.findElement(By.id("MySpiceTripSearchView_DropDownListPassengerType_ADT")));
    	s.selectByIndex(2);
    	
    	driver.findElement(By.cssSelector("input#MySpiceTripSearchView_ButtonSubmit.buttonN")).click();
    }
    
    @Then("^Respective hotels are displayed$")
    public void respective_hotels_are_displayed() throws Throwable {
    	Set<String>ids = driver.getWindowHandles();
		Iterator<String>it = ids.iterator();
		String parent = it.next();
		String child1 = it.next();
		driver.switchTo().window(child1);
		System.out.println(driver.getTitle());
		System.out.println("StepDefinitonBookHotels Feature Scenario 1 Exits");
    }
    
    @After("@afterScenarioHotels")
    public void afterScenarioHotels(){
    	driver.quit();
    }   
}
