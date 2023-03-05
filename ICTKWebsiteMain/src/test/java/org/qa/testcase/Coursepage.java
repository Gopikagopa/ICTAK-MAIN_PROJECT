package org.qa.testcase;

import java.io.IOException;


import org.qa.pages.CoursesJava;
import org.qa.utilities.Coursejavautilities;
import org.qa.utilities.Screenshot;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Coursepage extends Base1{

	
	CoursesJava java;
	Screenshot scren;
	
	@BeforeTest
	public void javacase()
	
	{
		java=new CoursesJava(driver);
		
	}
	
	@Test(priority=1)
	public void Javacourse_visible() throws InterruptedException
	{
		
		java.javacourse();
	}
	
	
	@Test(priority=2)
	public void javaclick_visible() throws InterruptedException
	{
		
		
		java.javaclick();
		
	}
	
	@Test(priority=3)
	public void clickapply_now() throws InterruptedException
	{
     
     java.applyclick();
     
     
	}
@Test(priority=4)
	
	public void registrationwithNullvalues() throws IOException, InterruptedException
	{
		
		
		
		String candidatename="";				
		String candidatemail="";
		String candidateno="";
        java.nameverification(candidatename);
		java.emailverification(candidatemail);
		java.numverification(candidateno);
		
		boolean bool1=java.isEnabled();
		Assert.assertEquals(bool1,false);
		
	}
	
	@Test(priority=5)
	public void javacourseregistration() throws InterruptedException, IOException
	{

		scren=new Screenshot();
		
			String candidatename=Coursejavautilities.getcelldatacourse(0, 0);
			
			String candidatemail=Coursejavautilities.getcelldatacourse(0, 1);
			
			
			String candidateno=Coursejavautilities.getcelldatacourse1(0, 2);
			java.nameverification(candidatename);
			
			java.emailverification(candidatemail);
			
			java.numverification(candidateno);
			scren.captureScreenshot(driver);
			Thread.sleep(3000);
			java.registercourse();
			Thread.sleep(3000);
			System.out.println("test successful with  clicking register");
			String alertmsg=driver.switchTo().alert().getText();
			Assert.assertEquals(alertmsg,"Registration Successfull");
			driver.switchTo().alert().dismiss();
			driver.navigate().refresh();
			driver.navigate().back();
			
	}
	

}