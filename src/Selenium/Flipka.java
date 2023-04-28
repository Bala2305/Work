package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipka {
public static void main(String[] args) {
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\murug\\eclipse-workspace\\Work\\Drivers\\chromedriver.exe");

	 WebDriver driver = new ChromeDriver();
	 
	 driver.manage().window().maximize();

	 driver.get("https://www.flipkart.com/");
	 
	 driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
	 
 driver.findElement(By.xpath("//h2[@class=\"_2cAig-\" and contains(text(),'Top Offers')]//following-sibling::div/a")).click();
	 
}
}
