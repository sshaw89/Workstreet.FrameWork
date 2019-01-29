 package practice;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class WriteDatabackToExcel {

	public static void main(String[] args) throws Throwable {
		FileInputStream fis=new FileInputStream("./Data/testdata.xlsx");
		Workbook wb=WorkbookFactory.create(fis);
		Sheet sh=wb.getSheet("Sheet1");
		sh.getRow(2).createCell(2).setCellValue("golu");
		FileOutputStream fout=new FileOutputStream("./Data/testdata.xlsx");
		wb.write(fout);
		
	}

}
