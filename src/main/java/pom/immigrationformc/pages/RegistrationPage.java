package pom.immigrationformc.pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.GenericWrappers;

public class RegistrationPage extends GenericWrappers{

	public RegistrationPage(RemoteWebDriver driver, ExtentTest test) {
		this.driver=driver;
		this.test=test;
	}
	
	public RegistrationPage enterUserID(String idname) {
		enterByXpath(prop.getProperty("RegistrationPage.UserID.Xpath"), idname);
		return this;
	}
	
	public RegistrationPage enterPassword(String password) {
		enterByXpath(prop.getProperty("RegistrationPage.Password.Xpath"), password);
		return this;
	}
	
	public RegistrationPage entertoConfirmPassword(String cnfpassword) {
		enterByXpath(prop.getProperty("RegistrationPage.ConfirmPassword.Xpath"), cnfpassword);
		return this;
	}
	
	public RegistrationPage selectSecurityQuestion(String question) {
		selectVisibileTextByXpath(prop.getProperty("RegistrationPage.SecurityQuestion.Xpath"), question);
		return this;
	}
	
	public RegistrationPage enterSecurityAnswer(String answer) {
		enterByXpath(prop.getProperty("RegistrationPage.SecurityAnswer.Xpath"), answer);
		return this;
	}
	
	public RegistrationPage enterUserName(String username) {
		enterByXpath(prop.getProperty("RegistrationPage.UserName.Xpath"), username);
		return this;
	}
	
	public RegistrationPage selectGender(String gender) {
		selectVisibileTextByXpath(prop.getProperty("RegistrationPage.Gender.Xpath"), gender);
		return this;
	}
	
	public RegistrationPage sleep(long time) {
		waitProperty(time);
		return this;
	}
	
	public RegistrationPage enterDateofBirth(String dob) {
		enterByXpath(prop.getProperty("RegistrationPage.DateofBirth.Xpath"), dob);
		return this;
	}
	
	public RegistrationPage enterDesignation(String designation) {
		enterByXpath(prop.getProperty("RegistrationPage.Designation.Xpath"), designation);
		return this;
	}
	
	public RegistrationPage enterEmailID1(String emailid) {
		enterByXpath(prop.getProperty("RegistrationPage.EmailID1.Xpath"), emailid);
		return this;
	}
	
	public RegistrationPage enterMobileNo1(String mobile) {
		enterByXpath(prop.getProperty("RegistrationPage.MobileNo1.Xpath"), mobile);
		return this;
	}
	
	public RegistrationPage enterPhoneNo1(String phone) {
		enterByXpath(prop.getProperty("RegistrationPage.PhoneNo1.Xpath"), phone);
		return this;
	}
	
	public RegistrationPage selectNationality(String nationality) {
		selectVisibileTextByXpath(prop.getProperty("RegistrationPage.Nationality.Xpath"), nationality);
		return this;
	}
	
	public RegistrationPage enterName(String name) {
		enterByXpath(prop.getProperty("RegistrationPage.Name.Xpath"), name);
		return this;
	}
	
	public RegistrationPage enterCapacity(String capacity) {
		enterByXpath(prop.getProperty("RegistrationPage.Capacity.Xpath"), capacity);
		return this;
	}
	
	public RegistrationPage enterAddress(String address) {
		enterByXpath(prop.getProperty("RegistrationPage.Address.Xpath"), address);
		return this;
	}
	
	public RegistrationPage selectState(String state) {
		selectVisibileTextByXpath(prop.getProperty("RegistrationPage.State.Xpath"), state);
		return this;
	}
	//waitprop
	
	public RegistrationPage selectDistrict(String district) {
		selectVisibileTextByXpath(prop.getProperty("RegistrationPage.District.Xpath"), district);
		return this;
	}
	
	public RegistrationPage selectAccomodation(String accomodation) {
		selectVisibileTextByXpath(prop.getProperty("RegistrationPage.Accomodation.Xpath"), accomodation);
		return this;
	}
	
	public RegistrationPage selectRating(String rating) {
		selectVisibileTextByXpath(prop.getProperty("RegistrationPage.Rating.Xpath"), rating);
		return this;
	}
	
	public RegistrationPage enterEmailID2(String email) {
		enterByXpath(prop.getProperty("RegistrationPage.EmailID2.Xpath"), email);
		return this;
	}
	
