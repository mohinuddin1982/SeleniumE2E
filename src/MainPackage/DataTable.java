package MainPackage;


import java.io.IOException;
/*import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.openqa.selenium.firefox.FirefoxDriver;
*/
import jxl.*;
import jxl.read.biff.BiffException;
 
import java.io.File;
//import java.io.IOException;
/*import java.io.FileInputStream;
import java.io.FileNotFoundException;*/

public class DataTable {
	


	
	public static String Parameter;
	public static Cell CellLocation;
	public static String SheetName;
	
	public static String XlFileName;
	public static int colnum;
	public static int Iteration;
	public static int I;


	public static void Parameterization(String ColumnName) {
		
		try
		{
		
		 Workbook wrk1 =  Workbook.getWorkbook(new File(XlFileName));
         

        Sheet sheet1 = wrk1.getSheet(SheetName);
        
        ColumnNamelocation(ColumnName);
        
      
        
       CellLocation = sheet1.getCell(colnum, I );
       Parameter = CellLocation.getContents();
        
     
        System.out.println("THe Column Name  " + ColumnName + " Value is " +Parameter );
     


        
        
        

         
    } catch (BiffException e) {
        e.printStackTrace();
    } catch (IOException e) {
        e.printStackTrace();
    }
     


}
	

	
	public static void NumberofIteration() throws BiffException, IOException {
		
	
		
		Workbook wrk1 =  Workbook.getWorkbook(new File(XlFileName));
        Sheet sheet = wrk1.getSheet(SheetName);
	    
		Iteration = sheet.getRows()-1;
		
		  System.out.println(Iteration);

	}




public static void ColumnNamelocation(String ColName) throws BiffException, IOException {
	
    Workbook wrk1 =  Workbook.getWorkbook(new File(XlFileName));
    

    Sheet sheet1 = wrk1.getSheet(SheetName);
    
    //int a =sheet1.findCell(ColumnName).getRow();
    if(ColName != null) {
    	colnum = sheet1.findCell(ColName).getColumn();
    }
    else{
    	System.out.println(ColName + "Column Not Found");
    }
    
  
}

}