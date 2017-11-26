

import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.apache.xerces.impl.io.MalformedByteSequenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;


import com.kenai.jffi.Platform;

public class SeleniumGridParallel {
	
	WebDriver driver1;
	Platform Win10;
	String NodeURL;
	
	
	
	@Parameters({"portNO","appURL"})
	@BeforeMethod()
	public void setUp(String portNO, String appURL) throws InterruptedException, NullPointerException,  MalformedByteSequenceException
	{
		if(portNO.equals("4545"))
		{
			NodeURL = "http://192.168.0.105:4545/wd/hub";
			System.out.println("FirefoxBrowser Environment Created");
			DesiredCapabilities cap = DesiredCapabilities.firefox();
			cap.setBrowserName("firefox");
			cap.setPlatform(org.openqa.selenium.Platform.MAC);
			
			driver1= new RemoteWebDriver(cap);
			driver1.manage().window().maximize();
			driver1.navigate().to(appURL);
			driver1.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
		}
		else
			if(portNO.equalsIgnoreCase("4546"))
			{
				NodeURL = "http://192.168.0.105:4546/wd/hub";
				System.out.println("Chrome Browser Environment Created");
				DesiredCapabilities cap = DesiredCapabilities.chrome();
				cap.setBrowserName("chrome");
				cap.setPlatform(org.openqa.selenium.Platform.MAC);
				
				driver1= new RemoteWebDriver(cap);
				driver1.manage().window().maximize();
				driver1.navigate().to(appURL);
				driver1.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			}
		
	}

}
