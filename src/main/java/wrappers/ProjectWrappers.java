package wrappers;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;

import utils.DP;

public class ProjectWrappers extends GenericWrappers {

	public String browserName;
	public String appName;
	
	public static String sheetName;
	
	
	@BeforeSuite
	public void beforeSuite() {
	   	startReport();
	}
	
	@BeforeTest
	public void beforeTest() {
		loadObject();
	}
	
	
	@BeforeMethod
	public void beforeMethod() {
		startTest(testCaseName, testCaseDescription);
		switch (appName) {
		case "facebook":
			invokeApp(browserName, "http://www.facebook.com");
			break;
		case "phptravels":
			invokeApp(browserName, "https://www.phptravels.org/register.php");
			break;
		case "panapplicationform":
			invokeApp(browserName, "https://panind.com/india/new_pan/");
			break;
		case "visaapplication":
			invokeApp(browserName, "https://app.onlineusvisa.com/basic-details/in?origin=home&country=in&type=N#");
			break;
		case "irctcRegistration":
			invokeApp(browserName, " https://www.irctc.co.in/nget/train-search");
			break;
		case "irctcFTR":
			invokeApp(browserName, " https://www.irctc.co.in/nget/train-search");
			break;
		case "irctcSaloon":
			invokeApp(browserName, " https://www.irctc.co.in/nget/train-search");
			break;
		case "irctcOTP":
			invokeApp(browserName, " https://www.irctc.co.in/nget/train-search");
			break;
		case "irctcGST":
			invokeApp(browserName, " https://www.irctc.co.in/nget/train-search");
			break;
		case "formC":
			invokeApp(browserName, " https://indianfrro.gov.in/frro/FormC/menuuserreg.jsp");
			break;
		default:
			System.err.println("Invalid Application Selected");
			break;
		}
	}
	
	@AfterMethod
	public void afterMethod() {
	   closeAllBrowsers();	
	}
	
	@AfterClass
	public void afterClass() {
	    endTest();	
	}
	
	@AfterTest
	public void afterTest() {
		unloadObject();
	}
	
	@AfterSuite
	public void afterSuite() {
		endReport();
	}
	
	@DataProvider(name="fetchData")
	public static String[][] dataProvider() {
		
		return DP.getData(sheetName);
	}
	
}
