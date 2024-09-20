package com.training.testcases;

import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.WebDriver;
import com.training.utilities.ScreenshotUtility;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
//import org,testng.annotations.Parameters;
import com.training.base.BaseTest;
import com.training.pages.LoginPage;
import com.training.utilities.PropertiesFile;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTest extends BaseTest{

	LoginPage loginpage;
	WebDriver driver;
	PropertiesFile properties;
	ScreenshotUtility screenshot= new ScreenshotUtility();
	
	@BeforeMethod
	public void beforeMethod() {
		
		driver = getDriver();
		
		//to get url from properties file
		properties= new PropertiesFile();
		String url = properties.getProperties("url");
		driver.get(url);
		
		//creating object of loginpage to use actions and elements of loginpage
		loginpage = new LoginPage(driver);
		
		DOMConfigurator.configure("log4j.xml"); //to use the logs similar to sysout
		}
	
	
	@Test(priority=1,description="TC 01 Login Error Message - 1")
	@Parameters({"username", "password"})
	public void loginerrormessage() {
		
		loginpage.enterusername();
		loginpage.invalidPassword();
		loginpage.clicklogin();
	}
	
	@Test(priority = 2, description=" TC02 Login To SalesForce -2")
	@Parameters({"username", "password"})
	public void loginsuccess() throws InterruptedException {
		loginpage.enterusername();
		loginpage.validpassword();
		loginpage.clicklogin();
		Thread.sleep(2000);	
	}
	
//	@Test(priority=3, description="Check RemeberMe - 3")
//	@Parameters({"username", "password"})
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
//	
//	@Test(priority=4,description="Forgot Password- 4 A")
//	@Parameters({"username"})
//	public void forgotpassword() {
//		loginpage.forgotPassword();
//		loginpage.provideUsername();
//		loginpage.clickContinue();
//	}
//	
//	@Test(priority=5,description="Forgot Password- 4 B")
//	@Parameters({"username", "password"})
//	public void wrongCred() {
//		loginpage.enterInvalidusername();
//		loginpage.clicklogin();
//	}

	@AfterMethod
	    public void teardown() {
		screenshot.takescreenshot(driver);
		close();
		  
	   }

}
