package MGpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import tests.BaseClass;

public class HomePage_1mg 
{
   static  AppiumDriver<MobileElement> driver;
	//private AndroidDriver<AndroidElement> driver;
	
	WebDriverWait wait;
	

	public HomePage_1mg() {
		super();
		this.driver = driver;
		PageFactory.initElements(driver,this);
		wait = new WebDriverWait(driver, 30);

	}
	


	@AndroidFindBy(xpath = "//android.widget.ImageButton[@content-desc=\"Navigate up\"]")
	private AndroidElement Hammer_1MgPage;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='rahu kumar']")
	
	private AndroidElement User_Name;
	
	
	
	
	public void clickOnHammerButton(AndroidDriver<AndroidElement> driver) {
		wait.until(ExpectedConditions.visibilityOf(Hammer_1MgPage));
		Hammer_1MgPage.click();
		
	}
	

}
