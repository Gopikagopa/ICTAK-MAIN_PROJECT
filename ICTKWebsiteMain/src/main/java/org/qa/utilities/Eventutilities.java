package org.qa.utilities;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Eventutilities {

	public static XSSFWorkbook excelworkbookevent;
	 public static XSSFSheet excelsheetevent;
	 
	 public static  String getcelldataevent(int row,int column) throws IOException
		{
		FileInputStream excel=new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\resources\\eventutilities.xlsx");
		 excelworkbookevent=new XSSFWorkbook(excel);
		 excelsheetevent=excelworkbookevent.getSheetAt(0);
		 return excelsheetevent.getRow(row).getCell(column).getStringCellValue();

		}
		
		public static  String getcelldataevent1(int row,int column) throws IOException
		{
		FileInputStream excel=new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\resources\\eventutilities.xlsx");
		 excelworkbookevent=new XSSFWorkbook(excel);
		 excelsheetevent=excelworkbookevent.getSheetAt(0);
		 return excelsheetevent.getRow(row).getCell(column).getRawValue();
		 

		}
		
}
