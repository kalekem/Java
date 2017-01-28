package jobs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrandeisSage {

	public static void main(String[] args) throws InterruptedException {
		//set system properties
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Cleophas\\Desktop\\Selenium\\geckodriver.exe");
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\Cleophas\\Desktop\\Selenium\\chromedriver.exe");
		
		//declare and initialize the web driver
		//WebDriver driver = new ChromeDriver();
		WebDriver driver = new FirefoxDriver();
	
		//declare and initialize the baseurl - the brandeis sage url in this case
		String baseUrl = "https://www.facebook.com/";
		String expectedTitle = "Facbook - Log In or Sign Up";
		String actualTitle = "";
		
		//navigate to the website
		driver.get(baseUrl);
		actualTitle = driver.getTitle();
		
		if(actualTitle.contentEquals(expectedTitle)){
			
			//enter your username
			Thread.sleep(2000);
			driver.findElement(By.name("email")).sendKeys("kalekemcleophas01@gmail.com");
			
			//enter your password
			Thread.sleep(2000);
			driver.findElement(By.name("pass")).sendKeys("pkiror");
			
			//click sign in button
			Thread.sleep(2000);
			driver.findElement(By.id("u_0_n")).click();
			
			System.out.println("Successfuly signed in!");
			
		}
		else{
			System.out.println("Failed to sign in. Please try again");
		}
		
		Thread.sleep(10000);
		driver.close();
		
		
	}

}
