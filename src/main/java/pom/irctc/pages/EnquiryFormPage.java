package pom.irctc.pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.GenericWrappers;

public class EnquiryFormPage extends GenericWrappers {

	public EnquiryFormPage(RemoteWebDriver driver, ExtentTest test) {
		this.driver=driver;
		this.test=test;
	}
	
	public EnquiryFormPage enterName(String name) {
		enterByXpath(prop.getProperty("EnquiryFormPage.Name.Xpath"), name);
		return this;
	}
	
	public EnquiryFormPage enterOrganisation(String organisation) {
		enterByXpath(prop.getProperty("EnquiryFormPage.Organisation.Xpath"), organisation);
		return this;
	}
	
	public EnquiryFormPage enterAddress(String address) {
		enterByXpath(prop.getProperty("EnquiryFormPage.Address.Xpath"), address);
		return this;
	}
	
	public EnquiryFormPage enterMobile(String mobile) {
		enterByXpath(prop.getProperty("EnquiryFormPage.Mobile.Xpath"), mobile);
		return this;
	}
	
	public EnquiryFormPage enterEmailID(String email) {
		enterByXpath(prop.getProperty("EnquiryFormPage.EmailID.Xpath"), email);
		return this;
	}
	
	public EnquiryFormPage selectSaloonCharter() {
		selectVisibileTextByXpath(prop.getProperty("EnquiryFormPage.SaloonCharter.Xpath"), "Saloon Charter");
		return this;
	}
	
	public EnquiryFormPage enterOriginatingStation(String origin) {
		enterByXpath(prop.getProperty("EnquiryFormPage.OriginatingStation.Xpath"), origin);
		return this;
	}
	
	public EnquiryFormPage enterDestinationStation(String destination) {
		enterByXpath(prop.getProperty("EnquiryFormPage.DestinationStation.Xpath"), destination);
		return this;
	}
	
	public EnquiryFormPage clickOnDateofDepature() {
		clickByXpath(prop.getProperty("EnquiryFormPage.DateofDepature.Xpath"));
		return this;
	}
	
	/*public EnquiryFormPage sleep(long time) {
		waitProperty(time);
		return this;
	} 
	
	public EnquiryFormPage selectDepatureYear(String year1) {
		selectVisibileTextByXpath("//select[@class='ng-pristine ng-valid ng-touched']", year1);
		return this;
	}*/
	
	public EnquiryFormPage clickOnDepatureMonth() {
		clickByXpath(prop.getProperty("EnquiryFormPage.DepatureMonth.Xpath")); //Month can be selected by no of clicks
		return this;
	}
	//waitproperty
	
	public EnquiryFormPage clickOnDepatureDay(String option) {
		clickByXpath(prop.getProperty("EnquiryFormPage.DepatureDay.Xpath"),option);
		return this;
	}
	
	public EnquiryFormPage clickOnDateofArrival() {
		clickByXpath(prop.getProperty("EnquiryFormPage.DateofArrival.Xpath"));
		return this;
	}
	
	/*public EnquiryFormPage selectArrivalYear(String year2) {
		selectVisibileTextByXpath("//select[@class='ng-untouched ng-pristine ng-valid']", year2);
		return this;
	}*/
	
	public EnquiryFormPage clickOnArrivalMonth() {
		clickByXpath(prop.getProperty("EnquiryFormPage.ArrivalMonth.Xpath")); //Taken Absolute Xpath & Month can be selected by no of clicks
		return this;
	}
	//waitproperty
	
	public EnquiryFormPage clickOnArrivalDay() {
		clickByXpath(prop.getProperty("EnquiryFormPage.ArrivalDay.Xpath"));   //Day 10 as default since Xpath Is not Created
		return this;
	}
	
	public EnquiryFormPage enterDurationofTour(String period) {
		enterByXpath(prop.getProperty("EnquiryFormPage.DurationofTour.Xpath"), period);
		return this;
	}
	
	public EnquiryFormPage enterTypeofCoaches(String coach) {
		enterByXpath(prop.getProperty("EnquiryFormPage.TypeofCoaches.Xpath"), coach);
		return this;
	}
	
	public EnquiryFormPage enterNoofPassengers(String Passengers) {
		enterByXpath(prop.getProperty("EnquiryFormPage.NoofPassengers.Xpath"), Passengers);
		return this;
	}
	
	public EnquiryFormPage enterPurposeofCharter(String purpose) {
		enterByXpath(prop.getProperty("EnquiryFormPage.PurposeofCharter.Xpath"), purpose);
		return this;
	}
	
	public EnquiryFormPage enterAdditionalServices(String services) {
		enterByXpath(prop.getProperty("EnquiryFormPage.AdditionalServices.Xpath"), services);
		return this;
	}
	
	public EnquiryFormPage clickOnSubmit() {
		clickByXpath(prop.getProperty("EnquiryFormPage.Submit.Xpath")); 
		return this;
	}
	
	public EnquiryFormPage verifyTextBelowMobileField(String requiredtext) {
		verifyTextByXpath(prop.getProperty("EnquiryFormPage.verifyTextBelowMobileField.Xpath"), requiredtext);
		return this;
	}
}
