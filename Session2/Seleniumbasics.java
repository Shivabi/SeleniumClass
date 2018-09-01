package Session2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Seleniumbasics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1 Driver Invoke 
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\AnnieP\\Desktop\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();  								//ChromeDriver is for Chrome.Exe
		
		//Browser level setup
		driver.manage().window().maximize();									//to maximize the window
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);		//to keep the screen for 20 seconds so that we can see it
		driver.manage().deleteAllCookies();										
		
		//3. try and catch 
		
		try {
			
			driver.get("https://www.facebook.com");								//getting the browser
			driver.findElement(By.name("email")).sendKeys("Sivagami");			//finding elements //name is element  //"email" is the type of the attribute name from the browser // send keys given value is what we wanna type on the name field 
			Thread.sleep(5000);													//thread.sleep is for making the screen wait for 5sec
		} catch (Exception e) {
			
		}
		
		driver.close();						//closing the browser
		driver.quit();						//quitting the whole session i.e chrome.exe
	}
	

}
