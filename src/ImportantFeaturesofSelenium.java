
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.jexl2.internal.AbstractExecutor.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;



public class ImportantFeaturesofSelenium{
	
	
	WebDriver driver;
	public boolean isAlertPresent()
	{
		 
		 try{
		 driver.switchTo().alert(); 
		 return true;
		 }
		 catch (Exception e){
		 return false;
		 }
	}
	
	 @Test
	 public void ImportantFeatures(){
		 
		 
		 driver = new FirefoxDriver();
		 
		 driver.switchTo().alert().accept();
		 driver.switchTo().alert().dismiss();
		 
		 Alert text =  driver.switchTo().alert();
		 
		 //how to select the frame
		 driver.switchTo().frame(0);
		 driver.switchTo().frame("name");
		 
		 driver.switchTo().frame(driver.findElement(By.xpath("")));
		 
		 
		 System.out.println("-----");
		 
		 
		 String Pwindow = driver.getWindowHandle();
		 
		 java.util.Set<String> allwindows = driver.getWindowHandles();
		 
		 Iterator<String> allwindow = allwindows.iterator();
		 String Parentwindow = allwindow.next();
		 driver.switchTo().window(Parentwindow);
		 
		 String ChildWindow = allwindow.next();
		 driver.switchTo().window(ChildWindow);
		 driver.switchTo().defaultContent();
		 
		 
		 System.out.println("-----");
		 
		 
		 
		 ////Implicit Wait and Explicit Wait;
		 
		 //If I write implicit Wait at the top of my script it will gonna wait 3 everytime before loading the DOM
		 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		 
		 //explicit wait
		  WebDriverWait wait = new WebDriverWait(driver,30);
		  wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("")));
		   
		  //How to do Mouse Hover
		  
		  Actions act = new Actions(driver);
		  act.moveToElement(driver.findElement(By.xpath(""))).build().perform();
		  
//		  Selecting Elelment
		  
		  Select sel = new Select(driver.findElement(By.xpath("")));
		  sel.selectByIndex(8);
		  sel.selectByValue("");
		  sel.selectByVisibleText("Text");
		  
		  //// Get options from dropdowns
		  sel.selectByVisibleText("");
		  ///How to get all the data of drop down
		  
		  List<WebElement> op =sel.getOptions(); // Hash Table.
		  
		  ///how to do drag and drop
		  Actions act1 = new Actions(driver);
		  act1.dragAndDrop(driver.findElement(By.xpath("Source")), driver.findElement(By.xpath("Destination")));
		   
		  
		  ///how to get the coordinate of Window
		  
		  driver.manage().window().getPosition().getX();
		  driver.manage().window().getPosition().getY();
		  
		  Point position = driver.manage().window().getPosition();
		  position.getX();
		  position.getY();
		  
		  driver.navigate().forward();
		  driver.navigate().back();
		  
		  driver.getCurrentUrl();
		  driver.getTitle();
		  
		  
		  ///how you count similar object
		  
		  int size = driver.findElements(By.xpath("")).size();
		  
		  driver.findElement(By.xpath("@id[@name='Test']/following-sibling::td[2]"));
		  driver.findElement(By.xpath("@id[@name='Test']/Preceding-sibling::td[2]"));
		  driver.findElement(By.xpath("@id[@name='Test']/child:td[2]"));
		  
		  
		  ///Similar kind of elements
		  
		  driver.findElements(By.xpath("ElementName")).get(5);
		  
		  driver.findElement(By.xpath("")).isSelected();/// CheckBox Selection
		  
		  driver.findElement(By.xpath("")).isDisplayed();
		  driver.findElement(By.xpath("")).isEnabled();
		  
		  
		  ///how to execute javascript
		  JavascriptExecutor JavascriptExecutor= (JavascriptExecutor)driver;
		  
		  JavascriptExecutor.executeScript("return windows.length");
		  driver.manage().window().maximize();
		  driver.get("");
		  
		  
		  ///What is the difference between // and / . single is absolute path
		  
		  // how to get the attribute value of the webelement
		  
		 System.out.println(driver.findElement(By.xpath("")).getAttribute("name"));
		 
		 System.out.println(driver.findElement(By.xpath("")).getAttribute("name"));
		 
		 //How to press enter button
		 
	   driver.findElement(By.xpath("")).sendKeys(Keys.ENTER);
		 
		  
		  
		 
	
	 }
	
	

}
