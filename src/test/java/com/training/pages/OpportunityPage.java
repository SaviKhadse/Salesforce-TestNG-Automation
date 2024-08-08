package com.training.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.training.base.BasePage;

public class OpportunityPage extends BasePage{
	LoginPage loginpage;
	
	public OpportunityPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath="//a[text()='Opportunities']")
	WebElement opportunity;
	public void opportunityTab() {
		opportunity.click();
	}
	@FindBy(xpath="//select[@id='fcf']")
	WebElement view;
	public void clickView() {
		view.click();
	}
	@FindBy(xpath="//input[@name='new']")
	WebElement newopportunity;
	public void newOpp() {
		newopportunity.click();
	}
	@FindBy(id="opp3")
	WebElement opponame;
	public void oppoName() {
		opponame.sendKeys("TestNG");
	}
	@FindBy(id="opp4")
	WebElement accname;
	public void accName() {
		accname.sendKeys("Global");	
	}
	@FindBy(id="opp9")
	WebElement closedt;
	public void closeDate() {
		closedt.click();
	}
	@FindBy(xpath="//a[text()='Today']")
	WebElement selectdt;
	public void selectDate() {
		selectdt.click();
	}
	@FindBy(xpath="//option[text()='Prospecting']")
	WebElement stage;
	public void clickStage() {
		stage.click();
	}
	@FindBy(id="opp12")
	WebElement probability;
	public void enterProbability() {
		probability.clear();
		probability.sendKeys("5");
	}
	@FindBy(xpath="//option[text()='Web']")
	WebElement Leadsrc;
	public void clickLeadSrc() {
		Leadsrc.click();
	}
	@FindBy(id="opp17")
	WebElement primcampaignsrc;
	public void enterPrimSrc() {
		primcampaignsrc.sendKeys("DM Campaign to Top Customers - Nov 12-23, 2001");
	}
	@FindBy(xpath="//input[@title='Save']")
	WebElement save;
	public void saveNewOpp() {
		save.click();
	}
//	Test ID	TC17
	@FindBy(xpath="//a[text()='Opportunity Pipeline']")
	WebElement opppipeline;
	public void oppPipe() {
		opppipeline.click();
	}
	
//	Test ID	TC18
	@FindBy(xpath="//a[text()='Stuck Opportunities']")
	WebElement stuckopp;
	public void clickStuckOpp() {
		stuckopp.click();
	}
//	Test ID	TC19
	@FindBy(xpath="//option[text()='Current and Next FQ']")
	WebElement quartsumm;
	public void clickQuartSumm() {
		quartsumm.click();	
	}
	@FindBy(xpath="//option[text()='All Opportunities']")
	WebElement include;
	public void clickAllOpp() {
		include.click();
	}
	@FindBy(xpath="//input[@value='Run Report']")
	WebElement runrep;
	public void runReport() {
		runrep.click();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
