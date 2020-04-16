package appiumtests;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;

public class HomeCleaningService {
	public AppiumDriver<MobileElement> driver= null;
	
	public void Appinvoke() throws InterruptedException,MalformedURLException {
		DesiredCapabilities  capabilities = new DesiredCapabilities();
	    capabilities.setCapability("deviceName", "Pixel_XL_API_29");
	    capabilities.setCapability("udid", "emulator-5554");
	    capabilities.setCapability("platformVersion", "10");
	    capabilities.setCapability("platformName", "Android");
	    capabilities.setCapability("platformVersion", "10.0");
	    capabilities.setCapability("appPackage", "com.homejiny.app");
	    capabilities.setCapability("app", "C:\\Users\\pravallikan\\Downloads\\app.apk");
	    Thread.sleep(2000);
	    
	    
	    try {
	    	driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
	    	Thread.sleep(2000);
	    }catch (MalformedURLException e){
	    	System.out.println(e.getMessage());
	    }
	}
	
	public void SignInHomeJiny(String strPhonenum) throws InterruptedException{
		
			MobileElement el0 = (MobileElement) driver.findElementByClassName("android.widget.LinearLayout");
		if(el0.isDisplayed()) {
			el0.click();
			Thread.sleep(2000);
			MobileElement el01 = (MobileElement) driver.findElementByXPath("//android.widget.TextView[contains(@text,'Welcomes you to the magical world of products and services')]");
			if (el01.isDisplayed()){
				Thread.sleep(2000);
				MobileElement el1 = (MobileElement) driver.findElementById("com.homejiny.app:id/etPhoneNumber");
				if(el1.isEnabled()) {
					el1.sendKeys(strPhonenum);
					MobileElement el2 = (MobileElement) driver.findElementById("com.homejiny.app:id/cbAgreeTerms");
					el2.click();
					Thread.sleep(4000);
					String stat= el2.getAttribute("checked");
					if (stat.equalsIgnoreCase("true")) { 
						System.out.println("checkbox is selected");
						MobileElement el3 = (MobileElement) driver.findElementById("com.homejiny.app:id/btnLogin"); 
						el3.click();
						Thread.sleep(4000);
						 
					}else {
						System.out.println("check box is not selected");
					}
					 
					
				}else {
					System.out.println("Element is not found to enter mobile number");
				}
			}else {
				System.out.println("Magic world of products and services is not available");
			}
		}else {
			System.out.println("Home page not available");
		}
	
			
}
	
public void VerifyOTPandHomepage(String strOTP) throws InterruptedException {
		
		MobileElement el4 = (MobileElement) driver.findElementByXPath("//android.widget.TextView[contains(@text,'Verify OTP')]");
		if(el4.isDisplayed()) {
			Thread.sleep(5000);
			MobileElement el5 = (MobileElement) driver.findElementByXPath("//*[contains(@resource-id,'etDigits')]");					
			el5.sendKeys("1234");
			Thread.sleep(5000);
			MobileElement el6 = (MobileElement) driver.findElementById("com.homejiny.app:id/rdServices");
			if(el6.isDisplayed()){
				el6.click();
				Thread.sleep(2000);
				System.out.println("Services Tab is selected ");
			}else {
				System.out.println("Services Tab is not selected");
			}
		}else {
			System.out.println("OTP page is not found");
		}
}	
	
	
		}



