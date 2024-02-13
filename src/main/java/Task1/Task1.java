package Task1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class Task1 {
		
	
	@Test
	public void buildingTestMethod() throws InterruptedException {

	System.setProperty("webdriver.chrome.driver", "/Users/mohitsingh/Downloads/chromedriver-mac-arm64/chromedriver");

	WebDriver driver = new ChromeDriver();
	

	driver.navigate().to("https://app.tryloop.ai/login/password"); 

//	WebElement email = new WebDriverWait(driver, 60)
//		    .until(ExpectedConditions.elementToBeClickable(By.xpath("//a[contains(@href,'password')]")));
//	
//	
//      driver.findElement(By.xpath("//a[contains(@href,'password')]")).click();
      
      WebElement skip = new WebDriverWait(driver, 60)
    		    .until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@type='text']")));
      
      
      driver.findElement(By.xpath("//input[@type='text']")).sendKeys("qa-engineer-assignment@test.com");
      driver.manage().timeouts().implicitlyWait(2000 , TimeUnit.MILLISECONDS);
      driver.findElement(By.xpath("//input[@type='password']")).sendKeys("QApassword123$");
      driver.manage().timeouts().implicitlyWait(2000,TimeUnit.MILLISECONDS);
      driver.findElement(By.xpath("//button[contains(text(),'Login')]")).click();
      driver.manage().timeouts().implicitlyWait(2000,TimeUnit.MILLISECONDS);
      
      
      
     
      WebElement eskip = new WebDriverWait(driver, 60)
  		    .until(ExpectedConditions.elementToBeClickable(By.xpath("//button[contains(text(),\"Skip for now\")]")));
      driver.findElement(By.xpath("//button[contains(text(),\"Skip for now\")]]")).click();
    
	

	}

	
}
