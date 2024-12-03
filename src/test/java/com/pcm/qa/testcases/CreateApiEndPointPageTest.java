package com.pcm.qa.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.pcm.qa.base.TestBase;

import com.pcm.qa.pages.CreateApiEndpointPage;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class CreateApiEndPointPageTest extends TestBase {

	CreateApiEndpointPage CEPP;
	CreateApiEndPointPageTest CEPPT;

	public static String proxyurl = "https://20.55.8.64:7080";
	public static String serverurl = "https://20.55.8.64:7080";

	public static int api = 500;

	public ExtentTest Parent6;
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
	public ExtentTest child30;
	public ExtentTest child31;
	public ExtentTest child32;
	public ExtentTest child33;
	public ExtentTest child34;
	public ExtentTest child35;
	public ExtentTest child36;
	public ExtentTest child37;
	public ExtentTest child38;
	public ExtentTest child39;
	public ExtentTest child40;
	public ExtentTest child41;
	public ExtentTest child42;
	public ExtentTest child43;
	public ExtentTest child44;
	public ExtentTest child45;
	public ExtentTest child46;
	public ExtentTest child47;
	public ExtentTest child48;
	public ExtentTest child49;
	public ExtentTest child50;
	public ExtentTest child51;
	public ExtentTest child52;
	public ExtentTest child53;
	public ExtentTest child54;
	public ExtentTest child55;
	public ExtentTest child56;
	public ExtentTest child57;
	public ExtentTest child58;
	public ExtentTest child59;
	public ExtentTest child60;
	public ExtentTest child61;
	public ExtentTest child62;
	public ExtentTest child63;
	public ExtentTest child64;
	public ExtentTest child65;
	public ExtentTest child66;
	public ExtentTest child67;
	public ExtentTest child68;
	public ExtentTest child69;
	public ExtentTest child70;
	public ExtentTest child71;
	public ExtentTest child72;
	public ExtentTest child73;
	public ExtentTest child74;
	public ExtentTest child75;
	public ExtentTest child76;
	public ExtentTest child77;
	public ExtentTest child78;
	public ExtentTest child79;
	public ExtentTest child80;
	public ExtentTest child81;
	public ExtentTest child82;
	public ExtentTest child83;
	public ExtentTest child84;
	public ExtentTest child85;
	public ExtentTest child86;
	public ExtentTest child87;
	public ExtentTest child88;
	public ExtentTest child89;
	public ExtentTest child90;
	public ExtentTest child91;
	public ExtentTest child92;
	public ExtentTest child93;
	public ExtentTest child94;
	public ExtentTest child95;
	public ExtentTest child96;
	public ExtentTest child97;
	public ExtentTest child98;
	public ExtentTest child99;
	public ExtentTest child100;
	public ExtentTest child101;
	public ExtentTest child102;
	public ExtentTest child103;
	public ExtentTest child104;
	public ExtentTest child105;
	public ExtentTest child106;
	public ExtentTest child107;
	public ExtentTest child108;
	public ExtentTest child109;
	public ExtentTest child110;
	public ExtentTest child111;
	public ExtentTest child112;
	public ExtentTest child113;
	public ExtentTest child114;
	public ExtentTest child115;
	public ExtentTest child116;
	public ExtentTest child117;
	public ExtentTest child118;
	public ExtentTest child119;
	public ExtentTest child120;

	public CreateApiEndPointPageTest() {
		super();

	}

	@BeforeTest
	public void setup() throws Exception {
		initialization();
		Extentreport();

	}

	@BeforeMethod
	public void setUp() throws Exception {

		CEPP = new CreateApiEndpointPage();
		CEPPT = new CreateApiEndPointPageTest();

	}

	@Test(priority = 1, enabled = true)
	public void ParentNodeCreation() throws Exception {

		_test_logger3 = _extent_report.startTest("APIEndpoint");
		Parent6 = _extent_report.startTest("Create API Endpoint");

	}

	@Test(priority = 2, enabled = true, description = "Verifying Create API Endpoint page title")
	public void CreateAPIEndPointPageTitleTest() throws InterruptedException {

		child1 = _extent_report.startTest("Verifying Create API Endpoint page title");
		child1.assignCategory("Create API Endpoint");
		try {

			String title = CEPP.verifyCreateAPIEndpointpagetitle();
			System.out.println(title);

			if (title.equals("Create Endpoint")) {

				child1.log(LogStatus.PASS,
						"Validation successful because we are getting Create API EndPoint Page title as '" + title
								+ "'.");
			} else {
				child1.log(LogStatus.FAIL,
						"Validation  unsuccessful because we are getting Create API EndPoint Page title as '" + title
								+ "' instead of Create API End point");
			}
		} catch (Exception e) {
			child1.log(LogStatus.FAIL, e.fillInStackTrace());
		}
		_extent_report.endTest(child1);
	}

	@Test(priority = 3, enabled = true, description = "Verifying Create API Endpoint page with API Name as Mandatory field")
	public void VerifyingCreateAPIEndpointpagewithAPINameasMandatoryfield() throws Throwable {
		child2 = _extent_report.startTest("Verifying Create API Endpoint page with API Name as Mandatory field");
		child2.assignCategory("Create API Endpoint");
		try {

			Thread.sleep(3000);
			CEPP.MangeEndPointClick.click();
			Thread.sleep(2000);
			CEPP.CreateEndPointClick.click();
			Thread.sleep(2000);
	
			CEPP.ClickOnDropdow.click();
			Thread.sleep(2000);
			CEPP.ClickOCreateAPIFromDropDown.click();

			Thread.sleep(2000);
			CEPP.ClickOnProxyWebMethod.click();
			Thread.sleep(1000);
			CEPP.ClickOnGetMethod.click();
			Thread.sleep(2000);
			CEPP.EnterServerURL.sendKeys(serverurl + "/pcm/workflow");
			Thread.sleep(2000);

			CEPP.ClickOnProxyAuthorization.click();
			Thread.sleep(2000);
			CEPP.ClickOnAuthDropDown.click();
			Thread.sleep(2000);
			CEPP.SelectNoAuth.click();
			Thread.sleep(2000);
			CEPP.ClickOnServerAuthorization.click();
			Thread.sleep(2000);
			CEPP.ClickOnAuthDropDown.click();
			CEPP.SelectNoAuth.click();
			Thread.sleep(2000);
			CEPP.ClickOnParams.click();
			Thread.sleep(2000);
			CEPP.ClickOnHeaders.click();
			Thread.sleep(2000);
			CEPP.ClickOnCreateButton.click();
			Thread.sleep(1000);
			String title = CEPP.ApiNameErrorMsg.getText();
			System.out.println(title);
			if (title.equals("API Name is required")) {
				child2.log(LogStatus.PASS, "Validation successful because we are getting message as '" + title
						+ "' when we submit with API Name as Mandatory Field");
			} else {
				child2.log(LogStatus.FAIL, "Validation Unsuccessful because we are getting message as '" + title
						+ "'instead of 'Please enter API name' when we submit with API Name as Mandatory Field");
			}

		} catch (Exception e) {
			child2.log(LogStatus.FAIL, e.fillInStackTrace());
		}
		_extent_report.endTest(child2);

	}

	@Test(priority = 4, enabled = true, description = "Verifying Create API Endpoint page with Server URL as Mandatory field")
	public void VerifyingCreateAPIEndpointPagewithServerURLasMandatoryfield() throws Throwable {
		child3 = _extent_report.startTest("Verifying Create API Endpoint page with Server URL as Mandatory field");
		child3.assignCategory("Create API Endpoint");
		try {

			Thread.sleep(3000);
			CEPP.MangeEndPointClick.click();
			Thread.sleep(2000);
			CEPP.CreateEndPointClick.click();
			Thread.sleep(2000);
			CEPP.EnterAPIName.sendKeys("Testapi" + api++);
			Thread.sleep(2000);
			CEPP.ClickOnDropdow.click();
			Thread.sleep(2000);
			CEPP.ClickOCreateAPIFromDropDown.click();
			Thread.sleep(2000);

			CEPP.ClickOnProxyWebMethod.click();
			Thread.sleep(2000);
			CEPP.ClickOnGetMethod.click();
			Thread.sleep(2000);

			CEPP.ClickOnProxyAuthorization.click();
			Thread.sleep(2000);
			CEPP.ClickOnAuthDropDown.click();
			CEPP.SelectNoAuth.click();
			Thread.sleep(2000);

			CEPP.ClickOnServerAuthorization.click();
			Thread.sleep(2000);
			CEPP.ClickOnAuthDropDown.click();
			CEPP.SelectNoAuth.click();
			Thread.sleep(2000);
			CEPP.ClickOnParams.click();
			Thread.sleep(2000);
			CEPP.ClickOnHeaders.click();
			Thread.sleep(2000);
			CEPP.ClickOnCreateButton.click();
			Thread.sleep(2000);
			String title = CEPP.serverurlErrorMsg.getText();
			System.out.println(title);
			if (title.equals("Server URL is required.")) {
				child3.log(LogStatus.PASS, "Validation successful because we are getting message as '" + title
						+ "' when we submit with server url  as Mandatory Field");
			} else {
				child3.log(LogStatus.FAIL, "Validation Unsuccessful because we are getting message as  '" + title
						+ "'instead of 'Please enter server url' when we submit with server url  as Mandatory Field ");
			}

		} catch (Exception e) {
			child3.log(LogStatus.FAIL, e.fillInStackTrace());
		}
		_extent_report.endTest(child3);

	}

	@Test(priority = 5, enabled = true, description = "Verifying create API endpoint page with api type as Create API with valid data")
	public void verifyingCreateAPIEndpointpagewithapitypeasCreateAPIwithvaliddata() throws Throwable {
		child4 = _extent_report
				.startTest("verifying create API endpoint page with api type as Create API with valid data");
		child4.assignCategory("Create API Endpoint");
		try {

			Thread.sleep(3000);
			CEPP.MangeEndPointClick.click();
			Thread.sleep(2000);
			CEPP.CreateEndPointClick.click();
			Thread.sleep(2000);
			CEPP.EnterAPIName.sendKeys("testingsetup1");
			Thread.sleep(2000);
			CEPP.ClickOnDropdow.click();
			Thread.sleep(2000);
			CEPP.ClickOCreateAPIFromDropDown.click();
			Thread.sleep(2000);

			CEPP.ClickOnProxyWebMethod.click();
			Thread.sleep(2000);
			CEPP.ClickOnGetMethod.click();
			Thread.sleep(2000);

			CEPP.EnterServerURL.sendKeys(serverurl + "/pcm/workflow");
			Thread.sleep(2000);
			CEPP.ClickOnProxyAuthorization.click();
			Thread.sleep(2000);
			CEPP.ClickOnAuthDropDown.click();
			Thread.sleep(2000);
			CEPP.SelectNoAuth.click();
			Thread.sleep(2000);
			CEPP.ClickOnServerAuthorization.click();
			Thread.sleep(2000);
			CEPP.ClickOnAuthDropDown.click();
			Thread.sleep(2000);
			CEPP.SelectNoAuth.click();

			Thread.sleep(2000);
			CEPP.ClickOnParams.click();
			Thread.sleep(2000);
			CEPP.ClickOnHeaders.click();
			Thread.sleep(2000);
			CEPP.ClickOnCreateButton.click();

			String title = CEPP.SuccessMsgPop.getText();
			System.out.println(title);
			if (title.equals("Proxy endpoint created successfully")) {
				child4.log(LogStatus.PASS, "Validation successful because we are getting message as '" + title
						+ "' when we submit with valid data'");
			} else {
				child4.log(LogStatus.FAIL, "Validation Unsuccessful because we are getting message as" + title
						+ "instead of when we submit with Valid");
			}

		} catch (Exception e) {
			child4.log(LogStatus.FAIL, e.fillInStackTrace());
		}
		_extent_report.endTest(child4);

	}

	@Test(priority = 6, enabled = true, description = "Verifying create API endpoint page with api type as Create API with invalid data")
	public void verifyingcreateAPIendpointpagewithapitypeasCreateAPIwithinvaliddata() throws Throwable {
		child5 = _extent_report
				.startTest("Verifying create API endpoint page with api type as Create API with invalid data");
		child5.assignCategory("Create API Endpoint");
		try {
			Thread.sleep(3000);
			CEPP.MangeEndPointClick.click();
			Thread.sleep(2000);
			CEPP.CreateEndPointClick.click();
			Thread.sleep(2000);

			CEPP.EnterAPIName.sendKeys("Testapi" + api++);
			Thread.sleep(2000);
			CEPP.ClickOnDropdow.click();
			Thread.sleep(2000);
			CEPP.ClickOCreateAPIFromDropDown.click();
			Thread.sleep(2000);

			CEPP.ClickOnProxyWebMethod.click();
			Thread.sleep(2000);
			CEPP.ClickOnGetMethod.click();
			Thread.sleep(2000);
			CEPP.EnterServerURL.sendKeys(serverurl + "/pcm/workflow");
			Thread.sleep(2000);
			CEPP.ClickOnProxyAuthorization.click();
			Thread.sleep(2000);
			CEPP.ClickOnAuthDropDown.click();
			Thread.sleep(2000);
			CEPP.SelectNoAuth.click();
			Thread.sleep(2000);
			CEPP.ClickOnServerAuthorization.click();
			Thread.sleep(2000);
			CEPP.ClickOnAuthDropDown.click();
			CEPP.SelectNoAuth.click();
			Thread.sleep(2000);
			CEPP.ClickOnParams.click();
			Thread.sleep(2000);
			CEPP.ClickOnHeaders.click();
			Thread.sleep(2000);
			CEPP.ClickOnCreateButton.click();

			String title = CEPP.SuccessMsgPop.getText();
			System.out.println(title);
			if (title.equals("Proxy endpoint created successfully")) {
				child5.log(LogStatus.PASS, "Validation successful because we are getting message as '" + title
						+ "' when we submit with In-valid data'");
			} else {
				child5.log(LogStatus.FAIL, "Validation Unsuccessful because we are getting message as ''" + title
						+ "''instead of '' when we submit with In-Valid'");
			}

		} catch (Exception e) {
			child5.log(LogStatus.FAIL, e.fillInStackTrace());
		}
		_extent_report.endTest(child5);

	}

	@Test(priority = 7, enabled = true, description = "Verifying create api with proxy auth as no auth")
	public void verifyingcreateapiwithproxyauthasnoauth() throws Throwable {
		child6 = _extent_report.startTest("Verifying create api with proxy auth as no auth");
		child6.assignCategory("Create API Endpoint");
		try {
			Thread.sleep(3000);
			CEPP.MangeEndPointClick.click();
			Thread.sleep(2000);
			CEPP.CreateEndPointClick.click();
			Thread.sleep(2000);
			CEPP.EnterAPIName.sendKeys("testingsetup2");
			Thread.sleep(2000);
			CEPP.ClickOnDropdow.click();
			Thread.sleep(2000);
			CEPP.ClickOCreateAPIFromDropDown.click();
			Thread.sleep(2000);

			CEPP.ClickOnProxyWebMethod.click();
			Thread.sleep(2000);
			CEPP.ClickOnGetMethod.click();

			Thread.sleep(2000);
			CEPP.EnterServerURL.sendKeys(serverurl + "/pcm/workflow");
			Thread.sleep(2000);
			CEPP.ClickOnProxyAuthorization.click();
			Thread.sleep(2000);
			CEPP.ClickOnAuthDropDown.click();
			Thread.sleep(2000);
			CEPP.SelectNoAuth.click();
			Thread.sleep(2000);
			CEPP.ClickOnCreateButton.click();

			String title = CEPP.SuccessMsgPop.getText();
			System.out.println(title);
			if (title.equals("Proxy endpoint created successfully")) {
				child6.log(LogStatus.PASS, "Validation successful because we are getting message as " + title
						+ "when we submit with In-valid data'");
			} else {
				child6.log(LogStatus.FAIL, "Validation Unsuccessful because we are getting message as" + title
						+ "instead of when we submit with In-Valid'");
			}

		} catch (Exception e) {
			child6.log(LogStatus.FAIL, e.fillInStackTrace());
		}
		_extent_report.endTest(child6);

	}

	@Test(priority = 8, enabled = true, description = "Verifying create api with proxy auth as basic auth with mandatory  fields")
	public void VerifyingCreateapiwithproxyAuthasbasicauthwithmandatoryfields() throws Throwable {
		child7 = _extent_report.startTest("Verifying create api with proxy auth as basic auth with mandatory  fields");
		child7.assignCategory("Create API Endpoint");
		try {
			Thread.sleep(3000);
			CEPP.MangeEndPointClick.click();
			Thread.sleep(2000);
			CEPP.CreateEndPointClick.click();
			Thread.sleep(2000);
			CEPP.EnterAPIName.sendKeys("testingsetup3");
			Thread.sleep(2000);
			CEPP.ClickOnDropdow.click();
			Thread.sleep(2000);
			CEPP.ClickOCreateAPIFromDropDown.click();
			Thread.sleep(2000);
			CEPP.ClickOnProxyWebMethod.click();
			Thread.sleep(2000);
			CEPP.ClickOnGetMethod.click();

			Thread.sleep(2000);
			CEPP.EnterServerURL.sendKeys(serverurl + "/pcm/workflow");
			Thread.sleep(2000);
			CEPP.ClickOnProxyAuthorization.click();
			Thread.sleep(2000);
			CEPP.ClickOnAuthDropDown.click();
			Thread.sleep(1000);
			CEPP.SelectBasicAuth.click();

			Thread.sleep(2000);
			CEPP.ProxyUserName.sendKeys("cm_user");
			Thread.sleep(2000);
			CEPP.ProxyPassword.sendKeys("password");
			Thread.sleep(2000);
			CEPP.ClickOnCreateButton.click();

			String title = CEPP.SuccessMsgPop.getText();
			System.out.println(title);
			if (title.equals("Proxy endpoint created successfully")) {
				child7.log(LogStatus.PASS, "Validation successful because we are getting message as ''" + title
						+ "'' when we Verifying create api with proxy auth as basic auth with mandatory  fields'");
			} else {
				child7.log(LogStatus.FAIL, "Validation Unsuccessful because we are getting message as ''" + title
						+ "''instead of '' when we Verifying create api with proxy auth as basic auth with mandatory  fields'");
			}

		} catch (Exception e) {
			child7.log(LogStatus.FAIL, e.fillInStackTrace());
		}
		_extent_report.endTest(child7);

	}

	@Test(priority = 9, enabled = true, description = "Verifying create api with proxy auth as basic auth without mandatory fields")
	public void verifyingCreateApiwithProxyauthasBasicauthwithoutmandatoryfields() throws Throwable {
		child8 = _extent_report
				.startTest("Verifying create api with proxy auth as basic auth without mandatory fields");
		child8.assignCategory("Create API Endpoint");
		try {
			Thread.sleep(3000);
			CEPP.MangeEndPointClick.click();
			Thread.sleep(2000);
			CEPP.CreateEndPointClick.click();
			Thread.sleep(2000);
			CEPP.EnterAPIName.sendKeys("Testapi" + api++);
			Thread.sleep(2000);
			CEPP.ClickOnDropdow.click();
			Thread.sleep(2000);
			CEPP.ClickOCreateAPIFromDropDown.click();
			Thread.sleep(2000);

			CEPP.ClickOnProxyWebMethod.click();
			Thread.sleep(2000);
			CEPP.ClickOnGetMethod.click();

			Thread.sleep(2000);
			CEPP.EnterServerURL.sendKeys(serverurl + "/pcm/workflow");
			Thread.sleep(2000);
			CEPP.ClickOnProxyAuthorization.click();
			Thread.sleep(2000);
			CEPP.ClickOnAuthDropDown.click();
			Thread.sleep(2000);
			CEPP.SelectBasicAuth.click();
			Thread.sleep(2000);
			CEPP.ProxyUserName.sendKeys("cm_user");
			Thread.sleep(2000);
			CEPP.ClickOnCreateButton.click();

			String title = CEPP.ProxyPasswordErrorMsg.getText();
			System.out.println(title);
			if (title.equals("Password is required.")) {
				child8.log(LogStatus.PASS, "Validation successful because we are getting message as" + title
						+ " when we Verifying create api with proxy auth as basic auth with mandatory  fields");
			} else {
				child8.log(LogStatus.FAIL, "Validation Unsuccessful because we are getting message as" + title
						+ "instead of  when we verifying create api with proxy auth as basic auth without mandatory fields");
			}

		} catch (Exception e) {
			child8.log(LogStatus.FAIL, e.fillInStackTrace());
		}
		_extent_report.endTest(child8);

	}

	@Test(priority = 10, enabled = true, description = "Verifying create api with proxy auth as token auth and token url as mandatory fields")
	public void VerifyingCreateApiwithproxyauthasTokenauthwithmandatoryfields() throws Throwable {
		child9 = _extent_report
				.startTest("Verifying create api with proxy auth as token auth and token url as mandatory fields");
		child9.assignCategory("Create API Endpoint");
		try {
			Thread.sleep(3000);
			CEPP.MangeEndPointClick.click();
			Thread.sleep(2000);
			CEPP.CreateEndPointClick.click();
			Thread.sleep(2000);
			CEPP.EnterAPIName.sendKeys("Testapi" + api++);
			Thread.sleep(2000);
			CEPP.ClickOnDropdow.click();
			Thread.sleep(2000);
			CEPP.ClickOCreateAPIFromDropDown.click();
			Thread.sleep(2000);

			CEPP.ClickOnProxyWebMethod.click();
			Thread.sleep(2000);
			CEPP.ClickOnGetMethod.click();

			Thread.sleep(2000);
			CEPP.EnterServerURL.sendKeys(serverurl + "/pcm/workflow");
			Thread.sleep(2000);
			CEPP.ClickOnProxyAuthorization.click();
			Thread.sleep(2000);
			CEPP.ClickOnAuthDropDown.click();
			Thread.sleep(2000);
			CEPP.SelectTokenAuth.click();
			Thread.sleep(2000);
			// CEPP.EnterTokenURL.sendKeys("https://20.55.8.64:7080//pcm/workflow/export");
			CEPP.ProxyTokenKey.sendKeys("token");
			Thread.sleep(2000);
			CEPP.ProxyUserName.sendKeys("cm_user");
			Thread.sleep(2000);
			CEPP.ProxyPassword.sendKeys("password");
			Thread.sleep(2000);
			CEPP.ProxyPrefix.sendKeys("Bearer");
			Thread.sleep(2000);
			CEPP.ProxyHeader.sendKeys("Authorization");

			Thread.sleep(2000);

			CEPP.ClickOnCreateButton.click();
			Thread.sleep(2000);
			String title = CEPP.TokenUrlErrorMsg.getText();
			System.out.println(title);
			if (title.equals("Token URL is required.")) {
				child9.log(LogStatus.PASS, "Validation successful because we are getting message as " + title
						+ " when we Verifying create api with proxy auth as token auth and token url as mandatory fields'");
			} else {
				child9.log(LogStatus.FAIL, "Validation Unsuccessful because we are getting message as " + title
						+ "instead of when we Verifying create api with proxy auth as token auth and token url as mandatory fields");
			}

		} catch (Exception e) {
			child9.log(LogStatus.FAIL, e.fillInStackTrace());
		}
		_extent_report.endTest(child9);

	}

	@Test(priority = 11, enabled = true, description = "Verifying create api with proxy auth as token auth and token key as mandatory fields")
	public void VerifyingCreateApiwithproxyAuthasTokenauthandTokenkeyasmandatoryfields() throws Throwable {
		child10 = _extent_report
				.startTest("Verifying create api with proxy auth as token auth and token key as mandatory fields");
		child10.assignCategory("Create API Endpoint");
		try {
			Thread.sleep(3000);
			CEPP.MangeEndPointClick.click();
			Thread.sleep(2000);
			CEPP.CreateEndPointClick.click();
			Thread.sleep(2000);
			CEPP.EnterAPIName.sendKeys("Testapi" + api++);
			Thread.sleep(2000);
			CEPP.ClickOnDropdow.click();
			Thread.sleep(2000);
			CEPP.ClickOCreateAPIFromDropDown.click();
			Thread.sleep(2000);

			CEPP.ClickOnProxyWebMethod.click();
			Thread.sleep(2000);
			CEPP.ClickOnGetMethod.click();
			Thread.sleep(2000);

			CEPP.EnterServerURL.sendKeys(serverurl + "/pcm/workflow");
			Thread.sleep(2000);
			CEPP.ClickOnProxyAuthorization.click();
			Thread.sleep(2000);
			CEPP.ClickOnAuthDropDown.click();
			Thread.sleep(2000);
			CEPP.SelectTokenAuth.click();
			Thread.sleep(2000);
			CEPP.ProxyTokenUrl.sendKeys("https://20.55.8.64:7080//pcm/workflow/export");
			Thread.sleep(2000);
			CEPP.ProxyUserName.sendKeys("cm_user");
			Thread.sleep(2000);
			CEPP.ProxyPassword.sendKeys("password");
			Thread.sleep(2000);
			CEPP.ProxyPrefix.sendKeys("Bearer");
			Thread.sleep(2000);
			CEPP.ProxyHeader.sendKeys("Authorization");
			Thread.sleep(2000);

			// CEPP.ClickOnHeaders.click();
			CEPP.ClickOnCreateButton.click();
			Thread.sleep(2000);

			String title = CEPP.TokenKeyErrorMsg.getText();
			System.out.println(title);
			if (title.equals("Token Key is required.")) {
				child10.log(LogStatus.PASS, "Validation successful because we are getting message as" + title
						+ " when we Verifying create api with proxy auth as token auth and token key as mandatory fields");
			} else {
				child10.log(LogStatus.FAIL, "Validation Unsuccessful because we are getting message as " + title
						+ "instead of  when we Verifying create api with proxy auth as token auth and token key as mandatory fields");
			}

		} catch (Exception e) {
			child10.log(LogStatus.FAIL, e.fillInStackTrace());
		}
		_extent_report.endTest(child10);

	}

	@Test(priority = 12, enabled = true, description = "Verifying create api with proxy auth as token auth and username as mandatory fields")
	public void VerifyingCreateApiwithproxyauthasTokenauthandUsernameasmandatoryfields() throws Throwable {
		child11 = _extent_report
				.startTest("Verifying create api with proxy auth as token auth and username as mandatory fields");
		child11.assignCategory("Create API Endpoint");
		try {
			Thread.sleep(3000);
			CEPP.MangeEndPointClick.click();
			Thread.sleep(2000);
			CEPP.CreateEndPointClick.click();
			Thread.sleep(2000);
			CEPP.EnterAPIName.sendKeys("Testapi" + api++);
			Thread.sleep(2000);
			CEPP.ClickOnDropdow.click();
			Thread.sleep(2000);
			CEPP.ClickOCreateAPIFromDropDown.click();
			Thread.sleep(2000);

			CEPP.ClickOnProxyWebMethod.click();
			Thread.sleep(2000);
			CEPP.ClickOnGetMethod.click();

			Thread.sleep(2000);
			CEPP.EnterServerURL.sendKeys(serverurl + "/pcm/workflow");
			Thread.sleep(2000);
			CEPP.ClickOnProxyAuthorization.click();
			Thread.sleep(2000);
			CEPP.ClickOnAuthDropDown.click();
			Thread.sleep(2000);
			CEPP.SelectTokenAuth.click();
			Thread.sleep(2000);
			CEPP.ProxyTokenUrl.sendKeys("https://20.55.8.64:7080//pcm/workflow/export");
			Thread.sleep(2000);
			CEPP.ProxyTokenKey.sendKeys("token");
			Thread.sleep(2000);
			// CEPP.ProxyUserName.sendKeys("cm_user");
			CEPP.ProxyPassword.sendKeys("password");
			Thread.sleep(2000);
			CEPP.ProxyPrefix.sendKeys("Bearer");
			Thread.sleep(2000);
			CEPP.ProxyHeader.sendKeys("Authorization");
			Thread.sleep(2000);
			// CEPP.ClickOnHeaders.click();
			CEPP.ClickOnCreateButton.click();
			Thread.sleep(2000);
			String title = CEPP.ProxyUsernameErrorMsg.getText();
			System.out.println(title);
			if (title.equals("User Name is required.")) {
				child11.log(LogStatus.PASS, "Validation successful because we are getting message as " + title
						+ " when we Verifying create api with proxy auth as token auth and username as mandatory fields");
			} else {
				child11.log(LogStatus.FAIL, "Validation Unsuccessful because we are getting message as" + title
						+ "instead of when we Verifying create api with proxy auth as token auth and username as mandatory fields");
			}

		} catch (Exception e) {
			child11.log(LogStatus.FAIL, e.fillInStackTrace());
		}
		_extent_report.endTest(child11);

	}

	@Test(priority = 13, enabled = true, description = "Verifying create api with proxy auth as token auth and password as mandatory fields")
	public void VerifyingCreateApiwithProxyauthasTokenAuthandPasswordasmandatoryfields() throws Throwable {
		child12 = _extent_report
				.startTest("Verifying create api with proxy auth as token auth and password as mandatory fields");
		child12.assignCategory("Create API Endpoint");
		try {
			Thread.sleep(3000);
			CEPP.MangeEndPointClick.click();
			Thread.sleep(2000);
			CEPP.CreateEndPointClick.click();
			Thread.sleep(2000);
			CEPP.EnterAPIName.sendKeys("Testapi" + api++);
			Thread.sleep(2000);
			CEPP.ClickOnDropdow.click();
			Thread.sleep(2000);
			CEPP.ClickOCreateAPIFromDropDown.click();
			Thread.sleep(2000);

			CEPP.ClickOnProxyWebMethod.click();
			Thread.sleep(2000);
			CEPP.ClickOnGetMethod.click();

			Thread.sleep(2000);

			CEPP.EnterServerURL.sendKeys(serverurl + "/pcm/workflow");
			Thread.sleep(2000);
			CEPP.ClickOnProxyAuthorization.click();
			Thread.sleep(2000);
			CEPP.ClickOnAuthDropDown.click();
			Thread.sleep(2000);
			CEPP.SelectTokenAuth.click();
			Thread.sleep(2000);
			CEPP.ProxyTokenUrl.sendKeys("https://20.55.8.64:7080//pcm/workflow/export");
			Thread.sleep(2000);
			CEPP.ProxyTokenKey.sendKeys("token");
			Thread.sleep(2000);
			CEPP.ProxyUserName.sendKeys("cm_user");
			Thread.sleep(2000);
			// CEPP.EnterPassword.sendKeys("password");
			CEPP.ProxyPrefix.sendKeys("Bearer");
			Thread.sleep(2000);
			CEPP.ProxyHeader.sendKeys("Authorization");
			Thread.sleep(2000);
			// CEPP.ClickOnHeaders.click();
			CEPP.ClickOnCreateButton.click();

			String title = CEPP.ProxyPasswordErrorMsg.getText();
			System.out.println(title);
			if (title.equals("Password is required.")) {
				child12.log(LogStatus.PASS, "Validation successful because we are getting message as" + title
						+ " when we Verifying create api with proxy auth as token auth and password as mandatory fields'");
			} else {
				child12.log(LogStatus.FAIL, "Validation Unsuccessful because we are getting message as not coming"
						+ title
						+ "instead of  when we Verifying create api with proxy auth as token auth and password as mandatory fields");
			}

		} catch (Exception e) {
			child12.log(LogStatus.FAIL, e.fillInStackTrace());
		}
		_extent_report.endTest(child12);

	}

	@Test(priority = 14, enabled = true, description = "Verifying create api with proxy auth as token auth and token header as mandatory fields")
	public void VerifyingCreateApiwithproxyauthasTokenauthandTokenHeaderasMandatoryFields() throws Throwable {
		child13 = _extent_report
				.startTest("Verifying create api with proxy auth as token auth and token header as mandatory fields");
		child13.assignCategory("Create API Endpoint");
		try {
			Thread.sleep(3000);
			CEPP.MangeEndPointClick.click();
			Thread.sleep(2000);
			CEPP.CreateEndPointClick.click();
			Thread.sleep(2000);
			CEPP.EnterAPIName.sendKeys("Testapi" + api++);
			Thread.sleep(2000);
			CEPP.ClickOnDropdow.click();
			Thread.sleep(2000);
			CEPP.ClickOCreateAPIFromDropDown.click();
			Thread.sleep(2000);

			CEPP.ClickOnProxyWebMethod.click();
			Thread.sleep(2000);
			CEPP.ClickOnGetMethod.click();

			Thread.sleep(2000);

			CEPP.EnterServerURL.sendKeys(serverurl + "/pcm/workflow");
			Thread.sleep(2000);
			CEPP.ClickOnProxyAuthorization.click();
			Thread.sleep(2000);
			CEPP.ClickOnAuthDropDown.click();
			Thread.sleep(2000);
			CEPP.SelectTokenAuth.click();
			Thread.sleep(2000);
			CEPP.ProxyTokenUrl.sendKeys("https://20.55.8.64:7080//pcm/workflow/export");
			Thread.sleep(2000);
			CEPP.ProxyTokenKey.sendKeys("token");
			Thread.sleep(2000);
			CEPP.ProxyUserName.sendKeys("cm_user");
			Thread.sleep(2000);
			CEPP.ProxyPassword.sendKeys("password");
			Thread.sleep(2000);
			CEPP.ProxyPrefix.sendKeys("Bearer");
			// CEPP.ProxyHeader.sendKeys("Authorization");
			Thread.sleep(2000);
			CEPP.ClickOnCreateButton.click();

			String title = CEPP.TokenHeaderErrorMsg.getText();
			System.out.println(title);
			if (title.equals("Token Header is required.")) {
				child13.log(LogStatus.PASS, "Validation successful because we are getting message as " + title
						+ " when we Verifying create api with proxy auth as token auth and token header as mandatory fields");
			} else {
				child13.log(LogStatus.FAIL, "Validation Unsuccessful because we are getting message as ''" + title
						+ "instead of when we Verifying create api with proxy auth as token auth and token header as mandatory fields'");
			}

		} catch (Exception e) {
			child13.log(LogStatus.FAIL, e.fillInStackTrace());
		}
		_extent_report.endTest(child13);

	}

	@Test(priority = 15, enabled = true, description = "verifying create api with proxy auth as Token auth with mandatory fields")
	public void verifyingCreateApiwithproxyAuthasTokenauthwithmandatoryFields() throws Throwable {
		child14 = _extent_report.startTest("verifying create api with proxy auth as Token auth with mandatory fields");
		child14.assignCategory("Create API Endpoint");
		try {
			Thread.sleep(3000);
			CEPP.MangeEndPointClick.click();
			Thread.sleep(2000);
			CEPP.CreateEndPointClick.click();
			Thread.sleep(2000);
			CEPP.EnterAPIName.sendKeys("testingsetup4");
			Thread.sleep(2000);
			CEPP.ClickOnDropdow.click();
			Thread.sleep(2000);
			CEPP.ClickOCreateAPIFromDropDown.click();
			Thread.sleep(2000);

			CEPP.ClickOnProxyWebMethod.click();
			Thread.sleep(2000);
			CEPP.ClickOnGetMethod.click();

			Thread.sleep(2000);
			CEPP.EnterServerURL.sendKeys(serverurl + "/pcm/workflow");
			Thread.sleep(2000);
			CEPP.ClickOnProxyAuthorization.click();
			Thread.sleep(2000);
			CEPP.ClickOnAuthDropDown.click();
			Thread.sleep(2000);
			CEPP.SelectTokenAuth.click();
			Thread.sleep(2000);
			CEPP.ProxyTokenUrl.sendKeys("https://20.55.8.64:7080//pcm/workflow/export");
			Thread.sleep(2000);
			CEPP.ProxyTokenKey.sendKeys("token");
			Thread.sleep(2000);
			CEPP.ProxyUserName.sendKeys("cm_user");
			Thread.sleep(2000);
			CEPP.ProxyPassword.sendKeys("password");
			Thread.sleep(2000);
			CEPP.ProxyPrefix.sendKeys("Bearer");
			Thread.sleep(2000);
			CEPP.ProxyHeader.sendKeys("Authorization");
			Thread.sleep(2000);

			CEPP.ClickOnCreateButton.click();

			String title = CEPP.SuccessMsgPop.getText();
			System.out.println(title);
			if (title.equals("Proxy endpoint created successfully")) {
				child14.log(LogStatus.PASS, "Validation successful because we are getting message as ''" + title
						+ "'' when we verifying create api with proxy auth as Token auth with mandatory fields'");
			} else {
				child14.log(LogStatus.FAIL, "Validation Unsuccessful because we are getting message as ''" + title
						+ "''instead of '' when we verifying create api with proxy auth as Token auth with mandatory fields'");
			}

		} catch (Exception e) {
			child14.log(LogStatus.FAIL, e.fillInStackTrace());
		}
		_extent_report.endTest(child14);

	}

	@Test(priority = 16, enabled = true, description = "verifying create api with proxy auth as token auth without mandatory fields")
	public void VerifyingCreateApiwithproxyauthastokenAuthwithoutMandatoryFields() throws Throwable {
		child15 = _extent_report
				.startTest("verifying create api with proxy auth as token auth without mandatory fields");
		child15.assignCategory("Create API Endpoint");
		try {
			Thread.sleep(4000);
			CEPP.MangeEndPointClick.click();
			Thread.sleep(2000);
			CEPP.CreateEndPointClick.click();
			Thread.sleep(2000);
			CEPP.EnterAPIName.sendKeys("Testapi" + api++);
			Thread.sleep(2000);
			CEPP.ClickOnDropdow.click();
			Thread.sleep(2000);
			CEPP.ClickOCreateAPIFromDropDown.click();
			Thread.sleep(2000);

			CEPP.ClickOnProxyWebMethod.click();
			Thread.sleep(2000);
			CEPP.ClickOnGetMethod.click();
			Thread.sleep(2000);
			CEPP.EnterServerURL.sendKeys("https://20.55.8.64:7080//pcm/workflow");
			Thread.sleep(2000);
			CEPP.ClickOnProxyAuthorization.click();
			Thread.sleep(2000);
			CEPP.ClickOnAuthDropDown.click();
			Thread.sleep(2000);
			CEPP.SelectTokenAuth.click();

			Thread.sleep(2000);
			// CEPP.ClickOnHeaders.click();
			CEPP.ClickOnCreateButton.click();

			String title = CEPP.TokenUrlErrorMsg.getText();
			System.out.println(title);
			if (title.equals("Token URL is required.")) {
				child15.log(LogStatus.PASS, "Validation successful because we are getting message as " + title
						+ " when we Verifying create api with proxy auth as token auth and token url as mandatory fields'");
			} else {
				child15.log(LogStatus.FAIL, "Validation Unsuccessful because we are getting message as " + title
						+ "instead of when we Verifying create api with proxy auth as token auth and token url as mandatory fields");
			}

		} catch (Exception e) {
			child15.log(LogStatus.FAIL, e.fillInStackTrace());
		}
		_extent_report.endTest(child15);

	}

	@Test(priority = 17, enabled = true, description = "Verifying create api with proxy auth as O Auth1.0")
	public void VerifyingCreatApiwithproxyAuthasOAuth() throws Throwable {
		child16 = _extent_report.startTest("verifying create api with proxy auth as O Auth1.0");
		child16.assignCategory("Create API Endpoint");
		try {
			Thread.sleep(4000);
			CEPP.MangeEndPointClick.click();
			Thread.sleep(2000);
			CEPP.CreateEndPointClick.click();
			Thread.sleep(2000);
			CEPP.EnterAPIName.sendKeys("testingsetup5");
			Thread.sleep(2000);
			CEPP.ClickOnDropdow.click();
			Thread.sleep(2000);
			CEPP.ClickOCreateAPIFromDropDown.click();
			Thread.sleep(2000);

			CEPP.ClickOnProxyWebMethod.click();
			Thread.sleep(2000);
			CEPP.ClickOnGetMethod.click();

			Thread.sleep(2000);
			CEPP.EnterServerURL.sendKeys(serverurl + "/pcm/workflow");
			Thread.sleep(2000);
			CEPP.ClickOnProxyAuthorization.click();
			Thread.sleep(2000);
			CEPP.ClickOnAuthDropDown.click();
			Thread.sleep(2000);
			CEPP.SelectNoAuth.click();
			Thread.sleep(2000);
			CEPP.ClickOnCreateButton.click();

			String title = CEPP.SuccessMsgPop.getText();
			System.out.println(title);
			if (title.equals("Proxy endpoint created successfully")) {
				child16.log(LogStatus.PASS, "Validation successful because we are getting message as ''" + title
						+ "'' when we verifying create api with proxy auth as O Auth1.0'");
			} else {
				child16.log(LogStatus.FAIL, "Validation Unsuccessful because we are getting message as ''" + title
						+ "''instead of '' when we verifying create api with proxy auth as O Auth1.0'");
			}

		} catch (Exception e) {
			child16.log(LogStatus.FAIL, e.fillInStackTrace());
		}
		_extent_report.endTest(child16);

	}

	@Test(priority = 18, enabled = true, description = "Verifying create api with proxy auth as O Auth2.0")
	public void VerifyingCreateApiwithproxyAuthasOAuth() throws Throwable {
		child17 = _extent_report.startTest("Verifying create api with proxy auth as O Auth2.0");
		child17.assignCategory("Create API Endpoint");
		try {
			Thread.sleep(4000);
			CEPP.MangeEndPointClick.click();
			Thread.sleep(2000);
			CEPP.CreateEndPointClick.click();
			Thread.sleep(2000);
			CEPP.EnterAPIName.sendKeys("testingsetup6");
			Thread.sleep(2000);
			CEPP.ClickOnDropdow.click();
			Thread.sleep(2000);
			CEPP.ClickOCreateAPIFromDropDown.click();
			Thread.sleep(2000);

			CEPP.ClickOnProxyWebMethod.click();
			Thread.sleep(2000);
			CEPP.ClickOnGetMethod.click();

			Thread.sleep(2000);
			CEPP.EnterServerURL.sendKeys(serverurl + "/pcm/workflow");
			Thread.sleep(2000);
			CEPP.ClickOnProxyAuthorization.click();
			Thread.sleep(2000);
			CEPP.ClickOnAuthDropDown.click();
			Thread.sleep(2000);
			CEPP.SelectNoAuth.click();
			Thread.sleep(2000);
			CEPP.ClickOnCreateButton.click();

			String title = CEPP.SuccessMsgPop.getText();
			System.out.println(title);
			if (title.equals("Proxy endpoint created successfully")) {
				child17.log(LogStatus.PASS, "Validation successful because we are getting message as " + title
						+ "when we verifying create api with proxy auth as O Auth2.0'");
			} else {
				child17.log(LogStatus.FAIL, "Validation Unsuccessful because we are getting message as " + title
						+ "instead of when we verifying create api with proxy auth as O Auth2.0'");
			}

		} catch (Exception e) {
			child17.log(LogStatus.FAIL, e.fillInStackTrace());
		}
		_extent_report.endTest(child17);

	}

	@Test(priority = 19, enabled = true, description = "Verifying create api with server auth as no auth")
	public void VerifyingCreateApiwithServerAuthasNoauth() throws Throwable {
		child18 = _extent_report.startTest("Verifying create api with server auth as no auth");
		child18.assignCategory("Create API Endpoint");
		try {
			Thread.sleep(4000);
			CEPP.MangeEndPointClick.click();
			Thread.sleep(2000);
			CEPP.CreateEndPointClick.click();
			Thread.sleep(2000);
			CEPP.EnterAPIName.sendKeys("testingsetup7");
			Thread.sleep(2000);
			CEPP.ClickOnDropdow.click();
			Thread.sleep(2000);
			CEPP.ClickOCreateAPIFromDropDown.click();
			Thread.sleep(2000);

			CEPP.ClickOnProxyWebMethod.click();
			Thread.sleep(2000);
			CEPP.ClickOnGetMethod.click();
			Thread.sleep(2000);

			CEPP.EnterServerURL.sendKeys(serverurl + "/pcm/workflow");
			Thread.sleep(2000);

			CEPP.ClickOnServerAuthorization.click();
			Thread.sleep(2000);
			CEPP.ClickOnAuthDropDown.click();
			Thread.sleep(2000);
			CEPP.SelectNoAuth.click();
			Thread.sleep(2000);
			CEPP.ClickOnCreateButton.click();

			String title = CEPP.SuccessMsgPop.getText();
			System.out.println(title);
			if (title.equals("Proxy endpoint created successfully")) {
				child18.log(LogStatus.PASS, "Validation successful because we are getting message as " + title
						+ "'' when we Verifying create api with server auth as no auth");
			} else {
				child18.log(LogStatus.FAIL, "Validation Unsuccessful because we are getting message as " + title
						+ "instead of  when we Verifying create api with server auth as no auth'");
			}

		} catch (Exception e) {
			child18.log(LogStatus.FAIL, e.fillInStackTrace());
		}
		_extent_report.endTest(child18);

	}

	@Test(priority = 20, enabled = true, description = "Verifying create api with server auth as basic auth without mandatory fields")
	public void VerifyingCreateApiwithServerauthasBasicauthwithoutMandatoryFields() throws Throwable {
		child19 = _extent_report
				.startTest("Verifying create api with server auth as basic auth without mandatory fields");
		child19.assignCategory("Create API Endpoint");
		try {
			Thread.sleep(3000);
			CEPP.MangeEndPointClick.click();
			Thread.sleep(2000);
			CEPP.CreateEndPointClick.click();
			Thread.sleep(2000);
			CEPP.EnterAPIName.sendKeys("Testapi" + api++);
			Thread.sleep(2000);
			CEPP.ClickOnDropdow.click();
			Thread.sleep(2000);
			CEPP.ClickOCreateAPIFromDropDown.click();
			Thread.sleep(2000);

			CEPP.ClickOnProxyWebMethod.click();
			Thread.sleep(2000);
			CEPP.ClickOnGetMethod.click();
			Thread.sleep(2000);

			CEPP.EnterServerURL.sendKeys(serverurl + "/pcm/workflow");
			Thread.sleep(2000);
			CEPP.ClickOnServerAuthorization.click();
			Thread.sleep(2000);
			CEPP.ClickOnAuthDropDown.click();
			Thread.sleep(2000);
			CEPP.SelectBasicAuth.click();
			Thread.sleep(2000);
			CEPP.ServerAuthorizationPassword.sendKeys("password");
			Thread.sleep(2000);
			CEPP.ClickOnCreateButton.click();

			String title = CEPP.ServerUsernameErrorMsg.getText();
			System.out.println(title);
			if (title.equals("user Name is required.")) {
				child19.log(LogStatus.PASS, "Validation successful because we are getting message as " + title
						+ " when we Verifying create api with server auth as basic auth without mandatory fields");
			} else {
				child19.log(LogStatus.FAIL, "Validation Unsuccessful because we are getting message as " + title
						+ "instead of  when we Verifying create api with server auth as basic auth without mandatory fields");
			}

		} catch (Exception e) {
			child19.log(LogStatus.FAIL, e.fillInStackTrace());
		}
		_extent_report.endTest(child19);

	}

	@Test(priority = 21, enabled = true, description = "Verifying create api with server auth as basic auth with mandatory fields")
	public void VerifyingCreateApiwithServerAuthasBasicauthwithoutMandatoryFields() throws Throwable {
		child20 = _extent_report.startTest("Verifying create api with server auth as basic auth with mandatory fields");
		child20.assignCategory("Create API Endpoint");
		try {
			Thread.sleep(4000);
			CEPP.MangeEndPointClick.click();
			Thread.sleep(2000);
			CEPP.CreateEndPointClick.click();
			Thread.sleep(2000);
			CEPP.EnterAPIName.sendKeys("testingsetup8");
			Thread.sleep(2000);
			CEPP.ClickOnDropdow.click();
			Thread.sleep(2000);
			CEPP.ClickOCreateAPIFromDropDown.click();
			Thread.sleep(2000);

			CEPP.ClickOnProxyWebMethod.click();
			Thread.sleep(2000);
			CEPP.ClickOnGetMethod.click();

			CEPP.EnterServerURL.sendKeys(serverurl + "/pcm/workflow");
			Thread.sleep(2000);

			CEPP.ClickOnServerAuthorization.click();
			Thread.sleep(2000);
			CEPP.ClickOnAuthDropDown.click();
			Thread.sleep(2000);
			CEPP.SelectBasicAuth.click();
			Thread.sleep(2000);
			CEPP.ServerAuthorizationUserName.sendKeys("cm_user");
			Thread.sleep(2000);
			CEPP.ServerAuthorizationPassword.sendKeys("password");
			Thread.sleep(2000);
			CEPP.ClickOnCreateButton.click();

			String title = CEPP.SuccessMsgPop.getText();
			System.out.println(title);
			if (title.equals("Proxy endpoint created successfully")) {
				child20.log(LogStatus.PASS, "Validation successful because we are getting message as " + title
						+ " when we verifying create api with server auth as basic auth with mandatory fields");
			} else {
				child20.log(LogStatus.FAIL, "Validation Unsuccessful because we are getting message as " + title
						+ "instead of  when we verifying create api with server auth as basic auth with mandatory fields");
			}

		} catch (Exception e) {
			child20.log(LogStatus.FAIL, e.fillInStackTrace());
		}
		_extent_report.endTest(child20);

	}

	@Test(priority = 22, enabled = true, description = "Verifying create api with server auth as token auth with mandatory fields")
	public void verifyingCreateApiwithServerAuthasTokenauthwithmandatoryFields() throws Throwable {
		child21 = _extent_report.startTest("Verifying create api with server auth as token auth with mandatory fields");
		child21.assignCategory("Create API Endpoint");
		try {
			Thread.sleep(4000);
			CEPP.MangeEndPointClick.click();
			Thread.sleep(2000);
			CEPP.CreateEndPointClick.click();
			Thread.sleep(2000);
			CEPP.EnterAPIName.sendKeys("testingsetup8");
			Thread.sleep(2000);
			CEPP.ClickOnDropdow.click();
			Thread.sleep(2000);
			CEPP.ClickOCreateAPIFromDropDown.click();
			Thread.sleep(2000);

			CEPP.ClickOnProxyWebMethod.click();
			Thread.sleep(2000);
			CEPP.ClickOnGetMethod.click();
			Thread.sleep(2000);

			CEPP.EnterServerURL.sendKeys(serverurl + "/pcm/workflow");
			Thread.sleep(2000);
			CEPP.ClickOnServerAuthorization.click();
			Thread.sleep(2000);
			CEPP.ClickOnAuthDropDown.click();
			Thread.sleep(2000);
			CEPP.SelectTokenAuth.click();
			Thread.sleep(2000);
			CEPP.ServerTokenUrl.sendKeys("https://20.55.8.64:7080//pcm/workflow/export");
			Thread.sleep(2000);
			CEPP.ServerTokenKey.sendKeys("token");
			Thread.sleep(2000);
			CEPP.ServerUserName.sendKeys("cm_user");
			Thread.sleep(2000);
			CEPP.Serverpassword.sendKeys("password");
			Thread.sleep(2000);
			CEPP.ServerHeader.sendKeys("Authorization");
			Thread.sleep(2000);
			CEPP.ServerPrefix.sendKeys("Bearer");
			Thread.sleep(2000);
			CEPP.ClickOnCreateButton.click();

			String title = CEPP.SuccessMsgPop.getText();
			System.out.println(title);
			if (title.equals("Proxy endpoint created successfully")) {
				child21.log(LogStatus.PASS, "Validation successful because we are getting message as" + title
						+ " when we Verifying create api with server auth as token auth with mandatory fields");
			} else {
				child21.log(LogStatus.FAIL, "Validation Unsuccessful because we are getting message as" + title
						+ " instead of when we Verifying create api with server auth as token auth with mandatory fields");
			}

		} catch (Exception e) {
			child21.log(LogStatus.FAIL, e.fillInStackTrace());
		}
		_extent_report.endTest(child21);

	}

	@Test(priority = 23, enabled = true, description = "Verifying create api with server auth as token auth without mandatory fields")
	public void VerifyingCreateApiwithServerAuthasTokenauthWithoutMandatoryFields() throws Throwable {
		child22 = _extent_report
				.startTest("Verifying create api with server auth as token auth without mandatory fields");
		child22.assignCategory("Create API Endpoint");
		try {
			Thread.sleep(4000);
			CEPP.MangeEndPointClick.click();
			Thread.sleep(2000);
			CEPP.CreateEndPointClick.click();
			Thread.sleep(2000);
			CEPP.EnterAPIName.sendKeys("Testapi" + api++);
			Thread.sleep(2000);
			CEPP.ClickOnDropdow.click();
			Thread.sleep(2000);
			CEPP.ClickOCreateAPIFromDropDown.click();
			Thread.sleep(2000);

			CEPP.ClickOnProxyWebMethod.click();
			Thread.sleep(2000);
			CEPP.ClickOnGetMethod.click();

			Thread.sleep(2000);
			CEPP.EnterServerURL.sendKeys(serverurl + "/pcm/workflow");
			Thread.sleep(2000);
			CEPP.ClickOnServerAuthorization.click();
			Thread.sleep(2000);
			CEPP.ClickOnAuthDropDown.click();
			Thread.sleep(2000);
			CEPP.SelectTokenAuth.click();
			Thread.sleep(2000);
			CEPP.ClickOnCreateButton.click();
			Thread.sleep(2000);
			String title = CEPP.ServerTokenURLErrorMsg.getText();
			System.out.println(title);
			if (title.equals("Token URL is required.")) {
				child22.log(LogStatus.PASS, "Validation successful because we are getting message as" + title
						+ " when we Verifying create api with server auth as token auth without mandatory fields");
			} else {
				child22.log(LogStatus.FAIL, "Validation Unsuccessful because we are getting message as " + title
						+ "instead of  when we Verifying create api with server auth as token auth without mandatory fields");
			}

		} catch (Exception e) {
			child22.log(LogStatus.FAIL, e.fillInStackTrace());
		}
		_extent_report.endTest(child22);

	}

	@Test(priority = 24, enabled = true, description = "Verifying create api with server auth as token auth and token url as mandatory fields")
	public void verifyingCreateApiwithServerAuthasTokenauthandTokenUrlasMandatoryFields() throws Throwable {
		child23 = _extent_report
				.startTest("Verifying create api with server auth as token auth and token url as mandatory fields");
		child23.assignCategory("Create API Endpoint");
		try {
			Thread.sleep(4000);
			CEPP.MangeEndPointClick.click();
			Thread.sleep(2000);
			CEPP.CreateEndPointClick.click();
			Thread.sleep(2000);
			CEPP.EnterAPIName.sendKeys("Testapi" + api++);
			Thread.sleep(2000);
			CEPP.ClickOnDropdow.click();
			Thread.sleep(2000);
			CEPP.ClickOCreateAPIFromDropDown.click();
			Thread.sleep(2000);

			CEPP.ClickOnProxyWebMethod.click();
			Thread.sleep(2000);
			CEPP.ClickOnGetMethod.click();

			Thread.sleep(2000);
			CEPP.EnterServerURL.sendKeys(serverurl + "/pcm/workflow");
			Thread.sleep(2000);
			CEPP.ClickOnServerAuthorization.click();
			Thread.sleep(2000);
			CEPP.ClickOnAuthDropDown.click();
			Thread.sleep(2000);
			CEPP.SelectTokenAuth.click();
			Thread.sleep(2000);
			// CEPP.ServerTokenUrl.sendKeys("https://20.55.8.64:7080//pcm/workflow/export");
			CEPP.ServerTokenKey.sendKeys("token");
			Thread.sleep(2000);
			CEPP.ServerUserName.sendKeys("cm_user");
			Thread.sleep(2000);
			CEPP.Serverpassword.sendKeys("password");
			Thread.sleep(2000);
			CEPP.ServerHeader.sendKeys("Authorization");
			Thread.sleep(2000);
			CEPP.ServerPrefix.sendKeys("Bearer");
			Thread.sleep(2000);
			CEPP.ClickOnCreateButton.click();
			Thread.sleep(2000);
			String title = CEPP.ServerTokenURLErrorMsg.getText();
			System.out.println(title);
			if (title.equals("Token URL is required.")) {
				child23.log(LogStatus.PASS, "Validation successful because we are getting message as " + title
						+ " when we verifying create api with server auth as token auth and token url as mandatory fields");
			} else {
				child23.log(LogStatus.FAIL, "Validation Unsuccessful because we are getting message as " + title
						+ "instead of  when we verifying create api with server auth as token auth and token url as mandatory fields");
			}

		} catch (Exception e) {
			child23.log(LogStatus.FAIL, e.fillInStackTrace());
		}
		_extent_report.endTest(child23);

	}

	@Test(priority = 25, enabled = true, description = "Verifying create api with server auth as token auth and token key as mandatory fields")
	public void verifyingCreateApiwithServerauthasTokenauthandTokenkeyasMandatoryFields() throws Throwable {
		child24 = _extent_report
				.startTest("Verifying create api with server auth as token auth and token key as mandatory fields");
		child24.assignCategory("Create API Endpoint");
		try {
			Thread.sleep(4000);
			CEPP.MangeEndPointClick.click();
			Thread.sleep(2000);
			CEPP.CreateEndPointClick.click();
			Thread.sleep(2000);
			CEPP.EnterAPIName.sendKeys("Testapi" + api++);
			Thread.sleep(2000);
			CEPP.ClickOnDropdow.click();
			Thread.sleep(2000);
			CEPP.ClickOCreateAPIFromDropDown.click();
			Thread.sleep(2000);

			CEPP.ClickOnProxyWebMethod.click();
			Thread.sleep(2000);
			CEPP.ClickOnGetMethod.click();

			Thread.sleep(2000);
			CEPP.EnterServerURL.sendKeys(serverurl + "/pcm/workflow");
			Thread.sleep(2000);
			CEPP.ClickOnServerAuthorization.click();
			Thread.sleep(2000);
			CEPP.ClickOnAuthDropDown.click();
			Thread.sleep(2000);
			CEPP.SelectTokenAuth.click();
			Thread.sleep(2000);
			CEPP.ServerTokenUrl.sendKeys("https://20.55.8.64:7080//pcm/workflow/export");
			Thread.sleep(2000);
			// CEPP.ServerTokenKey.sendKeys("https://20.55.8.64:7080//pcm/generate-token");
			CEPP.ServerUserName.sendKeys("cm_user");
			Thread.sleep(2000);
			CEPP.Serverpassword.sendKeys("password");
			Thread.sleep(2000);
			CEPP.ServerHeader.sendKeys("Authorization");
			Thread.sleep(2000);
			CEPP.ServerPrefix.sendKeys("Bearer");
			Thread.sleep(2000);
			CEPP.ClickOnCreateButton.click();
			Thread.sleep(2000);
			String title = CEPP.ServerTokenKeyErrorMsg.getText();
			System.out.println(title);
			if (title.equals("Token Key is required.")) {
				child24.log(LogStatus.PASS, "Validation successful because we are getting message as " + title
						+ " when we verifying create api with server auth as token auth and token key as mandatory fields");
			} else {
				child24.log(LogStatus.FAIL, "Validation Unsuccessful because we are getting message as " + title
						+ "instead of  when we verifying create api with server auth as token auth and token key as mandatory fields");
			}

		} catch (Exception e) {
			child24.log(LogStatus.FAIL, e.fillInStackTrace());
		}
		_extent_report.endTest(child24);

	}

	@Test(priority = 26, enabled = true, description = "Verifying create api with server auth as token auth and username as mandatory fields")
	public void VerifyingCreateApiwithServerauthasTokenAuthandUsernameasMandatoryFields() throws Throwable {
		child25 = _extent_report
				.startTest("Verifying create api with server auth as token auth and username as mandatory fields");
		child25.assignCategory("Create API Endpoint");
		try {
			Thread.sleep(4000);
			CEPP.MangeEndPointClick.click();
			Thread.sleep(2000);
			CEPP.CreateEndPointClick.click();
			Thread.sleep(2000);
			CEPP.EnterAPIName.sendKeys("Testapi" + api++);
			Thread.sleep(2000);
			CEPP.ClickOnDropdow.click();
			Thread.sleep(2000);
			CEPP.ClickOCreateAPIFromDropDown.click();
			Thread.sleep(2000);

			CEPP.ClickOnProxyWebMethod.click();
			Thread.sleep(2000);
			CEPP.ClickOnGetMethod.click();

			Thread.sleep(2000);
			CEPP.EnterServerURL.sendKeys(serverurl + "/pcm/workflow");
			Thread.sleep(2000);
			CEPP.ClickOnServerAuthorization.click();
			Thread.sleep(2000);
			CEPP.ClickOnAuthDropDown.click();
			Thread.sleep(2000);
			CEPP.SelectTokenAuth.click();
			Thread.sleep(2000);
			CEPP.ServerTokenUrl.sendKeys("https://20.55.8.64:7080//pcm/workflow/export");
			Thread.sleep(2000);
			CEPP.ServerTokenKey.sendKeys("https://20.55.8.64:7080//pcm/generate-token");
			Thread.sleep(2000);
			// CEPP.ServerUserName.sendKeys("cm_user");
			CEPP.Serverpassword.sendKeys("password");
			Thread.sleep(2000);
			CEPP.ServerHeader.sendKeys("Authorization");
			Thread.sleep(2000);
			CEPP.ServerPrefix.sendKeys("Bearer");
			Thread.sleep(2000);
			CEPP.ClickOnCreateButton.click();
			Thread.sleep(2000);
			String title = CEPP.ServerUserNameErrorMsg.getText();
			System.out.println(title);
			if (title.equals("User Name is required.")) {
				child25.log(LogStatus.PASS, "Validation successful because we are getting message as " + title
						+ " when we verifying create api with server auth as token auth and username as mandatory fields");
			} else {
				child25.log(LogStatus.FAIL, "Validation Unsuccessful because we are getting message as" + title
						+ "instead of  when we verifying create api with server auth as token auth and username as mandatory fields");
			}

		} catch (Exception e) {
			child25.log(LogStatus.FAIL, e.fillInStackTrace());
		}
		_extent_report.endTest(child25);

	}

	@Test(priority = 27, enabled = true, description = "Verifying create api with server auth as token auth and password as mandatory fields")
	public void verifyingCreateApiwithServerauthasTokenauthandPasswordasMandatoryFields() throws Throwable {
		child26 = _extent_report
				.startTest("Verifying create api with server auth as token auth and password as mandatory fields");
		child26.assignCategory("Create API Endpoint");
		try {
			Thread.sleep(4000);
			CEPP.MangeEndPointClick.click();
			Thread.sleep(2000);
			CEPP.CreateEndPointClick.click();
			Thread.sleep(2000);
			CEPP.EnterAPIName.sendKeys("Testapi" + api++);
			Thread.sleep(2000);
			CEPP.ClickOnDropdow.click();
			Thread.sleep(2000);
			CEPP.ClickOCreateAPIFromDropDown.click();
			Thread.sleep(2000);

			CEPP.ClickOnProxyWebMethod.click();
			Thread.sleep(2000);
			CEPP.ClickOnGetMethod.click();
			Thread.sleep(2000);
			CEPP.EnterProxyURL.sendKeys("https://23.22.96.149:8090/restapi/+'title2'");
			Thread.sleep(2000);
			CEPP.EnterServerURL.sendKeys("https://20.55.8.64:7080//pcm/workflow");
			Thread.sleep(2000);
			CEPP.ClickOnServerAuthorization.click();
			Thread.sleep(2000);
			CEPP.ClickOnAuthDropDown.click();
			Thread.sleep(2000);
			CEPP.SelectTokenAuth.click();
			Thread.sleep(2000);
			CEPP.ServerTokenUrl.sendKeys("https://20.55.8.64:7080//pcm/workflow/export");
			Thread.sleep(2000);
			CEPP.ServerTokenKey.sendKeys("token");
			Thread.sleep(2000);
			CEPP.ServerUserName.sendKeys("cm_user");
			Thread.sleep(2000);
			// CEPP.Serverpassword.sendKeys("password");
			CEPP.ServerHeader.sendKeys("Authorization");
			Thread.sleep(2000);
			CEPP.ServerPrefix.sendKeys("Bearer");

			Thread.sleep(2000);
			// CEPP.ClickOnHeaders.click();
			CEPP.ClickOnCreateButton.click();
			Thread.sleep(2000);
			String title = CEPP.ServerPasswordErrorMsg.getText();
			System.out.println(title);
			if (title.equals("Password is required.")) {
				child26.log(LogStatus.PASS, "Validation successful because we are getting message as " + title
						+ "when we verifying create api with server auth as token auth and password as mandatory fields");
			} else {
				child26.log(LogStatus.FAIL, "Validation Unsuccessful because we are getting message as " + title
						+ "instead of  when we verifying create api with server auth as token auth and password as mandatory fields");
			}

		} catch (Exception e) {
			child26.log(LogStatus.FAIL, e.fillInStackTrace());
		}
		_extent_report.endTest(child26);

	}

	@Test(priority = 28, enabled = true, description = "Verifying create api with server auth as token auth and token header as mandatory fields")
	public void VerifyingCreateApiwithServerauthasTokenauthandTokenHeaderasMandatoryFields() throws Throwable {
		child27 = _extent_report
				.startTest("Verifying create api with server auth as token auth and token header as mandatory fields");
		child27.assignCategory("Create API Endpoint");
		try {
			Thread.sleep(4000);
			CEPP.MangeEndPointClick.click();
			Thread.sleep(2000);
			CEPP.CreateEndPointClick.click();
			Thread.sleep(2000);
			CEPP.EnterAPIName.sendKeys("Testapi" + api++);
			Thread.sleep(2000);
			CEPP.ClickOnDropdow.click();
			Thread.sleep(2000);
			CEPP.ClickOCreateAPIFromDropDown.click();
			Thread.sleep(2000);

			CEPP.ClickOnProxyWebMethod.click();
			Thread.sleep(2000);
			CEPP.ClickOnGetMethod.click();

			Thread.sleep(2000);
			CEPP.EnterServerURL.sendKeys(serverurl + "/pcm/workflow");
			Thread.sleep(2000);
			CEPP.ClickOnServerAuthorization.click();
			Thread.sleep(2000);
			CEPP.ClickOnAuthDropDown.click();
			Thread.sleep(2000);
			CEPP.SelectTokenAuth.click();
			Thread.sleep(2000);
			CEPP.ServerTokenUrl.sendKeys("https://20.55.8.64:7080//pcm/workflow/export");
			Thread.sleep(2000);
			CEPP.ServerTokenKey.sendKeys("token");
			Thread.sleep(2000);
			CEPP.ServerUserName.sendKeys("cm_user");
			Thread.sleep(2000);
			CEPP.Serverpassword.sendKeys("password");
			Thread.sleep(2000);
			// CEPP.ServerHeader.sendKeys("Authorization");
			CEPP.ServerPrefix.sendKeys("Bearer");

			Thread.sleep(2000);
			// CEPP.ClickOnHeaders.click();
			CEPP.ClickOnCreateButton.click();
			Thread.sleep(2000);
			String title = CEPP.ServerHeaderErrorMsg.getText();
			Thread.sleep(2000);
			System.out.println(title);
			if (title.equals("Token Header is required.")) {
				child27.log(LogStatus.PASS, "Validation successful because we are getting message as " + title
						+ " when we verifying create api with server auth as token auth and token header as mandatory fields");
			} else {
				child27.log(LogStatus.FAIL, "Validation Unsuccessful because we are getting message as " + title
						+ "instead of  when we verifying create api with server auth as token auth and token header as mandatory fields");
			}

		} catch (Exception e) {
			child27.log(LogStatus.FAIL, e.fillInStackTrace());
		}
		_extent_report.endTest(child27);

	}

	@Test(priority = 29, enabled = true, description = "Verifying create api with server auth as O Auth1.0")
	public void VerifyingCreateApiwithServerauthasOAuth() throws Throwable {
		child28 = _extent_report.startTest("verifying create api with server auth as O Auth1.0");
		child28.assignCategory("Create API Endpoint");
		try {
			Thread.sleep(4000);
			CEPP.MangeEndPointClick.click();
			Thread.sleep(2000);
			CEPP.CreateEndPointClick.click();
			Thread.sleep(2000);
			CEPP.EnterAPIName.sendKeys("testingsetup9");
			Thread.sleep(2000);
			CEPP.ClickOnDropdow.click();
			Thread.sleep(2000);
			CEPP.ClickOCreateAPIFromDropDown.click();
			Thread.sleep(2000);

			CEPP.ClickOnProxyWebMethod.click();
			Thread.sleep(2000);
			CEPP.ClickOnGetMethod.click();

			Thread.sleep(2000);
			CEPP.EnterServerURL.sendKeys(serverurl + "/pcm/workflow");
			Thread.sleep(2000);

			CEPP.ClickOnServerAuthorization.click();
			Thread.sleep(2000);
			CEPP.ClickOnAuthDropDown.click();
			Thread.sleep(2000);
			CEPP.SelectOAuth1.click();
			Thread.sleep(2000);
			CEPP.ClickOnCreateButton.click();

			String title = CEPP.SuccessMsgPop.getText();
			System.out.println(title);
			if (title.equals("Proxy endpoint created successfully")) {
				child28.log(LogStatus.PASS, "Validation successful because we are getting message as " + title
						+ "when we Verifying create api with server auth as O Auth1.0'");
			} else {
				child28.log(LogStatus.FAIL, "Validation Unsuccessful because we are getting message as " + title
						+ "instead of  when we Verifying create api with server auth as O Auth1.0'");
			}

		} catch (Exception e) {
			child28.log(LogStatus.FAIL, e.fillInStackTrace());
		}
		_extent_report.endTest(child28);

	}

	@Test(priority = 30, enabled = true, description = "Verifying create api with server auth as O Auth2.0")
	public void VerifyingCreateApwithServerauthasOAuth() throws Throwable {
		child29 = _extent_report.startTest("verifying create api with server auth as O Auth2.0");
		child29.assignCategory("Create API Endpoint");
		try {
			Thread.sleep(4000);
			CEPP.MangeEndPointClick.click();
			Thread.sleep(2000);
			CEPP.CreateEndPointClick.click();
			Thread.sleep(2000);
			CEPP.EnterAPIName.sendKeys("testingsetup10");
			Thread.sleep(2000);
			CEPP.ClickOnDropdow.click();
			Thread.sleep(2000);
			CEPP.ClickOCreateAPIFromDropDown.click();
			Thread.sleep(2000);

			CEPP.ClickOnProxyWebMethod.click();
			Thread.sleep(2000);
			CEPP.ClickOnGetMethod.click();
			Thread.sleep(2000);

	
			CEPP.EnterServerURL.sendKeys(serverurl + "/pcm/workflow");
			Thread.sleep(2000);
			CEPP.ClickOnServerAuthorization.click();
			Thread.sleep(2000);
			CEPP.ClickOnAuthDropDown.click();
			Thread.sleep(2000);
			CEPP.SelectOAuth2.click();
			Thread.sleep(2000);
			CEPP.ClickOnCreateButton.click();

			String title = CEPP.SuccessMsgPop.getText();
			System.out.println(title);
			if (title.equals("Proxy endpoint created successfully")) {
				child29.log(LogStatus.PASS, "Validation successful because we are getting message as ''" + title
						+ "'' when we Verifying create api with server auth as O Auth2.0'");
			} else {
				child29.log(LogStatus.FAIL, "Validation Unsuccessful because we are getting message as ''" + title
						+ "''instead of '' when we Verifying create api with server auth as O Auth2.0'");
			}

		} catch (Exception e) {
			child29.log(LogStatus.FAIL, e.fillInStackTrace());
		}
		_extent_report.endTest(child29);

	}

	@Test(priority = 31, enabled = true, description = "Verifying create api with params with valid data")
	public void VerifyingCreateApiwithParamswithValidData() throws Throwable {
		child30 = _extent_report.startTest("Verifying create api with params with valid data");
		child30.assignCategory("Create API Endpoint");
		try {
			Thread.sleep(3000);
			CEPP.MangeEndPointClick.click();
			Thread.sleep(2000);
			CEPP.CreateEndPointClick.click();
			Thread.sleep(2000);
			CEPP.EnterAPIName.sendKeys("testingsetup11");
			Thread.sleep(2000);
			CEPP.ClickOnDropdow.click();
			Thread.sleep(2000);
			CEPP.ClickOCreateAPIFromDropDown.click();
			Thread.sleep(2000);

			CEPP.ClickOnProxyWebMethod.click();
			Thread.sleep(2000);
			CEPP.ClickOnGetMethod.click();

			Thread.sleep(2000);
			CEPP.EnterServerURL.sendKeys(serverurl + "/pcm/workflow");
			Thread.sleep(2000);
			CEPP.ClickOnParams.click();
			Thread.sleep(2000);
			CEPP.ParamsKey.sendKeys("dd");
			Thread.sleep(2000);
			CEPP.ParamsValue.sendKeys("sss");
			Thread.sleep(2000);
			CEPP.ParamsDescription.sendKeys("ddd");
			Thread.sleep(2000);
			CEPP.ParamsRequiredCheckBox.click();
			Thread.sleep(2000);
			CEPP.ParamsDynamicCheckBox.click();
			Thread.sleep(2000);
			CEPP.ClickOnCreateButton.click();

			String title = CEPP.SuccessMsgPop.getText();
			System.out.println(title);
			if (title.equals("Proxy endpoint created successfully")) {
				child30.log(LogStatus.PASS, "Validation successful because we are getting message as ''" + title
						+ "'' when we Verifying create api with params with valid data'");
			} else {
				child30.log(LogStatus.FAIL, "Validation Unsuccessful because we are getting message as ''" + title
						+ "''instead of '' when we Verifying create api with params with valid data'");
			}

		} catch (Exception e) {
			child30.log(LogStatus.FAIL, e.fillInStackTrace());
		}
		_extent_report.endTest(child30);

	}

	@Test(priority = 32, enabled = true, description = "Verifying create api with params and clicking Add")
	public void VerifyingCreateApiwithParamswithValidDatawithAddButton() throws Throwable {
		child31 = _extent_report.startTest("Verifying create api with params and clicking Add");
		child31.assignCategory("Create API Endpoint");
		try {
			Thread.sleep(3000);
			CEPP.MangeEndPointClick.click();
			Thread.sleep(2000);
			CEPP.CreateEndPointClick.click();
			Thread.sleep(2000);
			CEPP.EnterAPIName.sendKeys("testingsetup12");
			Thread.sleep(2000);
			CEPP.ClickOnDropdow.click();
			Thread.sleep(2000);
			CEPP.ClickOCreateAPIFromDropDown.click();
			Thread.sleep(2000);

			CEPP.ClickOnProxyWebMethod.click();
			Thread.sleep(2000);
			CEPP.ClickOnGetMethod.click();
			Thread.sleep(2000);

			CEPP.EnterServerURL.sendKeys(serverurl + "/pcm/workflow");
			Thread.sleep(2000);
			CEPP.ClickOnParams.click();
			Thread.sleep(2000);
			CEPP.ParamsKey.sendKeys("eee");
			Thread.sleep(2000);
			CEPP.ParamsValue.sendKeys("dde");
			Thread.sleep(2000);
			CEPP.ParamsDescription.sendKeys("ddd");

			CEPP.ParamsRequiredCheckBox.click();

			CEPP.ParamsDynamicCheckBox.click();
			Thread.sleep(2000);
			CEPP.ParamsAddButton.click();
			Thread.sleep(2000);
			CEPP.ClickOnCreateButton.click();

			String title = CEPP.SuccessMsgPop.getText();
			System.out.println(title);
			if (title.equals("Proxy endpoint created successfully")) {
				child31.log(LogStatus.PASS, "Validation successful because we are getting message as ''" + title
						+ "'' when we Verifying create api with params and clicking Add'");
			} else {
				child31.log(LogStatus.FAIL, "Validation Unsuccessful because we are getting message as ''" + title
						+ "''instead of '' when we Verifying create api with params and clicking Add'");
			}

		} catch (Exception e) {
			child31.log(LogStatus.FAIL, e.fillInStackTrace());
		}
		_extent_report.endTest(child31);

	}

	@Test(priority = 33, enabled = true, description = "Verifying create api with Headers with valid data")
	public void VerifyingCreateApiwithHeaderswithValidData() throws Throwable {
		child32 = _extent_report.startTest("Verifying create api with Headers with valid data");
		child32.assignCategory("Create API Endpoint");
		try {
			Thread.sleep(3000);
			CEPP.MangeEndPointClick.click();
			Thread.sleep(2000);
			CEPP.CreateEndPointClick.click();
			Thread.sleep(2000);
			CEPP.EnterAPIName.sendKeys("testingsetup13");
			Thread.sleep(2000);
			CEPP.ClickOnDropdow.click();
			Thread.sleep(2000);
			CEPP.ClickOCreateAPIFromDropDown.click();
			Thread.sleep(2000);

			CEPP.ClickOnProxyWebMethod.click();
			Thread.sleep(2000);
			CEPP.ClickOnGetMethod.click();
			Thread.sleep(2000);
			CEPP.EnterProxyURL.sendKeys("https://23.22.96.149:8090/restapi/+'title2'");
			Thread.sleep(2000);
			CEPP.EnterServerURL.sendKeys("https://20.55.8.64:7080//pcm/workflow");
			Thread.sleep(2000);
			CEPP.ClickOnHeaders.click();
			Thread.sleep(2000);
			CEPP.ParamsKey.sendKeys("FGH");
			Thread.sleep(2000);
			CEPP.ParamsValue.sendKeys("GG");
			Thread.sleep(2000);
			CEPP.ParamsDescription.sendKeys("GGG");
			Thread.sleep(2000);
			CEPP.HeadersRequiredCheckBox.click();
			Thread.sleep(2000);
			CEPP.HeadersDynamicCheckBox.click();
			Thread.sleep(2000);
			CEPP.ClickOnCreateButton.click();

			String title = CEPP.SuccessMsgPop.getText();
			System.out.println(title);
			if (title.equals("Proxy endpoint created successfully")) {
				child32.log(LogStatus.PASS, "Validation successful because we are getting message as ''" + title
						+ "'' when we verifying create api with Headers with valid data'");
			} else {
				child32.log(LogStatus.FAIL, "Validation Unsuccessful because we are getting message as ''" + title
						+ "''instead of '' when we verifying create api with Headers with valid data'");
			}

		} catch (Exception e) {
			child32.log(LogStatus.FAIL, e.fillInStackTrace());
		}
		_extent_report.endTest(child32);

	}

	@Test(priority = 34, enabled = true, description = "Verifying create api with Headers and clicking Add")
	public void VerifyingCreateApiwithHeaderswithAdd() throws Throwable {
		child33 = _extent_report.startTest("Verifying create api with Headers and clicking Add");
		child33.assignCategory("Create API Endpoint");
		try {
			Thread.sleep(3000);
			CEPP.MangeEndPointClick.click();
			Thread.sleep(2000);
			CEPP.CreateEndPointClick.click();
			Thread.sleep(2000);
			CEPP.EnterAPIName.sendKeys("Testapi" + api++);
			Thread.sleep(2000);
			CEPP.ClickOnDropdow.click();
			Thread.sleep(2000);
			CEPP.ClickOCreateAPIFromDropDown.click();
			Thread.sleep(2000);

			CEPP.ClickOnProxyWebMethod.click();
			Thread.sleep(2000);
			CEPP.ClickOnGetMethod.click();
			Thread.sleep(2000);
			// Thread.sleep(2000);
			CEPP.EnterServerURL.sendKeys(serverurl + "/pcm/workflow");
			Thread.sleep(2000);
			CEPP.ClickOnHeaders.click();
			Thread.sleep(2000);
			CEPP.ParamsKey.sendKeys("FGH");
			Thread.sleep(2000);
			CEPP.ParamsValue.sendKeys("GG");
			Thread.sleep(2000);
			CEPP.ParamsDescription.sendKeys("GGG");
			Thread.sleep(2000);
			CEPP.HeadersRequiredCheckBox.click();
			Thread.sleep(2000);
			CEPP.HeadersDynamicCheckBox.click();
			Thread.sleep(2000);
			CEPP.ClickOnAddButton.click();
			Thread.sleep(2000);
			CEPP.ClickOnCreateButton.click();

			String title = CEPP.SuccessMsgPop.getText();
			System.out.println(title);
			if (title.equals("Proxy endpoint created successfully")) {
				child33.log(LogStatus.PASS, "Validation successful because we are getting message as ''" + title
						+ "'' when we verifying create api with Headers and clicking Add'");
			} else {
				child33.log(LogStatus.FAIL, "Validation Unsuccessful because we are getting message as ''" + title
						+ "''instead of '' when we verifying create api with Headers and clicking Add'");
			}

		} catch (Exception e) {
			child33.log(LogStatus.FAIL, e.fillInStackTrace());
		}
		_extent_report.endTest(child33);

	}

	@Test(priority = 35, enabled = true, description = "Verifying create api with proxy web method as GET and proxy authtype as No Auth")
	public void verifyingCreateApiwithProxywebmethodasGETandproxyauthtypeasNoAuth() throws Throwable {
		child34 = _extent_report
				.startTest("Verifying create api with proxy web method as GET and proxy authtype as No Auth");
		child34.assignCategory("Create API Endpoint");
		try {
			Thread.sleep(3000);
			CEPP.MangeEndPointClick.click();
			Thread.sleep(2000);
			CEPP.CreateEndPointClick.click();
			Thread.sleep(2000);
			CEPP.EnterAPIName.sendKeys("Testapi" + api++);
			Thread.sleep(2000);
			CEPP.ClickOnDropdow.click();
			Thread.sleep(2000);
			CEPP.ClickOCreateAPIFromDropDown.click();
			Thread.sleep(2000);
			CEPP.ClickOnProxyWebMethod.click();
			Thread.sleep(2000);
			CEPP.ClickOnGetMethod.click();
			Thread.sleep(2000);
			CEPP.EnterServerURL.sendKeys(serverurl + "/pcm/workflow");
			Thread.sleep(2000);
			CEPP.ClickOnProxyAuthorization.click();
			Thread.sleep(2000);
			CEPP.ClickOnAuthDropDown.click();
			Thread.sleep(2000);
			CEPP.SelectNoAuth.click();
			Thread.sleep(2000);
			CEPP.ClickOnCreateButton.click();
			Thread.sleep(2000);
			String title = CEPP.SuccessMsgPop.getText();
			System.out.println(title);
			if (title.equals("Proxy endpoint created successfully")) {
				child34.log(LogStatus.PASS, "Validation successful because we are getting message as ''" + title
						+ "'' when we verifying create api with proxy web method as GET and proxy authtype as No Auth'");
			} else {
				child34.log(LogStatus.FAIL, "Validation Unsuccessful because we are getting message as ''" + title
						+ "''instead of '' when we verifying create api with proxy web method as GET and proxy authtype as No Auth'");
			}

		} catch (Exception e) {
			child34.log(LogStatus.FAIL, e.fillInStackTrace());
		}
		_extent_report.endTest(child34);

	}

	@Test(priority = 36, enabled = true, description = "Verifying create api with proxy web method as GET and proxy authtype as Basic auth")
	public void verifyingCreateApiwithProxywebmethodasGETandproxyauthtypeasBasicAuth() throws Throwable {
		child35 = _extent_report
				.startTest("Verifying create api with proxy web method as GET and proxy authtype as Basic auth");
		child35.assignCategory("Create API Endpoint");
		try {
			Thread.sleep(3000);
			CEPP.MangeEndPointClick.click();
			Thread.sleep(2000);
			CEPP.CreateEndPointClick.click();
			Thread.sleep(2000);
			CEPP.EnterAPIName.sendKeys("Testapi" + api++);
			Thread.sleep(2000);
			CEPP.ClickOnDropdow.click();
			Thread.sleep(2000);
			CEPP.ClickOCreateAPIFromDropDown.click();
			Thread.sleep(2000);

			CEPP.ClickOnProxyWebMethod.click();
			Thread.sleep(2000);
			CEPP.ClickOnGetMethod.click();

			CEPP.EnterServerURL.sendKeys(serverurl + "/pcm/workflow");
			CEPP.ClickOnProxyAuthorization.click();
			Thread.sleep(2000);
			CEPP.ClickOnAuthDropDown.click();
			Thread.sleep(2000);
			CEPP.SelectBasicAuth.click();
			Thread.sleep(2000);
			CEPP.ProxyUserName.sendKeys("cm_user");
			Thread.sleep(2000);
			CEPP.ProxyPassword.sendKeys("password");
			Thread.sleep(2000);
			CEPP.ClickOnCreateButton.click();

			String title = CEPP.SuccessMsgPop.getText();
			System.out.println(title);
			if (title.equals("Proxy endpoint created successfully")) {
				child35.log(LogStatus.PASS, "Validation successful because we are getting message as ''" + title
						+ "'' when we verifying create api with proxy web method as GET and proxy authtype as Basic auth'");
			} else {
				child35.log(LogStatus.FAIL, "Validation Unsuccessful because we are getting message as ''" + title
						+ "''instead of '' when we verifying create api with proxy web method as GET and proxy authtype as Basic auth'");
			}

		} catch (Exception e) {
			child35.log(LogStatus.FAIL, e.fillInStackTrace());
		}
		_extent_report.endTest(child35);

	}

	@Test(priority = 37, enabled = true, description = "verifying create api with proxy web method as GET and proxy authtype as token auth")
	public void verifyingCreateApiwithproxywebMethodasGETandproxyAuthtypeasTokenAuth() throws Throwable {
		child36 = _extent_report
				.startTest("verifying create api with proxy web method as GET and proxy authtype as token auth");
		child36.assignCategory("Create API Endpoint");
		try {
			Thread.sleep(3000);
			CEPP.MangeEndPointClick.click();
			Thread.sleep(2000);
			CEPP.CreateEndPointClick.click();
			Thread.sleep(2000);
			CEPP.EnterAPIName.sendKeys("Testapi" + api++);
			Thread.sleep(2000);
			CEPP.ClickOnDropdow.click();
			Thread.sleep(2000);
			CEPP.ClickOCreateAPIFromDropDown.click();
			Thread.sleep(2000);

			CEPP.ClickOnProxyWebMethod.click();
			Thread.sleep(2000);
			CEPP.ClickOnGetMethod.click();

			Thread.sleep(2000);
			CEPP.EnterServerURL.sendKeys(serverurl + "/pcm/workflow");
			Thread.sleep(2000);
			CEPP.ClickOnProxyAuthorization.click();
			Thread.sleep(2000);
			CEPP.ClickOnAuthDropDown.click();
			Thread.sleep(2000);
			CEPP.SelectTokenAuth.click();
			Thread.sleep(2000);
			CEPP.ProxyTokenUrl.sendKeys("https://20.55.8.64:7080//pcm/workflow/export");
			Thread.sleep(2000);
			CEPP.ProxyTokenKey.sendKeys("token");
			Thread.sleep(2000);
			CEPP.ProxyUserName.sendKeys("cm_user");
			Thread.sleep(2000);
			CEPP.ProxyPassword.sendKeys("password");
			Thread.sleep(2000);
			CEPP.ProxyPrefix.sendKeys("Bearer");
			Thread.sleep(2000);
			CEPP.ProxyHeader.sendKeys("Authorization");
			Thread.sleep(2000);
			CEPP.ClickOnCreateButton.click();

			String title = CEPP.SuccessMsgPop.getText();
			System.out.println(title);
			if (title.equals("Proxy endpoint created successfully")) {
				child36.log(LogStatus.PASS, "Validation successful because we are getting message as ''" + title
						+ "'' when we verifying create api with proxy web method as GET and proxy authtype as token auth'");
			} else {
				child36.log(LogStatus.FAIL, "Validation Unsuccessful because we are getting message as ''" + title
						+ "''instead of '' when we verifying create api with proxy web method as GET and proxy authtype as token auth'");
			}

		} catch (Exception e) {
			child36.log(LogStatus.FAIL, e.fillInStackTrace());
		}
		_extent_report.endTest(child36);

	}

	@Test(priority = 38, enabled = true, description = "Verifying create api with proxy web method as GET and proxy authtype as O Auth1.0")
	public void VerifyingCreateApiwithproxyAuthOAuth() throws Throwable {
		child37 = _extent_report
				.startTest("Verifying create api with proxy web method as GET and proxy authtype as O Auth1.0");
		child37.assignCategory("Create API Endpoint");
		try {
			Thread.sleep(3000);
			CEPP.MangeEndPointClick.click();
			Thread.sleep(2000);
			CEPP.CreateEndPointClick.click();
			Thread.sleep(2000);
			Thread.sleep(2000);
			CEPP.EnterAPIName.sendKeys("Testapi" + api++);
			Thread.sleep(2000);
			CEPP.ClickOnDropdow.click();
			Thread.sleep(2000);
			CEPP.ClickOCreateAPIFromDropDown.click();
			Thread.sleep(2000);

			CEPP.ClickOnProxyWebMethod.click();
			Thread.sleep(2000);
			CEPP.ClickOnGetMethod.click();

			Thread.sleep(2000);
			CEPP.EnterServerURL.sendKeys("https://20.55.8.64:7080//pcm/workflow");
			Thread.sleep(2000);
			CEPP.ClickOnProxyAuthorization.click();
			Thread.sleep(2000);
			CEPP.ClickOnAuthDropDown.click();
			Thread.sleep(2000);
			CEPP.SelectOAuth1.click();
			Thread.sleep(2000);
			CEPP.ClickOnCreateButton.click();

			String title = CEPP.SuccessMsgPop.getText();
			System.out.println(title);
			if (title.equals("Proxy endpoint created successfully")) {
				child37.log(LogStatus.PASS, "Validation successful because we are getting message as ''" + title
						+ "'' when we verifying create api with proxy web method as GET and proxy authtype as O Auth1.0'");
			} else {
				child37.log(LogStatus.FAIL, "Validation Unsuccessful because we are getting message as ''" + title
						+ "''instead of '' when we verifying create api with proxy web method as GET and proxy authtype as O Auth1.0'");
			}

		} catch (Exception e) {
			child37.log(LogStatus.FAIL, e.fillInStackTrace());
		}
		_extent_report.endTest(child37);

	}

	@Test(priority = 39, enabled = true, description = "Verifying create api with proxy web method as GET and proxy authtype as O Auth2.0")
	public void VerifyingCreateApiwitproxyAuthOAuth() throws Throwable {
		child38 = _extent_report
				.startTest("Verifying create api with proxy web method as GET and proxy authtype as O Auth2.0");
		child38.assignCategory("Create API Endpoint");
		try {
			Thread.sleep(3000);
			CEPP.MangeEndPointClick.click();
			Thread.sleep(2000);
			CEPP.CreateEndPointClick.click();
			Thread.sleep(2000);
			CEPP.EnterAPIName.sendKeys("Testapi" + api++);
			Thread.sleep(2000);
			CEPP.ClickOnDropdow.click();
			Thread.sleep(2000);
			CEPP.ClickOCreateAPIFromDropDown.click();
			Thread.sleep(2000);

			CEPP.ClickOnProxyWebMethod.click();
			Thread.sleep(2000);
			CEPP.ClickOnGetMethod.click();

			Thread.sleep(2000);
			CEPP.EnterServerURL.sendKeys(serverurl + "/pcm/workflow");
			Thread.sleep(2000);
			CEPP.ClickOnProxyAuthorization.click();
			Thread.sleep(2000);
			CEPP.ClickOnAuthDropDown.click();
			Thread.sleep(2000);
			CEPP.SelectOAuth2.click();
			Thread.sleep(2000);
			CEPP.ClickOnCreateButton.click();

			String title = CEPP.SuccessMsgPop.getText();
			System.out.println(title);
			if (title.equals("Proxy endpoint created successfully")) {
				child38.log(LogStatus.PASS, "Validation successful because we are getting message as ''" + title
						+ "'' when we verifying create api with proxy web method as GET and proxy authtype as O Auth2.0'");
			} else {
				child38.log(LogStatus.FAIL, "Validation Unsuccessful because we are getting message as ''" + title
						+ "''instead of '' when we verifying create api with proxy web method as GET and proxy authtype as O Auth2.0'");
			}

		} catch (Exception e) {
			child38.log(LogStatus.FAIL, e.fillInStackTrace());
		}
		_extent_report.endTest(child38);

	}

	@Test(priority = 40, enabled = true, description = "Verifying create api with proxy web method as POST and proxy authtype as No Auth")
	public void VerifyingCreateApiwithproxyPostAuthOAuth() throws Throwable {
		child39 = _extent_report
				.startTest("Verifying create api with proxy web method as POST and proxy authtype as No Auth");
		child39.assignCategory("Create API Endpoint");
		try {
			Thread.sleep(3000);
			CEPP.MangeEndPointClick.click();
			Thread.sleep(2000);
			CEPP.CreateEndPointClick.click();
			Thread.sleep(2000);
			CEPP.EnterAPIName.sendKeys("Testapi" + api++);
			Thread.sleep(2000);
			CEPP.ClickOnDropdow.click();
			Thread.sleep(2000);
			CEPP.ClickOCreateAPIFromDropDown.click();
			Thread.sleep(2000);

			CEPP.ClickOnProxyWebMethod.click();
			Thread.sleep(2000);
			CEPP.ClickOnPostMethod.click();

			Thread.sleep(2000);
			CEPP.EnterServerURL.sendKeys(serverurl + "/pcm/workflow");
			Thread.sleep(2000);
			CEPP.ClickOnProxyAuthorization.click();
			Thread.sleep(2000);
			CEPP.ClickOnAuthDropDown.click();
			Thread.sleep(2000);
			CEPP.SelectNoAuth.click();
			Thread.sleep(2000);
			CEPP.ClickOnCreateButton.click();

			String title = CEPP.SuccessMsgPop.getText();
			System.out.println(title);
			if (title.equals("Proxy endpoint created successfully")) {
				child39.log(LogStatus.PASS, "Validation successful because we are getting message as ''" + title
						+ "'' when we verifying create api with proxy web method as POST and proxy authtype as No Auth'");
			} else {
				child39.log(LogStatus.FAIL, "Validation Unsuccessful because we are getting message as ''" + title
						+ "''instead of '' when we verifying create api with proxy web method as POST and proxy authtype as No Auth'");
			}

		} catch (Exception e) {
			child39.log(LogStatus.FAIL, e.fillInStackTrace());
		}
		_extent_report.endTest(child39);

	}

	@Test(priority = 41, enabled = true, description = "Verifying create api with proxy web method as POST and proxy authtype as Basic auth")
	public void VerifyingCreateApiwithproxyPostAuthBasicAuth() throws Throwable {
		child40 = _extent_report
				.startTest("Verifying create api with proxy web method as POST and proxy authtype as Basic auth");
		child40.assignCategory("Create API Endpoint");
		try {
			Thread.sleep(3000);
			CEPP.MangeEndPointClick.click();
			Thread.sleep(2000);
			CEPP.CreateEndPointClick.click();
			Thread.sleep(2000);
			CEPP.EnterAPIName.sendKeys("Testapi" + api++);
			Thread.sleep(2000);
			CEPP.ClickOnDropdow.click();
			Thread.sleep(2000);
			CEPP.ClickOCreateAPIFromDropDown.click();
			Thread.sleep(2000);

			CEPP.ClickOnProxyWebMethod.click();
			Thread.sleep(2000);
			CEPP.ClickOnPostMethod.click();

			Thread.sleep(2000);
			CEPP.EnterServerURL.sendKeys(serverurl + "/pcm/workflow");
			Thread.sleep(2000);
			CEPP.ClickOnProxyAuthorization.click();
			Thread.sleep(2000);
			CEPP.ClickOnAuthDropDown.click();
			Thread.sleep(2000);
			CEPP.SelectBasicAuth.click();
			Thread.sleep(2000);
			CEPP.ProxyUserName.sendKeys("cm_user");
			Thread.sleep(2000);
			CEPP.ProxyPassword.sendKeys("password");
			Thread.sleep(2000);
			CEPP.ClickOnCreateButton.click();

			String title = CEPP.SuccessMsgPop.getText();
			System.out.println(title);
			if (title.equals("Proxy endpoint created successfully")) {
				child40.log(LogStatus.PASS, "Validation successful because we are getting message as ''" + title
						+ "'' when we verifying create api with proxy web method as POST and proxy authtype as Basic auth'");
			} else {
				child40.log(LogStatus.FAIL, "Validation Unsuccessful because we are getting message as ''" + title
						+ "''instead of '' when we verifying create api with proxy web method as POST and proxy authtype as Basic auth'");
			}

		} catch (Exception e) {
			child40.log(LogStatus.FAIL, e.fillInStackTrace());
		}
		_extent_report.endTest(child40);

	}

	@Test(priority = 42, enabled = true, description = "verifying create api with proxy web method as POST and proxy authtype as token auth")
	public void verifyingCreateApiwithproxywebMethodasPOSTandproxyAuthtypeasTokenAuth() throws Throwable {
		child41 = _extent_report
				.startTest("verifying create api with proxy web method as POST and proxy authtype as token auth");
		child41.assignCategory("Create API Endpoint");
		try {
			Thread.sleep(3000);
			CEPP.MangeEndPointClick.click();
			Thread.sleep(2000);
			CEPP.CreateEndPointClick.click();
			Thread.sleep(2000);
			CEPP.EnterAPIName.sendKeys("Testapi" + api++);
			Thread.sleep(2000);
			CEPP.ClickOnDropdow.click();
			Thread.sleep(2000);
			CEPP.ClickOCreateAPIFromDropDown.click();
			Thread.sleep(2000);

			CEPP.ClickOnProxyWebMethod.click();
			Thread.sleep(2000);
			CEPP.ClickOnPostMethod.click();

			Thread.sleep(2000);
			CEPP.EnterServerURL.sendKeys(serverurl + "/pcm/workflow");
			Thread.sleep(2000);
			CEPP.ClickOnProxyAuthorization.click();
			Thread.sleep(2000);
			CEPP.ClickOnAuthDropDown.click();
			Thread.sleep(2000);
			CEPP.SelectTokenAuth.click();
			Thread.sleep(2000);
			CEPP.ProxyTokenUrl.sendKeys("https://20.55.8.64:7080//pcm/workflow/export");
			Thread.sleep(2000);
			CEPP.ProxyTokenKey.sendKeys("token");
			Thread.sleep(2000);
			CEPP.ProxyUserName.sendKeys("cm_user");
			Thread.sleep(2000);
			CEPP.ProxyPassword.sendKeys("password");
			Thread.sleep(2000);
			CEPP.ProxyPrefix.sendKeys("Bearer");
			Thread.sleep(2000);
			CEPP.ProxyHeader.sendKeys("Authorization");
			Thread.sleep(2000);
			CEPP.ClickOnCreateButton.click();

			String title = CEPP.SuccessMsgPop.getText();
			System.out.println(title);
			if (title.equals("Proxy endpoint created successfully")) {
				child41.log(LogStatus.PASS, "Validation successful because we are getting message as ''" + title
						+ "'' when we verifying create api with proxy web method as POST and proxy authtype as token auth'");
			} else {
				child41.log(LogStatus.FAIL, "Validation Unsuccessful because we are getting message as ''" + title
						+ "''instead of '' when we verifying create api with proxy web method as POST and proxy authtype as token auth'");
			}

		} catch (Exception e) {
			child41.log(LogStatus.FAIL, e.fillInStackTrace());
		}
		_extent_report.endTest(child41);

	}

	@Test(priority = 43, enabled = true, description = "verifying create api with proxy web method as POST and proxy authtype as O Auth1.0")
	public void VerifyingCreateApiwithproxyPostAuth() throws Throwable {
		child42 = _extent_report
				.startTest("verifying create api with proxy web method as POST and proxy authtype as O Auth1.0");
		child42.assignCategory("Create API Endpoint");
		try {
			Thread.sleep(3000);
			CEPP.MangeEndPointClick.click();
			Thread.sleep(2000);
			CEPP.CreateEndPointClick.click();
			Thread.sleep(2000);
			CEPP.EnterAPIName.sendKeys("Testapi" + api++);
			Thread.sleep(2000);
			CEPP.ClickOnDropdow.click();
			Thread.sleep(2000);
			CEPP.ClickOCreateAPIFromDropDown.click();
			Thread.sleep(2000);

			CEPP.ClickOnProxyWebMethod.click();
			Thread.sleep(2000);
			CEPP.ClickOnPostMethod.click();

			Thread.sleep(2000);
			CEPP.EnterServerURL.sendKeys(serverurl + "/pcm/workflow");
			Thread.sleep(2000);
			CEPP.ClickOnProxyAuthorization.click();
			Thread.sleep(2000);
			CEPP.ClickOnAuthDropDown.click();
			Thread.sleep(2000);
			CEPP.SelectOAuth1.click();
			Thread.sleep(2000);
			CEPP.ClickOnCreateButton.click();

			String title = CEPP.SuccessMsgPop.getText();
			System.out.println(title);
			if (title.equals("Proxy endpoint created successfully")) {
				child42.log(LogStatus.PASS, "Validation successful because we are getting message as ''" + title
						+ "'' when we verifying create api with proxy web method as POST and proxy authtype as O Auth1.0'");
			} else {
				child42.log(LogStatus.FAIL, "Validation Unsuccessful because we are getting message as ''" + title
						+ "''instead of '' when we verifying create api with proxy web method as POST and proxy authtype as O Auth1.0'");
			}

		} catch (Exception e) {
			child42.log(LogStatus.FAIL, e.fillInStackTrace());
		}
		_extent_report.endTest(child42);

	}

	@Test(priority = 44, enabled = true, description = "verifying create api with proxy web method as POST and proxy authtype as O Auth2.0")
	public void VerifyingCreateApiwitproxyPostAuth() throws Throwable {
		child43 = _extent_report
				.startTest("verifying create api with proxy web method as POST and proxy authtype as O Auth2.0");
		child43.assignCategory("Create API Endpoint");
		try {
			Thread.sleep(3000);
			CEPP.MangeEndPointClick.click();
			Thread.sleep(2000);
			CEPP.CreateEndPointClick.click();
			Thread.sleep(2000);
			CEPP.EnterAPIName.sendKeys("Testapi" + api++);
			Thread.sleep(2000);
			CEPP.ClickOnDropdow.click();
			Thread.sleep(2000);
			CEPP.ClickOCreateAPIFromDropDown.click();
			Thread.sleep(2000);

			CEPP.ClickOnProxyWebMethod.click();
			Thread.sleep(2000);
			CEPP.ClickOnPostMethod.click();

			Thread.sleep(2000);
			CEPP.EnterServerURL.sendKeys(serverurl + "/pcm/workflow");
			Thread.sleep(2000);
			CEPP.ClickOnProxyAuthorization.click();
			Thread.sleep(2000);
			CEPP.ClickOnAuthDropDown.click();
			Thread.sleep(2000);
			CEPP.SelectOAuth2.click();
			Thread.sleep(2000);
			CEPP.ClickOnCreateButton.click();

			String title = CEPP.SuccessMsgPop.getText();
			System.out.println(title);
			if (title.equals("Proxy endpoint created successfully")) {
				child43.log(LogStatus.PASS, "Validation successful because we are getting message as ''" + title
						+ "'' when we verifying create api with proxy web method as POST and proxy authtype as O Auth2.0'");
			} else {
				child43.log(LogStatus.FAIL, "Validation Unsuccessful because we are getting message as ''" + title
						+ "''instead of '' when we verifying create api with proxy web method as POST and proxy authtype as O Auth2.0'");
			}

		} catch (Exception e) {
			child43.log(LogStatus.FAIL, e.fillInStackTrace());
		}
		_extent_report.endTest(child43);

	}

	@Test(priority = 45, enabled = true, description = "Verifying create api with proxy web method as PUT and proxy authtype as No Auth")
	public void verifyingCreateApiwithProxywebmethodasPUTandproxyauthtypeasNoAuth() throws Throwable {
		child44 = _extent_report
				.startTest("Verifying create api with proxy web method as PUT and proxy authtype as No Auth");
		child44.assignCategory("Create API Endpoint");
		try {
			Thread.sleep(3000);
			CEPP.MangeEndPointClick.click();
			Thread.sleep(2000);
			CEPP.CreateEndPointClick.click();
			Thread.sleep(2000);
			CEPP.EnterAPIName.sendKeys("Testapi" + api++);
			Thread.sleep(2000);
			CEPP.ClickOnDropdow.click();
			Thread.sleep(2000);
			CEPP.ClickOCreateAPIFromDropDown.click();
			Thread.sleep(2000);

			CEPP.ClickOnProxyWebMethod.click();
			Thread.sleep(2000);
			CEPP.ClickOnPutMethod.click();

			Thread.sleep(2000);
			CEPP.EnterServerURL.sendKeys(serverurl + "/pcm/workflow");
			Thread.sleep(2000);
			CEPP.ClickOnProxyAuthorization.click();
			Thread.sleep(2000);
			CEPP.ClickOnAuthDropDown.click();
			CEPP.SelectNoAuth.click();
			Thread.sleep(2000);
			CEPP.ClickOnCreateButton.click();

			String title = CEPP.SuccessMsgPop.getText();
			System.out.println(title);
			if (title.equals("Proxy endpoint created successfully")) {
				child44.log(LogStatus.PASS, "Validation successful because we are getting message as ''" + title
						+ "'' when we verifying create api with proxy web method as PUT and proxy authtype as No Auth'");
			} else {
				child44.log(LogStatus.FAIL, "Validation Unsuccessful because we are getting message as ''" + title
						+ "''instead of '' when we verifying create api with proxy web method as PUT and proxy authtype as No Auth'");
			}

		} catch (Exception e) {
			child44.log(LogStatus.FAIL, e.fillInStackTrace());
		}
		_extent_report.endTest(child44);

	}

	@Test(priority = 46, enabled = true, description = "Verifying create api with proxy web method as PUT and proxy authtype as Basic auth")
	public void verifyingCeateApiwithProxywebMethodasPUTandproxyAuthtypeasBasicAuth() throws Throwable {
		child45 = _extent_report
				.startTest("Verifying create api with proxy web method as PUT and proxy authtype as Basic auth");
		child45.assignCategory("Create API Endpoint");
		try {
			Thread.sleep(3000);
			CEPP.MangeEndPointClick.click();
			Thread.sleep(2000);
			CEPP.CreateEndPointClick.click();
			Thread.sleep(2000);
			CEPP.EnterAPIName.sendKeys("Testapi" + api++);
			Thread.sleep(2000);
			CEPP.ClickOnDropdow.click();
			Thread.sleep(2000);
			CEPP.ClickOCreateAPIFromDropDown.click();
			Thread.sleep(2000);

			CEPP.ClickOnProxyWebMethod.click();
			Thread.sleep(2000);
			CEPP.ClickOnPutMethod.click();

			Thread.sleep(2000);
			CEPP.EnterServerURL.sendKeys(serverurl + "/pcm/workflow");
			Thread.sleep(2000);
			CEPP.ClickOnProxyAuthorization.click();
			Thread.sleep(2000);
			CEPP.ClickOnAuthDropDown.click();
			Thread.sleep(2000);
			CEPP.SelectBasicAuth.click();
			Thread.sleep(2000);
			CEPP.ProxyUserName.sendKeys("cm_user");
			Thread.sleep(2000);
			CEPP.ProxyPassword.sendKeys("password");
			Thread.sleep(2000);
			CEPP.ClickOnCreateButton.click();

			String title = CEPP.SuccessMsgPop.getText();
			System.out.println(title);
			if (title.equals("Proxy endpoint created successfully")) {
				child45.log(LogStatus.PASS, "Validation successful because we are getting message as ''" + title
						+ "'' when we Verifying create api with proxy web method as PUT and proxy authtype as Basic auth'");
			} else {
				child45.log(LogStatus.FAIL, "Validation Unsuccessful because we are getting message as ''" + title
						+ "''instead of '' when we Verifying create api with proxy web method as PUT and proxy authtype as Basic auth'");
			}

		} catch (Exception e) {
			child45.log(LogStatus.FAIL, e.fillInStackTrace());
		}
		_extent_report.endTest(child45);

	}

	@Test(priority = 47, enabled = true, description = "verifying create api with proxy web method as PUT and proxy authtype as token auth")
	public void verifyingCreateApiwithproxywebMethodasPUTandproxyAuthtypeasTokenAuth() throws Throwable {
		child46 = _extent_report
				.startTest("verifying create api with proxy web method as PUT and proxy authtype as token auth");
		child46.assignCategory("Create API Endpoint");
		try {
			Thread.sleep(3000);
			CEPP.MangeEndPointClick.click();
			Thread.sleep(2000);
			CEPP.CreateEndPointClick.click();
			Thread.sleep(2000);
			CEPP.EnterAPIName.sendKeys("Testapi" + api++);
			Thread.sleep(2000);
			CEPP.ClickOnDropdow.click();
			Thread.sleep(2000);
			CEPP.ClickOCreateAPIFromDropDown.click();
			Thread.sleep(2000);

			CEPP.ClickOnProxyWebMethod.click();
			Thread.sleep(2000);
			CEPP.ClickOnPutMethod.click();

			Thread.sleep(2000);
			CEPP.EnterServerURL.sendKeys(serverurl + "/pcm/workflow");
			Thread.sleep(2000);
			CEPP.ClickOnProxyAuthorization.click();
			Thread.sleep(2000);
			CEPP.ClickOnAuthDropDown.click();
			Thread.sleep(2000);
			CEPP.SelectTokenAuth.click();
			Thread.sleep(2000);
			CEPP.ProxyTokenUrl.sendKeys("https://20.55.8.64:7080//pcm/workflow/export");
			Thread.sleep(2000);
			CEPP.ProxyTokenKey.sendKeys("token");
			Thread.sleep(2000);
			CEPP.ProxyUserName.sendKeys("cm_user");
			Thread.sleep(2000);
			CEPP.ProxyPassword.sendKeys("password");
			Thread.sleep(2000);
			CEPP.ProxyPrefix.sendKeys("Bearer");
			Thread.sleep(2000);
			CEPP.ProxyHeader.sendKeys("Authorization");

			Thread.sleep(2000);
			// CEPP.ClickOnHeaders.click();
			CEPP.ClickOnCreateButton.click();

			String title = CEPP.SuccessMsgPop.getText();
			System.out.println(title);
			if (title.equals("Proxy endpoint created successfully")) {
				child46.log(LogStatus.PASS, "Validation successful because we are getting message as ''" + title
						+ "'' when we verifying create api with proxy web method as PUT and proxy authtype as token auth'");
			} else {
				child46.log(LogStatus.FAIL, "Validation Unsuccessful because we are getting message as ''" + title
						+ "''instead of '' when we verifying create api with proxy web method as PUT and proxy authtype as token auth'");
			}

		} catch (Exception e) {
			child46.log(LogStatus.FAIL, e.fillInStackTrace());
		}
		_extent_report.endTest(child46);

	}

	@Test(priority = 48, enabled = true, description = "verifying create api with proxy web method as PUT and proxy authtype as O Auth1.0")
	public void VerifyingCreateApiwithproxyPutAuth() throws Throwable {
		child47 = _extent_report
				.startTest("verifying create api with proxy web method as PUT and proxy authtype as O Auth1.0");
		child47.assignCategory("Create API Endpoint");
		try {
			Thread.sleep(3000);
			CEPP.MangeEndPointClick.click();
			Thread.sleep(2000);
			CEPP.CreateEndPointClick.click();
			Thread.sleep(2000);
			CEPP.EnterAPIName.sendKeys("Testapi" + api++);
			Thread.sleep(2000);
			CEPP.ClickOnDropdow.click();
			Thread.sleep(2000);
			CEPP.ClickOCreateAPIFromDropDown.click();
			Thread.sleep(2000);

			CEPP.ClickOnProxyWebMethod.click();
			Thread.sleep(2000);
			CEPP.ClickOnPutMethod.click();
			Thread.sleep(2000);
			CEPP.EnterServerURL.sendKeys(serverurl + "/pcm/workflow");

			Thread.sleep(2000);
			CEPP.ClickOnProxyAuthorization.click();
			Thread.sleep(2000);
			CEPP.ClickOnAuthDropDown.click();
			Thread.sleep(2000);
			CEPP.SelectOAuth1.click();
			Thread.sleep(2000);
			CEPP.ClickOnCreateButton.click();

			String title = CEPP.SuccessMsgPop.getText();
			System.out.println(title);
			if (title.equals("Proxy endpoint created successfully")) {
				child47.log(LogStatus.PASS, "Validation successful because we are getting message as ''" + title
						+ "'' when we verifying create api with proxy web method as POST and proxy authtype as O Auth1.0'");
			} else {
				child47.log(LogStatus.FAIL, "Validation Unsuccessful because we are getting message as ''" + title
						+ "''instead of '' when we verifying create api with proxy web method as POST and proxy authtype as O Auth1.0'");
			}

		} catch (Exception e) {
			child47.log(LogStatus.FAIL, e.fillInStackTrace());
		}
		_extent_report.endTest(child47);

	}

	@Test(priority = 49, enabled = true, description = "verifying create api with proxy web method as POST and proxy authtype as O Auth2.0")
	public void VerifyingCreateApiwitproxyPutAuth() throws Throwable {
		child48 = _extent_report
				.startTest("verifying create api with proxy web method as POST and proxy authtype as O Auth2.0");
		child48.assignCategory("Create API Endpoint");
		try {
			Thread.sleep(3000);
			CEPP.MangeEndPointClick.click();
			Thread.sleep(2000);
			CEPP.CreateEndPointClick.click();
			Thread.sleep(2000);
			CEPP.EnterAPIName.sendKeys("Testapi" + api++);
			Thread.sleep(2000);
			CEPP.ClickOnDropdow.click();
			Thread.sleep(2000);
			CEPP.ClickOCreateAPIFromDropDown.click();
			Thread.sleep(2000);

			CEPP.ClickOnProxyWebMethod.click();
			Thread.sleep(2000);
			CEPP.ClickOnPutMethod.click();

			Thread.sleep(2000);
			CEPP.EnterServerURL.sendKeys(serverurl + "/pcm/workflow");
			Thread.sleep(2000);
			CEPP.ClickOnProxyAuthorization.click();
			Thread.sleep(2000);
			CEPP.ClickOnAuthDropDown.click();
			Thread.sleep(2000);
			CEPP.SelectOAuth2.click();
			Thread.sleep(2000);
			CEPP.ClickOnCreateButton.click();

			String title = CEPP.SuccessMsgPop.getText();
			System.out.println(title);
			if (title.equals("Proxy endpoint created successfully")) {
				child48.log(LogStatus.PASS, "Validation successful because we are getting message as ''" + title
						+ "'' when we verifying create api with proxy web method as PUT and proxy authtype as O Auth2.0'");
			} else {
				child48.log(LogStatus.FAIL, "Validation Unsuccessful because we are getting message as ''" + title
						+ "''instead of '' when we verifying create api with proxy web method as PUT and proxy authtype as O Auth2.0'");
			}

		} catch (Exception e) {
			child48.log(LogStatus.FAIL, e.fillInStackTrace());
		}
		_extent_report.endTest(child48);

	}

	@Test(priority = 50, enabled = true, description = "Verifying create api with proxy web method as DELETE and proxy authtype as No Auth")
	public void verifyingCreateApiwithProxywebmethodasDeleteandproxyauthtypeasNoAuth() throws Throwable {
		child49 = _extent_report
				.startTest("Verifying create api with proxy web method as DELETE and proxy authtype as No Auth");
		child49.assignCategory("Create API Endpoint");
		try {
			Thread.sleep(3000);
			CEPP.MangeEndPointClick.click();
			Thread.sleep(2000);
			CEPP.CreateEndPointClick.click();
			Thread.sleep(2000);
			CEPP.EnterAPIName.sendKeys("Testapi" + api++);
			Thread.sleep(2000);
			CEPP.ClickOnDropdow.click();
			Thread.sleep(2000);
			CEPP.ClickOCreateAPIFromDropDown.click();
			Thread.sleep(2000);

			CEPP.ClickOnProxyWebMethod.click();
			Thread.sleep(2000);
			CEPP.ClickOnDeleteMethod.click();

			Thread.sleep(2000);
			CEPP.EnterServerURL.sendKeys(serverurl + "/pcm/workflow");
			Thread.sleep(2000);
			CEPP.ClickOnProxyAuthorization.click();
			Thread.sleep(2000);
			CEPP.ClickOnAuthDropDown.click();
			Thread.sleep(2000);
			CEPP.SelectNoAuth.click();
			Thread.sleep(2000);
			CEPP.ClickOnCreateButton.click();

			String title = CEPP.SuccessMsgPop.getText();
			System.out.println(title);
			if (title.equals("Proxy endpoint created successfully")) {
				child49.log(LogStatus.PASS, "Validation successful because we are getting message as ''" + title
						+ "'' when we verifying create api with proxy web method as DELETE and proxy authtype as No Auth'");
			} else {
				child49.log(LogStatus.FAIL, "Validation Unsuccessful because we are getting message as ''" + title
						+ "''instead of '' when we verifying create api with proxy web method as DELETE and proxy authtype as No Auth'");
			}

		} catch (Exception e) {
			child49.log(LogStatus.FAIL, e.fillInStackTrace());
		}
		_extent_report.endTest(child49);

	}

	@Test(priority = 51, enabled = true, description = "Verifying create api with proxy web method as DELETE and proxy authtype as Basic auth")
	public void verifyingCreateApiwithProxywebmethodasDeleteandproxyauthtypeasBasicAuth() throws Throwable {
		child50 = _extent_report
				.startTest("Verifying create api with proxy web method as DELETE and proxy authtype as Basic auth");
		child50.assignCategory("Create API Endpoint");
		try {
			Thread.sleep(3000);
			CEPP.MangeEndPointClick.click();
			Thread.sleep(2000);
			CEPP.CreateEndPointClick.click();
			Thread.sleep(2000);
			CEPP.EnterAPIName.sendKeys("Testapi" + api++);
			Thread.sleep(2000);
			CEPP.ClickOnDropdow.click();
			Thread.sleep(2000);
			CEPP.ClickOCreateAPIFromDropDown.click();
			Thread.sleep(2000);

			CEPP.ClickOnProxyWebMethod.click();
			Thread.sleep(2000);
			CEPP.ClickOnDeleteMethod.click();

			Thread.sleep(2000);
			CEPP.EnterServerURL.sendKeys(serverurl + "/pcm/workflow");
			Thread.sleep(2000);
			CEPP.ClickOnProxyAuthorization.click();
			Thread.sleep(2000);
			CEPP.ClickOnAuthDropDown.click();
			Thread.sleep(2000);
			CEPP.SelectBasicAuth.click();
			Thread.sleep(2000);
			CEPP.ProxyUserName.sendKeys("cm_user");
			Thread.sleep(2000);
			CEPP.ProxyPassword.sendKeys("password");
			Thread.sleep(2000);
			CEPP.ClickOnCreateButton.click();

			String title = CEPP.SuccessMsgPop.getText();
			System.out.println(title);
			if (title.equals("Proxy endpoint created successfully")) {
				child50.log(LogStatus.PASS, "Validation successful because we are getting message as ''" + title
						+ "'' when we verifying create api with proxy web method as DELETE and proxy authtype as Basic auth'");
			} else {
				child50.log(LogStatus.FAIL, "Validation Unsuccessful because we are getting message as ''" + title
						+ "''instead of '' when we verifying create api with proxy web method as DELETE and proxy authtype as Basic auth'");
			}

		} catch (Exception e) {
			child50.log(LogStatus.FAIL, e.fillInStackTrace());
		}
		_extent_report.endTest(child50);

	}

	@Test(priority = 52, enabled = true, description = "Verifying create api with proxy web method as DELETE and proxy authtype as token auth")
	public void verifyingCreateApiwithproxywebMethodasDELETEAndproxyAuthtypeasTokenauth() throws Throwable {
		child51 = _extent_report
				.startTest("Verifying create api with proxy web method as DELETE and proxy authtype as token auth");
		child51.assignCategory("Create API Endpoint");
		try {
			Thread.sleep(3000);
			CEPP.MangeEndPointClick.click();
			Thread.sleep(2000);
			CEPP.CreateEndPointClick.click();
			Thread.sleep(2000);
			CEPP.EnterAPIName.sendKeys("Testapi" + api++);
			Thread.sleep(2000);
			CEPP.ClickOnDropdow.click();
			Thread.sleep(2000);
			CEPP.ClickOCreateAPIFromDropDown.click();
			Thread.sleep(2000);

			CEPP.ClickOnProxyWebMethod.click();
			Thread.sleep(2000);
			CEPP.ClickOnDeleteMethod.click();

			Thread.sleep(2000);
			CEPP.EnterServerURL.sendKeys(serverurl + "/pcm/workflow");
			Thread.sleep(2000);
			CEPP.ClickOnProxyAuthorization.click();
			Thread.sleep(2000);
			CEPP.ClickOnAuthDropDown.click();
			Thread.sleep(2000);
			CEPP.SelectTokenAuth.click();
			Thread.sleep(2000);
			CEPP.ProxyTokenUrl.sendKeys("https://20.55.8.64:7080//pcm/workflow/export");
			Thread.sleep(2000);
			CEPP.ProxyTokenKey.sendKeys("token");
			Thread.sleep(2000);
			CEPP.ProxyUserName.sendKeys("cm_user");
			Thread.sleep(2000);
			CEPP.ProxyPassword.sendKeys("password");
			Thread.sleep(2000);
			CEPP.ProxyPrefix.sendKeys("Bearer");
			Thread.sleep(2000);
			CEPP.ProxyHeader.sendKeys("Authorization");
			Thread.sleep(2000);
			CEPP.ClickOnCreateButton.click();

			String title = CEPP.SuccessMsgPop.getText();
			System.out.println(title);
			if (title.equals("Proxy endpoint created successfully")) {
				child51.log(LogStatus.PASS, "Validation successful because we are getting message as ''" + title
						+ "'' when we Verifying create api with proxy web method as DELETE and proxy authtype as token auth'");
			} else {
				child51.log(LogStatus.FAIL, "Validation Unsuccessful because we are getting message as ''" + title
						+ "''instead of '' when we Verifying create api with proxy web method as DELETE and proxy authtype as token auth'");
			}

		} catch (Exception e) {
			child51.log(LogStatus.FAIL, e.fillInStackTrace());
		}
		_extent_report.endTest(child51);

	}

	@Test(priority = 53, enabled = true, description = "verifying create api with proxy web method as PUT and proxy authtype as O Auth1.0")
	public void VerifyingCreateApwithproxyPutAuth() throws Throwable {
		child52 = _extent_report
				.startTest("verifying create api with proxy web method as PUT and proxy authtype as O Auth1.0");
		child52.assignCategory("Create API Endpoint");
		try {
			Thread.sleep(3000);
			CEPP.MangeEndPointClick.click();
			Thread.sleep(2000);
			CEPP.CreateEndPointClick.click();
			Thread.sleep(2000);
			CEPP.EnterAPIName.sendKeys("Testapi" + api++);
			Thread.sleep(2000);
			CEPP.ClickOnDropdow.click();
			Thread.sleep(2000);
			CEPP.ClickOCreateAPIFromDropDown.click();
			Thread.sleep(2000);

			CEPP.ClickOnProxyWebMethod.click();
			Thread.sleep(2000);
			CEPP.ClickOnDeleteMethod.click();

			Thread.sleep(2000);
			CEPP.EnterServerURL.sendKeys(serverurl + "/pcm/workflow");
			Thread.sleep(2000);
			CEPP.ClickOnProxyAuthorization.click();
			Thread.sleep(2000);
			CEPP.ClickOnAuthDropDown.click();
			Thread.sleep(2000);
			CEPP.SelectOAuth1.click();
			Thread.sleep(2000);
			CEPP.ClickOnCreateButton.click();

			String title = CEPP.SuccessMsgPop.getText();
			System.out.println(title);
			if (title.equals("Proxy endpoint created successfully")) {
				child52.log(LogStatus.PASS, "Validation successful because we are getting message as ''" + title
						+ "'' when we verifying create api with proxy web method as POST and proxy authtype as O Auth1.0'");
			} else {
				child52.log(LogStatus.FAIL, "Validation Unsuccessful because we are getting message as ''" + title
						+ "''instead of '' when we verifying create api with proxy web method as POST and proxy authtype as O Auth1.0'");
			}

		} catch (Exception e) {
			child52.log(LogStatus.FAIL, e.fillInStackTrace());
		}
		_extent_report.endTest(child52);

	}

	@Test(priority = 54, enabled = true, description = "verifying create api with proxy web method as POST and proxy authtype as O Auth2.0")
	public void VerifyingCreateAiwitproxyPutAuth() throws Throwable {
		child53 = _extent_report
				.startTest("verifying create api with proxy web method as POST and proxy authtype as O Auth2.0");
		child53.assignCategory("Create API Endpoint");
		try {
			Thread.sleep(3000);
			CEPP.MangeEndPointClick.click();
			Thread.sleep(2000);
			CEPP.CreateEndPointClick.click();
			Thread.sleep(2000);
			CEPP.EnterAPIName.sendKeys("Testapi" + api++);
			Thread.sleep(2000);
			CEPP.ClickOnDropdow.click();
			Thread.sleep(2000);
			CEPP.ClickOCreateAPIFromDropDown.click();
			Thread.sleep(2000);
			CEPP.ClickOnProxyWebMethod.click();
			Thread.sleep(2000);
			CEPP.ClickOnDeleteMethod.click();

			Thread.sleep(2000);
			CEPP.EnterServerURL.sendKeys(serverurl + "/pcm/workflow");
			Thread.sleep(2000);
			CEPP.ClickOnProxyAuthorization.click();
			Thread.sleep(2000);
			CEPP.ClickOnAuthDropDown.click();
			Thread.sleep(2000);
			CEPP.SelectOAuth2.click();
			Thread.sleep(2000);
			CEPP.ClickOnCreateButton.click();

			String title = CEPP.SuccessMsgPop.getText();
			System.out.println(title);
			if (title.equals("Proxy endpoint created successfully")) {
				child53.log(LogStatus.PASS, "Validation successful because we are getting message as ''" + title
						+ "'' when we verifying create api with proxy web method as PUT and proxy authtype as O Auth2.0'");
			} else {
				child53.log(LogStatus.FAIL, "Validation Unsuccessful because we are getting message as ''" + title
						+ "''instead of '' when we verifying create api with proxy web method as PUT and proxy authtype as O Auth2.0'");
			}

		} catch (Exception e) {
			child53.log(LogStatus.FAIL, e.fillInStackTrace());
		}
		_extent_report.endTest(child53);

	}

	@Test(priority = 55, enabled = true, description = "Verifying create api with proxy web method as GET and Server authtype as No Auth")
	public void VerifyingCreateApiwithSeverAuthOAuth() throws Throwable {
		child54 = _extent_report
				.startTest("Verifying create api with proxy web method as GET and Server authtype as No Auth");
		child54.assignCategory("Create API Endpoint");
		try {
			Thread.sleep(3000);
			CEPP.MangeEndPointClick.click();
			Thread.sleep(2000);
			CEPP.CreateEndPointClick.click();
			Thread.sleep(2000);
			CEPP.EnterAPIName.sendKeys("Testapi" + api++);
			Thread.sleep(2000);
			CEPP.ClickOnDropdow.click();
			Thread.sleep(2000);
			CEPP.ClickOCreateAPIFromDropDown.click();
			Thread.sleep(2000);

			CEPP.ClickOnProxyWebMethod.click();
			Thread.sleep(2000);
			CEPP.ClickOnGetMethod.click();

			Thread.sleep(2000);
			CEPP.EnterServerURL.sendKeys(serverurl + "/pcm/workflow");
			Thread.sleep(2000);
			CEPP.ClickOnServerAuthorization.click();
			Thread.sleep(2000);
			CEPP.ClickOnAuthDropDown.click();
			CEPP.SelectNoAuth.click();
			Thread.sleep(2000);
			CEPP.ClickOnCreateButton.click();

			String title = CEPP.SuccessMsgPop.getText();
			System.out.println(title);
			if (title.equals("Proxy endpoint created successfully")) {
				child54.log(LogStatus.PASS, "Validation successful because we are getting message as ''" + title
						+ "'' when we verifying create api with proxy web method as GET and Server authtype as No Auth'");
			} else {
				child54.log(LogStatus.FAIL, "Validation Unsuccessful because we are getting message as ''" + title
						+ "''instead of '' when we verifying create api with proxy web method as GET and Server authtype as No Auth'");
			}

		} catch (Exception e) {
			child54.log(LogStatus.FAIL, e.fillInStackTrace());
		}
		_extent_report.endTest(child54);

	}

	@Test(priority = 56, enabled = true, description = "Verifying create api with proxy web method as GET and server authtype as Basic auth")
	public void verifyingCreateApiwithproxywebmethodasGETandServerauthtypeasBasicauth() throws Throwable {
		child55 = _extent_report
				.startTest("Verifying create api with proxy web method as GET and server authtype as Basic auth");
		child55.assignCategory("Create API Endpoint");
		try {
			Thread.sleep(3000);
			CEPP.MangeEndPointClick.click();
			Thread.sleep(2000);
			CEPP.CreateEndPointClick.click();
			Thread.sleep(2000);
			CEPP.EnterAPIName.sendKeys("Testapi" + api++);
			Thread.sleep(2000);
			CEPP.ClickOnDropdow.click();
			Thread.sleep(2000);
			CEPP.ClickOCreateAPIFromDropDown.click();
			Thread.sleep(2000);

			CEPP.ClickOnProxyWebMethod.click();
			Thread.sleep(2000);
			CEPP.ClickOnGetMethod.click();
			Thread.sleep(2000);

			CEPP.EnterServerURL.sendKeys(serverurl + "/pcm/workflow");
			Thread.sleep(2000);
			CEPP.ClickOnServerAuthorization.click();
			Thread.sleep(2000);
			CEPP.ClickOnAuthDropDown.click();
			Thread.sleep(2000);
			CEPP.SelectBasicAuth.click();
			Thread.sleep(2000);
			CEPP.ServerAuthorizationUserName.sendKeys("cm_user");
			Thread.sleep(2000);
			CEPP.ServerAuthorizationPassword.sendKeys("password");
			Thread.sleep(2000);
			CEPP.ClickOnCreateButton.click();

			String title = CEPP.SuccessMsgPop.getText();
			System.out.println(title);
			if (title.equals("Proxy endpoint created successfully")) {
				child55.log(LogStatus.PASS, "Validation successful because we are getting message as ''" + title
						+ "'' when we verifying create api with proxy web method as GET and server authtype as Basic auth'");
			} else {
				child55.log(LogStatus.FAIL, "Validation Unsuccessful because we are getting message as ''" + title
						+ "''instead of '' when we verifying create api with proxy web method as GET and server authtype as Basic auth'");
			}

		} catch (Exception e) {
			child55.log(LogStatus.FAIL, e.fillInStackTrace());
		}
		_extent_report.endTest(child55);

	}

	@Test(priority = 57, enabled = true, description = "verifying create api with proxy web method as GET and server authtype as token auth")
	public void verifyingCreateApiwithproxywebmethodasGETandServerauthtypeasTokencauth() throws Throwable {
		child56 = _extent_report
				.startTest("verifying create api with proxy web method as GET and server authtype as token auth");
		child56.assignCategory("Create API Endpoint");
		try {
			Thread.sleep(3000);
			CEPP.MangeEndPointClick.click();
			Thread.sleep(2000);
			CEPP.CreateEndPointClick.click();
			Thread.sleep(2000);
			CEPP.EnterAPIName.sendKeys("Testapi" + api++);
			Thread.sleep(2000);
			CEPP.ClickOnDropdow.click();
			Thread.sleep(2000);
			CEPP.ClickOCreateAPIFromDropDown.click();
			Thread.sleep(2000);

			CEPP.ClickOnProxyWebMethod.click();
			Thread.sleep(2000);
			CEPP.ClickOnGetMethod.click();
			Thread.sleep(2000);

			CEPP.EnterServerURL.sendKeys(serverurl + "/pcm/workflow");
			Thread.sleep(2000);
			CEPP.ClickOnServerAuthorization.click();
			Thread.sleep(2000);
			CEPP.ClickOnAuthDropDown.click();
			Thread.sleep(2000);
			CEPP.SelectTokenAuth.click();
			Thread.sleep(2000);
			CEPP.ServerTokenUrl.sendKeys("https://20.55.8.64:7080//pcm/workflow/export");
			Thread.sleep(2000);
			CEPP.ServerTokenKey.sendKeys("Token");
			Thread.sleep(2000);
			CEPP.ServerPrefix.sendKeys("Bearer");
			Thread.sleep(2000);
			CEPP.ServerHeader.sendKeys("Authorization");
			Thread.sleep(2000);
			CEPP.ServerAuthorizationUserName.sendKeys("cm_user");
			Thread.sleep(2000);
			CEPP.ServerAuthorizationPassword.sendKeys("password");
			Thread.sleep(2000);
			CEPP.ClickOnCreateButton.click();

			String title = CEPP.SuccessMsgPop.getText();
			System.out.println(title);
			if (title.equals("Proxy endpoint created successfully")) {
				child56.log(LogStatus.PASS, "Validation successful because we are getting message as ''" + title
						+ "'' when we verifying create api with proxy web method as GET and server authtype as token auth'");
			} else {
				child56.log(LogStatus.FAIL, "Validation Unsuccessful because we are getting message as ''" + title
						+ "''instead of '' when we verifying create api with proxy web method as GET and server authtype as token auth'");
			}

		} catch (Exception e) {
			child56.log(LogStatus.FAIL, e.fillInStackTrace());
		}
		_extent_report.endTest(child56);

	}

	@Test(priority = 58, enabled = true, description = "Verifying create api with proxy web method as GET and server authtype as O Auth1.0")
	public void VerifyingCreateApwithSeverAuth() throws Throwable {
		child57 = _extent_report
				.startTest("Verifying create api with proxy web method as GET and server authtype as O Auth1.0");
		child57.assignCategory("Create API Endpoint");
		try {
			Thread.sleep(3000);
			CEPP.MangeEndPointClick.click();
			Thread.sleep(2000);
			CEPP.CreateEndPointClick.click();
			Thread.sleep(2000);
			CEPP.EnterAPIName.sendKeys("Testapi" + api++);
			Thread.sleep(2000);
			CEPP.ClickOnDropdow.click();
			Thread.sleep(2000);
			CEPP.ClickOCreateAPIFromDropDown.click();
			Thread.sleep(2000);

			CEPP.ClickOnProxyWebMethod.click();
			Thread.sleep(2000);
			CEPP.ClickOnGetMethod.click();

			Thread.sleep(2000);
			CEPP.EnterServerURL.sendKeys(serverurl + "/pcm/workflow");
			Thread.sleep(2000);
			CEPP.ClickOnServerAuthorization.click();
			Thread.sleep(2000);
			CEPP.ClickOnAuthDropDown.click();
			Thread.sleep(2000);
			CEPP.SelectOAuth1.click();
			Thread.sleep(2000);
			CEPP.ClickOnCreateButton.click();

			String title = CEPP.SuccessMsgPop.getText();
			System.out.println(title);
			if (title.equals("Proxy endpoint created successfully")) {
				child57.log(LogStatus.PASS, "Validation successful because we are getting message as ''" + title
						+ "'' when we verifying create api with proxy web method as GET and server authtype as O Auth1.0'");
			} else {
				child57.log(LogStatus.FAIL, "Validation Unsuccessful because we are getting message as ''" + title
						+ "''instead of '' when we verifying create api with proxy web method as GET and server authtype as O Auth1.0'");
			}

		} catch (Exception e) {
			child57.log(LogStatus.FAIL, e.fillInStackTrace());
		}
		_extent_report.endTest(child57);

	}

	@Test(priority = 59, enabled = true, description = "Verifying create api with proxy web method as GET and server authtype as O Auth2.0")
	public void VerifyingCreateAPIwithSeverAuth() throws Throwable {
		child58 = _extent_report
				.startTest("Verifying create api with proxy web method as GET and server authtype as O Auth2.0");
		child58.assignCategory("Create API Endpoint");
		try {
			Thread.sleep(3000);
			CEPP.MangeEndPointClick.click();
			Thread.sleep(2000);
			CEPP.CreateEndPointClick.click();
			Thread.sleep(2000);
			CEPP.EnterAPIName.sendKeys("Testapi" + api++);
			Thread.sleep(2000);
			CEPP.ClickOnDropdow.click();
			Thread.sleep(2000);
			CEPP.ClickOCreateAPIFromDropDown.click();
			Thread.sleep(2000);

			CEPP.ClickOnProxyWebMethod.click();
			Thread.sleep(2000);
			CEPP.ClickOnGetMethod.click();

			Thread.sleep(2000);
			CEPP.EnterServerURL.sendKeys(serverurl + "/pcm/workflow");
			Thread.sleep(2000);
			CEPP.ClickOnServerAuthorization.click();
			Thread.sleep(2000);
			CEPP.ClickOnAuthDropDown.click();
			Thread.sleep(2000);
			CEPP.SelectOAuth2.click();
			Thread.sleep(2000);
			CEPP.ClickOnCreateButton.click();

			String title = CEPP.SuccessMsgPop.getText();
			System.out.println(title);
			if (title.equals("Proxy endpoint created successfully")) {
				child58.log(LogStatus.PASS, "Validation successful because we are getting message as ''" + title
						+ "'' when we verifying create api with proxy web method as GET and server authtype as O Auth2.0'");
			} else {
				child58.log(LogStatus.FAIL, "Validation Unsuccessful because we are getting message as ''" + title
						+ "''instead of '' when we verifying create api with proxy web method as GET and server authtype as O Auth2.0'");
			}

		} catch (Exception e) {
			child58.log(LogStatus.FAIL, e.fillInStackTrace());
		}
		_extent_report.endTest(child58);

	}

	@Test(priority = 60, enabled = true, description = "Verifying create api with proxy web method as POST and Server authtype as No Auth")
	public void VerifyingCreateApiwithPOSTSeverAuthOAuth() throws Throwable {
		child59 = _extent_report
				.startTest("Verifying create api with proxy web method as POST and Server authtype as No Auth");
		child59.assignCategory("Create API Endpoint");
		try {
			Thread.sleep(3000);
			CEPP.MangeEndPointClick.click();
			Thread.sleep(2000);
			CEPP.CreateEndPointClick.click();
			Thread.sleep(2000);
			CEPP.EnterAPIName.sendKeys("Testapi" + api++);
			Thread.sleep(2000);
			CEPP.ClickOnDropdow.click();
			Thread.sleep(2000);
			CEPP.ClickOCreateAPIFromDropDown.click();
			Thread.sleep(2000);

			CEPP.ClickOnProxyWebMethod.click();
			Thread.sleep(2000);
			CEPP.ClickOnPostMethod.click();

			Thread.sleep(2000);
			CEPP.EnterServerURL.sendKeys(serverurl + "/pcm/workflow");
			Thread.sleep(2000);
			CEPP.ClickOnServerAuthorization.click();
			Thread.sleep(2000);
			CEPP.ClickOnAuthDropDown.click();
			Thread.sleep(2000);
			CEPP.SelectNoAuth.click();
			Thread.sleep(2000);
			CEPP.ClickOnCreateButton.click();

			String title = CEPP.SuccessMsgPop.getText();
			System.out.println(title);
			if (title.equals("Proxy endpoint created successfully")) {
				child59.log(LogStatus.PASS, "Validation successful because we are getting message as ''" + title
						+ "'' when we verifying create api with proxy web method as POST and Server authtype as No Auth'");
			} else {
				child59.log(LogStatus.FAIL, "Validation Unsuccessful because we are getting message as ''" + title
						+ "''instead of '' when we verifying create api with proxy web method as POST and Server authtype as No Auth'");
			}

		} catch (Exception e) {
			child59.log(LogStatus.FAIL, e.fillInStackTrace());
		}
		_extent_report.endTest(child59);

	}

	@Test(priority = 61, enabled = true, description = "Verifying create api with proxy web method as POST and server authtype as Basic auth")
	public void VerifyingCreateApiwithPOSTSeverAuthAsBasicAuth() throws Throwable {
		child60 = _extent_report
				.startTest("Verifying create api with proxy web method as POST and server authtype as Basic auth");
		child60.assignCategory("Create API Endpoint");
		try {
			Thread.sleep(3000);
			CEPP.MangeEndPointClick.click();
			Thread.sleep(2000);
			CEPP.CreateEndPointClick.click();
			Thread.sleep(2000);
			CEPP.EnterAPIName.sendKeys("Testapi" + api++);
			Thread.sleep(2000);
			CEPP.ClickOnDropdow.click();
			Thread.sleep(2000);
			CEPP.ClickOCreateAPIFromDropDown.click();
			Thread.sleep(2000);

			CEPP.ClickOnProxyWebMethod.click();
			Thread.sleep(2000);
			CEPP.ClickOnPostMethod.click();

			Thread.sleep(2000);
			CEPP.EnterServerURL.sendKeys(serverurl + "/pcm/workflow");
			Thread.sleep(2000);
			CEPP.ClickOnServerAuthorization.click();
			Thread.sleep(2000);
			CEPP.ClickOnAuthDropDown.click();
			Thread.sleep(2000);
			CEPP.SelectBasicAuth.click();
			Thread.sleep(2000);
			CEPP.ServerAuthorizationUserName.sendKeys("cm_user");
			Thread.sleep(2000);
			CEPP.ServerAuthorizationPassword.sendKeys("password");
			Thread.sleep(2000);
			CEPP.ClickOnCreateButton.click();

			String title = CEPP.SuccessMsgPop.getText();
			System.out.println(title);
			if (title.equals("Proxy endpoint created successfully")) {
				child60.log(LogStatus.PASS, "Validation successful because we are getting message as ''" + title
						+ "'' when we Verifying create api with proxy web method as POST and server authtype as Basic auth'");
			} else {
				child60.log(LogStatus.FAIL, "Validation Unsuccessful because we are getting message as ''" + title
						+ "''instead of '' when we Verifying create api with proxy web method as POST and server authtype as Basic auth'");
			}

		} catch (Exception e) {
			child60.log(LogStatus.FAIL, e.fillInStackTrace());
		}
		_extent_report.endTest(child60);

	}

	@Test(priority = 62, enabled = true, description = "verifying create api with proxy web method as POST and server authtype as token auth")
	public void verifyingCreateApiwithproxywebmethodasPOSTandServerauthtypeasTokencauth() throws Throwable {
		child61 = _extent_report
				.startTest("verifying create api with proxy web method as POST and server authtype as token auth");
		child61.assignCategory("Create API Endpoint");
		try {
			Thread.sleep(3000);
			CEPP.MangeEndPointClick.click();
			Thread.sleep(2000);
			CEPP.CreateEndPointClick.click();
			Thread.sleep(2000);
			CEPP.EnterAPIName.sendKeys("Testapi" + api++);
			Thread.sleep(2000);
			CEPP.ClickOnDropdow.click();
			Thread.sleep(2000);
			CEPP.ClickOCreateAPIFromDropDown.click();
			Thread.sleep(2000);

			CEPP.ClickOnProxyWebMethod.click();
			Thread.sleep(2000);
			CEPP.ClickOnPostMethod.click();

			Thread.sleep(2000);
			CEPP.EnterServerURL.sendKeys(serverurl + "/pcm/workflow");
			Thread.sleep(2000);
			CEPP.ClickOnServerAuthorization.click();
			Thread.sleep(2000);
			CEPP.ClickOnAuthDropDown.click();
			Thread.sleep(2000);
			CEPP.SelectTokenAuth.click();
			Thread.sleep(2000);
			CEPP.ServerTokenUrl.sendKeys("https://20.55.8.64:7080//pcm/workflow/export");
			Thread.sleep(2000);
			CEPP.ServerTokenKey.sendKeys("Token");
			Thread.sleep(2000);
			CEPP.ServerPrefix.sendKeys("Bearer");
			Thread.sleep(2000);
			CEPP.ServerHeader.sendKeys("Authorization");
			Thread.sleep(2000);
			CEPP.ServerAuthorizationUserName.sendKeys("cm_user");
			Thread.sleep(2000);
			CEPP.ServerAuthorizationPassword.sendKeys("password");
			Thread.sleep(2000);
			CEPP.ClickOnCreateButton.click();

			String title = CEPP.SuccessMsgPop.getText();
			System.out.println(title);
			if (title.equals("Proxy endpoint created successfully")) {
				child61.log(LogStatus.PASS, "Validation successful because we are getting message as ''" + title
						+ "'' when we verifying create api with proxy web method as POST and server authtype as token auth'");
			} else {
				child61.log(LogStatus.FAIL, "Validation Unsuccessful because we are getting message as ''" + title
						+ "''instead of '' when we verifying create api with proxy web method as POST and server authtype as token auth'");
			}

		} catch (Exception e) {
			child61.log(LogStatus.FAIL, e.fillInStackTrace());
		}
		_extent_report.endTest(child61);

	}

	@Test(priority = 63, enabled = true, description = "verifying create api with proxy web method as POST and server authtype as O Auth1.0")
	public void VerifyingCreateApwithSeverAuthOne() throws Throwable {
		child62 = _extent_report
				.startTest("verifying create api with proxy web method as POST and server authtype as O Auth1.0");
		child62.assignCategory("Create API Endpoint");
		try {
			Thread.sleep(3000);
			CEPP.MangeEndPointClick.click();
			Thread.sleep(2000);
			CEPP.CreateEndPointClick.click();
			Thread.sleep(2000);
			CEPP.EnterAPIName.sendKeys("Testapi" + api++);
			Thread.sleep(2000);
			CEPP.ClickOnDropdow.click();
			Thread.sleep(2000);
			CEPP.ClickOCreateAPIFromDropDown.click();
			Thread.sleep(2000);

			CEPP.ClickOnProxyWebMethod.click();
			Thread.sleep(2000);
			CEPP.ClickOnGetMethod.click();

			Thread.sleep(2000);
			CEPP.EnterServerURL.sendKeys(serverurl + "/pcm/workflow");
			Thread.sleep(2000);
			CEPP.ClickOnServerAuthorization.click();
			Thread.sleep(2000);
			CEPP.ClickOnAuthDropDown.click();
			Thread.sleep(2000);
			CEPP.SelectOAuth1.click();
			Thread.sleep(2000);
			CEPP.ClickOnCreateButton.click();

			String title = CEPP.SuccessMsgPop.getText();
			System.out.println(title);
			if (title.equals("Proxy endpoint created successfully")) {
				child62.log(LogStatus.PASS, "Validation successful because we are getting message as ''" + title
						+ "'' when we verifying create api with proxy web method as POST and server authtype as O Auth1.0'");
			} else {
				child62.log(LogStatus.FAIL, "Validation Unsuccessful because we are getting message as ''" + title
						+ "''instead of '' when we verifying create api with proxy web method as POST and server authtype as O Auth1.0'");
			}

		} catch (Exception e) {
			child62.log(LogStatus.FAIL, e.fillInStackTrace());
		}
		_extent_report.endTest(child62);

	}

	@Test(priority = 64, enabled = true, description = "Verifying create api with proxy web method as GET and server authtype as O Auth2.0")
	public void VerifyingCreateAPIwithSeverAuthTwo() throws Throwable {
		child63 = _extent_report
				.startTest("Verifying create api with proxy web method as GET and server authtype as O Auth2.0");
		child63.assignCategory("Create API Endpoint");
		try {
			Thread.sleep(3000);
			CEPP.MangeEndPointClick.click();
			Thread.sleep(2000);
			CEPP.CreateEndPointClick.click();
			Thread.sleep(2000);
			CEPP.EnterAPIName.sendKeys("Testapi" + api++);
			Thread.sleep(2000);
			CEPP.ClickOnDropdow.click();
			Thread.sleep(2000);
			CEPP.ClickOCreateAPIFromDropDown.click();
			Thread.sleep(2000);

			CEPP.ClickOnProxyWebMethod.click();
			Thread.sleep(2000);
			CEPP.ClickOnGetMethod.click();

			Thread.sleep(2000);
			CEPP.EnterServerURL.sendKeys(serverurl + "/pcm/workflow");
			Thread.sleep(2000);
			CEPP.ClickOnServerAuthorization.click();
			Thread.sleep(2000);
			CEPP.ClickOnAuthDropDown.click();
			Thread.sleep(2000);
			CEPP.SelectOAuth2.click();
			Thread.sleep(2000);
			CEPP.ClickOnCreateButton.click();

			String title = CEPP.SuccessMsgPop.getText();
			System.out.println(title);
			if (title.equals("Proxy endpoint created successfully")) {
				child63.log(LogStatus.PASS, "Validation successful because we are getting message as ''" + title
						+ "'' when we verifying create api with proxy web method as POST and server authtype as O Auth2.0'");
			} else {
				child63.log(LogStatus.FAIL, "Validation Unsuccessful because we are getting message as ''" + title
						+ "''instead of '' when we verifying create api with proxy web method as POST and server authtype as O Auth2.0'");
			}

		} catch (Exception e) {
			child63.log(LogStatus.FAIL, e.fillInStackTrace());
		}
		_extent_report.endTest(child63);

	}

	@Test(priority = 65, enabled = true, description = "verifying create api with proxy web method as PUT  and Server authtype as No Auth")
	public void VerifyingCreateApiwithPUTSeverAuthOAuth() throws Throwable {
		child64 = _extent_report
				.startTest("verifying create api with proxy web method as PUT  and Server authtype as No Auth");
		child64.assignCategory("Create API Endpoint");
		try {
			Thread.sleep(3000);
			CEPP.MangeEndPointClick.click();
			Thread.sleep(2000);
			CEPP.CreateEndPointClick.click();
			Thread.sleep(2000);
			CEPP.EnterAPIName.sendKeys("Testapi" + api++);
			Thread.sleep(2000);
			CEPP.ClickOnDropdow.click();
			Thread.sleep(2000);
			CEPP.ClickOCreateAPIFromDropDown.click();
			Thread.sleep(2000);

			CEPP.ClickOnProxyWebMethod.click();
			Thread.sleep(2000);
			CEPP.ClickOnPutMethod.click();

			Thread.sleep(2000);
			CEPP.EnterServerURL.sendKeys(serverurl + "/pcm/workflow");
			Thread.sleep(2000);
			CEPP.ClickOnServerAuthorization.click();
			Thread.sleep(2000);
			CEPP.ClickOnAuthDropDown.click();
			Thread.sleep(2000);
			CEPP.SelectNoAuth.click();
			Thread.sleep(2000);
			CEPP.ClickOnCreateButton.click();

			String title = CEPP.SuccessMsgPop.getText();
			System.out.println(title);
			if (title.equals("Proxy endpoint created successfully")) {
				child64.log(LogStatus.PASS, "Validation successful because we are getting message as ''" + title
						+ "'' when we verifying create api with proxy web method as PUT  and Server authtype as No Auth'");
			} else {
				child64.log(LogStatus.FAIL, "Validation Unsuccessful because we are getting message as ''" + title
						+ "''instead of '' when we verifying create api with proxy web method as PUT  and Server authtype as No Auth'");
			}

		} catch (Exception e) {
			child64.log(LogStatus.FAIL, e.fillInStackTrace());
		}
		_extent_report.endTest(child64);

	}

	@Test(priority = 66, enabled = true, description = "verifying create api with proxy web method as PUT and server authtype as Basic auth")
	public void VerifyingCreateApiwithPUTSeverAuthAsBasicAuth() throws Throwable {
		child65 = _extent_report
				.startTest("verifying create api with proxy web method as PUT and server authtype as Basic auth");
		child65.assignCategory("Create API Endpoint");
		try {
			Thread.sleep(3000);
			CEPP.MangeEndPointClick.click();
			Thread.sleep(2000);
			CEPP.CreateEndPointClick.click();
			Thread.sleep(2000);
			CEPP.EnterAPIName.sendKeys("Testapi" + api++);
			Thread.sleep(2000);
			CEPP.ClickOnDropdow.click();
			Thread.sleep(2000);
			CEPP.ClickOCreateAPIFromDropDown.click();
			Thread.sleep(2000);

			CEPP.ClickOnProxyWebMethod.click();
			Thread.sleep(2000);
			CEPP.ClickOnPutMethod.click();

			Thread.sleep(2000);
			CEPP.EnterServerURL.sendKeys(serverurl + "/pcm/workflow");
			Thread.sleep(2000);
			CEPP.ClickOnServerAuthorization.click();
			Thread.sleep(2000);
			CEPP.ClickOnAuthDropDown.click();
			Thread.sleep(2000);
			CEPP.SelectBasicAuth.click();
			Thread.sleep(2000);
			CEPP.ServerAuthorizationUserName.sendKeys("cm_user");
			Thread.sleep(2000);
			CEPP.ServerAuthorizationPassword.sendKeys("password");
			Thread.sleep(2000);
			CEPP.ClickOnCreateButton.click();

			String title = CEPP.SuccessMsgPop.getText();
			System.out.println(title);
			if (title.equals("Proxy endpoint created successfully")) {
				child65.log(LogStatus.PASS, "Validation successful because we are getting message as ''" + title
						+ "'' when we verifying create api with proxy web method as PUT and server authtype as Basic auth'");
			} else {
				child65.log(LogStatus.FAIL, "Validation Unsuccessful because we are getting message as ''" + title
						+ "''instead of '' when we verifying create api with proxy web method as PUT and server authtype as Basic auth'");
			}

		} catch (Exception e) {
			child65.log(LogStatus.FAIL, e.fillInStackTrace());
		}
		_extent_report.endTest(child65);

	}

	@Test(priority = 67, enabled = true, description = "verifying create api with proxy web method as PUT and server authtype as token auth")
	public void VerifyingCreateApiwithPUTSeverAuthAsTokenAuth() throws Throwable {
		child66 = _extent_report
				.startTest("verifying create api with proxy web method as PUT and server authtype as token auth");
		child66.assignCategory("Create API Endpoint");
		try {
			Thread.sleep(3000);
			CEPP.MangeEndPointClick.click();
			Thread.sleep(2000);
			CEPP.CreateEndPointClick.click();
			Thread.sleep(2000);
			CEPP.EnterAPIName.sendKeys("Testapi" + api++);
			Thread.sleep(2000);
			CEPP.ClickOnDropdow.click();
			Thread.sleep(2000);
			CEPP.ClickOCreateAPIFromDropDown.click();
			Thread.sleep(2000);

			CEPP.ClickOnProxyWebMethod.click();
			Thread.sleep(2000);
			CEPP.ClickOnPutMethod.click();

			Thread.sleep(2000);
			CEPP.EnterServerURL.sendKeys(serverurl + "/pcm/workflow");
			Thread.sleep(2000);
			CEPP.ClickOnServerAuthorization.click();
			Thread.sleep(2000);
			CEPP.ClickOnAuthDropDown.click();
			Thread.sleep(2000);
			CEPP.SelectTokenAuth.click();
			Thread.sleep(2000);
			CEPP.ServerTokenUrl.sendKeys("https://20.55.8.64:7080//pcm/workflow/export");
			Thread.sleep(2000);
			CEPP.ServerTokenKey.sendKeys("Token");
			Thread.sleep(2000);
			CEPP.ServerPrefix.sendKeys("Bearer");
			Thread.sleep(2000);
			CEPP.ServerHeader.sendKeys("Authorization");
			Thread.sleep(2000);
			CEPP.ServerAuthorizationUserName.sendKeys("cm_user");
			Thread.sleep(2000);
			CEPP.ServerAuthorizationPassword.sendKeys("password");
			Thread.sleep(2000);
			CEPP.ClickOnCreateButton.click();

			String title = CEPP.SuccessMsgPop.getText();
			System.out.println(title);
			if (title.equals("Proxy endpoint created successfully")) {
				child66.log(LogStatus.PASS, "Validation successful because we are getting message as ''" + title
						+ "'' when we verifying create api with proxy web method as PUT and server authtype as Basic auth'");
			} else {
				child66.log(LogStatus.FAIL, "Validation Unsuccessful because we are getting message as ''" + title
						+ "''instead of '' when we verifying create api with proxy web method as PUT and server authtype as Basic auth'");
			}

		} catch (Exception e) {
			child66.log(LogStatus.FAIL, e.fillInStackTrace());
		}
		_extent_report.endTest(child66);

	}

	@Test(priority = 68, enabled = true, description = "verifying create api with proxy web method as PUT and server authtype as O Auth1.0")
	public void VerifyingCreateAPIwithProxywebMethodasPUTandServerAuthtypeasOAuth() throws Throwable {
		child67 = _extent_report
				.startTest("verifying create api with proxy web method as PUT and server authtype as O Auth1.0");
		child67.assignCategory("Create API Endpoint");
		try {
			Thread.sleep(3000);
			CEPP.MangeEndPointClick.click();
			Thread.sleep(2000);
			CEPP.CreateEndPointClick.click();
			Thread.sleep(2000);
			CEPP.EnterAPIName.sendKeys("Testapi" + api++);
			Thread.sleep(2000);
			CEPP.ClickOnDropdow.click();
			Thread.sleep(2000);
			CEPP.ClickOCreateAPIFromDropDown.click();
			Thread.sleep(2000);

			CEPP.ClickOnProxyWebMethod.click();
			Thread.sleep(2000);
			CEPP.ClickOnPutMethod.click();

			Thread.sleep(2000);
			CEPP.EnterServerURL.sendKeys(serverurl + "/pcm/workflow");
			Thread.sleep(2000);
			CEPP.ClickOnServerAuthorization.click();
			Thread.sleep(2000);
			CEPP.ClickOnAuthDropDown.click();
			Thread.sleep(2000);
			CEPP.SelectOAuth1.click();
			Thread.sleep(2000);
			CEPP.ClickOnCreateButton.click();

			String title = CEPP.SuccessMsgPop.getText();
			System.out.println(title);
			if (title.equals("Proxy endpoint created successfully")) {
				child67.log(LogStatus.PASS, "Validation successful because we are getting message as ''" + title
						+ "'' when we verifying create api with proxy web method as PUT and server authtype as O Auth1.0'");
			} else {
				child67.log(LogStatus.FAIL, "Validation Unsuccessful because we are getting message as ''" + title
						+ "''instead of '' when we verifying create api with proxy web method as PUT and server authtype as O Auth1.0'");
			}

		} catch (Exception e) {
			child67.log(LogStatus.FAIL, e.fillInStackTrace());
		}
		_extent_report.endTest(child67);

	}

	@Test(priority = 69, enabled = true, description = "verifying create api with proxy web method as PUT and server authtype as O Auth2.0")
	public void VerifyingCreateAPIwithProxywebMethodasPUTandServerAuthtypeAsOAuth() throws Throwable {
		child68 = _extent_report
				.startTest("verifying create api with proxy web method as PUT and server authtype as O Auth2.0");
		child68.assignCategory("Create API Endpoint");
		try {
			Thread.sleep(3000);
			CEPP.MangeEndPointClick.click();
			Thread.sleep(2000);
			CEPP.CreateEndPointClick.click();
			Thread.sleep(2000);
			CEPP.EnterAPIName.sendKeys("Testapi" + api++);
			Thread.sleep(2000);
			CEPP.ClickOnDropdow.click();
			Thread.sleep(2000);
			CEPP.ClickOCreateAPIFromDropDown.click();
			Thread.sleep(2000);

			CEPP.ClickOnProxyWebMethod.click();
			Thread.sleep(2000);
			CEPP.ClickOnPutMethod.click();

			Thread.sleep(2000);
			CEPP.EnterServerURL.sendKeys(serverurl + "/pcm/workflow");
			Thread.sleep(2000);
			CEPP.ClickOnServerAuthorization.click();
			Thread.sleep(2000);
			CEPP.ClickOnAuthDropDown.click();
			Thread.sleep(2000);
			CEPP.SelectOAuth2.click();
			Thread.sleep(2000);
			CEPP.ClickOnCreateButton.click();

			String title = CEPP.SuccessMsgPop.getText();
			System.out.println(title);
			if (title.equals("Proxy endpoint created successfully")) {
				child68.log(LogStatus.PASS, "Validation successful because we are getting message as ''" + title
						+ "'' when we verifying create api with proxy web method as PUT and server authtype as O Auth2.0'");
			} else {
				child68.log(LogStatus.FAIL, "Validation Unsuccessful because we are getting message as ''" + title
						+ "''instead of '' when we verifying create api with proxy web method as PUT and server authtype as O Auth2.0'");
			}

		} catch (Exception e) {
			child68.log(LogStatus.FAIL, e.fillInStackTrace());
		}
		_extent_report.endTest(child68);

	}

	@Test(priority = 70, enabled = true, description = "verifying create api with proxy web method as DELETE and Server authtype as No Auth")
	public void VerifyingCreateApiwithDELETESeverAuthOAuth() throws Throwable {
		child69 = _extent_report
				.startTest("verifying create api with proxy web method as DELETE and Server authtype as No Auth");
		child69.assignCategory("Create API Endpoint");
		try {
			Thread.sleep(3000);
			CEPP.MangeEndPointClick.click();
			Thread.sleep(2000);
			CEPP.CreateEndPointClick.click();
			Thread.sleep(2000);
			CEPP.EnterAPIName.sendKeys("Testapi" + api++);
			Thread.sleep(2000);
			CEPP.ClickOnDropdow.click();
			Thread.sleep(2000);
			CEPP.ClickOCreateAPIFromDropDown.click();
			Thread.sleep(2000);

			CEPP.ClickOnProxyWebMethod.click();
			Thread.sleep(2000);
			CEPP.ClickOnDeleteMethod.click();

			Thread.sleep(2000);
			CEPP.EnterServerURL.sendKeys(serverurl + "/pcm/workflow");
			Thread.sleep(2000);
			CEPP.ClickOnServerAuthorization.click();
			Thread.sleep(2000);
			CEPP.ClickOnAuthDropDown.click();
			Thread.sleep(2000);
			CEPP.SelectNoAuth.click();
			Thread.sleep(2000);
			CEPP.ClickOnCreateButton.click();

			String title = CEPP.SuccessMsgPop.getText();
			System.out.println(title);
			if (title.equals("Proxy endpoint created successfully")) {
				child69.log(LogStatus.PASS, "Validation successful because we are getting message as ''" + title
						+ "'' when we verifying create api with proxy web method as DELETE and Server authtype as No Auth'");
			} else {
				child69.log(LogStatus.FAIL, "Validation Unsuccessful because we are getting message as" + title
						+ "instead of  when we verifying create api with proxy web method as DELETE and Server authtype as No Auth");
			}

		} catch (Exception e) {
			child69.log(LogStatus.FAIL, e.fillInStackTrace());
		}
		_extent_report.endTest(child69);

	}

	@Test(priority = 71, enabled = true, description = "verifying create api with proxy web method as DELETE and server authtype as Basic auth")
	public void VerifyingCreateApiwithDELETESeverAuthAsBasicAuth() throws Throwable {
		child70 = _extent_report
				.startTest("verifying create api with proxy web method as DELETE and server authtype as Basic auth");
		child70.assignCategory("Create API Endpoint");
		try {
			Thread.sleep(3000);
			CEPP.MangeEndPointClick.click();
			Thread.sleep(2000);
			CEPP.CreateEndPointClick.click();
			Thread.sleep(2000);
			CEPP.EnterAPIName.sendKeys("Testapi" + api++);
			Thread.sleep(2000);
			CEPP.ClickOnDropdow.click();
			Thread.sleep(2000);
			CEPP.ClickOCreateAPIFromDropDown.click();
			Thread.sleep(2000);

			CEPP.ClickOnProxyWebMethod.click();
			Thread.sleep(2000);
			CEPP.ClickOnDeleteMethod.click();
			Thread.sleep(2000);

			CEPP.EnterServerURL.sendKeys(serverurl + "/pcm/workflow");
			Thread.sleep(2000);
			CEPP.ClickOnServerAuthorization.click();
			Thread.sleep(2000);
			CEPP.ClickOnAuthDropDown.click();
			Thread.sleep(2000);
			CEPP.SelectBasicAuth.click();
			Thread.sleep(2000);
			CEPP.ServerAuthorizationUserName.sendKeys("cm_user");
			Thread.sleep(2000);
			CEPP.ServerAuthorizationPassword.sendKeys("password");
			Thread.sleep(2000);
			CEPP.ClickOnCreateButton.click();

			String title = CEPP.SuccessMsgPop.getText();
			System.out.println(title);
			if (title.equals("Proxy endpoint created successfully")) {
				child70.log(LogStatus.PASS, "Validation successful because we are getting message as ''" + title
						+ "'' when we verifying create api with proxy web method as DELETE and server authtype as Basic auth");
			} else {
				child70.log(LogStatus.FAIL, "Validation Unsuccessful because we are getting message as" + title
						+ "instead of  when we verifying create api with proxy web method as DELETE and server authtype as Basic auth");
			}

		} catch (Exception e) {
			child70.log(LogStatus.FAIL, e.fillInStackTrace());
		}
		_extent_report.endTest(child70);

	}

	@Test(priority = 72, enabled = true, description = "verifying create api with proxy web method as DELETE and server authtype as token auth")
	public void VerifyingCreateApiwithDELETESeverAuthAsTokenAuth() throws Throwable {
		child71 = _extent_report
				.startTest("verifying create api with proxy web method as DELETE and server authtype as token auth");
		child71.assignCategory("Create API Endpoint");
		try {
			Thread.sleep(3000);
			CEPP.MangeEndPointClick.click();
			Thread.sleep(2000);
			CEPP.CreateEndPointClick.click();
			Thread.sleep(2000);
			CEPP.EnterAPIName.sendKeys("Testapi" + api++);
			Thread.sleep(2000);
			CEPP.ClickOnDropdow.click();
			Thread.sleep(2000);
			CEPP.ClickOCreateAPIFromDropDown.click();
			Thread.sleep(2000);

			CEPP.ClickOnProxyWebMethod.click();
			Thread.sleep(2000);
			CEPP.ClickOnDeleteMethod.click();

			Thread.sleep(2000);
			CEPP.EnterServerURL.sendKeys(serverurl + "/pcm/workflow");
			Thread.sleep(2000);
			CEPP.ClickOnServerAuthorization.click();
			Thread.sleep(2000);
			CEPP.ClickOnAuthDropDown.click();
			Thread.sleep(2000);
			CEPP.SelectTokenAuth.click();
			Thread.sleep(2000);
			CEPP.ServerTokenUrl.sendKeys("https://20.55.8.64:7080//pcm/workflow/export");
			Thread.sleep(2000);
			CEPP.ServerTokenKey.sendKeys("Token");
			Thread.sleep(2000);
			CEPP.ServerPrefix.sendKeys("Bearer");
			Thread.sleep(2000);
			CEPP.ServerHeader.sendKeys("Authorization");
			Thread.sleep(2000);
			CEPP.ServerAuthorizationUserName.sendKeys("cm_user");
			Thread.sleep(2000);
			CEPP.ServerAuthorizationPassword.sendKeys("password");
			Thread.sleep(2000);
			CEPP.ClickOnCreateButton.click();

			String title = CEPP.SuccessMsgPop.getText();
			System.out.println(title);
			if (title.equals("Proxy endpoint created successfully")) {
				child71.log(LogStatus.PASS, "Validation successful because we are getting message as ''" + title
						+ "'' when we verifying create api with proxy web method as DELETE and server authtype as Basic auth'");
			} else {
				child71.log(LogStatus.FAIL, "Validation Unsuccessful because we are getting message as ''" + title
						+ "''instead of '' when we verifying create api with proxy web method as DELETE and server authtype as Basic auth'");
			}

		} catch (Exception e) {
			child71.log(LogStatus.FAIL, e.fillInStackTrace());
		}
		_extent_report.endTest(child71);

	}

	@Test(priority = 73, enabled = true, description = "verifying create api with proxy web method as DELETE and server authtype as O Auth1.0")
	public void VerifyingCreateAPIwithProxywebMethodasDELETEandServerAuthtypeasOAuth() throws Throwable {
		child72 = _extent_report
				.startTest("verifying create api with proxy web method as DELETE and server authtype as O Auth1.0");
		child72.assignCategory("Create API Endpoint");
		try {
			Thread.sleep(3000);
			CEPP.MangeEndPointClick.click();
			Thread.sleep(2000);
			CEPP.CreateEndPointClick.click();
			Thread.sleep(2000);
			CEPP.EnterAPIName.sendKeys("Testapi" + api++);
			Thread.sleep(2000);
			CEPP.ClickOnDropdow.click();
			Thread.sleep(2000);
			CEPP.ClickOCreateAPIFromDropDown.click();
			Thread.sleep(2000);

			CEPP.ClickOnProxyWebMethod.click();
			Thread.sleep(2000);
			CEPP.ClickOnDeleteMethod.click();

			Thread.sleep(2000);
			CEPP.EnterServerURL.sendKeys(serverurl + "/pcm/workflow");
			Thread.sleep(2000);
			CEPP.ClickOnServerAuthorization.click();
			Thread.sleep(2000);
			CEPP.ClickOnAuthDropDown.click();
			Thread.sleep(2000);
			CEPP.SelectOAuth1.click();
			Thread.sleep(2000);
			CEPP.ClickOnCreateButton.click();

			String title = CEPP.SuccessMsgPop.getText();
			System.out.println(title);
			if (title.equals("Proxy endpoint created successfully")) {
				child72.log(LogStatus.PASS, "Validation successful because we are getting message as ''" + title
						+ "'' when we verifying create api with proxy web method as DELETE and server authtype as O Auth1.0'");
			} else {
				child72.log(LogStatus.FAIL, "Validation Unsuccessful because we are getting message as ''" + title
						+ "''instead of '' when we verifying create api with proxy web method as DELETE and server authtype as O Auth1.0'");
			}

		} catch (Exception e) {
			child72.log(LogStatus.FAIL, e.fillInStackTrace());
		}
		_extent_report.endTest(child72);

	}

	@Test(priority = 74, enabled = true, description = "verifying create api with proxy web method as DELETE and server authtype as O Auth2.0")
	public void VerifyingCreateAPIwithProxywebMethodasDELETEandServerAuthtypeAsOAuth() throws Throwable {
		child73 = _extent_report
				.startTest("verifying create api with proxy web method as DELETE and server authtype as O Auth2.0");
		child73.assignCategory("Create API Endpoint");
		try {
			Thread.sleep(3000);
			CEPP.MangeEndPointClick.click();
			Thread.sleep(2000);
			CEPP.CreateEndPointClick.click();
			Thread.sleep(2000);
			CEPP.EnterAPIName.sendKeys("Testapi" + api++);
			Thread.sleep(2000);
			CEPP.ClickOnDropdow.click();
			Thread.sleep(2000);
			CEPP.ClickOCreateAPIFromDropDown.click();
			Thread.sleep(2000);

			CEPP.ClickOnProxyWebMethod.click();
			Thread.sleep(2000);
			CEPP.ClickOnDeleteMethod.click();

			Thread.sleep(2000);
			CEPP.EnterServerURL.sendKeys(serverurl + "/pcm/workflow");
			Thread.sleep(2000);
			CEPP.ClickOnServerAuthorization.click();
			Thread.sleep(2000);
			CEPP.ClickOnAuthDropDown.click();
			Thread.sleep(2000);
			CEPP.SelectOAuth2.click();
			Thread.sleep(2000);
			CEPP.ClickOnCreateButton.click();

			String title = CEPP.SuccessMsgPop.getText();
			System.out.println(title);
			if (title.equals("Proxy endpoint created successfully")) {
				child73.log(LogStatus.PASS, "Validation successful because we are getting message as ''" + title
						+ "'' when we verifying create api with proxy web method as DELETE and server authtype as O Auth2.0'");
			} else {
				child73.log(LogStatus.FAIL, "Validation Unsuccessful because we are getting message as ''" + title
						+ "''instead of '' when we verifying create api with proxy web method as DELETE and server authtype as O Auth2.0'");
			}

		} catch (Exception e) {
			child73.log(LogStatus.FAIL, e.fillInStackTrace());
		}
		_extent_report.endTest(child73);

	}

	@Test(priority = 75, enabled = true, description = "Verifying create api with proxy web method as GET and Params with valid data")
	public void verifyingCreateAPIwithProxyWebMethodasGETandParamswithValidData() throws Throwable {
		child74 = _extent_report
				.startTest("Verifying create api with proxy web method as GET and Params with valid data");
		child74.assignCategory("Create API Endpoint");
		try {
			Thread.sleep(3000);
			CEPP.MangeEndPointClick.click();
			Thread.sleep(2000);
			CEPP.CreateEndPointClick.click();
			Thread.sleep(2000);
			CEPP.EnterAPIName.sendKeys("Testapi" + api++);
			Thread.sleep(2000);
			CEPP.ClickOnDropdow.click();
			Thread.sleep(2000);
			CEPP.ClickOCreateAPIFromDropDown.click();
			Thread.sleep(2000);

			CEPP.ClickOnProxyWebMethod.click();
			Thread.sleep(2000);
			CEPP.ClickOnGetMethod.click();

			Thread.sleep(2000);
			CEPP.EnterServerURL.sendKeys(serverurl + "/pcm/workflow");
			Thread.sleep(2000);
			CEPP.ClickOnParams.click();
			Thread.sleep(2000);
			CEPP.ParamsKey.sendKeys("dd");
			Thread.sleep(2000);
			CEPP.ParamsValue.sendKeys("sss");
			Thread.sleep(2000);
			CEPP.ParamsDescription.sendKeys("ddd");
			Thread.sleep(2000);
			CEPP.ParamsRequiredCheckBox.click();
			Thread.sleep(2000);
			CEPP.ParamsDynamicCheckBox.click();
			Thread.sleep(2000);
			CEPP.ClickOnCreateButton.click();

			String title = CEPP.SuccessMsgPop.getText();
			System.out.println(title);
			if (title.equals("Proxy endpoint created successfully")) {
				child74.log(LogStatus.PASS, "Validation successful because we are getting message as ''" + title
						+ "'' when we verifying create api with proxy web method as GET and Params with valid data'");
			} else {
				child74.log(LogStatus.FAIL, "Validation Unsuccessful because we are getting message as ''" + title
						+ "''instead of '' when we verifying create api with proxy web method as GET and Params with valid data'");
			}

		} catch (Exception e) {
			child74.log(LogStatus.FAIL, e.fillInStackTrace());
		}
		_extent_report.endTest(child74);

	}

	@Test(priority = 76, enabled = true, description = "verifying create api with proxy web method as GET and Params with ADD")
	public void verifyingCreateAPIwithProxyWebMethodasGETandParamswithValidDataAndADD() throws Throwable {
		child75 = _extent_report.startTest("verifying create api with proxy web method as GET and Params with ADD");
		child75.assignCategory("Create API Endpoint");
		try {
			Thread.sleep(3000);
			CEPP.MangeEndPointClick.click();
			Thread.sleep(2000);
			CEPP.CreateEndPointClick.click();
			Thread.sleep(2000);
			CEPP.EnterAPIName.sendKeys("Testapi" + api++);
			Thread.sleep(2000);
			CEPP.ClickOnDropdow.click();
			Thread.sleep(2000);
			CEPP.ClickOCreateAPIFromDropDown.click();
			Thread.sleep(2000);

			CEPP.ClickOnProxyWebMethod.click();
			Thread.sleep(2000);
			CEPP.ClickOnGetMethod.click();

			Thread.sleep(2000);
			CEPP.EnterServerURL.sendKeys(serverurl + "/pcm/workflow");
			Thread.sleep(2000);
			CEPP.ClickOnParams.click();
			Thread.sleep(2000);
			CEPP.ParamsKey.sendKeys("dd");
			Thread.sleep(2000);
			CEPP.ParamsValue.sendKeys("sss");
			Thread.sleep(2000);
			CEPP.ParamsDescription.sendKeys("ddd");
			Thread.sleep(2000);
			CEPP.ParamsRequiredCheckBox.click();
			Thread.sleep(2000);
			CEPP.ParamsDynamicCheckBox.click();
			Thread.sleep(2000);
			CEPP.ClickOnAddButton.click();
			Thread.sleep(2000);
			CEPP.ClickOnCreateButton.click();

			String title = CEPP.SuccessMsgPop.getText();
			System.out.println(title);
			if (title.equals("Proxy endpoint created successfully")) {
				child75.log(LogStatus.PASS, "Validation successful because we are getting message as ''" + title
						+ "'' when we verifying create api with proxy web method as GET and Params with ADD'");
			} else {
				child75.log(LogStatus.FAIL, "Validation Unsuccessful because we are getting message as ''" + title
						+ "''instead of '' when we verifying create api with proxy web method as GET and Params with ADD'");
			}

		} catch (Exception e) {
			child75.log(LogStatus.FAIL, e.fillInStackTrace());
		}
		_extent_report.endTest(child75);

	}

	@Test(priority = 77, enabled = true, description = "Verifying create api with proxy web method as POST and Params with valid data")
	public void verifyingCreateAPIwithProxyWebMethodasPOSTandParamswithValidData() throws Throwable {
		child76 = _extent_report
				.startTest("Verifying create api with proxy web method as POST and Params with valid data");
		child76.assignCategory("Create API Endpoint");
		try {
			Thread.sleep(3000);
			CEPP.MangeEndPointClick.click();
			Thread.sleep(2000);
			CEPP.CreateEndPointClick.click();
			Thread.sleep(2000);
			CEPP.EnterAPIName.sendKeys("Testapi" + api++);
			Thread.sleep(2000);
			CEPP.ClickOnDropdow.click();
			Thread.sleep(2000);
			CEPP.ClickOCreateAPIFromDropDown.click();
			Thread.sleep(2000);

			CEPP.ClickOnProxyWebMethod.click();
			Thread.sleep(2000);
			CEPP.ClickOnPostMethod.click();

			Thread.sleep(2000);
			CEPP.EnterServerURL.sendKeys(serverurl + "/pcm/workflow");
			Thread.sleep(2000);
			CEPP.ClickOnParams.click();
			Thread.sleep(2000);
			CEPP.ParamsKey.sendKeys("dd");
			Thread.sleep(2000);
			CEPP.ParamsValue.sendKeys("sss");
			Thread.sleep(2000);
			CEPP.ParamsDescription.sendKeys("ddd");
			Thread.sleep(2000);
			CEPP.ParamsRequiredCheckBox.click();
			Thread.sleep(2000);
			CEPP.ParamsDynamicCheckBox.click();
			Thread.sleep(2000);
			CEPP.ClickOnCreateButton.click();

			String title = CEPP.SuccessMsgPop.getText();
			System.out.println(title);
			if (title.equals("Proxy endpoint created successfully")) {
				child76.log(LogStatus.PASS, "Validation successful because we are getting message as ''" + title
						+ "'' when we verifying create api with proxy web method as GET and Params with valid data'");
			} else {
				child76.log(LogStatus.FAIL, "Validation Unsuccessful because we are getting message as ''" + title
						+ "''instead of '' when we verifying create api with proxy web method as GET and Params with valid data'");
			}

		} catch (Exception e) {
			child76.log(LogStatus.FAIL, e.fillInStackTrace());
		}
		_extent_report.endTest(child76);

	}

	@Test(priority = 78, enabled = true, description = "verifying create api with proxy web method as POST and Params with ADD")
	public void verifyingCreateAPIwithProxyWebMethodasPOSTandParamswithValidDataAndADD() throws Throwable {
		child77 = _extent_report.startTest("verifying create api with proxy web method as POST and Params with ADD");
		child77.assignCategory("Create API Endpoint");
		try {
			Thread.sleep(3000);
			CEPP.MangeEndPointClick.click();
			Thread.sleep(2000);
			CEPP.CreateEndPointClick.click();
			Thread.sleep(2000);
			CEPP.EnterAPIName.sendKeys("Testapi" + api++);
			Thread.sleep(2000);
			CEPP.ClickOnDropdow.click();
			Thread.sleep(2000);
			CEPP.ClickOCreateAPIFromDropDown.click();
			Thread.sleep(2000);
			CEPP.ClickOnProxyWebMethod.click();
			Thread.sleep(2000);
			CEPP.ClickOnPostMethod.click();

			Thread.sleep(2000);
			CEPP.EnterServerURL.sendKeys(serverurl + "/pcm/workflow");
			Thread.sleep(2000);
			CEPP.ClickOnParams.click();
			Thread.sleep(2000);
			CEPP.ParamsKey.sendKeys("dd");
			Thread.sleep(2000);
			CEPP.ParamsValue.sendKeys("sss");
			Thread.sleep(2000);
			CEPP.ParamsDescription.sendKeys("ddd");
			Thread.sleep(2000);
			CEPP.ParamsRequiredCheckBox.click();
			Thread.sleep(2000);
			CEPP.ParamsDynamicCheckBox.click();
			Thread.sleep(2000);
			CEPP.ClickOnAddButton.click();
			Thread.sleep(2000);
			CEPP.ClickOnCreateButton.click();

			String title = CEPP.SuccessMsgPop.getText();
			System.out.println(title);
			if (title.equals("Proxy endpoint created successfully")) {
				child77.log(LogStatus.PASS, "Validation successful because we are getting message as ''" + title
						+ "'' when we verifying create api with proxy web method as POST and Params with ADD'");
			} else {
				child77.log(LogStatus.FAIL, "Validation Unsuccessful because we are getting message as ''" + title
						+ "''instead of '' when we verifying create api with proxy web method as POST and Params with ADD'");
			}

		} catch (Exception e) {
			child77.log(LogStatus.FAIL, e.fillInStackTrace());
		}
		_extent_report.endTest(child77);

	}

	@Test(priority = 79, enabled = true, description = "Verifying create api with proxy web method as PUT and Params with valid data")
	public void verifyingCreateAPIwithProxyWebMethodasPUTandParamswithValidData() throws Throwable {
		child78 = _extent_report
				.startTest("Verifying create api with proxy web method as PUT and Params with valid data");
		child78.assignCategory("Create API Endpoint");
		try {
			Thread.sleep(3000);
			CEPP.MangeEndPointClick.click();
			Thread.sleep(2000);
			CEPP.CreateEndPointClick.click();
			Thread.sleep(2000);
			CEPP.EnterAPIName.sendKeys("Testapi" + api++);
			Thread.sleep(2000);
			CEPP.ClickOnDropdow.click();
			Thread.sleep(2000);
			CEPP.ClickOCreateAPIFromDropDown.click();
			Thread.sleep(2000);

			CEPP.ClickOnProxyWebMethod.click();
			Thread.sleep(2000);
			CEPP.ClickOnPutMethod.click();

			Thread.sleep(2000);
			CEPP.EnterServerURL.sendKeys(serverurl + "/pcm/workflow");
			Thread.sleep(2000);
			CEPP.ClickOnParams.click();
			Thread.sleep(2000);
			CEPP.ParamsKey.sendKeys("dd");
			Thread.sleep(2000);
			CEPP.ParamsValue.sendKeys("sss");
			Thread.sleep(2000);
			CEPP.ParamsDescription.sendKeys("ddd");
			Thread.sleep(2000);
			CEPP.ParamsRequiredCheckBox.click();
			Thread.sleep(2000);
			CEPP.ParamsDynamicCheckBox.click();
			Thread.sleep(2000);
			CEPP.ClickOnCreateButton.click();

			String title = CEPP.SuccessMsgPop.getText();
			System.out.println(title);
			if (title.equals("Proxy endpoint created successfully")) {
				child78.log(LogStatus.PASS, "Validation successful because we are getting message as ''" + title
						+ "'' when we verifying create api with proxy web method as PUT and Params with valid data'");
			} else {
				child78.log(LogStatus.FAIL, "Validation Unsuccessful because we are getting message as ''" + title
						+ "''instead of '' when we verifying create api with proxy web method as PUT and Params with valid data'");
			}

		} catch (Exception e) {
			child78.log(LogStatus.FAIL, e.fillInStackTrace());
		}
		_extent_report.endTest(child78);

	}

	@Test(priority = 80, enabled = true, description = "verifying create api with proxy web method as PUT and Params with ADD")
	public void verifyingCreateAPIwithProxyWebMethodasPUTandParamswithValidDataAndADD() throws Throwable {
		child79 = _extent_report.startTest("verifying create api with proxy web method as PUT and Params with ADD");
		child79.assignCategory("Create API Endpoint");
		try {
			Thread.sleep(3000);
			CEPP.MangeEndPointClick.click();
			Thread.sleep(2000);
			CEPP.CreateEndPointClick.click();
			Thread.sleep(2000);
			CEPP.EnterAPIName.sendKeys("Testapi" + api++);
			Thread.sleep(2000);
			CEPP.ClickOnDropdow.click();
			Thread.sleep(2000);
			CEPP.ClickOCreateAPIFromDropDown.click();
			Thread.sleep(2000);

			CEPP.ClickOnProxyWebMethod.click();
			Thread.sleep(2000);
			CEPP.ClickOnPutMethod.click();

			Thread.sleep(2000);
			CEPP.EnterServerURL.sendKeys(serverurl + "/pcm/workflow");
			Thread.sleep(2000);
			CEPP.ClickOnParams.click();
			Thread.sleep(2000);
			CEPP.ParamsKey.sendKeys("dd");
			Thread.sleep(2000);
			CEPP.ParamsValue.sendKeys("sss");
			Thread.sleep(2000);
			CEPP.ParamsDescription.sendKeys("ddd");
			Thread.sleep(2000);
			CEPP.ParamsRequiredCheckBox.click();
			Thread.sleep(2000);
			CEPP.ParamsDynamicCheckBox.click();
			Thread.sleep(2000);
			CEPP.ClickOnAddButton.click();
			Thread.sleep(2000);
			CEPP.ClickOnCreateButton.click();

			String title = CEPP.SuccessMsgPop.getText();
			System.out.println(title);
			if (title.equals("Proxy endpoint created successfully")) {
				child79.log(LogStatus.PASS, "Validation successful because we are getting message as ''" + title
						+ "'' when we verifying create api with proxy web method as PUT and Params with ADD'");
			} else {
				child79.log(LogStatus.FAIL, "Validation Unsuccessful because we are getting message as ''" + title
						+ "''instead of '' when we verifying create api with proxy web method as PUT and Params with ADD'");
			}

		} catch (Exception e) {
			child79.log(LogStatus.FAIL, e.fillInStackTrace());
		}
		_extent_report.endTest(child79);

	}

	@Test(priority = 81, enabled = true, description = "Verifying create api with proxy web method as DELETE and Params with valid data")
	public void verifyingCreateAPIwithProxyWebMethodasDELETEandParamswithValidData() throws Throwable {
		child80 = _extent_report
				.startTest("Verifying create api with proxy web method as DELETE and Params with valid data");
		child80.assignCategory("Create API Endpoint");
		try {
			Thread.sleep(3000);
			CEPP.MangeEndPointClick.click();
			Thread.sleep(2000);
			CEPP.CreateEndPointClick.click();
			Thread.sleep(2000);
			CEPP.EnterAPIName.sendKeys("Testapi" + api++);
			Thread.sleep(2000);
			CEPP.ClickOnDropdow.click();
			Thread.sleep(2000);
			CEPP.ClickOCreateAPIFromDropDown.click();
			Thread.sleep(2000);

			CEPP.ClickOnProxyWebMethod.click();
			Thread.sleep(2000);
			CEPP.ClickOnDeleteMethod.click();
			Thread.sleep(2000);

			CEPP.EnterServerURL.sendKeys(serverurl + "/pcm/workflow");
			Thread.sleep(2000);
			CEPP.ClickOnParams.click();
			Thread.sleep(2000);
			CEPP.ParamsKey.sendKeys("dd");
			Thread.sleep(2000);
			CEPP.ParamsValue.sendKeys("sss");
			Thread.sleep(2000);
			CEPP.ParamsDescription.sendKeys("ddd");
			Thread.sleep(2000);
			CEPP.ParamsRequiredCheckBox.click();
			Thread.sleep(2000);
			CEPP.ParamsDynamicCheckBox.click();
			Thread.sleep(2000);
			CEPP.ClickOnCreateButton.click();

			String title = CEPP.SuccessMsgPop.getText();
			System.out.println(title);
			if (title.equals("Proxy endpoint created successfully")) {
				child80.log(LogStatus.PASS, "Validation successful because we are getting message as ''" + title
						+ "'' when we verifying create api with proxy web method as DELETE and Params with valid data'");
			} else {
				child80.log(LogStatus.FAIL, "Validation Unsuccessful because we are getting message as ''" + title
						+ "''instead of '' when we verifying create api with proxy web method as DELETE and Params with valid data'");
			}

		} catch (Exception e) {
			child80.log(LogStatus.FAIL, e.fillInStackTrace());
		}
		_extent_report.endTest(child80);

	}

	@Test(priority = 82, enabled = true, description = "verifying create api with proxy web method as DELETE and Params with ADD")
	public void verifyingCreateAPIwithProxyWebMethodasDELETEandParamswithValidDataAndADD() throws Throwable {
		child81 = _extent_report.startTest("verifying create api with proxy web method as DELETE and Params with ADD");
		child81.assignCategory("Create Endpoint");
		try {
			Thread.sleep(3000);
			CEPP.MangeEndPointClick.click();
			Thread.sleep(2000);
			CEPP.CreateEndPointClick.click();
			Thread.sleep(2000);
			CEPP.EnterAPIName.sendKeys("Testapi" + api++);
			Thread.sleep(2000);
			CEPP.ClickOnDropdow.click();
			Thread.sleep(2000);
			CEPP.ClickOCreateAPIFromDropDown.click();
			Thread.sleep(2000);

			CEPP.ClickOnProxyWebMethod.click();
			Thread.sleep(2000);
			CEPP.ClickOnDeleteMethod.click();

			Thread.sleep(2000);
			CEPP.EnterServerURL.sendKeys(serverurl + "/pcm/workflow");
			Thread.sleep(2000);
			CEPP.ClickOnParams.click();
			Thread.sleep(2000);
			CEPP.ParamsKey.sendKeys("dd");
			Thread.sleep(2000);
			CEPP.ParamsValue.sendKeys("sss");
			Thread.sleep(2000);
			CEPP.ParamsDescription.sendKeys("ddd");
			Thread.sleep(2000);
			CEPP.ParamsRequiredCheckBox.click();
			Thread.sleep(2000);
			CEPP.ParamsDynamicCheckBox.click();
			Thread.sleep(2000);
			CEPP.ClickOnAddButton.click();
			Thread.sleep(2000);
			CEPP.ClickOnCreateButton.click();

			String title = CEPP.SuccessMsgPop.getText();
			System.out.println(title);
			if (title.equals("Proxy endpoint created successfully")) {
				child81.log(LogStatus.PASS, "Validation successful because we are getting message as ''" + title
						+ "'' when we verifying create api with proxy web method as DELETE and Params with ADD'");
			} else {
				child81.log(LogStatus.FAIL, "Validation Unsuccessful because we are getting message as ''" + title
						+ "''instead of '' when we verifying create api with proxy web method as DELETE and Params with ADD'");
			}

		} catch (Exception e) {
			child81.log(LogStatus.FAIL, e.fillInStackTrace());
		}
		_extent_report.endTest(child81);

	}

	@Test(priority = 83, enabled = true, description = "verifying create api with proxy web method as GET and Headers with valid data")
	public void VerifyingCreateApiwithProxyWebMethodasGETandHeaderswithValidData() throws Throwable {
		child82 = _extent_report
				.startTest("verifying create api with proxy web method as GET and Headers with valid data");
		child82.assignCategory("Create Endpoint");
		try {
			Thread.sleep(3000);
			CEPP.MangeEndPointClick.click();
			Thread.sleep(2000);
			CEPP.CreateEndPointClick.click();
			Thread.sleep(2000);
			CEPP.EnterAPIName.sendKeys("Testapi" + api++);
			Thread.sleep(2000);
			CEPP.ClickOnDropdow.click();
			Thread.sleep(2000);
			CEPP.ClickOCreateAPIFromDropDown.click();
			Thread.sleep(2000);

			CEPP.ClickOnProxyWebMethod.click();
			Thread.sleep(2000);
			CEPP.ClickOnGetMethod.click();

			Thread.sleep(2000);
			CEPP.EnterServerURL.sendKeys(serverurl + "/pcm/workflow");
			Thread.sleep(2000);
			CEPP.ClickOnHeaders.click();
			Thread.sleep(2000);
			CEPP.EnterHeadersKey.sendKeys("ttt");
			Thread.sleep(2000);
			CEPP.EnterHeadersValue.sendKeys("www");
			Thread.sleep(2000);
			CEPP.ClickOnHeadersRequiredCheckBox.sendKeys("xxx");
			Thread.sleep(2000);
			CEPP.HeadersRequiredCheckBox.click();
			Thread.sleep(2000);
			CEPP.HeadersDynamicCheckBox.click();
			Thread.sleep(2000);
			CEPP.ClickOnCreateButton.click();

			String title = CEPP.SuccessMsgPop.getText();
			System.out.println(title);
			if (title.equals("Proxy endpoint created successfully")) {
				child82.log(LogStatus.PASS, "Validation successful because we are getting message as ''" + title
						+ "'' when we verifying create api with proxy web method as GET and Headers with valid data'");
			} else {
				child82.log(LogStatus.FAIL, "Validation Unsuccessful because we are getting message as ''" + title
						+ "''instead of '' when we verifying create api with proxy web method as GET and Headers with valid data'");
			}

		} catch (Exception e) {
			child82.log(LogStatus.FAIL, e.fillInStackTrace());
		}
		_extent_report.endTest(child82);

	}

	@Test(priority = 84, enabled = true, description = "verifying create api with proxy web method as GET and Headers with ADD")
	public void VerifyingCreateApiwithProxyWebMethodasGETandHeaderswithADD() throws Throwable {
		child83 = _extent_report.startTest("verifying create api with proxy web method as GET and Headers with ADD");
		child83.assignCategory("Create Endpoint");
		try {
			Thread.sleep(3000);
			CEPP.MangeEndPointClick.click();
			Thread.sleep(2000);
			CEPP.CreateEndPointClick.click();
			Thread.sleep(2000);
			CEPP.EnterAPIName.sendKeys("Testapi" + api++);
			Thread.sleep(2000);
			CEPP.ClickOnDropdow.click();
			Thread.sleep(2000);
			CEPP.ClickOCreateAPIFromDropDown.click();
			Thread.sleep(2000);

			CEPP.ClickOnProxyWebMethod.click();
			Thread.sleep(2000);
			CEPP.ClickOnGetMethod.click();

			Thread.sleep(2000);
			CEPP.EnterServerURL.sendKeys(serverurl + "/pcm/workflow");
			Thread.sleep(2000);
			CEPP.ClickOnHeaders.click();
			Thread.sleep(2000);
			CEPP.EnterHeadersKey.sendKeys("ttt");
			Thread.sleep(2000);
			CEPP.EnterHeadersValue.sendKeys("www");
			Thread.sleep(2000);
			CEPP.ClickOnHeadersRequiredCheckBox.sendKeys("xxx");
			Thread.sleep(2000);
			CEPP.HeadersRequiredCheckBox.click();
			Thread.sleep(2000);
			CEPP.HeadersDynamicCheckBox.click();
			Thread.sleep(2000);
			CEPP.ClickOnAddButton.click();
			Thread.sleep(2000);
			CEPP.ClickOnCreateButton.click();

			String title = CEPP.SuccessMsgPop.getText();
			System.out.println(title);
			if (title.equals("Proxy endpoint created successfully")) {
				child83.log(LogStatus.PASS, "Validation successful because we are getting message as ''" + title
						+ "'' when we verifying create api with proxy web method as GET and Headers with ADD'");
			} else {
				child83.log(LogStatus.FAIL, "Validation Unsuccessful because we are getting message as ''" + title
						+ "''instead of '' when we verifying create api with proxy web method as GET and Headers with ADD'");
			}

		} catch (Exception e) {
			child83.log(LogStatus.FAIL, e.fillInStackTrace());
		}
		_extent_report.endTest(child83);

	}

	@Test(priority = 85, enabled = true, description = "verifying create api with proxy web method as POST and Headers with valid data")
	public void VerifyingCreateApiwithProxyWebMethodasPOSTandHeaderswithValidData() throws Throwable {
		child84 = _extent_report
				.startTest("verifying create api with proxy web method as POST and Headers with valid data");
		child84.assignCategory("Create Endpoint");
		try {
			Thread.sleep(3000);
			CEPP.MangeEndPointClick.click();
			Thread.sleep(2000);
			CEPP.CreateEndPointClick.click();
			Thread.sleep(2000);
			CEPP.EnterAPIName.sendKeys("Testapi" + api++);
			Thread.sleep(2000);
			CEPP.ClickOnDropdow.click();
			Thread.sleep(2000);
			CEPP.ClickOCreateAPIFromDropDown.click();
			Thread.sleep(2000);

			CEPP.ClickOnProxyWebMethod.click();
			Thread.sleep(2000);
			CEPP.ClickOnPostMethod.click();

			Thread.sleep(2000);
			CEPP.EnterServerURL.sendKeys(serverurl + "/pcm/workflow");
			Thread.sleep(2000);
			CEPP.ClickOnHeaders.click();
			Thread.sleep(2000);
			CEPP.EnterHeadersKey.sendKeys("ttt");
			Thread.sleep(2000);
			CEPP.EnterHeadersValue.sendKeys("www");
			Thread.sleep(2000);
			CEPP.ClickOnHeadersRequiredCheckBox.sendKeys("xxx");
			Thread.sleep(2000);
			CEPP.HeadersRequiredCheckBox.click();
			Thread.sleep(2000);
			CEPP.HeadersDynamicCheckBox.click();
			Thread.sleep(2000);
			CEPP.ClickOnCreateButton.click();

			String title = CEPP.SuccessMsgPop.getText();
			System.out.println(title);
			if (title.equals("Proxy endpoint created successfully")) {
				child84.log(LogStatus.PASS, "Validation successful because we are getting message as ''" + title
						+ "'' when we verifying create api with proxy web method as POST and Headers with valid data'");
			} else {
				child84.log(LogStatus.FAIL, "Validation Unsuccessful because we are getting message as ''" + title
						+ "''instead of '' when we verifying create api with proxy web method as POST and Headers with valid data'");
			}

		} catch (Exception e) {
			child84.log(LogStatus.FAIL, e.fillInStackTrace());
		}
		_extent_report.endTest(child84);

	}

	@Test(priority = 86, enabled = true, description = "verifying create api with proxy web method as POST and Headers  with ADD")
	public void VerifyingCreateApiwithProxyWebMethodasPOSTandHeaderswithADD() throws Throwable {
		child85 = _extent_report.startTest("verifying create api with proxy web method as POST and Headers  with ADD");
		child85.assignCategory("Create Endpoint");
		try {
			Thread.sleep(3000);
			CEPP.MangeEndPointClick.click();
			Thread.sleep(2000);
			CEPP.CreateEndPointClick.click();
			Thread.sleep(2000);
			CEPP.EnterAPIName.sendKeys("Testapi" + api++);
			Thread.sleep(2000);
			CEPP.ClickOnDropdow.click();
			Thread.sleep(2000);
			CEPP.ClickOCreateAPIFromDropDown.click();
			Thread.sleep(2000);

			CEPP.ClickOnProxyWebMethod.click();
			Thread.sleep(2000);
			CEPP.ClickOnPostMethod.click();

			Thread.sleep(2000);
			CEPP.EnterServerURL.sendKeys(serverurl + "/pcm/workflow");
			Thread.sleep(2000);
			CEPP.ClickOnHeaders.click();
			Thread.sleep(2000);
			CEPP.EnterHeadersKey.sendKeys("ttt");
			Thread.sleep(2000);
			CEPP.EnterHeadersValue.sendKeys("www");
			Thread.sleep(2000);
			CEPP.ClickOnHeadersRequiredCheckBox.sendKeys("xxx");
			Thread.sleep(2000);
			CEPP.HeadersRequiredCheckBox.click();
			Thread.sleep(2000);
			CEPP.HeadersDynamicCheckBox.click();
			Thread.sleep(2000);
			CEPP.ClickOnAddButton.click();
			Thread.sleep(2000);
			CEPP.ClickOnCreateButton.click();

			String title = CEPP.SuccessMsgPop.getText();
			System.out.println(title);
			if (title.equals("Proxy endpoint created successfully")) {
				child85.log(LogStatus.PASS, "Validation successful because we are getting message as ''" + title
						+ "'' when we verifying create api with proxy web method as GET and Headers with ADD'");
			} else {
				child85.log(LogStatus.FAIL, "Validation Unsuccessful because we are getting message as ''" + title
						+ "''instead of '' when we verifying create api with proxy web method as GET and Headers with ADD'");
			}

		} catch (Exception e) {
			child85.log(LogStatus.FAIL, e.fillInStackTrace());
		}
		_extent_report.endTest(child85);

	}

	@Test(priority = 87, enabled = true, description = "verifying create api with proxy web method as PUT and Headers with valid data")
	public void VerifyingCreateApiwithProxyWebMethodasPUTandHeaderswithValidData() throws Throwable {
		child86 = _extent_report
				.startTest("verifying create api with proxy web method as PUT and Headers with valid data");
		child86.assignCategory("Create Endpoint");
		try {
			Thread.sleep(3000);
			CEPP.MangeEndPointClick.click();
			Thread.sleep(2000);
			CEPP.CreateEndPointClick.click();
			Thread.sleep(2000);
			CEPP.EnterAPIName.sendKeys("Testapi" + api++);
			Thread.sleep(2000);
			CEPP.ClickOnDropdow.click();
			Thread.sleep(2000);
			CEPP.ClickOCreateAPIFromDropDown.click();
			Thread.sleep(2000);
			CEPP.ClickOnProxyWebMethod.click();
			Thread.sleep(2000);
			CEPP.ClickOnPutMethod.click();

			Thread.sleep(2000);
			CEPP.EnterServerURL.sendKeys(serverurl + "/pcm/workflow");
			Thread.sleep(2000);
			CEPP.ClickOnHeaders.click();
			Thread.sleep(2000);
			CEPP.EnterHeadersKey.sendKeys("ttt");
			Thread.sleep(2000);
			CEPP.EnterHeadersValue.sendKeys("www");
			Thread.sleep(2000);
			CEPP.ClickOnHeadersRequiredCheckBox.sendKeys("xxx");
			Thread.sleep(2000);
			CEPP.HeadersRequiredCheckBox.click();
			Thread.sleep(2000);
			CEPP.HeadersDynamicCheckBox.click();
			Thread.sleep(2000);
			CEPP.ClickOnCreateButton.click();

			String title = CEPP.SuccessMsgPop.getText();
			System.out.println(title);
			if (title.equals("Proxy endpoint created successfully")) {
				child86.log(LogStatus.PASS, "Validation successful because we are getting message as ''" + title
						+ "'' when we verifying create api with proxy web method as PUT and Headers with valid data'");
			} else {
				child86.log(LogStatus.FAIL, "Validation Unsuccessful because we are getting message as ''" + title
						+ "''instead of '' when we verifying create api with proxy web method as PUT and Headers with valid data'");
			}

		} catch (Exception e) {
			child86.log(LogStatus.FAIL, e.fillInStackTrace());
		}
		_extent_report.endTest(child86);

	}

	@Test(priority = 88, enabled = true, description = "verifying create api with proxy web method as PUT and Headers  with ADD")
	public void VerifyingCreateApiwithProxyWebMethodasPUTandHeaderswithADD() throws Throwable {
		child87 = _extent_report.startTest("verifying create api with proxy web method as PUT and Headers with ADD");
		child87.assignCategory("Create Endpoint");
		try {
			Thread.sleep(3000);
			CEPP.MangeEndPointClick.click();
			Thread.sleep(2000);
			CEPP.CreateEndPointClick.click();
			Thread.sleep(2000);
			CEPP.EnterAPIName.sendKeys("Testapi" + api++);
			Thread.sleep(2000);
			CEPP.ClickOnDropdow.click();
			Thread.sleep(2000);
			CEPP.ClickOCreateAPIFromDropDown.click();
			Thread.sleep(2000);

			CEPP.ClickOnProxyWebMethod.click();
			Thread.sleep(2000);
			CEPP.ClickOnPutMethod.click();

			Thread.sleep(2000);
			CEPP.EnterServerURL.sendKeys(serverurl + "/pcm/workflow");
			Thread.sleep(2000);
			CEPP.ClickOnHeaders.click();
			Thread.sleep(2000);
			CEPP.EnterHeadersKey.sendKeys("ttt");
			Thread.sleep(2000);
			CEPP.EnterHeadersValue.sendKeys("www");
			Thread.sleep(2000);
			CEPP.ClickOnHeadersRequiredCheckBox.sendKeys("xxx");
			Thread.sleep(2000);
			CEPP.HeadersRequiredCheckBox.click();
			Thread.sleep(2000);
			CEPP.HeadersDynamicCheckBox.click();
			Thread.sleep(2000);
			CEPP.ClickOnAddButton.click();
			Thread.sleep(2000);
			CEPP.ClickOnCreateButton.click();

			String title = CEPP.SuccessMsgPop.getText();
			System.out.println(title);
			if (title.equals("Proxy endpoint created successfully")) {
				child87.log(LogStatus.PASS, "Validation successful because we are getting message as ''" + title
						+ "'' when we verifying create api with proxy web method as PUT and Headers with ADD'");
			} else {
				child87.log(LogStatus.FAIL, "Validation Unsuccessful because we are getting message as ''" + title
						+ "''instead of '' when we verifying create api with proxy web method as PUT and Headers with ADD'");
			}

		} catch (Exception e) {
			child87.log(LogStatus.FAIL, e.fillInStackTrace());
		}
		_extent_report.endTest(child87);

	}

	@Test(priority = 89, enabled = true, description = "verifying create api with proxy web method as DELETE and Headers with valid data")
	public void VerifyingCreateApiwithProxyWebMethodasDELETEandHeaderswithValidData() throws Throwable {
		child88 = _extent_report
				.startTest("verifying create api with proxy web method as DELETE and Headers with valid data");
		child88.assignCategory("Create Endpoint");
		try {
			Thread.sleep(3000);
			CEPP.MangeEndPointClick.click();
			Thread.sleep(2000);
			CEPP.CreateEndPointClick.click();
			Thread.sleep(2000);
			CEPP.EnterAPIName.sendKeys("Testapi" + api++);
			Thread.sleep(2000);
			CEPP.ClickOnDropdow.click();
			Thread.sleep(2000);
			CEPP.ClickOCreateAPIFromDropDown.click();
			Thread.sleep(2000);

			CEPP.ClickOnProxyWebMethod.click();
			Thread.sleep(2000);
			CEPP.ClickOnDeleteMethod.click();

			Thread.sleep(2000);
			CEPP.EnterServerURL.sendKeys(serverurl + "/pcm/workflow");
			Thread.sleep(2000);
			CEPP.ClickOnHeaders.click();
			Thread.sleep(2000);
			CEPP.EnterHeadersKey.sendKeys("ttt");
			Thread.sleep(2000);
			CEPP.EnterHeadersValue.sendKeys("www");
			Thread.sleep(2000);
			CEPP.ClickOnHeadersRequiredCheckBox.sendKeys("xxx");
			Thread.sleep(2000);
			CEPP.HeadersRequiredCheckBox.click();
			Thread.sleep(2000);
			CEPP.HeadersDynamicCheckBox.click();
			Thread.sleep(2000);
			CEPP.ClickOnCreateButton.click();

			String title = CEPP.SuccessMsgPop.getText();
			System.out.println(title);
			if (title.equals("Proxy endpoint created successfully")) {
				child88.log(LogStatus.PASS, "Validation successful because we are getting message as ''" + title
						+ "'' when we verifying create api with proxy web method as DELETE and Headers with valid data'");
			} else {
				child88.log(LogStatus.FAIL, "Validation Unsuccessful because we are getting message as ''" + title
						+ "''instead of '' when we verifying create api with proxy web method as DELETE and Headers with valid data'");
			}

		} catch (Exception e) {
			child88.log(LogStatus.FAIL, e.fillInStackTrace());
		}
		_extent_report.endTest(child88);

	}

	@Test(priority = 90, enabled = true, description = "verifying create api with proxy web method as Delete and Headers  with ADD")
	public void VerifyingCreateApiwithProxyWebMethodasDELETEandHeaderswithADD() throws Throwable {
		child89 = _extent_report.startTest("verifying create api with proxy web method as Delete and Headers  with ADD");
		child89.assignCategory("Create Endpoint");
		try {
			Thread.sleep(3000);
			CEPP.MangeEndPointClick.click();
			Thread.sleep(2000);
			CEPP.CreateEndPointClick.click();
			Thread.sleep(2000);
			CEPP.EnterAPIName.sendKeys("Testapi" + api++);
			Thread.sleep(2000);
			CEPP.ClickOnDropdow.click();
			Thread.sleep(2000);
			CEPP.ClickOCreateAPIFromDropDown.click();
			Thread.sleep(2000);

			CEPP.ClickOnProxyWebMethod.click();
			Thread.sleep(2000);
			CEPP.ClickOnDeleteMethod.click();

			Thread.sleep(2000);
			CEPP.EnterServerURL.sendKeys(serverurl + "/pcm/workflow");
			Thread.sleep(2000);
			CEPP.ClickOnHeaders.click();
			Thread.sleep(2000);
			CEPP.ClickOnHeadersAddButton.click();
			Thread.sleep(2000);
			CEPP.EnterHeadersKey.sendKeys("ttt");
			Thread.sleep(2000);
			CEPP.EnterHeadersValue.sendKeys("www");
			Thread.sleep(2000);
			CEPP.ClickOnHeadersRequiredCheckBox.sendKeys("xxx");
			Thread.sleep(2000);
			CEPP.HeadersRequiredCheckBox.click();
			Thread.sleep(2000);
			CEPP.HeadersDynamicCheckBox.click();
			Thread.sleep(2000);
			CEPP.ClickOnAddButton.click();
			Thread.sleep(2000);
			CEPP.ClickOnCreateButton.click();

			String title = CEPP.SuccessMsgPop.getText();
			System.out.println(title);
			if (title.equals("Proxy endpoint created successfully")) {
				child89.log(LogStatus.PASS, "Validation successful because we are getting message as ''" + title
						+ "'' when we verifying create api with proxy web method as DELETE and Headers with ADD'");
			} else {
				child89.log(LogStatus.FAIL, "Validation Unsuccessful because we are getting message as ''" + title
						+ "''instead of '' when we verifying create api with proxy web method as DELETE and Headers with ADD'");
			}

		} catch (Exception e) {
			child89.log(LogStatus.FAIL, e.fillInStackTrace());
		}
		_extent_report.endTest(child89);

	}

	@Test(priority = 91, enabled = true, description = "Verifying create api with only proxy auth and server auth")
	public void VerifyingCreateApiwithOnlyProxyAuthandServerAuth() throws Throwable {
		child90 = _extent_report.startTest("Verifying create api with only proxy auth and server auth");
		child90.assignCategory("Create Endpoint");
		try {
			Thread.sleep(3000);
			CEPP.MangeEndPointClick.click();
			Thread.sleep(2000);
			CEPP.CreateEndPointClick.click();
			Thread.sleep(2000);
			CEPP.EnterAPIName.sendKeys("Testapi" + api++);
			Thread.sleep(2000);
			CEPP.ClickOnDropdow.click();
			Thread.sleep(2000);
			CEPP.ClickOCreateAPIFromDropDown.click();
			Thread.sleep(2000);

			CEPP.ClickOnProxyWebMethod.click();
			Thread.sleep(2000);
			CEPP.ClickOnGetMethod.click();

			Thread.sleep(2000);
			CEPP.EnterServerURL.sendKeys(serverurl + "/pcm/workflow");
			Thread.sleep(2000);
			CEPP.ClickOnProxyAuthorization.click();
			Thread.sleep(2000);
			CEPP.ClickOnAuthDropDown.click();
			Thread.sleep(2000);
			CEPP.SelectNoAuth.click();
			Thread.sleep(2000);
			CEPP.ClickOnServerAuthorization.click();
			Thread.sleep(2000);
			CEPP.ClickOnAuthDropDown.click();
			Thread.sleep(2000);
			CEPP.SelectNoAuth.click();
			Thread.sleep(2000);
			CEPP.ClickOnCreateButton.click();

			String title = CEPP.SuccessMsgPop.getText();
			System.out.println(title);
			if (title.equals("Proxy endpoint created successfully")) {
				child90.log(LogStatus.PASS, "Validation successful because we are getting message as ''" + title
						+ "'' when we 	verifying create api with only proxy auth and server auth'");
			} else {
				child90.log(LogStatus.FAIL, "Validation Unsuccessful because we are getting message as ''" + title
						+ "''instead of '' when we 	verifying create api with only proxy auth and server auth'");
			}

		} catch (Exception e) {
			child90.log(LogStatus.FAIL, e.fillInStackTrace());
		}
		_extent_report.endTest(child90);

	}

	@Test(priority = 92, enabled = true, description = "Verifying create api with only proxy auth and Params")
	public void VerifyingCreateApiwithOnlyProxyAuthandParams() throws Throwable {
		child91 = _extent_report.startTest("Verifying create api with only proxy auth and Params");
		child91.assignCategory("Create Endpoint");
		try {
			Thread.sleep(3000);
			CEPP.MangeEndPointClick.click();
			Thread.sleep(2000);
			CEPP.CreateEndPointClick.click();
			Thread.sleep(2000);
			CEPP.EnterAPIName.sendKeys("Testapi" + api++);
			Thread.sleep(2000);
			CEPP.ClickOnDropdow.click();
			Thread.sleep(2000);
			CEPP.ClickOCreateAPIFromDropDown.click();
			Thread.sleep(2000);

			CEPP.ClickOnProxyWebMethod.click();
			Thread.sleep(2000);
			CEPP.ClickOnGetMethod.click();

			Thread.sleep(2000);
			CEPP.EnterServerURL.sendKeys(serverurl + "/pcm/workflow");
			Thread.sleep(2000);
			CEPP.ClickOnProxyAuthorization.click();
			Thread.sleep(2000);
			CEPP.ClickOnAuthDropDown.click();
			Thread.sleep(2000);
			CEPP.SelectNoAuth.click();
			Thread.sleep(2000);
			CEPP.ClickOnParams.click();
			Thread.sleep(2000);
			CEPP.ParamsKey.sendKeys("dd");
			Thread.sleep(2000);
			CEPP.ParamsValue.sendKeys("sss");
			Thread.sleep(2000);
			CEPP.ParamsDescription.sendKeys("ddd");
			Thread.sleep(2000);
			CEPP.ParamsRequiredCheckBox.click();
			Thread.sleep(2000);
			CEPP.ParamsDynamicCheckBox.click();
			Thread.sleep(2000);
			CEPP.ClickOnCreateButton.click();

			String title = CEPP.SuccessMsgPop.getText();
			System.out.println(title);
			if (title.equals("Proxy endpoint created successfully")) {
				child91.log(LogStatus.PASS, "Validation successful because we are getting message as ''" + title
						+ "'' when we 	verifying create api with only proxy auth and Params'");
			} else {
				child91.log(LogStatus.FAIL, "Validation Unsuccessful because we are getting message as ''" + title
						+ "''instead of '' when we 	verifying create api with only proxy auth and Params'");
			}

		} catch (Exception e) {
			child91.log(LogStatus.FAIL, e.fillInStackTrace());
		}
		_extent_report.endTest(child91);

	}

	@Test(priority = 93, enabled = true, description = "Verifying create api with only proxy auth and Headers")
	public void VerifyingCreateApiwithOnlyProxyAuthandHeaders() throws Throwable {
		child92 = _extent_report.startTest("verifying create api with only proxy auth and Headers");
		child92.assignCategory("Create Endpoint");
		try {
			Thread.sleep(3000);
			CEPP.MangeEndPointClick.click();
			Thread.sleep(2000);
			CEPP.CreateEndPointClick.click();
			Thread.sleep(2000);
			CEPP.EnterAPIName.sendKeys("Testapi" + api++);
			Thread.sleep(2000);
			CEPP.ClickOnDropdow.click();
			Thread.sleep(2000);
			CEPP.ClickOCreateAPIFromDropDown.click();
			Thread.sleep(2000);

			CEPP.ClickOnProxyWebMethod.click();
			Thread.sleep(2000);
			CEPP.ClickOnGetMethod.click();

			Thread.sleep(2000);
			CEPP.EnterServerURL.sendKeys(serverurl + "/pcm/workflow");
			Thread.sleep(2000);
			CEPP.ClickOnProxyAuthorization.click();
			Thread.sleep(2000);
			CEPP.ClickOnAuthDropDown.click();
			Thread.sleep(2000);
			CEPP.SelectNoAuth.click();
			Thread.sleep(2000);
			CEPP.ClickOnHeaders.click();
			Thread.sleep(2000);
			CEPP.ClickOnHeaders.click();
			Thread.sleep(2000);
			CEPP.EnterHeadersKey.sendKeys("FGH");
			Thread.sleep(2000);
			CEPP.EnterHeadersValue.sendKeys("GG");
			Thread.sleep(2000);
			CEPP.EnterHeadersDescription.sendKeys("GGG");
			Thread.sleep(2000);
			CEPP.HeadersRequiredCheckBox.click();
			Thread.sleep(2000);
			CEPP.HeadersDynamicCheckBox.click();
			Thread.sleep(2000);
			CEPP.ClickOnCreateButton.click();

			String title = CEPP.SuccessMsgPop.getText();
			System.out.println(title);
			if (title.equals("Proxy endpoint created successfully")) {
				child92.log(LogStatus.PASS, "Validation successful because we are getting message as ''" + title
						+ "'' when we verifying create api with only proxy auth and Headers'");
			} else {
				child92.log(LogStatus.FAIL, "Validation Unsuccessful because we are getting message as ''" + title
						+ "''instead of '' when we verifying create api with only proxy auth and Headers'");
			}

		} catch (Exception e) {
			child92.log(LogStatus.FAIL, e.fillInStackTrace());
		}
		_extent_report.endTest(child92);

	}

	@Test(priority = 94, enabled = true, description = "Verifying create api with only proxy auth and Body")
	public void VerifyingCreateApiwithOnlyProxyAuthandBody() throws Throwable {
		child93 = _extent_report.startTest("verifying create api with only proxy auth and Body");
		child93.assignCategory("Create Endpoint");
		try {
			Thread.sleep(3000);
			CEPP.MangeEndPointClick.click();
			Thread.sleep(2000);
			CEPP.CreateEndPointClick.click();
			Thread.sleep(2000);
			CEPP.EnterAPIName.sendKeys("Testapi" + api++);
			Thread.sleep(2000);
			CEPP.ClickOnDropdow.click();
			Thread.sleep(2000);
			CEPP.ClickOCreateAPIFromDropDown.click();
			Thread.sleep(2000);

			CEPP.ClickOnProxyWebMethod.click();
			Thread.sleep(2000);
			CEPP.ClickOnPutMethod.click();

			Thread.sleep(2000);
			CEPP.EnterServerURL.sendKeys(serverurl + "/pcm/workflow");
			Thread.sleep(2000);
			CEPP.ClickOnProxyAuthorization.click();
			Thread.sleep(2000);
			CEPP.ClickOnAuthDropDown.click();
			Thread.sleep(2000);
			CEPP.SelectNoAuth.click();
			Thread.sleep(2000);
			CEPP.ClickonBody.click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//textarea")).sendKeys(Keys.chord(Keys.CONTROL, "a"),
					"{\r\n" + "\"addressLine1\": \"abc\",\r\n" + "\"addressLine2\": \"def\",\r\n"
							+ "\"createMailBoxInSI\": true,\r\n" + "\"customProfileName\": \"\",\r\n"
							+ "\"deleteAfterCollection\": true,\r\n" + "\"emailId\": \"tv100@gmail.com\",\r\n"
							+ "\"filter\": \"\",\r\n" + "\"ipWhiteList\": \"\",\r\n" + "\"hubInfo\": true,\r\n"
							+ "\"inMailBox\": \"/in\",\r\n" + "\"like\": true,\r\n" + "\"onlyPCM\": true,\r\n"
							+ "\"outMailBox\": \"/out\",\r\n" + "\"pemIdentifier\": \"\",\r\n"
							+ "\"pgpInfo\": \"test\",\r\n" + "\"phone\": \"1234564561\",\r\n" + "\"pkId\": \"\",\r\n"
							+ "\"poolingInterval\": \"ON\",\r\n" + "\"profileId\": \"testmail200\",\r\n"
							+ "\"profileName\": \"testmail200\",\r\n" + "\"protocol\": \"Mailbox\",\r\n"
							+ "\"status\": true\r\n" + "}");

			CEPP.ClickOnCreateButton.click();

			String title = CEPP.SuccessMsgPop.getText();
			System.out.println(title);
			if (title.equals("Proxy endpoint created successfully")) {
				child93.log(LogStatus.PASS, "Validation successful because we are getting message as ''" + title
						+ "'' when we verifying create api with only proxy auth and Body'");
			} else {
				child93.log(LogStatus.FAIL, "Validation Unsuccessful because we are getting message as ''" + title
						+ "''instead of '' when we verifying create api with only proxy auth and Body'");
			}

		} catch (Exception e) {
			child93.log(LogStatus.FAIL, e.fillInStackTrace());
		}
		_extent_report.endTest(child93);

	}

	@Test(priority = 95, enabled = true, description = "verifying create api with only server auth and Params")
	public void VerifyingCreateApiwithOnlyServerAuthandParams() throws Throwable {
		child94 = _extent_report.startTest("verifying create api with only server auth and Params");
		child94.assignCategory("Create Endpoint");
		try {
			Thread.sleep(3000);
			CEPP.MangeEndPointClick.click();
			Thread.sleep(2000);
			CEPP.CreateEndPointClick.click();
			Thread.sleep(2000);
			CEPP.EnterAPIName.sendKeys("Testapi" + api++);
			Thread.sleep(2000);
			CEPP.ClickOnDropdow.click();
			Thread.sleep(2000);
			CEPP.ClickOCreateAPIFromDropDown.click();
			Thread.sleep(2000);


			CEPP.ClickOnProxyWebMethod.click();
			Thread.sleep(2000);
			CEPP.ClickOnPutMethod.click();

			Thread.sleep(2000);
			CEPP.EnterServerURL.sendKeys(serverurl + "/pcm/workflow");
			Thread.sleep(2000);
			CEPP.ClickOnServerAuthorization.click();
			Thread.sleep(2000);
			CEPP.ClickOnAuthDropDown.click();
			Thread.sleep(2000);
			CEPP.SelectNoAuth.click();

			Thread.sleep(2000);
			CEPP.ClickOnParams.click();
			Thread.sleep(2000);
			CEPP.ParamsKey.sendKeys("dd");
			Thread.sleep(2000);
			CEPP.ParamsValue.sendKeys("sss");
			Thread.sleep(2000);
			CEPP.ParamsDescription.sendKeys("ddd");
			Thread.sleep(2000);
			CEPP.ParamsRequiredCheckBox.click();
			Thread.sleep(2000);
			CEPP.ParamsDynamicCheckBox.click();
			Thread.sleep(2000);
			CEPP.ClickOnCreateButton.click();

			String title = CEPP.SuccessMsgPop.getText();
			System.out.println(title);
			if (title.equals("Proxy endpoint created successfully")) {
				child94.log(LogStatus.PASS, "Validation successful because we are getting message as ''" + title
						+ "'' when we 	verifying create api with only server auth and Params'");
			} else {
				child94.log(LogStatus.FAIL, "Validation Unsuccessful because we are getting message as ''" + title
						+ "''instead of '' when we verifying create api with only server auth and Params'");
			}

		} catch (Exception e) {
			child94.log(LogStatus.FAIL, e.fillInStackTrace());
		}
		_extent_report.endTest(child94);

	}

	@Test(priority = 96, enabled = true, description = "verifying create api with only server auth and Headers")
	public void VerifyingCreateApiwithOnlyServerAuthandHeaders() throws Throwable {
		child95 = _extent_report.startTest("verifying create api with only server auth and Headers");
		child95.assignCategory("Create Endpoint");
		try {
			Thread.sleep(3000);
			CEPP.MangeEndPointClick.click();
			Thread.sleep(2000);
			CEPP.CreateEndPointClick.click();
			Thread.sleep(2000);
			CEPP.EnterAPIName.sendKeys("Testapi" + api++);
			Thread.sleep(2000);
			CEPP.ClickOnDropdow.click();
			Thread.sleep(2000);
			CEPP.ClickOCreateAPIFromDropDown.click();
			Thread.sleep(2000);

			CEPP.ClickOnProxyWebMethod.click();
			Thread.sleep(2000);
			CEPP.ClickOnPutMethod.click();

			Thread.sleep(2000);
			CEPP.EnterServerURL.sendKeys(serverurl + "/pcm/workflow");
			Thread.sleep(2000);
			CEPP.ClickOnServerAuthorization.click();
			Thread.sleep(2000);
			CEPP.ClickOnAuthDropDown.click();
			Thread.sleep(2000);
			CEPP.SelectBasicAuth.click();
			Thread.sleep(2000);
			CEPP.ServerAuthorizationUserName.sendKeys("cm_user");
			Thread.sleep(2000);
			CEPP.ServerAuthorizationPassword.sendKeys("password");

			Thread.sleep(2000);
			CEPP.ClickOnHeaders.click();
			Thread.sleep(2000);
			CEPP.EnterHeadersKey.sendKeys("FGH");
			Thread.sleep(2000);
			CEPP.EnterHeadersValue.sendKeys("GG");
			Thread.sleep(2000);
			CEPP.EnterHeadersDescription.sendKeys("GGG");
			Thread.sleep(2000);
			CEPP.HeadersRequiredCheckBox.click();
			Thread.sleep(2000);
			CEPP.HeadersDynamicCheckBox.click();
			Thread.sleep(2000);
			CEPP.ClickOnCreateButton.click();

			String title = CEPP.SuccessMsgPop.getText();
			System.out.println(title);
			if (title.equals("Proxy endpoint created successfully")) {
				child95.log(LogStatus.PASS, "Validation successful because we are getting message as ''" + title
						+ "'' when we verifying create api with only server auth and Params'");
			} else {
				child95.log(LogStatus.FAIL, "Validation Unsuccessful because we are getting message as ''" + title
						+ "''instead of '' when we verifying create api with only server auth and Params'");
			}

		} catch (Exception e) {
			child95.log(LogStatus.FAIL, e.fillInStackTrace());
		}
		_extent_report.endTest(child95);

	}

	@Test(priority = 97, enabled = true, description = "verifying create api with only server auth and Body")
	public void VerifyingCreatApiwithOnlyServerAuthandBody() throws Throwable {
		child96 = _extent_report.startTest("verifying create api with only server auth and Body");
		child96.assignCategory("Create Endpoint");
		try {
			Thread.sleep(3000);
			CEPP.MangeEndPointClick.click();
			Thread.sleep(2000);
			CEPP.CreateEndPointClick.click();
			Thread.sleep(2000);
			CEPP.EnterAPIName.sendKeys("Testapi" + api++);
			Thread.sleep(2000);
			CEPP.ClickOnDropdow.click();
			Thread.sleep(2000);
			CEPP.ClickOCreateAPIFromDropDown.click();
			Thread.sleep(2000);

			CEPP.ClickOnProxyWebMethod.click();
			Thread.sleep(2000);
			CEPP.ClickOnPostMethod.click();

			Thread.sleep(2000);
			CEPP.EnterServerURL.sendKeys(serverurl + "/pcm/workflow");
			Thread.sleep(2000);
			CEPP.ClickOnServerAuthorization.click();
			Thread.sleep(2000);
			CEPP.ClickOnAuthDropDown.click();
			Thread.sleep(2000);
			CEPP.SelectBasicAuth.click();
			Thread.sleep(2000);
			CEPP.ServerAuthorizationUserName.sendKeys("cm_user");
			Thread.sleep(2000);
			CEPP.ServerAuthorizationPassword.sendKeys("password");
			Thread.sleep(2000);
			CEPP.ClickonBody.click();

			driver.findElement(By.xpath("//textarea")).sendKeys(Keys.chord(Keys.CONTROL, "a"),
					"{\r\n" + "\"addressLine1\": \"abc\",\r\n" + "\"addressLine2\": \"def\",\r\n"
							+ "\"createMailBoxInSI\": true,\r\n" + "\"customProfileName\": \"\",\r\n"
							+ "\"deleteAfterCollection\": true,\r\n" + "\"emailId\": \"tv100@gmail.com\",\r\n"
							+ "\"filter\": \"\",\r\n" + "\"ipWhiteList\": \"\",\r\n" + "\"hubInfo\": true,\r\n"
							+ "\"inMailBox\": \"/in\",\r\n" + "\"like\": true,\r\n" + "\"onlyPCM\": true,\r\n"
							+ "\"outMailBox\": \"/out\",\r\n" + "\"pemIdentifier\": \"\",\r\n"
							+ "\"pgpInfo\": \"test\",\r\n" + "\"phone\": \"1234564561\",\r\n" + "\"pkId\": \"\",\r\n"
							+ "\"poolingInterval\": \"ON\",\r\n" + "\"profileId\": \"testmail200\",\r\n"
							+ "\"profileName\": \"testmail200\",\r\n" + "\"protocol\": \"Mailbox\",\r\n"
							+ "\"status\": true\r\n" + "}");

			CEPP.ClickOnCreateButton.click();

			String title = CEPP.SuccessMsgPop.getText();
			System.out.println(title);
			if (title.equals("Proxy endpoint created successfully")) {
				child96.log(LogStatus.PASS, "Validation successful because we are getting message as ''" + title
						+ "'' when we verifying create api with only server auth and Body'");
			} else {
				child96.log(LogStatus.FAIL, "Validation Unsuccessful because we are getting message as ''" + title
						+ "''instead of '' when we verifying create api with only server auth and Body'");
			}

		} catch (Exception e) {
			child96.log(LogStatus.FAIL, e.fillInStackTrace());
		}
		_extent_report.endTest(child96);

	}

	@Test(priority = 98, enabled = true, description = "verifying create api with only params and headers")
	public void VerifyingCreateApiwithOnlyParamsandHeaders() throws Throwable {
		child97 = _extent_report.startTest("verifying create api with only params and headers");
		child97.assignCategory("Create Endpoint");
		try {

			Thread.sleep(3000);
			CEPP.MangeEndPointClick.click();
			Thread.sleep(2000);
			CEPP.CreateEndPointClick.click();
			Thread.sleep(2000);
			CEPP.EnterAPIName.sendKeys("Testapi" + api++);
			Thread.sleep(2000);
			CEPP.ClickOnDropdow.click();
			Thread.sleep(2000);
			CEPP.ClickOCreateAPIFromDropDown.click();
			Thread.sleep(2000);

			CEPP.ClickOnProxyWebMethod.click();
			Thread.sleep(2000);
			CEPP.ClickOnGetMethod.click();

			Thread.sleep(2000);
			CEPP.EnterServerURL.sendKeys(serverurl + "/pcm/workflow");

			Thread.sleep(2000);
			CEPP.ClickOnParams.click();
			Thread.sleep(2000);
			CEPP.ParamsKey.sendKeys("dd");
			Thread.sleep(2000);
			CEPP.ParamsValue.sendKeys("sss");
			Thread.sleep(2000);
			CEPP.ParamsDescription.sendKeys("ddd");
			Thread.sleep(2000);
			CEPP.ParamsRequiredCheckBox.click();
			Thread.sleep(2000);
			CEPP.ParamsDynamicCheckBox.click();

			Thread.sleep(2000);
			CEPP.ClickOnHeaders.click();
			Thread.sleep(2000);
			CEPP.EnterHeadersKey.sendKeys("FGH");
			Thread.sleep(2000);
			CEPP.EnterHeadersValue.sendKeys("GG");
			Thread.sleep(2000);
			CEPP.EnterHeadersDescription.sendKeys("GGG");
			Thread.sleep(2000);
			CEPP.HeadersRequiredCheckBox.click();
			Thread.sleep(2000);
			CEPP.HeadersDynamicCheckBox.click();
			Thread.sleep(2000);
			CEPP.ClickOnCreateButton.click();
			
			String title = CEPP.SuccessMsgPop.getText();
			System.out.println(title);
			if (title.equals("Proxy endpoint created successfully")) {
				child97.log(LogStatus.PASS, "Validation successful because we are getting message as ''" + title
						+ "'' when we 	verifying create api with only server auth and Params'");
			} else {
				child97.log(LogStatus.FAIL, "Validation Unsuccessful because we are getting message as ''" + title
						+ "''instead of '' when we verifying create api with only server auth and Params'");
			}

		} catch (Exception e) {
			child97.log(LogStatus.FAIL, e.fillInStackTrace());
		}
		_extent_report.endTest(child97);

	}

	@Test(priority = 99, enabled = true, description = "verifying create api with only headers and body")
	public void VerifyingCreateApiwithOnlyHeadersandBody() throws Throwable {
		child98 = _extent_report.startTest("verifying create api with only headers and body");
		child98.assignCategory("Create Endpoint");
		try {

			Thread.sleep(3000);
			CEPP.MangeEndPointClick.click();
			Thread.sleep(2000);
			CEPP.CreateEndPointClick.click();
			Thread.sleep(2000);
			CEPP.EnterAPIName.sendKeys("Testapi" + api++);
			Thread.sleep(2000);
			CEPP.ClickOnDropdow.click();
			Thread.sleep(2000);
			CEPP.ClickOCreateAPIFromDropDown.click();
			Thread.sleep(2000);

			CEPP.ClickOnProxyWebMethod.click();
			Thread.sleep(2000);
			CEPP.ClickOnPostMethod.click();

			Thread.sleep(2000);
			CEPP.EnterServerURL.sendKeys(serverurl + "/pcm/workflow");
			Thread.sleep(2000);
			CEPP.ClickOnServerAuthorization.click();
			Thread.sleep(2000);
			CEPP.ClickOnAuthDropDown.click();
			CEPP.SelectNoAuth.click();

			Thread.sleep(2000);
			CEPP.ClickOnHeaders.click();
			Thread.sleep(2000);
			CEPP.EnterHeadersKey.sendKeys("FGH");
			Thread.sleep(2000);
			CEPP.EnterHeadersValue.sendKeys("GG");
			Thread.sleep(2000);
			CEPP.EnterHeadersDescription.sendKeys("GGG");
			Thread.sleep(2000);
			CEPP.HeadersRequiredCheckBox.click();
			Thread.sleep(2000);
			CEPP.HeadersDynamicCheckBox.click();
			Thread.sleep(2000);
			CEPP.ClickonBody.click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//textarea")).sendKeys(Keys.chord(Keys.CONTROL, "a"),
					"{\r\n" + "\"addressLine1\": \"abc\",\r\n" + "\"addressLine2\": \"def\",\r\n"
							+ "\"createMailBoxInSI\": true,\r\n" + "\"customProfileName\": \"\",\r\n"
							+ "\"deleteAfterCollection\": true,\r\n" + "\"emailId\": \"tv100@gmail.com\",\r\n"
							+ "\"filter\": \"\",\r\n" + "\"ipWhiteList\": \"\",\r\n" + "\"hubInfo\": true,\r\n"
							+ "\"inMailBox\": \"/in\",\r\n" + "\"like\": true,\r\n" + "\"onlyPCM\": true,\r\n"
							+ "\"outMailBox\": \"/out\",\r\n" + "\"pemIdentifier\": \"\",\r\n"
							+ "\"pgpInfo\": \"test\",\r\n" + "\"phone\": \"1234564561\",\r\n" + "\"pkId\": \"\",\r\n"
							+ "\"poolingInterval\": \"ON\",\r\n" + "\"profileId\": \"testmail200\",\r\n"
							+ "\"profileName\": \"testmail200\",\r\n" + "\"protocol\": \"Mailbox\",\r\n"
							+ "\"status\": true\r\n" + "}");

			CEPP.ClickOnCreateButton.click();

			String title = CEPP.SuccessMsgPop.getText();
			System.out.println(title);
			if (title.equals("Proxy endpoint created successfully")) {
				child98.log(LogStatus.PASS, "Validation successful because we are getting message as ''" + title
						+ "'' when we verifying create api with only headers and body'");
			} else {
				child98.log(LogStatus.FAIL, "Validation Unsuccessful because we are getting message as ''" + title
						+ "''instead of '' when we verifying create api with only headers and body'");
			}

		} catch (Exception e) {
			child98.log(LogStatus.FAIL, e.fillInStackTrace());
		}
		_extent_report.endTest(child98);

	}

	@Test(priority = 100, enabled = true, description = "verifying create api with only params and body")
	public void VerifyingCreateApiwithOnlyParamsandBody() throws Throwable {
		child99 = _extent_report.startTest("verifying create api with only params and body");
		child99.assignCategory("Create Endpoint");
		try {

			Thread.sleep(3000);
			CEPP.MangeEndPointClick.click();
			Thread.sleep(2000);
			CEPP.CreateEndPointClick.click();
			Thread.sleep(2000);
			CEPP.EnterAPIName.sendKeys("Testapi" + api++);
			Thread.sleep(2000);
			CEPP.ClickOnDropdow.click();
			Thread.sleep(2000);
			CEPP.ClickOCreateAPIFromDropDown.click();
			Thread.sleep(2000);

			CEPP.ClickOnProxyWebMethod.click();
			Thread.sleep(2000);
			CEPP.ClickOnPostMethod.click();

			Thread.sleep(2000);
			CEPP.EnterServerURL.sendKeys(serverurl + "/pcm/workflow");
			Thread.sleep(2000);
			CEPP.ClickOnServerAuthorization.click();
			Thread.sleep(2000);
			CEPP.ClickOnAuthDropDown.click();
			CEPP.SelectNoAuth.click();
			Thread.sleep(2000);
			CEPP.ClickOnParams.click();
			Thread.sleep(2000);
			CEPP.ParamsKey.sendKeys("dd");
			Thread.sleep(2000);
			CEPP.ParamsValue.sendKeys("sss");
			Thread.sleep(2000);
			CEPP.ParamsDescription.sendKeys("ddd");
			Thread.sleep(2000);
			CEPP.ParamsRequiredCheckBox.click();
			Thread.sleep(2000);
			CEPP.ParamsDynamicCheckBox.click();
			Thread.sleep(2000);
			CEPP.ClickonBody.click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//textarea")).sendKeys(Keys.chord(Keys.CONTROL, "a"),
					"{\r\n" + "\"addressLine1\": \"abc\",\r\n" + "\"addressLine2\": \"def\",\r\n"
							+ "\"createMailBoxInSI\": true,\r\n" + "\"customProfileName\": \"\",\r\n"
							+ "\"deleteAfterCollection\": true,\r\n" + "\"emailId\": \"tv100@gmail.com\",\r\n"
							+ "\"filter\": \"\",\r\n" + "\"ipWhiteList\": \"\",\r\n" + "\"hubInfo\": true,\r\n"
							+ "\"inMailBox\": \"/in\",\r\n" + "\"like\": true,\r\n" + "\"onlyPCM\": true,\r\n"
							+ "\"outMailBox\": \"/out\",\r\n" + "\"pemIdentifier\": \"\",\r\n"
							+ "\"pgpInfo\": \"test\",\r\n" + "\"phone\": \"1234564561\",\r\n" + "\"pkId\": \"\",\r\n"
							+ "\"poolingInterval\": \"ON\",\r\n" + "\"profileId\": \"testmail200\",\r\n"
							+ "\"profileName\": \"testmail200\",\r\n" + "\"protocol\": \"Mailbox\",\r\n"
							+ "\"status\": true\r\n" + "}");

			CEPP.ClickOnCreateButton.click();

			String title = CEPP.SuccessMsgPop.getText();
			System.out.println(title);
			if (title.equals("Proxy endpoint created successfully")) {
				child99.log(LogStatus.PASS, "Validation successful because we are getting message as ''" + title
						+ "'' when we 	verifying create api with only params and body'");
			} else {
				child99.log(LogStatus.FAIL, "Validation Unsuccessful because we are getting message as ''" + title
						+ "''instead of '' when we verifying create api with only params and body'");
			}

		} catch (Exception e) {
			child99.log(LogStatus.FAIL, e.fillInStackTrace());
		}
		_extent_report.endTest(child99);

	}

	@Test(priority = 101, enabled = true, description = "verifying create api with only proxy auth,server auth and params")
	public void VerifyingCreateApiwithOnlyProxyAuthServerAuthandParams() throws Throwable {
		child100 = _extent_report.startTest("verifying create api with only proxy auth,server auth and params");
		child100.assignCategory("Create Endpoint");
		try {

			Thread.sleep(3000);
			CEPP.MangeEndPointClick.click();
			Thread.sleep(2000);
			CEPP.CreateEndPointClick.click();
			Thread.sleep(2000);
			CEPP.EnterAPIName.sendKeys("Testapi" + api++);
			Thread.sleep(2000);
			CEPP.ClickOnDropdow.click();
			Thread.sleep(2000);
			CEPP.ClickOCreateAPIFromDropDown.click();
			Thread.sleep(2000);

			CEPP.ClickOnProxyWebMethod.click();
			Thread.sleep(2000);
			CEPP.ClickOnGetMethod.click();
			Thread.sleep(2000);

			CEPP.EnterServerURL.sendKeys(serverurl + "/pcm/workflow");
			Thread.sleep(2000);
			CEPP.ClickOnServerAuthorization.click();
			Thread.sleep(2000);
			CEPP.ClickOnAuthDropDown.click();
			Thread.sleep(2000);
			CEPP.SelectNoAuth.click();
			Thread.sleep(2000);
			CEPP.ClickOnProxyAuthorization.click();
			Thread.sleep(2000);
			CEPP.ClickOnAuthDropDown.click();
			Thread.sleep(2000);
			CEPP.SelectNoAuth.click();
			Thread.sleep(2000);
			CEPP.ClickOnParams.click();
			Thread.sleep(2000);
			CEPP.ParamsKey.sendKeys("dd");
			Thread.sleep(2000);
			CEPP.ParamsValue.sendKeys("sss");
			Thread.sleep(2000);
			CEPP.ParamsDescription.sendKeys("ddd");
			Thread.sleep(2000);
			CEPP.ParamsRequiredCheckBox.click();
			Thread.sleep(2000);
			CEPP.ParamsDynamicCheckBox.click();
			Thread.sleep(2000);
			CEPP.ClickOnCreateButton.click();

			String title = CEPP.SuccessMsgPop.getText();
			System.out.println(title);
			if (title.equals("Proxy endpoint created successfully")) {
				child100.log(LogStatus.PASS, "Validation successful because we are getting message as ''" + title
						+ "'' when we 	verifying create api with only params and body'");
			} else {
				child100.log(LogStatus.FAIL, "Validation Unsuccessful because we are getting message as ''" + title
						+ "''instead of '' when we verifying create api with only params and body'");
			}

		} catch (Exception e) {
			child100.log(LogStatus.FAIL, e.fillInStackTrace());
		}
		_extent_report.endTest(child100);

	}

	@Test(priority = 102, enabled = false, description = "verifying create api with only proxy auth,server auth and headers")
	public void VerifyingCreateApiwithOnlyProxyAuthServerAuthandHeaders() throws Throwable {
		child101 = _extent_report.startTest("verifying create api with only proxy auth,server auth and headers");
		child101.assignCategory("Create Endpoint");
		try {

			Thread.sleep(3000);
			CEPP.CreateEndPointClick.click();
			driver.navigate().refresh();
			CEPP.EnterAPIName.sendKeys("Testapi" + api++);
			Thread.sleep(2000);
			CEPP.ClickOnDropdow.click();
			Thread.sleep(2000);
			CEPP.ClickOCreateAPIFromDropDown.click();
			Thread.sleep(2000);

			CEPP.ClickOnProxyWebMethod.click();
			Thread.sleep(2000);
			CEPP.ClickOnGetMethod.click();
			Thread.sleep(2000);

			CEPP.EnterServerURL.sendKeys(serverurl + "/pcm/workflow");
			CEPP.ClickOnServerAuthorization.click();
			Thread.sleep(2000);
			CEPP.ClickOnAuthDropDown.click();
			CEPP.SelectNoAuth.click();
			Thread.sleep(2000);
			CEPP.ClickOnProxyAuthorization.click();
			Thread.sleep(2000);
			CEPP.ClickOnAuthDropDown.click();
			CEPP.SelectNoAuth.click();
			CEPP.ClickOnHeaders.click();
			Thread.sleep(2000);
			CEPP.EnterHeadersKey.sendKeys("FGH");
			Thread.sleep(2000);
			CEPP.EnterHeadersValue.sendKeys("GG");
			Thread.sleep(2000);
			CEPP.EnterHeadersDescription.sendKeys("GGG");
			Thread.sleep(2000);
			CEPP.HeadersRequiredCheckBox.click();
			Thread.sleep(2000);
			CEPP.HeadersDynamicCheckBox.click();

			CEPP.ClickOnCreateButton.click();

			String title = CEPP.SuccessMsgPop.getText();
			System.out.println(title);
			if (title.equals("Proxy endpoint created successfully")) {
				child101.log(LogStatus.PASS, "Validation successful because we are getting message as ''" + title
						+ "'' when we verifying create api with only proxy auth,server auth and headers'");
			} else {
				child101.log(LogStatus.FAIL, "Validation Unsuccessful because we are getting message as ''" + title
						+ "''instead of '' when we verifying create api with only proxy auth,server auth and headers'");
			}

		} catch (Exception e) {
			child101.log(LogStatus.FAIL, e.fillInStackTrace());
		}
		_extent_report.endTest(child101);

	}

	@Test(priority = 103, enabled = false, description = "verifying create api with only proxy auth,server auth and body")
	public void VerifyingCreateApiwithOnlyProxyAuthServerAuthandBody() throws Throwable {
		child102 = _extent_report.startTest("verifying create api with only proxy auth,server auth and body");
		child102.assignCategory("Create Endpoint");
		try {

			Thread.sleep(3000);
			CEPP.CreateEndPointClick.click();
			driver.navigate().refresh();
			CEPP.EnterAPIName.sendKeys("Testapi" + api++);
			Thread.sleep(2000);
			CEPP.ClickOnDropdow.click();
			Thread.sleep(2000);
			CEPP.ClickOCreateAPIFromDropDown.click();
			Thread.sleep(2000);

			CEPP.ClickOnProxyWebMethod.click();
			Thread.sleep(2000);
			CEPP.ClickOnPostMethod.click();

			Thread.sleep(2000);
			CEPP.EnterServerURL.sendKeys(serverurl + "/pcm/workflow");
			Thread.sleep(2000);
			CEPP.ClickOnProxyAuthorization.click();
			Thread.sleep(2000);
			CEPP.ClickOnAuthDropDown.click();
			CEPP.SelectNoAuth.click();
			CEPP.ClickOnServerAuthorization.click();
			Thread.sleep(2000);
			CEPP.ClickOnAuthDropDown.click();
			CEPP.SelectNoAuth.click();
			Thread.sleep(2000);
			CEPP.ClickOnProxyAuthorization.click();
			Thread.sleep(2000);
			CEPP.ClickOnAuthDropDown.click();
			CEPP.SelectNoAuth.click();

			CEPP.ClickOnHeaders.click();
			Thread.sleep(2000);
			CEPP.EnterHeadersKey.sendKeys("FGH");
			Thread.sleep(2000);
			CEPP.EnterHeadersValue.sendKeys("GG");
			Thread.sleep(2000);
			CEPP.EnterHeadersDescription.sendKeys("GGG");
			Thread.sleep(2000);
			CEPP.HeadersRequiredCheckBox.click();
			Thread.sleep(2000);
			CEPP.HeadersDynamicCheckBox.click();

			CEPP.ClickOnCreateButton.click();

			String title = CEPP.SuccessMsgPop.getText();
			System.out.println(title);
			if (title.equals("Proxy endpoint created successfully")) {
				child102.log(LogStatus.PASS, "Validation successful because we are getting message as ''" + title
						+ "'' when we verifying create api with only proxy auth,server auth and body'");
			} else {
				child102.log(LogStatus.FAIL, "Validation Unsuccessful because we are getting message as ''" + title
						+ "''instead of '' when we verifying create api with only proxy auth,server auth and body'");
			}

		} catch (Exception e) {
			child102.log(LogStatus.FAIL, e.fillInStackTrace());
		}
		_extent_report.endTest(child102);

	}

	@Test(priority = 104, enabled = false, description = "verifying create api with server auth,params and headers")
	public void verifyingCreateApiwithServerAuthParamsandHeaders() throws Throwable {
		child103 = _extent_report.startTest("verifying create api with server auth,params and headers");
		child103.assignCategory("Create Endpoint");
		try {

			Thread.sleep(3000);
			CEPP.CreateEndPointClick.click();
			driver.navigate().refresh();
			CEPP.EnterAPIName.sendKeys("Testapi" + api++);
			Thread.sleep(2000);
			CEPP.ClickOnDropdow.click();
			Thread.sleep(2000);
			CEPP.ClickOCreateAPIFromDropDown.click();
			Thread.sleep(2000);

			CEPP.ClickOnProxyWebMethod.click();
			Thread.sleep(2000);
			CEPP.ClickOnGetMethod.click();

			Thread.sleep(2000);
			CEPP.EnterServerURL.sendKeys(serverurl + "/pcm/workflow");
			CEPP.ClickOnServerAuthorization.click();
			Thread.sleep(2000);
			CEPP.ClickOnAuthDropDown.click();
			CEPP.SelectNoAuth.click();
			Thread.sleep(2000);
			CEPP.ClickOnParams.click();
			Thread.sleep(2000);
			CEPP.ParamsKey.sendKeys("dd");
			Thread.sleep(2000);
			CEPP.ParamsValue.sendKeys("sss");
			Thread.sleep(2000);
			CEPP.ParamsDescription.sendKeys("ddd");
			Thread.sleep(2000);
			CEPP.ParamsRequiredCheckBox.click();

			CEPP.ParamsDynamicCheckBox.click();

			CEPP.ClickOnHeaders.click();
			Thread.sleep(2000);
			CEPP.EnterHeadersKey.sendKeys("FGH");
			Thread.sleep(2000);
			CEPP.EnterHeadersValue.sendKeys("GG");
			Thread.sleep(2000);
			CEPP.EnterHeadersDescription.sendKeys("GGG");
			Thread.sleep(2000);
			CEPP.HeadersRequiredCheckBox.click();
			Thread.sleep(2000);
			CEPP.HeadersDynamicCheckBox.click();

			CEPP.ClickOnCreateButton.click();

			String title = CEPP.SuccessMsgPop.getText();
			System.out.println(title);
			if (title.equals("Proxy endpoint created successfully")) {
				child103.log(LogStatus.PASS, "Validation successful because we are getting message as ''" + title
						+ "'' when we verifying create api with server auth,params and headers'");
			} else {
				child103.log(LogStatus.FAIL, "Validation Unsuccessful because we are getting message as ''" + title
						+ "''instead of '' when we verifying create api with server auth,params and headers'");
			}

		} catch (Exception e) {
			child103.log(LogStatus.FAIL, e.fillInStackTrace());
		}
		_extent_report.endTest(child103);

	}

	@Test(priority = 105, enabled = false, description = "verifying create api with server auth,params and body")
	public void VerifyingCreateApiwithServerAuthParamsAndBody() throws Throwable {
		child104 = _extent_report.startTest("verifying create api with server auth,params and body");
		child104.assignCategory("Create Endpoint");
		try {

			Thread.sleep(3000);
			CEPP.CreateEndPointClick.click();
			driver.navigate().refresh();
			CEPP.EnterAPIName.sendKeys("Testapi" + api++);
			Thread.sleep(2000);
			CEPP.ClickOnDropdow.click();
			Thread.sleep(2000);
			CEPP.ClickOCreateAPIFromDropDown.click();
			Thread.sleep(2000);

			CEPP.ClickOnProxyWebMethod.click();
			Thread.sleep(2000);
			CEPP.ClickOnPostMethod.click();

			Thread.sleep(2000);
			CEPP.EnterServerURL.sendKeys(serverurl + "/pcm/workflow");
			CEPP.ClickOnServerAuthorization.click();
			Thread.sleep(2000);
			CEPP.ClickOnAuthDropDown.click();
			CEPP.SelectNoAuth.click();
			Thread.sleep(2000);
			CEPP.ClickOnParams.click();
			Thread.sleep(2000);
			CEPP.ParamsKey.sendKeys("dd");
			Thread.sleep(2000);
			CEPP.ParamsValue.sendKeys("sss");
			Thread.sleep(2000);
			CEPP.ParamsDescription.sendKeys("ddd");
			Thread.sleep(2000);
			CEPP.ParamsRequiredCheckBox.click();

			CEPP.ParamsDynamicCheckBox.click();

			CEPP.ClickonBody.click();
			driver.findElement(By.xpath("//textarea")).sendKeys(Keys.chord(Keys.CONTROL, "a"),
					"{\r\n" + "\"addressLine1\": \"abc\",\r\n" + "\"addressLine2\": \"def\",\r\n"
							+ "\"createMailBoxInSI\": true,\r\n" + "\"customProfileName\": \"\",\r\n"
							+ "\"deleteAfterCollection\": true,\r\n" + "\"emailId\": \"tv100@gmail.com\",\r\n"
							+ "\"filter\": \"\",\r\n" + "\"ipWhiteList\": \"\",\r\n" + "\"hubInfo\": true,\r\n"
							+ "\"inMailBox\": \"/in\",\r\n" + "\"like\": true,\r\n" + "\"onlyPCM\": true,\r\n"
							+ "\"outMailBox\": \"/out\",\r\n" + "\"pemIdentifier\": \"\",\r\n"
							+ "\"pgpInfo\": \"test\",\r\n" + "\"phone\": \"1234564561\",\r\n" + "\"pkId\": \"\",\r\n"
							+ "\"poolingInterval\": \"ON\",\r\n" + "\"profileId\": \"testmail200\",\r\n"
							+ "\"profileName\": \"testmail200\",\r\n" + "\"protocol\": \"Mailbox\",\r\n"
							+ "\"status\": true\r\n" + "}");

			CEPP.ClickOnCreateButton.click();

			String title = CEPP.SuccessMsgPop.getText();
			System.out.println(title);
			if (title.equals("Proxy endpoint created successfully")) {
				child104.log(LogStatus.PASS, "Validation successful because we are getting message as ''" + title
						+ "'' when we verifying create api with server auth,params and body'");
			} else {
				child104.log(LogStatus.FAIL, "Validation Unsuccessful because we are getting message as ''" + title
						+ "''instead of '' when we verifying create api with server auth,params and body'");
			}

		} catch (Exception e) {
			child104.log(LogStatus.FAIL, e.fillInStackTrace());
		}
		_extent_report.endTest(child104);

	}

	@Test(priority = 106, enabled = false, description = "verifying create api with proxy auth,server auth,params and headers")
	public void VerifyingCreateAPIwithProxyAuthServerAuthParamsandheaders() throws Throwable {
		child105 = _extent_report.startTest("verifying create api with proxy auth,server auth,params and headers");
		child105.assignCategory("Create Endpoint");
		try {

			Thread.sleep(3000);
			CEPP.CreateEndPointClick.click();
			driver.navigate().refresh();
			CEPP.EnterAPIName.sendKeys("Testapi" + api++);
			Thread.sleep(2000);
			CEPP.ClickOnDropdow.click();
			Thread.sleep(2000);
			CEPP.ClickOCreateAPIFromDropDown.click();
			Thread.sleep(2000);

			CEPP.ClickOnProxyWebMethod.click();
			Thread.sleep(2000);
			CEPP.ClickOnGetMethod.click();

			Thread.sleep(2000);
			CEPP.EnterServerURL.sendKeys(serverurl + "/pcm/workflow");
			CEPP.ClickOnServerAuthorization.click();
			Thread.sleep(2000);
			CEPP.ClickOnAuthDropDown.click();
			CEPP.SelectNoAuth.click();
			Thread.sleep(2000);
			CEPP.ClickOnProxyAuthorization.click();
			CEPP.ClickOnAuthDropDown.click();
			CEPP.SelectNoAuth.click();
			Thread.sleep(2000);
			CEPP.ClickOnParams.click();
			Thread.sleep(2000);
			CEPP.ParamsKey.sendKeys("dd");
			Thread.sleep(2000);
			CEPP.ParamsValue.sendKeys("sss");
			Thread.sleep(2000);
			CEPP.ParamsDescription.sendKeys("ddd");
			Thread.sleep(2000);
			CEPP.ParamsRequiredCheckBox.click();

			CEPP.ParamsDynamicCheckBox.click();

			CEPP.ClickOnHeaders.click();
			Thread.sleep(2000);
			CEPP.EnterHeadersKey.sendKeys("FGH");
			Thread.sleep(2000);
			CEPP.EnterHeadersValue.sendKeys("GG");
			Thread.sleep(2000);
			CEPP.EnterHeadersDescription.sendKeys("GGG");
			Thread.sleep(2000);
			CEPP.HeadersRequiredCheckBox.click();
			Thread.sleep(2000);
			CEPP.HeadersDynamicCheckBox.click();

			CEPP.ClickOnCreateButton.click();

			String title = CEPP.SuccessMsgPop.getText();
			System.out.println(title);
			if (title.equals("Proxy endpoint created successfully")) {
				child105.log(LogStatus.PASS, "Validation successful because we are getting message as ''" + title
						+ "'' when we verifying create api with proxy auth,server auth,params and headers'");
			} else {
				child105.log(LogStatus.FAIL, "Validation Unsuccessful because we are getting message as ''" + title
						+ "''instead of '' when we verifying create api with proxy auth,server auth,params and headers'");
			}

		} catch (Exception e) {
			child105.log(LogStatus.FAIL, e.fillInStackTrace());
		}
		_extent_report.endTest(child105);

	}

	@Test(priority = 107, enabled = false, description = "verifying create api with proxy auth,server auth,params and body")
	public void VerifyingCreateAPIwithProxyAuthServerAuthParamsandHeaders() throws Throwable {
		child106 = _extent_report.startTest("verifying create api with proxy auth,server auth,params and body");
		child106.assignCategory("Create Endpoint");
		try {

			Thread.sleep(3000);
			CEPP.CreateEndPointClick.click();
			driver.navigate().refresh();
			CEPP.EnterAPIName.sendKeys("Testapi" + api++);
			Thread.sleep(2000);
			CEPP.ClickOnDropdow.click();
			Thread.sleep(2000);
			CEPP.ClickOCreateAPIFromDropDown.click();
			Thread.sleep(2000);

			CEPP.ClickOnProxyWebMethod.click();
			Thread.sleep(2000);
			CEPP.ClickOnPostMethod.click();

			Thread.sleep(2000);
			CEPP.EnterServerURL.sendKeys(serverurl + "/pcm/workflow");
			CEPP.ClickOnServerAuthorization.click();
			Thread.sleep(2000);
			CEPP.ClickOnAuthDropDown.click();
			CEPP.SelectNoAuth.click();
			Thread.sleep(2000);
			CEPP.ClickOnParams.click();
			Thread.sleep(2000);
			CEPP.ParamsKey.sendKeys("dd");
			Thread.sleep(2000);
			CEPP.ParamsValue.sendKeys("sss");
			Thread.sleep(2000);
			CEPP.ParamsDescription.sendKeys("ddd");
			Thread.sleep(2000);
			CEPP.ParamsRequiredCheckBox.click();

			CEPP.ParamsDynamicCheckBox.click();

			Thread.sleep(2000);
			CEPP.ClickonBody.click();
			driver.findElement(By.xpath("//textarea")).sendKeys(Keys.chord(Keys.CONTROL, "a"),
					"{\r\n" + "\"addressLine1\": \"abc\",\r\n" + "\"addressLine2\": \"def\",\r\n"
							+ "\"createMailBoxInSI\": true,\r\n" + "\"customProfileName\": \"\",\r\n"
							+ "\"deleteAfterCollection\": true,\r\n" + "\"emailId\": \"tv100@gmail.com\",\r\n"
							+ "\"filter\": \"\",\r\n" + "\"ipWhiteList\": \"\",\r\n" + "\"hubInfo\": true,\r\n"
							+ "\"inMailBox\": \"/in\",\r\n" + "\"like\": true,\r\n" + "\"onlyPCM\": true,\r\n"
							+ "\"outMailBox\": \"/out\",\r\n" + "\"pemIdentifier\": \"\",\r\n"
							+ "\"pgpInfo\": \"test\",\r\n" + "\"phone\": \"1234564561\",\r\n" + "\"pkId\": \"\",\r\n"
							+ "\"poolingInterval\": \"ON\",\r\n" + "\"profileId\": \"testmail200\",\r\n"
							+ "\"profileName\": \"testmail200\",\r\n" + "\"protocol\": \"Mailbox\",\r\n"
							+ "\"status\": true\r\n" + "}");
			CEPP.ClickOnCreateButton.click();
			String title = CEPP.SuccessMsgPop.getText();
			System.out.println(title);
			if (title.equals("Proxy endpoint created successfully")) {
				child106.log(LogStatus.PASS, "Validation successful because we are getting message as ''" + title
						+ "'' when we verifying create api with proxy auth,server auth,params and headers'");
			} else {
				child106.log(LogStatus.FAIL, "Validation Unsuccessful because we are getting message as ''" + title
						+ "''instead of '' when we verifying create api with proxy auth,server auth,params and body'");
			}

		} catch (Exception e) {
			child106.log(LogStatus.FAIL, e.fillInStackTrace());
		}
		_extent_report.endTest(child106);

	}

	@Test(priority = 108, enabled = false, description = "verifying create api with server auth, params ,headers and body")
	public void VerifyingCreateAPIwithProxyAuthServerAuthParamsandHeadersBody() throws Throwable {
		child107 = _extent_report.startTest("verifying create api with server auth, params ,headers and body");
		child107.assignCategory("Create Endpoint");
		try {

			Thread.sleep(3000);
			CEPP.CreateEndPointClick.click();
			driver.navigate().refresh();
			CEPP.EnterAPIName.sendKeys("Testapi" + api++);
			Thread.sleep(2000);
			CEPP.ClickOnDropdow.click();
			Thread.sleep(2000);
			CEPP.ClickOCreateAPIFromDropDown.click();
			Thread.sleep(2000);

			CEPP.ClickOnProxyWebMethod.click();
			Thread.sleep(2000);
			CEPP.ClickOnPostMethod.click();

			Thread.sleep(2000);
			CEPP.EnterServerURL.sendKeys(serverurl + "/pcm/workflow");
			CEPP.ClickOnServerAuthorization.click();
			Thread.sleep(2000);
			CEPP.ClickOnAuthDropDown.click();
			CEPP.SelectNoAuth.click();
			Thread.sleep(2000);
			CEPP.ClickOnParams.click();
			Thread.sleep(2000);
			CEPP.ParamsKey.sendKeys("dd");
			Thread.sleep(2000);
			CEPP.ParamsValue.sendKeys("sss");
			Thread.sleep(2000);
			CEPP.ParamsDescription.sendKeys("ddd");
			Thread.sleep(2000);
			CEPP.ParamsRequiredCheckBox.click();

			CEPP.ParamsDynamicCheckBox.click();
			Thread.sleep(2000);
			CEPP.ClickOnHeaders.click();
			Thread.sleep(2000);
			CEPP.EnterHeadersKey.sendKeys("FGH");
			Thread.sleep(2000);
			CEPP.EnterHeadersValue.sendKeys("GG");
			Thread.sleep(2000);
			CEPP.EnterHeadersDescription.sendKeys("GGG");
			Thread.sleep(2000);
			CEPP.HeadersRequiredCheckBox.click();
			Thread.sleep(2000);
			CEPP.HeadersDynamicCheckBox.click();

			CEPP.ClickonBody.click();
			driver.findElement(By.xpath("//textarea")).sendKeys(Keys.chord(Keys.CONTROL, "a"),
					"{\r\n" + "\"addressLine1\": \"abc\",\r\n" + "\"addressLine2\": \"def\",\r\n"
							+ "\"createMailBoxInSI\": true,\r\n" + "\"customProfileName\": \"\",\r\n"
							+ "\"deleteAfterCollection\": true,\r\n" + "\"emailId\": \"tv100@gmail.com\",\r\n"
							+ "\"filter\": \"\",\r\n" + "\"ipWhiteList\": \"\",\r\n" + "\"hubInfo\": true,\r\n"
							+ "\"inMailBox\": \"/in\",\r\n" + "\"like\": true,\r\n" + "\"onlyPCM\": true,\r\n"
							+ "\"outMailBox\": \"/out\",\r\n" + "\"pemIdentifier\": \"\",\r\n"
							+ "\"pgpInfo\": \"test\",\r\n" + "\"phone\": \"1234564561\",\r\n" + "\"pkId\": \"\",\r\n"
							+ "\"poolingInterval\": \"ON\",\r\n" + "\"profileId\": \"testmail200\",\r\n"
							+ "\"profileName\": \"testmail200\",\r\n" + "\"protocol\": \"Mailbox\",\r\n"
							+ "\"status\": true\r\n" + "}");

			CEPP.ClickOnCreateButton.click();

			String title = CEPP.SuccessMsgPop.getText();
			System.out.println(title);
			if (title.equals("Proxy endpoint created successfully")) {
				child107.log(LogStatus.PASS, "Validation successful because we are getting message as ''" + title
						+ "'' when we verifying create api with server auth, params ,headers and body'");
			} else {
				child107.log(LogStatus.FAIL, "Validation Unsuccessful because we are getting message as ''" + title
						+ "''instead of '' when we verifying create api with server auth, params ,headers and body'");
			}

		} catch (Exception e) {
			child107.log(LogStatus.FAIL, e.fillInStackTrace());
		}
		_extent_report.endTest(child107);

	}

