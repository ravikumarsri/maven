package com.crm.qa.util;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.commons.io.FileUtils;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.crm.qa.base.TestBase;


public class Testutil extends TestBase{
	
	public static XSSFWorkbook  ws;
	static	XSSFSheet sh;
	
	public  static void switchtoframe() {
		driver.switchTo().frame("mainpanel");
	}

	
public static Object[] [] getdata(String sheetname ){
	
	FileInputStream Ip = null;
	try {
		Ip = new FileInputStream("C:\\Users\\dssri\\eclipse-workspace\\FreeCRMTest\\src\\main\\java\\com\\crm\\qa\\Testdata\\New contacts.xlsx");
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	  try {
		ws = new XSSFWorkbook(Ip);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	  sh = ws.getSheet(sheetname);
	
		
	Object [] [] data = new Object [sh.getLastRowNum()] [sh.getRow(0).getLastCellNum()];
	
	System.out.println(sh.getLastRowNum());
	for (int i=0;i<sh.getLastRowNum();i++) {
		
		for (int j=0; j < sh.getRow(0).getLastCellNum();j++) {
			
			data[i][j] = sh.getRow(i + 1).getCell(j).toString();
			
		}
	}
	
	
	return data;
}

public static   void takeScreenshotAtEndOfTest() throws IOException {
	
	TakesScreenshot  ts = (TakesScreenshot)driver;
	File sc = ts.getScreenshotAs(OutputType.FILE);
	FileUtils.copyFileToDirectory(sc, new File("./FreeCRMTest/ScreenShots"+System.currentTimeMillis()+".png"));
	
}



}