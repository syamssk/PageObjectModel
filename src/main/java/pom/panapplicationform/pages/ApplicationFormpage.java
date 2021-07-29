package pom.panapplicationform.pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.GenericWrappers;

public class ApplicationFormpage extends GenericWrappers{

	public ApplicationFormpage(RemoteWebDriver driver, ExtentTest test) {
		this.driver=driver;
		this.test=test;
	}
	
	public ApplicationFormpage selectTitle(String title) {
		selectVisibileTextByXpath(prop.getProperty("ApplicationFormpage.Title.Xpath"), title);
		return this;
	}
	
	public ApplicationFormpage enterFirstName(String firstname) {
		enterByXpath(prop.getProperty("ApplicationFormpage.FirstName.Xpath"), firstname);
		return this;
	}
	
	public ApplicationFormpage enterMiddleName(String middlename) {
		enterByXpath(prop.getProperty("ApplicationFormpage.MiddleName.Xpath"), middlename);
		return this;
	}
	
	public ApplicationFormpage enterLastName(String lastname) {
		enterByXpath(prop.getProperty("ApplicationFormpage.LastName.Xpath"), lastname);
		return this;
	}
	
	public ApplicationFormpage enterFatherFirstName(String Ffirstname) {
		enterByXpath(prop.getProperty("ApplicationFormpage.FatherFirstName.Xpath"), Ffirstname);
		return this;
	}
	
	public ApplicationFormpage enterFatherMiddleName(String Fmiddlename) {
		enterByXpath(prop.getProperty("ApplicationFormpage.FatherMiddleName.Xpath"), Fmiddlename);
		return this;
	}
	
	public ApplicationFormpage enterFatherLastName(String Flastname) {
		enterByXpath(prop.getProperty("ApplicationFormpage.FatherLastName.Xpath"), Flastname);
		return this;
	}
	
	public ApplicationFormpage enterMobileNumber(String mobile) {
		enterByXpath(prop.getProperty("ApplicationFormpage.MobileNumber.Xpath"), mobile);
		return this;
	}
	
	public ApplicationFormpage enterEmailId(String email) {
		enterByXpath(prop.getProperty("ApplicationFormpage.EmailId.Xpath"), email);
		return this;
	}
	
	public ApplicationFormpage selectSourceofIncome(String income) {
		selectVisibileTextByXpath(prop.getProperty("ApplicationFormpage.SourceofIncome.Xpath"), income);
		return this;
	}
	
	public ApplicationFormpage clickOnOffice() {
		clickByXpath(prop.getProperty("ApplicationFormpage.Office.Xpath"));
		return this;
	}
	
	public ApplicationFormpage enterDOB(String dob) {
		enterByXpath(prop.getProperty("ApplicationFormpage.DOB.Xpath"), dob);
		return this;
	}
	
	public ApplicationFormpage enterAddress1(String address1) {
		enterByXpath(prop.getProperty("ApplicationFormpage.Address1.Xpath"), address1);
		return this;
	}
	
	public ApplicationFormpage enterAddress2(String address2) {
		enterByXpath(prop.getProperty("ApplicationFormpage.Address2.Xpath"), address2);
		return this;
	}
	
	public ApplicationFormpage enterCityName(String city) {
		enterByXpath(prop.getProperty("ApplicationFormpage.CityName.Xpath"), city);
		return this;
	}
	  //pagedown();
	public ApplicationFormpage pagedownAccess() {
		pagedown();
		return this;
	}
	
	public ApplicationFormpage selectStateName(String state) {
		selectVisibileTextByXpath(prop.getProperty("ApplicationFormpage.StateName.Xpath"), state);
		return this;
	}
	
	public ApplicationFormpage enterPincode(String pincode) {
		enterByXpath(prop.getProperty("ApplicationFormpage.Pincode.Xpath"), pincode);
		return this;
	}
	
	public ApplicationFormpage selectResidenceCountry(String country) {
		selectVisibileTextByXpath(prop.getProperty("ApplicationFormpage.ResidenceCountry.Xpath"), country);
		return this;
	}
	
	public ApplicationFormpage enterOfficeName(String officename) {
		enterByXpath(prop.getProperty("ApplicationFormpage.OfficeName.Xpath"), officename);
		return this;
	}
	
	public ApplicationFormpage enterOfficeAddress1(String offaddress1) {
		enterByXpath(prop.getProperty("ApplicationFormpage.OfficeAddress1.Xpath"), offaddress1);
		return this;
	}
	
	public ApplicationFormpage enterOfficeAddress2(String offaddress2) {
		enterByXpath(prop.getProperty("ApplicationFormpage.OfficeAddress2.Xpath"), offaddress2);
		return this;
	}
	
	public ApplicationFormpage enterOfficeCityName(String offcity) {
		enterByXpath(prop.getProperty("ApplicationFormpage.OfficeCityName.Xpath"), offcity);
		return this;
	}
	
	public ApplicationFormpage selectOfficeStateName(String offstate) {
		selectVisibileTextByXpath(prop.getProperty("ApplicationFormpage.OfficeStateName.Xpath"), offstate);
		return this;
	}
	
	public ApplicationFormpage enterOfficePincode(String offpincode) {
		enterByXpath(prop.getProperty("ApplicationFormpage.OfficePincode.Xpath"), offpincode);
		return this;
	}
	
	public ApplicationFormpage selectofficeResidenceCountry(String offcountry) {
		selectVisibileTextByXpath(prop.getProperty("ApplicationFormpage.officeResidenceCountry.Xpath"), offcountry);
		return this;
	}
	
	public ApplicationFormpage selectIDProof(String IDproof) {
		selectVisibileTextByXpath(prop.getProperty("ApplicationFormpage.IDProof.Xpath"), IDproof);
		return this;
	}
	
	public ApplicationFormpage selectAddressProof(String addressproof) {
		selectVisibileTextByXpath(prop.getProperty("ApplicationFormpage.AddressProof.Xpath"), addressproof);
		return this;
	}
	
	public ApplicationFormpage selectDOBProof(String dobproof) {
		selectVisibileTextByXpath(prop.getProperty("ApplicationFormpage.DOBProof.Xpath"), dobproof);
		return this;
	}
	
	public ApplicationFormpage selectAadharProof(String aadharproof) {
		selectVisibileTextByXpath(prop.getProperty("ApplicationFormpage.AadharProof.Xpath"), aadharproof);
		return this;
	}
	
	public ApplicationFormpage selectOfficeAddressProof(String offaddressproof) {
		selectVisibileTextByXpath(prop.getProperty("ApplicationFormpage.OfficeAddressProof.Xpath"), offaddressproof);
		return this;
	}
	//pagedown();
	
	public ApplicationFormpage clickOnCheckBox() {
		clickByXpath(prop.getProperty("ApplicationFormpage.CheckBox.Xpath"));
		return this;
	}
}
