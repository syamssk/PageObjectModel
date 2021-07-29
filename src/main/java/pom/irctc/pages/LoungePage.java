package pom.irctc.pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.GenericWrappers;

public class LoungePage extends GenericWrappers {
	
	public LoungePage(RemoteWebDriver driver, ExtentTest test) {
		this.driver=driver;
		this.test=test;
	}
	
	public LoungePage switchToNewWindow() {
		switchToLastWindow();
		return this;
	}

	public LoungePage clickOnMenuIcon() {
		clickByXpath(prop.getProperty("LoungePage.MenuIcon.Xpath"));
		return this;
	}
	
	public FTRServiceSignUpPage clickOnBookyourCoach() {
		clickByXpath(prop.getProperty("LoungePage.BookyourCoach.Xpath"));
		return new FTRServiceSignUpPage(driver,test);
	}
	
	public CharterPage clickOnCharter() {
		clickByXpath(prop.getProperty("LoungePage.Charter.Xpath"));
		return new CharterPage(driver,test);
	}
	
	public HotelsHomePage clickOnHotelsIcon() {
		clickByXpath(prop.getProperty("LoungePage.HotelsIcon.Xpath"));
		return new HotelsHomePage(driver,test);
	}
}
