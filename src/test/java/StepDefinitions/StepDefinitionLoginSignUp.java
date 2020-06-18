package StepDefinitions;

import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.junit.Cucumber;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import Cucumber.AutomatedTicketBooking.Base;

@RunWith(Cucumber.class)
public class StepDefinitionLoginSignUp {
	
	public WebDriver driver;
	
	@Before("@pre-requisite1")
	public void beforeSignup() throws IOException
	{
		driver = Base.getDriver();
		driver.findElement(By.id("Login")).click();	
		driver.findElement(By.cssSelector(".signup-link.buttonN")).click();	
	}
	
    @Given("^User is on signup landing page$")
    public void user_is_on_signup_landing_page() throws Throwable {
        System.out.println("User is on signup landing page");
    }

    @When("^Enter invalid user details and submit$")
    public void enter_invalid_user_details_and_submit(DataTable data) throws Throwable {
	List<List<String>> obj = data.raw();
	Select s = new Select(driver.findElement(By.id("CONTROLGROUPREGISTERVIEW_PersonInputRegisterView_DropDownListTitle")));
	s.selectByValue("MS");
	driver.findElement(By.id("CONTROLGROUPREGISTERVIEW_PersonInputRegisterView_TextBoxFirstName")).sendKeys(obj.get(0).get(0));
	driver.findElement(By.id("CONTROLGROUPREGISTERVIEW_PersonInputRegisterView_TextBoxLastName")).sendKeys(obj.get(0).get(1));
	driver.findElement(By.className("selected-flag")).click();
	List<WebElement> source = driver.findElements(By.xpath("//span[@class='country-name']"));
	for(int i=0;i<source.size();i++) {
		String date = driver.findElements(By.xpath("//span[@class='country-name']")).get(i).getText();
		if(date.equalsIgnoreCase(obj.get(0).get(2))) {
				driver.findElements(By.xpath("//span[@class='country-name']")).get(i).click();
				break;
			}
		}
	driver.findElement(By.id("CONTROLGROUPREGISTERVIEW_PersonInputRegisterView_TEXTBOXINTLMOBILENUMBER")).sendKeys(obj.get(0).get(3));
	driver.findElement(By.id("CONTROLGROUPREGISTERVIEW_MemberInputRegisterView_PasswordFieldAgentPassword")).sendKeys(obj.get(0).get(4));
	driver.findElement(By.id("CONTROLGROUPREGISTERVIEW_MemberInputRegisterView_PasswordFieldPasswordConfirm")).sendKeys(obj.get(0).get(5));
	driver.findElement(By.id("CONTROLGROUPREGISTERVIEW_PersonInputRegisterView_TEXTBOXINPUTDOB")).click();
	while(!driver.findElement(By.cssSelector(".datepickerMonth")).getText().contains(obj.get(0).get(6))) {
		driver.findElement(By.cssSelector(".datepickerGoPrev a")).click();
		}
		driver.findElement(By.xpath("(//tbody[@class='datepickerYears'] //td[@colspan='2'])[7]")).click();
		driver.findElement(By.xpath("(//tbody[@class='datepickerMonths'] //td[@colspan='2'])[7]")).click();
		List<WebElement> dates = driver.findElements(By.cssSelector("tbody[class='datepickerDays'] tr td a span"));
		for(int i=0;i<dates.size();i++) {
			String date = driver.findElements(By.cssSelector("tbody[class='datepickerDays'] tr td a span")).get(i).getText();
			if(date.equalsIgnoreCase(obj.get(0).get(7))) {
				driver.findElements(By.cssSelector("tbody[class='datepickerDays'] tr td a span")).get(i).click();
				break;
			}
		}
		driver.findElement(By.id("CONTROLGROUPREGISTERVIEW_PersonInputRegisterView_TextBoxEmail")).sendKeys(obj.get(0).get(8));
		driver.findElement(By.id("chkSpiceClubTnC")).click();
    }
    