///	*****************************************************************************///INVOKE API ///*************************************************************************************************************

	@Test(priority = 109, enabled = false, description = "verifying invoke api with valid data")
	public void VerifyingInvokeAPIwithValidData() throws Throwable {
		child108 = _extent_report.startTest("verifying invoke api with valid data");
		child108.assignCategory("Create Endpoint");
		try {

			Thread.sleep(3000);
			CEPP.CreateEndPointClick.click();
			driver.navigate().refresh();
			CEPP.EnterAPIName.sendKeys("Invokeapi" + api++);
			Thread.sleep(2000);

			CEPP.ClickOnDropdow.click();
			Thread.sleep(2000);
			CEPP.ClickOnInvokeAPIFromDropDown.click();
			Thread.sleep(2000);
			CEPP.ClickOnPollingIntervalDropdown.click();
			Thread.sleep(2000);
			CEPP.ClickOnPollingIntervalOnArrival.click();
			Thread.sleep(2000);
			CEPP.ClickOnProxyWebMethod.click();
			Thread.sleep(2000);
			CEPP.ClickOnGetMethod.click();

			Thread.sleep(2000);
			CEPP.EnterServerURL.sendKeys("https://20.55.8.64:7080//pcm/workflow");
			Thread.sleep(2000);
			CEPP.ClickOnServerAuthorization1.click();
			Thread.sleep(2000);
			CEPP.ClickOnAuthDropDown.click();
			CEPP.SelectBasicAuth.click();
			CEPP.ServerAuthorizationUserName.sendKeys("cm_user");
			CEPP.ServerAuthorizationPassword.sendKeys("password");
			CEPP.ClickOnCreateButton.click();
			String title = CEPP.SuccessMsgPop.getText();
			System.out.println(title);
			if (title.equals("Proxy endpoint created successfully")) {
				child108.log(LogStatus.PASS, "Validation successful because we are getting message as ''" + title
						+ "'' when we verifying invoke api with valid data'");
			} else {
				child108.log(LogStatus.FAIL, "Validation Unsuccessful because we are getting message as ''" + title
						+ "''instead of '' when we verifying invoke api with valid data'");
			}

		} catch (Exception e) {
			child108.log(LogStatus.FAIL, e.fillInStackTrace());
		}
		_extent_report.endTest(child108);

	}

	@Test(priority = 110, enabled = false, description = "verifying invoke api with only server auth")
	public void VerifyingInvokeAPIwithonlyServerAuth() throws Throwable {
		child109 = _extent_report.startTest("verifying invoke api with only server auth");
		child109.assignCategory("Create Endpoint");
		try {

			Thread.sleep(3000);
			CEPP.CreateEndPointClick.click();
			driver.navigate().refresh();
			CEPP.EnterAPIName.sendKeys("Invokeapi" + api++);
			Thread.sleep(2000);
			CEPP.ClickOnDropdow.click();
			Thread.sleep(2000);
			CEPP.ClickOnInvokeAPIFromDropDown.click();
			Thread.sleep(2000);
			CEPP.ClickOnPollingIntervalDropdown.click();
			Thread.sleep(2000);
			CEPP.ClickOnPollingIntervalOnArrival.click();
			Thread.sleep(2000);
			CEPP.ClickOnProxyWebMethod.click();
			Thread.sleep(2000);
			CEPP.ClickOnGetMethod.click();

			Thread.sleep(2000);
			CEPP.EnterServerURL.sendKeys("https://20.55.8.64:7080//pcm/workflow");
			Thread.sleep(2000);
			CEPP.ClickOnServerAuthorization1.click();
			Thread.sleep(2000);
			CEPP.ClickOnAuthDropDown.click();
			CEPP.SelectNoAuth.click();
			CEPP.ClickOnCreateButton.click();
			String title = CEPP.SuccessMsgPop.getText();
			System.out.println(title);
			if (title.equals("Proxy endpoint created successfully")) {
				child109.log(LogStatus.PASS, "Validation successful because we are getting message as ''" + title
						+ "'' when we verifying invoke api with only server auth'");
			} else {
				child109.log(LogStatus.FAIL, "Validation Unsuccessful because we are getting message as ''" + title
						+ "''instead of '' when we verifying invoke api with only server auth'");
			}

		} catch (Exception e) {
			child109.log(LogStatus.FAIL, e.fillInStackTrace());
		}
		_extent_report.endTest(child109);

	}

	@Test(priority = 111, enabled = false, description = "verifying invoke api with only params")
	public void VerifyingInvokeApiwithOnlyParams() throws Throwable {
		child110 = _extent_report.startTest("verifying invoke api with only params");
		child110.assignCategory("Create Endpoint");
		try {

			Thread.sleep(3000);
			CEPP.CreateEndPointClick.click();
			driver.navigate().refresh();
			CEPP.EnterAPIName.sendKeys("Invokeapi" + api++);
			Thread.sleep(2000);
			CEPP.ClickOnDropdow.click();
			Thread.sleep(2000);
			CEPP.ClickOnInvokeAPIFromDropDown.click();
			Thread.sleep(2000);
			CEPP.ClickOnPollingIntervalDropdown.click();
			Thread.sleep(2000);
			CEPP.ClickOnPollingIntervalOnArrival.click();
			Thread.sleep(2000);
			CEPP.ClickOnProxyWebMethod.click();
			Thread.sleep(2000);
			CEPP.ClickOnGetMethod.click();

			Thread.sleep(2000);
			CEPP.EnterServerURL.sendKeys("https://20.55.8.64:7080//pcm/workflow");
			Thread.sleep(2000);
			CEPP.ClickOnParams.click();
			Thread.sleep(2000);
			CEPP.ClickOnServerParamsKey.sendKeys("key");
			Thread.sleep(1000);
			CEPP.ClickOnServerParamsValue.sendKeys("value");
			Thread.sleep(1000);
			CEPP.ClickOnServerParamsDescription.sendKeys("name is required");
			Thread.sleep(1000);
			CEPP.ClickOnServerParamsRequiredCheckBox.click();

			CEPP.ClickOnServerParamsDynamicCheckBox.click();
			CEPP.ClickOnCreateButton.click();
			String title = CEPP.SuccessMsgPop.getText();
			System.out.println(title);
			if (title.equals("Proxy endpoint created successfully")) {
				child110.log(LogStatus.PASS, "Validation successful because we are getting message as '" + title
						+ "' when we verifying invoke api with only params'");
			} else {
				child110.log(LogStatus.FAIL, "Validation Unsuccessful because we are getting message as '" + title
						+ "'instead of  when we verifying invoke api with only params");
			}

		} catch (Exception e) {
			child110.log(LogStatus.FAIL, e.fillInStackTrace());
		}
		_extent_report.endTest(child110);

	}

	@Test(priority = 112, enabled = false, description = "verifying invoke api with only headers")
	public void VerifyingInvokeApiwithOnlyHeaders() throws Throwable {
		child111 = _extent_report.startTest("verifying invoke api with only headers");
		child111.assignCategory("Create Endpoint");
		try {

			Thread.sleep(3000);
			CEPP.CreateEndPointClick.click();
			driver.navigate().refresh();
			CEPP.EnterAPIName.sendKeys("Invokeapi" + api++);
			Thread.sleep(2000);
			CEPP.ClickOnDropdow.click();
			Thread.sleep(2000);
			CEPP.ClickOnInvokeAPIFromDropDown.click();
			Thread.sleep(2000);
			CEPP.ClickOnPollingIntervalDropdown.click();
			Thread.sleep(2000);
			CEPP.ClickOnPollingIntervalOnArrival.click();
			Thread.sleep(2000);
			CEPP.ClickOnProxyWebMethod.click();
			Thread.sleep(2000);
			CEPP.ClickOnGetMethod.click();

			Thread.sleep(2000);
			CEPP.EnterServerURL.sendKeys("https://20.55.8.64:7080//pcm/workflow");
			Thread.sleep(2000);
			CEPP.ClickOnHeaders.click();
			Thread.sleep(2000);
			CEPP.EnterHeadersKey.sendKeys("ttt");
			Thread.sleep(2000);
			CEPP.EnterHeadersValue.sendKeys("www");
			Thread.sleep(2000);
			CEPP.EnterHeadersDescription.sendKeys("eaera");
			CEPP.HeadersRequiredCheckBox.click();

			CEPP.HeadersDynamicCheckBox.click();

			CEPP.ClickOnCreateButton.click();
			String title = CEPP.SuccessMsgPop.getText();
			System.out.println(title);
			if (title.equals("Proxy endpoint created successfully")) {
				child111.log(LogStatus.PASS, "Validation successful because we are getting message as ''" + title
						+ "'' when we verifying invoke api with only headers'");
			} else {
				child111.log(LogStatus.FAIL, "Validation Unsuccessful because we are getting message as ''" + title
						+ "''instead of '' when we verifying invoke api with only headers'");
			}

		} catch (Exception e) {
			child111.log(LogStatus.FAIL, e.fillInStackTrace());
		}
		_extent_report.endTest(child111);

	}

	@Test(priority = 113, enabled = false, description = "verifying invoke api with only body")
	public void VerifyingInvokeApiwithOnlyBody() throws Throwable {
		child112 = _extent_report.startTest("verifying invoke api with only body");
		child112.assignCategory("Create Endpoint");
		try {

			Thread.sleep(3000);
			CEPP.CreateEndPointClick.click();
			driver.navigate().refresh();
			CEPP.EnterAPIName.sendKeys("Invokeapi" + api++);
			Thread.sleep(2000);
			CEPP.ClickOnDropdow.click();
			Thread.sleep(2000);
			CEPP.ClickOnInvokeAPIFromDropDown.click();
			Thread.sleep(2000);
			CEPP.ClickOnPollingIntervalDropdown.click();
			Thread.sleep(2000);
			CEPP.ClickOnPollingIntervalOnArrival.click();
			Thread.sleep(2000);
			CEPP.ClickOnProxyWebMethod.click();
			Thread.sleep(2000);
			CEPP.ClickOnPostMethod.click();

			Thread.sleep(2000);
			CEPP.EnterServerURL.sendKeys("https://20.55.8.64:7080//pcm/workflow");
			CEPP.ClickonBody.click();
			driver.findElement(By.xpath("//textarea")).sendKeys(Keys.chord(Keys.CONTROL, "a"),
					"{\r\n" + "\"addressLine1\": \"abc\",\r\n" + "\"addressLine2\": \"def\",\r\n"
							+ "\"createMailBoxInSI\": true,\r\n" + "\"customProfileName\": \"\",\r\n"
							+ "\"deleteAfterCollection\": true,\r\n" + "\"emailId\": \"tv100@gmail.com\",\r\n"
							+ "\"filter\": \"\",\r\n" + "\"ipWhiteList\": \"\",\r\n" + "\"hubInfo\": true,\r\n"
							+ "\"inMailBox\": \"/in\",\r\n" + "\"like\": true,\r\n" + "\"onlyPCM\": true,\r\n"
							+ "\"outMailBox\": \"/out\",\r\n" + "\"pemIdentifier\": \"\",\r\n"
							+ "\"pgpInfo\": \"test\",\r\n" + "\"phone\": \"1234564561\",\r\n" + "\"pkId\": \"\",\r\n"
							+ "\"poolingInterval\": \"ON\",\r\n" + "\"profileId\": \"testmail200\",\r\n"
							+ "\"profileName\": \"testmail200\",\r\n" + "\"protocol\": \"Mailbox\",\r\n"
							+ "\"status\": true\r\n" + "}");

			CEPP.ClickOnCreateButton.click();
			String title = CEPP.SuccessMsgPop.getText();
			System.out.println(title);
			if (title.equals("Proxy endpoint created successfully")) {
				child112.log(LogStatus.PASS, "Validation successful because we are getting message as ''" + title
						+ "'' when we verifying invoke api with only body'");
			} else {
				child112.log(LogStatus.FAIL, "Validation Unsuccessful because we are getting message as ''" + title
						+ "''instead of '' when we verifying invoke api with only body'");
			}

		} catch (Exception e) {
			child112.log(LogStatus.FAIL, e.fillInStackTrace());
		}
		_extent_report.endTest(child112);

	}

	@Test(priority = 114, enabled = false, description = "verifying create api with only server auth and Params")
	public void verifyingCreateAPiwithOnlyServerAuthAndParams() throws Throwable {
		child113 = _extent_report.startTest("verifying create api with only server auth and Params");
		child113.assignCategory("Create Endpoint");
		try {

			Thread.sleep(3000);
			CEPP.CreateEndPointClick.click();
			driver.navigate().refresh();
			CEPP.EnterAPIName.sendKeys("Invokeapi" + api++);
			Thread.sleep(2000);
			CEPP.ClickOnDropdow.click();
			Thread.sleep(2000);
			CEPP.ClickOnInvokeAPIFromDropDown.click();
			Thread.sleep(2000);
			CEPP.ClickOnPollingIntervalDropdown.click();
			Thread.sleep(2000);
			CEPP.ClickOnPollingIntervalOnArrival.click();
			Thread.sleep(2000);
			CEPP.ClickOnProxyWebMethod.click();
			Thread.sleep(2000);
			CEPP.ClickOnGetMethod.click();

			Thread.sleep(2000);
			CEPP.EnterServerURL.sendKeys("https://20.55.8.64:7080//pcm/workflow");
			Thread.sleep(2000);
			CEPP.ClickOnServerAuthorization.click();
			Thread.sleep(2000);
			CEPP.ClickOnAuthDropDown1.click();
			CEPP.SelectNoAuth.click();

			CEPP.ClickOnParams.click();
			Thread.sleep(2000);
			CEPP.ParamsKey.sendKeys("dSSd");
			Thread.sleep(2000);
			CEPP.ParamsValue.sendKeys("ssSSSs");
			Thread.sleep(2000);
			CEPP.ParamsDescription.sendKeys("dSSSdd");

			CEPP.ParamsRequiredCheckBox.click();

			CEPP.ParamsDynamicCheckBox.click();

			CEPP.ClickOnCreateButton.click();
			String title = CEPP.SuccessMsgPop.getText();
			System.out.println(title);
			if (title.equals("Proxy endpoint created successfully")) {
				child113.log(LogStatus.PASS, "Validation successful because we are getting message as ''" + title
						+ "'' when we verifying create api with only server auth and Params'");
			} else {
				child113.log(LogStatus.FAIL, "Validation Unsuccessful because we are getting message as ''" + title
						+ "''instead of '' when we verifying create api with only server auth and Params'");
			}

		} catch (Exception e) {
			child113.log(LogStatus.FAIL, e.fillInStackTrace());
		}
		_extent_report.endTest(child113);

	}

	@Test(priority = 115, enabled = false, description = "verifying create api with only server auth and Headers")
	public void verifyingCreateAPiwithOnlyServerAuthAndHeaders() throws Throwable {
		child114 = _extent_report.startTest("verifying create api with only server auth and Headers");
		child114.assignCategory("Create Endpoint");
		try {

			Thread.sleep(3000);
			CEPP.CreateEndPointClick.click();
			driver.navigate().refresh();
			CEPP.EnterAPIName.sendKeys("Invokeapi" + api++);
			Thread.sleep(2000);
			CEPP.ClickOnDropdow.click();
			Thread.sleep(2000);
			CEPP.ClickOnInvokeAPIFromDropDown.click();

			Thread.sleep(2000);
			CEPP.ClickOnPollingIntervalDropdown.click();
			Thread.sleep(2000);
			CEPP.ClickOnPollingIntervalOnArrival.click();
			Thread.sleep(2000);
			CEPP.ClickOnProxyWebMethod.click();
			Thread.sleep(2000);
			CEPP.ClickOnGetMethod.click();

			Thread.sleep(2000);
			CEPP.EnterServerURL.sendKeys("https://20.55.8.64:7080//pcm/workflow");
			Thread.sleep(2000);
			CEPP.ClickOnServerAuthorization.click();
			Thread.sleep(2000);
			CEPP.ClickOnAuthDropDown1.click();
			CEPP.SelectNoAuth.click();
			Thread.sleep(2000);
			CEPP.ClickOnHeaders.click();
			Thread.sleep(2000);
			CEPP.EnterHeadersKey.sendKeys("mmmm");
			Thread.sleep(2000);
			CEPP.EnterHeadersValue.sendKeys("bbbb");
			Thread.sleep(2000);
			CEPP.ClickOnHeadersRequiredCheckBox.sendKeys("uiopp");

			CEPP.HeadersRequiredCheckBox.click();

			CEPP.HeadersDynamicCheckBox.click();

			CEPP.ClickOnCreateButton.click();
			String title = CEPP.SuccessMsgPop.getText();
			System.out.println(title);
			if (title.equals("Proxy endpoint created successfully")) {
				child114.log(LogStatus.PASS, "Validation successful because we are getting message as ''" + title
						+ "'' when we verifying create api with only server auth and Headers'");
			} else {
				child114.log(LogStatus.FAIL, "Validation Unsuccessful because we are getting message as ''" + title
						+ "''instead of '' when we verifying create api with only server auth and Headers'");
			}

		} catch (Exception e) {
			child114.log(LogStatus.FAIL, e.fillInStackTrace());
		}
		_extent_report.endTest(child114);

	}

	@Test(priority = 116, enabled = false, description = "verifying create api with only server auth and Body")
	public void VerifyingCreateApiwithOnlyServerAuthandBody() throws Throwable {
		child115 = _extent_report.startTest("verifying invoke api with only body");
		child115.assignCategory("Create Endpoint");
		try {

			Thread.sleep(3000);
			CEPP.CreateEndPointClick.click();
			driver.navigate().refresh();
			CEPP.EnterAPIName.sendKeys("Invokeapi" + api++);
			Thread.sleep(2000);
			CEPP.ClickOnDropdow.click();
			Thread.sleep(2000);
			CEPP.ClickOnInvokeAPIFromDropDown.click();
			Thread.sleep(2000);
			CEPP.ClickOnPollingIntervalDropdown.click();
			Thread.sleep(2000);
			CEPP.ClickOnPollingIntervalOnArrival.click();
			Thread.sleep(2000);
			CEPP.ClickOnProxyWebMethod.click();
			Thread.sleep(2000);
			CEPP.ClickOnPostMethod.click();

			Thread.sleep(2000);
			CEPP.EnterServerURL.sendKeys("https://20.55.8.64:7080//pcm/workflow");
			CEPP.ClickOnServerAuthorization.click();
			Thread.sleep(2000);
			CEPP.ClickOnAuthDropDown1.click();
			CEPP.SelectNoAuth.click();
			CEPP.ClickonBody.click();
			driver.findElement(By.xpath("//textarea")).sendKeys(Keys.chord(Keys.CONTROL, "a"),
					"{\r\n" + "\"addressLine1\": \"abc\",\r\n" + "\"addressLine2\": \"def\",\r\n"
							+ "\"createMailBoxInSI\": true,\r\n" + "\"customProfileName\": \"\",\r\n"
							+ "\"deleteAfterCollection\": true,\r\n" + "\"emailId\": \"tv100@gmail.com\",\r\n"
							+ "\"filter\": \"\",\r\n" + "\"ipWhiteList\": \"\",\r\n" + "\"hubInfo\": true,\r\n"
							+ "\"inMailBox\": \"/in\",\r\n" + "\"like\": true,\r\n" + "\"onlyPCM\": true,\r\n"
							+ "\"outMailBox\": \"/out\",\r\n" + "\"pemIdentifier\": \"\",\r\n"
							+ "\"pgpInfo\": \"test\",\r\n" + "\"phone\": \"1234564561\",\r\n" + "\"pkId\": \"\",\r\n"
							+ "\"poolingInterval\": \"ON\",\r\n" + "\"profileId\": \"testmail200\",\r\n"
							+ "\"profileName\": \"testmail200\",\r\n" + "\"protocol\": \"Mailbox\",\r\n"
							+ "\"status\": true\r\n" + "}");

			CEPP.ClickOnCreateButton.click();
			String title = CEPP.SuccessMsgPop.getText();
			System.out.println(title);
			if (title.equals("Proxy endpoint created successfully")) {
				child115.log(LogStatus.PASS, "Validation successful because we are getting message as ''" + title
						+ "'' when we verifying invoke api with only body'");
			} else {
				child115.log(LogStatus.FAIL, "Validation Unsuccessful because we are getting message as ''" + title
						+ "''instead of '' when we verifying invoke api with only body'");
			}

		} catch (Exception e) {
			child115.log(LogStatus.FAIL, e.fillInStackTrace());
		}
		_extent_report.endTest(child115);

	}

	@Test(priority = 117, enabled = false, description = "verifying create api with only params and body")
	public void verifyingCreateApiwithOnlyParamsAndBody() throws Throwable {
		child116 = _extent_report.startTest("verifying create api with only params and body");
		child116.assignCategory("Create Endpoint");
		try {

			Thread.sleep(3000);
			CEPP.CreateEndPointClick.click();
			driver.navigate().refresh();
			CEPP.EnterAPIName.sendKeys("Invokeapi" + api++);
			Thread.sleep(2000);
			CEPP.ClickOnDropdow.click();
			Thread.sleep(2000);
			CEPP.ClickOnInvokeAPIFromDropDown.click();
			Thread.sleep(2000);
			CEPP.ClickOnPollingIntervalDropdown.click();
			Thread.sleep(2000);
			CEPP.ClickOnPollingIntervalOnArrival.click();
			Thread.sleep(2000);
			CEPP.ClickOnProxyWebMethod.click();
			Thread.sleep(2000);
			CEPP.ClickOnPostMethod.click();

			Thread.sleep(2000);
			CEPP.EnterServerURL.sendKeys("https://20.55.8.64:7080//pcm/workflow");
			CEPP.ClickOnServerAuthorization.click();
			Thread.sleep(2000);
			CEPP.ClickOnAuthDropDown1.click();
			CEPP.SelectNoAuth.click();

			CEPP.ClickOnParams.click();
			Thread.sleep(2000);
			CEPP.ParamsKey.sendKeys("dSSd");
			Thread.sleep(2000);
			CEPP.ParamsValue.sendKeys("ssSSSs");
			Thread.sleep(2000);
			CEPP.ParamsDescription.sendKeys("dSSSdd");

			CEPP.ParamsRequiredCheckBox.click();

			CEPP.ParamsDynamicCheckBox.click();

			CEPP.ClickonBody.click();
			driver.findElement(By.xpath("//textarea")).sendKeys(Keys.chord(Keys.CONTROL, "a"),
					"{\r\n" + "\"addressLine1\": \"abc\",\r\n" + "\"addressLine2\": \"def\",\r\n"
							+ "\"createMailBoxInSI\": true,\r\n" + "\"customProfileName\": \"\",\r\n"
							+ "\"deleteAfterCollection\": true,\r\n" + "\"emailId\": \"tv100@gmail.com\",\r\n"
							+ "\"filter\": \"\",\r\n" + "\"ipWhiteList\": \"\",\r\n" + "\"hubInfo\": true,\r\n"
							+ "\"inMailBox\": \"/in\",\r\n" + "\"like\": true,\r\n" + "\"onlyPCM\": true,\r\n"
							+ "\"outMailBox\": \"/out\",\r\n" + "\"pemIdentifier\": \"\",\r\n"
							+ "\"pgpInfo\": \"test\",\r\n" + "\"phone\": \"1234564561\",\r\n" + "\"pkId\": \"\",\r\n"
							+ "\"poolingInterval\": \"ON\",\r\n" + "\"profileId\": \"testmail200\",\r\n"
							+ "\"profileName\": \"testmail200\",\r\n" + "\"protocol\": \"Mailbox\",\r\n"
							+ "\"status\": true\r\n" + "}");

			CEPP.ClickOnCreateButton.click();
			String title = CEPP.SuccessMsgPop.getText();
			System.out.println(title);
			if (title.equals("Proxy endpoint created successfully")) {
				child116.log(LogStatus.PASS, "Validation successful because we are getting message as ''" + title
						+ "'' when we verifying create api with only params and body'");
			} else {
				child116.log(LogStatus.FAIL, "Validation Unsuccessful because we are getting message as ''" + title
						+ "''instead of '' when we verifying create api with only params and body'");
			}

		} catch (Exception e) {
			child116.log(LogStatus.FAIL, e.fillInStackTrace());
		}
		_extent_report.endTest(child116);

	}

	@Test(priority = 118, enabled = false, description = "verifying create api with only headers  and body")
	public void VerifyingCreateAPIwithOnlyHeadersAndBody() throws Throwable {
		child117 = _extent_report.startTest("verifying create api with only headers  and body");
		child117.assignCategory("Create Endpoint");
		try {

			Thread.sleep(3000);
			CEPP.CreateEndPointClick.click();
			driver.navigate().refresh();
			CEPP.EnterAPIName.sendKeys("Invokeapi" + api++);
			Thread.sleep(2000);
			CEPP.ClickOnDropdow.click();
			Thread.sleep(2000);
			CEPP.ClickOnInvokeAPIFromDropDown.click();
			Thread.sleep(2000);
			CEPP.ClickOnPollingIntervalDropdown.click();
			Thread.sleep(2000);
			CEPP.ClickOnPollingIntervalOnArrival.click();
			Thread.sleep(2000);
			CEPP.ClickOnProxyWebMethod.click();
			Thread.sleep(2000);
			CEPP.ClickOnPostMethod.click();

			Thread.sleep(2000);
			CEPP.EnterServerURL.sendKeys("https://20.55.8.64:7080//pcm/workflow");
			CEPP.ClickOnServerAuthorization.click();
			Thread.sleep(2000);
			CEPP.ClickOnAuthDropDown1.click();
			CEPP.SelectNoAuth.click();
			Thread.sleep(2000);

			Thread.sleep(2000);
			CEPP.ClickOnHeaders.click();
			Thread.sleep(2000);
			CEPP.EnterHeadersKey.sendKeys("mmmm");
			Thread.sleep(2000);
			CEPP.EnterHeadersValue.sendKeys("bbbb");
			Thread.sleep(2000);
			CEPP.ClickOnHeadersRequiredCheckBox.sendKeys("uiopp");

			CEPP.HeadersRequiredCheckBox.click();

			CEPP.HeadersDynamicCheckBox.click();

			CEPP.ClickonBody.click();
			driver.findElement(By.xpath("//textarea")).sendKeys(Keys.chord(Keys.CONTROL, "a"),
					"{\r\n" + "\"addressLine1\": \"abc\",\r\n" + "\"addressLine2\": \"def\",\r\n"
							+ "\"createMailBoxInSI\": true,\r\n" + "\"customProfileName\": \"\",\r\n"
							+ "\"deleteAfterCollection\": true,\r\n" + "\"emailId\": \"tv100@gmail.com\",\r\n"
							+ "\"filter\": \"\",\r\n" + "\"ipWhiteList\": \"\",\r\n" + "\"hubInfo\": true,\r\n"
							+ "\"inMailBox\": \"/in\",\r\n" + "\"like\": true,\r\n" + "\"onlyPCM\": true,\r\n"
							+ "\"outMailBox\": \"/out\",\r\n" + "\"pemIdentifier\": \"\",\r\n"
							+ "\"pgpInfo\": \"test\",\r\n" + "\"phone\": \"1234564561\",\r\n" + "\"pkId\": \"\",\r\n"
							+ "\"poolingInterval\": \"ON\",\r\n" + "\"profileId\": \"testmail200\",\r\n"
							+ "\"profileName\": \"testmail200\",\r\n" + "\"protocol\": \"Mailbox\",\r\n"
							+ "\"status\": true\r\n" + "}");

			CEPP.ClickOnCreateButton.click();
			String title = CEPP.SuccessMsgPop.getText();
			System.out.println(title);
			if (title.equals("Proxy endpoint created successfully")) {
				child117.log(LogStatus.PASS, "Validation successful because we are getting message as ''" + title
						+ "'' when we verifying create api with only params and body'");
			} else {
				child117.log(LogStatus.FAIL, "Validation Unsuccessful because we are getting message as ''" + title
						+ "''instead of '' when we verifying create api with only params and body'");
			}

		} catch (Exception e) {
			child117.log(LogStatus.FAIL, e.fillInStackTrace());
		}
		_extent_report.endTest(child117);

	}

	@Test(priority = 119, enabled = false, description = "verifying create api with server auth,params and headers")
	public void VerifyingCreateApiWithServerAuthParamsAndHeaders() throws Throwable {
		child118 = _extent_report.startTest("verifying create api with server auth,params and headers");
		child118.assignCategory("Create Endpoint");
		try {

			Thread.sleep(3000);
			CEPP.CreateEndPointClick.click();
			driver.navigate().refresh();
			CEPP.EnterAPIName.sendKeys("Invokeapi" + api++);
			Thread.sleep(2000);
			CEPP.ClickOnDropdow.click();
			Thread.sleep(2000);
			CEPP.ClickOnInvokeAPIFromDropDown.click();
			Thread.sleep(2000);
			CEPP.ClickOnPollingIntervalDropdown.click();
			Thread.sleep(2000);
			CEPP.ClickOnPollingIntervalOnArrival.click();
			Thread.sleep(2000);
			CEPP.ClickOnProxyWebMethod.click();
			Thread.sleep(2000);
			CEPP.ClickOnGetMethod.click();

			Thread.sleep(2000);
			CEPP.EnterServerURL.sendKeys("https://20.55.8.64:7080//pcm/workflow");
			CEPP.ClickOnServerAuthorization.click();
			Thread.sleep(2000);
			CEPP.ClickOnAuthDropDown1.click();
			CEPP.SelectNoAuth.click();

			CEPP.ClickOnParams.click();
			Thread.sleep(2000);
			CEPP.ParamsKey.sendKeys("dSSd");
			Thread.sleep(2000);
			CEPP.ParamsValue.sendKeys("ssSSSs");
			Thread.sleep(2000);
			CEPP.ParamsDescription.sendKeys("dSSSdd");

			CEPP.ParamsRequiredCheckBox.click();

			CEPP.ParamsDynamicCheckBox.click();

			CEPP.ClickOnHeaders.click();
			Thread.sleep(2000);
			CEPP.EnterHeadersKey.sendKeys("mmmGm");
			Thread.sleep(2000);
			CEPP.EnterHeadersValue.sendKeys("bbJbb");
			Thread.sleep(2000);
			CEPP.ClickOnHeadersRequiredCheckBox.sendKeys("uiopIUUp");

			CEPP.HeadersRequiredCheckBox.click();

			CEPP.HeadersDynamicCheckBox.click();

			CEPP.ClickOnCreateButton.click();
			String title = CEPP.SuccessMsgPop.getText();
			System.out.println(title);
			if (title.equals("Proxy endpoint created successfully")) {
				child118.log(LogStatus.PASS, "Validation successful because we are getting message as ''" + title
						+ "'' when we verifying create api with only params and body'");
			} else {
				child118.log(LogStatus.FAIL, "Validation Unsuccessful because we are getting message as ''" + title
						+ "''instead of '' when we verifying create api with only params and body'");
			}

		} catch (Exception e) {
			child118.log(LogStatus.FAIL, e.fillInStackTrace());
		}
		_extent_report.endTest(child118);

	}

	@Test(priority = 120, enabled = false, description = "verifying create api with server auth,params and body")
	public void VerifyingCreateApiWithServerAuthParamsAndBody() throws Throwable {
		child119 = _extent_report.startTest("verifying create api with server auth,params and body");
		child119.assignCategory("Create Endpoint");
		try {

			Thread.sleep(3000);
			CEPP.CreateEndPointClick.click();
			driver.navigate().refresh();
			CEPP.EnterAPIName.sendKeys("Invokeapi" + api++);
			Thread.sleep(2000);
			CEPP.ClickOnDropdow.click();
			Thread.sleep(2000);
			CEPP.ClickOnInvokeAPIFromDropDown.click();
			Thread.sleep(2000);
			CEPP.ClickOnPollingIntervalDropdown.click();
			Thread.sleep(2000);
			CEPP.ClickOnPollingIntervalOnArrival.click();
			Thread.sleep(2000);
			CEPP.ClickOnProxyWebMethod.click();
			Thread.sleep(2000);
			CEPP.ClickOnPostMethod.click();

			Thread.sleep(2000);
			CEPP.EnterServerURL.sendKeys("https://20.55.8.64:7080//pcm/workflow");
			CEPP.ClickOnServerAuthorization.click();
			Thread.sleep(2000);
			CEPP.ClickOnAuthDropDown1.click();
			CEPP.SelectNoAuth.click();

			CEPP.ClickOnParams.click();
			Thread.sleep(2000);
			CEPP.ParamsKey.sendKeys("dSSd");
			Thread.sleep(2000);
			CEPP.ParamsValue.sendKeys("ssSSSs");
			Thread.sleep(2000);
			CEPP.ParamsDescription.sendKeys("dSSSdd");

			CEPP.ParamsRequiredCheckBox.click();

			CEPP.ParamsDynamicCheckBox.click();

			CEPP.ClickonBody.click();
			driver.findElement(By.xpath("//textarea")).sendKeys(Keys.chord(Keys.CONTROL, "a"),
					"{\r\n" + "\"addressLine1\": \"abc\",\r\n" + "\"addressLine2\": \"def\",\r\n"
							+ "\"createMailBoxInSI\": true,\r\n" + "\"customProfileName\": \"\",\r\n"
							+ "\"deleteAfterCollection\": true,\r\n" + "\"emailId\": \"tv100@gmail.com\",\r\n"
							+ "\"filter\": \"\",\r\n" + "\"ipWhiteList\": \"\",\r\n" + "\"hubInfo\": true,\r\n"
							+ "\"inMailBox\": \"/in\",\r\n" + "\"like\": true,\r\n" + "\"onlyPCM\": true,\r\n"
							+ "\"outMailBox\": \"/out\",\r\n" + "\"pemIdentifier\": \"\",\r\n"
							+ "\"pgpInfo\": \"test\",\r\n" + "\"phone\": \"1234564561\",\r\n" + "\"pkId\": \"\",\r\n"
							+ "\"poolingInterval\": \"ON\",\r\n" + "\"profileId\": \"testmail200\",\r\n"
							+ "\"profileName\": \"testmail200\",\r\n" + "\"protocol\": \"Mailbox\",\r\n"
							+ "\"status\": true\r\n" + "}");

			CEPP.ClickOnCreateButton.click();
			String title = CEPP.SuccessMsgPop.getText();
			System.out.println(title);
			if (title.equals("Proxy endpoint created successfully")) {
				child119.log(LogStatus.PASS, "Validation successful because we are getting message as ''" + title
						+ "'' when we verifying create api with only params and body'");
			} else {
				child119.log(LogStatus.FAIL, "Validation Unsuccessful because we are getting message as ''" + title
						+ "''instead of '' when we verifying create api with only params and body'");
			}

		} catch (Exception e) {
			child119.log(LogStatus.FAIL, e.fillInStackTrace());
		}
		_extent_report.endTest(child119);

	}

	@Test(priority = 121, enabled = false, description = "verifying create api with server auth params headers and body")
	public void VerifyingCreateAPIwithServerAuthParamsHeadersAndBody() throws Throwable {
		child120 = _extent_report.startTest("verifying create api with server auth, params ,headers and body");
		child120.assignCategory("Create Endpoint");
		try {

			Thread.sleep(3000);
			CEPP.CreateEndPointClick.click();
			driver.navigate().refresh();
			CEPP.EnterAPIName.sendKeys("Invokeapi" + api++);
			Thread.sleep(2000);
			CEPP.ClickOnDropdow.click();
			Thread.sleep(2000);
			CEPP.ClickOnInvokeAPIFromDropDown.click();
			Thread.sleep(2000);
			CEPP.ClickOnPollingIntervalDropdown.click();
			Thread.sleep(2000);
			CEPP.ClickOnPollingIntervalOnArrival.click();
			Thread.sleep(2000);
			CEPP.ClickOnProxyWebMethod.click();
			Thread.sleep(2000);
			CEPP.ClickOnPostMethod.click();

			Thread.sleep(2000);
			CEPP.EnterServerURL.sendKeys("https://20.55.8.64:7080//pcm/workflow");
			CEPP.ClickOnServerAuthorization.click();
			Thread.sleep(2000);
			CEPP.ClickOnAuthDropDown1.click();
			CEPP.SelectNoAuth.click();

			CEPP.ClickOnParams.click();
			Thread.sleep(2000);
			CEPP.ParamsKey.sendKeys("dSSd");
			Thread.sleep(2000);
			CEPP.ParamsValue.sendKeys("ssSSSs");
			Thread.sleep(2000);
			CEPP.ParamsDescription.sendKeys("dSSSdd");

			CEPP.ParamsRequiredCheckBox.click();

			CEPP.ParamsDynamicCheckBox.click();
			Thread.sleep(2000);
			CEPP.ClickOnHeaders.click();
			Thread.sleep(2000);
			CEPP.EnterHeadersKey.sendKeys("mmmGm");
			Thread.sleep(2000);
			CEPP.EnterHeadersValue.sendKeys("bbJbb");
			Thread.sleep(2000);
			CEPP.ClickOnHeadersRequiredCheckBox.sendKeys("uiopIUUp");

			CEPP.HeadersRequiredCheckBox.click();

			CEPP.HeadersDynamicCheckBox.click();
			CEPP.ClickonBody.click();
			driver.findElement(By.xpath("//textarea")).sendKeys(Keys.chord(Keys.CONTROL, "a"),
					"{\r\n" + "\"addressLine1\": \"abc\",\r\n" + "\"addressLine2\": \"def\",\r\n"
							+ "\"createMailBoxInSI\": true,\r\n" + "\"customProfileName\": \"\",\r\n"
							+ "\"deleteAfterCollection\": true,\r\n" + "\"emailId\": \"tv100@gmail.com\",\r\n"
							+ "\"filter\": \"\",\r\n" + "\"ipWhiteList\": \"\",\r\n" + "\"hubInfo\": true,\r\n"
							+ "\"inMailBox\": \"/in\",\r\n" + "\"like\": true,\r\n" + "\"onlyPCM\": true,\r\n"
							+ "\"outMailBox\": \"/out\",\r\n" + "\"pemIdentifier\": \"\",\r\n"
							+ "\"pgpInfo\": \"test\",\r\n" + "\"phone\": \"1234564561\",\r\n" + "\"pkId\": \"\",\r\n"
							+ "\"poolingInterval\": \"ON\",\r\n" + "\"profileId\": \"testmail200\",\r\n"
							+ "\"profileName\": \"testmail200\",\r\n" + "\"protocol\": \"Mailbox\",\r\n"
							+ "\"status\": true\r\n" + "}");

			CEPP.ClickOnCreateButton.click();
			String title = CEPP.SuccessMsgPop.getText();
			System.out.println(title);
			if (title.equals("Proxy endpoint created successfully")) {
				child120.log(LogStatus.PASS, "Validation successful because we are getting message as ''" + title
						+ "'' when we verifying create api with server auth, params ,headers and body'");
			} else {
				child120.log(LogStatus.FAIL, "Validation Unsuccessful because we are getting message as ''" + title
						+ "''instead of '' when we verifying create api with server auth, params ,headers and body'");
			}

		} catch (Exception e) {
			child120.log(LogStatus.FAIL, e.fillInStackTrace());
		}
		_extent_report.endTest(child120);

	}

	@AfterTest
	public void afterTest() {

		_test_logger3.appendChild(Parent6);

		Parent6.appendChild(child1).appendChild(child2).appendChild(child3).appendChild(child4).appendChild(child5)
				.appendChild(child6).appendChild(child7).appendChild(child8).appendChild(child9).appendChild(child10)
				.appendChild(child11).appendChild(child12).appendChild(child13).appendChild(child14)
				.appendChild(child15).appendChild(child16).appendChild(child17).appendChild(child18)
				.appendChild(child19).appendChild(child20).appendChild(child21).appendChild(child22)
				.appendChild(child23).appendChild(child24).appendChild(child25).appendChild(child26)
				.appendChild(child27).appendChild(child28).appendChild(child29).appendChild(child30)
				.appendChild(child31).appendChild(child32).appendChild(child33).appendChild(child34)
				.appendChild(child35).appendChild(child36).appendChild(child37).appendChild(child38)
				.appendChild(child39).appendChild(child40).appendChild(child41).appendChild(child42)
				.appendChild(child43).appendChild(child44).appendChild(child45).appendChild(child46)
				.appendChild(child47).appendChild(child48).appendChild(child49).appendChild(child50)
				.appendChild(child51).appendChild(child52).appendChild(child53).appendChild(child54)
				.appendChild(child55).appendChild(child56).appendChild(child57).appendChild(child58)
				.appendChild(child59).appendChild(child60).appendChild(child61).appendChild(child62)
				.appendChild(child63).appendChild(child64).appendChild(child65).appendChild(child66)
				.appendChild(child67).appendChild(child68).appendChild(child69).appendChild(child70)
				.appendChild(child71).appendChild(child72).appendChild(child73).appendChild(child74)
				.appendChild(child75).appendChild(child76).appendChild(child77).appendChild(child78)
				.appendChild(child79).appendChild(child80).appendChild(child81).appendChild(child82)
				.appendChild(child83).appendChild(child84).appendChild(child85).appendChild(child86)
				.appendChild(child87).appendChild(child88).appendChild(child89).appendChild(child90)
				.appendChild(child91).appendChild(child92).appendChild(child93).appendChild(child94)
				.appendChild(child95).appendChild(child96).appendChild(child97).appendChild(child98)
				.appendChild(child99).appendChild(child100)/*.appendChild(child101).appendChild(child102)
				.appendChild(child103).appendChild(child104).appendChild(child105).appendChild(child106)
				.appendChild(child107).appendChild(child108).appendChild(child109).appendChild(child110)
				.appendChild(child111).appendChild(child112).appendChild(child113).appendChild(child114)
				.appendChild(child115).appendChild(child116).appendChild(child117).appendChild(child118)
				.appendChild(child119).appendChild(child120)*/;

		_extent_report.endTest(Parent6);
		_extent_report.endTest(_test_logger3);
		_extent_report.flush();

	}

}
