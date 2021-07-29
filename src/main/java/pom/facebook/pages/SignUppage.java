package pom.facebook.pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.GenericWrappers;

public class SignUppage extends GenericWrappers {

	public SignUppage(RemoteWebDriver driver, ExtentTest test) {
		this.driver=driver;
		this.test=test;
	}
	
	public SignUppage enterFirstName(String firstname) {
		enterByXpath(prop.getProperty("SignUppage.FirstName.Xpath"), firstname);
		return this;
	}
	
	public SignUppage enterLastName(String lastname) {
		enterByXpath(prop.getProperty("SignUppage.LastName.Xpath"), lastname);
		return this;
	}
	
    public SignUppage enterEmailId(String email) {
		enterByXpath(prop.getProperty("SignUppage.EmailId.Xpath"), email);
		return this;
	}
    
    public SignUppage enterEmailIdtoConfirm(String confirmEmail) {
	    enterByXpath(prop.getProperty("SignUppage.EmailIdtoConfirm.Xpath"), confirmEmail);
	    return this;
    }
    
    public SignUppage enterPassword(String password) {
	    enterByXpath(prop.getProperty("SignUppage.Password.Xpath"), password);
	    return this;
    }
    
    public SignUppage selectDay(String day) {
    	selectVisibileTextByXpath(prop.getProperty("SignUppage.Day.Xpath"), day);
	    return this;
    }
    
    public SignUppage selectMonth(String month) {
    	selectVisibileTextByXpath(prop.getProperty("SignUppage.Month.Xpath"), month);
	    return this;
    }
    
    public SignUppage selectYear(String year) {
    	selectVisibileTextByXpath(prop.getProperty("SignUppage.Year.Xpath"), year);
	    return this;
    }
    
    public SignUppage clickOnGender(String option) {
    	clickByXpath(prop.getProperty("SignUppage.Gender.Xpath"),option);
		return this;
	}
    
    
}
