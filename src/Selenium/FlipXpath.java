package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipXpath {
public static void main(String[] args) throws InterruptedException {
	
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\murug\\eclipse-workspace\\Work\\Drivers\\chromedriver.exe");

	 WebDriver driver = new ChromeDriver();
	 
	 driver.manage().window().maximize();

	 driver.get("https://www.amazon.in/s?k=ponniyin+selvan+book+tamil&i=stripbooks&crid=388WWGV3XMDB4&sprefix=ponni%2Cstripbooks%2C312&ref=nb_sb_ss_ts-doa-p_3_5");
	 
	 List<WebElement> books = driver.findElements(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']"));
	 
	System.out.println("No of Books:-"+ books.size());
	// for (WebElement book : books) {
		 
	//	System.out.println(book.getText());
		
	//}
	 
	 
	 
 List<WebElement> prices = driver.findElements(By.xpath("//span[@class='a-price-whole']"));
	 
	 System.out.println(prices.size());
	// for (WebElement price : prices) {
	//	System.out.println(price.getText());
	//}
	 
	 for (int i = 0; i < books.size(); i++) {
		 
		 System.out.println(books.get(i).getText()+"-----"+prices.get(i).getText());
		 
		 
		
	}
}
}
