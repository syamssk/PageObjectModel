package pom.irctc.pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.GenericWrappers;

public class HotelsHomePage extends GenericWrappers { 

	public HotelsHomePage(RemoteWebDriver driver, ExtentTest test) {
		this.driver=driver;
		this.test=test;
	}
	
	public HotelsHomePage switchToNewWindow() {
		switchToLastWindow();
		return this;
	}
	
	public HotelsHomePage clickOnLogIn() {
		clickByXpath(prop.getProperty("HotelsHomePage.LogIn.Xpath"));
		return this;  	
	}
	//waitprop
	
	public HotelsHomePage clickOnGuestUserLogin() {
		clickByXpath(prop.getProperty("HotelsHomePage.GuestUserLogin.Xpath"));
		return this;  	
	}
	//waitprop
	
	public HotelsHomePage enterEmailID(String email) {
		enterByXpath(prop.getProperty("HotelsHomePage.EmailID.Xpath"), email);
		return this;
	}
	
	public HotelsHomePage enterMobileNo(String mobile) {
		enterByXpath(prop.getProperty("HotelsHomePage.MobileNo.Xpath"), mobile);
		return this;
	}
	
	public FindHotelsPage clickOnSignIn() {
		clickByXpath(prop.getProperty("HotelsHomePage.SignIn.Xpath"));
		return new FindHotelsPage(driver,test);  	
	}
}
