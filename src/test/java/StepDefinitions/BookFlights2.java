package StepDefinitions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import Cucumber.AutomatedTicketBooking.Base;
import PageObjects.HomePage;
import cucumber.api.java.en.When;

public class BookFlights2 extends Base{
	HomePage hp;
	@When("^User enters flight details and search$")
    public void user_enters_flight_details_and_search() throws Throwable {
		//From
		hp = new HomePage(driver);
		hp.depart().click();
		driver.findElement(By.xpath("//div[@id='glsControlGroupSearchView_AvailabilitySearchInputSearchVieworiginStation1_CTNR'] //a[@value='MAA']")).click();
		//To
		driver.findElement(By.xpath("//div[@id='glsControlGroupSearchView_AvailabilitySearchInputSearchViewdestinationStation1_CTNR'] //a[@value='BLR']")).click();
		
		//Depart Date
		while(!driver.findElement(By.className("ui-datepicker-month")).getText().contains("July")) {
			driver.findElement(By.cssSelector(".ui-icon.ui-icon-circle-triangle-e")).click();
		}
		List<WebElement> source = hp.date();
		for(int i=0;i<source.size();i++) {
			String text = hp.date().get(i).getText();
			if(text.equalsIgnoreCase("16")) {
				hp.date().get(i).click();
				break;
			}
		}
		
		//Check box
		driver.findElement(By.cssSelector("input[id*='SearchInputSearchView_Student']")).click();
		Assert.assertTrue(driver.findElement(By.cssSelector("input[id*='SearchInputSearchView_Student']")).isSelected());
		Assert.assertEquals(6, driver.findElements(By.xpath("//input[@type='checkbox']")).size());
		
		//Passengers
		driver.findElement(By.id("divpaxinfo")).click();
		Select s = new Select(driver.findElement(By.id("ControlGroupSearchView_AvailabilitySearchInputSearchView_DropDownListPassengerType_ADT")));
		s.selectByIndex(4);
		driver.findElement(By.id("divpaxinfo")).click();
		
		//Currency
		Select s2 = new Select(driver.findElement(By.id("ControlGroupSearchView_AvailabilitySearchInputSearchView_DropDownListCurrency")));
		s2.selectByValue("USD");
		
		//Submit
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
    }
    
}
