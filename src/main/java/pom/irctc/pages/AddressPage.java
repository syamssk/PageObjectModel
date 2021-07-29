package pom.irctc.pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.GenericWrappers;

public class AddressPage extends GenericWrappers {

	public AddressPage(RemoteWebDriver driver, ExtentTest test) {
		this.driver=driver;
		this.test=test;
	}
	
	public AddressPage enterAddress1(String address1) {
		enterByXpath(prop.getProperty("AddressPage.Address1.Xpath"), address1);
		return this;
	}
	
	public AddressPage enterAddress2(String address2) {
		enterByXpath(prop.getProperty("AddressPage.Address2.Xpath"), address2);
		return this;
	}
	
	public AddressPage enterAddress3(String address3) {
		enterByXpath(prop.getProperty("AddressPage.Address3.Xpath"), address3);
		return this;
	}
	
	public AddressPage enterPincode(String pincode) {
		enterByXpath(prop.getProperty("AddressPage.Pincode.Xpath"), pincode);
		return this;
	}
	
	public AddressPage enterStatebyTabKey() {
		TABkey();
		return this;
	}                                               //***
	
	public AddressPage sleep(long time) {
		waitProperty(time);
		return this;
	} 
	
	public AddressPage selectDistrict(String district) {
    	selectVisibileTextByXpath(prop.getProperty("AddressPage.District.Xpath"), district);
	    return this;
    }
	
	public AddressPage selectPostoffice(String postoffice) {
    	selectVisibileTextByXpath(prop.getProperty("AddressPage.Postoffice.Xpath"), postoffice);
	    return this;
    }
	
	public AddressPage enterPhone(String phone) {
		enterByXpath(prop.getProperty("AddressPage.Phone.Xpath"), phone);
		return this;
	}
	
	public AddressPage clickOnNoforOfficeAddress() {
		clickByXpath(prop.getProperty("AddressPage.NoforOfficeAddress.Xpath"));
		return this;
	}
	
	public AddressPage enterOfficeAddress1(String offAddress1) {
		enterByXpath(prop.getProperty("AddressPage.OfficeAddress1.Xpath"), offAddress1);
		return this;
	}
	
	public AddressPage enterOfficeAddress2(String offAddress2) {
		enterByXpath(prop.getProperty("AddressPage.OfficeAddress2.Xpath"), offAddress2);
		return this;
	}
	
	public AddressPage enterOfficeAddress3(String offAddress3) {
		enterByXpath(prop.getProperty("AddressPage.OfficeAddress3.Xpath"), offAddress3);
		return this;
	}
	
	public AddressPage clickOnSelectCountry() {
		clickByXpath(prop.getProperty("AddressPage.SelectCountry.Xpath"));
		return this;
	}
	
	public AddressPage clickOnCountryOption(String option) {
		clickByXpath(prop.getProperty("AddressPage.CountryOption.Xpath"),option);
		return this;
	}
	
	public AddressPage enterOfficePincode(String offPincode) {
		enterByXpath(prop.getProperty("AddressPage.OfficePincode.Xpath"), offPincode);
		return this;
	}
	
	public AddressPage enterOfficeState(String offstate) {
		enterByXpath(prop.getProperty("AddressPage.OfficeState.Xpath"), offstate);
		return this;
	}
	
	public AddressPage enterOfficeCity(String offcity) {
		enterByXpath(prop.getProperty("AddressPage.OfficeCity.Xpath"), offcity);
		return this;
	}
	
	public AddressPage enterOfficePostOffice(String offpostoffice) {
		enterByXpath(prop.getProperty("AddressPage.OfficePostOffice.Xpath"), offpostoffice);
		return this;
	}
	
	public AddressPage enterOfficePhoneNumber(String offphone) {
		enterByXpath(prop.getProperty("AddressPage.OfficePhoneNumber.Xpath"), offphone);
		return this;
	}
	
	public AddressPage pageDownAccess() {
	    pagedown();
		return this;
	}
	
	public AddressPage clickOnCheckBox() {
		clickByXpath(prop.getProperty("AddressPage.CheckBox.Xpath"));
		return this;
	}
}
