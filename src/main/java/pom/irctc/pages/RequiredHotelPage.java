package pom.irctc.pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.GenericWrappers;

public class RequiredHotelPage extends GenericWrappers {

	public RequiredHotelPage(RemoteWebDriver driver, ExtentTest test) {
		this.driver=driver;
		this.test=test;
	}

	public RequiredHotelPage switchToNewWindow() {
		switchToLastWindow();
		return this;
	}
	
	public RequiredHotelPage getTextofHotelName() {
		getTextByXpath(prop.getProperty("RequiredHotelPage.TextofHotelName.Xpath"));
		return this;
	}
	//waitprop
	
	public RequiredHotelPage getPriceofHotel() {
		getTextByXpath(prop.getProperty("RequiredHotelPage.PriceofHotel.Xpath"));
		return this;
	}
	
	public HotelBookingPersonalDetailsPage clickOnContinuetoBook() {
		clickByXpath(prop.getProperty("RequiredHotelPage.ContinuetoBook.Xpath"));
		return new HotelBookingPersonalDetailsPage(driver,test);
	}
}
