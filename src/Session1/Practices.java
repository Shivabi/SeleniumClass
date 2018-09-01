package Session1;

public class Practices 
{
	public static String SV ="CP"; //Declaring Static Variable
	public int INSt = 23;	//Declaring Instance Variable 
	
//	public static void main(String[] args) //Starting point of the Execution 
//	{
//		StaticVariable(); //Calling Static Methods
//		Practices InstanceVariableuse = new Practices(); //Creating Object
//		InstanceVariableuse.NonStaticMethods(); //Calling Instance Variables
//	}
	public static void StaticVariable() // Static Methods
	{
		System.out.println(SV); //Printing Static Variables
		Practices SSV = new Practices(); //Creating Object
		int NumSV = SSV.INSt -1; //Assigning Local Variable
		System.out.println(NumSV); //Printing Local Variable
	}
	public void NonStaticMethods() //
	{
		System.out.println(SV); //Printing Instance Variable
		Practices InstVar = new Practices(); //Creating Object
		int InstanceNumber = InstVar.INSt +1; // Assigning Local Variable
		System.out.println(InstanceNumber); //Printing Local Variable
		
	}
}
