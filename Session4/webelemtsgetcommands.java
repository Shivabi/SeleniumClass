package Session4;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class webelemtsgetcommands {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\AnnieP\\Desktop\\ChromeDriver\\chromedriver.exe");
		WebDriver driver =  new ChromeDriver();
		
		driver.get("http://toolsqa.com/automation-practice-form/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
		try {
			
			WebElement el = driver.findElement(By.xpath("//input[@name='firstname']/preceding-sibling::strong"));
			el.getText();
			System.out.println("The text is " +el.getText());
			WebElement ele = driver.findElement(By.name("firstname"));
			ele.getAttribute("name");
			System.out.println("The Attribute is " +ele.getAttribute("name"));
			ele.getTagName();
			System.out.println("The tag name is "+ele.getTagName());
			Dimension dim =  ele.getSize();
			System.out.println("The height of the element " +dim.height);
			System.out.println("The width the element " +dim.width);
			Point poi = ele.getLocation();
			System.out.println("The X axis "+poi.x);
			System.out.println("The Y axis "+poi.y);
					
			
		} catch (Exception e) {
			// TODO: handle exception
		}
driver.close();
driver.quit();
	}

}
