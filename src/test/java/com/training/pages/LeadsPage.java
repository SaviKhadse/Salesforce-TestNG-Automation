package com.training.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.training.base.BasePage;

public class LeadsPage extends BasePage{
	LoginPage loginpage;
	public LeadsPage(WebDriver driver) {
		super(driver);
		
	}

	@FindBy(xpath="//a[text()='Leads']")
	WebElement leads;
	public void clickLeads() {
		leads.click();
	}

//	TC21-leadsSelectView
	@FindBy(id="fcf")
	WebElement view;
	public void clickView() {
		view.click();
	}
//	
	@FindBy(xpath="//option[@value='00Bak00000CjKUQ']")
	WebElement Myunreadleads;
	public void selectUnreadLeads() {
		Myunreadleads.click();
	}
	@FindBy(id="userNavLabel")
	WebElement userdropdown;
	public void clickUsermenu() {
		userdropdown.click();
		
	}
	@FindBy(xpath="//a[text()='Logout']")
	WebElement logout;
	public void logout() {
		logout.click();
	}
	@FindBy(xpath="//input[@title='Go!']")
	WebElement golead;
	public void clickGo() {
		golead.click();
	}
//	Test ID		TC23
	@FindBy(xpath="//option[@value='00Bak00000CjKUg']")
	WebElement todaysleads;
	public void selectLead() {
		todaysleads.click();
	}
//	Test ID		TC24
	@FindBy(xpath="//input[@title='New']")
	WebElement newbutton;
	public void clickNew() {
		newbutton.click();
	}
	@FindBy(id="name_lastlea2")
	WebElement lastname;
	public void enterLastname() {
		lastname.sendKeys("ABCD");
	}
	@FindBy(id="lea3")
	WebElement company;
	public void enterCompany() {
		company.sendKeys("ABCD");
	}
	@FindBy(xpath="//input[@title='Save']")
	WebElement save;
	public void saveNewLead() {
		save.click();
	}
	
	
	
	
	
	
	
}
