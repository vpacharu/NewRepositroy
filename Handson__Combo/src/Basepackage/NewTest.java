package Basepackage;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class NewTest {
	public WebDriver driver;
    @Test				
		public void testEasy() {	
		System.out.println("Main Test");
		driver.manage().window().maximize();
		}	
		@BeforeTest
		public void beforeTest() {	
			
			System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		    driver = new ChromeDriver(); 
			driver.get("http://demo.guru99.com/test/guru99home/");  
			String title = driver.getTitle();				 
			Assert.assertTrue(title.contains("Demo Guru99 Page")); 	
		}		
		@AfterTest
		public void afterTest() {
			//driver.quit();			
		}		
}	

