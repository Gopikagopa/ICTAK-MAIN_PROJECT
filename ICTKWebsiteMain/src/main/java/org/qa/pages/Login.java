package org.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {
	WebDriver driver;
	
@FindBy(xpath="//i[text()='fingerprint']//parent::a")
private WebElement login;

	@FindBy(xpath="//input[@placeholder='Enter Your Email']")
	private WebElement loginemail;

	@FindBy(xpath="//input[@placeholder='•••••••••••••']")
	private WebElement loginpass;
	
	@FindBy(xpath="//button[text()=' Sign in ']")
	private WebElement siginpas;
	
	/*
	@FindBy(xpath="//span[text()='Course Registration']//parent::a")	
	private WebElement register;
	
	*/

public Login(WebDriver driver)
{
	this.driver=driver;
	PageFactory.initElements(driver, this);
	
}


public void clicklogin() throws InterruptedException
{
	Thread.sleep(5000);
	login.click();
	Thread.sleep(5000);
}
	
	public void adminemail(String email)
	{
		
		loginemail.sendKeys(email);
	}
	
	public void adminpass( String epass)
	{
		
		loginpass.sendKeys(epass);
		
	}
public void sigin() throws InterruptedException
{
	
	siginpas.click();
	
	Thread.sleep(5000);
}

	
}

