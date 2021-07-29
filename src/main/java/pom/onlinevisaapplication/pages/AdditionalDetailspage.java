package pom.onlinevisaapplication.pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.GenericWrappers;

public class AdditionalDetailspage extends GenericWrappers {

	public AdditionalDetailspage(RemoteWebDriver driver, ExtentTest test) {
		this.driver=driver;
		this.test=test;
	}
	
	public AdditionalDetailspage enterLanguages(String language) {
		enterByXpath(prop.getProperty("AdditionalDetailspage.Languages.Xpath"), language);
		return this;
	}
	
	public AdditionalDetailspage selectMartialStatus(String status) {
		selectVisibileTextByXpath(prop.getProperty("AdditionalDetailspage.MartialStatus.Xpath"), status);
		return this;
	}
	
	public AdditionalDetailspage selectPurposeofTrip(String purpose) {
		selectVisibileTextByXpath(prop.getProperty("AdditionalDetailspage.PurposeofTrip.Xpath"), purpose);
		return this;
	}
	
	public AdditionalDetailspage selectLocationLanguage(String locationlanguage) {
		selectVisibileTextByXpath(prop.getProperty("AdditionalDetailspage.LocationLanguage.Xpath"), locationlanguage);
		return this;
	}
	//pagedown,waitprop
	public AdditionalDetailspage pagedownAccess() {
	    pagedown();
	    return this;
	}
	
	public AdditionalDetailspage clickOnAcceptTerms() {
		clickByXpath(prop.getProperty("AdditionalDetailspage.AcceptTerms.Xpath"));
		return this;
	}
	
	/*public AdditionalDetailspage clickOnlastStep() {
		clickByXpath("//button[@id='siguiente']");
		return this;
	}*/
}
