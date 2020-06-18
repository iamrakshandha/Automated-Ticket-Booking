package PageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
	public WebDriver driver;
	public HomePage(WebDriver driver) {
		this.driver = driver;
	}
	By fromCity = By.id("ControlGroupSearchView_AvailabilitySearchInputSearchVieworiginStation1_CTXT");
	By date = By.className("ui-state-default");
	public WebElement depart() {
	return driver.findElement(fromCity);
	
	}
	public List<WebElement> date() {
	return driver.findElements(date);
		}
	
}
