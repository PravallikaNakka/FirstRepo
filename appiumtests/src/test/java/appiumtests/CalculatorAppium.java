package appiumtests;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;

public class CalculatorAppium {

	public static void main(String[] args) throws MalformedURLException{
	
	    DesiredCapabilities  capabilities = new DesiredCapabilities();
	    capabilities.setCapability("deviceName", "Pixel_XL_API_29");
	    capabilities.setCapability("udid", "emulator-5554");
	    capabilities.setCapability("platformVersion", "10");
	    capabilities.setCapability("platformName", "Android");
	    capabilities.setCapability("platformVersion", "10.0");
	    capabilities.setCapability("browserName", "Chrome");
	  
	    capabilities.setCapability(AndroidMobileCapabilityType.CHROMEDRIVER_EXECUTABLE,"E:\\ChromeFolder\\chromedriver.exe");
	    
	  
	
	  
	    AppiumDriver<MobileElement> driver= null;
	    try {
	    	driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
	    }catch (MalformedURLException e){
	    	System.out.println(e.getMessage());
	    }
	    
	    driver.get("http://www.yahoo.com");
	    
	}
}

