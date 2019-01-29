package com.actitime.genericlibrary;
/**
 * @author Subrat
 */

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FileUtil {

	public Properties getPropertyFileObject() throws IOException,FileNotFoundException {
		FileReader FR=new FileReader("./Data/commonData.properties");
		Properties pobj=new Properties();
		pobj.load(FR);
		String url=pobj.getProperty("url");
		String username=pobj.getProperty("username");
		String password=pobj.getProperty("password");
		return pobj;
	}
	public String getExcelData(String sheetname,int rownum,int colnum) throws Throwable {
		FileInputStream fis=new FileInputStream("./Data/testdata.xlsx");
		Workbook wb=WorkbookFactory.create(fis);
		Sheet sh=wb.getSheet("Sheet1");
		String data=sh.getRow(1).getCell(1).getStringCellValue();
		wb.close();
		return data;
		
	}

}
