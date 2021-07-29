package pom.irctc.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.phptravels.pages.Registrationpage;
import wrappers.ProjectWrappers;

public class TC002 extends ProjectWrappers{

	@BeforeClass
	public void beforeClass() {
		testCaseName="TC002";
		testCaseDescription="To Verify phpTravels Registration";
		author="Syam";
		category="Smoke";
		browserName="chrome";
		appName="phptravels";
		sheetName="Sheet2";
	}
	
	@Test(dataProvider="fetchData")
	public void phptravels(String firstName, String lastName, String email, String phone, String companyname, String address1, String address2, String city, String state, String pincode, String country, String info1, String info2) {
		
		new Registrationpage(driver,test)
		.enterFirstName(firstName)
		.enterLastName(lastName)
		.enterEmailId(email)
		.enterphoneNo(phone)
		.enterCompanyName(companyname)
		.enterAddress1(address1)
		.enterAddress2(address2)
		.enterCity(city)
		.enterState(state)
		.enterPincode(pincode)
		.selectCountry(country)
		.selectAdditionalinfo1(info1)
		.enterAdditionalinfo2(info2)
		.clickOnGeneratePassword()   //waitprop
		.clickOnGeneratenewPassword()
		.clickOnCopyandInsert()
		.clickOnMailrequest();
	}
}
