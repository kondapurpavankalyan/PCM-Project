package com.pcm.qa.testcases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.pcm.qa.base.TestBase;
import com.pcm.qa.pages.SearchPage;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class SearchPageTest extends TestBase {

	SearchPage SP;

	public ExtentTest Parent1;
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

	public SearchPageTest() {
		super();
	}

	@BeforeTest
	public void setUp() throws InterruptedException {

		initialization();
		Extentreport();

	}

	@BeforeMethod
	public void createobject() {

		SP = new SearchPage();

	}

	@Test(priority = 1, enabled = true)
	public void ParentNodeCreation() {

		_test_logger1 = _extent_report.startTest("File Transfers");
		Parent1 = _extent_report.startTest("Search");

	}

	@Test(priority = 2, enabled = true, description = "Search Page Title Verification")
	public void SearchPageTitleTest() throws InterruptedException {

		child1 = _extent_report.startTest("Search Page Title Verification");
		child1.assignCategory("Search");

		try {

			Thread.sleep(2000);
			String title = SearchPage.validateSearchPageTitle();

			if (title.equals("Home / File Transfers")) {

				child1.log(LogStatus.PASS,
						"Validation Successful because we are getting SearchFilePage title as '" + title + "'");

			} else {

				child1.log(LogStatus.FAIL, "Validation  unsuccessful because we are getting SearchFilePage title as '"
						+ title + "' instead of Home / File Transfers");
			}
		} catch (Exception e) {

			child1.log(LogStatus.FAIL, e.fillInStackTrace());

		}

		_extent_report.endTest(child1);

	}

	@Test(priority = 3, enabled = true, description = "Verifying whether User should  able to get the valid records when we search with valid date")
	public void validateSearchPageWithValidDate() throws Exception {

		child2 = _extent_report.startTest(
				"Verifying whether User should  able to get the valid records when we search with valid date");
		child2.assignCategory("Search");

		try {

			Thread.sleep(2000);
			SP.ValidateSearchResultWithValidDate();
			Thread.sleep(2000);
			Boolean flag = SP.Actionsicon.isDisplayed();
			String title = flag.toString();

			if (title.equalsIgnoreCase("true")) {

				child2.log(LogStatus.PASS,
						"Validation Successful because Records have been displayed when we search with valid date");

			} else {

				child2.log(LogStatus.FAIL,
						"Validation Unsuccessful because No Records have been displayed when we search with valid date");

			}
		} catch (org.openqa.selenium.InvalidSelectorException e) {

			child2.log(LogStatus.FAIL, e.fillInStackTrace());

		}

		_extent_report.endTest(child2);

	}

	@Test(priority = 4, enabled = true, description = "Verifying whether User should  able to get the valid records when we search with valid date, Direction.")
	public void validateSearchPageWithDirection() throws Throwable {

		child3 = _extent_report.startTest(
				"Verifying whether User should  able to get the valid records when we search with valid date, Direction.");
		child3.assignCategory("Search");

		try {

			Thread.sleep(2000);
			SP.ValidateSearchResultWithDirection();
			Thread.sleep(2000);
			Boolean flag = SP.Actionsicon.isDisplayed();
			String title = flag.toString();
			System.out.println(title);
			if (title.equalsIgnoreCase("true")) {

				child3.log(LogStatus.PASS,
						"Validation Successful because results are displayed when we search with valid Date , Direction");

			} else {

				child3.log(LogStatus.FAIL,
						"Validation Unsuccessful because results are not displayed when we search with valid Date, direction");
			}
		} catch (Exception e) {

			child3.log(LogStatus.FAIL, e.fillInStackTrace());

		}

		_extent_report.endTest(child3);

	}

	@Test(priority = 5, enabled = true, description = "Verifying whether User should  able to get the valid records when we search with valid date, Transfer Type.")
	public void ValidateSearchPageWithTransferType() throws Throwable {

		child4 = _extent_report.startTest(
				"Verifying whether User should  able to get the valid records when we search with valid date, Transfer Type.");
		child4.assignCategory("Search");

		try {

			Thread.sleep(2000);
			SP.ValidateSearchResultWithTransferType();
			Thread.sleep(2000);
			Boolean flag = SP.Actionsicon.isDisplayed();
			String title = flag.toString();

			if (title.equalsIgnoreCase("true")) {

				child4.log(LogStatus.PASS,
						"Validation Successful because results are displayed when we search with valid Date , transfertype");

			} else {

				child4.log(LogStatus.FAIL,
						"Validation Unsuccessful because results are not displayed when we search with valid Date,transfertype");

			}
		} catch (Exception e) {

			child4.log(LogStatus.FAIL, e.fillInStackTrace());

		}

		_extent_report.endTest(child4);

	}

	@Test(priority = 6, enabled = true, description = "Verifying whether User should  able to get the valid records when we search with valid date, Doc Type.")
	public void ValidateSearchPagewithDocType() throws Throwable {

		child5 = _extent_report.startTest(
				"Verifying whether User should  able to get the valid records when we search with valid date, Doc Type.");
		child5.assignCategory("Search");

		try {

			Thread.sleep(2000);
			SP.ValidateSearchResultWithDocType();
			Thread.sleep(2000);
			Boolean flag = SP.Actionsicon.isDisplayed();
			String title = flag.toString();

			if (title.equalsIgnoreCase("true")) {

				child5.log(LogStatus.PASS,
						"Validation Successful because results are displayed when we search with valid Date,doctype");

			} else {

				child5.log(LogStatus.FAIL,
						"Validation Unsuccessful because results are not displayed when we search with valid Date,doctype");

			}
		} catch (Exception e) {

			child5.log(LogStatus.FAIL, e.fillInStackTrace());

		}

		_extent_report.endTest(child5);

	}

	@Test(priority = 7, enabled = true, description = "Verifying whether User should  able to get the valid records when we search with valid date, Status dropdown")
	public void ValidateSearchPagewithStatus() throws Throwable {

		child6 = _extent_report.startTest(
				"Verifying whether User should  able to get the valid records when we search with valid date, Status dropdown");
		child6.assignCategory("Search");

		try {

			Thread.sleep(2000);
			SP.ValidateSearchResultWithStatus();
			Thread.sleep(2000);
			Boolean flag = SP.Actionsicon.isDisplayed();
			String title = flag.toString();

			if (title.equalsIgnoreCase("true")) {

				child6.log(LogStatus.PASS,
						"Validation Successful because results are displayed when we search with valid Date,status");

			} else {

				child6.log(LogStatus.FAIL,
						"Validation Unsuccessful because results are not displayed when we search with valid Date,status");

			}
		} catch (Exception e) {

			child6.log(LogStatus.FAIL, e.fillInStackTrace());

		}

		_extent_report.endTest(child6);

	}

	@Test(priority = 8, enabled = true, description = "Verifying whether User should able to get the valid records when we search with valid date, Source Protocol")
	public void ValidateSearchPagewithSrcProtocol() throws Throwable {

		child7 = _extent_report.startTest(
				"Verifying whether User should able to get the valid records when we search with valid date, Source Protocol");
		child7.assignCategory("Search");

		try {

			Thread.sleep(2000);
			SP.ValidateSearchResultWithSourceProtocol();
			Thread.sleep(2000);
			Boolean flag = SP.Actionsicon.isDisplayed();
			String title = flag.toString();

			if (title.equalsIgnoreCase("true")) {

				child7.log(LogStatus.PASS,
						"Validation Successful because results are displayed when we search with valid Date,source protocol");

			} else {

				child7.log(LogStatus.FAIL,
						"Validation Unsuccessful because results are not displayed when we search with valid Date,src protocol");

			}
		} catch (Exception e) {

			child7.log(LogStatus.FAIL, e.fillInStackTrace());

		}

		_extent_report.endTest(child7);

	}

	@Test(priority = 9, enabled = true, description = "Verifying whether User should able to get the valid records when we search with valid date, Dest. Protocol")
	public void ValidateSearchPagewithDestProtocol() throws Throwable {

		child8 = _extent_report.startTest(
				"Verifying whether User should able to get the valid records when we search with valid date, Dest. Protocol");
		child8.assignCategory("Search");

		try {

			Thread.sleep(2000);
			SP.ValidateSearchResultWithDestProtocol();
			Thread.sleep(2000);
			Boolean flag = SP.Actionsicon.isDisplayed();
			String title = flag.toString();

			if (title.equalsIgnoreCase("true")) {

				child8.log(LogStatus.PASS,
						"Validation Successful because results are displayed when we search with valid Date,dest protocol");

			} else {

				child8.log(LogStatus.FAIL,
						"Validation Unsuccessful because results are not displayed when we search with valid Date,dest protocol");

			}
		} catch (Exception e) {

			child8.log(LogStatus.FAIL, e.fillInStackTrace());

		}

		_extent_report.endTest(child8);

	}

	@Test(priority = 10, enabled = true, description = "Verifying whether  User should able to get the valid records when we search with valid date, Partner")
	public void ValidateSearchPagewithPartner() throws Throwable {

		child9 = _extent_report.startTest(
				"Verifying whether  User should able to get the valid records when we search with valid date, Partner");
		child9.assignCategory("Search");

		try {

			Thread.sleep(2000);
			SP.ValidateSearchResultWithpartner();
			Thread.sleep(2000);
			Boolean flag = SP.Actionsicon.isDisplayed();
			String title = flag.toString();
			System.out.println(title);
			if (title.equalsIgnoreCase("true")) {

				child9.log(LogStatus.PASS,
						"Validation Successful because results are displayed when we search with valid Date,partner");

			} else {

				child9.log(LogStatus.FAIL,
						"Validation Unsuccessful because results are not displayed when we search with valid Date,partner");

			}
		} catch (Exception e) {

			child9.log(LogStatus.FAIL, e.fillInStackTrace());

		}

		_extent_report.endTest(child9);

	}

	@Test(priority = 11, enabled = true, description = "Verifying whether  User should able to get the valid records when we search with valid date, Application")
	public void ValidateSearchPagewithApplication() throws Throwable {

		child10 = _extent_report.startTest(
				"Verifying whether  User should able to get the valid records when we search with valid date, Application");
		child10.assignCategory("Search");

		try {

			Thread.sleep(2000);
			SP.ValidateSearchResultWithApplication();
			Thread.sleep(2000);
			Boolean flag = SP.Actionsicon.isDisplayed();
			String title = flag.toString();

			if (title.equalsIgnoreCase("true")) {

				child10.log(LogStatus.PASS,
						"Validation Successful because results are displayed when we search with valid Date,Application");

			} else {

				child10.log(LogStatus.FAIL,
						"Validation Unsuccessful because results are not displayed when we search with valid Date,Application");

			}
		} catch (Exception e) {

			child10.log(LogStatus.FAIL, e.fillInStackTrace());

		}

		_extent_report.endTest(child10);

	}

	@Test(priority = 12, enabled = true, description = "Verifying whether  User should able to get the valid records when we search with valid date, SenderId")
	public void ValidateSearchPagewithSenderId() throws Throwable {

		child11 = _extent_report.startTest(
				"Verifying whether  User should able to get the valid records when we search with valid date, SenderId");
		child11.assignCategory("Search");

		try {

			Thread.sleep(2000);
			SP.ValidateSearchResultWithSenderId();
			Thread.sleep(2000);
			Boolean flag = SP.Actionsicon.isDisplayed();
			String title = flag.toString();

			if (title.equalsIgnoreCase("true")) {

				child11.log(LogStatus.PASS,
						"Validation Successful because results are displayed when we search with valid Date,SenderId");

			} else {

				child11.log(LogStatus.FAIL,
						"Validation Unsuccessful because results are not displayed when we search with valid Date,SenderId");

			}
		} catch (Exception e) {

			child11.log(LogStatus.FAIL, e.fillInStackTrace());

		}

		_extent_report.endTest(child11);

	}

	@Test(priority = 13, enabled = true, description = "Verifying whether  User should able to get the valid records when we search with valid date, ReceiverId")
	public void ValidateSearchPagewithReceiverId() throws Throwable {

		child12 = _extent_report.startTest(
				"Verifying whether  User should able to get the valid records when we search with valid date, ReceiverId");
		child12.assignCategory("Search");

		try {

			Thread.sleep(2000);
			SP.ValidateSearchResultWithReceiverId();
			Thread.sleep(2000);
			Boolean flag = SP.Actionsicon.isDisplayed();
			String title = flag.toString();

			if (title.equalsIgnoreCase("true")) {

				child12.log(LogStatus.PASS,
						"Validation Successful because results are displayed when we search with valid Date,ReceiverId");

			} else {

				child12.log(LogStatus.FAIL,
						"Validation Unsuccessful because results are not displayed when we search with valid Date,ReceiverId");

			}
		} catch (Exception e) {

			child12.log(LogStatus.FAIL, e.fillInStackTrace());

		}

		_extent_report.endTest(child12);

	}

	@Test(priority = 14, enabled = true, description = "Verifying whether  User should able to get the valid records when we search with valid date,  Transaction")
	public void ValidateSearchPagewithTransaction() throws Throwable {

		child13 = _extent_report.startTest(
				"Verifying whether  User should able to get the valid records when we search with valid date, Transaction");
		child13.assignCategory("Search");

		try {

			Thread.sleep(2000);
			SP.ValidateSearchResultWithTransaction();
			Thread.sleep(2000);
			Boolean flag = SP.Actionsicon.isDisplayed();
			String title = flag.toString();

			if (title.equalsIgnoreCase("true")) {

				child13.log(LogStatus.PASS,
						"Validation Successful because results are displayed when we search with valid Date,Transaction");

			} else {

				child13.log(LogStatus.FAIL,
						"Validation Unsuccessful because results are not displayed when we search with valid Date,Transaction");

			}
		} catch (Exception e) {

			child13.log(LogStatus.FAIL, e.fillInStackTrace());

		}

		_extent_report.endTest(child13);

	}

	@Test(priority = 15, enabled = true, description = "Verifying whether  User should able to get the valid records when we search with valid date,  ErrorStatus")
	public void ValidateSearchPagewithErrorStatus() throws Throwable {

		child14 = _extent_report.startTest(
				"Verifying whether  User should able to get the valid records when we search with valid date, ErrorStatus");
		child14.assignCategory("Search");

		try {

			Thread.sleep(2000);
			SP.ValidateSearchResultWithErrorStatus();
			Thread.sleep(2000);
			Boolean flag = SP.Actionsicon.isDisplayed();
			String title = flag.toString();

			if (title.equalsIgnoreCase("true")) {

				child14.log(LogStatus.PASS,
						"Validation Successful because results are displayed when we search with valid Date,ErrorStatus");

			} else {

				child14.log(LogStatus.FAIL,
						"Validation Unsuccessful because results are not displayed when we search with valid Date,ErrorStatus");

			}
		} catch (Exception e) {

			child14.log(LogStatus.FAIL, e.fillInStackTrace());

		}

		_extent_report.endTest(child14);

	}

	@Test(priority = 16, enabled = true, description = "Verifying whether User should able to get the valid records when we search with valid date, Src.File Name")
	public void ValidateSearchPagewithSrcFileName() throws InterruptedException {

		child15 = _extent_report.startTest(
				"Verifying whether User should able to get the valid records when we search with valid date, Src.File Name");
		child15.assignCategory("Search");

		try {

			Thread.sleep(2000);
			SP.ValidateSearchResultWithSrcFileName();
			Thread.sleep(2000);
			Boolean flag = SP.Actionsicon.isDisplayed();
			String title = flag.toString();
			System.out.println(title);
			if (title.equalsIgnoreCase("true")) {

				child15.log(LogStatus.PASS,
						"Validation Successful because results are displayed when we search with valid Date,Src. Filename");

			} else {

				child15.log(LogStatus.FAIL,
						"Validation Unsuccessful because results are not displayed when we search with valid Date,Src. Filename");

			}
		} catch (Exception e) {

			child15.log(LogStatus.FAIL, e.fillInStackTrace());

		}

		_extent_report.endTest(child15);

	}

	@Test(priority = 17, enabled = true, description = "Verifying whether User should able to get the valid records when we search with valid date, Dest.File Name")
	public void ValidateSearchPagewithDestFileName() throws InterruptedException {

		child16 = _extent_report.startTest(
				"Verifying whether User should able to get the valid records when we search with valid date, Dest.File Name");
		child16.assignCategory("Search");

		try {

			Thread.sleep(2000);
			SP.ValidateSearchResultWithDestFileName();
			Thread.sleep(2000);
			Boolean flag = SP.Actionsicon.isDisplayed();
			String title = flag.toString();

			if (title.equalsIgnoreCase("true")) {

				child16.log(LogStatus.PASS,
						"Validation Successful because results are displayed when we search with valid Date,Dest. Filename");

			} else {

				child16.log(LogStatus.FAIL,
						"Validation Unsuccessful because results are not displayed when we search with valid Date,Dest. Filename");

			}
		} catch (Exception e) {

			child16.log(LogStatus.FAIL, e.fillInStackTrace());

		}

		_extent_report.endTest(child16);

	}

	@Test(priority = 18, enabled = true, description = "Verifying whether User should able to see the options when we click on Advanced Search bar.")
	public void validateSearchPageWithFilter() throws Exception {

		child17 = _extent_report.startTest(
				"Verifying whether User should able to see the options when we click on Advanced Search bar.");
		child17.assignCategory("Search");

		try {

			Thread.sleep(2000);
			SP.ValidateSearchResultWithFilter();
			Thread.sleep(2000);
			List<WebElement> list = driver.findElements(By.xpath("//mat-icon[@svgicon='menu-bar']"));
			int Beforefiltercount = list.size();
			System.out.println(Beforefiltercount);
			Thread.sleep(1000);
			SP.FilterData.sendKeys(Keys.chord(Keys.CONTROL, "a"), prop.getProperty("searchfilterdata"));
			Thread.sleep(2000);
			List<WebElement> list1 = driver.findElements(By.xpath("//mat-icon[@svgicon='menu-bar']"));
			int Afterfiltercount = list1.size();
			System.out.println(Afterfiltercount);

			if (Beforefiltercount > Afterfiltercount) {

				child17.log(LogStatus.PASS, "Validation Successful because results are being filtered");

			} else {

				child17.log(LogStatus.FAIL, "Validation Unsuccessful because results are  not being filtered");

			}
		} catch (Exception e) {

			child17.log(LogStatus.FAIL, e.fillInStackTrace());

		}

		_extent_report.endTest(child17);

	}

	@Test(priority = 19, enabled = true, description = "Verifying whether User should able to get the valid records when we search with valid date, PO NUMBER")
	public void ValidateSearchPagewithPONumber() throws InterruptedException {

		child18 = _extent_report.startTest(
				"Verifying whether User should able to get the valid records when we search with valid date, PO NUMBER");
		child18.assignCategory("Search");

		try {

			Thread.sleep(2000);
			SP.ValidateSearchResultWithPONumber();
			Thread.sleep(2000);
			Boolean flag = SP.Actionsicon.isDisplayed();
			String title = flag.toString();
			System.out.println(title);
			if (title.equalsIgnoreCase("true")) {

				child18.log(LogStatus.PASS,
						"Validation Successful because results are displayed when we search with valid date, PO number");

			} else {

				child18.log(LogStatus.FAIL,
						"Validation Unsuccessful because results are not displayed when we search with valid date, PO number");

			}
		} catch (Exception e) {

			child18.log(LogStatus.FAIL, e.fillInStackTrace());

		}

		_extent_report.endTest(child18);

	}

	@Test(priority = 20, enabled = true, description = "Verifying whether User should able to get the valid records when we search with valid date, Customer ID")
	public void ValidateSearchPagewithCustomerID() throws InterruptedException {

		child19 = _extent_report.startTest(
				"Verifying whether User should able to get the valid records when we search with valid date, Customer ID");
		child19.assignCategory("Search");

		try {

			Thread.sleep(2000);
			SP.ValidateSearchResultWithCustomerID();
			Thread.sleep(2000);
			Boolean flag = SP.Actionsicon.isDisplayed();
			String title = flag.toString();
			System.out.println(title);
			if (title.equalsIgnoreCase("true")) {

				child19.log(LogStatus.PASS,
						"Validation Successful because results are displayed when we search with valid date, customer ID");

			} else {

				child19.log(LogStatus.FAIL,
						"Validation Unsuccessful because results are not displayed when we search with valid date, customer ID");

			}
		} catch (Exception e) {

			child19.log(LogStatus.FAIL, e.fillInStackTrace());

		}

		_extent_report.endTest(child19);

	}

	@Test(priority = 21, enabled = true, description = "Verifying whether User should able to get the valid records when we search with valid date, Packet ID")
	public void ValidateSearchPagewithPacketID() throws InterruptedException {

		child20 = _extent_report.startTest(
				"Verifying whether User should able to get the valid records when we search with valid date, Packet ID");
		child20.assignCategory("Search");

		try {

			Thread.sleep(2000);
			SP.ValidateSearchResultWithPacketID1();
			Thread.sleep(2000);
			Boolean flag = SP.Actionsicon.isDisplayed();
			String title = flag.toString();
			System.out.println(title);
			if (title.equalsIgnoreCase("true")) {

				child20.log(LogStatus.PASS,
						"Validation Successful because results are displayed when we search with valid date, Packet ID");

			} else {

				child20.log(LogStatus.FAIL,
						"Validation Unsuccessful because results are not displayed when we search with valid date, Packet ID");

			}
		} catch (Exception e) {

			child20.log(LogStatus.FAIL, e.fillInStackTrace());

		}

		_extent_report.endTest(child20);

	}

	@Test(priority = 22, enabled = true, description = "Search Page Search Result Verification with items per page")
	public void ValidateSearchpageitemsperpage() throws Throwable {

		child21 = _extent_report.startTest("Search Page Search page with items per page");
		child21.assignCategory("Search");

		try {

			Thread.sleep(2000);
			SP.ValidateSearchpageitemsperpage();
			Thread.sleep(2000);
			List<WebElement> list = driver.findElements(By.xpath("//mat-icon[@svgicon='menu-bar']"));
			int Beforefiltercount = list.size();
			System.out.println(Beforefiltercount);
			Thread.sleep(2000);
			DropDownSelection(SP.itemsperpageDD, "50");
			Thread.sleep(2000);

			List<WebElement> list1 = driver.findElements(By.xpath("//mat-icon[@svgicon='menu-bar']"));
			int Afterfiltercount = list1.size();
			System.out.println(Afterfiltercount);

			if (Afterfiltercount > Beforefiltercount) {

				child21.log(LogStatus.PASS, "Validation Successful because results are being filtered");

			} else {

				child21.log(LogStatus.FAIL, "Validation Unsuccessful because results are not being filtered");

			}
		} catch (Exception e) {

			child21.log(LogStatus.FAIL, e.fillInStackTrace());

		}

		_extent_report.endTest(child21);

	}

	@Test(priority = 23, enabled = true, description = "Verifying Reset Search Button to clear all the fields")
	public void SearchPageTestWithResetSearch() throws Throwable {

		child22 = _extent_report.startTest("Verifying Reset Search Button to clear all the fields");
		child22.assignCategory("Search");

		try {

			Thread.sleep(2000);
			SP.ResetButtonClick.click();
			Thread.sleep(2000);
			SP.ValidateSearchResultWithValidDate();
			Thread.sleep(2000);

			SP.SearchButtonClick.click();
			Thread.sleep(3000);

			SP.ResetButtonClick.click();
			Thread.sleep(2000);
			if (SP.PartnerData.getText().isEmpty() && SP.ApplicationData.getText().isEmpty()
					&& SP.SenderIdData.getText().isEmpty() && SP.ReceiverIDData.getText().isEmpty()
					&& SP.TransactionData.getText().isEmpty() && SP.ErrorStatusData.getText().isEmpty()
					&& SP.SrcFileNameData.getText().isEmpty() && SP.DestFileNameData.getText().isEmpty()) {

				child22.log(LogStatus.PASS,
						"Validation Successful because Reset Search is Resetting All the Fields in Search Page");

			} else {

				child22.log(LogStatus.FAIL,
						"Validation Unsuccessful because Reset Search is not Resetting All the Fields in Search page");

			}
		} catch (Exception e) {

			child22.log(LogStatus.FAIL, e.fillInStackTrace());

		}

		_extent_report.endTest(child22);

	}

	@Test(priority = 24, enabled = true, description = "Verifying Search Result with ActionToggle")
	public void SearchPageTestWithActionToggle() throws Throwable {

		child23 = _extent_report.startTest("Verifying Search Result with ActionToggle");
		child23.assignCategory("Search");

		try {

			Thread.sleep(2000);
			SP.ResetButtonClick.click();
			SP.ValidateSearchResultWithValidDate();
			Thread.sleep(2000);

			SP.SearchButtonClick.click();
			Thread.sleep(2000);
			Boolean flag = SP.Actionsicon.isDisplayed();
			String title = flag.toString();
			System.out.println(title);
			if (title.equalsIgnoreCase("true")) {

				child23.log(LogStatus.PASS, "Validation Successful because action toggle is displayed in Search Page");

			} else {

				child23.log(LogStatus.FAIL,
						"Validation Unsuccessful because action toggle is not displayed in Search Page");

			}
		} catch (Exception e) {

			child23.log(LogStatus.FAIL, e.fillInStackTrace());

		}

		_extent_report.endTest(child23);

	}

	@Test(priority = 25, enabled = true, description = "Verifying Search Result with ViewDetails")
	public void SearchPageTestWithViewDetails() throws Throwable {

		child24 = _extent_report.startTest("Verifying Search Result with ViewDetails");
		child24.assignCategory("Search");

		try {

			Thread.sleep(2000);
			SP.ResetButtonClick.click();
			Thread.sleep(2000);
			SP.ValidateSearchResultWithValidDate();
			Thread.sleep(2000);
			SP.Actionsicon.click();
			Thread.sleep(1000);
			SP.ViewDetailsClick.click();
			Thread.sleep(2000);
			String title = SP.ViewdetailsDetailspagetitle.getText();

			if (title.equals("Transaction Details")) {

				child24.log(LogStatus.PASS, "Validation Successful because we are getting the '" + title
						+ "'when view details page is opened");

			} else {

				child24.log(LogStatus.FAIL, "Validation Unsuccessful because we are not getting the '" + title
						+ "'when view details page is opened");

			}

			driver.findElement(By.xpath("//span[contains(text(),'Close')]")).click();

		} catch (Exception e) {

			child24.log(LogStatus.FAIL, e.fillInStackTrace());

		}

		_extent_report.endTest(child24);

	}

	@Test(priority = 26, enabled = true, description = "Verifying Search Result with View activity")
	public void SearchPageTestWithViewActivity() throws Throwable {

		child25 = _extent_report.startTest("Verifying Search Result with View activity");
		child25.assignCategory("Search");

		try {

			Thread.sleep(2000);
			SP.ResetButtonClick.click();
			Thread.sleep(2000);
			SP.ValidateSearchResultWithValidDate();
			Thread.sleep(1000);
			SP.Actionsicon.click();
			Thread.sleep(1000);
			SP.ViewActivityClick.click();
			Thread.sleep(2000);
			String title = SP.Viewactivitypagetitle.getText();

			if (title.equals("Activity")) {

				child25.log(LogStatus.PASS, "Validation Successful because we are getting the '" + title
						+ "'when view details page is opened");

			} else {

				child25.log(LogStatus.FAIL, "Validation unsuccessful because we are not getting the '" + title
						+ "'when view details page is opened");

			}

			driver.findElement(By.xpath("//span[contains(text(),'Close')]")).click();

		} catch (Exception e) {

			child25.log(LogStatus.FAIL, e.fillInStackTrace());

		}

		_extent_report.endTest(child25);

	}

	@Test(priority = 27, enabled = true, description = "Verifying Search Result with PickupNow")
	public void SearchPageTestWithPickupNow() throws Throwable {

		child26 = _extent_report.startTest("Verifying Search Result with PickupNow");
		child26.assignCategory("Search");

		try {

			Thread.sleep(2000);
			SP.ResetButtonClick.click();
			Thread.sleep(2000);
			SP.validateRecordWithPickupNow();
			Thread.sleep(2000);
			SP.Actionsicon.click();
			Thread.sleep(1000);
			SP.PickUpNowClick.click();

			String title = SP.ActionMsg.getText();
			if (title.equals("File re-picked successfully")) {

				child26.log(LogStatus.PASS, "Validation Successful because we are getting Message as '" + title + "'");

			} else {

				child26.log(LogStatus.FAIL,
						"Validation unsuccessful because we are not getting Message as '" + title + "'");

			}
			Thread.sleep(2000);
			SP.Okbtn.click();

		} catch (Exception e) {

			child26.log(LogStatus.FAIL, e.fillInStackTrace());

		}

		_extent_report.endTest(child26);

	}

	@Test(priority = 28, enabled = true, description = "Verifying Search Result with Reprocess")
	public void SearchPageTestWithReprocess() throws Throwable {

		child27 = _extent_report.startTest("Verifying Search Result with Reprocess");
		child27.assignCategory("Search");

		try {

			Thread.sleep(2000);
			SP.ResetButtonClick.click();
			Thread.sleep(2000);
			SP.validateRecordWithReprocess();
			Thread.sleep(2000);
			SP.Actionsicon.click();
			Thread.sleep(1000);
			SP.ReprocessClick.click();

			String title = SP.ActionMsg.getText();
			if (title.equals("File reprocessed successfully")) {

				child27.log(LogStatus.PASS, "Validation Successful because we are getting Message as '" + title + "'");

			} else {

				child27.log(LogStatus.FAIL,
						"Validation unsuccessful because we are not getting Message as '" + title + "'");

			}
			Thread.sleep(2000);
			SP.Okbtn.click();

		} catch (Exception e) {

			child27.log(LogStatus.FAIL, e.fillInStackTrace());

		}

		_extent_report.endTest(child27);

	}

	@Test(priority = 29, enabled = true, description = "Verifying Search Result with Dropagain")
	public void SearchPageTestWithDropagain() throws Throwable {

		child28 = _extent_report.startTest("Verifying Search Result with Dropagain");
		child28.assignCategory("Search");

		try {

			Thread.sleep(2000);
			SP.ResetButtonClick.click();
			Thread.sleep(2000);
			SP.validateRecordWithDropAgain();
			Thread.sleep(2000);
			SP.Actionsicon.click();
			Thread.sleep(1000);
			SP.DropAgainClick.click();

			String title = SP.ActionMsg.getText();
			if (title.equals("File re-dropped successfully")) {

				child28.log(LogStatus.PASS, "Validation Successful because we are getting Message as '" + title + "'");

			} else {

				child28.log(LogStatus.FAIL,
						"Validation Unsuccessful because we are not getting Message as '" + title + "'");

			}

			Thread.sleep(2000);
			SP.Okbtn.click();

		} catch (Exception e) {

			child28.log(LogStatus.FAIL, e.fillInStackTrace());

		}

		_extent_report.endTest(child28);

	}

	@Test(priority = 30, enabled = true, description = "Verifying File transfer search with configure columns with select all check box")
	public void SearchPageTestWithConfigurecoloums() throws Throwable {

		child29 = _extent_report
				.startTest("Verifying File transfer search with configure columns with select all check box");
		child29.assignCategory("Search");

		try {

			Thread.sleep(2000);
			SP.ResetButtonClick.click();
			Thread.sleep(2000);
			SP.ValidateSearchResultWithValidDate();
			Thread.sleep(2000);
			SP.ConfigureColumnsClick.click();
			Thread.sleep(1000);
			SP.filearrivedcheckbox.click();
			Thread.sleep(1000);
			SP.configurecoloumokbtn.click();
			Thread.sleep(2000);

			List<WebElement> list = driver.findElements(By.xpath("(//tr[@role='row'])[1]//th//div//button"));
			int beforesize = list.size();
			System.out.println(beforesize);

			Thread.sleep(1000);
			SP.ConfigureColumnsClick.click();
			Thread.sleep(1000);
			SP.filearrivedcheckbox.click();
			Thread.sleep(1000);
			SP.configurecoloumokbtn.click();
			Thread.sleep(2000);

			List<WebElement> list1 = driver.findElements(By.xpath("(//tr[@role='row'])[1]//th//div//button"));
			int aftersize = list1.size();
			System.out.println(aftersize);

			if (aftersize > beforesize) {

				child29.log(LogStatus.PASS,
						"Validation Successful because columns has been added by using selectall checkbox");

			} else {

				child29.log(LogStatus.FAIL,
						"Validation unsuccessful because columns has not been added by using selectall checkbox");

			}
		} catch (Exception e) {

			child29.log(LogStatus.FAIL, e.fillInStackTrace());

		}

		_extent_report.endTest(child29);

	}

	@Test(priority = 31, enabled = true, description = "Verifying Search Result with MultipleReprocess")
	public void SearchPageTestWithMultipleReprocess() throws Throwable {

		child30 = _extent_report.startTest("Verifying Search Result with MultipleReprocess");
		child30.assignCategory("Search");

		try {

			Thread.sleep(2000);
			SP.ResetButtonClick.click();
			Thread.sleep(2000);
			SP.ValidateSearchResultWithValidDate();
			Thread.sleep(2000);

			driver.findElement(By.xpath(
					"(//div[@class='mat-checkbox-inner-container mat-checkbox-inner-container-no-side-margin'])[2]"))
					.click();
			Thread.sleep(1000);
			driver.findElement(By.xpath(
					"(//div[@class='mat-checkbox-inner-container mat-checkbox-inner-container-no-side-margin'])[3]"))
					.click();
			Thread.sleep(1000);
			SP.MultipleReprocessButtonClick.click();
			Thread.sleep(1000);
			String title = SP.ActionMsg.getText();
			Thread.sleep(1000);
			if (title.equals("Files reprocessed successfully")) {

				child30.log(LogStatus.PASS, "Validation Successful because we are getting Message as '" + title + "'");

			} else {

				child30.log(LogStatus.FAIL,
						"Validation Unsuccessful because we are not getting Message as '" + title + "'");

			}

		} catch (Exception e) {

			child30.log(LogStatus.FAIL, e.fillInStackTrace());

		}

		_extent_report.endTest(child30);

	}

	@Test(priority = 32, enabled = true, description = "Verifying File transfer search with src.File Name download")
	public void verifysrcfiledownload() {

		child31 = _extent_report.startTest("Verifying File transfer search with src.File Name download");
		child31.assignCategory("Search");

		try {

			Thread.sleep(2000);
			SP.ResetButtonClick.click();
			Thread.sleep(2000);
			SP.ValidateSrcDownload();
			Thread.sleep(2000);
			String screenShotPath = takeScreenshotAtEndOfTest(driver, "src.file Download");
			child31.log(LogStatus.PASS, "Snapshot below: " + child31.addScreenCapture(screenShotPath));

		} catch (Exception e) {

			child31.log(LogStatus.FAIL, e.fillInStackTrace());

		}

	}

	@Test(priority = 33, enabled = true, description = "Verifying File transfer search with src.File Name close")
	public void verifysrcfileclose() {

		child32 = _extent_report.startTest("Verifying File transfer search with src.File Name close");
		child32.assignCategory("Search");

		try {

			Thread.sleep(2000);
			SP.ResetButtonClick.click();
			Thread.sleep(2000);
			SP.ValidateSrcClose();
			Thread.sleep(2000);

			String screenShotPath = takeScreenshotAtEndOfTest(driver, "Dest.File Download");
			child32.log(LogStatus.PASS, "Snapshot below: " + child32.addScreenCapture(screenShotPath));

		} catch (Exception e) {

			child32.log(LogStatus.FAIL, e.fillInStackTrace());

		}

	}

	@Test(priority = 34, enabled = true, description = "Verifying File transfer search with Dest.File Name download")
	public void verifydestfiledownload() {

		child33 = _extent_report.startTest("Verifying File transfer search with Dest.File Name download");
		child33.assignCategory("Search");

		try {

			Thread.sleep(2000);
			SP.ResetButtonClick.click();
			Thread.sleep(2000);
			SP.ValidateSrcDownload();
			Thread.sleep(2000);
			String screenShotPath = takeScreenshotAtEndOfTest(driver, "Dest.File Download");
			child33.log(LogStatus.PASS, "Snapshot below: " + child31.addScreenCapture(screenShotPath));

		} catch (Exception e) {

			child33.log(LogStatus.FAIL, e.fillInStackTrace());

		}

	}

	@Test(priority = 35, enabled = true, description = "Verifying File transfer search with Dest.File Name close")
	public void verifydestfileclose() {

		child34 = _extent_report.startTest("Verifying File transfer search with Dest.File Name close");
		child34.assignCategory("Search");

		try {

			Thread.sleep(2000);
			SP.ResetButtonClick.click();
			Thread.sleep(2000);
			SP.ValidateSrcClose();
			Thread.sleep(2000);

			String screenShotPath = takeScreenshotAtEndOfTest(driver, "Dest.File Download");
			child34.log(LogStatus.PASS, "Snapshot below: " + child34.addScreenCapture(screenShotPath));

		} catch (Exception e) {

			child34.log(LogStatus.FAIL, e.fillInStackTrace());

		}

	}

	@Test(priority = 36, enabled = true, description = "Verifying File transfer search Export as PDF")
	public void verifyexportasPDF() {

		child35 = _extent_report.startTest("Verifying File transfer search Export as PDF");
		child35.assignCategory("Search");

		try {

			Thread.sleep(2000);
			SP.ResetButtonClick.click();
			Thread.sleep(2000);

			SP.exportpdf();
			Thread.sleep(2000);

			String screenShotPath = takeScreenshotAtEndOfTest(driver, "Dest.File Download");
			child35.log(LogStatus.PASS, "Snapshot below: " + child35.addScreenCapture(screenShotPath));

		} catch (Exception e) {

			child35.log(LogStatus.FAIL, e.fillInStackTrace());

		}

	}

	@Test(priority = 37, enabled = true, description = "Verifying File transfer search Export as CSV")
	public void verifyexportasCSV() {

		child36 = _extent_report.startTest("Verifying File transfer search Export as CSV");
		child36.assignCategory("Search");

		try {

			Thread.sleep(2000);
			SP.ResetButtonClick.click();
			Thread.sleep(2000);

			SP.exportcsv();
			Thread.sleep(2000);

			String screenShotPath = takeScreenshotAtEndOfTest(driver, "Dest.File Download");
			child36.log(LogStatus.PASS, "Snapshot below: " + child36.addScreenCapture(screenShotPath));

		} catch (Exception e) {

			child36.log(LogStatus.FAIL, e.fillInStackTrace());

		}

	}

	@Test(priority = 38, enabled = true, description = "Verifying whether User should  able to get the valid records when we search with Invalid date")
	public void ValidateSearchResultsAdvancedWithInvalidDetails() throws Throwable {

		child37 = _extent_report.startTest(
				"Verifying whether User should  able to get the valid records when we search with Invalid date");
		child37.assignCategory("Search");

		try {

			SP.ValidateSearchResultsAdvancedWithInvalidDetails();
			Thread.sleep(1000);
			String title = SP.ErrorMsg.getText();

			if (title.equals("No results found !")) {

				child37.log(LogStatus.PASS, "Validation Successful because '" + title
						+ "' text is being displayed when we search with invalid data");

			} else {

				child37.log(LogStatus.FAIL, "Validation Unsuccessful because '" + title
						+ "' text is being displayed instead of ' No results found ! '  when we search with invalid data");

			}

			SP.ResetButtonClick.click();
			Thread.sleep(2000);

		} catch (Exception e) {

			child37.log(LogStatus.FAIL, e.fillInStackTrace());

		}

		_extent_report.endTest(child37);

	}

	@AfterTest
	public void tearDown() throws Exception {

		_test_logger1.appendChild(Parent1);

		Parent1.appendChild(child1).appendChild(child2).appendChild(child3).appendChild(child4).appendChild(child5)
				.appendChild(child6).appendChild(child7).appendChild(child8).appendChild(child9).appendChild(child10)
				.appendChild(child11).appendChild(child12).appendChild(child13).appendChild(child14)
				.appendChild(child15).appendChild(child16).appendChild(child17).appendChild(child18)
				.appendChild(child19).appendChild(child20).appendChild(child21).appendChild(child22)
				.appendChild(child23).appendChild(child24).appendChild(child25).appendChild(child26)
				.appendChild(child27).appendChild(child28).appendChild(child29).appendChild(child30)
				.appendChild(child31).appendChild(child32).appendChild(child33).appendChild(child34)
				.appendChild(child35).appendChild(child36).appendChild(child37);

		_extent_report.endTest(Parent1);
		_extent_report.endTest(_test_logger1);
		_extent_report.flush();

	}

}
