package Selenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WindowHndle {
public static void main(String[] args) throws AWTException, InterruptedException {
	
	
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\murug\\eclipse-workspace\\Work\\Drivers\\chromedriver.exe");

	 WebDriver driver = new ChromeDriver();
	 
	 driver.manage().window().maximize();

	 driver.get("https://www.amazon.in/");
	
	
	
		 WebElement fresh = driver.findElement(By.xpath("//a[text()='Amazon miniTV']"));
	 
	 Actions act = new Actions(driver);
	 Robot robo = new Robot();
	 
	 
	 act.contextClick(fresh).build().perform();
	 
	 robo.keyPress(KeyEvent.VK_DOWN);
	 robo.keyRelease(KeyEvent.VK_DOWN);
	 robo.keyPress(KeyEvent.VK_ENTER);
     robo.keyRelease(KeyEvent.VK_ENTER);

		Thread.sleep(1000);
		
		
		 
	 WebElement td = driver.findElement(By.xpath("//a[text()=\"Today's Deals\"]"));
		 
	 act.contextClick(td).build().perform();
		 
	 robo.keyPress(KeyEvent.VK_DOWN);
     robo.keyRelease(KeyEvent.VK_DOWN);
	 robo.keyPress(KeyEvent.VK_ENTER);
     robo.keyRelease(KeyEvent.VK_ENTER);

     	Thread.sleep(1000);
     	
     	
     	
     	
   	 WebElement BS = driver.findElement(By.xpath("//a[text()='Best Sellers']"));
		 
	 act.contextClick(BS).build().perform();
			 
	 robo.keyPress(KeyEvent.VK_DOWN);
     robo.keyRelease(KeyEvent.VK_DOWN);
	 robo.keyPress(KeyEvent.VK_ENTER);
     robo.keyRelease(KeyEvent.VK_ENTER);

	     	Thread.sleep(1000);
	     	
	     	
	     	
	  WebElement mob = driver.findElement(By.xpath("//a[text()='Mobiles']"));
			 
   	  act.contextClick(mob).build().perform();
			 	 
	  robo.keyPress(KeyEvent.VK_DOWN);
      robo.keyRelease(KeyEvent.VK_DOWN);
   	  robo.keyPress(KeyEvent.VK_ENTER);
      robo.keyRelease(KeyEvent.VK_ENTER);

		     	Thread.sleep(1000);
		     	
		     	
    	Set<String> all = driver.getWindowHandles();
    	
		  for (String ep : all) {     //ep=each page
			
			  String title = driver.switchTo().window(ep).getTitle();
			  
			  System.out.println(title);
			  
		} 
		  
		  String tds="Amazon.in - Today's Deals";
		  
		  for (String ep : all) {
			
			  if (driver.switchTo().window(ep).getTitle().equals(tds)) {
				
				  break;
			}
		 		  
		}
		  
		  Thread.sleep(2000);
		  
		 WebElement ps5 = driver.findElement(By.xpath("//div[text()='Lowest Price ever on PS5']"));
		  
		  
		  
			JavascriptExecutor	 j = (JavascriptExecutor) driver ; 
			
			//j.executeScript("arguments[0].scrollIntoView(true)", ps5); //scroll using x path
			
			j.executeScript("window.scrollBy(0,2000)");
			
			Thread.sleep(2000);
			
			ps5.click();
			
			Thread.sleep(2000);
			
			driver.quit();
	 
}
	
	
	}
	
	
	

