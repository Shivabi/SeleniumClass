package Session3;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SimpleScript {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "F:\\Automation\\Browser Exe\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); //Creating Object for Browser
		
		driver.manage().window().maximize(); //Maximize the Browser
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		try 
		{
			driver.get("https://www.facebook.com/");
			driver.findElement(By.xpath("//input[@class='inputtext']")).sendKeys("cpdreamz@gmail.com");
			
			
			
//			driver.findElement(By.id("email")).sendKeys("cpdreamz@gmail.com");
//			driver.findElement(By.name("pass")).sendKeys("Cpdreamz8495#");
//			driver.findElement(By.id("u_0_2")).click();
//			driver.findElement(By.xpath("//*[@id=\'u_0_a\']/div[3]/div[2]")).click();
//			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//			driver.findElement(By.xpath("//*[@id=\'js_1i\']/div/div/ul/li[12]/a/span/span")).click();
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		driver.close();
		driver.quit();
	}

}
