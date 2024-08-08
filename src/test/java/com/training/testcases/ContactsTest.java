package com.training.testcases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.training.base.BaseTest;
import com.training.pages.ContactsPage;
import com.training.pages.LoginPage;
import com.training.utilities.ScreenshotUtility;

public class ContactsTest extends BaseTest {
	WebDriver driver;
	ContactsPage ContactsPage;
	LoginPage loginpage;
	ScreenshotUtility screenshot= new ScreenshotUtility();
	
	@BeforeMethod
	public void beforeMethod() {
		
		driver = getDriver();
//		properties= new PropertiesFile();
//		String url = properties.getProperties("url");
		driver.get("https://login.salesforce.com");
		loginpage = new LoginPage(driver);
		ContactsPage = new ContactsPage(driver);
		}
	
//	@Test(priority=25, description="Check New button on Leads Home ")
//	public void newContact() throws InterruptedException {
//		loginpage.enterusername();
//		loginpage.validpassword();
//		loginpage.clicklogin();
//		Thread.sleep(2000);
//		ContactsPage.clickContacts();
//		ContactsPage.clickNew();
//		ContactsPage.enterLastname();
//		ContactsPage.enterAccName();
//		ContactsPage.saveContact();
//	}
	
//	@Test(priority=26, description="Create new view in the Contact Page ")
//	
//	public void createNewView() throws InterruptedException {
//		loginpage.enterusername();
//		loginpage.validpassword();
//		loginpage.clicklogin();
//		Thread.sleep(2000);
//		ContactsPage.clickContacts();
//		ContactsPage.newView();
//		ContactsPage.viewName();
//		ContactsPage.clickUniqueName();
//		ContactsPage.saveView();
//
//	}
	
//	@Test(priority=27, description="Check recently created contact in the Contact Page ")
//	
//	public void checkRecentlyCreated() throws InterruptedException {
//		loginpage.enterusername();
//		loginpage.validpassword();
//		loginpage.clicklogin();
//		Thread.sleep(2000);
//		ContactsPage.clickContacts();
//		ContactsPage.clickRecentView();
//		
//	}
	
//	@Test(priority=28, description="Check 'My contacts' view in the Contact Page")
//	public void myContacts() throws InterruptedException {
//		loginpage.enterusername();
//		loginpage.validpassword();
//		loginpage.clicklogin();
//		Thread.sleep(2000);
//		ContactsPage.clickContacts();
//		ContactsPage.clickMyContacts();
//		
//	}
	
//	@Test(priority=29, description="View a contact in the contact Page")
//	
//	public void contactPage() throws InterruptedException {
//		
//		loginpage.enterusername();
//		loginpage.validpassword();
//		loginpage.clicklogin();
//		Thread.sleep(2000);
//		ContactsPage.clickContacts();
//		ContactsPage.searchContact();
//		Thread.sleep(2000);
//	}
	
//	@Test(priority=30, description="Error while creating a New view in Contacts")
//	
//	public void errorCreateNewView() throws InterruptedException {
//		loginpage.enterusername();
//		loginpage.validpassword();
//		loginpage.clicklogin();
//		Thread.sleep(2000);
//		ContactsPage.clickContacts();
//		ContactsPage.newView();
//		ContactsPage.enterkUniqueName();
//		ContactsPage.saveView();
//	}
	
//	@Test(priority=31, description="Check the Cancel button works fine in Create New View")
//	
//public void cancelView() throws InterruptedException {
//		loginpage.enterusername();
//		loginpage.validpassword();
//		loginpage.clicklogin();
//		Thread.sleep(2000);
//		ContactsPage.clickContacts();
//		ContactsPage.newView();
//		ContactsPage.viewName();
//		ContactsPage.clickUniqueName();
//		ContactsPage.clickCancel();
//		Thread.sleep(2000);
//	}
	
	@Test(priority=32, description="Check the Save and New button works in New Contact page")
	public void checkSaveAndNew() throws InterruptedException {
		
		loginpage.enterusername();
		loginpage.validpassword();
		loginpage.clicklogin();
		Thread.sleep(2000);
		ContactsPage.clickContacts();
		ContactsPage.clickNew();
		ContactsPage.enterLastname();
		ContactsPage.enterAccName();
		ContactsPage.saveNnew();
		Thread.sleep(2000);
		
	}
	
	
	
	
	
	@AfterMethod
    public void afterMethod() {
		screenshot.takescreenshot(driver);
	   driver.close();
	   driver=null;
   }
}
