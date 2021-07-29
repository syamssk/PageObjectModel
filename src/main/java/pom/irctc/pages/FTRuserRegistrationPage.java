package pom.irctc.pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.GenericWrappers;

public class FTRuserRegistrationPage extends GenericWrappers {

	public FTRuserRegistrationPage(RemoteWebDriver driver, ExtentTest test) {
		this.driver=driver;
		this.test=test;
	}
	
	public FTRuserRegistrationPage enterUserID(String id) {
		enterByXpath(prop.getProperty("FTRuserRegistrationPage.UserID.Xpath"), id);
		return this;
	}
	
	public FTRuserRegistrationPage enterPassword(String password) {
		enterByXpath(prop.getProperty("FTRuserRegistrationPage.Password.Xpath"), password);
		return this;
	}
	
	public FTRuserRegistrationPage entertoConfirmPassword(String confirmpassword) {
		enterByXpath(prop.getProperty("FTRuserRegistrationPage.ConfirmPassword.Xpath"), confirmpassword);
		return this;
	}
	
	public FTRuserRegistrationPage selectSecurityQuestion(String securityquestion) {
		selectVisibileTextByXpath(prop.getProperty("FTRuserRegistrationPage.SecurityQuestion.Xpath"), securityquestion);
		return this;
	}
	
	public FTRuserRegistrationPage enterSecurityAnswer(String securityanswer) {
		enterByXpath(prop.getProperty("FTRuserRegistrationPage.SecurityAnswer.Xpath"), securityanswer);
		return this;
	}
	
	public FTRuserRegistrationPage clickOnDOB() {
		clickByXpath(prop.getProperty("FTRuserRegistrationPage.DOB.Xpath"));
		return this;
	}
	
	public FTRuserRegistrationPage selectDOBYear(String DOByear) {
		selectVisibileTextByXpath(prop.getProperty("FTRuserRegistrationPage.DOBYear.Xpath"), DOByear);
		return this;
	}
	
	public FTRuserRegistrationPage selectDOBMonth(String DOBmonth) {
		selectVisibileTextByXpath(prop.getProperty("FTRuserRegistrationPage.DOBMonth.Xpath"), DOBmonth);
		return this;
	}
	//waitproperty
	
	public FTRuserRegistrationPage clickOnDOBDate(String option) {
		 clickByXpath(prop.getProperty("FTRuserRegistrationPage.DOBDate.Xpath"),option);
		 return this;
	}
	
	public FTRuserRegistrationPage clickOnGender(String option) {
		 clickByXpath(prop.getProperty("FTRuserRegistrationPage.Gender.Xpath"),option);
		 return this;
	}
	
	public FTRuserRegistrationPage clickOnMartialStatus(String option) {
		 clickByXpath(prop.getProperty("FTRuserRegistrationPage.MartialStatus.Xpath"),option);
		 return this;
	}
	 
	public FTRuserRegistrationPage enterEmailID(String email) {
		enterByXpath(prop.getProperty("FTRuserRegistrationPage.EmailID.Xpath"), email);
		return this;
	}
	 
	public FTRuserRegistrationPage selectOccupation(String occupation) {
		selectVisibileTextByXpath(prop.getProperty("FTRuserRegistrationPage.Occupation.Xpath"), occupation);
		return this;
	}
	
	public FTRuserRegistrationPage enterFirstName(String firstname) {
		enterByXpath(prop.getProperty("FTRuserRegistrationPage.FirstName.Xpath"), firstname);
		return this;
	}
	
	public FTRuserRegistrationPage enterMiddleName(String middlename) {
		enterByXpath(prop.getProperty("FTRuserRegistrationPage.MiddleName.Xpath"), middlename);
		return this;
	}
	
	public FTRuserRegistrationPage enterLastName(String lastname) {
		enterByXpath(prop.getProperty("FTRuserRegistrationPage.LastName.Xpath"), lastname);
		return this;
	}
	
