package com.naukri.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class LandingSearchPage {
	
	AppiumDriver<MobileElement> driver;
	@AndroidFindBy(xpath="//android.widget.EditText[@text='Search']")
	private WebElement SearchButton;
	
	public LandingSearchPage(AppiumDriver<MobileElement> driver)
	{
		this.driver=driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver),this);
	}
	
	public void ClickOnSearchButton()
	{
		SearchButton.click();
		 
	}

}
