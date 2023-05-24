package csv;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelFileWriting {

	public static void main(String[] args) throws IOException {
		
		//writing in excel file 
		
		XSSFWorkbook workbook = new XSSFWorkbook();
		XSSFSheet sheet = workbook.createSheet("sheet1");
		
		Row r0 = sheet.createRow(0);
		Cell c0 = r0.createCell(0);
		c0.setCellValue("Prudhvi");
		Cell c1 = r0.createCell(1);
		c1.setCellValue("Teja");
		
		Row r1 = sheet.createRow(1);
		Cell c2 = r1.createCell(0);
		c2.setCellValue("Theja");
		Cell c3 = r1.createCell(1);
		c3.setCellValue("Sree");
		
		File f = new File(System.getProperty("user.dir")+"\\src\\test\\resources\\Test2.xls");
		FileOutputStream fos = new FileOutputStream(f);
		
		workbook.write(fos);
		fos.close();
		workbook.close();
		
		System.out.println("Created Successfully");
	}

}
