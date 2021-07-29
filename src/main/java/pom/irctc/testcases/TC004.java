package pom.irctc.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.onlinevisaapplication.pages.PersonalInformationpage;
import wrappers.ProjectWrappers;

public class TC004 extends ProjectWrappers {

	@BeforeClass
	public void beforeClass() {
		testCaseName="TC004";
		testCaseDescription="To Verify onlinevisaapplication Registration";
		author="Syam";
		category="Smoke";
		browserName="chrome";
		appName="visaapplication";
		sheetName="Sheet4";
	}
	
	@Test(dataProvider="fetchData")
	public void onlinevisapplication(String name, String surname, String nativename, String othersurname, String othergivenname, String email, String email1, String addemail, String DOBYear, String DOBMonth, String DOBDay, String city, String state, String country, String nationality, String othercountry, String add1, String add2, String contactcity, String contactstate, String pincode, String phone, String contactcountry, String region, String language, String status, String purpose, String locationlanguage) {
	
		new PersonalInformationpage(driver,test)
		.enterName(name)
		.enterSurname(surname)
		.enterFullname(nativename)
		.clickOthername()
		.enterOtherSurname(othersurname)
		.enterOtherGivenname(othergivenname)
		.enterEmailID(email)
		.confirmEmailID(email1)
		.pagedownAccess()
		.sleep(1000)
		.clickOnAdditionalEmailID()
		.enterAdditionalEmailID(addemail)
		.clickOnGender()
		.clickOnDOB()
		.selectDOByear(DOBYear)
		.selectDOBmonth(DOBMonth)  //waitprop
		.clickonDOBday(DOBDay)     //By dayno text
		.enterCityofBirth(city)
		.enterStateofBirth(state)
		.selectCountry(country)
		.selectNationality(nationality)
		.pagedownAccess()
		.clickOnPerminantResident()
		.selectPerminantOtherCountry(othercountry)
		.clickOnNext()
		.enterStreetAddress1(add1)
		.enterStreetAddress2(add2)
		.enterContactCity(contactcity)
		.enterContactState(contactstate)
		.enterPincode(pincode)
		.clickOnCountryFlag_notaDropdown()
		.clickOnCountryCode_notaDropdown()    //******//waitprop
		.enterPhoneNumber(phone)
		.clickOnNoOtherPhoneNo()
		.selectCountryofResidence(contactcountry)       //waitprop
		.pagedownAccess()
		.selectStateofResidence(region)
		.clickOnNext()
		.enterLanguages(language)
		.selectMartialStatus(status)
		.selectPurposeofTrip(purpose)
		.selectLocationLanguage(locationlanguage)     //pagedown,waitprop
		.pagedownAccess()
		.clickOnAcceptTerms();
	}
}
