package selenium;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelFileReading {
	
	public static void main(String[] args)throws EncryptedDocumentException, IOException {
		
		File f = new File(System.getProperty("user.dir")+"\\src\\test\\resources\\Test2.xls");
		FileInputStream fis = new FileInputStream(f);
		
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sheet0 = wb.getSheetAt(0);
		
		int rows = sheet0.getLastRowNum();
		Row rowCells = sheet0.getRow(0);
		int cols = rowCells.getLastCellNum();
		System.out.println(rows+" "+cols);
		
		Object[][] testData = new Object[rows+1][cols+1];
		int i=0;
		
		for(Row row : sheet0) {
			int j=0;
			for(Cell cell : row) {
				switch(cell.getCellType())
				{
					case STRING :
						System.out.print(cell.getStringCellValue() + " ");
						testData[i][j] = cell.getStringCellValue();
						break;
						
					case BOOLEAN :
						System.out.print(cell.getBooleanCellValue() + " ");
						testData[i][j] = cell.getBooleanCellValue();
						break;
						
					case NUMERIC :
						System.out.print(cell.getNumericCellValue() + " ");
						testData[i][j] = cell.getNumericCellValue();
						break;
				}
				j++;
			}
			System.out.println();
			i++;
		}
		//return testData;
	}

}
