package appiumtests;

import static org.junit.Assert.assertEquals;

import java.lang.management.ThreadInfo;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class HomeJinySalonDemo {
	public void LoginJiny() {
		
		 
		    
		  
	}

	public static void main(String[] args) throws InterruptedException,MalformedURLException {
		// TODO Auto-generated method stub
		
		DesiredCapabilities  capabilities = new DesiredCapabilities();
	    capabilities.setCapability("deviceName", "Pixel_XL_API_29");
	    capabilities.setCapability("udid", "emulator-5554");
	    capabilities.setCapability("platformVersion", "10");
	    capabilities.setCapability("platformName", "Android");
	    capabilities.setCapability("platformVersion", "10.0");
	    capabilities.setCapability("appPackage", "com.homejiny.app");
	    capabilities.setCapability("app", "C:\\Users\\pravallikan\\Downloads\\app.apk");
	    Thread.sleep(2000);
	    
	    AppiumDriver<MobileElement> driver= null;
	    try {
	    	driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
	    	Thread.sleep(2000);
	    }catch (MalformedURLException e){
	    	System.out.println(e.getMessage());
	    }
	    	MobileElement el0 = (MobileElement) driver.findElementByClassName("android.widget.LinearLayout");
	    		if(el0.isDisplayed()) {
	    			el0.click();
	    			Thread.sleep(2000);
	    			MobileElement el01 = (MobileElement) driver.findElementByXPath("//android.widget.TextView[contains(@text,'Welcomes you to the magical world of products and services')]");
	    			if (el01.isDisplayed())		{
	    				Thread.sleep(2000);
						MobileElement el1 = (MobileElement) driver.findElementById("com.homejiny.app:id/etPhoneNumber");
						if(el1.isEnabled()) {
							el1.sendKeys("1234567890");
						}
							MobileElement el2 = (MobileElement) driver.findElementById("com.homejiny.app:id/cbAgreeTerms");
							el2.click();
							if(el2.isSelected()) {
								System.out.println("checkbox is selected");
							}
								MobileElement el3 = (MobileElement) driver.findElementById("com.homejiny.app:id/btnLogin");
								el3.click();
								Thread.sleep(2000);
								MobileElement el4 = (MobileElement) driver.findElementByXPath("//android.widget.TextView[contains(@text,'Verify OTP')]");
								if(el4.isDisplayed()) {
									Thread.sleep(5000);
									MobileElement el5 = (MobileElement) driver.findElementByXPath("//*[contains(@resource-id,'etDigits')]");					
									el5.sendKeys("1234");
									Thread.sleep(5000);
								}
								MobileElement el6 = (MobileElement) driver.findElementById("com.homejiny.app:id/rdServices");
								if(el6.isDisplayed()){
									el6.click();
									Thread.sleep(2000);
									MobileElement el7 = (MobileElement) driver.findElementById("com.homejiny.app:id/etSearch");
									el7.sendKeys("Salon");
									Thread.sleep(2000);
									String strTemp = el7.getText();// this is not working
									assertEquals(strTemp,"Salon");
									if(strTemp =="Salon") {
										System.out.println("text entered successfully: "+strTemp);
									}else {
										System.out.println("text is not entered successfully");
									}
									MobileElement el8 = (MobileElement) driver.findElementById("com.homejiny.app:id/ivSearch");
									el8.click();
									Thread.sleep(2000);
									MobileElement el9 = (MobileElement) driver.findElementByXPath("//*[contains(@text,'Search')]");
									if(el9.isDisplayed()) {
										System.out.println("Search results are displayed");
										Thread.sleep(2000);
									}else {
										System.out.println("Failed to display search results");
									}
									MobileElement el10 = (MobileElement) driver.findElementByXPath("//*[contains(@text,'Men Hair Cut')]");
									el10.click();
									Thread.sleep(2000);
									MobileElement el11 = (MobileElement) driver.findElementByXPath("//*[contains(@text,'Service')]");
									if(el11.isDisplayed()) {
										System.out.println("men hair cut services tab is displayed");
									}else {
										System.out.println("men hair cut services tab is not displayed");
									}
									
								}
								
	    		}
	    		
	    		
	    		
	    }
	    
		
		
	
	}

}
