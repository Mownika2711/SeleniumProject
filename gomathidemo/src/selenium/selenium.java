package selenium;

import org.openqa.selenium.chrome.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class selenium {
	public static void main(String[] args) {
			
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Hai\\Downloads\\chromedriver.exe");
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("gomathimani06@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("missu2");
		driver.findElement(By.id("u_0_2")).click();
		System.out.println("Login success");
		
	}

}
