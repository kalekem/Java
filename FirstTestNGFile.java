package jobs;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
//import org.testng.annotations.*;
//import org.openqa.selenium.*;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

//@SuppressWarnings("unused");
//System.setProperty("webdriver.gecko.driver", "C:\\Users\\Cleophas\\Desktop\\Selenium\\geckodriver.exe");
//System.setProperty("webdriver.chrome.driver", "C:\\Users\\Cleophas\\Desktop\\Selenium\\chromedriver.exe");
	
public class FirstTestNGFile {
	
	public String baseUrl = "http://www.brandeis.edu/";
	public WebDriver driver = new ChromeDriver();

	@BeforeTest
	public void launchBrowser(){
		driver.get(baseUrl);
	}
	@Test
	public void verifyHomePageTitle(){
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\Cleophas\\Desktop\\Selenium\\chromedriver.exe");
		//System.setProperty("webdriver.gecko.driver", "C:\\Users\\Cleophas\\Desktop\\Selenium\\geckodriver.exe");
		
		driver.get(baseUrl);
		String expectedTitle = "Brandeis University";
		String actualTitle = driver.getTitle();
		Assert.assertEquals(actualTitle, expectedTitle);
		//driver.quit();
		
	}
	
	@AfterTest
	public void terminateBrowser(){
		driver.quit();
	}
	
	
}
