package Session1;


public class StaticandInstanceVariables 
{
	public static String SV ="CP"; //Declaring Static Variable
	public int INSt = 23;	//Declaring Instance Variable 
	
	public static void main(String[] args) //Starting point of the Execution 
	{
		StaticVariable(); //Calling Static Methods
		StaticandInstanceVariables InstanceVariableuse = new StaticandInstanceVariables(); //Creating Object
		InstanceVariableuse.NonStaticMethods(); //Calling Instance Variables
	}
	public static void StaticVariable() // Static Methods
	{
		System.out.println(SV); //Printing Static Variables
		StaticandInstanceVariables SSV = new StaticandInstanceVariables(); //Creating Object
		int NumSV = SSV.INSt -1; //Assigning Local Variable
		System.out.println(NumSV); //Printing Local Variable
	}
	public void NonStaticMethods() //
	{
		System.out.println(SV); //Printing Instance Variable
		StaticandInstanceVariables InstVar = new StaticandInstanceVariables(); //Creating Object
		int InstanceNumber = InstVar.INSt +1; // Assigning Local Variable
		System.out.println(InstanceNumber); //Printing Local Variable
		
	}
}
