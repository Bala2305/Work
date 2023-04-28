package Selenium;

import java.io.File;
import java.io.IOException;
import java.util.logging.FileHandler;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenBrowser {
	
public static void main(String[] args) throws IOException {
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\murug\\eclipse-workspace\\Work\\Drivers\\chromedriver.exe");

	 WebDriver driver = new ChromeDriver();
	 
	 driver.manage().window().maximize();

	 driver.get("https://www.amazon.in/");
	 
	 TakesScreenshot ss= (TakesScreenshot)driver;
	 
	 File f = ss.getScreenshotAs(OutputType.FILE);
	 
	File ts=  new File("C:\\Users\\murug\\eclipse-workspace\\Work\\Screenshots\\pic.png");
	 
	org.openqa.selenium.io.FileHandler.copy(f, ts);
	
	
	
}
}
