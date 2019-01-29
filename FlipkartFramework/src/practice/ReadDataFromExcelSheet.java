package practice;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadDataFromExcelSheet {

	public static void main(String[] args) throws Throwable {
		FileInputStream fisObj=new FileInputStream("./Data/testdata.xlsx");
		Workbook wb=WorkbookFactory.create(fisObj);
		Sheet sh=wb.getSheet("Sheet1");
		int rowcount=sh.getLastRowNum();
		for(int i=0;i<rowcount+1;i++) {
			String col_0=sh.getRow(i).getCell(0).getStringCellValue();
			String col_1=sh.getRow(i).getCell(1).getStringCellValue();
			System.out.println(col_0+" : "+col_1);	
		} 
		
		wb.close();

	}

}
