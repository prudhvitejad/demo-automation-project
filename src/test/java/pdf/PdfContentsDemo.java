package pdf;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;
import org.testng.annotations.Test;

public class PdfContentsDemo {
	
	@Test
	public void test1() throws FileNotFoundException, IOException {
	//	File pdfFile = new File("C:\\Users\\dprudhvi\\OneDrive - Synopsys, Inc\\Documents\\TEST_54461653988177340.pdf");
		File pdfFile = new File("C:\\Users\\dprudhvi\\Downloads\\3.pdf");
		PDDocument doc = PDDocument.load(new FileInputStream(pdfFile));
		PDFTextStripper textStripper = new PDFTextStripper();
		String pdfText = textStripper.getText(doc);
		System.out.println(pdfText);
	}
}
