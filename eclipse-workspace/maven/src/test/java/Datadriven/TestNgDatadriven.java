package Datadriven;

import java.util.ArrayList;



import lib.Xls_Reader;

public class TestNgDatadriven {
	static Xls_Reader reader;
	
	
	public static ArrayList<Object[]> getExceldata() {
		
		ArrayList <Object[]> mydata = new ArrayList<Object[]>();
	
		
		Xls_Reader reader = new Xls_Reader("C:\\Users\\dssri\\Desktop\\ebayregistrationdata.xlsx");
		
		
		
		int rowcount = reader.getRowCount("Sheet1");
		
		
for (int row = 2;row <= rowcount; row ++ ) 
{
			
		
		String  firstname = reader.getCellData("Sheet1", "First name", row);
		
		String  Lastname = reader.getCellData("Sheet1", "Last name", row);
	
		String  Emailid = reader.getCellData("Sheet1", "Email address", row);
	
		String  Password = reader.getCellData("Sheet1", "Password", row);
		
		String  Passconform = reader.getCellData("Sheet1", "ConfirmPasswd", row);
		
		Object ob [] = {firstname,Lastname,Emailid, Password,Passconform};
		mydata.add(ob);
		
	}
		return mydata;
	}

}
