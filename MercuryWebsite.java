package jobs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MercuryWebsite {

	public static void main(String[] args) throws InterruptedException {
		//set system properties
		//System.setProperty("webdriver.gecko.driver", "C:\\Users\\Cleophas\\Desktop\\Selenium\\geckodriver.exe");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Cleophas\\Desktop\\Selenium\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		//WebDriver driver = new FirefoxDriver();
		
		//declare and instantiate variables
		String baseUrl ="http://newtours.demoaut.com";
		String expectedTitle = "Welcome: Mercury Tours";
		String expectedSignUpTitle = "Sign-on: Mercury Tours";
		String actualTitle = "";
		String actualSignUpTitle = "";
		
		//launch Firefox and direct it to the base url
		driver.get(baseUrl);
		
		//get the actual value of the title
		actualTitle = driver.getTitle();
		//signOnTitle = driver.getTitle();
		
		//compare the actual title of the page with the expected one and print
		//the result as "Passed" or "Failed"
		
		if(actualTitle.contentEquals(expectedTitle)){
			System.out.println("Test passed!");
		}
		else{
			System.out.println("Test failed!");
		}
		
		//sign in to find the lowest fare
		Thread.sleep(2000);
		driver.findElement(By.name("userName")).sendKeys("ckalekem");
		
		//enter the password
		Thread.sleep(2000);
		driver.findElement(By.name("password")).sendKeys("MimiMbaya!");
		//close Firefox
		
		Thread.sleep(2000);
		driver.findElement(By.name("login")).click();
		
		//sign up if you're a new user
		Thread.sleep(2000);
		
		//sign up page base url
		///WebDriver driver2 = new FirefoxDriver();
		WebDriver driver2 = new ChromeDriver();
		driver2.get("http://newtours.demoaut.com/mercurysignon.php?osCsid=5cde8306d22a65beee11647d491e9efd");
		actualSignUpTitle = driver2.getTitle();
		
		if(actualSignUpTitle.contentEquals(expectedSignUpTitle)){
			//enter your username
			//driver.get("http://newtours.demoaut.com/mercurysignon.php?osCsid=5cde8306d22a65beee11647d491e9efd");
			Thread.sleep(2000);
			driver2.findElement(By.name("userName")).sendKeys("ckalekem");
			
			//enter your password
			Thread.sleep(2000);
			driver2.findElement(By.name("password")).sendKeys("MimiMbaya!");
			
			//submit
			Thread.sleep(2000);
			driver2.findElement(By.name("login")).click();
			
			System.out.println("Successfuly signed up!");
		}
		else{
			System.out.println("Failed to sign up. Try again!");
		}
		driver.close();
		
		//exit the program explicitly
		System.exit(0);
		
		
	}

}
