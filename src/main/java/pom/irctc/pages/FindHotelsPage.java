package pom.irctc.pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.GenericWrappers;

public class FindHotelsPage extends GenericWrappers {

	public FindHotelsPage(RemoteWebDriver driver, ExtentTest test) {
		this.driver=driver;
		this.test=test;
	}
	
	public FindHotelsPage enterHotelorCityName(String city) {         //*****//input[@class='form-control ng-untouched ng-pristine ng-valid']
		enterByXpath(prop.getProperty("FindHotelsPage.HotelorCityName.Xpath"), city);
		return this;
	}
	//waitprop
	
	public FindHotelsPage sleep(long time) {         //*****
		waitProperty(time);
		return this;
	}
	
	public FindHotelsPage clickOnCityName() {
		clickByXpath(prop.getProperty("FindHotelsPage.CityName.Xpath"));
		return this;
	}
	//waitprop
	
	public FindHotelsPage clickOnCheckInDate() {
		clickByXpath(prop.getProperty("FindHotelsPage.CheckInDate.Xpath"));
		return this;
	}
	
	public FindHotelsPage clickOnCheckInDateYearICON() {
		clickByXpath(prop.getProperty("FindHotelsPage.CheckInDateYearICON.Xpath"));
		return this;
	}
	
	public FindHotelsPage clickOnCheckInDateYear(String option) {  //2021
		clickByXpath(prop.getProperty("FindHotelsPage.CheckInDateYear.Xpath"),option);
		return this;
	}
	
	public FindHotelsPage clickOnCheckInDateMonth(String option) {
		clickByXpath(prop.getProperty("FindHotelsPage.CheckInDateMonth.Xpath"),option);  //Aug format
		return this;
	}
	//waitprop
	
	public FindHotelsPage clickOnCheckInDateDay(String option) {     //by text input
		clickByXpath(prop.getProperty("FindHotelsPage.CheckInDateDay.Xpath"),option);  
		return this;
	}
	
	public FindHotelsPage clickOnCheckOutDate() {
		clickByXpath(prop.getProperty("FindHotelsPage.CheckOutDate.Xpath"));
		return this;
	}
	
	public FindHotelsPage clickOnCheckOutDateYearICON() {
		clickByXpath(prop.getProperty("FindHotelsPage.CheckOutDateYearICON.Xpath"));
		return this;
	}
	
	public FindHotelsPage clickOnCheckOutDateYear(String option) {   //2021
		clickByXpath(prop.getProperty("FindHotelsPage.CheckOutDateYear.Xpath"),option);
		return this;
	}
	
	public FindHotelsPage clickOnCheckOutDateMonth(String option) {
		clickByXpath(prop.getProperty("FindHotelsPage.CheckOutDateMonth.Xpath"),option);  //Sep format
		return this;
	}
	//waitprop
	
	public FindHotelsPage clickOnCheckOutDateDay(String option) {     //by text input
		clickByXpath(prop.getProperty("FindHotelsPage.CheckOutDateDay.Xpath"),option);  
		return this;  
	}    
	
	public FindHotelsPage clickOnRoomsandGuests() {     
		clickByXpath(prop.getProperty("FindHotelsPage.RoomsandGuests.Xpath"));  
		return this;  
	}
	
	public FindHotelsPage selectRooms(String rooms) {
		selectVisibileTextByXpath(prop.getProperty("FindHotelsPage.Rooms.Xpath"), rooms);
		return this;
	}
	
	public FindHotelsPage selectAdults(String adults) {
		selectVisibileTextByXpath(prop.getProperty("FindHotelsPage.Adults.Xpath"), adults);
		return this;
	}
	
	public FindHotelsPage clickOnDoneRoomsandGuests() {     
		clickByXpath(prop.getProperty("FindHotelsPage.DoneRoomsandGuests.Xpath"));  
		return this;  
	}
	
	public SelectFirstHotelPage clickOnFindHotel() {     
		clickByXpath(prop.getProperty("FindHotelsPage.FindHotel.Xpath"));  
		return new SelectFirstHotelPage(driver,test);  
	}
}
