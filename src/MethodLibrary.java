
//import org.testng.Assert.assertEquals;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;

//import javax.annotation.Generated;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
//import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.TestNGUtils;

import com.webdriver.framework.*;

//import org.openqa.selenium.firefox.FirefoxDriver;

public class MethodLibrary {
	
	DataTable xlfl = new DataTable();

	public static GenerateResult gre;


	
	//public String ScrShotLocation;
	public static WebDriver driver;
	public static String ScrShotLocation;
	public String ScreenShotFileName;
	public String StepInfo;

	public static long Time;
	
	
	//WebDriverWait Wait = new WebDriverWait(driver, 10);
	

public void DropDownList(String name, String ValueText){
try
{
	 
	Select droplist = new Select(driver.findElement(By.name(name))); 
	
  //SelectElement DropList = new SelectElement(driver.FindElement((By.Name(name))));

	droplist.selectByVisibleText(ValueText);
	List<WebElement> op =droplist.getOptions();
	
	
	HtmlResult(StepInfo); 
}
catch (Exception e)
{
	System.out.println("DropDownList Not Found Error Shows::  " +e.getMessage());
}

}


///This Method will generate a HTML File for Test Result
public void CreatingRstFile() {

	gre = new  GenerateResult(driver);
	
	

gre.generateResultfile("Flight Tour");



}



public void EndOFScriptResult() {


gre.generateResultfile("Flight Tour");


gre.CreateLog();




}

///This Method Will take Screen shot of the Step
public void HtmlResult(String StepName)  {



	String destDir = ScrShotLocation;
	String destFile = null;
     Time = System.currentTimeMillis();
	

	  File src= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

	
	  	
	  // now copy the  screenshot to desired location using copyFile method
	 
	try {
		FileUtils.copyFile(src, new File(ScrShotLocation+Time+".png"));
		  ScreenShotFileName = ScrShotLocation+Time+".png";
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	 
	
	  
	  destFile = ScreenShotFileName.toString();
	  
//		System.out.println(Time);

	
gre.AddTestCaseId(StepName);

gre.AddTestCaseDesc("<a href=" +  destFile + "><img src=" +   destFile + " style=width:100px;height:100px;/>" +   destFile + "</a><br/>");

//gre.AddTestCaseDesc("<img src=" +   destFile + " style=width:100px;height:100px;/>" +   destFile + "</a><br/>");

gre.CreateLog();


}



///Asserting Page Title
public void PagetitleValidation(String actualTitle,String expectedTitle) {
	 actualTitle = driver.getTitle();
	
//	assertEquals(expectedTitle,actualTitle);
}







public void ClickByXpath(String CopiedXpath){

	try{
  driver.findElement(By.xpath(CopiedXpath)).click();
  

	HtmlResult(StepInfo); 
	}
	catch (Exception e)
	{
		System.out.println("Xpath Not Found Error Shows::  " +e.getMessage());
	}
}


public void SetTextByXpath(String CopiedXpath, String Input)
{
	try{
	driver.findElement(By.xpath(CopiedXpath)).clear();
  driver.findElement(By.xpath(CopiedXpath)).sendKeys(Input);


	HtmlResult(StepInfo); 
	}
	catch (Exception e)
	{
		System.out.println("Xpath Not Found Error Shows::  " +e.getMessage());
	}
  
}

public void SetTextbyName(String Name, String Value){
	
	try{
  driver.findElement(By.name(Name)).clear();
  driver.findElement(By.name(Name)).sendKeys(Value);
  
  
//  Assert.assertEquals(Value, driver.findElement(By.name(Name)).getText());

  
	HtmlResult(StepInfo); 
	}
	catch (Exception e)
	{
		System.out.println("InputBox Not Found Error Shows::  " +e.getMessage());
	}
	
	}

public void SetTextbyID(String id, String Value){
	
	try{
	 driver.findElement(By.id(id)).clear();
	  driver.findElement(By.id(id)).sendKeys(Value);
	  

		HtmlResult(StepInfo); 
	}
	catch (Exception e)
	{
		System.out.println("InputBox Not Found Error Shows::  " +e.getMessage());
	}
		
}

public void MouseClickName(String Name){
	
	try
	{

  driver.findElement(By.name(Name)).click();
  
	HtmlResult(StepInfo); 
	}
	catch (Exception e)
	{
		System.out.println("Button Not Found Error Shows::  " +e.getMessage());
	}
	
	}

public void RadioBttonbyValue(String Name, String Value){
	
	try{

  Select DropList = new Select(driver.findElement((By.name(Name))));

  DropList.selectByValue(Value);
	HtmlResult(StepInfo); 
	}
	catch (Exception e)
	{
		System.out.println("RadioButton Not Found Error Shows::  " +e.getMessage());
	}
}



	

}
