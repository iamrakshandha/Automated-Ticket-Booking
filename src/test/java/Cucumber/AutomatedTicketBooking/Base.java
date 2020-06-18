package Cucumber.AutomatedTicketBooking;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
	public static WebDriver driver;
	public static Properties prop;
	public static WebDriver getDriver() throws IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rakshandha Kannappan\\Documents\\Downloads\\WebDrivers\\chromedriver.exe");
		driver = new ChromeDriver();
		FileInputStream fis = new FileInputStream("C:\\Users\\Rakshandha Kannappan\\eclipse-workspace\\AutomatedTicketBooking\\src\\test\\java\\Cucumber\\AutomatedTicketBooking\\global.properties");
		prop = new Properties();
		prop.load(fis);
		driver.get(prop.getProperty("url"));
		driver.get("https://book.spicejet.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS); 
		return driver;
		
	}
}