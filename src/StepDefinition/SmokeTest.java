package StepDefinition;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

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

import MainPackage.DataTable;
import MainPackage.MethodLibrary;

public class SmokeTest {
	

	MethodLibrary UIClass = new MethodLibrary();
	DataTable xlfl = new DataTable();
	private String basicUrl;
	private String SameBillAddress;
	private String Flightconfirm;
	private String abc;
	

	
	
	
@Given("^User Name and Password$")
public void user_Name_and_Password() throws Throwable {
    // Write code here that turns the phrase above into concrete actions

	UIClass.ScrShotLocation= ("E:\\ScreenShots\\");
	
	
///UIClass.takeSnapShot(UIClass.driver, "C:\\abc.png");
	xlfl.XlFileName = "C:\\Users\\Mohin\\Desktop\\Excel.xls";
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
	
		
	
	 System.setProperty("webdriver.chrome.driver","K:\\Java Jar\\geckodriver-v0.19.0-win64\\chromedriver.exe");
      UIClass.driver = new ChromeDriver(); 
	 
	 
	basicUrl =   "http://newtours.demoaut.com";
	 

	 //System.setProperty("webdriver.firefox.driver","K:\\Java Jar\\geckodriver-v0.19.0-win64\\geckodriver.exe");
	  //WebDriver driver = new InternetExplorerDriver();
	//UIClass.driver = new FirefoxDriver();


	 //UIClass.driver.get(basicUrl);
	UIClass.driver.navigate().to(basicUrl);
	

	//UIClass.MBcaptureScreenShot(UIClass.driver);
	
	///UIClass.takeSnapShot(UIClass.driver, "C:\\abc.png");
	   
	 
	 xlfl.Parameterization("UserName"); 	 		
	 UIClass.SetTextbyName("userName",xlfl.Parameter);
	 xlfl.Parameterization("Password"); 	
		UIClass.SetTextbyName("password",xlfl.Parameter);

	  

		UIClass.MouseClickName("login");
	
	}
    catch (Exception e)
	{
	
	}
	
	 }
	}
	

}



@When("^Giving User Name$")
public void giving_User_Name() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	
	for( xlfl.I = 1; xlfl.I<= xlfl.Iteration; xlfl.I++) {
	//
		////Main Method
		
		xlfl.Parameterization("Run"); 	
	if(xlfl.Parameter.equals("Y")) 
	 {
		System.out.println("The Test gonna Start for Row Number " + xlfl.I);
	
	
	try
	{
	

	

	//UIClass.MBcaptureScreenShot(UIClass.driver);
	
	///UIClass.takeSnapShot(UIClass.driver, "C:\\abc.png");
	   
	 
	 xlfl.Parameterization("UserName"); 	 		
	 UIClass.SetTextbyName("userName",xlfl.Parameter);
	 xlfl.Parameterization("Password"); 	
		UIClass.SetTextbyName("password",xlfl.Parameter);

	  

		UIClass.MouseClickName("login");
	
	}
    catch (Exception e)
	{
	
	}
	
	
	
	 }
	}
}

@When("^Flight Information$")
public void flight_Information() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    throw new PendingException();
}

@When("^Customer information$")
public void customer_information() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    throw new PendingException();
}

@Then("^I validate the outcomes$")
public void i_validate_the_outcomes() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    throw new PendingException();
}

@Then("^check more outcomes$")
public void check_more_outcomes() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    throw new PendingException();
}

@Given("^I want to write a step with name(\\d+)$")
public void i_want_to_write_a_step_with_name(int arg1) throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    throw new PendingException();
}

@When("^I check for the (\\d+) in step$")
public void i_check_for_the_in_step(int arg1) throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    throw new PendingException();
}

@Then("^I verify the success in step$")
public void i_verify_the_success_in_step() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    throw new PendingException();
}

@Then("^I verify the Fail in step$")
public void i_verify_the_Fail_in_step() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    throw new PendingException();
}



}
