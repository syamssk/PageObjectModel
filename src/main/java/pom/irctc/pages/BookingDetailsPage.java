package pom.irctc.pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.GenericWrappers;

public class BookingDetailsPage extends GenericWrappers{

	public BookingDetailsPage(RemoteWebDriver driver, ExtentTest test) {
		this.driver=driver;
		this.test=test;
	}
	
	public BookingDetailsPage clickOnIagree() {
		clickByXpath(prop.getProperty("BookingDetailsPage.Iagree.Xpath"));
		return this;
	}
	
	public BookingDetailsPage clickOnMakePayment() {
		clickByXpath(prop.getProperty("BookingDetailsPage.MakePayment.Xpath"));
		return this;
	}
	
	public BookingDetailsPage clickOnVerifyinOTPpopup() {
		clickByXpath(prop.getProperty("BookingDetailsPage.VerifyinOTPpopup.Xpath"));
		return this;
	}
	
	public BookingDetailsPage verifyTextinOTPpopup(String otptext) {
		verifyTextByXpath(prop.getProperty("BookingDetailsPage.verifyTextinOTPpopup.Xpath"), otptext);
		return this;
	}
	
	public BookingDetailsPage sleep(long time) {
		waitProperty(time);
		return this;
	}
}
