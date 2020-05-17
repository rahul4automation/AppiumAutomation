package tests;

import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class BaseClass {

	AppiumDriver<MobileElement> driver;

	
	
	
	@BeforeClass
	public void Setup()
	{
		try
		{
			DesiredCapabilities cap=new DesiredCapabilities();
			cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
			cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "6.0");
			cap.setCapability(MobileCapabilityType.UDID, "emulator-5554");
			cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Android Emulator");
			cap.setCapability(MobileCapabilityType.FULL_RESET, false);
			cap.setCapability(MobileCapabilityType.NO_RESET, true);
			cap.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 60);
			//cap.setCapability(MobileCapabilityType.APP,"C:\\Users\\RahKumar\\Desktop\\Remote\\Mg.apk");
			cap.setCapability("appPackage","com.aranoah.healthkart.plus");
			cap.setCapability("appActivity","com.aranoah.healthkart.plus.home.HomeActivity"); 
			URL url =new URL("http://127.0.0.1:4723/wd/hub");
			driver = new AppiumDriver<MobileElement> (url,cap);
			//driver = new AndroidDriver<MobileElement>(url,cap);
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			
		}
		catch(Exception exp)
		{
			System.out.println(exp.getCause());
			System.out.println(exp.getMessage());
			exp.printStackTrace();
		}	

	}

	@Test
	public void Setuptest()
	{
		System.out.println("Application is started ...");
	}

	@AfterClass
	public void CloseAppiumDriver()
	{
		
		driver.close();
	     System.out.println("Appliction Tested Sucessfully ..");
	}

}