package Session5;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) 
	
	{

		System.setProperty("webdriver.chrome.driver", "F:\\Automation\\Browser Exe\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		try {
			
			driver.get("http://toolsqa.com/automation-practice-form/");
			WebElement dropdn = driver.findElement(By.id("continents"));			
			Select optin = new Select(dropdn);
			Thread.sleep(5000);
			optin.selectByVisibleText("Africa");
			List <WebElement> storvalue = optin.getOptions();
			storvalue.size();
			
			
			
			System.out.println("Print the Total Size :" +storvalue.size());
		} catch (Exception e) {
			// TODO: handle exception
		}

	}

}
