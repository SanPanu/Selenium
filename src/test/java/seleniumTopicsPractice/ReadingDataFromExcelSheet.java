package seleniumTopicsPractice;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadingDataFromExcelSheet 
{
	public static void main(String[] args) throws IOException 
	{
		FileInputStream file = new FileInputStream(System.getProperty("user.dir")+"\\TestData\\BooksData.xlsx");//it will read the file
		
		XSSFWorkbook workbook = new XSSFWorkbook(file);//from file we are going into workbook
		
		XSSFSheet sheet = workbook.getSheet("Sheet1");//in workbook getting a particular sheet
		
		int totalrows = sheet.getLastRowNum();//Finding the last row number present in the sheet ex:if the table contains 6 rows it will find the 6th row
		
		int totalcell = sheet.getRow(0).getLastCellNum();//Finding the last cell of particular row
		
		for(int r=0;r<=totalrows;r++)
		{
			XSSFRow currentRow = sheet.getRow(r);//jumping into particular row 
			for(int c=0;c<totalcell;c++)
			{
				XSSFCell cell = currentRow.getCell(c);//getting cell data from particular rows
				System.out.print(cell.toString() + "   ");
			}
			System.out.println();
		}
		workbook.close();
		file.close();
	}

}
