package utils;

import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class SampleReport {
	
	@Test
	public void report() {
		
		// start report
		
		ExtentReports report = new ExtentReports("./reports/Result.html", false);
		
		// start Test
		
		ExtentTest test = 	report.startTest("TC005", "To verify whether the user is able to create account in IRCTC application");
		
		test.assignAuthor("Syam");
		test.assignCategory("Functional");
		
		// log test steps
		test.log(LogStatus.PASS, "Application launched with the given url usccessfully");
		test.log(LogStatus.PASS, "Application launched with the given url usccessfully");
		test.log(LogStatus.PASS, "Application launched with the given url usccessfully");
		test.log(LogStatus.PASS, "Application launched with the given url usccessfully");
		test.log(LogStatus.PASS, "Application launched with the given url usccessfully");
		test.log(LogStatus.PASS, "Application launched with the given url usccessfully");
		test.log(LogStatus.PASS, "Application launched with the given url usccessfully");
		test.log(LogStatus.PASS, "Application launched with the given url usccessfully");
		test.log(LogStatus.PASS, "Application launched with the given url usccessfully");
		test.log(LogStatus.PASS, "Application launched with the given url usccessfully");
		test.log(LogStatus.PASS, "Application launched with the given url usccessfully");
		test.log(LogStatus.PASS, "Application launched with the given url usccessfully");
		test.log(LogStatus.PASS, "Application launched with the given url usccessfully");
		test.log(LogStatus.PASS, "Application launched with the given url usccessfully");
		test.log(LogStatus.PASS, "Application launched with the given url usccessfully");
		test.log(LogStatus.PASS, "Application launched with the given url usccessfully");
		test.log(LogStatus.PASS, "Application launched with the given url usccessfully");
		test.log(LogStatus.PASS, "Application launched with the given url usccessfully");
		
		// end test
		report.endTest(test);
		
		// end report
		report.flush();
		
	}
	
	

}
