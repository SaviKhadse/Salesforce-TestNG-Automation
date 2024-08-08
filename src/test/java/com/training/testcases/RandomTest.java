package com.training.testcases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.training.base.BaseTest;
import com.training.pages.RandomPage;
import com.training.pages.LoginPage;
import com.training.utilities.ScreenshotUtility;

public class RandomTest extends BaseTest{

	WebDriver driver;
	RandomPage RandomPage;
	LoginPage loginpage;
	ScreenshotUtility screenshot= new ScreenshotUtility();
	
	@BeforeMethod
	public void beforeMethod() {
		
		driver = getDriver();
//		properties= new PropertiesFile();
//		String url = properties.getProperties("url");
		driver.get("https://login.salesforce.com");
		loginpage = new LoginPage(driver);
		RandomPage = new RandomPage(driver);
		}
	
//	@Test(priority=33, description="Check the Save and New button works in New Contact page")
//	public void verifyfnamelname() throws InterruptedException {
//		loginpage.enterusername();
//		loginpage.validpassword();
//		loginpage.clicklogin();
//		Thread.sleep(2000);
//		RandomPage.clickHome();
//		RandomPage.clickfnamelname();
//		Thread.sleep(2000);		
//	}
	
//	@Test(priority=34, description="Verify the edited lastname is updated at various places")
//	public void verifyEditedLastName() throws InterruptedException {
//		loginpage.enterusername();
//		loginpage.validpassword();
//		loginpage.clicklogin();
//		Thread.sleep(2000);
//		RandomPage.clickHome();
//		RandomPage.clickfnamelname();
//		RandomPage.editProf();
//		RandomPage.popFrame();
//		RandomPage.clickOnAbout();
//		RandomPage.enterLastname();
//		RandomPage.clickSaveall();
//		Thread.sleep(2000);
//	}
	
//	@Test(priority=35, description="Verify the tab customization")
//	
//	public void verifyTabCustom() throws InterruptedException {
//		loginpage.enterusername();
//		loginpage.validpassword();
//		loginpage.clicklogin();
//		Thread.sleep(2000);
//		RandomPage.clickTabPlus();
//		RandomPage.custTab();
//		RandomPage.selectTab();
//		RandomPage.removeTab();
//		RandomPage.clickSave();
//		RandomPage.clickUsermenu();
//		RandomPage.logOut();
//		Thread.sleep(2000);
//		loginpage.enterusername();
//		loginpage.validpassword();
//		loginpage.clicklogin();
//		Thread.sleep(2000);
//	}
	
//	@Test(priority=36, description="Blocking an event in the calender")
//	
//	public void blockEventCalendar() throws InterruptedException {
//		
//		loginpage.enterusername();
//		loginpage.validpassword();
//		loginpage.clicklogin();
//		Thread.sleep(2000);
//		RandomPage.clickHome();
//		Thread.sleep(1000);
//		RandomPage.clickCurrDate();
//		RandomPage.selTime();
//		RandomPage.clickSubCombo();
//		RandomPage.enterOther();
//		RandomPage.selEndTime();
//		RandomPage.clickchoseTime();
//		RandomPage.saveEvent();
//	}
	
	@Test(priority=37, description="Blocking an event in the calender with weekly recurrance")
	
	public void blockRecurrence() throws InterruptedException {
		loginpage.enterusername();
		loginpage.validpassword();
		loginpage.clicklogin();
		Thread.sleep(2000);
		RandomPage.clickHome();
		Thread.sleep(1000);
		RandomPage.clickCurrDate();
		RandomPage.sel4Time();
		RandomPage.clickSubCombo2();
		RandomPage.enterOther();
		Thread.sleep(1000);
		RandomPage.selEndTime();
		RandomPage.clickSevenTime();
		RandomPage.clickRecCheckBox();
		RandomPage.clickWeekly();
		RandomPage.enterRecDate();
		RandomPage.saveNextEvent();
		RandomPage.monthView();
	}
	
	
	
	@AfterMethod
	    public void afterMethod() {
			screenshot.takescreenshot(driver);
		   driver.close();
		   driver=null;
	   }
		
}
