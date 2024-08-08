package com.training.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.training.base.BasePage;

public class UserMenuDropDownPage extends BasePage{
	
	LoginPage loginpage;
//	UserMenuDropDownPage UserMenuDropDownPage;
	
	public UserMenuDropDownPage(WebDriver driver) { 
		super(driver);
	}
	
	@FindBy(id="userNavLabel")
	WebElement usermenu;
	
	public void clickUsermenu() {
		usermenu.click();
	}
	
	@FindBy(xpath="//a[text()='My Profile']")
	WebElement profile;
	
	public void clickOnProfile() {
		profile.click();
	}
	
	@FindBy(xpath="//img[@alt='Edit Profile']")
	WebElement editprofile;
	
	public void editProfile() {
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
		lastname.sendKeys("Khadse");
	}
	@FindBy(xpath="//input[@class='zen-btn zen-primaryBtn zen-pas']")
	WebElement saveall;
	
	public void clickSaveall() {
		saveall.click();
	}
	@FindBy(xpath="//span[text()='Post']")
	WebElement post;
	public void clickPost() {
		post.click();
	}
	
	@FindBy(xpath="//iframe[@class='cke_wysiwyg_frame cke_reset']")
	WebElement postframe;
	
	public void postFrame() throws InterruptedException {
		switchFrame(postframe);
	}
	
	@FindBy(xpath="//body[contains(text(),'Share an update, @mention someone...')]")
	WebElement text;
	public void postText(){
//		text.click();
//		switchFrame(postframe);
		text.sendKeys("testing post text");
		switchToDefault();
	}
	@FindBy(id="publishersharebutton")
	WebElement share;
	public void sharePost() throws InterruptedException {

//		Thread.sleep(3000);
		share.click();
	}
	
	@FindBy(xpath="//a[text()='My Settings']")
	WebElement mysetting;
	public void clickMySetting() {
		mysetting.click();
	}
	@FindBy(id="PersonalInfo_font")
	WebElement personal;
	public void clickPersonal() {
		personal.click();
	}
	@FindBy(id="LoginHistory_font")
	WebElement loginhistory;
	public void clickLogHistory() {
		loginhistory.click();
	}
	@FindBy(xpath="//a[contains(text(),'Download login history')]")
	WebElement downloadhistory;
	public void clickDownload() {
		downloadhistory.click();
	}
	@FindBy(id="DisplayAndLayout_font")
	WebElement display;
	public void displayLayout() {
		display.click();
	}
	@FindBy(id="CustomizeTabs_font")
	WebElement customtab;
	public void clickCustomTab() {
		customtab.click();
	}
	@FindBy(xpath="//option[text()='Salesforce Chatter']")
	WebElement customapp;
	public void clickCustomApp() {
		customapp.click();
	}
	@FindBy(xpath="//option[text()='Reports']")
	WebElement report;
	public void reportTab() {
		report.click();
	}
	@FindBy(id="duel_select_0_right")
	WebElement addreports;
	public void addReport() {
		addreports.click();
	}
	@FindBy(xpath="//input[@name='save']")
	WebElement savetab;
	public void saveTab() {
		savetab.click();
	}
	@FindBy(id="EmailSetup_font")
	WebElement email;
	public void clickEmail() {
		email.click();
	}
	@FindBy(id="EmailSettings_font")
	WebElement myemailsetting;
	public void clickMyEmailSet() {
		myemailsetting.click();
	}
	@FindBy(id="sender_name")
	WebElement emailname;
	public void enterName() {
		emailname.sendKeys("SaviK");	
	}
	@FindBy(id="sender_email")
	WebElement emailaddress;
	public void enterEmailAdd() {
		emailaddress.sendKeys("saviK@enexus.com");
	}
	@FindBy(id="auto_bcc1")
	WebElement bccyes;
	
	@FindBy(xpath="//input[@name='save']")
	WebElement saveemail;
	public void clickBCC() {
		if(bccyes.isSelected()) {
			
			saveemail.click();
//			
		}else {
			bccyes.click();
		}
			
	}
	@FindBy(id="CalendarAndReminders_font")
	WebElement calrem;
	public void clickCalendar() {
		calrem.click();
	}
	@FindBy(id="Reminders_font")
	WebElement activity;
	public void clickActivity() {
		activity.click();
	}
	@FindBy(id="testbtn")
	WebElement testbutton;
	public void clickTestButton() {
		testbutton.click();
	}
	
	@FindBy(xpath="//a[text()='Developer Console']")
	WebElement developerconsole;
	public void clickDevConsole() {
		developerconsole.click();
	}
	@FindBy(xpath="//a[text()='Logout']")
	WebElement logout;
	public void clickLogout() {
		logout.click();
		
	}
	
	
}
