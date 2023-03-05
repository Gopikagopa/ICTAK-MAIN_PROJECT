package org.qa.utilities;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Coursejavautilities {
	public static XSSFWorkbook excelworkbookcourse;
	 public static XSSFSheet excelsheetcourse;
	 
	 public static  String getcelldatacourse(int row,int column) throws IOException
		{
		FileInputStream excel=new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\resources\\coursejavautilities1.xlsx");
		 excelworkbookcourse=new XSSFWorkbook(excel);
		 excelsheetcourse=excelworkbookcourse.getSheetAt(0);
		 return excelsheetcourse.getRow(row).getCell(column).getStringCellValue();

		}
		
		public static  String getcelldatacourse1(int row,int column) throws IOException
		{
		FileInputStream excel=new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\resources\\coursejavautilities1.xlsx");
		 excelworkbookcourse=new XSSFWorkbook(excel);
		 excelsheetcourse=excelworkbookcourse.getSheetAt(0);
		 return excelsheetcourse.getRow(row).getCell(column).getRawValue();
		 

		}
		

}
