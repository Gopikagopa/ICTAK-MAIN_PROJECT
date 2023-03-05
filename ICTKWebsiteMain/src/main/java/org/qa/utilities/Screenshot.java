package org.qa.utilities;

import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Screenshot {
	

public  void captureScreenshot(WebDriver driver) {
		
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try {
			
			FileUtils.copyFile(src, new File(System.getProperty("user.dir")+"\\Screenshot\\ICTAK.png"));
			System.out.println("Screenshot Captured");
	   } catch (IOException e) {
	     System.out.println("Unable to Capture Screenshot" + e.getMessage());
	 }
		
	}
		
	
	
}
