package com.training.testcases;

import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.training.base.BaseTest;
import com.training.pages.LoginPage;
import com.training.pages.OpportunityPage;
import com.training.pages.LeadsPage;
import com.training.utilities.PropertiesFile;
import com.training.utilities.ScreenshotUtility;

public class LeadsTest extends BaseTest {
	WebDriver driver;
	LeadsPage LeadsPage;
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
		LeadsPage = new LeadsPage(driver);
		DOMConfigurator.configure("log4j.xml");
		}
	
	@Test(priority=21, description="check leads tab link ")

	public void LeadsTab() throws InterruptedException {
		loginpage.enterusername();
		loginpage.validpassword();
		loginpage.clicklogin();
		Thread.sleep(2000);
		LeadsPage.clickLeads();
		
	}

	@Test(priority=22, description="Validate 'View' drop down list contents ")

	public void LeadsViewTab() throws InterruptedException {
		loginpage.enterusername();
		loginpage.validpassword();
		loginpage.clicklogin();
		Thread.sleep(2000);
		LeadsPage.clickLeads();
		LeadsPage.clickView();
	}
	
	@Test(priority=23, description="Functionality of the Go Button ")
	
	public void selectLead() throws InterruptedException {
		loginpage.enterusername();
		loginpage.validpassword();
		loginpage.clicklogin();
		Thread.sleep(2000);
		LeadsPage.clickLeads();
		LeadsPage.clickView();
		LeadsPage.selectUnreadLeads();
		LeadsPage.clickUsermenu();
		LeadsPage.logout();
		Thread.sleep(2000);
		loginpage.enterusername();
		loginpage.validpassword();
		loginpage.clicklogin();
		Thread.sleep(2000);
		LeadsPage.clickLeads();
		LeadsPage.clickGo();
	}
	
	@Test(priority=23, description="Functionality of the Go Button ")
	public void todaysLeads() throws InterruptedException {
		loginpage.enterusername();
		loginpage.validpassword();
		loginpage.clicklogin();
		Thread.sleep(2000);
		LeadsPage.clickLeads();
		LeadsPage.clickView();
		LeadsPage.selectLead();
		LeadsPage.clickGo();
		Thread.sleep(2000);
	}
	@Test(priority=24, description="Check New button on Leads Home ")
	
	public void checkNewButton() throws InterruptedException {
		loginpage.enterusername();
		loginpage.validpassword();
		loginpage.clicklogin();
		Thread.sleep(2000);
		LeadsPage.clickLeads();
		LeadsPage.clickNew();
		LeadsPage.enterLastname();
		LeadsPage.enterCompany();
		LeadsPage.saveNewLead();
	
	}
	
	
	
	@AfterMethod
    public void teardown() {
	screenshot.takescreenshot(driver);
	close();
	  
   }



}
