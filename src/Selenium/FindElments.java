package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElments {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\murug\\eclipse-workspace\\Work\\Drivers\\chromedriver.exe");

		 WebDriver driver = new ChromeDriver();
		 
		 driver.manage().window().maximize();

		 driver.get("https://www.amazon.in/");
		
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Iphone 14 pro");
		
		driver.findElement(By.xpath("/html/body/div[1]/header/div/div[1]/div[2]/div/form/div[3]/div/span/input")).click();
		//tried abs xpath
		
		List<WebElement> listofelements = driver.findElements(By.xpath("//span[contains(text(), 'Apple iPhone 14 Pro (256 GB)')]"));
		
		for (WebElement EachwebElement : listofelements) {
			
			String text = EachwebElement.getText();
			
			System.out.println(text);
		}
		
		//Thread.sleep(2000);
		
		//driver.quit();
	}
	
	
	
	
	
	
	
	
	
	

}
