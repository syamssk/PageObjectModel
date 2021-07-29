package pom.irctc.pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.GenericWrappers;

public class RegistrationPage extends GenericWrappers {

	public RegistrationPage(RemoteWebDriver driver, ExtentTest test) {
		this.driver=driver;
		this.test=test;
	}
	
	 public RegistrationPage enterUserName(String name) {
		 enterByXpath(prop.getProperty("RegistrationPage.UserName.XPath"), name);
		 return this;
	}
	 
	 public RegistrationPage enterPassword(String password) {
		 enterByXpath(prop.getProperty("RegistrationPage.Password.XPath"), password);
		 return this;
	}
	 
	 public RegistrationPage enterPasswordtoConfirm(String confirmpassword) {
		 enterByXpath(prop.getProperty("RegistrationPage.PasswordtoConfirm.XPath"), confirmpassword);
		 return this;
	}
	 
	 public RegistrationPage clickOnLanguage() {
		 clickByXpath(prop.getProperty("RegistrationPage.Language.XPath"));
		 return this;
	}

	 
	 public RegistrationPage clickOnPrefLanguageOption(String option) {
		 clickByXpath(prop.getProperty("RegistrationPage.PrefLanguageOption.XPath"),option);
		 return this;
	 }
	 
	 
	 public RegistrationPage clickOnSecurityQuestion() {
		 clickByXpath(prop.getProperty("RegistrationPage.SecurityQuestion.XPath"));
		 return this;
	}
	 
	 public RegistrationPage clickOnSecurityQuestionOption(String option) {
		 clickByXpath(prop.getProperty("RegistrationPage.SecurityQuestionOption.XPath"), option);
		 return this;
	 }
	 
	 public RegistrationPage enterSecurityAnswer(String securityanswer) {
		 enterByXpath(prop.getProperty("RegistrationPage.SecurityAnswer.XPath"), securityanswer);
		 return this;
	}
	 
	 public PersonalDetailsPage clickOnContinue() {
		 clickByXpath(prop.getProperty("RegistrationPage.Continue.XPath"));
		return new PersonalDetailsPage(driver,test);
	}
}
