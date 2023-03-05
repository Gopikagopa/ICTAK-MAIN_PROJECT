package org.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Eventpage {
	
	WebDriver driver;
	
	@FindBy(xpath="(//a[@id=\"dropdownMenuDocs\"])[2]")
	private WebElement ICSET;
	
	@FindBy(xpath="//*[@id=\"navigation\"]/ul/li[5]/ul/div[1]/ul/li[1]/a")
	private WebElement ICSETpage;
	
	
	@FindBy(xpath="//button[text()=' Apply Now ']")
	private WebElement ICSET_apply;
	
	@FindBy(xpath="//input[@placeholder='Name']")
	private WebElement icsetname;
	
	
	@FindBy(xpath="//input[@placeholder='Email']")
	private WebElement icsetemail;
	
	@FindBy(xpath="//input[@placeholder='Number']")
	private WebElement icsetnumb;
	
	@FindBy(xpath="//input[@name='eventAmount']")
	private WebElement eventname;
	
	@FindBy(xpath="//input[@type='number']")
	private WebElement amnt;
	
	
	
	@FindBy(xpath="//button[text()='Register']")
	private WebElement registerbutton;
	

	@FindBy(xpath="(//a[@id=\"dropdownMenuDocs\"])[2]")
	private WebElement techalthon;
	

	@FindBy(xpath="//h6[text()=' Techathlon '][1]")
	private WebElement tecalthonpage;
	
	@FindBy(xpath="//h2[text()='Techathlon']")
	private WebElement pageverify;
	
	
	@FindBy(xpath="//button[text()=' Apply Now ']")
	private WebElement tecalthonapply;
	
	
	@FindBy(xpath="//input[@placeholder='Name']")
	private WebElement tecname;
	
	@FindBy(xpath="//input[@placeholder='Email']")
	private WebElement tecmail;
	
	@FindBy(xpath="//input[@placeholder='Number']")
	private WebElement tecnum;
	
	@FindBy(xpath="//button[text()='Register']")
	private WebElement tecregister;
	
	
	public Eventpage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	public void eventclick() throws InterruptedException
	{
		ICSET.click();
		Thread.sleep(3000);
	}
	
	public void icsetpage_click() throws InterruptedException
	{
		Thread.sleep(3000);
		
		ICSETpage.click();
		
		
	}
	public void icset_applyclick() throws InterruptedException
	{
		Thread.sleep(3000);
		ICSET_apply.click();
		Thread.sleep(3000);
		
		
	}


public void eventnameicset(String name) throws InterruptedException
{
	
	Thread.sleep(3000);
     icsetname.sendKeys(name);
     
     Thread.sleep(3000);
}
public void eventmailicset(String emailicst) throws InterruptedException
{
	
     Thread.sleep(3000);
     icsetemail.sendKeys(emailicst);
     Thread.sleep(3000);
}
public void eventnumbr(String numbricst) throws InterruptedException

     {
	
	Thread.sleep(3000);
	icsetnumb.sendKeys(numbricst);
	Thread.sleep(3000);
	
     }
public boolean icseteventname() throws InterruptedException
{
	Thread.sleep(3000);
	
	return eventname.isDisplayed();   
}


public boolean icseteventamount() throws InterruptedException
{
	Thread.sleep(3000);
	return amnt.isDisplayed();
	
}
public boolean buttonenabled()
{
	boolean bool=registerbutton.isEnabled();
	return bool;

}
public void registericsetpage() throws InterruptedException
{
	Thread.sleep(3000);
	
	registerbutton.click();
	
	
}

public void techalthonpage_click() throws InterruptedException
{
	Thread.sleep(3000);
	
	techalthon.click();	
	
}

public void techalthonclick() throws InterruptedException
{
	
	tecalthonpage.click();
	Thread.sleep(3000);
}

	
	public String tecpageverify()
	{
		String check=pageverify.getText();
		return check;
		
	}


public void techalthonapplypage() throws InterruptedException
{
	Thread.sleep(3000);
	tecalthonapply.click();
	Thread.sleep(3000);
	
}

public void techalthonname(String tname) throws InterruptedException
{
	Thread.sleep(3000);
	tecname.sendKeys(tname);
}

public void techalthonmail(String temail) throws InterruptedException
{
	Thread.sleep(3000);
	tecmail.sendKeys(temail);
	
}

public void tecalthonnum(String tnum) throws InterruptedException
{
	Thread.sleep(3000);
	tecnum.sendKeys(tnum);
}

public boolean tecverification() throws InterruptedException
{
	Thread.sleep(3000);
	boolean bool1=tecregister.isEnabled();
	Thread.sleep(5000);
	registerbutton.click();
	return bool1;
	
	
	
}


}


