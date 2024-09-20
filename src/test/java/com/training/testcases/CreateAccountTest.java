package com.training.testcases;

import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.training.base.BaseTest;
import com.training.pages.CreateAccountPage;
import com.training.pages.LoginPage;
import com.training.utilities.PropertiesFile;
//import com.training.utilities.PropertiesFile;
import com.training.utilities.ScreenshotUtility;

public class CreateAccountTest extends BaseTest{
		WebDriver driver;
		CreateAccountPage CreateAccountPage;
		LoginPage loginpage;
		PropertiesFile properties;
		ScreenshotUtility screenshot= new ScreenshotUtility();
		
		@BeforeMethod
		public void beforeMethod() {
			
			driver = getDriver();
			properties= new PropertiesFile();
			String url = properties.getProperties("url");
			driver.get(url);
			loginpage = new LoginPage(driver);
			CreateAccountPage = new CreateAccountPage(driver);
			DOMConfigurator.configure("log4j.xml");
			}

		@Test(priority=11, description="TC10 CreateAccount")
		public void account() throws InterruptedException {
			loginpage.enterusername();
			loginpage.validpassword();
			loginpage.clicklogin();
			Thread.sleep(2000);
			CreateAccountPage.clickAccount();
			CreateAccountPage.newButton();
			CreateAccountPage.enterAccName();
			CreateAccountPage.selectTechType();
			CreateAccountPage.selectCustPriority();
			CreateAccountPage.saveAccount();
		}
		
		@Test(priority=12, description="Create new view")
		public void createNewView() throws InterruptedException {
			loginpage.enterusername();
			loginpage.validpassword();
			loginpage.clicklogin();
			Thread.sleep(2000);
			CreateAccountPage.clickAccount();
			CreateAccountPage.newView();
			CreateAccountPage.viewName();
			CreateAccountPage.unikViewName();
			CreateAccountPage.saveView();
		}
		
		@Test(priority=13, description="TC12 Edit view")
		public void editView() throws InterruptedException {
			loginpage.enterusername();
			loginpage.validpassword();
			loginpage.clicklogin();
			Thread.sleep(2000);
			CreateAccountPage.clickAccount();
			CreateAccountPage.selectView();
			CreateAccountPage.editView();
			CreateAccountPage.enterViewName();
			CreateAccountPage.enteruniqName();
			CreateAccountPage.enterField();
			CreateAccountPage.enterOperator();
			CreateAccountPage.enterValue();
			Thread.sleep(1000);
			CreateAccountPage.selectField();
			CreateAccountPage.addField();
			CreateAccountPage.saveEditedView();
		}
		
		@Test(priority=14, description="TC13 Merge accounts")
		
		public void mergeAccounts() throws InterruptedException {
			loginpage.enterusername();
			loginpage.validpassword();
			loginpage.clicklogin();
			Thread.sleep(2000);
			CreateAccountPage.clickAccount();
			CreateAccountPage.clickMerge();
			Thread.sleep(1000);
			CreateAccountPage.enteraccName();
			CreateAccountPage.clickFind();
			CreateAccountPage.nextButton();
			CreateAccountPage.clickMergeAcc();
			driver.switchTo().alert().accept();	
		}
		
		@Test(priority=15, description="TC14 Create account report")
		
		public void createAccountReport() throws InterruptedException {
			loginpage.enterusername();
			loginpage.validpassword();
			loginpage.clicklogin();
			Thread.sleep(2000);
			CreateAccountPage.clickAccount();
			CreateAccountPage.clickAccLastActivity();
			Thread.sleep(2000);
			CreateAccountPage.clickDateField();
			CreateAccountPage.clickCreatedDate();
			Thread.sleep(1000);
			CreateAccountPage.selectFrom();
			CreateAccountPage.today1();
			CreateAccountPage.selectToDate();
			CreateAccountPage.today2();
			CreateAccountPage.saveReport();
			CreateAccountPage.reportName();
			CreateAccountPage.reportUnikName();
			CreateAccountPage.saveAndRun();
			Thread.sleep(1000);
		}
		
		@AfterMethod
	    public void teardown() {
		screenshot.takescreenshot(driver);
		close();
		  
	   }
		
		
	}
