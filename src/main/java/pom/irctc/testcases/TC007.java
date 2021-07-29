package pom.irctc.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.irctc.pages.CovidAlertPage;
import wrappers.ProjectWrappers;

public class TC007 extends ProjectWrappers {

	@BeforeClass
	public void beforeClass() {
		testCaseName="TC007";
		testCaseDescription="To Verify irctcSaloon";
		author="Syam";
		category="Smoke";
		browserName="chrome";
		appName="irctcSaloon";
		sheetName="Sheet7";
	}
	
	@Test(dataProvider="fetchData")
	public void irctcSaloonMandatoryCheck(String name, String organisation, String address, String mobile, String email, String origin, String destination, String day1, String period, String coach, String Passengers, String purpose, String services) {
		
		new CovidAlertPage(driver,test)
		.clickOnOk()
		.mouseHoverOnHolidays()
		.mouseHoverOnStays()
		.clickOnLounge()
		.switchToNewWindow() //doubt
		.clickOnMenuIcon()
		.clickOnCharter()
		.clickOnEnquiryForm()
		.enterName(name)
		.enterOrganisation(organisation)
		.enterAddress(address)
		.enterMobile(mobile)
		.enterEmailID(email)
		.selectSaloonCharter()
		.enterOriginatingStation(origin)
		.enterDestinationStation(destination)
		.clickOnDateofDepature()
		/*.sleep(2000)
		.selectDepatureYear("2021")*/
		.clickOnDepatureMonth()   //*noofclicks& waitprop
		.clickOnDepatureDay(day1)
		.clickOnDateofArrival()
		/*.sleep(2000)
		.selectArrivalYear("2021")*/
		.clickOnArrivalMonth()   //*noofclicks& waitprop)
		.clickOnArrivalDay()
		.enterDurationofTour(period)
		.enterTypeofCoaches(coach)
		.enterNoofPassengers(Passengers)
		.enterPurposeofCharter(purpose)
		.enterAdditionalServices(services)
		.clickOnSubmit()
		.verifyTextBelowMobileField("Mobile no. not valid");
	}
}
