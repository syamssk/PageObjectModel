package pom.irctc.pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.GenericWrappers;

public class HotelBookingPersonalDetailsPage extends GenericWrappers {

	public HotelBookingPersonalDetailsPage(RemoteWebDriver driver, ExtentTest test) {
		this.driver=driver;
		this.test=test;
	}
	
	public HotelBookingPersonalDetailsPage selectTitle(String title) {
		selectVisibileTextByXpath(prop.getProperty("HotelBookingPersonalDetailsPage.Title.Xpath"), title);
		return this;
	}
	
	public HotelBookingPersonalDetailsPage enterFirstName(String firstname) {
		enterByXpath(prop.getProperty("HotelBookingPersonalDetailsPage.FirstName.Xpath"), firstname);
		return this;
	}
	
	public HotelBookingPersonalDetailsPage enterLastName(String lastname) {
		enterByXpath(prop.getProperty("HotelBookingPersonalDetailsPage.LastName.Xpath"), lastname);
		return this;
	}
	
	public HotelBookingPersonalDetailsPage selectState(String state) {
		selectVisibileTextByXpath(prop.getProperty("HotelBookingPersonalDetailsPage.State.Xpath"), state);
		return this;
	}
	
	public HotelBookingPersonalDetailsPage selectGSTasNO() {
		selectVisibileTextByXpath(prop.getProperty("HotelBookingPersonalDetailsPage.GSTasNO.Xpath"), "No");
		return this;
	}
	
	public HotelBookingPersonalDetailsPage verifyHotelName(String hotelname) {
		verifyTextByXpath(prop.getProperty("HotelBookingPersonalDetailsPage.verifyHotelName.Xpath"), hotelname);
		return this;
	}
	
	public HotelBookingPersonalDetailsPage verifyAmount(String amount) {
		verifyTextByXpath(prop.getProperty("HotelBookingPersonalDetailsPage.verifyAmount.Xpath"), amount);
		return this;
	}
	
	public BookingDetailsPage clickOnGO() {
		clickByXpath(prop.getProperty("HotelBookingPersonalDetailsPage.GO.Xpath"));
		return new BookingDetailsPage(driver,test);/*********/
	}	
	
	public HotelBookingPersonalDetailsPage selectGSTasYES() {
		selectVisibileTextByXpath(prop.getProperty("HotelBookingPersonalDetailsPage.GSTasYES.Xpath"), "Yes");
		return this;
	}
	
	public HotelBookingPersonalDetailsPage enterGSTNo(String gstno) {
		enterByXpath(prop.getProperty("HotelBookingPersonalDetailsPage.GSTNo.Xpath"), gstno);
		return this;
	}
	
	public HotelBookingPersonalDetailsPage enterCompanyName(String companyname) {
		enterByXpath(prop.getProperty("HotelBookingPersonalDetailsPage.CompanyName.Xpath"), companyname);
		return this;
	}
	
	public HotelBookingPersonalDetailsPage enterCompanyAddress(String companyaddress) {
		enterByXpath(prop.getProperty("HotelBookingPersonalDetailsPage.CompanyAddress.Xpath"), companyaddress);
		return this;
	}
	
	public HotelBookingPersonalDetailsPage clickOnGoforGSTNo() {
		clickByXpath(prop.getProperty("HotelBookingPersonalDetailsPage.GoforGSTNo.Xpath"));
		return this;
	}
	
	public HotelBookingPersonalDetailsPage verifyTextUnderGSTNo(String gsttext) {
		verifyTextByXpath(prop.getProperty("HotelBookingPersonalDetailsPage.verifyTextUnderGSTNo.Xpath"), gsttext);
		return this;
	}
	
	public HotelBookingPersonalDetailsPage pageDown() {
		pagedown();
		return this;
	}
}
