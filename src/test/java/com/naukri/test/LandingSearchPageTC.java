package com.naukri.test;

import org.testng.annotations.Test;

import com.naukri.pages.LandingPage;
import com.naukri.pages.LandingSearchPage;

public class LandingSearchPageTC extends BaseClass {
	

	@Test
	public void LandingPageTest()
	{
		LandingSearchPage ClickSearch=new LandingSearchPage(driver);
		ClickSearch.ClickOnSearchButton();
		
	}
	
	@Test
	public void AfterSearch()
	{
		
	}

}
