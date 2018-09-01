package Session8;



import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SeleniumArray {

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
				List<WebElement> listoption = obj.getOptions();  		//all options will be stored in the list. since we are not sure how many field we have, we are using list
				
				int totalvalues = listoption.size();   // saving the size of the field in totalvalues
				System.out.println(totalvalues);		//printing the size of the field
				
				String Arraysize[] = new String[totalvalues];  // declaring array
				
			for(int i =0; i<totalvalues; i++)			// for loop for index array ; starts ith index 0 and continue till total size of the field
				
			{
				Arraysize[i]=listoption.get(i).getText();  	//SAVING ARRAYSIZE OF INDEX I TO LISTOPTION; THIS IS ARRAY LIST, SO USING "GET" TO GET THE INDEX I AND LISTOPTION IS LIST WEBELEMENT , SO DECLARING GETTEXT() TO GET THE VALUES 
				System.out.println(Arraysize[i]);
			}
				

	}catch (Exception e) {
		// TODO: handle excepti
	}

driver.close();
driver.quit();

}
}

