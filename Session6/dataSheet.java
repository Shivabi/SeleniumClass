package Session6;					//Has value of both objhandler and objrepository

	import java.util.concurrent.TimeUnit;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.support.ui.Select;

	public class dataSheet implements objectrepos {            

		public static void main(String[] args) {
					
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\AnnieP\\Desktop\\ChromeDriver\\chromedriver.exe");
			WebDriver driver =  new ChromeDriver();
			
			driver.get("http://www.seleniumeasy.com/test/input-form-demo.html");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
			
			objecthandler obj = new objecthandler(driver);
			
			try {
			
			
				obj.enterText(txtFirstName, "Sivagami");
				
				obj.enterText(txtLastName, "Kannan");
				
//				obj.enterText(txtPhone, "789456124");				
				
				obj.enterText(txtEmail, "sivagamishiv@gmail.com");
				
				obj.enterText(txtAddress, "Perumbakkam");
				
				obj.enterText(txtCity, "Chennai");
				
				obj.enterText(txtZip, "600100");
				
				obj.enterText(txtWebsite, "NA");
				
				obj.enterText(txtDescription, "Working as test analyst");
				
				obj.dropDown(drpList, "Florida");
				
				obj.click(txtRadio);
				
				obj.getText(txtGettext);
				
				obj.click(txtSubmit);
				
				obj.getText(txtGetWarning);
				
				//
				
		//Zip Code
				
					String actual = objecthandler.getText(txtGettext);	//calling return value from objhandler class
		
					
					String expectlabel = "Zip Code";	
					
					if (actual.equals(expectlabel)) {
						System.out.println("zip Code found");
					} 
				
					else {
						System.out.println("zip Code not found");
					}			
				
				
				
			//Warning message
					
				String actualWar = objecthandler.getText(txtGetWarning);	//calling return value from objhandler class
				
				String expectedwarning = "Please supply your phone number";
				
				if (actualWar.equals(expectedwarning)) {
					System.out.println("Pass");
				} 
				else {
					System.out.println("Fail");
			 
					}
				
				
				Thread.sleep(5000);
								
			} catch (Exception e) {
				
			}
	driver.close();
	driver.quit();
		}

	}

