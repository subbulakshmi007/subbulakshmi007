package SeleniumCode;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class checkandradio extends Baseclass {

	public static void main(String[] args) 
	{
		init();
		//check();
		//check1();
		radio();
		teardown();
		
	}

	public static void check()
	{
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		System.out.println(driver.findElement(By.id("checkBoxOption2")).isSelected());
		driver.findElement(By.id("checkBoxOption2")).isSelected();
		driver.findElement(By.id("checkBoxOption2")).click();
		System.out.println(driver.findElement(By.id("checkBoxOption2")).isSelected());
	}
	
	public static void check1()
	{
	driver.get("https://demoqa.com/checkbox");
	driver.findElement(By.cssSelector("span[class='rct-checkbox']")).isSelected();
	driver.findElement(By.cssSelector("span[class='rct-checkbox']")).click();
	System.out.println(driver.findElement(By.xpath(("//div[@id='result']"))).getText());
	driver.findElement(By.cssSelector("span[class='rct-title']")).click();
	}
	
	public static void radio()
	{
		driver.get("https://demoqa.com/radio-button");
	    //driver.findElement(By.xpath("//input[@id='yesRadio']")).click();
		
		WebElement radiobutton = driver.findElement(By.xpath("//input[@id='yesRadio']"));
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", radiobutton);
	
		
		//WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		//wait.until(ExpectedConditions.elementToBeClickable(radiobutton));
		//radiobutton.click();
			
		}
		
		
		
	}
	
	

