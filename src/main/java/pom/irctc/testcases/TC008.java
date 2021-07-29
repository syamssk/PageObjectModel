package pom.irctc.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.irctc.pages.CovidAlertPage;
import wrappers.ProjectWrappers;

public class TC008 extends ProjectWrappers {

	@BeforeClass
	public void beforeClass() {
		testCaseName="TC008";
		testCaseDescription="To Verify irctcOTP Validation";
		author="Syam";
		category="Smoke";
		browserName="chrome";
		appName="irctcOTP";
		sheetName="Sheet8";
	}
	
	@Test(dataProvider="fetchData")
	public void irctcOTPValidation(String email, String mobile, String inyear, String inmonth, String inday, String outyear, String outmonth, String outday, String rooms, String adults, String title, String firstname, String lastname, String state, String hotelname, String amount, String otptext) {
	
		new CovidAlertPage(driver,test)
		.clickOnOk()
		.mouseHoverOnHolidays()
		.mouseHoverOnStays()
		.clickOnLounge()
		.switchToNewWindow() //doubt
		.clickOnHotelsIcon()
		.switchToNewWindow()
		.clickOnLogIn()            //waitprop
		.clickOnGuestUserLogin()   //waitprop
		.enterEmailID(email)
		.enterMobileNo(mobile)
		.clickOnSignIn()
		.sleep(2000)
		.enterHotelorCityName("Hyderabad")   //waitprop
		.clickOnCityName()        //waitprop
		.clickOnCheckInDate()
		.clickOnCheckInDateYearICON()
		.clickOnCheckInDateYear(inyear)
		.clickOnCheckInDateMonth(inmonth)  //waitprop
		.clickOnCheckInDateDay(inday)
		.clickOnCheckOutDate()
		.clickOnCheckOutDateYearICON()
		.clickOnCheckOutDateYear(outyear)
		.clickOnCheckOutDateMonth(outmonth) //waitprop
		.clickOnCheckOutDateDay(outday)
		.clickOnRoomsandGuests()
		.selectRooms(rooms)
		.selectAdults(adults)
		.clickOnDoneRoomsandGuests()
		.clickOnFindHotel()
		.clickOnFirstHotel()
		.switchToNewWindow()
		.getTextofHotelName()   //waitprop
		.getPriceofHotel()
		.clickOnContinuetoBook()
		.selectTitle(title)
		.enterFirstName(firstname)
		.enterLastName(lastname)
		.selectState(state)
		.selectGSTasNO() 
		.verifyHotelName(hotelname)
		.verifyAmount(amount)
		.pageDown()
		.clickOnGO()
		.sleep(2000)
		.clickOnIagree()
		.clickOnMakePayment()
		.clickOnVerifyinOTPpopup()
		.verifyTextinOTPpopup(otptext);
	}
}
