
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class FlightTour {	
	
	MethodLibrary UIClass = new MethodLibrary();
	DataTable xlfl = new DataTable();
	private String basicUrl;
	private String SameBillAddress;
	private String Flightconfirm;
	private String abc;
	public static WebDriver driver;
	

	

	
@Test
public  void FlightTourDemo() throws Exception {
	

	UIClass.CreatingRstFile();

 String WorkingDirectory = System.getProperty("user.dir");
	
	UIClass.ScrShotLocation= (WorkingDirectory+"/screenshots/");
	
	
///UIClass.takeSnapShot(UIClass.driver, "C:\\abc.png");
	xlfl.XlFileName = WorkingDirectory+"/Excel.xls";
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
	

		///Mac OSX Driver
	
//		 System.setProperty("webdriver.chrome.driver",WorkingDirectory+"/chromedriver");
	//

		 System.setProperty("webdriver.chrome.driver",WorkingDirectory+"/chromedriver_Win64.exe");
      UIClass.driver = new ChromeDriver(); 
      
      UIClass.driver.quit();
      
	 
      UIClass.driver = new ChromeDriver(); 
	 
	basicUrl =   "http://newtours.demoaut.com";
	 



	UIClass.driver.navigate().to(basicUrl);

	 
	 xlfl.Parameterization("UserName"); 
	 UIClass.StepInfo ="User Name";
	 UIClass.SetTextbyName("userName",xlfl.Parameter);
	 xlfl.Parameterization("Password");
	 UIClass.StepInfo ="Password";
		UIClass.SetTextbyName("password",xlfl.Parameter);

	  
		UIClass.StepInfo ="Login Button";
		UIClass.MouseClickName("login");
		
//		Thread.sleep(1000);
		
		

		//UIClass.driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		WebDriverWait Wait = new WebDriverWait(UIClass.driver, 60);
//	
		Wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("findFlights")));

	/// OneTripXpath= "html/body/div[1]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[2]/td[2]/b/font/input[2]";
		
	 xlfl.Parameterization("Triptype"); 
	 UIClass.StepInfo ="Trip type";
	 UIClass.ClickByXpath(xlfl.Parameter);
	 //Assert.assertEquals(true, true);

	 xlfl.Parameterization("Passengers"); 	
	 UIClass.StepInfo ="Passengrs Count";
	 UIClass.DropDownList("passCount",xlfl.Parameter);

	  //BusinessClass = "html/body/div[1]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[9]/td[2]/font/font/input[1]";

	 xlfl.Parameterization("DepartingFrom"); 	
	 UIClass.StepInfo ="Departing From";
	  UIClass.DropDownList("fromPort",xlfl.Parameter);

	 xlfl.Parameterization("DepartingMonth"); 	 
	  UIClass.StepInfo ="Departing Month";
	  UIClass.DropDownList("fromMonth", xlfl.Parameter);
	  
	  xlfl.Parameterization("DepartingDate"); 	
	  UIClass.StepInfo ="Departing Date";
	  UIClass.DropDownList("fromDay", xlfl.Parameter);
	  
	  xlfl.Parameterization("ArrivingIN"); 	
	  UIClass.StepInfo ="Arriving Port";
	  UIClass.DropDownList("toPort", xlfl.Parameter);
	  
	  xlfl.Parameterization("ArrivingMonth"); 	
	  UIClass.StepInfo ="Arriving Month";
	  UIClass.DropDownList("toMonth", xlfl.Parameter);
	  
	  xlfl.Parameterization("ArrivingDate"); 
	  UIClass.StepInfo ="Arriving Date";
	  UIClass.DropDownList("toDay", xlfl.Parameter);
	 
	  xlfl.Parameterization("ServiceClass"); 
	  UIClass.StepInfo ="Service ClassType";
	  UIClass.ClickByXpath(xlfl.Parameter);

	  
	  xlfl.Parameterization("AirlinePreference"); 	
	  UIClass.StepInfo ="Selecting Airlines";
	  UIClass.DropDownList("airline", xlfl.Parameter);

	  
	  UIClass.StepInfo ="Clicking Find Flights";
	  UIClass.MouseClickName("findFlights");

	  
	  UIClass.StepInfo ="Reservation Of Flight";
	  UIClass.MouseClickName("reserveFlights");

	  xlfl.Parameterization("FirstName"); 
	  UIClass.StepInfo ="Passengers First Name";
	  UIClass.SetTextbyName("passFirst0",xlfl.Parameter);
	  
	  xlfl.Parameterization("LastName"); 
	  UIClass.StepInfo ="Passengers  Last Name";
	  UIClass.SetTextbyName("passLast0", xlfl.Parameter);
	  
	  xlfl.Parameterization("MealPreference"); 
	  UIClass.StepInfo ="Passerngers Meal Selection";
	  UIClass.DropDownList("pass.0.meal",xlfl.Parameter);
	  
	  
	  xlfl.Parameterization("CreditCardName"); 
	  UIClass.StepInfo ="Name of the CC";
	  UIClass.DropDownList("creditCard",xlfl.Parameter);
	  
	  
	  xlfl.Parameterization("CreditCardNumber"); 
	  UIClass.StepInfo ="Number of the CC";
	  UIClass.SetTextbyName("creditnumber", xlfl.Parameter);
	  
	  
	  UIClass.StepInfo ="Select Credit Card Month";
	  UIClass.DropDownList("cc_exp_dt_mn", "12");
	  UIClass.StepInfo ="Select CC Year";
	  UIClass.DropDownList("cc_exp_dt_yr", "2010");
	  
	  xlfl.Parameterization("FirstName"); 
	  UIClass.StepInfo ="CC First Name";
	  UIClass.SetTextbyName("cc_frst_name", xlfl.Parameter);
	  
	  xlfl.Parameterization("LastName"); 
	  UIClass.StepInfo ="CC Last Name";
	  UIClass.SetTextbyName("cc_last_name", xlfl.Parameter);
	  
	  xlfl.Parameterization("BillingAddress"); 
	  UIClass.StepInfo ="CC Billing Address";
	  UIClass.SetTextbyName("billAddress1", xlfl.Parameter);
	  
	  UIClass.StepInfo ="CC BIlling Address2";
	  UIClass.SetTextbyName("billAddress2", "Chittagong");
	  
	  xlfl.Parameterization("BillingCity"); 
	  UIClass.StepInfo ="CC Billing City";
	  UIClass.SetTextbyName("billCity", xlfl.Parameter);
	  
	  
	  xlfl.Parameterization("BillState"); 
	  UIClass.StepInfo ="CC Billing State";
	  UIClass.SetTextbyName("billState", xlfl.Parameter);
	  
	  
	  xlfl.Parameterization("BillZipCode"); 
	  UIClass.StepInfo ="CC Bill ZipCode";
	  UIClass.SetTextbyName("billZip", xlfl.Parameter);

	  SameBillAddress = "html/body/div[1]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[14]/td[2]/input";

	  UIClass.StepInfo ="Checking Same Bill Address";
	  UIClass.ClickByXpath(SameBillAddress);

	  UIClass.StepInfo ="Confirming the Flight";
	  UIClass.MouseClickName("buyFlights");
	  


	  Flightconfirm = "html/body/div[1]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr[1]/td[2]/table/tbody/tr[5]/td/table/tbody/tr[3]/td/font";

	 
	  abc = UIClass.driver.findElement(By.xpath(Flightconfirm)).getText();



//	  System.out.println("File Name "+WorkingDirectory + "/Results/Flight Tour-"+s+".html");s
	  
	 

	 
//	 Flight%20Tour-2017-11-21%2002-56-41.html


	 UIClass.driver.close();
	 
	 
	  Date d=new Date(new Date().getTime()); String s=new SimpleDateFormat("yyyy-MM-dd%20HH-mm-ss").format(d);
		
		
		 String ResultFileLocation = ("file://"+WorkingDirectory + "/Results/Flight%20Tour"+s+".html");
	  
     UIClass.EndOFScriptResult();
     
     xlfl.Parameterization("TestResult"); 	 
	  
	  xlfl.writeintoExcel(ResultFileLocation);
	
	 }
	else
	{
		System.out.println("The Test Skipped for Row Number " + xlfl.I);
	
	}
	


	
	}
}
}

	