	public RegistrationPage enterMobileNo2(String mcontact) {
		enterByXpath(prop.getProperty("RegistrationPage.MobileNo2.Xpath"), mcontact);
		return this;
	}
	
	public RegistrationPage enterPhoneNo2(String contact) {
		enterByXpath(prop.getProperty("RegistrationPage.PhoneNo2.Xpath"), contact);
		return this;
	}
	//waitprop
	
	public RegistrationPage enterName1(String name1) {
		enterByXpath(prop.getProperty("RegistrationPage.Name1.Xpath"), name1);
		return this;
	}
	
	public RegistrationPage enterAddress1(String address1) {
		enterByXpath(prop.getProperty("RegistrationPage.Address1.Xpath"), address1);
		return this;
	}
	
	public RegistrationPage selectState1(String state1) {
		selectVisibileTextByXpath(prop.getProperty("RegistrationPage.State1.Xpath"), state1);
		return this;
	}
	//waitprop
	
	public RegistrationPage selectDistrict1(String district1) {
		selectVisibileTextByXpath(prop.getProperty("RegistrationPage.District1.Xpath"), district1);
		return this;
	}
	
	public RegistrationPage enterEmail1(String email1) {
		enterByXpath(prop.getProperty("RegistrationPage.District1.Xpath"), email1);
		return this;
	}
	
	public RegistrationPage enterPhone1(String phone1) {
		enterByXpath(prop.getProperty("RegistrationPage.Phone1.Xpath"), phone1);
		return this;
	}
	
	public RegistrationPage enterMobile1(String mobile1) {
		enterByXpath(prop.getProperty("RegistrationPage.Mobile1.Xpath"), mobile1);
		return this;
	}
	
	public RegistrationPage clickOnAdd() {
		clickByXpath(prop.getProperty("RegistrationPage.Add.Xpath"));
		return this;
	}
	//waitprop
	
	public RegistrationPage enterName2(String name2) {
		enterByXpath(prop.getProperty("RegistrationPage.Name2.Xpath"), name2);
		return this;
	}
	
	public RegistrationPage enterAddress2(String address2) {
		enterByXpath(prop.getProperty("RegistrationPage.Address2.Xpath"), address2);
		return this;
	}
	
	public RegistrationPage selectState2(String state2) {
		selectVisibileTextByXpath(prop.getProperty("RegistrationPage.State2.Xpath"), state2);
		return this;
	}
	//waitprop
	
	public RegistrationPage selectDistrict2(String district2) {
		selectVisibileTextByXpath(prop.getProperty("RegistrationPage.District2.Xpath"), district2);
		return this;
	}
	
	public RegistrationPage enterEmail2(String email2) {
		enterByXpath(prop.getProperty("RegistrationPage.Email2.Xpath"), email2);
		return this;
	}
	
	public RegistrationPage enterPhone2(String phone2) {
		enterByXpath(prop.getProperty("RegistrationPage.Phone2.Xpath"), phone2);
		return this;
	}
	
	public RegistrationPage enterMobile2(String mobile2) {
		enterByXpath(prop.getProperty("RegistrationPage.Mobile2.Xpath"), mobile2);
		return this;
	}
	
	//Use cickOnAdd() method again
	//waitprop
	
	public RegistrationPage enterName3(String name3) {
		enterByXpath(prop.getProperty("RegistrationPage.Name3.Xpath"), name3);
		return this;
	}
	
	public RegistrationPage enterAddress3(String address3) {
		enterByXpath(prop.getProperty("RegistrationPage.Address3.Xpath"), address3);
		return this;
	}
	
	public RegistrationPage selectState3(String state3) {
		selectVisibileTextByXpath(prop.getProperty("RegistrationPage.State3.Xpath"), state3);
		return this;
	}
	//waitprop
	
	public RegistrationPage selectDistrict3(String district3) {
		selectVisibileTextByXpath(prop.getProperty("RegistrationPage.District3.Xpath"), district3);
		return this;
	}
	
	public RegistrationPage enterEmail3(String email3) {
		enterByXpath(prop.getProperty("RegistrationPage.Email3.Xpath"), email3);
		return this;
	}
	
	public RegistrationPage enterPhone3(String phone3) {
		enterByXpath(prop.getProperty("RegistrationPage.Phone3.Xpath"), phone3);
		return this;
	}
	
	public RegistrationPage enterMobile3(String mobile3) {
		enterByXpath(prop.getProperty("RegistrationPage.Mobile3.Xpath"), mobile3);
		return this;
	}
}
