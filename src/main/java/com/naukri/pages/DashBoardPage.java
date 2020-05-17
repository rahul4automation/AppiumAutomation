package com.naukri.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class DashBoardPage {
	
	AppiumDriver<MobileElement> driver;
	
	
	@AndroidFindBy(xpath="//android.widget.EditText[@resource-id='naukriApp.appModules.login:id/et_skills']")
	private WebElement Login;
	
	@AndroidFindBy(xpath="//android.widget.EditText[@text='Location']")
	private WebElement RegisterFree;
	
	@AndroidFindBy(xpath="//android.widget.Button[@text='SEARCH JOBS']")
	private WebElement SearchJobs;
	
	public DashBoardPage(AppiumDriver<MobileElement> driver)
	{
		this.driver=driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver),this);
	}
	
	
	public void Login()
	{
		Login.click();
	}
	
	public void RegisterFree()
	{
		RegisterFree.click();
	}
	
	public void SearchJobs()
	{
		SearchJobs.click();
	}
}
