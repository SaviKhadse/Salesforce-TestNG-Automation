package com.training.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import com.training.base.BasePage;

public class CreateAccountPage extends BasePage{
//	WebDriver driver;
	LoginPage loginpage;
	
	public CreateAccountPage(WebDriver driver) {
		super(driver);
		
	}
	
	@FindBy(xpath="//a[@title='Accounts Tab']")
	WebElement accounts;
	
	public void clickAccount() {
		accounts.click();
	}
	@FindBy(xpath="//input[@name='new']")
	WebElement newbutton;
	public void newButton() {
		newbutton.click();
	}
	@FindBy(id="acc2")
	WebElement accname;
	public void enterAccName() {
		accname.sendKeys("KKK");
	}
	@FindBy(xpath="//option[text()='Technology Partner']")
	WebElement typedropdown;
	public void selectTechType() {
		typedropdown.click();
	}
	@FindBy(xpath="//option[text()='High']")
	WebElement custpriority;
	public void selectCustPriority() {
		custpriority.click();
	}
	@FindBy(xpath="//input[@name='save']")
	WebElement saveaccount;
	public void saveAccount() {
		saveaccount.click();
	}
//	Create new view
	
	@FindBy(xpath="//a[text()='Create New View']")
	WebElement newview;
	public void newView() {
		newview.click();
	}
	@FindBy(id="fname")
	WebElement vname;
	public void viewName() {
		vname.sendKeys("TestNGview");
	}
	@FindBy(id="devname")
	WebElement uniquename;
	public void unikViewName() {
		uniquename.click();
//		uniquename.sendKeys("TNV");
	}
	@FindBy(xpath="//input[@name='save']")
	WebElement viewsave;
	public void saveView() {
		viewsave.click();
	}
//	TC12 Edit view
	
	@FindBy(xpath="//option[text()='mynewview']")
	WebElement viewdropdown;
	public void selectView() {
		viewdropdown.click();
	}
	
	@FindBy(xpath="//a[text()='Edit']")
	WebElement viewedit;
	public void editView() {
		viewedit.click();
	}
	@FindBy(id="fname")
	WebElement newvName;
	public void enterViewName() {
		newvName.clear();
		newvName.sendKeys("testngdemo");
	}
	@FindBy(id="devname")
	WebElement unikuename;
	public void enteruniqName() {
		unikuename.clear();
		unikuename.sendKeys("TND");
	}
	@FindBy(xpath="//option[text()='Account Name']")
	WebElement field;
	public void enterField() {
		field.click();
	}
	@FindBy(xpath="//option[text()='contains']")
	WebElement operator;
	public void enterOperator() {
		operator.click();
	}
	@FindBy(id="fval1")
	WebElement value;
	public void enterValue() {
		value.sendKeys("a");
	}
	@FindBy(id="colselector_select_0")
	WebElement availablefield;
	public void selectField() {
		Select displayfield = new Select(availablefield);
		displayfield.selectByVisibleText("Last Activity");
	}
	@FindBy(id="colselector_select_0_right")
	WebElement addfield;
	public void addField() {
		addfield.click();
	}
	@FindBy(xpath="//input[@title='Save']")
	WebElement editedviewsave;
	public void saveEditedView() {
		viewsave.click();
	}
	
//	TC13 Merge Accounts
	@FindBy(xpath="//a[text()='Merge Accounts']")
	WebElement mergeaccount;
	
	public void clickMerge() {
	mergeaccount.click();
	}
	
	@FindBy(xpath="//input[@name='srch']")
	WebElement textaccname;
	public void enteraccName() {
		textaccname.sendKeys("kavi");
	}
	@FindBy(xpath="//input[@name='srchbutton']")
	WebElement findacc;
	public void clickFind() {
		findacc.click();
	}
	@FindBy(xpath="//input[@name='goNext']")
	WebElement nextbtn;
	public void nextButton() {
		nextbtn.click();
	}
	@FindBy(xpath="//input[@name='save']")
	WebElement merge;
	public void clickMergeAcc() {
		merge.click();
	}
	
//	TC14 Create account report
	@FindBy(xpath="//a[contains(text(),'Accounts with last')]")
	WebElement accwithlast;
	public void clickAccLastActivity() {
		accwithlast.click();
	}
	@FindBy(id="ext-gen148")
	WebElement datefield;
	public void clickDateField() {
		datefield.click();
	}
	@FindBy(xpath="//div[text()='Created Date']")
	WebElement createddate;
	public void clickCreatedDate() {
		createddate.click();
	}
	@FindBy(id="ext-gen152")
	WebElement fromdate;
	public void selectFrom() {
		fromdate.click();
	}
	@FindBy(xpath="//button[text()='Today']")
	WebElement today1;
	public void today1() {
		today1.click();
	}
	
	@FindBy(id="ext-gen154")
	WebElement tofield;
	public void selectToDate() {
		tofield.click();
	}
	@FindBy(id="ext-gen296")
	WebElement today2;
	public void today2() {
		today2.click();
	}
	@FindBy(id="ext-gen49")
	WebElement savereport;
	public void saveReport() {
		savereport.click();
	}
	@FindBy(id="saveReportDlg_reportNameField")
	WebElement repname;
	public void reportName() {
		repname.sendKeys("newtestNgReport");
	}
	@FindBy(id="saveReportDlg_DeveloperName")
	WebElement repunikname;
	public void reportUnikName() {
		repunikname.click();
	}
	@FindBy(id="ext-gen316")
	WebElement saveAndrun;
	public void saveAndRun() {
		saveAndrun.click();
	}
	
	
	
	
}
