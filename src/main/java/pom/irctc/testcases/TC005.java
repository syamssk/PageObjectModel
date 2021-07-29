package pom.irctc.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.irctc.pages.CovidAlertPage;
import wrappers.ProjectWrappers;

public class TC005 extends ProjectWrappers{
	
	@BeforeClass
	public void beforeClass() {
		testCaseName="TC005";
		testCaseDescription="To Verify irctc Registration";
		author="Syam";
		category="Smoke";
		browserName="chrome";
		appName="irctcRegistration";
		sheetName="Sheet5";
	}
	
	@Test(dataProvider="fetchData")
	public void irctcRegistration(String name, String password, String confirmpassword, String language, String securityquestion, String securityanswer, String firstname, String middlename, String lastname, String occupation, String DOByear, String DOBmonth, String DOBday, String status, String country, String gender, String email, String mobile, String country1, String address1, String address2, String address3, String pincode, String district, String postoffice, String phone, String offAddress1, String offAddress2, String offAddress3, String offcountry, String offPinCode, String offstate, String offcity, String offpostoffice, String offphone) {
		
		new CovidAlertPage(driver,test)
		.clickOnOk()
		.clickOnRegister()
		.enterUserName(name)
		.enterPassword(password)
		.enterPasswordtoConfirm(confirmpassword)
		.clickOnLanguage()
		.clickOnPrefLanguageOption(language)
		.clickOnSecurityQuestion()
		.clickOnSecurityQuestionOption(securityquestion)
		.enterSecurityAnswer(securityanswer)
		.clickOnContinue()
		.enterFirstName(firstname)
		.enterMiddleName(middlename)
		.enterLastName(lastname)
		.clickOnOccupation()
		.clickOnOccupationOption(occupation)
		.clickOnDOB()
		.selectDOBYear(DOByear)
		.selectDOBMonth(DOBmonth)   //waitprop
		.clickOnDOBDate(DOBday)      //
		.clickOnMartialStatus(status)
		.selectCountry(country)
		.clickOnGender(gender)
		.enterEmailID(email)
		.enterMobileNumber(mobile)
		.selectNationality(country1)
		.clickOnContinue()
		.enterAddress1(address1)
		.enterAddress2(address2)
		.enterAddress3(address3)
		.enterPincode(pincode)
		.enterStatebyTabKey()  //ByTabKey
		.sleep(2000)
		.selectDistrict(district)
		.sleep(2000)
		.selectPostoffice(postoffice)
		.enterPhone(phone)
		.clickOnNoforOfficeAddress()
		.enterOfficeAddress1(offAddress1)
		.enterOfficeAddress2(offAddress2)
		.enterOfficeAddress3(offAddress3)
		.clickOnSelectCountry()
		.clickOnCountryOption(offcountry)
		.enterOfficePincode(offPinCode)
		.pageDownAccess()
		.enterOfficeState(offstate)
		.enterOfficeCity(offcity)
		.enterOfficePostOffice(offpostoffice)
		.enterOfficePhoneNumber(offphone);
		/*.pageDownAccess()
		.sleep(1000)
		.clickOnCheckBox();*/
	}
}
