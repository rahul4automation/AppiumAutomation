package com.naukri.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.touch.offset.PointOption;

public class LoginPage {

	AppiumDriver<MobileElement> driver;


	@AndroidFindBy(xpath="//android.widget.RadioButton[@text='EMAIL']")
	private WebElement EmailButton;



	@AndroidFindBy(xpath="//android.widget.Button[@text='USERNAME']")
	private WebElement UsernameButton;

	@AndroidFindBy(xpath="//android.widget.EditText[@text='Email Address']")
	private WebElement EmailAddressText;


	@AndroidFindBy(xpath="//android.widget.EditText[@resource-id='naukriApp.appModules.login:id/et_email']")
	private WebElement ClickAfterSendEmailAddress;
	
	
	@AndroidFindBy(xpath="//android.widget.EditText[@text='Password']")
	private WebElement PasswordText;


	@AndroidFindBy(xpath="//android.widget.TextView[@text='Forgot Password']")
	private WebElement ForgotPassword;

	
	
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='GOT IT']")
	private WebElement GoiTText;
	
	
	

	
	@AndroidFindBy(xpath="//android.widget.Button[@text='LOGIN']")
	private WebElement LoginBtn;
	
	
	public LoginPage(AppiumDriver<MobileElement> driver)
	{
		this.driver=driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver),this);
	}



	public void ClickOnEmailButton()
	{
		EmailButton.click();

	}

	public void ClickOnUsernameButton()
	{
		UsernameButton.click();
	}


	public void EnterEmailAddress(String EmailAddress)
	{
		EmailAddressText.sendKeys(EmailAddress);
		
	}
	public void ClickAfterSendEmailAdress()
	{
		ClickAfterSendEmailAddress.click();
		
	}

	

	public void EnterPassword(String Password)
	{
		PasswordText.sendKeys(Password);
	}


	public void ClickOnForgotPassword()
	{
		ForgotPassword.click();
	}
	
	public void ClickOnLoginBtn()
	{
		WebDriverWait wait = new WebDriverWait(driver,20);
	
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.widget.Button[@text='LOGIN']")));
		LoginBtn.click();
		
	}
	
	
	public void ClickOnGoItText()
	{
		GoiTText.click();
	}
	
	

}
