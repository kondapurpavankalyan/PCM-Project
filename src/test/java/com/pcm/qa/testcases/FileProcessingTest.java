package com.pcm.qa.testcases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.pcm.qa.base.TestBase;
import com.pcm.qa.pages.CreateApplicationPage;
import com.pcm.qa.pages.CreatePartnerPage;
import com.pcm.qa.pages.ManageApplicationPage;
import com.pcm.qa.pages.ManagePartnerPage;
import com.pcm.qa.pages.SearchPage;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class FileProcessingTest extends TestBase{
	
	
	CreatePartnerPage CPP;
	ManagePartnerPage MPP;
	CreateApplicationPage CAP;
	ManageApplicationPage MAP;
	
	public FileProcessingTest() {
		super();
	}

	@BeforeTest
	public void setUp() throws InterruptedException {

		Extentreport();
		
		initialization();
		

	}

	@BeforeMethod
	public void createobject() {
		
		CPP = new CreatePartnerPage();
		MPP = new ManagePartnerPage();
		CAP = new CreateApplicationPage();
		MAP = new ManageApplicationPage();
	}
	
	
	public ExtentTest Parent1;
	public ExtentTest child1;
	public ExtentTest child2;
	public ExtentTest child3;
	public ExtentTest child4;
	public ExtentTest child5;
	
	@Test(priority = 1, enabled = true)
	public void ParentNodeCreation() {
		_test_logger100 = _extent_report.startTest("FILE PROCRESSING");
		Parent1 = _extent_report.startTest("FILE PROCRESSING");

	}
	
/*	@Test(priority = 2, enabled = true, description = "FILE PROCRESSING")
	public void CreatePartnerPageTitleTest() throws InterruptedException {

		child1 = _extent_report.startTest("FILE PROCRESSING FTP H2P");
		child1.assignCategory("FILE PROCRESSING FTP H2P");
		
		try {
			
			Thread.sleep(2000);
			
			CPP.validateCreatePartnerPageTitle();
			
			CPP.Commondata();
			
			Thread.sleep(2000);
			
			CPP.ValidateFTPH2PWithValidData("B2Bi-FTP", "Active", "1 Minute");
			
			Thread.sleep(2000);
			
			String pname = MPP.PartnerNameData.getText();
			
			Thread.sleep(2000);
			
			CAP.validateCreateApplicationPageTitle();
			
			CAP.Commondata();
			
			Thread.sleep(2000);
			
			CAP.ValidateFTPH2PWithValidData("B2Bi-FTP", "Inactive", "1 Minute");
			
			Thread.sleep(2000);
			
			String aname = MAP.ApplicationNameData.getText();
			
			Thread.sleep(2000);
			
			
		
			if (title.equals("Create Partner / Producer")) {

				child1.log(LogStatus.PASS,
						"Validation successful because we are getting Create Partner Page title as '" + title + "'.");
			} else {
				child1.log(LogStatus.FAIL,
						"Validation  unsuccessful because we are getting Create Partner Page title as '" + title
								+ "' instead of Create Partner / Producer");
			}
		} catch (Exception e) {
			child1.log(LogStatus.FAIL, e.fillInStackTrace());
		}
		_extent_report.endTest(child1);
	}
	
	*/
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
