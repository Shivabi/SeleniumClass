package Session4;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class getcommands {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\AnnieP\\Desktop\\ChromeDriver\\chromedriver.exe");  //driver invoke
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();																		//manage browser
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		//till this above line the commands are common. Need to be byhearted
		
		
		try {
			driver.get("https://www.google.com");
			int length = driver.getTitle().length();
			System.out.println("The length of the url is " +length);
			String Current = driver.getCurrentUrl();
			System.out.println("The current url is " +Current);
			String Expectedurl = "https://www.google.com/";
			
			WebElement ele = driver.findElement(By.id(""));     //WebElement is the variable of findelement , need to import the webelement driver
			ele.click();  // now we can call perform the action (click or lenghth or any other option) by calling ele. this will be usefull when findelement is performed throughout the script and changes can be made at the initially 
			
			if (Expectedurl.equals(Current)) {
				
				System.out.println("Both URl are equal");
				
			} else {
				System.out.println("Both Url are Not Equals");
			}
			
			int len = driver.getPageSource().length();
			System.out.println("The page source length is "+len);
			
		} catch (Exception e) {
			
		}
		driver.close();
		driver.quit();
	}

}
