package com.pcm.qa.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.pcm.qa.base.TestBase;

import com.pcm.qa.pages.ManageApiEndpointPage;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class ManageApiEndpointPageTest extends TestBase {

	public ManageApiEndpointPage MAEPP;
	ManageApiEndpointPageTest MAEPT;

	public ExtentTest Parent7;
	public ExtentTest child1;
	public ExtentTest child2;
	public ExtentTest child3;
	public ExtentTest child4;
	public ExtentTest child5;
	public ExtentTest child6;
	public ExtentTest child7;
	public ExtentTest child8;
	public ExtentTest child9;
	public ExtentTest child10;
	public ExtentTest child11;
	public ExtentTest child12;
	public ExtentTest child13;
	public ExtentTest child14;
	public ExtentTest child15;
	public ExtentTest child16;
	public ExtentTest child17;
	public ExtentTest child18;
	public ExtentTest child19;
	public ExtentTest child20;
	public ExtentTest child21;
	public ExtentTest child22;
	public ExtentTest child23;
	public ExtentTest child24;
	public ExtentTest child25;
	public ExtentTest child26;
	public ExtentTest child27;
	public ExtentTest child28;
	public ExtentTest child29;

	public ManageApiEndpointPageTest() {
		super();
	}

	@BeforeMethod
	public void beforeTest() {

		MAEPP = new ManageApiEndpointPage();
		MAEPT = new ManageApiEndpointPageTest();

	}

	@BeforeTest(enabled = true)
	public void setup() throws Exception {

		Extentreport();
		initialization();
	}

	@Test(priority = 1, enabled = true)
	public void ParentNodeCreation() {

		_test_logger3 = _extent_report.startTest("API Endpoint");
		Parent7 = _extent_report.startTest("Manage API Endpoint");

	}

	@Test(priority = 2, enabled = true, description = "Verifying Manage API Endpoint page title")
	public void ManageApiPageTitleTest() throws InterruptedException {
		child1 = _extent_report.startTest("Verifying Manage API Endpoint page title");
		child1.assignCategory("Manage API Endpoint");
		try {
			Thread.sleep(3000);

			String title = MAEPP.ValidateManageApiPageTitle();
			Thread.sleep(3000);
			System.out.println(title);
			if (title.equals("Manage API")) {
				child1.log(LogStatus.PASS,
						"Validation successful because we are getting Manage API Endpoint Page title as '" + title
								+ "'");
			} else {
				child1.log(LogStatus.FAIL,
						"Validation  unsuccessful because we are getting Manage Manage API Endpoint Page title as '"
								+ title + "'  instead of 'Manage API'");
			}
		} catch (Exception e) {
			child1.log(LogStatus.FAIL, e.fillInStackTrace());
		}
		_extent_report.endTest(child1);
	}

	@Test(priority = 3, enabled = true, description = "verifying Manage api with valid data")
	public void ManageAPITestVerificationWithvalidData() throws Exception {
		child2 = _extent_report.startTest("verifying Manage api with valid data");
		child2.assignCategory("Manage API Endpoint");
		try {
			Thread.sleep(3000);
			MAEPP.ValidateManageAPIWithvalidData(prop.getProperty("apiname"), prop.getProperty("webmethod"),
					prop.getProperty("serverurl"));
			Thread.sleep(2000);
			Boolean flag = MAEPP.Actionsicon.isDisplayed();
			Thread.sleep(3000);
			String title = flag.toString();
			System.out.println(title);
			if (title.contains("true")) {

				child2.log(LogStatus.PASS, "Validation successful because we are getting message as '" + title
						+ "' when we Search with valid Data");
			} else {
				child2.log(LogStatus.FAIL, "Validation Unsuccessful because we are getting message as '" + title
						+ "' instead of 'No Matching Trading Partner found' ,when we Search with valid Data");
			}
		} catch (Exception e) {
			child2.log(LogStatus.FAIL, e.fillInStackTrace());
		}
		_extent_report.endTest(child2);
	}

	@Test(priority = 4, enabled = true, description = "verifying Manage api with valid data and edit")
	public void ManageAPIPageTestWithvalidDataEdit() throws Throwable {
		child3 = _extent_report.startTest("verifying Manage api with valid data and edit");
		child3.assignCategory("Manage API Endpoint");
		try {

			Thread.sleep(3000);
			MAEPP.EndPointFlowFlowModuleClick.click();
			Thread.sleep(2000);
			MAEPP.ManageAPIEndpointModuleClick.click();
			Thread.sleep(2000);
			MAEPP.ValidateManageAPIWithvalidData(prop.getProperty("apiname"), prop.getProperty("webmethod"),
					prop.getProperty("serverurl"));

			Thread.sleep(2000);
			MAEPP.Actionsicon.click();
			Thread.sleep(3000);
			MAEPP.Editbtn.click();
			Thread.sleep(5000);
			MAEPP.EditSubmitClick.click();
			Thread.sleep(1000);
			String title = MAEPP.ActionMsg.getText();

			if (title.equalsIgnoreCase("Proxy endpoint updated successfully")) {
				child3.log(LogStatus.PASS,
						"Validation successful because we are getting Manage API Endpoint Page title as '" + title
								+ "' ");
			} else {
				child3.log(LogStatus.FAIL,
						"Validation unsuccessful because we are not getting Manage API Endpoint Page title as '" + title
								+ "' ");
			}
		} catch (Exception e) {
			child3.log(LogStatus.FAIL, e.fillInStackTrace());
		}
		_extent_report.endTest(child3);
	}

	@Test(priority = 5, enabled = true, description = "verifying Manage api with only API name")
	public void ManageAPITestVerificationWithOnlyAPIName() throws Exception {
		child4 = _extent_report.startTest("verifying Manage api with only API name");
		child4.assignCategory("Manage API Endpoint");
		try {

			Thread.sleep(3000);
			MAEPP.EndPointFlowFlowModuleClick.click();
			Thread.sleep(2000);
			MAEPP.ManageAPIEndpointModuleClick.click();
			Thread.sleep(2000);

			MAEPP.validateManageAPIWithOnlyAPIName(prop.getProperty("apiname"));
			Thread.sleep(3000);

			Boolean flag = MAEPP.Actionsicon.isDisplayed();
			String title = flag.toString();
			System.out.println(title);
			if (title.contains("true")) {
				child4.log(LogStatus.PASS, "Validation successful because we are getting message as '" + title + "' ");
			} else {
				child4.log(LogStatus.FAIL,
						"Validation successful because we are not getting message as '" + title + "' ");
			}
		} catch (Exception e) {
			child4.log(LogStatus.FAIL, e.fillInStackTrace());
			String title2 = MAEPP.ErrorMsg.getText();
			child4.log(LogStatus.INFO, title2);
		}
		_extent_report.endTest(child4);
	}

	@Test(priority = 6, enabled = true, description = "verifying Manage api with only API name and edit")
	public void ManageAPITestVerificationWithOnlyAPINameandEdit() throws Exception {
		child5 = _extent_report.startTest("verifying Manage api with only API name and edit");
		child5.assignCategory("Manage API Endpoint");
		try {

			Thread.sleep(3000);
			MAEPP.EndPointFlowFlowModuleClick.click();
			Thread.sleep(2000);
			MAEPP.ManageAPIEndpointModuleClick.click();
			Thread.sleep(2000);

			MAEPP.validateManageAPIWithOnlyAPIName(prop.getProperty("apiname"));
			Thread.sleep(2000);

			MAEPP.Actionsicon.click();
			Thread.sleep(3000);
			MAEPP.Editbtn.click();
			Thread.sleep(5000);
			MAEPP.EditSubmitClick.click();
			Thread.sleep(1000);
			String title = MAEPP.ActionMsg.getText();

			if (title.equalsIgnoreCase("Proxy endpoint updated successfully")) {

				child5.log(LogStatus.PASS,
						"Validation successful because we are getting Endpoints with Only API Name and edit");
			} else {
				child5.log(LogStatus.FAIL,
						"Validation unsuccessful because we are not getting Endpoints with Only API Name and edit");
			}
		} catch (Exception e) {
			child5.log(LogStatus.FAIL, e.fillInStackTrace());
			String title2 = MAEPP.ErrorMsg.getText();
			child5.log(LogStatus.INFO, title2);
		}
		_extent_report.endTest(child5);
	}

	@Test(priority = 7, enabled = true, description = "Verifying Manage API Page With Only WebMethod")
	public void ManageAPITestVerificationWithOnlyWebMethod() throws Exception {
		child6 = _extent_report.startTest("Verifying Manage API Page With Only WebMethod");
		child6.assignCategory("Manage API Endpoint");
		try {

			Thread.sleep(3000);
			MAEPP.EndPointFlowFlowModuleClick.click();
			Thread.sleep(2000);
			MAEPP.ManageAPIEndpointModuleClick.click();
			Thread.sleep(2000);

			MAEPP.validateManageAPIWithOnlyWebMethod(prop.getProperty("webmethod"));
			Thread.sleep(3000);

			Boolean flag = MAEPP.Actionsicon.isDisplayed();
			String title = flag.toString();
			System.out.println(title);
			if (title.contains("true")) {
				child6.log(LogStatus.PASS, "Validation successful because we are getting message as '" + title + "' ");
			} else {
				child6.log(LogStatus.FAIL,
						"Validation successful because we are not getting message as '" + title + "' ");
			}
		} catch (Exception e) {
			child6.log(LogStatus.FAIL, e.fillInStackTrace());
			String title2 = MAEPP.ErrorMsg.getText();
			child6.log(LogStatus.INFO, title2);
		}
		_extent_report.endTest(child6);
	}

	@Test(priority = 8, enabled = true, description = "verifying Manage api with only web method and edit")
	public void ManageAPITestVerificationWithOnlyWebMethodandEdit() throws Exception {
		child7 = _extent_report.startTest("verifying Manage api with only web method and edit");
		child7.assignCategory("Manage API Endpoint");
		try {

			Thread.sleep(3000);
			MAEPP.EndPointFlowFlowModuleClick.click();
			Thread.sleep(2000);
			MAEPP.ManageAPIEndpointModuleClick.click();
			Thread.sleep(2000);

			MAEPP.validateManageAPIWithOnlyWebMethod(prop.getProperty("webmethod"));
			Thread.sleep(2000);

			MAEPP.Actionsicon.click();
			Thread.sleep(3000);
			MAEPP.Editbtn.click();
			Thread.sleep(5000);
			MAEPP.EditSubmitClick.click();
			Thread.sleep(1000);
			String title = MAEPP.ActionMsg.getText();

			if (title.equalsIgnoreCase("Proxy endpoint updated successfully")) {

				child7.log(LogStatus.PASS,
						"Validation successful because we are getting Endpoints with Only WebMethod and edit");
			} else {
				child7.log(LogStatus.FAIL,
						"Validation unsuccessful because we are not getting Endpoints with Only WebMethod and edit");
			}
		} catch (Exception e) {
			child7.log(LogStatus.FAIL, e.fillInStackTrace());
			String title2 = MAEPP.ErrorMsg.getText();
			child7.log(LogStatus.INFO, title2);
		}
		_extent_report.endTest(child7);
	}

	@Test(priority = 9, enabled = true, description = "verifying Manage api with only server url")
	public void ManageAPITestVerificationWithOnlyServerUrl() throws Exception {
		child8 = _extent_report.startTest("verifying Manage api with only server url");
		child8.assignCategory("Manage API Endpoint");

		try {

			Thread.sleep(3000);
			MAEPP.EndPointFlowFlowModuleClick.click();
			Thread.sleep(2000);
			MAEPP.ManageAPIEndpointModuleClick.click();
			Thread.sleep(3000);

			MAEPP.validateManageAPIWithOnlyServerUrl(prop.getProperty("serverurl"));
			Thread.sleep(3000);
			Boolean flag = MAEPP.Actionsicon.isDisplayed();
			Thread.sleep(3000);
			String title = flag.toString();
			System.out.println(title);

			if (title.contains("true")) {

				child8.log(LogStatus.PASS, "Validation successful because we are getting message as '" + title
						+ "' when we Search with Only ServerUrl ");
			} else {
				child8.log(LogStatus.FAIL, "Validation Unsuccessful because we are getting message as '" + title
						+ "' when we Search with Only ServerUrl ");
			}
		} catch (Exception e) {
			child8.log(LogStatus.FAIL, e.fillInStackTrace());
		}
		_extent_report.endTest(child8);

	}

	@Test(priority = 10, enabled = true, description = "Verifying Manage api Page With Only ServerUrl and edit")
	public void ManageAPITestVerificationWithOnlyServerUrlandEdit() throws Exception {
		child9 = _extent_report.startTest("Verifying Manage api Page With Only ServerUrl and edit");
		child9.assignCategory("Manage API Endpoint");
		try {

			Thread.sleep(3000);
			MAEPP.EndPointFlowFlowModuleClick.click();
			Thread.sleep(2000);
			MAEPP.ManageAPIEndpointModuleClick.click();
			Thread.sleep(2000);

			MAEPP.validateManageAPIWithOnlyServerUrl(prop.getProperty("serverurl"));
			Thread.sleep(2000);

			MAEPP.Actionsicon.click();
			Thread.sleep(3000);
			MAEPP.Editbtn.click();
			Thread.sleep(5000);
			MAEPP.EditSubmitClick.click();
			Thread.sleep(1000);
			String title = MAEPP.ActionMsg.getText();

			if (title.equalsIgnoreCase("Proxy endpoint updated successfully")) {

				child9.log(LogStatus.PASS,
						"Validation successful because we are getting Endpoints with Only Serverurl and edit");
			} else {
				child9.log(LogStatus.FAIL,
						"Validation unsuccessful because we are not getting Endpoints with Only Serverurl and edit");
			}
		} catch (Exception e) {
			child9.log(LogStatus.FAIL, e.fillInStackTrace());
			String title2 = MAEPP.ErrorMsg.getText();
			child9.log(LogStatus.INFO, title2);
		}
		_extent_report.endTest(child9);
	}

	@Test(priority = 11, enabled = true, description = "verifying Manage api with only API name and web method")
	public void ManageAPITestVerificationWithAPIName_WebMethod() throws Exception {
		child10 = _extent_report.startTest("verifying Manage api with only API name and web method");
		child10.assignCategory("Manage API Endpoint");
		try {

			Thread.sleep(3000);
			MAEPP.EndPointFlowFlowModuleClick.click();
			Thread.sleep(2000);
			MAEPP.ManageAPIEndpointModuleClick.click();
			Thread.sleep(3000);

			MAEPP.validateManageAPIWithOnlyAPIName_WebMethod(prop.getProperty("apiname"),
					prop.getProperty("webmethod"));
			Thread.sleep(3000);

			Boolean flag = MAEPP.Actionsicon.isDisplayed();
			String title = flag.toString();
			System.out.println(title);
			if (title.contains("true")) {
				child10.log(LogStatus.PASS, "Validation successful because we are getting message as '" + title + "' ");
			} else {
				child10.log(LogStatus.FAIL,
						"Validation successful because we are not getting message as '" + title + "' ");
			}
		} catch (Exception e) {
			child10.log(LogStatus.FAIL, e.fillInStackTrace());
			String title2 = MAEPP.ErrorMsg.getText();
			child10.log(LogStatus.INFO, title2);
		}
		_extent_report.endTest(child10);
	}

	@Test(priority = 12, enabled = true, description = "verifying Manage api with only API name,web method and edit")
	public void ManageAPITestVerificationWithAPIName_WebmethodandEdit() throws Exception {
		child11 = _extent_report.startTest("verifying Manage api with only API name,web method and edit");
		child11.assignCategory("Manage API Endpoint");
		try {

			Thread.sleep(3000);
			MAEPP.EndPointFlowFlowModuleClick.click();
			Thread.sleep(2000);
			MAEPP.ManageAPIEndpointModuleClick.click();
			Thread.sleep(2000);

			MAEPP.validateManageAPIWithOnlyAPIName_WebMethod(prop.getProperty("apiname"),
					prop.getProperty("webmethod"));
			Thread.sleep(2000);

			MAEPP.Actionsicon.click();
			Thread.sleep(3000);
			MAEPP.Editbtn.click();
			Thread.sleep(5000);
			MAEPP.EditSubmitClick.click();
			Thread.sleep(1000);
			String title = MAEPP.ActionMsg.getText();

			if (title.equalsIgnoreCase("Proxy endpoint updated successfully")) {

				child11.log(LogStatus.PASS,
						"Validation successful because we are getting Endpoints with Verifying Manage API Page With Only APIName,Webmethod and edit");
			} else {
				child11.log(LogStatus.FAIL,
						"Validation unsuccessful because we are not getting Endpoints with Verifying Manage API Page With Only APIName,Webmethod and edit");
			}
		} catch (Exception e) {
			child11.log(LogStatus.FAIL, e.fillInStackTrace());
			String title2 = MAEPP.ErrorMsg.getText();
			child11.log(LogStatus.INFO, title2);
		}
		_extent_report.endTest(child11);
	}

	@Test(priority = 13, enabled = true, description = "verifying Manage api with only API name and server url")
	public void ManageAPITestVerificationWithAPIName_ServerUrl() throws Exception {
		child12 = _extent_report.startTest("verifying Manage api with only API name and server url");
		child12.assignCategory("Manage API Endpoint");
		try {

			Thread.sleep(3000);
			MAEPP.EndPointFlowFlowModuleClick.click();
			Thread.sleep(2000);
			MAEPP.ManageAPIEndpointModuleClick.click();
			Thread.sleep(2000);

			MAEPP.validateManageAPIWithOnlyAPIName_ServerUrl(prop.getProperty("apiname"),
					prop.getProperty("serverurl"));
			Thread.sleep(3000);

			Boolean flag = MAEPP.Actionsicon.isDisplayed();
			String title = flag.toString();
			System.out.println(title);
			if (title.contains("true")) {
				child12.log(LogStatus.PASS, "Validation successful because we are getting message as '" + title + "' ");
			} else {
				child12.log(LogStatus.FAIL,
						"Validation successful because we are not getting message as '" + title + "' ");
			}
		} catch (Exception e) {
			child12.log(LogStatus.FAIL, e.fillInStackTrace());
			String title2 = MAEPP.ErrorMsg.getText();
			child12.log(LogStatus.INFO, title2);
		}
		_extent_report.endTest(child12);
	}

	@Test(priority = 14, enabled = true, description = "verifying Manage api with only API name,server url and edit")
	public void ManageAPITestVerificationWithAPIName_ServerUrlandEdit() throws Exception {
		child13 = _extent_report.startTest("verifying Manage api with only API name,server url and edit");
		child13.assignCategory("Manage API Endpoint");
		try {

			Thread.sleep(3000);
			MAEPP.EndPointFlowFlowModuleClick.click();
			Thread.sleep(2000);
			MAEPP.ManageAPIEndpointModuleClick.click();
			Thread.sleep(2000);

			MAEPP.validateManageAPIWithOnlyAPIName_ServerUrl(prop.getProperty("apiname"),
					prop.getProperty("serverurl"));
			Thread.sleep(2000);

			MAEPP.Actionsicon.click();
			Thread.sleep(3000);
			MAEPP.Editbtn.click();
			Thread.sleep(5000);
			MAEPP.EditSubmitClick.click();
			Thread.sleep(1000);
			String title = MAEPP.ActionMsg.getText();

			if (title.equalsIgnoreCase("Proxy endpoint updated successfully")) {

				child13.log(LogStatus.PASS,
						"Validation successful because we are getting Endpoints with Verifying Manage API Page With Only APIName,ServerUrl and edit");
			} else {
				child13.log(LogStatus.FAIL,
						"Validation unsuccessful because we are not getting Endpoints with Verifying Manage API Page With Only APIName,ServerUrl and edit");
			}
		} catch (Exception e) {
			child13.log(LogStatus.FAIL, e.fillInStackTrace());
			String title2 = MAEPP.ErrorMsg.getText();
			child13.log(LogStatus.INFO, title2);
		}
		_extent_report.endTest(child13);
	}

	@Test(priority = 15, enabled = true, description = "verifying Manage api with only Webmethod and server url")
	public void ManageAPITestVerificationWithWebmethod_ServerUrl() throws Exception {
		child14 = _extent_report.startTest("verifying Manage api with only Webmethod and server url");
		child14.assignCategory("Manage API Endpoint");
		try {

			Thread.sleep(3000);
			MAEPP.EndPointFlowFlowModuleClick.click();
			Thread.sleep(2000);
			MAEPP.ManageAPIEndpointModuleClick.click();
			Thread.sleep(2000);

			MAEPP.validateManageAPIWithOnlyWebMethod_ServerUrl(prop.getProperty("webmethod"),
					prop.getProperty("serverurl"));
			Thread.sleep(3000);

			Boolean flag = MAEPP.Actionsicon.isDisplayed();
			String title = flag.toString();
			System.out.println(title);
			if (title.contains("true")) {
				child14.log(LogStatus.PASS, "Validation successful because we are getting message as '" + title + "' ");
			} else {
				child14.log(LogStatus.FAIL,
						"Validation successful because we are not getting message as '" + title + "' ");
			}
		} catch (Exception e) {
			child14.log(LogStatus.FAIL, e.fillInStackTrace());
			String title2 = MAEPP.ErrorMsg.getText();
			child14.log(LogStatus.INFO, title2);
		}
		_extent_report.endTest(child14);
	}

	@Test(priority = 16, enabled = true, description = "verifying Manage api with only Webmethod,server url and edit")
	public void ManageAPITestVerificationWithWebmethod_ServerUrlandEdit() throws Exception {
		child15 = _extent_report.startTest("verifying Manage api with only Webmethod,server url and edit");
		child15.assignCategory("Manage API Endpoint");
		try {

			Thread.sleep(3000);
			MAEPP.EndPointFlowFlowModuleClick.click();
			Thread.sleep(2000);
			MAEPP.ManageAPIEndpointModuleClick.click();
			Thread.sleep(2000);

			MAEPP.validateManageAPIWithOnlyWebMethod_ServerUrl(prop.getProperty("webmethod"),
					prop.getProperty("serverurl"));
			Thread.sleep(2000);

			MAEPP.Actionsicon.click();
			Thread.sleep(3000);
			MAEPP.Editbtn.click();
			Thread.sleep(5000);
			MAEPP.EditSubmitClick.click();
			Thread.sleep(1000);
			String title = MAEPP.ActionMsg.getText();

			if (title.equalsIgnoreCase("Proxy endpoint updated successfully")) {

				child15.log(LogStatus.PASS,
						"Validation successful because we are getting Endpoints with Verifying Manage API Page With Only Webmethod ,ServerUrland edit");
			} else {
				child15.log(LogStatus.FAIL,
						"Validation unsuccessful because we are not getting Endpoints with Verifying Manage API Page With Only Webmethod,ServerUrl and edit");
			}
		} catch (Exception e) {
			child15.log(LogStatus.FAIL, e.fillInStackTrace());
			String title2 = MAEPP.ErrorMsg.getText();
			child15.log(LogStatus.INFO, title2);
		}
		_extent_report.endTest(child15);
	}

	@Test(priority = 17, enabled = true, description = "Verifying Manage API Page With WebMethod as POST")
	public void ManageAPITestVerificationWithWebMethodasPOST() throws Exception {
		child16 = _extent_report.startTest("Verifying Manage API Page With WebMethod as POST");
		child16.assignCategory("Manage API Endpoint");
		try {

			Thread.sleep(3000);
			MAEPP.EndPointFlowFlowModuleClick.click();
			Thread.sleep(2000);
			MAEPP.ManageAPIEndpointModuleClick.click();
			Thread.sleep(2000);

			MAEPP.validateManageAPIWithOnlyWebMethod("POST");
			Thread.sleep(2000);

			Boolean flag = MAEPP.Actionsicon.isDisplayed();
			Thread.sleep(3000);
			String title = flag.toString();
			System.out.println(title);
			if (title.contains("true")) {
				child16.log(LogStatus.PASS, "Validation successful because we are getting message as '" + title + "' ");
			} else {
				child16.log(LogStatus.FAIL,
						"Validation successful because we are not getting message as '" + title + "' ");
			}
		} catch (Exception e) {
			child16.log(LogStatus.FAIL, e.fillInStackTrace());
			String title2 = MAEPP.ErrorMsg.getText();
			child16.log(LogStatus.INFO, title2);
		}
		_extent_report.endTest(child16);
	}

	@Test(priority = 18, enabled = true, description = "verifying Manage api with web method as POST and Edit")
	public void ManageAPITestVerificationWithWebMethodasPOSTandEdit() throws Exception {
		child17 = _extent_report.startTest("verifying Manage api with web method as POST and Edit");
		child17.assignCategory("Manage API Endpoint");
		try {

			Thread.sleep(3000);
			MAEPP.EndPointFlowFlowModuleClick.click();
			Thread.sleep(2000);
			MAEPP.ManageAPIEndpointModuleClick.click();
			Thread.sleep(2000);

			MAEPP.validateManageAPIWithOnlyWebMethod("POST");
			Thread.sleep(2000);

			MAEPP.Actionsicon.click();
			Thread.sleep(3000);
			MAEPP.Editbtn.click();
			Thread.sleep(5000);
			MAEPP.EditSubmitClick.click();
			Thread.sleep(1000);
			String title = MAEPP.ActionMsg.getText();

			if (title.equalsIgnoreCase("Proxy endpoint updated successfully")) {

				child17.log(LogStatus.PASS,
						"Validation successful because we are getting Endpoints with WebMethod and edit");
			} else {
				child17.log(LogStatus.FAIL,
						"Validation unsuccessful because we are not getting Endpoints with Only WebMethod and edit");
			}
		} catch (Exception e) {
			child17.log(LogStatus.FAIL, e.fillInStackTrace());
			String title2 = MAEPP.ErrorMsg.getText();
			child17.log(LogStatus.INFO, title2);
		}
		_extent_report.endTest(child17);
	}

	@Test(priority = 19, enabled = true, description = "verifying Manage api with web method as POST and delete")
	public void ManagePartnerPageTestWithValidMethodasPOSTandDelete() throws Throwable {
		child18 = _extent_report.startTest("verifying Manage api with web method as POST and delete");
		child18.assignCategory("Manage API Endpoint");
		try {

			Thread.sleep(3000);
			MAEPP.EndPointFlowFlowModuleClick.click();
			Thread.sleep(2000);
			MAEPP.ManageAPIEndpointModuleClick.click();
			Thread.sleep(2000);

			MAEPP.validateManageAPIWithOnlyWebMethod("POST");
			Thread.sleep(2000);

			MAEPP.Actionbtn.click();
			Thread.sleep(3000);
			MAEPP.DeleteClick.click();

			MAEPP.yesDeleteitClick.click();
			Thread.sleep(1000);
			String title = MAEPP.ActionMsg.getText();

			if (title.equalsIgnoreCase("Proxy endpoint deleted successfully")) {
				child18.log(LogStatus.PASS, "Validation successful because we are getting message as '" + title + "' ");
			} else {
				child18.log(LogStatus.FAIL,
						"Validation unsuccessful because we are not getting message as '" + title + "' ");
			}
		} catch (Exception e) {
			child18.log(LogStatus.FAIL, e.fillInStackTrace());
		}
		_extent_report.endTest(child18);
	}

	@Test(priority = 20, enabled = true, description = "Verifying Manage API Page With WebMethod as PUT")
	public void ManageAPITestVerificationWithWebMethodasPUT() throws Exception {
		child19 = _extent_report.startTest("Verifying Manage API Page With WebMethod as PUT");
		child19.assignCategory("Manage API Endpoint");
		try {

			Thread.sleep(3000);
			MAEPP.EndPointFlowFlowModuleClick.click();
			Thread.sleep(2000);
			MAEPP.ManageAPIEndpointModuleClick.click();
			Thread.sleep(2000);

			MAEPP.validateManageAPIWithOnlyWebMethod("PUT");
			Thread.sleep(2000);

			Boolean flag = MAEPP.Actionsicon.isDisplayed();
			String title = flag.toString();
			System.out.println(title);
			if (title.contains("true")) {
				child19.log(LogStatus.PASS, "Validation successful because we are getting message as '" + title + "' ");
			} else {
				child19.log(LogStatus.FAIL,
						"Validation successful because we are not getting message as '" + title + "' ");
			}
		} catch (Exception e) {
			child19.log(LogStatus.FAIL, e.fillInStackTrace());
			String title2 = MAEPP.ErrorMsg.getText();
			child19.log(LogStatus.INFO, title2);
		}
		_extent_report.endTest(child19);
	}

	@Test(priority = 21, enabled = true, description = "verifying Manage api with web method as PUT and Edit")
	public void ManageAPITestVerificationWithWebMethodasPUTandEdit() throws Exception {
		child20 = _extent_report.startTest("verifying Manage api with web method as PUT and Edit");
		child20.assignCategory("Manage API Endpoint");
		try {

			Thread.sleep(3000);
			MAEPP.EndPointFlowFlowModuleClick.click();
			Thread.sleep(2000);
			MAEPP.ManageAPIEndpointModuleClick.click();
			Thread.sleep(2000);

			MAEPP.validateManageAPIWithOnlyWebMethod("PUT");
			Thread.sleep(2000);

			MAEPP.Actionsicon.click();
			Thread.sleep(3000);
			MAEPP.Editbtn.click();
			Thread.sleep(5000);
			MAEPP.EditSubmitClick.click();
			Thread.sleep(1000);
			String title = MAEPP.ActionMsg.getText();

			if (title.equalsIgnoreCase("Proxy endpoint updated successfully")) {

				child20.log(LogStatus.PASS,
						"Validation successful because we are getting Endpoints with WebMethod and edit");
			} else {
				child20.log(LogStatus.FAIL,
						"Validation unsuccessful because we are not getting Endpoints with Only WebMethod and edit");
			}
		} catch (Exception e) {
			child20.log(LogStatus.FAIL, e.fillInStackTrace());
			String title2 = MAEPP.ErrorMsg.getText();
			child20.log(LogStatus.INFO, title2);
		}
		_extent_report.endTest(child20);
	}

	@Test(priority = 22, enabled = true, description = "verifying Manage api with web method as POST and delete")
	public void ManagePartnerPageTestWithValidMethodasPUTandDelete() throws Throwable {
		child21 = _extent_report.startTest("verifying Manage api with web method as PUT and delete");
		child21.assignCategory("Manage API Endpoint");
		try {

			Thread.sleep(3000);
			MAEPP.EndPointFlowFlowModuleClick.click();
			Thread.sleep(2000);
			MAEPP.ManageAPIEndpointModuleClick.click();
			Thread.sleep(2000);

			MAEPP.validateManageAPIWithOnlyWebMethod("PUT");
			Thread.sleep(2000);

			MAEPP.Actionbtn.click();
			Thread.sleep(3000);
			MAEPP.DeleteClick.click();

			MAEPP.yesDeleteitClick.click();
			Thread.sleep(1000);
			String title = MAEPP.ActionMsg.getText();

			if (title.equalsIgnoreCase("Proxy endpoint deleted successfully")) {
				child21.log(LogStatus.PASS, "Validation successful because we are getting message as '" + title + "' ");
			} else {
				child21.log(LogStatus.FAIL,
						"Validation unsuccessful because we are not getting message as '" + title + "' ");
			}
		} catch (Exception e) {
			child21.log(LogStatus.FAIL, e.fillInStackTrace());
		}
		_extent_report.endTest(child21);
	}

	@Test(priority = 23, enabled = true, description = "verifying Manage api with web method as GET and delete")
	public void ManagePartnerPageTestWithMethodasGETandDelete() throws Throwable {
		child22 = _extent_report.startTest("verifying Manage api with web method as GET and delete");
		child22.assignCategory("Manage API Endpoint");
		try {

			Thread.sleep(3000);
			MAEPP.EndPointFlowFlowModuleClick.click();
			Thread.sleep(2000);
			MAEPP.ManageAPIEndpointModuleClick.click();
			Thread.sleep(2000);

			MAEPP.validateManageAPIWithOnlyWebMethod("POST");
			Thread.sleep(2000);

			MAEPP.Actionbtn.click();
			Thread.sleep(3000);
			MAEPP.DeleteClick.click();

			MAEPP.yesDeleteitClick.click();
			Thread.sleep(1000);
			String title = MAEPP.ActionMsg.getText();

			if (title.equalsIgnoreCase("Proxy endpoint deleted successfully")) {
				child22.log(LogStatus.PASS, "Validation successful because we are getting message as '" + title + "' ");
			} else {
				child22.log(LogStatus.FAIL,
						"Validation unsuccessful because we are not getting message as '" + title + "' ");
			}
		} catch (Exception e) {
			child22.log(LogStatus.FAIL, e.fillInStackTrace());
		}
		_extent_report.endTest(child22);
	}

	@Test(priority = 24, enabled = true, description = "Verifying Manage API Page With WebMethod as DELETE")
	public void ManageAPITestVerificationWithWebMethodasDELETE() throws Exception {
		child23 = _extent_report.startTest("Verifying Manage API Page With WebMethod as DELETE");
		child23.assignCategory("Manage API Endpoint");
		try {

			Thread.sleep(3000);
			MAEPP.EndPointFlowFlowModuleClick.click();
			Thread.sleep(2000);
			MAEPP.ManageAPIEndpointModuleClick.click();
			Thread.sleep(2000);

			MAEPP.validateManageAPIWithOnlyWebMethod("POST");
			Thread.sleep(2000);

			Boolean flag = MAEPP.Actionsicon.isDisplayed();
			String title = flag.toString();
			System.out.println(title);
			if (title.contains("true")) {
				child23.log(LogStatus.PASS, "Validation successful because we are getting message as '" + title + "' ");
			} else {
				child23.log(LogStatus.FAIL,
						"Validation successful because we are not getting message as '" + title + "' ");
			}
		} catch (Exception e) {
			child23.log(LogStatus.FAIL, e.fillInStackTrace());
			String title2 = MAEPP.ErrorMsg.getText();
			child23.log(LogStatus.INFO, title2);
		}
		_extent_report.endTest(child23);
	}

	@Test(priority = 25, enabled = true, description = "verifying Manage api with web method as DELETE and Edit")
	public void ManageAPITestVerificationWithWebMethodasDELETEandEdit() throws Exception {
		child24 = _extent_report.startTest("verifying Manage api with web method as DELETE and Edit");
		child24.assignCategory("Manage API Endpoint");
		try {

			Thread.sleep(3000);
			MAEPP.EndPointFlowFlowModuleClick.click();
			Thread.sleep(2000);
			MAEPP.ManageAPIEndpointModuleClick.click();
			Thread.sleep(2000);

			MAEPP.validateManageAPIWithOnlyWebMethod("POST");
			Thread.sleep(2000);

			MAEPP.Actionsicon.click();
			Thread.sleep(1000);
			MAEPP.Editbtn.click();
			Thread.sleep(5000);
			MAEPP.EditSubmitClick.click();
			Thread.sleep(1000);
			String title = MAEPP.ActionMsg.getText();

			if (title.equalsIgnoreCase("Proxy endpoint updated successfully")) {

				child24.log(LogStatus.PASS,
						"Validation successful because we are getting Endpoints with WebMethod and edit");
			} else {
				child24.log(LogStatus.FAIL,
						"Validation unsuccessful because we are not getting Endpoints with Only WebMethod and edit");
			}
		} catch (Exception e) {
			child24.log(LogStatus.FAIL, e.fillInStackTrace());
			String title2 = MAEPP.ErrorMsg.getText();
			child24.log(LogStatus.INFO, title2);
		}
		_extent_report.endTest(child24);
	}

	@Test(priority = 26, enabled = true, description = "verifying Manage api with web method as DELETE and delete")
	public void ManageAPIPageTestWithMethodasDELETEandDelete() throws Throwable {
		child25 = _extent_report.startTest("verifying Manage api with web method as DELETE and delete");
		child25.assignCategory("Manage API Endpoint");
		try {

			Thread.sleep(3000);
			MAEPP.EndPointFlowFlowModuleClick.click();
			Thread.sleep(2000);
			MAEPP.ManageAPIEndpointModuleClick.click();
			Thread.sleep(2000);

			MAEPP.validateManageAPIWithOnlyWebMethod("DELETE");
			Thread.sleep(2000);

			MAEPP.Actionbtn.click();
			Thread.sleep(3000);
			MAEPP.DeleteClick.click();

			MAEPP.yesDeleteitClick.click();
			Thread.sleep(1000);
			String title = MAEPP.ActionMsg.getText();

			if (title.equalsIgnoreCase("Proxy endpoint deleted successfully")) {
				child25.log(LogStatus.PASS, "Validation successful because we are getting message as '" + title + "' ");
			} else {
				child25.log(LogStatus.FAIL,
						"Validation unsuccessful because we are not getting message as '" + title + "' ");
			}
		} catch (Exception e) {
			child25.log(LogStatus.FAIL, e.fillInStackTrace());
		}
		_extent_report.endTest(child25);
	}



	@Test(priority = 27, enabled = true, description = "verifying manage api without giving any data")
	public void ManageAPIPageTestWithoutData() throws Throwable {
		child26 = _extent_report.startTest("verifying manage api without giving any data");
		child26.assignCategory("Manage API Endpoint");
		try {

			Thread.sleep(4000);
			MAEPP.EndPointFlowFlowModuleClick.click();
			Thread.sleep(2000);
			MAEPP.ManageAPIEndpointModuleClick.click();
			Thread.sleep(3000);
			System.out.println("clicking");
			MAEPP.SearchClick.click();
			Thread.sleep(4000);
			Boolean flag = MAEPP.Actionsicon.isDisplayed();
			String title = flag.toString();
			System.out.println(title);
			if (title.contains("true")) {

				child26.log(LogStatus.PASS, "Validation successful because we are getting Endpoints");
			} else {
				child26.log(LogStatus.FAIL, "Validation unsuccessful because we are not getting Endpoints");
			}
		} catch (Exception e) {
			child26.log(LogStatus.FAIL, e.fillInStackTrace());
		}
		_extent_report.endTest(child26);
	}
	
	@Test(priority = 28, enabled = true, description = "Verifying Manage API Page With Invalid Data")
	public void ManageAPITestVerificationWithInvalidData() throws Exception {
		child27 = _extent_report.startTest("Verifying Manage API Page With Invalid Data");
		child27.assignCategory("Manage API Endpoint");
		try {

			Thread.sleep(3000);
			MAEPP.EndPointFlowFlowModuleClick.click();
			Thread.sleep(2000);
			MAEPP.ManageAPIEndpointModuleClick.click();
			Thread.sleep(2000);

			MAEPP.ValidateManageAPIWithInvalidData("PCM", "GET", "Automation");
			Thread.sleep(2000);
			String title = MAEPP.ErrorMsg.getText();
			System.out.println(title);

			if (title.equals("No results found !")) {
				child27.log(LogStatus.PASS, "Validation successful because we are getting message as '" + title
						+ "' when we Search with Invalid Data");
			} else {
				child27.log(LogStatus.FAIL, "Validation Unsuccessful because we are getting message as '" + title
						+ "' instead of 'No results found !' ,when we Search with Invalid Data");
			}
		} catch (Exception e) {
			child27.log(LogStatus.FAIL, e.fillInStackTrace());
		}
		_extent_report.endTest(child27);
	}

	@Test(priority = 29, enabled = true, description = "verifying manage api with cancel button")
	public void ManagePartnerPageTestWithResetSearch() throws Throwable {
		child28 = _extent_report.startTest("verifying manage api with cancel button");
		child28.assignCategory("Manage API Endpoint");
		try {

			Thread.sleep(3000);
			MAEPP.EndPointFlowFlowModuleClick.click();
			Thread.sleep(2000);
			MAEPP.ManageAPIEndpointModuleClick.click();
			Thread.sleep(2000);

			MAEPP.ValidateManageAPIWithvalidData(prop.getProperty("apiname"), prop.getProperty("webmethod"),
					prop.getProperty("serverurl"));
			Thread.sleep(3000);
			MAEPP.CancelClick.click();
			Thread.sleep(3000);
			if (MAEPP.APINameData.getText().isEmpty() && MAEPP.ServerUrlData.getText().isEmpty()
					&& MAEPP.WebMethodDD.getText() != null) {

				child28.log(LogStatus.PASS,
						"Validation successful because Reset Search is Resetting All the Fields in Manage API Page");
			} else {
				child28.log(LogStatus.FAIL,
						"Validation Unsuccessful because Reset Search is not Resetting All the Fields in Manage API page");
			}

		} catch (Exception e) {
			child28.log(LogStatus.FAIL, e.fillInStackTrace());
		}
		_extent_report.endTest(child28);
	}

	@Test(priority = 30, enabled = true, description = "Manage API Page Search Result Verification with search filter")
	public void ManagePartnerPageTestWithoutDataActivate() throws Throwable {
		child29 = _extent_report.startTest("Manage API Page Search Result Verification with search filter");
		child29.assignCategory("Manage API Endpoint");
		try {

			Thread.sleep(3000);
			MAEPP.EndPointFlowFlowModuleClick.click();
			Thread.sleep(2000);
			MAEPP.ManageAPIEndpointModuleClick.click();
			Thread.sleep(2000);
			MAEPP.CancelClick.click();
			Thread.sleep(3000);

			MAEPP.SearchClick.click();
			Thread.sleep(3000);

			driver.findElement(By.xpath("//input[@placeholder='Search ']")).sendKeys("test");

			Thread.sleep(1000);

			Boolean flag = MAEPP.Actionsicon.isDisplayed();
			String title = flag.toString();
			System.out.println(title);
			if (title.contains("true")) {

				child29.log(LogStatus.PASS, "Validation successful because we are getting Manage API Endpoints");
			} else {
				child29.log(LogStatus.FAIL, "Validation unsuccessful because we are not getting Manage API Endpoints");
			}
		} catch (Exception e) {
			child29.log(LogStatus.FAIL, e.fillInStackTrace());
		}
		_extent_report.endTest(child29);
	}

	@AfterTest
	public void tearDown() {

		_test_logger3.appendChild(Parent7);

		Parent7.appendChild(child1).appendChild(child2).appendChild(child3).appendChild(child4).appendChild(child5)
				.appendChild(child6).appendChild(child7).appendChild(child8).appendChild(child9).appendChild(child10)
				.appendChild(child11).appendChild(child12).appendChild(child13).appendChild(child14)
				.appendChild(child15).appendChild(child16).appendChild(child17).appendChild(child18)
				.appendChild(child19).appendChild(child20).appendChild(child21).appendChild(child22)
				.appendChild(child23).appendChild(child24).appendChild(child25).appendChild(child26)
				.appendChild(child27).appendChild(child28).appendChild(child29);

		_extent_report.endTest(Parent7);

		_extent_report.endTest(_test_logger3);
		_extent_report.flush();

	}

}