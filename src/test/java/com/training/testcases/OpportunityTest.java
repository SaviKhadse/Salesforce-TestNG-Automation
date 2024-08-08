package com.training.testcases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.training.base.BaseTest;
import com.training.pages.OpportunityPage;
import com.training.pages.LoginPage;
import com.training.utilities.ScreenshotUtility;

public class OpportunityTest extends BaseTest {
	WebDriver driver;
	OpportunityPage OpportunityPage;
	LoginPage loginpage;
	
	ScreenshotUtility screenshot= new ScreenshotUtility();
	

	@BeforeMethod
	public void beforeMethod() {
		
		driver = getDriver();
//		properties= new PropertiesFile();
//		String url = properties.getProperties("url");
		driver.get("https://login.salesforce.com");
		loginpage = new LoginPage(driver);
		OpportunityPage = new OpportunityPage(driver);
		}
	
	@Test(priority=16, description="opportunities drop down")
	public void clickOpportunity() throws InterruptedException {
		loginpage.enterusername();
		loginpage.validpassword();
		loginpage.clicklogin();
		Thread.sleep(2000);
		OpportunityPage.opportunityTab();
		OpportunityPage.clickView();
		Thread.sleep(1000);
	}

	@Test(priority=17, description="Create a new Optyn")
	public void newOpportunity() throws InterruptedException {
		loginpage.enterusername();
		loginpage.validpassword();
		loginpage.clicklogin();
		Thread.sleep(2000);
		OpportunityPage.opportunityTab();
		OpportunityPage.newOpp();
		OpportunityPage.oppoName();
		OpportunityPage.accName();
		OpportunityPage.closeDate();
		OpportunityPage.selectDate();
		OpportunityPage.clickStage();
		OpportunityPage.enterProbability();
		OpportunityPage.clickLeadSrc();
		OpportunityPage.enterPrimSrc();
		OpportunityPage.saveNewOpp();
	}
	
	@Test(priority=18, description="Test Opportunity Pipeline Report")
	public void oppoPipeline() throws InterruptedException {
		loginpage.enterusername();
		loginpage.validpassword();
		loginpage.clicklogin();
		Thread.sleep(2000);
		OpportunityPage.opportunityTab();
		OpportunityPage.oppPipe();
	
	}
	
	@Test(priority=19, description="Test Stuck Opportunities Report")
	
	public void stuckOpp() throws InterruptedException {
		loginpage.enterusername();
		loginpage.validpassword();
		loginpage.clicklogin();
		Thread.sleep(2000);
		OpportunityPage.opportunityTab();
		OpportunityPage.clickStuckOpp();
	}
	
	@Test(priority=20, description="Test Quarterly Summary Report")
	
	public void quartSummary() throws InterruptedException {
		loginpage.enterusername();
		loginpage.validpassword();
		loginpage.clicklogin();
		Thread.sleep(2000);
		OpportunityPage.opportunityTab();
		OpportunityPage.clickQuartSumm();
		OpportunityPage.clickAllOpp();
		OpportunityPage.runReport();
	}
	
	
	
	@AfterMethod
    public void afterMethod() {
		screenshot.takescreenshot(driver);
	   driver.close();
	   driver=null;
   }
	
}
