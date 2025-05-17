package SeleniumCode;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class FramesandWindows extends Baseclass {

	public static void main(String[] args) 
	{
	 init();
	 iframe();
	 //teardown();
	
	}

	
	public static void iframe()
	{
		driver.get("https://www.automationtesting.co.uk/iframes.html");
		System.out.println(driver.findElements(By.tagName("iframe")).size());
		driver.switchTo().frame(0);
		
		 Actions a = new Actions(driver);
	    WebElement ele =   driver.findElement(By.linkText("Toggle"));
	    a.click(ele).build().perform();
	      // WebElement ee= driver.findElement(By.xpath("//div[@class=inner]/child::a[text()='Accordion'"));
	       //a.click(ee).build().perform();
	    driver.switchTo().defaultContent();
	
		/*driver.findElement(By.linkText("API Testing in Detail!"));
		WebElement ir = driver.findElement(By.linkText("API Testing in Detail!"));
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", ir);
	    driver.switchTo().defaultContent();*/
	}
	
	
}
