package Selenium;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webtable {
	public static void main(String[] args) {
		
	
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\murug\\eclipse-workspace\\Work\\Drivers\\chromedriver.exe");

	 WebDriver driver = new ChromeDriver();
	 
	 driver.manage().window().maximize();

	 driver.get("https://letcode.in/table");
	  
	 
	 System.out.println("---------------------------------------");
	 
	 System.out.println("Heads of One Table:- ");
	 
	 List<WebElement> head = driver.findElements(By.xpath("//table[@id='shopping']/thead/tr/th"));
	 
	 for (WebElement webElement : head) {
			
	 System.out.println(webElement.getText());
	 
	 }
	 
	 
	 System.out.println("---------------------------------------");
	 System.out.println("Heads of Two Tables:- ");
	 
	 List<WebElement> head2 = driver.findElements(By.xpath("//table/thead/tr/th"));
		 
	 for (WebElement webElement2 : head2) {
			
	 System.out.println(webElement2.getText());
			 
		}
		 
	 
     System.out.println("---------------------------------------");
     System.out.println("Heads of All Three Tables:- ");
	 
	 List<WebElement> head3 = driver.findElements(By.xpath("//table/thead//child::th"));
	 
	 for (WebElement webElement3 : head3) {
			
     System.out.println(webElement3.getText());
		  
	}
	 System.out.println("---------------------------------------"); 
}
}