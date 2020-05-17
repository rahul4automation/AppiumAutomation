package com.naukri.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class StartJobSearch {
	
	AppiumDriver<MobileElement> driver;
	@AndroidFindBy(xpath="//android.widget.ImageButton[@content-desc='Navigate up']")
	private WebElement DashBoard;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Search Recruiters']")
	private WebElement SearcRec;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Settings']")
	private WebElement ClickOnsetting;
	
	public StartJobSearch(AppiumDriver<MobileElement> driver)
	{
		this.driver=driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver),this);
	}
	
	public void ClickOnButton()
	{
		DashBoard.click();
	}
	
	public void SearchRecruiter()
	{
		SearcRec.click();
	}
	
	public void ClickOnSettingsButton()
	{
		
		ClickOnsetting.click();
	}
	

}
