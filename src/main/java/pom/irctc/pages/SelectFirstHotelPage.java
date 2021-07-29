package pom.irctc.pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.GenericWrappers;

public class SelectFirstHotelPage extends GenericWrappers {

	public SelectFirstHotelPage(RemoteWebDriver driver, ExtentTest test) {
		this.driver=driver;
		this.test=test;
	}

	public RequiredHotelPage clickOnFirstHotel() {     
		clickByXpath(prop.getProperty("SelectFirstHotelPage.FirstHotel.Xpath"));  
		return new RequiredHotelPage(driver,test);  
	}
}
