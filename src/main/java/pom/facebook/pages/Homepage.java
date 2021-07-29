package pom.facebook.pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.GenericWrappers;

public class Homepage extends GenericWrappers {
 
	public Homepage(RemoteWebDriver driver, ExtentTest test) {
		this.driver=driver;
		this.test=test;
	}
	
	public Homepage clickOnselectLanguage() {
		clickByXpath(prop.getProperty("Homepage.Language.Xpath"));
		return this;
	}
	
	public SignUppage clickOnCreateNewAccount() {
	    clickByXpath(prop.getProperty("Homepage.CreateNewAccount.Xpath"));
	    return new SignUppage(driver, test);
   }
}