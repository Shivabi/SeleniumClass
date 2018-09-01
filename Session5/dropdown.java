package Session5;

import java.awt.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdown {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\AnnieP\\Desktop\\ChromeDriver\\chromedriver.exe");
		WebDriver driver =  new ChromeDriver();
		
		driver.get("http://toolsqa.com/automation-practice-form/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
		try {
			
			WebElement el = driver.findElement(By.id("continents"));
			//to declare drop down we need to use the below for sure
			Select obj = new Select(el);								//Object is created for for the preddefined CLASS Select and webelement el has been passed through it
			
			//so level of access has been moved to obj, so call all fnc through obj
			obj.selectByVisibleText("Antartica");  //select by visible text
			obj.selectByIndex(3); 					 //select by Index
			
			
			int totalvalues = obj.getOptions().size();   //this will get <options> adn size of the dropdown
			System.out.println(totalvalues);
			
			
			Thread.sleep(5000);		
			 
	} catch (Exception e) {
		// TODO: handle exception
	}
driver.close();
driver.quit();
}
}
