package restAssured;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;

public class CSVasString {

	public static void main(String[] args) throws IOException, CsvValidationException {
		// TODO Auto-generated method stub
		
		String str1 = "web_target_18-8,TEST_412181660820933868,web_target_18-8,https://www.google.com,SERVICE_automation,SERVICE_automation,3D Service (Unlimited),\"Pen Testing Incremental (PT-I, Pilot - Limited Access)\",Completed,2022-07-21 03:30:00,2022-08-19 10:08:02,2022-07-25 03:30:00,2022-08-19 10:47:40,Full Scan,2022-07-05 18:30:00,";
		
		boolean status = str1.contains("\"");
		
		System.out.println(status);
		
		String first = str1.split("\"")[0];
		String mid = str1.split("\"")[1];
		String last = str1.split("\"")[2];
		
		System.out.println(first);
		System.out.println(mid);
		System.out.println(last);
		
		System.out.println(last.split(",")[7]);
		System.out.println("Hee");
		
		
		
		PrintWriter pw = new PrintWriter("file1.csv");
		String str2 = "Test Name,Test Id,Target Name,Test URL/Target,Service Name,Service ID,Product Type,Product Sub Type,Scan State,Scheduled Date,Actual Start Date,Scheduled End Date,Actual End Date,Scan Type,Demo Call Date,Labels\r\n"
				+ "us_bank_scan_1,TEST_127831660804338987,us_bank_target,https://staging-demopartner.cigital.com,SERVICE_automation,SERVICE_automation,3D Service (Unlimited),DAST Standard (DAST-S),Automated/Manual Testing,2022-01-03 03:30:00,2022-08-18 07:22:31,2022-01-05 03:30:00,,Full Scan,,\r\n"
				+ "change_log_1,TEST_326631658213705637,change_log,https://staging-demopartner.cigital.com,SERVICE_automation,SERVICE_automation,3D Service (Unlimited),DAST Standard (DAST-S),Completed,2022-02-01 03:30:00,2022-07-19 06:56:19,2022-02-03 03:30:00,2022-07-19 07:05:58,Full Scan,,\r\n"
				+ "change_log_2,TEST_57091658214455005,change_log,https://staging-demopartner.cigital.com,SERVICE_automation,SERVICE_automation,3D Service (Unlimited),DAST Standard (DAST-S) Retest,QA/QC,2022-02-04 03:30:00,2022-07-19 07:08:29,2022-02-07 03:30:00,2022-07-19 07:19:19,Revalidation Scan,,\r\n"
				+ "change_log_3,TEST_466781658214926411,change_log,https://staging-demopartner.cigital.com,SERVICE_automation,SERVICE_automation,3D Service (Unlimited),DAST Standard (DAST-S),Automated/Manual Testing,2022-02-08 03:30:00,2022-07-19 07:16:43,2022-02-10 03:30:00,,Full Scan,,\r\n"
				+ "change_log_4,TEST_619681658215232641,change_log,https://staging-demopartner.cigital.com,SERVICE_automation,SERVICE_automation,3D Service (Unlimited),DAST Standard (DAST-S),Automated/Manual Testing,2022-02-11 03:30:00,2022-07-19 07:21:30,2022-02-15 03:30:00,,Full Scan,,\r\n"
				+ "reports_verification_2,TEST_991851658990343483,reports_verification_2,https://staging-demopartner.cigital.com,SERVICE_automation,SERVICE_automation,3D Service (Unlimited),DAST Standard (DAST-S),Completed,2022-04-01 03:30:00,2022-07-28 06:40:46,2022-04-05 03:30:00,2022-07-28 06:48:13,Full Scan,,\r\n"
				+ "mobile_target_22-8,TEST_740991661145219417,mobile_target_22-8,mobile_target_22-8,SERVICE_automation,SERVICE_automation,3D Service (Unlimited),\"Mobile Application Testing Essential (MAST-E, Pilot - Limited Access)\",Completed,2022-05-05 03:30:00,2022-08-22 05:15:00,2022-05-13 03:30:00,2022-08-22 05:23:30,Full Scan,2022-05-03 18:30:00,\r\n"
				+ "scr_2_aug,TEST_369431659433523796,scr_2_aug,scr_2_aug,SERVICE_automation,SERVICE_automation,3D Service (Unlimited),SAST Comprehensive (SAST-C),Completed,2022-05-16 03:30:00,2022-08-02 09:46:28,2022-05-31 03:30:00,2022-08-02 09:55:25,Full Scan,,\r\n"
				+ "web target,TEST_863071657882325741,web target,https://staging-demopartner.cigital.com,SERVICE_automation,SERVICE_automation,3D Service (Unlimited),DAST Standard (DAST-S) Retest,Completed,2022-06-01 03:30:00,2022-07-15 10:53:40,2022-06-02 03:30:00,2022-07-29 06:15:36,Revalidation Scan,,\r\n"
				+ "report_verification_cvss,TEST_550041659004605564,report_verification_cvss,https://staging-demopartner.cigital.com,SERVICE_automation,SERVICE_automation,3D Service (Unlimited),DAST Standard (DAST-S),Completed,2022-06-06 03:30:00,2022-07-28 10:38:16,2022-06-08 03:30:00,2022-07-28 10:47:07,Full Scan,,\r\n"
				+ "reports_verification,TEST_79981658301858973,reports_verification,https://staging-demopartner.cigital.com,SERVICE_automation,SERVICE_automation,3D Service (Unlimited),DAST Standard (DAST-S),Completed,2022-06-10 03:30:00,2022-07-20 07:25:50,2022-06-14 03:30:00,2022-07-20 07:33:41,Full Scan,,\r\n"
				+ "report_verification_cvss_v2,TEST_603321659010815790,report_verification_cvss,https://staging-demopartner.cigital.com,SERVICE_automation,SERVICE_automation,3D Service (Unlimited),DAST Standard (DAST-S),Completed,2022-06-15 03:30:00,2022-07-28 12:23:21,2022-06-17 03:30:00,2022-07-28 12:29:34,Full Scan,,\r\n"
				+ "us_bank_2,TEST_691361660891392672,us_bank_2,https://staging-demopartner.cigital.com,SERVICE_automation,SERVICE_automation,3D Service (Unlimited),DAST Standard (DAST-S),Completed,2022-06-20 03:30:00,2022-08-19 06:44:32,2022-06-22 03:30:00,2022-08-19 06:50:20,Full Scan,,\r\n"
				+ "us_bank_2_retest_1,TEST_935961660891927769,us_bank_2,https://staging-demopartner.cigital.com,SERVICE_automation,SERVICE_automation,3D Service (Unlimited),DAST Standard (DAST-S) Retest,Automated/Manual Testing,2022-06-23 03:30:00,2022-08-19 06:53:38,2022-06-24 03:30:00,,Revalidation Scan,,\r\n"
				+ "us_bank_retest_keerthana,TEST_517581660892775242,us_bank_2,https://staging-demopartner.cigital.com,SERVICE_automation,SERVICE_automation,3D Service (Unlimited),DAST Standard (DAST-S) Retest,Automated/Manual Testing,2022-06-27 03:30:00,2022-08-19 07:07:33,2022-06-28 03:30:00,,Revalidation Scan,,\r\n"
				+ "web target scan 1,TEST_133101657880913581,web target,https://staging-demopartner.cigital.com,SERVICE_automation,SERVICE_automation,3D Service (Unlimited),DAST Standard (DAST-S),Completed,2022-07-04 03:30:00,2022-07-15 10:31:44,2022-07-06 03:30:00,2022-07-15 10:50:16,Full Scan,,\r\n"
				+ "us_bank_retest_1,TEST_502541660886815105,us_bank_target,https://usbankscan1staging-demopartner.cigital.com,SERVICE_automation,SERVICE_automation,3D Service (Unlimited),DAST Standard (DAST-S) Retest,Automated/Manual Testing,2022-07-07 03:30:00,2022-08-19 05:36:14,2022-07-08 03:30:00,,Revalidation Scan,,\r\n"
				+ "files_download,TEST_219081660829289872,files_download,https://staging-demopartner.cigital.com,SERVICE_automation,SERVICE_automation,3D Service (Unlimited),DAST Standard (DAST-S),Cancelled,2022-07-11 03:30:00,,,2022-08-18 13:30:45,Full Scan,,\r\n"
				+ "us_bank_retest_2,TEST_931621660888870083,us_bank_target,https://usbankscan1staging-demopartner.cigital.com,SERVICE_automation,SERVICE_automation,3D Service (Unlimited),DAST Standard (DAST-S) Retest,Automated/Manual Testing,2022-07-11 03:30:00,2022-08-19 06:02:26,2022-07-12 03:30:00,,Revalidation Scan,,\r\n"
				+ "us_bank_retest_3,TEST_418451660889619911,us_bank_target,https://usbankscan1staging-demopartner.cigital.com,SERVICE_automation,SERVICE_automation,3D Service (Unlimited),DAST Standard (DAST-S) Retest,Automated/Manual Testing,2022-07-13 03:30:00,2022-08-19 06:14:46,2022-07-14 03:30:00,,Revalidation Scan,,\r\n"
				+ "us_bank_scan_2,TEST_793641660817550711,us_bank_target,https://us-bank-scan-2staging-demopartner.cigital.com,SERVICE_automation,SERVICE_automation,3D Service (Unlimited),DAST Standard (DAST-S),QA/QC,2022-07-18 03:30:00,2022-08-18 10:14:49,2022-07-20 03:30:00,,Full Scan,,\r\n"
				+ "web_target_18-8,TEST_412181660820933868,web_target_18-8,https://www.google.com,SERVICE_automation,SERVICE_automation,3D Service (Unlimited),\"Pen Testing Incremental (PT-I, Pilot - Limited Access)\",Completed,2022-07-21 03:30:00,2022-08-19 10:08:02,2022-07-25 03:30:00,2022-08-19 10:47:40,Full Scan,2022-07-05 18:30:00,\r\n"
				+ "web_target,TEST_94031657892624438,web_target,https://www.google.com,SERVICE_automation,SERVICE_automation,3D Service (Unlimited),DAST Standard (DAST-S),Scheduled,2022-07-26 03:30:00,,2022-07-28 03:30:00,,Full Scan,,\r\n"
				+ "us_bank_scan_1,TEST_822751660816716788,us_bank_target,https://usbankscan1staging-demopartner.cigital.com,SERVICE_automation,SERVICE_automation,3D Service (Unlimited),DAST Standard (DAST-S),Completed,2022-08-01 03:30:00,2022-08-18 10:00:54,2022-08-03 03:30:00,2022-08-18 10:11:07,Full Scan,,\r\n"
				+ "cvss_v3,TEST_87821660821076290,cvss_v2,https://staging-demopartner.cigital.com,SERVICE_automation,SERVICE_automation,3D Service (Unlimited),DAST Standard (DAST-S),Completed,2022-08-04 03:30:00,2022-08-18 11:12:59,2022-08-08 03:30:00,2022-08-18 12:55:05,Full Scan,,\r\n"
				+ "web_target_18-7,TEST_787141658134276378,web_target_18-7,https://www.google.com,SERVICE_automation,SERVICE_automation,3D Service (Unlimited),DAST Standard (DAST-S),Scheduled,2022-08-09 03:30:00,,2022-08-11 03:30:00,,Full Scan,,\r\n"
				+ "reports_verification,TEST_665331659436305841,reports_verification,http://abc.com,SERVICE_automation,SERVICE_automation,3D Service (Unlimited),Pen Testing Essential (PT-E),Pre-Qualification Passed,2022-08-12 03:30:00,,2022-08-23 03:30:00,,Full Scan,2022-08-10 10:28:00,\r\n"
				+ "web_target_18-8-retest,TEST_685501661143835659,web_target_18-8,https://www.google.com,SERVICE_551951660907436686,SERVICE_551951660907436686,Pen Testing Incremental (PT-I) Retest,Pen Testing Incremental (PT-I) Retest,Automated/Manual Testing,2022-08-19 03:30:00,2022-08-22 04:54:53,2022-08-22 03:30:00,,Revalidation Scan,,\r\n"
				+ "mobile_target_22-8,TEST_957961661146086273,mobile_target_22-8,mobile_target_22-8,SERVICE_46721660907436456,SERVICE_46721660907436456,Mobile Application Testing Essential (MAST-E) Retest,Mobile Application Testing Essential (MAST-E) Retest,Completed,2022-08-19 03:30:00,2022-08-22 05:29:31,2022-08-22 03:30:00,2022-08-22 05:41:31,Revalidation Scan,,\r\n"
				+ "";
	//	pw.write(str1+"\n");
		pw.write(str2);
		
		pw.close();	
		
		BufferedReader br = new BufferedReader(new FileReader("file1.csv"));
		String row = br.readLine();
		System.out.println("row= "+row);
		br.close();	
		
		CSVReader reader = new CSVReader(new FileReader("file1.csv"));
		String [] nextLine = reader.readNext();
		int count=0;
	     while ((nextLine = reader.readNext()) != null) {
	        // nextLine[] is an array of values from the line
	    	System.out.println(++count);
	        for(int i=0;i<nextLine.length;i++) {
	        	System.out.println(nextLine[i]);
	        }
	     }
		 
	}

}
