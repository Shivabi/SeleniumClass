package Practice;

public class secondclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(practice.name);			//calling static variable from practice class
		practice objprc = new practice();			//creating object for variable from practice class
		System.out.println(objprc.instname);		//calling object with instance variable 
		practice.statcheck();						//calling static method from practice class
	//	practice objpr = new practice();			//creating object for method from practice class
		objprc.nstatcheck();							//calling object with non static method

	}

}
