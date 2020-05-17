package com.naukri.test;

import org.testng.annotations.Test;

import com.naukri.pages.DashBoardPage;
import com.naukri.pages.LandingPage;
import com.naukri.pages.StartJobSearch;

public class DashBoardPageTC extends BaseClass
{


@Test
public void TestD()
{
	LandingPage page=new LandingPage(driver);

	page.ClickOnSearchButton();
	
	StartJobSearch c=new StartJobSearch(driver);
	c.ClickOnButton();
	c.SearchRecruiter();
	
			
}
}
