import org.junit.Test;
import org.testng.Reporter;

public class ResultFile {
	
	
	@Test
	public void HTMLwithScshot() {

		String destDir = "E:\\ScreenShots\\";
		String destFile = System.currentTimeMillis()+".png";


		//FileUtils.copyFile("E:\\ScreenShots\\1506992770108.png", new File(destDir + "\\" + destFile));
		Reporter.log("<a href=/screenshots/" + destFile + "><img src=/screenshots/" + destFile + " style=width:100px;height:100px;/>" + destFile + "</a><br/>");

		}


}
