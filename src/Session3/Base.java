package Session3;



public class Base {

	public static String sv = "CarModel"; //Declaring Static Variable
	public int nsv = 2018; //Declaring Instance Variable
	
	public static void staticmethod1() //Created Static Method
	{
		System.out.println("This is Statis Method :" +sv); //Printing Static Variable
		
		Base objcret = new Base();
		int A =  objcret.nsv;
		
		System.out.println("This is Statis Method :" +A);
		
	}
	
	public void NonStaticMethod1()
	{
		System.out.println("This is Non Statis Method :" +sv);
		Base Nobjcret = new Base();
		int B = Nobjcret.nsv;
		
		System.out.println("This is Non Statis Method :" +B);
		
		
	}
}
