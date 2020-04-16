package appiumtests;


import java.net.MalformedURLException;
import java.net.URL;


import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
//import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class ReusableMethosHomeJiny extends HomeCleaningService{
	
	
public void  HomeJinyServices(String strSearchText) throws InterruptedException{
	
	MobileElement el7 = (MobileElement) driver.findElementById("com.homejiny.app:id/etSearch");
		el7.sendKeys(strSearchText);
		Thread.sleep(2000);
		String SearchTxt=el7.getAttribute("text");
		if(SearchTxt.equalsIgnoreCase("Salon")) {
				System.out.println("text entered successfully: ");
					}else {
						System.out.println("text is not entered successfully");
			}
			MobileElement el8 = (MobileElement) driver.findElementById("com.homejiny.app:id/ivSearch");
			el8.click();
			Thread.sleep(2000);
	
	
}


public void SearchSalonResults() throws InterruptedException {
	
	
	MobileElement el9 = (MobileElement) driver.findElementByXPath("//*[contains(@text,'Search')]");
	if(el9.isDisplayed()) {
		System.out.println("Search results are displayed");
		Thread.sleep(2000);
		MobileElement el10 = (MobileElement) driver.findElementByXPath("//*[contains(@text,'Men Hair Cut')]");
		el10.click();
		Thread.sleep(2000);
		MobileElement el11 = (MobileElement) driver.findElementByXPath("//*[contains(@text,'Service')]");
			if(el11.isDisplayed()) {
				System.out.println("men hair cut services tab is displayed");
				}else {
					System.out.println("men hair cut services tab is not displayed");
			}
	}else {
		System.out.println("Failed to display search results");
	}
	
}


@Test (priority=1)
public void Tetscase1() throws MalformedURLException, InterruptedException {
	
		// TODO Auto-generated method stub
	ReusableMethosHomeJiny objclass= new ReusableMethosHomeJiny();
	//objclass.Appinvoke();
	objclass.Appinvoke();
	objclass.SignInHomeJiny("1234567890");
	objclass.VerifyOTPandHomepage("1234");
	objclass.HomeJinyServices("Salon");
	objclass.SearchSalonResults();

}

}
