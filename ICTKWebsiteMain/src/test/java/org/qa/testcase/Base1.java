package org.qa.testcase;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class Base1 {
	public static WebDriver driver;
	public static  Properties prop;
	

	@BeforeTest
	public void Onsetup() throws IOException, InterruptedException 
	
	{
		FileInputStream sfile=new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\resources\\config.properties");
		prop=new Properties();
		prop.load(sfile);
		driver=new ChromeDriver();
		
		//Thread.sleep(5000);
		
		driver.get(prop.getProperty("url"));
		
		driver.manage().window().maximize();
		
		
	}
	@AfterTest
	public void afterSetup()
	{
		driver.quit();
	}

}
