package SeleniumCode;

import java.time.Duration;
import java.util.HashMap;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Baseclass
{
    static ChromeOptions options = new ChromeOptions();
    static  WebDriver driver= new ChromeDriver(options);
 public static void   init()
 {      
		  System.setProperty("Webdriver.chrome.driver", "C:\\chromedriver\\chromedriver-new\\chromedriver.exe");
	       driver.manage().window().maximize(); 
	       options.addArguments("--disable-notifications");		       
 }
public static void waittoAppear()
{
	 WebDriverWait w=new WebDriverWait(driver,Duration.ofSeconds(10));
	 w.until(ExpectedConditions.alertIsPresent());
	  
}

 public static void teardown()
 {
	 
	 driver.close();
 }
 
}
