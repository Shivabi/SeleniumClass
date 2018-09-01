package Practice;

public class practice {
	public static String name="abinaya";    	//static variable
	String instname="sivagami";					//instance variable
	

	public static void main(String[] args) { 	//main method
		// TODO Auto-generated method stub
		statcheck();							//calling static method
		practice objmet = new practice();		//creating object for calling non static method
		objmet.nstatcheck();					// calling nonstatic method using object created

	}
	public static void statcheck() {			//static method
	System.out.println(name);					//print by calling variable name
	practice objins = new practice(); 			//creating object for instance variable since it is used inside static method
	System.out.println(objins.instname);		//calling instance variable using object created inside static method
	}
	public void nstatcheck() {					// non static method 
		System.out.println(name);
		System.out.println(instname);			//no need to create object for instance variable since this is non static method
	}
}
