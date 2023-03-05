package org.qa.utilities;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Utilities {

	public static XSSFWorkbook excelworkbook;
	 public static XSSFSheet excelsheet;
	 
	public static  String getcelldata(int row,int column) throws IOException
	{
	FileInputStream excel=new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\resources\\utilities.xlsx");
	 excelworkbook=new XSSFWorkbook(excel);
	 excelsheet=excelworkbook.getSheetAt(0);
	 return excelsheet.getRow(row).getCell(column).getStringCellValue();

	}
	
	public static  String getcelldata1(int row,int column) throws IOException
	{
	FileInputStream excel=new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\resources\\utilities.xlsx");
	 excelworkbook=new XSSFWorkbook(excel);
	 excelsheet=excelworkbook.getSheetAt(0);
	 return excelsheet.getRow(row).getCell(column).getRawValue();
	 

	}
	

	
}
