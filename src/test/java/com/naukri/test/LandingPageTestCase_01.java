package com.naukri.test;

import org.testng.annotations.Test;

import com.naukri.pages.LandingPage;
import com.naukri.pages.LoginPage;
import com.naukri.pages.StartJobSearch;

public class LandingPageTestCase_01 extends BaseClass {
	
	@Test(priority =2,enabled=false)
	public void LandingPageTest()
	{
		LandingPage ClickLogin =new LandingPage(driver);
		ClickLogin.ClickOnSearchButton();
		
		StartJobSearch test=new StartJobSearch(driver);
		test.ClickOnButton();
		test.SearchRecruiter();		
	}	
	@Test(priority=1)
	public void AccountTest()
	{
	    LoginPage clickT=new   LoginPage(driver);
	    clickT.ClickOnLoginBtn();
	    clickT.ClickOnEmailButton();
	    clickT.EnterEmailAddress("rahul4automation@gmail.com");
	    clickT.EnterPassword("Rahul@123");
	    clickT.ClickOnLoginBtn();
	    
	    	}
}
