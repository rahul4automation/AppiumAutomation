package com.naukri.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import io.appium.java_client.TouchAction;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.touch.offset.PointOption;

public class RemoveApps  extends BaseClassApps
{
	
	
	@Test
	public void removeApp()
	{
	  
	WebElement AppsLink=driver.findElement(By.xpath("//android.widget.TextView[@text='Apps']"));
	AppsLink.click();
 
	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);

	ScrollSwap();
	
	
	
	WebElement NaukriAppsLink=driver.findElement(By.xpath("//android.widget.TextView[@text='Naukri.com']"));
	NaukriAppsLink.click();
	
	
	WebElement UninstallLink=driver.findElement(By.xpath("//android.widget.Button[@text='Uninstall']"));
	UninstallLink.click();
	

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
		
		int starty=(int)(height*.90);
		int endy=(int)(height*.05);
		
		TouchAction action =new TouchAction(driver);
		action.press(PointOption.point(startx,starty)).moveTo(PointOption.point(endx,endy)).release().perform();
	}
}
