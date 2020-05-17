package tests;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;

public class SearchDoctorsTest extends BaseClass
{

	@Test(priority=1)
	public void BookAppoinment() throws InterruptedException
	{
		WebElement SelectState=driver.findElement(By.xpath("//android.widget.TextView[@resource-id='com.aranoah.healthkart.plus:id/title']"));
		SelectState.click();

		WebElement ClickOnState=driver.findElement(By.xpath("//android.widget.TextView[@text='Bengaluru']"));
		ClickOnState.click();

		WebElement ClickOnAppointment=driver.findElement(By.xpath("//android.widget.TextView[@text='Appointments']"));
		ClickOnAppointment.click();

		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

		WebElement SearchDocPage=driver.findElement(By.xpath("//android.widget.TextView[@text='Search Doctors']"));
		String DoctorPage = SearchDocPage.getText();
		Assert.assertEquals("Search Doctors", DoctorPage);

		WebElement DoctorSpecialist=driver.findElement(By.xpath("//android.widget.TextView[@text='Physician']"));
		DoctorSpecialist.click();

		//Click on Book booton on Appointemnt Doctor Page 

		List<MobileElement> BookButton=driver.findElements(By.xpath("//android.widget.Button[@text='BOOK']"));
		System.out.println(BookButton.size());
		BookButton.get(0).click();

		// Click on calender Link 

		WebElement AppointmentCalender=driver.findElement(By.xpath("//android.widget.TextView[@text='Schedule Date']"));
		AppointmentCalender.click();

		//Handle Calender Date Picker 

		// we can use "April 2020"

		List<MobileElement> HandleCalDatePicker =driver.findElements(By.xpath("//android.view.View[contains(@content-desc, \"2020\")]"));
		int totalData=HandleCalDatePicker.size();

		System.out.println(totalData);

		for(int i=0;i<totalData;i++)
		{
			String date=HandleCalDatePicker.get(i).getText();

			if(date.equalsIgnoreCase("22"))
			{
				HandleCalDatePicker.get(i).click();

			}
		}
		//android.widget.Button[@text='OK']
		WebElement OkButtonOnCalender=driver.findElement(By.xpath("//android.widget.Button[@text='OK']"));
		OkButtonOnCalender.click();


		WebElement ContinueButton=driver.findElement(By.xpath("//android.widget.Button[@text='CONTINUE']"));
		ContinueButton.click();


		WebElement ClickOn_MorePa=driver.findElement(By.xpath("//android.widget.TextView[@text='More Patients']"));
		ClickOn_MorePa.click();
		 Thread.sleep(5000);
		 ScrollSwap();
		WebElement ClickOnPatient_s=driver.findElement(By.xpath("//android.widget.TextView[@text='s']"));
		ClickOnPatient_s.click();


		WebElement ClickOnContinue=driver.findElement(By.xpath("//android.widget.Button[@text='CONTINUE']"));
		ClickOnContinue.click();

		WebElement BookAppointmentButton=driver.findElement(By.xpath("//android.widget.Button[@text='BOOK APPOINTMENT']"));
		BookAppointmentButton.click();

		Thread.sleep(5000);
		
		WebElement GoTo_HomeButton=driver.findElement(By.xpath("//android.widget.Button[@text='Home']"));
		GoTo_HomeButton.click();


	}


	@Test(enabled=false)
	public void VerifyPatientBookAppointmentDetails()
	{
		WebElement HammerLink=driver.findElement(By.xpath("//android.widget.ImageButton[@content-desc=\"Navigate up\"]"));
		HammerLink.click();
		ScrollSwap();

		WebElement AppointmentPage=driver.findElement(By.xpath("//android.widget.CheckedTextView[@text='My Appointments']"));
		AppointmentPage.click();

		WebElement VerifyAppointmentRequest=driver.findElement(By.xpath("//android.widget.TextView[@text='Appointment Requested']"));
		VerifyAppointmentRequest.getText();
		Assert.assertEquals("Appointment Requested", VerifyAppointmentRequest);


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
