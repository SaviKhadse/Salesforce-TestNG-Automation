package com.training.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.training.base.BasePage;

public class LoginPage extends BasePage{
//	WebDriver driver;
	
	@FindBy(id="username")
	WebElement username;
	
	public LoginPage(WebDriver driver) { 
		super(driver);
	}
	
	public void enterusername() {
		username.sendKeys("savi@enexus.com");
	}
	
	@FindBy(id="password")
	WebElement password;
	
	public void invalidPassword() {
		password.clear();
	}
	
	public void validpassword() {
		password.sendKeys("ZXasqw1$");
	}
	
	@FindBy(id="Login")
	WebElement login;
	
	public void clicklogin() {
		login.click();
	}
	
	@FindBy(id="rememberUn")
	WebElement rememberMe;
	
	public void clickrememberme() {
		rememberMe.click();
	}
	
	@FindBy(id="userNavLabel")
	WebElement userdropdown;
	
	public void userdropdown() {
		userdropdown.click();
	}
	
	@FindBy(xpath="//a[contains(text(),'Logout')]")
	WebElement logout;
	
	public void logout() {
		logout.click();
	}
	
	@FindBy(id="forgot_password_link")
	WebElement forgotpassword;
	
	public void forgotPassword() {
		forgotpassword.click();
	}
	
	@FindBy(id="un")
	WebElement username1;
	
	public void provideUsername() {
		username1.sendKeys("savi@enexus.com");
	}
	
	@FindBy(id="continue")
	WebElement continu;
	public void clickContinue() {
		continu.click();
	}
	
//	@FindBy(id="username")
//	WebElement username;
	
	public void enterInvalidusername() {
		username.sendKeys("123");
		password.sendKeys("22131");
		
	}
	
	
//	public void error() {
//		WebElement error = driver.findElement(By.id("error"));
//		String errTxt = error.getText();
//		System.out.println(errTxt);
//	}
	
}
