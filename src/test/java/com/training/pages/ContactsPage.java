package com.training.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.training.base.BasePage;

public class ContactsPage extends BasePage{

	LoginPage loginpage;
	public ContactsPage(WebDriver driver) {
		super(driver);
		
	}
	
	@FindBy(xpath="//a[text()='Contacts']")
	WebElement contacts;
	public void clickContacts() {
		contacts.click();
	}
	@FindBy(xpath="//input[@title='New']")
	WebElement newbutton;
	public void clickNew() {
		newbutton.click();
	}
	@FindBy(id="name_lastcon2")
	WebElement lastname;
	public void enterLastname() {
		lastname.sendKeys("Indian");
	}
	@FindBy(id="con4")
	WebElement accname;
	public void enterAccName() {
		accname.sendKeys("Global Media");
	}
	@FindBy(xpath="//input[@title='Save']")
	WebElement save;
	public void saveContact() {
		save.click();
	}
	@FindBy(xpath="//a[text()='Create New View']")
	WebElement newview;
	public void newView() {
		newview.click();
	}
	@FindBy(id="fname")
	WebElement viewname;
	public void viewName() {
		viewname.sendKeys("cancel view");
	}
	@FindBy(id="devname")
	WebElement uniqname;
	public void clickUniqueName() {
		uniqname.click();	
	}
	public void enterkUniqueName() {
		uniqname.sendKeys("error view");	
	}
	@FindBy(xpath="//input[@title='Save']")
	WebElement savebtn;
	public void saveView() {
		savebtn.click();
	}
//	Test ID	TC27
	@FindBy(xpath="//option[text()='Recently Created']")
	WebElement recentlycreated;
	public void clickRecentView() {
		recentlycreated.click();
	}
//	Test ID	TC28
	@FindBy(xpath="//option[text()='My Contacts']")
	WebElement mycontacts;
	public void clickMyContacts() {
		mycontacts.click();
	}
//	Test ID	TC29
	@FindBy(xpath="//a[text()='Sharma']")
	WebElement contname;
	public void searchContact() {
		contname.click();
	}
//	Test ID	TC31
	@FindBy(xpath="//input[@title='Cancel']")
	WebElement cancel;
	public void clickCancel() {
		cancel.click();	
	}
//	Test ID	TC32
	@FindBy(xpath="//input[@title='Save & New']")
	WebElement saveAndnew;
	public void saveNnew() {
		saveAndnew.click();	
	}

	
}
