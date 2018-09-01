package Session2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample {

	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub
		
		//1
		System.setProperty("webdriver.chrome.driver", "F:\\Automation\\Browser Exe\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); //Creating Object for Browser
		
		//2 Browser Level
		driver.manage().window().maximize(); //Maximize the browser 
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS); //
		
		
		//3 Try Catch
		
			driver.get("https://www.google.co.in");
			
			driver.findElement(By.id("lsrt-ib")).sendKeys("Selenium");
			
			Thread.sleep(3000);
			
		
		driver.close(); //It will close the browser
		driver.quit(); //It will close the  driver session
	}

}
