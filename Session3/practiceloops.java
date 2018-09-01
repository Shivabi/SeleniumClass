package Session3;

public class practiceloops {

	public static void main(String[] args) {
		
		int a=2;
		int b=3;
		String abc="Abinaya";
		String def="abinaya";

//if-else-elseif
		
	if (abc.equalsIgnoreCase(def)) {	 						//String if statment  --- equalsIgnorecase, equals and contains
		
		System.out.println("True");
		
	} else {

		System.out.println("False");
	}
		
	if (a<b) {													//if statement
	 
		System.out.println("B is greater than A");
	
} else if (a==b) {												//elseif statement
	
	System.out.println("A is equal to B");
	
} else {														//else statement
 
	System.out.println("A is greater than B");
	
	}
	
//switch statement
	
	String branch="BCA";
	int year=3;
	
	switch (branch) {
	case "BCA":
		switch (year) {
		case 1:
			
			System.out.println(branch +" "+ year + " year" );
			break;
			
		case 2:
			
			System.out.println(branch +" "+ year + " year" );
			break;
			
		case 3:
				
			System.out.println(branch +" "+ year + " year" );
			break;

		}
		
		break;
	case "BBA":
		switch (year) {
		case 1:
			
			System.out.println(branch +" "+ year + " year" );
			break;
			
		case 2:
			
			System.out.println(branch +" "+ year + " year" );
			break;
			
		case 3:
				
			System.out.println(branch +" "+ year + " year" );
			break;

		}
		
		break;
	case "BSC":
		switch (year) {
		case 1:
			
			System.out.println(branch +" "+ year + " year" );
			break;
			
		case 2:
			
			System.out.println(branch +" "+ year + " year" );
			break;
			
		case 3:
				
			System.out.println(branch +" "+ year + " year" );
			break;

		}
		
		break;
	default:
		System.out.println("Not in Current Arts College");
		break;
	}
		
	
	}

}


