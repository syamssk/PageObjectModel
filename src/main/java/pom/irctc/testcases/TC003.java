package pom.irctc.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.panapplicationform.pages.ApplicationFormpage;
import wrappers.ProjectWrappers;

public class TC003 extends ProjectWrappers {

	@BeforeClass
	public void beforeClass() {
		testCaseName="TC003";
		testCaseDescription="To Verify panapplicationform Registration";
		author="Syam";
		category="Smoke";
		browserName="chrome";
		appName="panapplicationform";
		sheetName="Sheet3";
	}
	
	@Test(dataProvider="fetchData")
	public void panapplicationform(String title, String firstname, String middlename, String lastname, String Ffirstname, String Fmiddlename, String Flastname, String mobile, String email, String income, String dob, String address1, String address2, String city, String state, String pincode, String country, String officename, String offadd1, String offadd2, String offcity, String offstate, String offpincode, String offcountry, String IDproof, String Addproof, String DOBproof, String Aadharproof, String offAddproof) {
		
		new ApplicationFormpage(driver,test)
		.selectTitle(title)
		.enterFirstName(firstname)
		.enterMiddleName(middlename)
		.enterLastName(lastname)
		.enterFatherFirstName(Ffirstname)
		.enterFatherMiddleName(Fmiddlename)
		.enterFatherLastName(Flastname)
		.enterMobileNumber(mobile)
		.enterEmailId(email)
		.selectSourceofIncome(income)
		.clickOnOffice()
		.enterDOB(dob)
		.enterAddress1(address1)
		.enterAddress2(address2)
		.enterCityName(city)    //pagedown
		.pagedownAccess()
		.selectStateName(state)
		.enterPincode(pincode)
		.selectResidenceCountry(country)
		.enterOfficeName(officename)
		.enterOfficeAddress1(offadd1)
		.enterOfficeAddress2(offadd2)
		.enterOfficeCityName(offcity)
		.selectOfficeStateName(offstate)
		.enterOfficePincode(offpincode)
		.selectofficeResidenceCountry(offcountry)
		.selectIDProof(IDproof)
		.selectAddressProof(Addproof)
		.selectDOBProof(DOBproof)
		.selectAadharProof(Aadharproof)
		.selectOfficeAddressProof(offAddproof) //pagedown
		.pagedownAccess()
		.clickOnCheckBox();
	}
}
