package tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import MGpages.HomePage_1mg;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class RegressionTest extends BaseClass {

	@Test
	public void TestHammerPage() throws InterruptedException
	{

		WebElement HammerLink=driver.findElement(By.xpath("//android.widget.ImageButton[@content-desc=\"Navigate up\"]"));
		HammerLink.click();
		WebElement Username_Id=driver.findElement(By.xpath("//android.widget.TextView[@text='rahu kumar']"));
		String ActualUsername = Username_Id.getText();
		Assert.assertEquals("rahu kumar", ActualUsername);

		WebElement Mail_Id=driver.findElement(By.xpath("//android.widget.TextView[@text='rahulece77@gmail.com']"));
		String MailVerify = Mail_Id.getText();
		Assert.assertEquals("rahulece77@gmail.com", MailVerify);

		WebElement My_OrderPage=driver.findElement(By.xpath("//android.widget.TextView[@text='My Orders']"));  
		My_OrderPage.click();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		WebElement My_ReOrder=driver.findElement(By.xpath("//android.widget.TextView[@text='Reorder']"));
		My_ReOrder.click();
		
		WebElement VerifyShippingChargesLink=driver.findElement(By.xpath("//android.widget.TextView[@text='Shipping Charges']"));
		String ShippingCharge_Link= VerifyShippingChargesLink.getText();
		Assert.assertEquals("Shipping Charges", ShippingCharge_Link);
		
		//WebElement ADD_to_Paid=driver.findElementById("com.aranoah.healthkart.plus:id/cart_quantity");
		//String Verify_AddtoPaid = Mail_Id.getText();
		//Assert.assertEquals("To be paid", Verify_AddtoPaid);
	
		Thread.sleep(5000);
		WebElement CheckoutPage=driver.findElement(By.xpath("//android.widget.TextView[@text='CHECKOUT']"));
		String Verify_Checkout = Mail_Id.getText();
		Assert.assertEquals("", Verify_Checkout);
		
		WebElement Back_Button=driver.findElement(By.xpath("//android.widget.ImageButton[@content-desc=\"Navigate up\"]"));
		Back_Button.click();
		
		
		

		
	}









}
