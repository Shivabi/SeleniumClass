package Session4;

public class SwitchCase 
{

	public static void main(String[] args) 
	{
		

		
	String Branch ="CSE";
	int Year =1;

	
	switch (Branch)
	{
	case "Mech":
	switch(Year)
	{
	case 1:
	
		System.out.println(Branch +Year);
	break;
	case 2:
	
		System.out.println(Branch +Year);
		break;
	case 3:
	
		System.out.println(Branch +Year);
		break;
	case 4:
	
		System.out.println(Branch +Year);
	
	break;
	}
	break;
	case "CSE":
		switch(Year)
		{
		case 1:
		
			System.out.println(Branch +Year);
			break;
		case 2:
		
			System.out.println(Branch +Year);
			break;
		case 3:
		
			System.out.println(Branch +Year);
			break;
		case 4:
		
			System.out.println(Branch +Year);
		
		break;
		}
break;
	default:
		
		break;
	}
	}
}
	