package com.pcm.qa.testcases;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.pcm.qa.base.TestBase;
import com.pcm.qa.pages.FileJobSchedularPage;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class FileJobSchedularPageTest extends TestBase {

	FileJobSchedularPage FJSP;

	public ExtentTest Parent19;
	public ExtentTest child1;

	public FileJobSchedularPageTest() {
		super();
	}

	@BeforeMethod
	public void setUp() {

		FJSP = new FileJobSchedularPage();

	}

	@BeforeTest(enabled = false)
	public void setup() throws Exception {

		Extentreport();
		initialization();
	}

	@Test(priority = 1, enabled = true)
	public void ParentNodeCreation() {
		
//		_test_logger7 = _extent_report.startTest("Settings");
		Parent19 = _extent_report.startTest("File Job Schedular");
		
	}

	@Test(priority = 2, enabled = true, description = "Verifying File Job Schedular Page Title")
	public void FileJobSchedularPageTitleTest() throws InterruptedException {

		child1 = _extent_report.startTest("Verifying File Job Schedular Page Title ");
		child1.assignCategory("File Job Schedular");
		
		try {
			
			Thread.sleep(2000);
//			FJSP.SettingClick.click();
			String title = FJSP.FileJobSchedularPageTitle();
			System.out.println(title);
			if (title.equals("File Schedule")) {
				
				child1.log(LogStatus.PASS,
						"Validation successful because we are getting File Job Schedular Page title as '" + title
								+ "'");
				
			} else {
				
				child1.log(LogStatus.FAIL,
						"Validation  unsuccessful because we are getting File Job Schedular Page title as '" + title
								+ "' instead of 'File Schedule'");
				
			}
		} catch (Exception e) {
			
			child1.log(LogStatus.FAIL, e.fillInStackTrace());
			
		}
		_extent_report.endTest(child1);
	}

	@AfterTest()
	public void tearDown() {

		_test_logger7.appendChild(Parent19);

		Parent19.appendChild(child1);

		_extent_report.endTest(Parent19);

		_extent_report.endTest(_test_logger7);

		_extent_report.flush();

	}

}
