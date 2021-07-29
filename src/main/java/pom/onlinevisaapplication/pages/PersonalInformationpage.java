package pom.onlinevisaapplication.pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.GenericWrappers;

public class PersonalInformationpage extends GenericWrappers {

	public PersonalInformationpage(RemoteWebDriver driver, ExtentTest test) {
		this.driver=driver;
		this.test=test;
	}
	public PersonalInformationpage enterName(String name) {
	    enterByXpath(prop.getProperty("PersonalInformationpage.Name.Xpath"), name);	
	    return this;
	}
	
	public PersonalInformationpage enterSurname(String surname) {
	    enterByXpath(prop.getProperty("PersonalInformationpage.Surname.Xpath"), surname);	
	    return this;
	}
	
	public PersonalInformationpage enterFullname(String fullname) {
	    enterByXpath(prop.getProperty("PersonalInformationpage.Fullname.Xpath"), fullname);	
	    return this;
	}
	
	public PersonalInformationpage clickOthername() {
	    clickByXpath(prop.getProperty("PersonalInformationpage.Othername.Xpath"));	
	    return this;
	}
	
	public PersonalInformationpage enterOtherSurname(String othersurname) {
	    enterByXpath(prop.getProperty("PersonalInformationpage.OtherSurname.Xpath"), othersurname);	
	    return this;
	}
	
	public PersonalInformationpage enterOtherGivenname(String othergivenname) {
	    enterByXpath(prop.getProperty("PersonalInformationpage.OtherGivenname.Xpath"), othergivenname);	
	    return this;
	}
	
	public PersonalInformationpage enterEmailID(String email) {
	    enterByXpath(prop.getProperty("PersonalInformationpage.EmailID.Xpath"), email);	
	    return this;
	}
	
	public PersonalInformationpage confirmEmailID(String email1) {
	    enterByXpath(prop.getProperty("PersonalInformationpage.confirmEmailID.Xpath"), email1);	
	    return this;
	}
	//pagedown & waitproperty
	public PersonalInformationpage pagedownAccess() {
	    pagedown();
	    return this;
	}
	
	public PersonalInformationpage clickOnAdditionalEmailID() {
	    clickByXpath(prop.getProperty("PersonalInformationpage.AdditionalEmailID1.Xpath"));	
	    return this;
	}
	public PersonalInformationpage enterAdditionalEmailID(String email1) {
	    enterByXpath(prop.getProperty("PersonalInformationpage.AdditionalEmailID2.Xpath"), email1);	
	    return this;
	}
	
	public PersonalInformationpage clickOnGender() {
		clickByXpath(prop.getProperty("PersonalInformationpage.Gender.Xpath"));
		return this;
	}
	//clickByXpath("//label[text()='"+gender+"']/following-sibling::input");Not working Sibling type
	
	public PersonalInformationpage clickOnDOB() {
	    clickByXpath(prop.getProperty("PersonalInformationpage.DOB.Xpath"));	
	    return this;
	}
	
	public PersonalInformationpage selectDOByear(String DOByear) {
		selectVisibileTextByXpath(prop.getProperty("PersonalInformationpage.DOByear.Xpath"), DOByear);
		return this;
	}
	
	public PersonalInformationpage selectDOBmonth(String DOBmonth) {
		selectVisibileTextByXpath(prop.getProperty("PersonalInformationpage.DOBmonth.Xpath"), DOBmonth);
		return this;
	}
	//waitproperty
	
	public PersonalInformationpage clickonDOBday(String option) {
		clickByXpath(prop.getProperty("PersonalInformationpage.DOBday.Xpath"),option);    // day value giving text
		return this;
	}
	
	public PersonalInformationpage enterCityofBirth(String city) {
	    enterByXpath(prop.getProperty("PersonalInformationpage.CityofBirth.Xpath"), city);	
	    return this;
	}
	
	public PersonalInformationpage enterStateofBirth(String state) {
	    enterByXpath(prop.getProperty("PersonalInformationpage.StateofBirth.Xpath"), state);	
	    return this;
	}
	
	public PersonalInformationpage selectCountry(String country) {
		selectVisibileTextByXpath(prop.getProperty("PersonalInformationpage.Country.Xpath"), country);
		return this;
	}
	
	public PersonalInformationpage selectNationality(String nationality) {
		selectVisibileTextByXpath(prop.getProperty("PersonalInformationpage.Nationality.Xpath"), nationality);
		return this;
	}
	
	public PersonalInformationpage clickOnPerminantResident() {
		clickByXpath(prop.getProperty("PersonalInformationpage.PerminantResident.Xpath"));
		return this;
	}
	
	public PersonalInformationpage selectPerminantOtherCountry(String othercountry) {
		selectVisibileTextByXpath(prop.getProperty("PersonalInformationpage.PerminantOtherCountry.Xpath"), othercountry);
		return this;
	}
	
	public PersonalInformationpage sleep(long time) {
		waitProperty(time);
		return this;
	}
	public ContactDetailspage clickOnNext() {
		clickByXpath(prop.getProperty("PersonalInformationpage.Next.Xpath"));
		return new ContactDetailspage(driver,test);
	}
}
