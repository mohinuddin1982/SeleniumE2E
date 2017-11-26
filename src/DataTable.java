

import java.io.IOException;
import java.util.Locale;

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
import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.write.Label;
import jxl.write.WritableCell;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;
import jxl.write.biff.RowsExceededException;
import jxl.read.biff.BiffException;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.ss.usermodel.*;
import java.util.Iterator;
 
import java.io.File;
import java.io.FileInputStream;
//import java.io.IOException;
/*import java.io.FileInputStream;
import java.io.FileNotFoundException;*/
import java.io.FileOutputStream;

public class DataTable {
	


	
	private static final File fileToEdit = null;
	public static String Parameter;
	public static Cell CellLocation;
	public static String SheetName;
	
	public static String XlFileName;
	public static int colnum;
	public static int Iteration;
	public static int I;
//	public static String ColName;


	public static void Parameterization(String ColumnName) {
		
		try
		{
		
		 Workbook wrk1 =  Workbook.getWorkbook(new File(XlFileName));
         

        Sheet sheet1 = wrk1.getSheet(SheetName);
        
        ColumnNamelocation(ColumnName);
        
//        ColName = ColumnName;
      
        
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





	
	public void writeintoExcel( String cValue) throws BiffException, IOException, RowsExceededException, WriteException{
		
		 FileInputStream fsIP= new FileInputStream(new File(XlFileName)); //Read the spreadsheet that needs to be updated
         
         HSSFWorkbook wb = new HSSFWorkbook(fsIP); //Access the workbook
           
         HSSFSheet worksheet = wb.getSheet(SheetName); //Access the worksheet, so that we can update / modify it.
           
         HSSFCell cell = null; // declare a Cell object
         
         int C;
         int R;
         
         C= colnum;
         
         R = I;
         
         System.out.println(C+ " "+ I);//         cell = worksheet.getRow(R).getCell(C);   // Access the second cell in second row to update the value
//           
//         cell.setCellValue(cValue);  // Get current cell value value and overwrite the value
         
         HSSFRow sheetrow = worksheet.getRow(R);
         if(sheetrow == null){
             sheetrow = worksheet.createRow(R);
         }
         //Update the value of cell
         cell = sheetrow.getCell(C);
         if(cell == null){
             cell = sheetrow.createCell(C);
         }
         cell.setCellValue(cValue);
       
           
         fsIP.close(); //Close the InputStream
          
         FileOutputStream output_file =new FileOutputStream(new File(XlFileName));  //Open FileOutputStream to write updates
           
         wb.write(output_file); //write changes
           
         output_file.close();  //close the stream  
	    
		
		
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