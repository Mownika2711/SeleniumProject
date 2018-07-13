package example;		
	
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;		
import org.testng.annotations.Test;	
import org.testng.annotations.BeforeTest;	
import org.testng.annotations.AfterTest;		
public class NewTest {		
	
	    private WebDriver driver;	
	    
	    @BeforeTest
		public void beforeTest() {	
	    	ChromeOptions chromeOptions=new ChromeOptions();
	    	chromeOptions.setBinary("C:\\Users\\Hai\\AppData\\Local\\Google\\Chrome\\Application\\chrome.exe");
			System.setProperty("webdriver.chrome.driver","C:\\Users\\Hai\\Downloads\\chromedriver.exe");
		    driver = new ChromeDriver(chromeOptions); 
		}
		@Test				
		public void testEasy() {	
			driver.get("http://demo.guru99.com/test/guru99home/");  
			String title = driver.getTitle();				 
			Assert.assertTrue(title.contains("Demo Guru99 Page")); 		
		}	
				
		@AfterTest
		public void afterTest() {
			driver.quit();			
		}		
}