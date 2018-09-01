package Session1;

public class SecondClass {

	public static void main(String[] args) // Starting point of the calss
	{
	
		StaticandInstanceVariables.StaticVariable(); //Calling Static 
		StaticandInstanceVariables Class1 = new StaticandInstanceVariables();
		Class1.NonStaticMethods();
		System.out.println(StaticandInstanceVariables.SV);
		System.out.println(Class1.INSt);
		
	}

}
