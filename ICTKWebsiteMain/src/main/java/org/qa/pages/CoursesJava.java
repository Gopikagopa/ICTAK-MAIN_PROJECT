package org.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CoursesJava {

	WebDriver driver;
	
	@FindBy(xpath="//a[@id=\"dropdownMenuBlocks\"]")
	private WebElement courses5;
	
	@FindBy(xpath="(//span[text()='Full Stack'])[1]")
	private WebElement javaclick;
	
	@FindBy(xpath="(//button[@type='button'])[2]")
	private WebElement applyn;
	
	@FindBy(xpath="//input[@placeholder='Name']")
	private WebElement name;
	
	@FindBy(xpath="//input[@placeholder='Email']")
	private WebElement emaildata;
	
	@FindBy(xpath="//input[@placeholder='Number']")
	private WebElement numb;
	@FindBy(xpath="//input[@name='courseTitle']")
	private WebElement coursename;
	
	@FindBy(xpath="//input[@name='courseAmount']")
	private WebElement amnt;
	
	@FindBy(xpath="//button[text()='Register']")
	private WebElement regis;
	
	@FindBy(xpath="(//div[@class='input-group input-group-outline mb-3'])[4]")
	private WebElement coursename4;
	
	@FindBy(xpath="//input[@type='number']")
	private WebElement feeamnt;
	
	@FindBy(xpath="(//button[@type='submit'])[2]")
	private WebElement registerbutton;
	
	
	
	
	public CoursesJava(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	public void javacourse() throws InterruptedException
	{
		Thread.sleep(2000);
		courses5.click();
		Thread.sleep(5000);
	}

public void javaclick() throws InterruptedException
{
	javaclick.click();	
}

public void applyclick() throws InterruptedException
{
	Thread.sleep(3000);
	applyn.click();
	Thread.sleep(3000);
	
}
public void nameverification(String sendname) throws InterruptedException

{
	Thread.sleep(3000);
	 name.sendKeys(sendname);
	 
	
}
public void emailverification(String email) throws InterruptedException
{
	Thread.sleep(3000);
	 emaildata.sendKeys(email);
	 
}

public void numverification(String numbr) throws InterruptedException
{
	Thread.sleep(3000);
	 numb.sendKeys(numbr);
}

public boolean isEnabled()
{
	boolean button=registerbutton.isEnabled();
	return button;
	
}
public void registercourse() throws InterruptedException
{

     Thread.sleep(2000);
     
     registerbutton.click();
     Thread.sleep(5000); 
	     
	
}


}


