package com.training.testcases;

import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.training.base.BaseTest;
import com.training.pages.LoginPage;
import com.training.pages.UserMenuDropDownPage;
import com.training.utilities.PropertiesFile;
//import com.training.utilities.PropertiesFile;
import com.training.utilities.ScreenshotUtility;


public class UserMenuDropDownTest extends BaseTest{
	WebDriver driver;
	UserMenuDropDownPage UserMenuDropDownPage;
	PropertiesFile properties;
	LoginPage loginpage;
	ScreenshotUtility screenshot= new ScreenshotUtility();
	
	@BeforeMethod
	public void beforeMethod() {
		
		driver = getDriver();
		properties= new PropertiesFile();
		String url = properties.getProperties("url");
		driver.get(url);
		loginpage = new LoginPage(driver);
	
		UserMenuDropDownPage = new UserMenuDropDownPage(driver);
		DOMConfigurator.configure("log4j.xml");
		}
	
//	@Test(priority=6, description="TC05 Select user menu for <username> drop down")
//	public void usermenu() throws InterruptedException {
//		loginpage.enterusername();
//		loginpage.validpassword();
//		loginpage.clicklogin();
//		Thread.sleep(2000);
//		UserMenuDropDownPage.clickUsermenu();
//		
//	}
	
	
//	@Test(priority=7, description="Select \"My Profile\" option from user menu for <username> drop down")
//	
//	public void myProfile() throws InterruptedException {
//		loginpage.enterusername();
//		loginpage.validpassword();
//		loginpage.clicklogin();
//		Thread.sleep(2000);
//		UserMenuDropDownPage.clickUsermenu();
//		UserMenuDropDownPage.clickOnProfile();
//		UserMenuDropDownPage.editProfile();
//		UserMenuDropDownPage.popFrame();
//		UserMenuDropDownPage.clickOnAbout();
//		UserMenuDropDownPage.enterLastname();
//		UserMenuDropDownPage.clickSaveall();
//		Thread.sleep(2000);
//		UserMenuDropDownPage.clickPost();
//		UserMenuDropDownPage.postFrame();
//		UserMenuDropDownPage.postText();
//		UserMenuDropDownPage.sharePost();
//		
//	}
	
//	@Test(priority=8, description="Select \"My settings\" option from user menu for <username> drop down")
//	
//	public void mySettings() throws InterruptedException {
//		loginpage.enterusername();
//		loginpage.validpassword();
//		loginpage.clicklogin();
//		Thread.sleep(2000);
//		UserMenuDropDownPage.clickUsermenu();
//		UserMenuDropDownPage.clickMySetting();
//		UserMenuDropDownPage.clickPersonal();
//		UserMenuDropDownPage.clickLogHistory();
//		UserMenuDropDownPage.clickDownload();
//		Thread.sleep(2000);
//		UserMenuDropDownPage.displayLayout();
//		UserMenuDropDownPage.clickCustomTab();
//		UserMenuDropDownPage.clickCustomApp();
//		UserMenuDropDownPage.reportTab();
//		UserMenuDropDownPage.addReport();
////		UserMenuDropDownPage.saveTab();
//		UserMenuDropDownPage.clickEmail();
//		UserMenuDropDownPage.clickMyEmailSet();
//		UserMenuDropDownPage.enterName();
//		UserMenuDropDownPage.enterEmailAdd();
//		UserMenuDropDownPage.clickBCC();
//		UserMenuDropDownPage.clickCalendar();
//		UserMenuDropDownPage.clickActivity();
//		UserMenuDropDownPage.clickTestButton();
//		Thread.sleep(2000);
//	}
	
//	@Test(priority=9, description="Select \"Developers Console\" option from user menu for <username> drop down")
//	
//	public void devConsole() throws InterruptedException {
//		loginpage.enterusername();
//		loginpage.validpassword();
//		loginpage.clicklogin();
//		Thread.sleep(2000);
//		UserMenuDropDownPage.clickUsermenu();
//		String parenthandle = driver.getWindowHandle();
//		UserMenuDropDownPage.clickDevConsole();
//		for(String winHandle : driver.getWindowHandles())
//        {
//           driver.switchTo().window(winHandle);
//        }
//		
//		Thread.sleep(1000);
//		driver.close();
//		driver.switchTo().window(parenthandle);
//	}
	
	@Test(priority=10, description="Select \"Logout\" option from user menu for <username> drop down")
	public void logout() throws InterruptedException {
		loginpage.enterusername();
		loginpage.validpassword();
		loginpage.clicklogin();
		Thread.sleep(2000);
		UserMenuDropDownPage.clickUsermenu();
		UserMenuDropDownPage.clickLogout();
	}
	
	@AfterMethod
    public void teardown() {
	screenshot.takescreenshot(driver);
	close();
	  
   }
	
	
}
