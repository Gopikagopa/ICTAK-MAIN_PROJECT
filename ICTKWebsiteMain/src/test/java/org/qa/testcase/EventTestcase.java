package org.qa.testcase;

import java.io.IOException;

import org.qa.pages.Eventpage;
import org.qa.utilities.Eventutilities;
import org.qa.utilities.Screenshot;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class EventTestcase extends Base1 {

	
	
	Eventpage evnts,tech;
	Screenshot scrn,scrn1;
	
	@BeforeTest
	public void initial()
	{
		evnts=new Eventpage(driver);
		tech=new Eventpage(driver);
		
	}
	
	
	@Test(priority=1)	
		public void event_clicktab() throws InterruptedException
		{
			
		evnts.eventclick();
		
	}
	
	@Test(priority=2)
	public void icset_page_verification() throws InterruptedException
	{
		
		evnts.icsetpage_click();
	}
	@Test(priority=3)
	public void icset_applynow() throws InterruptedException 
	{
		
		
		evnts.icset_applyclick();
	}
	@Test(priority=4)
	public void icseteventNullregister() throws IOException, InterruptedException
	{
		
		String icsetname="";
		String icsetmail="";
		String icsetno="";
		
        evnts.eventnameicset(icsetname);
		evnts.eventmailicset(icsetmail);
		evnts.eventnumbr(icsetno);
		boolean bool1=evnts.buttonenabled();
		Assert.assertEquals(bool1,false);
		
		Thread.sleep(3000);
		
		
			
	}
	
	@Test(priority=5)
	public void icseteventregister() throws IOException, InterruptedException
	{
	    
scrn=new Screenshot();
		String icsetname=Eventutilities.getcelldataevent(0, 0);
		String icsetmail=Eventutilities.getcelldataevent(0, 1);
		String icsetno=Eventutilities.getcelldataevent1(0, 2);
		
        evnts.eventnameicset(icsetname);
		evnts.eventmailicset(icsetmail);
		evnts.eventnumbr(icsetno);
		evnts.icseteventname();
		evnts.icseteventamount();
		Thread.sleep(2000);
		scrn.captureScreenshot(driver);
		Thread.sleep(3000);
		evnts.registericsetpage();
		Thread.sleep(3000);
		System.out.println("test successful with  clicking register");
		String alertmsg=driver.switchTo().alert().getText();
		Assert.assertEquals(alertmsg,"Registration Successfull");
		driver.switchTo().alert().dismiss();
			
		
	}
	
	
	@Test(priority=6)
	public void techonclick() throws InterruptedException
	{
		
		tech.techalthonpage_click();
	}
	
	@Test(priority=7)
	public void techonpage() throws InterruptedException
	{
		
	
	
	 tech.techalthonclick();
	 String actual=tech.tecpageverify();
	 
	 Assert.assertEquals(actual, "Techathlon");
	 
	}
	@Test(priority=8)
public void techonapply() throws InterruptedException
{
		
		
	tech.techalthonapplypage();
	
}
	@Test(priority=9)

	public void tecpageNullregistration() throws IOException, InterruptedException
	{
		
		String tecaname="";
		String tecamail="";
		String tecano="";
		
        tech.techalthonname(tecaname);
		tech.techalthonmail(tecamail);
		tech.tecalthonnum(tecano);
		boolean bool2=tech.buttonenabled();
		Assert.assertEquals(bool2, false);
		System.out.println("test successful with  clicking register");
		
	}
	@Test(priority=10)

	public void tecpageregistration() throws IOException, InterruptedException
	{
		scrn1=new Screenshot();
		
		
		String tecaname=Eventutilities.getcelldataevent(2, 0);
		String tecamail=Eventutilities.getcelldataevent(2, 1);
		String tecano=Eventutilities.getcelldataevent1(2, 2);
        tech.techalthonname(tecaname);
		tech.techalthonmail(tecamail);
		tech.tecalthonnum(tecano);
		scrn1.captureScreenshot(driver);
				Thread.sleep(3000);
		tech.tecverification();
		Thread.sleep(3000);
		System.out.println("test successful with  clicking register");
		String alertmsg=driver.switchTo().alert().getText();
		Assert.assertEquals(alertmsg,"Registration Successfull");
		driver.switchTo().alert().dismiss();
		driver.navigate().back();
		driver.navigate().back();
	}
	
	
}

