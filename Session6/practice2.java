package Session6;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class practice2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\AnnieP\\Desktop\\ChromeDriver\\chromedriver.exe");
		WebDriver driver =  new ChromeDriver();
		
		driver.get("http://www.seleniumeasy.com/test/input-form-demo.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
		try {
			WebElement el = driver.findElement(By.xpath("//input[@name='first_name']"));
			el.sendKeys("Sivagami");
			
			driver.findElement(By.name("last_name")).sendKeys("Kannan");
			
			driver.findElement(By.name("email")).sendKeys("sivagamishiv@gmail.com");
			
			driver.findElement(By.name("address")).sendKeys("Perumbakam");
			
			driver.findElement(By.name("city")).sendKeys("Chennai");
			
			driver.findElement(By.name("zip")).sendKeys("600100");
			
			driver.findElement(By.name("website")).sendKeys("NA");
			
			driver.findElement(By.xpath("//input[@type='radio' and @value='yes']")).click();
			
			driver.findElement(By.name("comment")).sendKeys("Working as test analyst");
			 
			WebElement el1 = driver.findElement(By.name("state"));
			Select ob = new Select(el1);
			
			ob.selectByVisibleText("Florida");
			
			driver.findElement(By.xpath("//div/button[@type='submit']")).click();
			
			
			String actual = driver.findElement(By.xpath("//*[text()='Please supply your phone number']")).getText();
			
			String expected = "Please supply your phone number";
					
					if (actual.equals(expected)) {
						System.out.println("Pass");
					} else {
						System.out.println("Fail");
					}
			Thread.sleep(5000);
			
		
	
		} catch (Exception e) {
			// TODO: handle exception
		}
driver.close();
driver.quit();
	}

}
