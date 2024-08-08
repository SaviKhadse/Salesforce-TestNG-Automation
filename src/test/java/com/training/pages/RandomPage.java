package com.training.pages;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.training.base.BasePage;


public class RandomPage extends BasePage{

	LoginPage loginpage;
	public RandomPage(WebDriver driver) {
		super(driver);
		
	}
	
	@FindBy(xpath="//a[@title='Home Tab']")
	WebElement Home;
	public void clickHome() {
		Home.click();
	}
	
	@FindBy(xpath="//a[text()='Savita Khadse']")
	WebElement fnamelname;
	public void clickfnamelname() {
		fnamelname.click();
	}
	
//	Test ID	TC34
	
	@FindBy(xpath="//img[@title='Edit Profile']")
	WebElement editprofile;
	public void editProf() {
		editprofile.click();
	}
	@FindBy(xpath="//iframe[@id='contactInfoContentId']")
	WebElement popframe;
	
	public void popFrame() throws InterruptedException {
		Thread.sleep(2000);
		switchFrame(popframe);
	}
	@FindBy(xpath="//a[contains(text(),'About')]")
	WebElement about;
	
	public void clickOnAbout() {
		about.click();
	}
	@FindBy(id="lastName")
	WebElement lastname;
	public void enterLastname() {
		lastname.clear();
		lastname.sendKeys("ABCD");
	}
	@FindBy(xpath="//input[@class='zen-btn zen-primaryBtn zen-pas']")
	WebElement saveall;
	
	public void clickSaveall() {
		saveall.click();
	}
	
//	Test ID	TC35
	@FindBy(xpath="//img[@title='All Tabs']")
	WebElement alltab;
	public void clickTabPlus() {
		alltab.click();
	}
	@FindBy(xpath="//input[@name='customize']")
	WebElement custtab;
	public void custTab() {
		custtab.click();
	}
	@FindBy(xpath="//option[text()='Assets']")
	WebElement remtab;
	public void selectTab() {
		remtab.click();
	}
	@FindBy(xpath="//img[@title='Remove']")
	WebElement remove;
	public void removeTab() {
		remove.click();
	}
	@FindBy(xpath="//input[@title='Save']")
	WebElement savebutton;
	public void clickSave() {
		savebutton.click();
	}
	@FindBy(id="userNavLabel")
	WebElement usermenu;
	public void clickUsermenu() {
		usermenu.click();
	}
	@FindBy(xpath="//a[text()='Logout']")
	WebElement logout;
	public void logOut() {
		logout.click();	
	}
//	Test ID	TC36
	
	@FindBy(xpath="//a[@href='/00U/c?md3=220&md0=2024']")
	WebElement currDate;
	public void clickCurrDate() {
		currDate.click();
	}
	@FindBy(xpath="//a[contains(text(),' 8:00 PM')]")
	WebElement selTime;
	public void selTime() {
		selTime.click();
	}
	@FindBy(xpath="//img[@title='Subject Combo (New Window)']")
	WebElement subCombo;
	public void clickSubCombo() {
		subCombo.click();
	}
	@FindBy(id="evt5")
	WebElement typeOther;
	public void enterOther() {
		typeOther.sendKeys("Other");
	}
	@FindBy(id="EndDateTime_time")
	WebElement endTime;
	public void selEndTime() {
		endTime.click();
	}
	@FindBy(id="timePickerItem_42")
	WebElement selectTime9;
	public void clickchoseTime() {
		selectTime9.click();
	}
	@FindBy(xpath="//input[@title='Save']")
	WebElement saveEvent;
	public void saveEvent() {
		saveEvent.click();
	}
//	Test ID	TC37
	@FindBy(xpath="//a[contains(text(),' 4:00 PM')]")
	WebElement select4;
	public void sel4Time() {
		select4.click();
	}

	@FindBy(xpath="//img[@title='Subject Combo (New Window)']")
	WebElement subCombo7;
	public void clickSubCombo2() {
		subCombo7.click();
	}
//	@FindBy(id="evt5")
//	WebElement typeOther;
//	public void enterOther() {
//		typeOther.sendKeys("Other");
//	}
	
	@FindBy(xpath="//div[text()='7:00 PM']")
	WebElement selectTime7;
	public void clickSevenTime() {
		selectTime7.click();
	}
	@FindBy(id="IsRecurrence")
	WebElement recurrence;
	public void clickRecCheckBox() {
		recurrence.click();
	}
	@FindBy(xpath="//label[text()='Weekly']")
	WebElement weekly;
	public void clickWeekly() {
		weekly.click();
	}
	@FindBy(id="RecurrenceEndDateOnly")
	WebElement recEndDate;
	public void enterRecDate() {
		String futureDate = RandomPage.getFutureDate(14);
		recEndDate.sendKeys(futureDate);
	}
	
	
	public static String getFutureDate(int daysToAdd) {
        LocalDate today = LocalDate.now();
        LocalDate futureDate = today.plusDays(daysToAdd);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("M/d/yyyy"); // Format as needed
        return futureDate.format(formatter);
    }
	
	@FindBy(xpath="//input[@title='Save']")
	WebElement saveanotherEvent;
	public void saveNextEvent() {
		saveEvent.click();	
	}
	@FindBy(xpath="//img[@title='Month View']")
	WebElement monthView;
	public void monthView() {
		monthView.click();
	}
	

}
