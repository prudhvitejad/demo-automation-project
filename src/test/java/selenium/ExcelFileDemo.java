package selenium;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelFileDemo {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		ExcelFileDemo efd = new ExcelFileDemo();
		efd.getData("sheet1");

	}
	
	public String[][] getData(String excelSheetName) throws EncryptedDocumentException, IOException {
		
		File f = new File(System.getProperty("user.dir")+"\\src\\test\\resources\\Test1.xls");
		FileInputStream fis = new FileInputStream(f);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sheetName = wb.getSheet(excelSheetName);
		
		int rows = sheetName.getLastRowNum();
		Row rowCells = sheetName.getRow(0);
		int cols = rowCells.getLastCellNum();
		
		DataFormatter format = new DataFormatter();
		
		String testData[][] = new String[rows][cols];
		
		for(int i=1;i<rows;i++) {
			for(int j=0;j<cols;j++) {
				testData[i-1][j] = format.formatCellValue(sheetName.getRow(i).getCell(j));
				
			//	System.out.println(testData[i-1][j]);
				System.out.println("Hi");
			}
		}
		return testData;
	}

}
