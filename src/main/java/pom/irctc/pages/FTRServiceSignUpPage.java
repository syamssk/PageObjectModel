package pom.irctc.pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.GenericWrappers;

public class FTRServiceSignUpPage extends GenericWrappers {

	public FTRServiceSignUpPage(RemoteWebDriver driver, ExtentTest test) {
		this.driver=driver;
		this.test=test;
	}
	
	public FTRServiceSignUpPage switchToNewWindow() {
		switchToLastWindow();
		return this;
	}
	
	public FTRuserRegistrationPage clickOnSignUp() {
		clickByXpath(prop.getProperty("FTRServiceSignUpPage.SignUp.Xpath"));
		return new FTRuserRegistrationPage(driver,test);
	}
}
