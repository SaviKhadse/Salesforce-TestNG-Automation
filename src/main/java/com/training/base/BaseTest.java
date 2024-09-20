package com.training.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;

import com.training.utilities.PropertiesFile;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {
	WebDriver driver;
	BasePage basepage;
//	PropertiesFile properties;
	
	public WebDriver getDriver() {
		if (driver==null) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}
	return driver;
}
	
	
	
	public void close() {
		driver.close();
		driver=null;
	}

}
