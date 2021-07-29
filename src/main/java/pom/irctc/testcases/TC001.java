package pom.irctc.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.facebook.pages.Homepage;
import wrappers.ProjectWrappers;

public class TC001 extends ProjectWrappers {

	@BeforeClass
	public void beforeClass() {
		testCaseName="TC001";
		testCaseDescription="To Verify Facebook SignUp";
		author="Syam";
		category="Smoke";
		browserName="chrome";
		appName="facebook";
		sheetName="Sheet1";
	}
	
	@Test(dataProvider="fetchData")
	public void facebook(String firstName, String lastName, String email, String confirmEmail, String password, String date, String month, String year, String gender) {
	
		new Homepage(driver,test)
		.clickOnselectLanguage()
		.clickOnCreateNewAccount()
		.enterFirstName(firstName)      
		.enterLastName(lastName)
		.enterEmailId(email)
		.enterEmailIdtoConfirm(confirmEmail)
		.enterPassword(password)
		.selectDay(date)
		.selectMonth(month)
		.selectYear(year)
		.clickOnGender(gender);
	}
}
