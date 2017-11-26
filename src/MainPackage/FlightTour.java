package MainPackage;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FlightTour {	
	
	MethodLibrary UIClass = new MethodLibrary();
	DataTable xlfl = new DataTable();
	private String basicUrl;
	private String SameBillAddress;
	private String Flightconfirm;
	private String abc;
	

	

	
	
@Test(groups = "Flight tour login")
public  void FlightTourDemo() throws Exception {
	

	
	UIClass.ScrShotLocation= ("/Users/muhammadmohinuddin/Documents/Selenium/ScreenShots/");
	
	
///UIClass.takeSnapShot(UIClass.driver, "C:\\abc.png");
	xlfl.XlFileName = "/Users/muhammadmohinuddin/Documents/SeleniumWorkSpace/SeleniumEndToEnd/Excel.xls";
	xlfl.SheetName = "NewTours";
	xlfl.NumberofIteration();
	//
	for( xlfl.I = 1; xlfl.I<= xlfl.Iteration; xlfl.I++) {
	//
		////Main Method
		
		xlfl.Parameterization("Run"); 	
	if(xlfl.Parameter.equals("Y")) 
	 {
		System.out.println("The Test gonna Start for Row Number " + xlfl.I);
	
	
	try
	{
	
		
	
	 System.setProperty("webdriver.chrome.driver","/Users/muhammadmohinuddin/Downloads/chromedriver");
      UIClass.driver = new ChromeDriver(); 
	 
	 
	basicUrl =   "http://newtours.demoaut.com";
	 

	 //System.setProperty("webdriver.firefox.driver","K:\\Java Jar\\geckodriver-v0.19.0-win64\\geckodriver.exe");
	  //WebDriver driver = new InternetExplorerDriver();
	//UIClass.driver = new FirefoxDriver();


	 UIClass.driver.get(basicUrl);
//	UIClass.driver.navigate().to(basicUrl);
	

	//UIClass.MBcaptureScreenShot(UIClass.driver);
	
	///UIClass.takeSnapShot(UIClass.driver, "C:\\abc.png");
	   
	 
	 xlfl.Parameterization("UserName"); 	 		
	 UIClass.SetTextbyName("userName",xlfl.Parameter);
	 xlfl.Parameterization("Password"); 	
		UIClass.SetTextbyName("password",xlfl.Parameter);

	  

		UIClass.MouseClickName("login");
		
		

		//UIClass.driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
  WebDriverWait Wait = new WebDriverWait(UIClass.driver, 60);
//	
	Wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("findFlights")));

	/// OneTripXpath= "html/body/div[1]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[2]/td[2]/b/font/input[2]";
		
	 xlfl.Parameterization("Triptype"); 	
	 UIClass.ClickByXpath(xlfl.Parameter);
//	 Assert.assertEquals(true, true);

	 xlfl.Parameterization("Passengers"); 	
	 UIClass.DropDownList("passCount",xlfl.Parameter);

	  //BusinessClass = "html/body/div[1]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[9]/td[2]/font/font/input[1]";

	 xlfl.Parameterization("DepartingFrom"); 	
	  UIClass.DropDownList("fromPort",xlfl.Parameter);

	  //driver.manage().timeouts().implicitlyWait(arg0, arg1) = TimeSpan.FromSeconds(20);
	  xlfl.Parameterization("DepartingMonth"); 	
	  UIClass.DropDownList("fromMonth", xlfl.Parameter);
	  
	  xlfl.Parameterization("DepartingDate"); 	
	  UIClass.DropDownList("fromDay", xlfl.Parameter);
	  
	  xlfl.Parameterization("ArrivingIN"); 	
	  UIClass.DropDownList("toPort", xlfl.Parameter);
	  
	  xlfl.Parameterization("ArrivingMonth"); 	
	  UIClass.DropDownList("toMonth", xlfl.Parameter);
	  
	  xlfl.Parameterization("ArrivingDate"); 	
	  UIClass.DropDownList("toDay", xlfl.Parameter);
	 
	  xlfl.Parameterization("ServiceClass"); 	
	  UIClass.ClickByXpath(xlfl.Parameter);

	  
	  xlfl.Parameterization("AirlinePreference"); 	
	  UIClass.DropDownList("airline", xlfl.Parameter);

	  UIClass.MouseClickName("findFlights");

	  UIClass.MouseClickName("reserveFlights");

	  xlfl.Parameterization("FirstName"); 	
	  UIClass.SetTextbyName("passFirst0",xlfl.Parameter);
	  
	  xlfl.Parameterization("LastName"); 
	  UIClass.SetTextbyName("passLast0", xlfl.Parameter);
	  
	  xlfl.Parameterization("MealPreference"); 
	  UIClass.DropDownList("pass.0.meal",xlfl.Parameter);
	  
	  
	  xlfl.Parameterization("CreditCardName"); 
	  UIClass.DropDownList("creditCard",xlfl.Parameter);
	  
	  
	  xlfl.Parameterization("CreditCardNumber"); 
	  UIClass.SetTextbyName("creditnumber", xlfl.Parameter);
	  
	  UIClass.DropDownList("cc_exp_dt_mn", "12");
	  UIClass.DropDownList("cc_exp_dt_yr", "2010");
	  
	  xlfl.Parameterization("FirstName"); 
	  UIClass.SetTextbyName("cc_frst_name", xlfl.Parameter);
	  
	  xlfl.Parameterization("LastName"); 
	  UIClass.SetTextbyName("cc_last_name", xlfl.Parameter);
	  
	  xlfl.Parameterization("BillingAddress"); 
	  UIClass.SetTextbyName("billAddress1", xlfl.Parameter);
	  UIClass.SetTextbyName("billAddress2", "Chittagong");
	  
	  xlfl.Parameterization("BillingCity"); 
	  UIClass.SetTextbyName("billCity", xlfl.Parameter);
	  
	  
	  xlfl.Parameterization("BillState"); 
	  UIClass.SetTextbyName("billState", xlfl.Parameter);
	  
	  
	  xlfl.Parameterization("BillZipCode"); 
	  UIClass.SetTextbyName("billZip", xlfl.Parameter);

	  SameBillAddress = "html/body/div[1]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[14]/td[2]/input";

	  UIClass.ClickByXpath(SameBillAddress);

	  UIClass.MouseClickName("buyFlights");

	  Flightconfirm = "html/body/div[1]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr[1]/td[2]/table/tbody/tr[5]/td/table/tbody/tr[3]/td/font";

	  abc = UIClass.driver.findElement(By.xpath(Flightconfirm)).getText();



	  System.out.println("Your Flight is confirmed " + abc);
	
	  
	}
catch(Exception e)
	{
	
	//UIClass.takeSnapShot(UIClass.driver, "C::\\Scrshot.png");
	
	System.out.println(e.getMessage());
	}
	


	 UIClass.driver.close();
	
	 }
	else
	{
		System.out.println("The Test Skipped for Row Number " + xlfl.I);
	
	}
	
//UIClass.HtmlResult("TC001", "Flight tour");

	
		}

	}	


}
