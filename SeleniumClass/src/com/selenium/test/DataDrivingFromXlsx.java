package com.selenium.test;

import java.io.FileInputStream;
 import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class DataDrivingFromXlsx {

	public static void main(String[] args) throws Throwable{
		FileInputStream fis = new FileInputStream("./data/test Data.xlsx");
		//create workbook for read mode
		Workbook wb = WorkbookFactory.create(fis);
		//get the control of the sheet
		Sheet sh = wb.getSheet("Sheet1");
		//get the control of the row
		Row row = sh.getRow(1);
		//get the control of the column
		Cell cell = row.getCell(2);
		
		//get the data
		String data = cell.getStringCellValue();
		System.out.println(data);
		wb.close();
		
		
		
		
		

	}

}
