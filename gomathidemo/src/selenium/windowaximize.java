package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.*;
public class windowaximize 
{
	
	public static void main(String[] args) {
				
				System.setProperty("webdriver.chrome.driver","C:\\Users\\Hai\\Downloads\\chromedriver.exe");
				WebDriver driver= new ChromeDriver();
				driver.get("https://gmail.com");
				driver.manage().window().maximize();
				
				
				
					
					
			
				
			}

		}
// TODO Auto-generated method stub
