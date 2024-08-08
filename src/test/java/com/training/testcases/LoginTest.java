package com.training.testcases;

import org.openqa.selenium.WebDriver;
import com.training.utilities.ScreenshotUtility;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
//import org,testng.annotations.Parameters;
import com.training.base.BaseTest;
import com.training.pages.LoginPage;
import com.training.utilities.PropertiesFile;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTest extends BaseTest{

	LoginPage loginpage;
	WebDriver driver;
//	PropertiesFile properties;
	ScreenshotUtility screenshot= new ScreenshotUtility();
	
	@BeforeMethod
	public void beforeMethod() {
		
		driver = getDriver();
//		properties= new PropertiesFile();
//		String url = properties.getProperties("url");
		driver.get("https://login.salesforce.com");
		loginpage = new LoginPage(driver);
		}
	
	
//	@Test(priority=1,description="TC 01 Login Error Message - 1")
//
//	public void loginerrormessage() {
//		
//		loginpage.enterusername();
//		loginpage.invalidPassword();
//		loginpage.clicklogin();
//	}
	
//	@Test(priority = 2, description=" TC02 Login To SalesForce -2")
//	public void loginsuccess() throws InterruptedException {
//		loginpage.enterusername();
//		loginpage.validpassword();
//		loginpage.clicklogin();
//		Thread.sleep(2000);	
//	}
	
//	@Test(priority=3, description="Check RemeberMe - 3")
//	
//	public void rememberMe() throws InterruptedException {
//		loginpage.enterusername();
//		loginpage.validpassword();
//		loginpage.clickrememberme();
//		loginpage.clicklogin();
//		Thread.sleep(2000);
//		loginpage.userdropdown();
//		loginpage.logout();
//		
//	}
	
//	@Test(priority=4,description="Forgot Password- 4 A")
//	
//	public void forgotpassword() {
//		loginpage.forgotPassword();
//		loginpage.provideUsername();
//		loginpage.clickContinue();
//	}
	
	@Test(priority=5,description="Forgot Password- 4 B")
	
	public void wrongCred() {
		loginpage.enterInvalidusername();
		loginpage.clicklogin();
	}
	
	

	@AfterMethod
	    public void afterMethod() {
			screenshot.takescreenshot(driver);
		   driver.close();
		   driver=null;
	   }

}
