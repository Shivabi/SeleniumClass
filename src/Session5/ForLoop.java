package Session5;

public class ForLoop {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
		String [] ListName = {"Jaga", "Abi", "Syed", "Vinesh"};
		int tptalleng = ListName.length; 
		int reverse = tptalleng-1;
		
		for (int i=0; i<tptalleng; i++)
		
		{
			
			System.out.println(ListName[reverse]);
			reverse--;
		}
	}

}
