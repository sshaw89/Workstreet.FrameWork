                                  package com.actitime.genriclib;

import java.io.FileInputStream;
import java.io.FileReader;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FileUtil implements FilePaths {
	public Properties getPropertiesObject() throws Throwable {
		FileReader fos = new FileReader(COMMON_DATA_PATH);
		Properties pObj = new Properties();
		pObj.load(fos);
		return pObj;
	}
	public String getExcelData(String sheetName, int rowNum, int cellNum) throws Throwable {
		FileInputStream fis = new FileInputStream("./data/testdataactitime.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet("Sheet1");
		Row row = sh.getRow(1);
		Cell col = row.getCell(1);
		String data = col.getStringCellValue();
		
		return data;
		
	}

}
