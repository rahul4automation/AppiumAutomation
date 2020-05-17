package tests;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;

import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;

public class ScrollElement 
{
	AndroidDriver<MobileElement> driver;
	public ScrollElement()
	{
		this.driver = driver ;
	}
	public MobileElement scrollToExactElement(MobileElement ele,String str) 
	{
		return ((AndroidElement) ele)
				.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView("
						+ "new UiSelector().text(\""+str+"\"));");

	}

	 public MobileElement ScrollToElement(MobileElement ele, String str) 
	 {
		 return ((AndroidElement) ele)
			.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView("
					+ "new UiSelector().textContains(\""+str+"\"));");
		 
	}
	 public void ScrollStepWise(MobileElement ele, int step) 
	 {
		 ((AndroidElement) ele)
			.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollForward("+step+"))");
	}
	 
		public void ScrollSwap()
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