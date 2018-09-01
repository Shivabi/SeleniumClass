package Session7;

import java.io.IOException;

public class test {

	public static void main(String[] args) throws IOException {
		
		String testcaseName = "ESS";
		
		excelreading xl = new excelreading();
		
		String two = xl.getCellValue(testcaseName, "What is 2+2?");
//		String incorrect = xl.getCellValue(testcaseName, "incorrect");
		
		System.out.println(two);
		
	}

}

