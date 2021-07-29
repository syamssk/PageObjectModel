package pom.irctc.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.irctc.pages.CovidAlertPage;
import wrappers.ProjectWrappers;

public class TC009 extends ProjectWrappers {

	@BeforeClass
	public void beforeClass() {
		testCaseName="TC009";
		testCaseDescription="To Verify irctcGST Validation";
		author="Syam";
		category="Smoke";
		browserName="chrome";
		appName="irctcGST";
		sheetName="Sheet9";
	}
	
	@Test(dataProvider="fetchData")
	public void irctcGSTValidation(String email, String mobile, String inyear, String inmonth, String inday, String outyear, String outmonth, String outday, String rooms, String adults, String title, String firstname, String lastname, String state, String gstno, String company, String city, String gsttext) {
		
		new CovidAlertPage(driver,test)
		.clickOnOk()
		.mouseHoverOnHolidays()
		.mouseHoverOnStays()
		.clickOnLounge()
		.switchToNewWindow() //doubt
		.clickOnHotelsIcon()
		.switchToNewWindow()
		.clickOnLogIn()
		.clickOnGuestUserLogin()
		.enterEmailID(email)
		.enterMobileNo(mobile)
		.clickOnSignIn()
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
		.selectGSTasYES()
		.enterGSTNo(gstno)
		.enterCompanyName(company)
		.enterCompanyAddress(city)
		.pageDown()
		.clickOnGoforGSTNo()
		.verifyTextUnderGSTNo(gsttext);
	}
}