	public FTRuserRegistrationPage selectNationaity(String nationality) {
		selectVisibileTextByXpath(prop.getProperty("FTRuserRegistrationPage.Nationaity.Xpath"), nationality);
		return this;
	}
	
	public FTRuserRegistrationPage enterFlatNo(String flat) {
		enterByXpath(prop.getProperty("FTRuserRegistrationPage.FlatNo.Xpath"), flat);
		return this;
	}
	
	public FTRuserRegistrationPage enterStreetName(String street) {
		enterByXpath(prop.getProperty("FTRuserRegistrationPage.StreetName.Xpath"), street);
		return this;
	}
	
	public FTRuserRegistrationPage enterAreaName(String area) {
		enterByXpath(prop.getProperty("FTRuserRegistrationPage.AreaName.Xpath"), area);
		return this;
	}
	
	public FTRuserRegistrationPage selectCountry(String country) {
		selectVisibileTextByXpath(prop.getProperty("FTRuserRegistrationPage.Country.Xpath"), country);
		return this;
	}
	
	public FTRuserRegistrationPage enterMobileNo(String mobile) {
		enterByXpath(prop.getProperty("FTRuserRegistrationPage.MobileNo.Xpath"), mobile);
		return this;
	}
	
	public FTRuserRegistrationPage enterPincode(String pincode) {
		enterByXpath(prop.getProperty("FTRuserRegistrationPage.Pincode.Xpath"), pincode);
		return this;
	}
	
	public FTRuserRegistrationPage enterCityandStatebyTabKey() {
		TABkey();
		return this;
	}
	
	public FTRuserRegistrationPage selectPostoffice(String postoffice) {
		selectVisibileTextByXpath(prop.getProperty("FTRuserRegistrationPage.Postoffice.Xpath"), postoffice);
		return this;
	}
	
	public FTRuserRegistrationPage pagedownaccess() {
		pagedown();
		return this;
	}
	
	public FTRuserRegistrationPage clickOnNoforAddress() {
		clickByXpath(prop.getProperty("FTRuserRegistrationPage.NoforAddress.Xpath"));
		return this;
	}
	
	public FTRuserRegistrationPage enterOfficeFlatNo(String offflat) {
		enterByXpath(prop.getProperty("FTRuserRegistrationPage.OfficeFlatNo.Xpath"), offflat);
		return this;
	}
	
	public FTRuserRegistrationPage enterOfficeStreetName(String offstreet) {
		enterByXpath(prop.getProperty("FTRuserRegistrationPage.OfficeStreetName.Xpath"), offstreet);
		return this;
	}
	
	public FTRuserRegistrationPage enterOfficeAreaName(String offarea) {
		enterByXpath(prop.getProperty("FTRuserRegistrationPage.OfficeAreaName.Xpath"), offarea);
		return this;
	}
	
	public FTRuserRegistrationPage selectOfficeCountry(String offcountry) {
		selectVisibileTextByXpath(prop.getProperty("FTRuserRegistrationPage.OfficeCountry.Xpath"), offcountry);
		return this;
	}
	
	public FTRuserRegistrationPage enterOfficeMobileNo(String offmobile) {
		enterByXpath(prop.getProperty("FTRuserRegistrationPage.OfficeMobileNo.Xpath"), offmobile);
		return this;
	}
	
	public FTRuserRegistrationPage enterOfficePincode(String offpincode) {
		enterByXpath(prop.getProperty("FTRuserRegistrationPage.OfficePincode.Xpath"), offpincode);
		return this;
	}
	//accessTAB
	
	public FTRuserRegistrationPage selectOfficePostOffice(String offpostoffice) {
		selectVisibileTextByXpath(prop.getProperty("FTRuserRegistrationPage.OfficePostOffice.Xpath"), offpostoffice);
		return this;
	}
	
	public FTRuserRegistrationPage sleep(long time) {
		waitProperty(time);
		return this;
	}
}