    @Then("^Invalid email popup$")
    public void invalid_email_popup() throws Throwable {
    	System.out.println(driver.findElement(By.id("popup_message")).getText());
    	System.out.println("LoginSignUp Feature Scenario 1 Exits");
    }
    
    @After("@afterScenarios")
	public void afterScenarios()
	{
		driver.close();		
	}

    @When("^Enter valid user details and submit$")
    public void enter_valid_user_details_and_submit(DataTable data1) throws Throwable {
    	List<List<String>> obj1 = data1.raw();
		Select s = new Select(driver.findElement(By.id("CONTROLGROUPREGISTERVIEW_PersonInputRegisterView_DropDownListTitle")));
		s.selectByValue("MS");
		driver.findElement(By.id("CONTROLGROUPREGISTERVIEW_PersonInputRegisterView_TextBoxFirstName")).sendKeys(obj1.get(0).get(0));
		driver.findElement(By.id("CONTROLGROUPREGISTERVIEW_PersonInputRegisterView_TextBoxLastName")).sendKeys(obj1.get(0).get(1));
		driver.findElement(By.className("selected-flag")).click();
		List<WebElement> source = driver.findElements(By.xpath("//span[@class='country-name']"));
		for(int i=0;i<source.size();i++) {
			String date = driver.findElements(By.xpath("//span[@class='country-name']")).get(i).getText();
			if(date.equalsIgnoreCase(obj1.get(0).get(2))) {
				driver.findElements(By.xpath("//span[@class='country-name']")).get(i).click();
				break;
			}
		}
		driver.findElement(By.id("CONTROLGROUPREGISTERVIEW_PersonInputRegisterView_TEXTBOXINTLMOBILENUMBER")).sendKeys(obj1.get(0).get(3));
		driver.findElement(By.id("CONTROLGROUPREGISTERVIEW_MemberInputRegisterView_PasswordFieldAgentPassword")).sendKeys(obj1.get(0).get(4));
		driver.findElement(By.id("CONTROLGROUPREGISTERVIEW_MemberInputRegisterView_PasswordFieldPasswordConfirm")).sendKeys(obj1.get(0).get(5));
		driver.findElement(By.id("CONTROLGROUPREGISTERVIEW_PersonInputRegisterView_TEXTBOXINPUTDOB")).click();
		while(!driver.findElement(By.cssSelector(".datepickerMonth")).getText().contains(obj1.get(0).get(6))) {
			driver.findElement(By.cssSelector(".datepickerGoPrev a")).click();
		}
		driver.findElement(By.xpath("(//tbody[@class='datepickerYears'] //td[@colspan='2'])[7]")).click();
		driver.findElement(By.xpath("(//tbody[@class='datepickerMonths'] //td[@colspan='2'])[7]")).click();
		List<WebElement> dates = driver.findElements(By.cssSelector("tbody[class='datepickerDays'] tr td a span"));
		for(int i=0;i<dates.size();i++) {
			String date = driver.findElements(By.cssSelector("tbody[class='datepickerDays'] tr td a span")).get(i).getText();
			if(date.equalsIgnoreCase(obj1.get(0).get(7))) {
				driver.findElements(By.cssSelector("tbody[class='datepickerDays'] tr td a span")).get(i).click();
				break;
			}
		}
		driver.findElement(By.id("CONTROLGROUPREGISTERVIEW_PersonInputRegisterView_TextBoxEmail")).sendKeys(obj1.get(0).get(8));
		driver.findElement(By.id("chkSpiceClubTnC")).click();
		driver.findElement(By.id("CONTROLGROUPREGISTERVIEW_ButtonSubmit")).click();
		Thread.sleep(4000);
    } 
    
