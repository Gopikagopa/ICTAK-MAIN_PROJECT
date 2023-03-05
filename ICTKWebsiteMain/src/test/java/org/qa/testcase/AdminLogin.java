package org.qa.testcase;

import java.io.IOException;


import org.qa.pages.Dashboard;
import org.qa.pages.Login;
import org.qa.utilities.Screenshot;
import org.qa.utilities.Utilities;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AdminLogin extends Base1{
	
	
	Login log;
	Dashboard dash;
	Screenshot screen;
	
	@Test(priority=1)
	
	public void invalidusernameverification() throws InterruptedException, IOException
	{
		log=new Login(driver);
		log.clicklogin();
		String ename=Utilities.getcelldata(1, 0);
		String epass=Utilities.getcelldata1(1, 1);
		log.adminemail(ename);
		log.adminpass(epass);
		log.sigin();
		System.out.println("test successful with not clicking signin");
		driver.navigate().refresh();
		
		
	}
	@Test(priority=2)
	public void invalidpassverification() throws InterruptedException, IOException
	{
		log=new Login(driver);
		log.clicklogin();
		String enames=Utilities.getcelldata(2, 0);
		String epass=Utilities.getcelldata1(2, 1);
		log.adminemail(enames);
		log.adminpass(epass);
		log.sigin();
		System.out.println("succefullly showing message");
		driver.navigate().refresh();
		
	}
	@Test(priority=3)
	public void nullvalue_verification() throws InterruptedException
	{
		log=new Login(driver);
		log.clicklogin();
		String enames="";	
		String epass="";
		log.adminemail(enames);
		log.adminpass(epass);
		System.out.println("singin is disabled");
		driver.navigate().refresh();
		
	}
	
	@Test(priority=4)
	public void validdataverification() throws InterruptedException, IOException
	{
		log=new Login(driver);
		screen=new Screenshot();
		log.clicklogin();
		String enames=Utilities.getcelldata(0, 0);
		String epass=Utilities.getcelldata1(0, 1);

		log.adminemail(enames);
		log.adminpass(epass);
		Thread.sleep(3000);
		log.sigin();
		Thread.sleep(3000);
		screen.captureScreenshot(driver);
		Thread.sleep(3000);
		System.out.println("successfully loged in");
		
		String actualresult=driver.getTitle();
		String expectedresult="ICT Academy of Kerala";
		Assert.assertEquals(actualresult, expectedresult);
		
		
	}
	@Test(priority=5)
	
	public void dashboardcourseregistrationclick() throws InterruptedException
	{
		dash=new Dashboard(driver);
	
        dash.dashboardcourse();
        
        String coursedetails=dash.usercoursepage();
       
        Assert.assertEquals(coursedetails, "User Registration List");
        Thread.sleep(3000);
        dash.downloadcourse(); 
        Thread.sleep(3000);
        driver.navigate().refresh();
}
	
	@Test(priority=6)
	public void dashacadamicmemebershipclick() throws InterruptedException
	{
		dash=new Dashboard(driver);
		dash.acadamicmembership();	
		String acadamicmem=dash.accadamicmemebershipverify();
		Assert.assertEquals(acadamicmem, "Academic Membership");
		Thread.sleep(3000);
			dash.downloadacadamic(); 
			Thread.sleep(3000);
		        driver.navigate().refresh();
		        
		
	}
	
	@Test(priority=7)
	public void admincorporatemembership() throws InterruptedException
	{

		dash=new Dashboard(driver);
		dash.corporatemembership();
		Thread.sleep(3000);
		dash.downloadcorporate();
		Thread.sleep(3000);
		driver.navigate().refresh();
	}
	
	
	@Test(priority=8)
	public void partnershipcase() throws InterruptedException
	{
		dash=new Dashboard(driver);
		dash.partnershippage();
		String partnermem=dash.partnershipverify();
		Assert.assertEquals(partnermem, "Partnership Application");
		Thread.sleep(3000);
		dash.downloadpartnership();
		Thread.sleep(3000);
		driver.navigate().refresh();
		
	}
@Test(priority=9)
public void logoutpageclick() throws InterruptedException
{
	dash=new Dashboard(driver);
	Thread.sleep(3000);
	dash.logoutpage();
	
	
	
}
	
}