package pom.irctc.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.immigrationformc.pages.HomePage;
import wrappers.ProjectWrappers;

public class TC0010 extends ProjectWrappers{
	
	@BeforeClass
	public void beforeClass() {
		testCaseName="TC0010";
		testCaseDescription="To Verify Immigration FormC";
		author="Syam";
		category="Smoke";
		browserName="chrome";
		appName="formC";
		sheetName="Sheet10";
	}
	
	@Test(dataProvider="fetchData")
	public void immigrationFormC(String idname, String password, String cnfpassword, String question, String answer, String username, String gender, String dob, String designation, String emailid, String mobile, String phone, String nationality, String name, String capacity, String address, String state, String district, String accomodation, String rating, String email, String mcontact, String contact, String name1, String address1, String state1, String district1, String email1, String phone1, String mobile1, String name2, String address2, String state2, String district2, String email2, String phone2, String mobile2, String name3, String address3, String state3, String district3, String email3, String phone3, String mobile3) {
		
		new HomePage(driver,test)
		.clickOnSignUporRegistration()
		.enterUserID(idname)
		.enterPassword(password)
		.entertoConfirmPassword(cnfpassword)
		.selectSecurityQuestion(question)
		.enterSecurityAnswer(answer)
		.enterUserName(username)
		.selectGender(gender)
		.sleep(1000)
		.enterDateofBirth(dob)    
		.enterDesignation(designation)
		.enterEmailID1(emailid)
		.enterMobileNo1(mobile)
		.enterPhoneNo1(phone)
		.selectNationality(nationality)
		.enterName(name)
		.enterCapacity(capacity)
		.enterAddress(address)
		.selectState(state)       
		.sleep(1000)
		.selectDistrict(district)  
		.selectAccomodation(accomodation)
		.selectRating(rating)
		.enterEmailID2(email)
		.enterMobileNo2(mcontact)
		.enterPhoneNo2(contact)
		.enterName1(name1)
		.enterAddress1(address1)
		.selectState1(state1)   
		.sleep(1000)
		.selectDistrict1(district1)
		.enterEmail1(email1)
		.enterPhone1(phone1)
		.enterMobile1(mobile1)
		.clickOnAdd()       
		.sleep(1000)
		.enterName2(name2)
		.enterAddress2(address2)
		.selectState2(state2)   
		.sleep(1000)
		.selectDistrict2(district2)
		.enterEmail2(email2)
		.enterPhone2(phone2)
		.enterMobile2(mobile2)
		.clickOnAdd()       
		.sleep(1000)
		.enterName3(name3)
		.enterAddress3(address3)
		.selectState3(state3)   
		.sleep(1000)
		.selectDistrict3(district3)
		.enterEmail3(email3)
		.enterPhone3(phone3)
		.enterMobile3(mobile3);
	}

}
