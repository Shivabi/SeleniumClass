package Session6;

public interface objectrepos  {

	public static String txtFirstName = "//*[@name='first_name']";
	public static String txtLastName = "//*[@name='last_name']";
	public static String txtPhone = "//*[@name='phone']";
	public static String txtEmail = "//*[@name='email']";
	public static String txtAddress = "//*[@name='address']";
	public static String txtCity = "//*[@name='city']";
	public static String txtZip = "//*[@name='zip']";
	public static String txtWebsite = "//*[@name='website']";
	public static String txtDescription = "//*[@name ='comment']";
	
	//radio button
	public static String txtRadio = "//*[@type='radio' and @value='yes']";
	
	
	//dropdown
	
	public static String drpList = "//*[@name = 'state']";
	
	//getText 
	
	public static String txtGettext = "//label[text()='Zip Code']";
	
	public static String txtGetWarning = "//*[text()='Please supply your phone number']";
	
	//Submit
	public static String txtSubmit = "//div/button[@type='submit']";
	
	
	
}
