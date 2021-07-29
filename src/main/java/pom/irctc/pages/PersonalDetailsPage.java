package pom.irctc.pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.GenericWrappers;

public class PersonalDetailsPage extends GenericWrappers {

	public PersonalDetailsPage(RemoteWebDriver driver, ExtentTest test) {
		this.driver=driver;
		this.test=test;
	}
	
	public PersonalDetailsPage enterFirstName(String firstname) {
		 enterByXpath(prop.getProperty("PersonalDetailsPage.FirstName.Xpath"), firstname);
		 return this;
	}
	 
	 public PersonalDetailsPage enterMiddleName(String middlename) {
		 enterByXpath(prop.getProperty("PersonalDetailsPage.MiddleName.Xpath"), middlename);
		 return this;
	}
	 
	 public PersonalDetailsPage enterLastName(String lastname) {
		 enterByXpath(prop.getProperty("PersonalDetailsPage.LastName.Xpath"), lastname);
		 return this;
	}
	 
	 public PersonalDetailsPage clickOnOccupation() {
		 clickByXpath(prop.getProperty("PersonalDetailsPage.Occupation.Xpath"));
		 return this;
	} 
	 
	 public PersonalDetailsPage clickOnOccupationOption(String option) {
		 clickByXpath(prop.getProperty("PersonalDetailsPage.OccupationOption.Xpath"),option);
		 return this;
	}  
	 
	 public PersonalDetailsPage clickOnDOB() {
		 clickByXpath(prop.getProperty("PersonalDetailsPage.DOB.Xpath"));
		 return this;
	}
	 
	 public PersonalDetailsPage selectDOBYear(String year) {
		 selectVisibileTextByXpath(prop.getProperty("PersonalDetailsPage.DOBYear.Xpath"), year);
		 return this;
	}
	 
	 public PersonalDetailsPage selectDOBMonth(String month) {
		 selectVisibileTextByXpath(prop.getProperty("PersonalDetailsPage.DOBMonth.Xpath"), month);
		 return this;
	}
	 //waitproperty
	 
	 public PersonalDetailsPage clickOnDOBDate(String option) {
		 clickByXpath(prop.getProperty("PersonalDetailsPage.DOBDate.Xpath"),option);
		 return this;
	}
	 
	 public PersonalDetailsPage clickOnMartialStatus(String option) {
		 clickByXpath(prop.getProperty("PersonalDetailsPage.MartialStatus.Xpath"),option);
		 return this;
	}
	 
	 public PersonalDetailsPage selectCountry(String country) {
		 selectVisibileTextByXpath(prop.getProperty("PersonalDetailsPage.Country.Xpath"), country);
		 return this;
	}
	 
	 public PersonalDetailsPage clickOnGender(String option) {
		 clickByXpath(prop.getProperty("PersonalDetailsPage.Gender.Xpath"),option);
		 return this;
	}
	 
	 public PersonalDetailsPage enterEmailID(String email) {
		 enterByXpath(prop.getProperty("PersonalDetailsPage.EmailID.Xpath"), email);
		 return this;
	}
	 
	 public PersonalDetailsPage enterMobileNumber(String mobile) {
		 enterByXpath(prop.getProperty("PersonalDetailsPage.MobileNumber.Xpath"), mobile);
		 return this;
	}
	 
	 public PersonalDetailsPage selectNationality(String country1) {
		 selectVisibileTextByXpath(prop.getProperty("PersonalDetailsPage.Nationality.Xpath"), country1);
		 return this;
	}
	 
	 public AddressPage clickOnContinue() {
		 clickByXpath(prop.getProperty("PersonalDetailsPage.Continue.Xpath"));
		 return new AddressPage(driver,test);
	}
}
