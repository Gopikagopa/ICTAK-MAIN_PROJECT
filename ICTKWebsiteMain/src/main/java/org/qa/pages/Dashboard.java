package org.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Dashboard 
{
	WebDriver driver;
	
	@FindBy(xpath="//a[@routerlink='/adminpage/registered-users']")
	private WebElement dashboardacadamic;
	
	
	@FindBy(xpath="//h3[text()='User Registration List']")
	private WebElement usercoursereg;
	
	
@FindBy(xpath="//i[text()='arrow_downward']")
private WebElement download;

@FindBy(xpath="//span[text()='Academic Membership']//parent::a")
private WebElement acadamicmembership;

@FindBy(xpath="//h3[text()='Academic Membership']")
private WebElement acadamicmembership_assert;

@FindBy(xpath="//i[text()='arrow_downward']")
private WebElement downloadacadamicpage;

@FindBy(xpath="//a[@routerlink='/adminpage/corporate']//parent::li")
private WebElement corporate;

@FindBy(xpath="//i[text()='arrow_downward']")
private WebElement downloadcorporatepage;

@FindBy(xpath="//a[@routerlink='/adminpage/partnership']//parent::li")
private WebElement partnership;
@FindBy(xpath="//h5[text()='Partnership Application']//parent::div")
private WebElement partnership_assert;
@FindBy(xpath="//i[text()='arrow_downward']")
private WebElement downloadpartner;

@FindBy(xpath="//span[text()='Admin']//parent::a")
private WebElement logoutclick;

@FindBy(xpath="//span[text()=' Logout ']//parent::a")
private WebElement logout;

public Dashboard(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
public void dashboardcourse() throws InterruptedException
{
	Thread.sleep(3000);
	dashboardacadamic.click();
	
	
	Thread.sleep(3000);
	
}
public String usercoursepage()
{
	String course=usercoursereg.getText();
	return course ;
	
}
public void downloadcourse() throws InterruptedException
{
	Thread.sleep(5000);
	download.click();
	Thread.sleep(3000);
}

public void acadamicmembership() throws InterruptedException
{
	 acadamicmembership.click();
	 Thread.sleep(3000);
		 
}
public String accadamicmemebershipverify()
{
	String acadamicvalid=acadamicmembership_assert.getText();
	return acadamicvalid ;
	
	
}
public void downloadacadamic() throws InterruptedException
{
	Thread.sleep(3000);
	downloadacadamicpage.click();
	Thread.sleep(3000);
	
}
public void corporatemembership() throws InterruptedException
{
	Thread.sleep(3000);
	corporate.click();
	Thread.sleep(3000);
	
}
public void downloadcorporate() throws InterruptedException
{
	Thread.sleep(3000);
	downloadcorporatepage.click();
	Thread.sleep(3000);
}
public void partnershippage() throws InterruptedException

{
	Thread.sleep(3000);
partnership.click();
Thread.sleep(3000);
}
public String partnershipverify()
{
	String partnershipverification=partnership_assert.getText();
	return partnershipverification;
	
}
public void downloadpartnership() throws InterruptedException
{
	Thread.sleep(3000);
	
	downloadpartner.click();
	
	Thread.sleep(3000);
}
public void logoutpage() throws InterruptedException
{
	Thread.sleep(3000);
	logoutclick.click();
	Thread.sleep(5000);
	logout.click();
	
	
	}

}
