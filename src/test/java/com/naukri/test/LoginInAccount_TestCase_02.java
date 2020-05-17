package com.naukri.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.naukri.pages.LandingPage;
import com.naukri.pages.LoginPage;
import com.naukri.pages.StartJobSearch;

import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;

public class LoginInAccount_TestCase_02 extends BaseClass {
	
 @Test
 public void SignIn() 
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
	
		
		wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.widget.ImageButton[@content-desc=\"Navigate up\"]")));
		WebElement Hammer3=driver.findElement(By.xpath("//android.widget.ImageButton[@content-desc='Navigate up']"));
		Hammer3.click();
		
		ScrollSwap();
		StartJobSearch search =new StartJobSearch(driver);
		     search.ClickOnSettingsButton();
		
		
 }
		
		private void ScrollSwap()
		{
			Dimension dim =driver.manage().window().getSize();
			int height=dim.getHeight();
			int width=dim.getWidth();
			System.out.println(height);
			System.out.println(width);
			
			int startx=width/2;
			int endx=width/2;
			
			int starty=(int)(height*.20);
			int endy=(int)(height*.10);
			
			TouchAction action =new TouchAction(driver);
			action.press(PointOption.point(startx,starty)).moveTo(PointOption.point(endx,endy)).release().perform();
		}
		
	 
 }
 


