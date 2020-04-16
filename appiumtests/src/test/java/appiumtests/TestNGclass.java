package appiumtests;


import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class TestNGclass extends HomeJinyMenHairCut{
	
	@BeforeTest
		public void BeforeTest() {
		
	}
			
		
	
		@Test
		public void testcase1() {
			System.out.println("First test case");
		}

		@AfterTest
		public void aftertest() {
			System.out.println("testcase execution is completed");
		}

}
