package Session6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class objecthandler {
	public static WebDriver driver;
	
	public objecthandler(WebDriver dri)
	{
		this.driver = dri;
		
	}
	
	
//********ENTER TEXT***************
	public static void enterText(String propValue, String Value) {
		
		try { 
			
			WebElement ele = driver.findElement(By.xpath(propValue));
			
			if(ele.isDisplayed()==true)
			{
				if(ele.isEnabled()==true)
				{
					ele.sendKeys(Value);
				} 
				else
				{
					System.out.println("Object Dispalyed but not enabled");
				}
			}
			else
			{
				System.out.println("Object  is not displayed");
			}
			
			
			
			
		} catch (Exception e) {
			System.out.println("Excpetion occured while running enterText function");
		}
		
		

	}

//***********GET TEXT**************
	
	public static String getText(String propValue) {	
		String getvalue ="";

		try { 
		
		WebElement get = driver.findElement(By.xpath(propValue));
		
		
	//Zip Code
		
		if(get.isDisplayed()==true)
		{
			getvalue = get.getText();
					
			}
		
			}
		
		catch (Exception e) {
		System.out.println("Excpetion occured while running enterText function");
	} return getvalue;
			
		}
	
//**************DROPDOWN******************** 
	
	public static void dropDown(String propValue, String Value) {
		
		try { 
			
			WebElement drp = driver.findElement(By.xpath(propValue));
			
			if(drp.isDisplayed()==true)
			{
				if(drp.isEnabled()==true) 
				{
					
					Select ob = new Select(drp);
					ob.selectByVisibleText(Value);
	
				} 
				else
				{
					System.out.println("Object Dispalyed but not enabled");
				}
			}
			else
			{
				System.out.println("Object  is not displayed");
			}
			
			
			
			
		} catch (Exception e) {
			System.out.println("Excpetion occured while running enterText function");
		}
		
		

	}
		
	
	
//*************CLICK*******************
	
	public static void click(String propValue) {	
		
		try { 
		
		WebElement cl = driver.findElement(By.xpath(propValue));
		
		
		if(cl.isDisplayed()==true)
		{
			cl.click();
		
		}
				
			
	} catch (Exception e) {
		System.out.println("Excpetion occured while running enterText function");
	} 
	}

}


//************************GETATTRIBUTE*******************************




//********************DROPDOWN SIZE*******************************

//return int
