package pom.irctc.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.irctc.pages.CovidAlertPage;
import wrappers.ProjectWrappers;

public class TC006 extends ProjectWrappers {

	@BeforeClass
	public void beforeClass() {
		testCaseName="TC006";
		testCaseDescription="To Verify irctcFTR Registration";
		author="Syam";
		category="Smoke";
		browserName="chrome";
		appName="irctcFTR";
		sheetName="Sheet6";
	}
	
	@Test(dataProvider="fetchData")
	public void irctcFTR(String id, String password, String confirmpassword, String securityquestion, String securityanswer, String DOByear, String DOBmonth, String DOBday, String gender, String status, String email, String occupation, String firstname, String middlename, String lastname, String nationality, String flat, String street, String area, String country, String mobile, String pincode, String postoffice, String offflat, String offstreet, String offarea, String offcountry, String offmobile, String offpincode, String offpostoffice) {
		
		new CovidAlertPage(driver,test)
		.clickOnOk()
		.mouseHoverOnHolidays()
		.mouseHoverOnStays()
		.clickOnLounge()
		.switchToNewWindow() //doubt
		.clickOnMenuIcon()
		.clickOnBookyourCoach()
		.switchToNewWindow()  //doubt
		.clickOnSignUp()
		.enterUserID(id)
		.enterPassword(password)
		.entertoConfirmPassword(confirmpassword)
		.selectSecurityQuestion(securityquestion)
		.enterSecurityAnswer(securityanswer)
		.clickOnDOB()
        .selectDOBYear(DOByear)
        .selectDOBMonth(DOBmonth)  //waitprop
        .sleep(2000)
        .clickOnDOBDate(DOBday)
        .sleep(2000)
        .clickOnGender(gender)
        .clickOnMartialStatus(status)
        .enterEmailID(email)
        .selectOccupation(occupation)
        .enterFirstName(firstname)
        .enterMiddleName(middlename)
        .enterLastName(lastname)
        .selectNationaity(nationality)
        .enterFlatNo(flat)
        .enterStreetName(street)
        .enterAreaName(area)
        .selectCountry(country)
        .enterMobileNo(mobile)
        .enterPincode(pincode)
        .enterCityandStatebyTabKey()  //TAB
        .selectPostoffice(postoffice)
        .pagedownaccess()             //pagedown
        .clickOnNoforAddress()
        .enterOfficeFlatNo(offflat)
        .enterOfficeStreetName(offstreet)
        .enterOfficeAreaName(offarea)
        .selectOfficeCountry(offcountry)
        .enterOfficeMobileNo(offmobile)
        .enterOfficePincode(offpincode)      
        .enterCityandStatebyTabKey()  //accessing TAB with before method created
        .selectOfficePostOffice(offpostoffice);
	}
}
