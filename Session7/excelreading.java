package Session7;

	import java.io.File;
	import java.io.FileInputStream;
	import java.io.FileNotFoundException;
	import java.io.IOException;

	import org.apache.poi.hssf.usermodel.HSSFCell;
	import org.apache.poi.hssf.usermodel.HSSFRow;
	import org.apache.poi.hssf.usermodel.HSSFSheet;
	import org.apache.poi.hssf.usermodel.HSSFWorkbook;

	public class excelreading {


	public static String getCellValue(String TestCaseName, String ColumnName) throws IOException
	{
		
		String value ="";
		
		//1
		File fileObj = new File("C:\\Users\\AnnieP\\Desktop\\Selenium Training\\Selenium Training\\TestData.xls");
		
		//2
		FileInputStream fisObj = new FileInputStream(fileObj);
		
		//3
		HSSFWorkbook wbObj = new HSSFWorkbook(fisObj);
		
		//4
		HSSFSheet sheetObj = wbObj.getSheet("Data");
		
int lastRow = sheetObj.getLastRowNum();
int lastCol = sheetObj.getRow(0).getLastCellNum();

		
		for(int i=0; i<=lastRow; i++)
		{
			
			String tcName = sheetObj.getRow(i).getCell(0).getStringCellValue();
			
			if(TestCaseName.equalsIgnoreCase(tcName))
			{
				for(int j=0; j<=lastCol;j++)
				{
					String colName = sheetObj.getRow(0).getCell(j).getStringCellValue();
					
					if(ColumnName.equalsIgnoreCase(colName))
					{
						value = sheetObj.getRow(i).getCell(j).getStringCellValue();
						break;
					}
				}
			}
			
		}
		
		return value;
		
		
	}
}

