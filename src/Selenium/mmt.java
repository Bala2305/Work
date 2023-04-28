package Selenium;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class mmt {
public static void main(String[] args) {
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\murug\\eclipse-workspace\\Work\\Drivers\\chromedriver.exe");

	 WebDriver driver = new ChromeDriver();
	 
	 driver.manage().window().maximize();

	 driver.get("https://www.makemytrip.com/");
	 WebElement text = driver.findElement(By.xpath("//div[@itemprop='acceptedAnswer'][1]/div/div[1]"));
	 
	 String content = text.getText();
	 driver.quit();
	 String replace = content.replace(",", " ");
	 String[] allword = replace.split(" ");
	 Map<String, Integer> m= new LinkedHashMap<>();
	 
	 for (String word : allword) {
		
		 if (m.containsKey(word)) {
			 
			 
			 Integer count = m.get(word);
			 m.put(word, count+1);
			
		} else {
                 m.put(word, 1);
		}
	}
	//System.out.println(m); 
	 
	 Set<Entry<String, Integer>> entrySet = m.entrySet();
	
	for (Entry<String, Integer> entry : entrySet) {
		
		if (entry.getValue()>1) {
			
			System.out.println(entry);
			
		}
	}
	 
	 
}
}
