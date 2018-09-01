package session2;

//Libraies of Chrome driver & selenium

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;


public class Facebook {



             public static void main (String[] args) throws InterruptedException {



             // Work Space Path                        

      		System.setProperty("webdriver.chrome.driver","D:\\eclipse\\browser exe\\chromedriver_win32\\chromedriver.exe");
       		
             //Initialize browser

      		WebDriver driver = new ChromeDriver();   

            // Initialize URL
      									
      		
            String baseUrl = "http://www.facebook.com/";

            // Launch url

             driver.get(baseUrl);

             //Maximize the window

             driver.manage().window().maximize();

             //Find element methods to login into facebook
             
            System.out.println("facebook syed");

             driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("skyman0809@yahoo.com");

             driver.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys("syedrahman7868");

             driver.findElement(By.id("loginbutton")).click();

             Thread.sleep(10000);

driver.close();



             }



}


