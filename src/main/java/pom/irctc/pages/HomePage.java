package pom.irctc.pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.GenericWrappers;

public class HomePage extends GenericWrappers{

	public HomePage(RemoteWebDriver driver, ExtentTest test) {
		this.driver=driver;
		this.test=test;
	}
	
	public RegistrationPage clickOnRegister() {
		clickByXpath(prop.getProperty("HomePage.Register.XPath"));
		return new RegistrationPage(driver,test);
	}
		
	public HomePage mouseHoverOnHolidays() {
		mouseHoverByXpath(prop.getProperty("HomePage.Holidays.XPath"));
		return this;
	}
		
	public HomePage mouseHoverOnStays() {
		mouseHoverByXpath(prop.getProperty("HomePage.Stays.XPath"));
		return this;
	}
		
	public LoungePage clickOnLounge() {
		clickByXpath(prop.getProperty("HomePage.Lounge.XPath"));
		return new LoungePage(driver,test);
	}
}
