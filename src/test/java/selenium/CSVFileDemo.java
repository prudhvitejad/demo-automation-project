package selenium;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class CSVFileDemo {

	public static void main(String[] args) throws IOException {
	/*
		FileWriter fr = new FileWriter(System.getProperty("user.dir")+"\\src\\test\\resources\\Test.csv");
		BufferedWriter br = new BufferedWriter(fr);
		
		br.write("Prudhvi"+",");
		br.write("Teja"+",");
		
		br.write("\n");
		
		br.write("Theja"+",");
		br.write("Sree"+",");
		
		br.close();
	*/
	/*	
		PrintWriter pr = new PrintWriter(System.getProperty("user.dir")+"\\src\\test\\resources\\Test2.csv");
		
		pr.print("Prudhvi"+",");
		pr.print("Teja"+",");
		
		pr.println();
		
		pr.print("Theja"+",");
		pr.print("Sree"+",");
		
		pr.close();
	*/
		FileReader fr = new FileReader(System.getProperty("user.dir")+"\\src\\test\\resources\\Test.csv");
		BufferedReader br = new BufferedReader(fr);
		String str = "";
	
		while((str = br.readLine()) != null) {
			String[] str1 = str.split(",");
			for(String str2:str1)
				System.out.println(str2);
		}
		
		br.close();
	}

}
