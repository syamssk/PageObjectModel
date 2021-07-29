package pom.phptravels.pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.GenericWrappers;

public class Registrationpage extends GenericWrappers {

	public Registrationpage(RemoteWebDriver driver, ExtentTest test) {
		this.driver=driver;
		this.test=test;
	}
	
	public Registrationpage enterFirstName(String firstname) {
		enterByXpath(prop.getProperty("Registrationpage.FirstName.Xpath"), firstname);
		return this;
	}
	
	public Registrationpage enterLastName(String lastname) {
		enterByXpath(prop.getProperty("Registrationpage.LastName.Xpath"), lastname);
		return this;
	}

    public Registrationpage enterEmailId(String email) {
		enterByXpath(prop.getProperty("Registrationpage.EmailId.Xpath"), email);
		return this;
	}
    
    public Registrationpage enterphoneNo(String phone) {
		enterByXpath(prop.getProperty("Registrationpage.phoneNo.Xpath"), phone);
		return this;
	}
    
    public Registrationpage enterCompanyName(String companyname) {
		enterByXpath(prop.getProperty("Registrationpage.CompanyName.Xpath"), companyname);
		return this;
	}
    
    public Registrationpage enterAddress1(String address1) {
		enterByXpath(prop.getProperty("Registrationpage.Address1.Xpath"), address1);
		return this;
	}
    
    public Registrationpage enterAddress2(String address2) {
		enterByXpath(prop.getProperty("Registrationpage.Address2.Xpath"), address2);
		return this;
	}
    
    public Registrationpage enterCity(String city) {
		enterByXpath(prop.getProperty("Registrationpage.City.Xpath"), city);
		return this;
	}
    
    public Registrationpage enterState(String state) {
		enterByXpath(prop.getProperty("Registrationpage.State.Xpath"), state);
		return this;
	}
    
    public Registrationpage enterPincode(String pincode) {
		enterByXpath(prop.getProperty("Registrationpage.Pincode.Xpath"), pincode);
		return this;
	}
    
    public Registrationpage selectCountry(String country) {
		selectVisibileTextByXpath(prop.getProperty("Registrationpage.Country.Xpath"), country);
		return this;
	}
    
    public Registrationpage selectAdditionalinfo1(String customfield1) {
		selectVisibileTextByXpath(prop.getProperty("Registrationpage.Additionalinfo1.Xpath"), customfield1);
		return this;
	}
    
    public Registrationpage enterAdditionalinfo2(String customfield2) {
    	enterByXpath(prop.getProperty("Registrationpage.Additionalinfo2.Xpath"), customfield2);
		return this;
	}
    
    public Registrationpage clickOnGeneratePassword() {
    	clickByXpath(prop.getProperty("Registrationpage.GeneratePassword.Xpath"));
		return this;
	}
    
    //waitproperty
    
    public Registrationpage clickOnGeneratenewPassword() {
    	clickByXpath(prop.getProperty("Registrationpage.GeneratenewPassword.Xpath"));
		return this;
	}
    
    public Registrationpage clickOnCopyandInsert() {
    	clickByXpath(prop.getProperty("Registrationpage.CopyandInsert.Xpath"));
		return this;
	}
    
    public Registrationpage clickOnMailrequest() {
    	clickByXpath(prop.getProperty("Registrationpage.Mailrequest.Xpath"));
		return this;
	}
}
