package com.naukri.test;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.naukri.pages.LandingPage;
import com.naukri.pages.LoginPage;

public class TestJaya extends BaseClass 
{
	
	@Test
	public void HandleGoit()
	{
		
		LandingPage ClickLogin=new LandingPage(driver);
		ClickLogin.ClickOnLoginButton();
		LoginPage login=new LoginPage(driver);
		login.ClickOnEmailButton();
		login.EnterEmailAddress("rahul4automation@gmail.com");
		login.EnterPassword("Rahul@123");
		login.ClickOnLoginBtn();
		WebDriverWait wait = new WebDriverWait(driver,20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.widget.TextView[@text='Last updated Today']")));
		WebDriverWait wait1 = new WebDriverWait(driver,20);
	    login.ClickOnGoItText();
	}
	

}
