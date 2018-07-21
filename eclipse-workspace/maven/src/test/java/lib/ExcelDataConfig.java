package lib;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataConfig {
	XSSFWorkbook wb;
	XSSFSheet sheet1;
	public ExcelDataConfig(String excelpath) {
		
		try {
			File fs = new File(excelpath);
			
			FileInputStream fis = new FileInputStream(fs);
			
			 wb = new XSSFWorkbook(fis);
			
		} catch (Exception e) {
			
			System.out.println(e.getMessage());
		
		}
		
	}

	public String getdata(int Sheetnum,int row,int colum) 
	{
		sheet1 = wb.getSheetAt(Sheetnum);
		String data = sheet1.getRow(row).getCell(colum).getStringCellValue();		return data;
	}
	
}
