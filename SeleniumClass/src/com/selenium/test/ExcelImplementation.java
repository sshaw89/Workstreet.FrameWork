package com.selenium.test;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import com.myntra.genriclib.AutoConst;

public class ExcelImplementation {

	public static void main(String[] args)throws Throwable {
	    FileInputStream fis = new FileInputStream(AutoConst.TEST_DATA_SHEET_PATH);
	    Workbook wb = WorkbookFactory.create(fis);
	    Sheet sh = wb.getSheet("Sheet1");
	    int rowCount = sh.getLastRowNum();
	    for(int i=0;i<=rowCount;i++) {
	            String col_0 = sh.getRow(i).getCell(0).getStringCellValue();
	    		String col_1 = sh.getRow(i).getCell(1).getStringCellValue();
	    		String col_2 = sh.getRow(i).getCell(2).getStringCellValue();
	    		System.out.println(col_0+"\t"+col_1+"\t"+col_2);
	    }
	    //write back to excel sheet
	    sh.getRow(1).createCell(3).setCellValue("hello");
	    FileOutputStream fos = new FileOutputStream("./data/TestData.xlsx");
	    wb.write(fos);
	    wb.close();
	    String  data = sh.getRow(1).getCell(3).getStringCellValue();
	    System.out.println(data);
	    
	    	
	    }
	   
	    

	}


