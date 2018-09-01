package Session8;

public class Array {

	public static void main(String[] args) {
		
		//ARRAY
		
		int size = 5;
		int myarraw[] = new int[size];		//calling the index here
		 int value = 8;
		 
		 
		 for(int i=0; i<size; i++) {
			 
			 myarraw[i] = value;
			 value--;
			 System.out.println(myarraw[i]);			 	//print decremented value -- all value		 
		 }
		System.out.println(myarraw[0]);	   					//print the index value of 0
	}

}
