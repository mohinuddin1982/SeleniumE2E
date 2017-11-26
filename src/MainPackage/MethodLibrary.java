package MainPackage;

//import org.testng.Assert.assertEquals;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;

//import javax.annotation.Generated;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
//import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;

import com.webdriver.framework.*;

//import org.openqa.selenium.firefox.FirefoxDriver;

public class MethodLibrary {
	
	DataTable xlfl = new DataTable();
	
	//public String ScrShotLocation;
	public static WebDriver driver;
	public static String ScrShotLocation;
	private static String ScreenShotFileName;
	
	
	//WebDriverWait Wait = new WebDriverWait(driver, 10);
	

public void DropDownList(String name, String ValueText){

	 
	Select droplist = new Select(driver.findElement(By.name(name)));   
	
  //SelectElement DropList = new SelectElement(driver.FindElement((By.Name(name))));

	droplist.selectByVisibleText(ValueText);
	


	
	HtmlResult(xlfl.Parameter); 
	


}


public void HTMLwithScshot() {

String destDir = "/Users/muhammadmohinuddin/Documents/Selenium/ScreenShots/";
String destFile = System.currentTimeMillis()+".png";


//FileUtils.copyFile("E:\\ScreenShots\\1506992770108.png", new File(destDir + "\\" + destFile));
Reporter.log("<a href=/screenshots/" + destFile + "><img src=/screenshots/" + destFile + " style=width:100px;height:100px;/>" + destFile + "</a><br/>");

}



public void HtmlResult(String StepName) {
	
	MBcaptureScreenShot();
GenerateResult gre = new  GenerateResult(driver);


gre.generateResultfile("Flight Tour");



//gre.WriteDataToHTML(arg0, arg1);
gre.AddTestCaseId(StepName);
gre.AddTestCaseDesc("ScreenShot details " + ScrShotLocation + ScreenShotFileName);
gre.CreateLog("ScreenShot details " + ScrShotLocation + ScreenShotFileName);

}

/////Asserting Page Title
//public void itleValidation(String actualTitle,String expectedTitle) {
//	 actualTitle = driver.getTitle();
//	
////	assertEquals(expectedTitle,actualTitle);
//}







public void ClickByXpath(String CopiedXpath){

  driver.findElement(By.xpath(CopiedXpath)).click();

	HtmlResult(xlfl.Parameter); 
  
}

public void SetTextByXpath(String CopiedXpath, String Input)
{
	driver.findElement(By.xpath(CopiedXpath)).clear();
  driver.findElement(By.xpath(CopiedXpath)).sendKeys(Input);

	HtmlResult(xlfl.Parameter); 
}

public void SetTextbyName(String Name, String Value){
  driver.findElement(By.name(Name)).clear();
  driver.findElement(By.name(Name)).sendKeys(Value);
  
	HtmlResult(xlfl.Parameter); 
}

public void SetTextbyID(String id, String Value){
	 driver.findElement(By.id(id)).clear();
	  driver.findElement(By.id(id)).sendKeys(Value);
		HtmlResult(xlfl.Parameter); 

}

public void MouseClickName(String Name){

  driver.findElement(By.name(Name)).click();
	HtmlResult(xlfl.Parameter); 
   }

public void RadioBttonbyValue(String Name, String Value){

  Select DropList = new Select(driver.findElement((By.name(Name))));

  DropList.selectByValue(Value);
	HtmlResult(xlfl.Parameter); 

}

public static void MBcaptureScreenShot(){
	 
	  // Take screenshot and store as a file format
	  File src= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	try {
	  // now copy the  screenshot to desired location using copyFile method
	 
	 FileUtils.copyFile(src, new File(ScrShotLocation+System.currentTimeMillis()+".png"));
	 
	  ScreenShotFileName = ScrShotLocation+System.currentTimeMillis()+".png";
	 
	       }
	 
	catch (IOException e)
	 
	{
	 
	System.out.println(e.getMessage());
	 
	    }
	 
	}



	

}
