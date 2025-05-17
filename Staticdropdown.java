package SeleniumCode;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
public class Staticdropdown extends Baseclass {
	
	public static void main(String[] args) throws InterruptedException 
	{
	
		init();
		//Staticdropdown std = new Staticdropdown();
		//std.staticsingle();
		staticmultiple();
		teardown();
	}


	
	public void staticsingle()
	{
		
		driver.get("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html");
		 WebElement staticdropdown = driver.findElement(By.id("course"));
		   Select ss = new Select(staticdropdown);
		   ss.selectByIndex(1);
		   System.out.println(ss.getFirstSelectedOption().getText());
		   ss.selectByVisibleText("Python");
		   System.out.println(ss.getFirstSelectedOption().getText());
		   ss.selectByValue("js");
		   System.out.println(ss.getFirstSelectedOption().getText());
		   
			
	}
	
	  static void staticmultiple() throws InterruptedException 
	{
	
		driver.get("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html");
		WebElement webeleid= driver.findElement(By.id("ide"));
	    Select s = new Select(webeleid);
	    s.selectByIndex(0);
	    Thread.sleep(2000);
	    s.selectByVisibleText("NetBeans");
	    Thread.sleep(2000);
	    s.selectByValue("vs");
	    Thread.sleep(2000);
	    
	}
	
	
	
	
	
	
}
