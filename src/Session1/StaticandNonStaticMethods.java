package Session1;

public class StaticandNonStaticMethods 
{
	
	public static void main(String[] args) //Starting point of the n class
	{
	
		StaticandNonStaticMethods.staticmethod();
		StaticandNonStaticMethods NSM =  new StaticandNonStaticMethods();
		NSM.Nonstaticmethod();
	}

	public static void staticmethod() //Calling Static methods
	{
		System.out.println("Vinesh");
	}
	
	public void Nonstaticmethod()
	{
		
		
		System.out.println("Kumar");
		
		
		
	}
}


