package jobs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class JobSearch {
	
	public static void main(String args[]) throws InterruptedException{
		
		//open chrome driver
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Cleophas\\Desktop\\Selenium\\chromedriver.exe");
		
		//System.setProperty("webdriver.gecko.driver", "C:\\Users\\Cleophas\\Desktop\\Selenium\\geckodriver.exe");
		
		//WebDriver chrome = new ChromeDriver();
		WebDriver driver = new ChromeDriver();
		
		//open Brandeis homepage
		//chrome.get("http://brandeis/");
		
		//open KenyaMoja homepage
		driver.get("http://www.indeed.com/");
		
		Thread.sleep(2000);
		//find 'what'  field and enter Selenium
		driver.findElement(By.id("what")).sendKeys("Selenium");
		
		//clear the existing text in the location field
		driver.findElement(By.id("where")).clear();
		
		Thread.sleep(2000);
		//find "location" and enter Boston
		driver.findElement(By.id("where")).sendKeys("Boston");	
		
		Thread.sleep(2000);
		//click the "Find Jobs" button
		driver.findElement(By.id("fj")).click();
		
		//print the title of the page 
		System.out.println("Title: "+ driver.getTitle());
		
		//print the search count for the results
		System.out.println("Search Count: "+ driver.findElement(By.id("searchCount")).getText());
		
		Thread.sleep(5000);
		
		driver.close();
		
	}
}