    @Then("^opt$")
    public void opt() throws Throwable {
    	System.out.println(driver.findElement(By.xpath("(//div[@class='otpBody']/p/label)[2]")).getText());
    	System.out.println("LoginSignUp Feature Scenario 2 Exits");
    }

    
    @When("^Enter existing user details and submit$")
    public void enter_existing_user_details_and_submit(DataTable data) throws Throwable {
    	List<List<String>> obj = data.raw();
		Select s = new Select(driver.findElement(By.id("CONTROLGROUPREGISTERVIEW_PersonInputRegisterView_DropDownListTitle")));
		s.selectByValue("MS");
		driver.findElement(By.id("CONTROLGROUPREGISTERVIEW_PersonInputRegisterView_TextBoxFirstName")).sendKeys(obj.get(0).get(0));
		driver.findElement(By.id("CONTROLGROUPREGISTERVIEW_PersonInputRegisterView_TextBoxLastName")).sendKeys(obj.get(0).get(1));
		driver.findElement(By.className("selected-flag")).click();
		List<WebElement> source = driver.findElements(By.xpath("//span[@class='country-name']"));
		for(int i=0;i<source.size();i++) {
			String date = driver.findElements(By.xpath("//span[@class='country-name']")).get(i).getText();
			if(date.equalsIgnoreCase(obj.get(0).get(2))) {
				driver.findElements(By.xpath("//span[@class='country-name']")).get(i).click();
				break;
			}
		}
		driver.findElement(By.id("CONTROLGROUPREGISTERVIEW_PersonInputRegisterView_TEXTBOXINTLMOBILENUMBER")).sendKeys(obj.get(0).get(3));
		driver.findElement(By.id("CONTROLGROUPREGISTERVIEW_MemberInputRegisterView_PasswordFieldAgentPassword")).click();
    }
    
    @Then("^User already existing popup$")
    public void user_already_existing_popup() throws Throwable {
    	System.out.println(driver.findElement(By.id("popup_message")).getText());
    	System.out.println("LoginSignUp Feature Scenario 3 Exits");
    }
    
    @Before("@pre-requisite2")
	public void beforeLogin() throws IOException
	{
    	driver = Base.getDriver();
		driver.findElement(By.id("Login")).click();	
	}
    
    @Given("^User is on login landing page$")
    public void user_is_on_login_landing_page() throws Throwable {
    	System.out.println("User is on login landing page");
    }
    
    @When("^Enter (.+) (.+) and user submits$")
    public void enter_and_user_submits(String emailid, String password) throws Throwable {
        driver.findElement(By.id("ControlGroupLoginView_MemberLoginView2LoginView_TextBoxUserID")).sendKeys(emailid);
        driver.findElement(By.id("ControlGroupLoginView_MemberLoginView2LoginView_PasswordFieldPassword")).sendKeys(password);
        driver.findElement(By.id("ControlGroupLoginView_MemberLoginView2LoginView_ButtonLogIn")).click();
    }
    
    @When("^Enter \"([^\"]*)\" and \"([^\"]*)\"$")
    public void enter_something_and_something(String strArg1, String strArg2) throws Throwable {
    	driver.findElement(By.id("ControlGroupLoginView_MemberLoginView2LoginView_TextBoxUserID")).sendKeys(strArg1);
        driver.findElement(By.id("ControlGroupLoginView_MemberLoginView2LoginView_PasswordFieldPassword")).sendKeys(strArg2); 
        driver.findElement(By.id("ControlGroupLoginView_MemberLoginView2LoginView_ButtonLogIn")).click();
        WebDriverWait w = new WebDriverWait(driver, 15);
		w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".member-my-profile.mm-kyc-warning")));
    }
     
    @Then("^Login \"([^\"]*)\"$")
    public void login_something(String strArg1) throws Throwable {
    	String title = driver.getTitle();
    	if(title.contains(strArg1)) {
    		System.out.println("Validation Error");
        	System.out.println(driver.findElement(By.className("errorSectionContent")).getText());
        	System.out.println("LoginSignUp Feature Scenario 4 Exits");	
    	}
    	else {
    		System.out.println("Validation Successful");
    		System.out.println(driver.findElement(By.className("member-welcome-info")).getText());
    		System.out.println("LoginSignUp Feature Scenario 5 Exits");
    	}
    	}

}