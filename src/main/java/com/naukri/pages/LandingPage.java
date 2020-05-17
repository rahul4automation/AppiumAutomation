package com.naukri.pages;



import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.touch.offset.PointOption;

public class LandingPage {
	
        AppiumDriver<MobileElement> driver;
        
     
	
	@AndroidFindBy(xpath="//android.widget.EditText[@text='Search']")
	private WebElement SearchButton;
	
	
	
	
	@AndroidFindBy(xpath="//android.widget.Button[@text='REGISTER FREE']")
			private WebElement RegisterFreeLandingButton;
	
	
	
	@AndroidFindBy(xpath="//android.widget.Button[@text='LOGIN']")
	private WebElement LoginLandingButton;
	
	
	
	public LandingPage(AppiumDriver<MobileElement> driver)
	{
		
		this.driver=driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver),this);
	}
	
	
	
	public void ClickOnSearchButton()
	{
		SearchButton.click();
		 
	}
	
	public void ClickOnLoginButton()
	{
		LoginLandingButton.click();
		 
	}
	
	public void ClickOnRegisterButton()
	{
		RegisterFreeLandingButton.click();
			
	}
	
	
	public void GettextLogin()
	{
		LoginLandingButton.getText();
	}
	
	
	
	public void GettextofRegisterButton()
	{
		RegisterFreeLandingButton.getText();
	}
	
	

}
