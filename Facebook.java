package jobs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Facebook {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Cleophas\\Desktop\\Selenium\\geckodriver.exe");
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\Cleophas\\Desktop\\Selenium\\chromedriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		String baseUrl = "https://www.facebook.com/";
		String tagName = "";
		
		driver.get(baseUrl);
		tagName = driver.findElement(By.id("email")).getTagName();
		System.out.println("Tag name: " + tagName);
		System.out.println();
		//get the source code of the page as a string value
		//System.out.println(driver.getPageSource());
		
		//fetches the string representing the current URL that the browser is looking at
		System.out.println("Current Url: "+ driver.getCurrentUrl());
		
		//get the text inside this link
		//System.out.println("Text: "+ ((WebElement) driver).getText());
		
		driver.close();
		System.exit(0);
	}

}
