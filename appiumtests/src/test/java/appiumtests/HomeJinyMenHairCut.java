package appiumtests;

import java.awt.Dimension;
import java.net.MalformedURLException;
import java.time.Duration;


import org.openqa.selenium.interactions.touch.TouchActions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;

public class HomeJinyMenHairCut extends HomeCleaningService {
	  
	public void scroll() {
		org.openqa.selenium.Dimension size = driver.manage().window().getSize();

	        int percentage = size.width / 2;
	        int startingPoint = (int) ((double) size.height * 0.8D);
	        int endingPoint = (int) ((double) size.height * 0.2D);
	        (new TouchAction(driver)).press(PointOption.point(percentage, startingPoint))
	        .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(2L)))
	        .moveTo(PointOption.point(percentage, endingPoint))
	        .release()
	        .perform();
	 }
	 
	public void HomePageSelections() throws InterruptedException{
		
		
		MobileElement el7 = (MobileElement) driver.findElementByXPath("//*[contains(@text,'Home Cleaning')]");
			el7.click();
			Thread.sleep(2000);
		MobileElement el8 = (MobileElement) driver.findElementByXPath("//*[contains(@text,'Category')]");
		if(el8.isDisplayed()) {
			System.out.println("Category screen is displayed");
			MobileElement el9 = (MobileElement) driver.findElementByXPath("//*[contains(@text,'Pest Control')]");
			el9.click();
			Thread.sleep(1500);
			MobileElement el10 = (MobileElement) driver.findElementByXPath("//*[contains(@text,'Service')]");
			if (el10.isDisplayed()) {
				System.out.println("Services page is displayed");
				Thread.sleep(2000);
				 MobileElement el11 = (MobileElement) driver.findElementByXPath("//*[contains(@text,'1 BHK')]");
					el11.click();
					Thread.sleep(3000);
			}else {
				System.out.println("Services page is not displayed");
			}
			Thread.sleep(2000);
		}else {
			System.out.println("Category screen is not displayed");
		}
	}
	
	
 public void ServiceTotal() throws InterruptedException {
	
		MobileElement el12 = (MobileElement) driver.findElementById("com.homejiny.app:id/tvTotal");
		Thread.sleep(1500);
		String strTotal=el12.getAttribute("text");
		System.out.println("Toatl Amount for 1BHKis: "+strTotal);
		
 }
	
	
	
	
	
	@Test (priority=2)
	public void  testcase2() throws MalformedURLException, InterruptedException {
		// TODO Auto-generated method stub
		HomeJinyMenHairCut objtc2= new HomeJinyMenHairCut();
		objtc2.Appinvoke();
		objtc2.SignInHomeJiny("1234567890");
		objtc2.VerifyOTPandHomepage("1234");
		Thread.sleep(2000);
		objtc2.scroll();
		objtc2.HomePageSelections();
		Thread.sleep(4000);
		objtc2.scroll();
		objtc2.ServiceTotal();
		
	}

	
	
}
