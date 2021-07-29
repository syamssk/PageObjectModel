package pom.onlinevisaapplication.pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.GenericWrappers;

public class ContactDetailspage extends GenericWrappers {

	public ContactDetailspage(RemoteWebDriver driver, ExtentTest test) {
		this.driver=driver;
		this.test=test;
	}
	
	public ContactDetailspage enterStreetAddress1(String address1) {
		enterByXpath(prop.getProperty("ContactDetailspage.StreetAddress1.Xpath"), address1);
		return this;
	}
	
	public ContactDetailspage enterStreetAddress2(String address2) {
		enterByXpath(prop.getProperty("ContactDetailspage.StreetAddress2.Xpath"), address2);
		return this;
	}
	
	public ContactDetailspage enterContactCity(String contactcity) {
		enterByXpath(prop.getProperty("ContactDetailspage.ContactCity.Xpath"), contactcity);
		return this;
	}
	
	public ContactDetailspage enterContactState(String contactstate) {
		enterByXpath(prop.getProperty("ContactDetailspage.ContactState.Xpath"), contactstate);
		return this;
	}
	
	public ContactDetailspage enterPincode(String pincode) {
		enterByXpath(prop.getProperty("ContactDetailspage.Pincode.Xpath"), pincode);
		return this;
	}
	
	public ContactDetailspage clickOnCountryFlag_notaDropdown() {
		clickByXpath(prop.getProperty("ContactDetailspage.CountryFlag_notaDropdown.Xpath"));
		return this;
	}
	
	public ContactDetailspage clickOnCountryCode_notaDropdown() {
		clickByXpath(prop.getProperty("ContactDetailspage.CountryCode_notaDropdown.Xpath"));
		return this;
	}
	//waitproperty
	
	public ContactDetailspage enterPhoneNumber(String phone) {
		enterByXpath(prop.getProperty("ContactDetailspage.PhoneNumber.Xpath"), phone);
		return this;
	}
	
	public ContactDetailspage clickOnNoOtherPhoneNo() {
		clickByXpath(prop.getProperty("ContactDetailspage.NoOtherPhoneNo.Xpath"));
		return this;
	}
	
	public ContactDetailspage selectCountryofResidence(String contactcountry) {
		selectVisibileTextByXpath(prop.getProperty("ContactDetailspage.CountryofResidence.Xpath"), contactcountry);
		return this;
	}
	//pagedown
	public ContactDetailspage pagedownAccess() {
	    pagedown();
	    return this;
	}
	
	public ContactDetailspage selectStateofResidence(String region) {
		selectVisibileTextByXpath(prop.getProperty("ContactDetailspage.StateofResidence.Xpath"), region);
		return this;
	}
	
	public AdditionalDetailspage clickOnNext() {
		clickByXpath(prop.getProperty("ContactDetailspage.Next.Xpath"));
		return new AdditionalDetailspage(driver,test);
	}
}
