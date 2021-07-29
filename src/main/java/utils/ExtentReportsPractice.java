package utils;

import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class ExtentReportsPractice {
@Test
	public void report() {
		
		ExtentReports reports=new ExtentReports("./rep/Res.html",false);      //Start Report
		ExtentTest test= reports.startTest("TC001", "Testing Application");   //Start Test
		test.assignAuthor("SSK");
		test.assignCategory("Functional");
		test.assignCategory("Regression");
		test.assignCategory("Smoke");
		
		test.log(LogStatus.PASS, "Application Launched");                     //Log Test Steps
		test.log(LogStatus.FAIL, "Application Launched");
		test.log(LogStatus.PASS, "Application Launched");
		
		reports.endTest(test);                                                //End Test
		reports.flush();                                                      //End Report
	}
}
