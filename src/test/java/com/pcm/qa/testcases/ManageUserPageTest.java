package com.pcm.qa.testcases;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.pcm.qa.base.TestBase;
import com.pcm.qa.pages.ManageUserPage;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class ManageUserPageTest extends TestBase {

	ManageUserPage MUP;
	ManageUserPageTest MUT;

	public ExtentTest Parent14;
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

	public ManageUserPageTest() {
		super();

	}

	@BeforeMethod
	public void setUp() {

		MUP = new ManageUserPage();
		MUT = new ManageUserPageTest();

	}

	@BeforeTest(enabled = false)
	public void setup() throws Exception {

		Extentreport();
		initialization();
	}

	@Test(priority = 1, enabled = true)
	public void ParentNodeCreation() {

//		_test_logger6 = _extent_report.startTest("Access Management");

		Parent14 = _extent_report.startTest("Manage User");

	}

	@Test(priority = 2, enabled = true, description = "Verifying Manage User Page Title Verification")
	public void verificationOfManageUserPageTitle() throws InterruptedException {

		child1 = _extent_report.startTest("Verifying Manage User Page Title Verification");
		child1.assignCategory("Manage User");
		Thread.sleep(1000);
		try {
			Thread.sleep(2000);

			String title = MUP.validateManageUserPageTitle();
			System.out.println(title);
			if (title.equals("Search User")) {
				child1.log(LogStatus.PASS,
						"Validation successful because we are getting Manage User Page title  as '" + title + "'");
			} else {
				child1.log(LogStatus.FAIL, "Validation Unsuccessful because we are getting Manage user Page title as '"
						+ title + "' instead of Search user");

			}
		} catch (Exception e) {
			Thread.sleep(1000);
			child1.log(LogStatus.FAIL, e.fillInStackTrace());

		}
		_extent_report.endTest(child1);
	}

	@Test(priority = 3, enabled = true, description = "Verfying Manage User Page search with valid data")
	public void VerficationOfManageUserwithvalidData() throws Throwable {

		child2 = _extent_report.startTest("Verifying Manage User Page search with valid data");
		child2.assignCategory("Manage User");
		Thread.sleep(1000);
		try {
			MUP.ValidateManageUserPagewithvaliddata();

			Boolean flag = MUP.Actionsicon.isDisplayed();
			String title = flag.toString();
			System.out.println(title);
			if (title.contains("true")) {
				child2.log(LogStatus.PASS, "Validation successful because we are getting Message as '" + title
						+ "' when we search with valid data");
			} else {
				child2.log(LogStatus.FAIL, "Validation unsuccessful because we are not getting Message as '" + title
						+ "' when we search with valid data");

			}
		} catch (Exception e) {
			Thread.sleep(1000);// catch(ElementNotVisibleException e ) {
			child2.log(LogStatus.FAIL, e.fillInStackTrace());

		}
		_extent_report.endTest(child2);
	}

	@Test(priority = 4, enabled = true, description = "Verifying Manage User with valid data and Edit User")
	public void VerificationOfManageUserwithvalidDataAndEditUser() throws Throwable {

		child3 = _extent_report.startTest("Verifying Manage User with valid data and Edit User");
		child3.assignCategory("Manage User");

		try {
			Thread.sleep(2000);
			MUP.ResetSearchClick.click();
			Thread.sleep(2000);
			MUP.ValidateManageUserWithValiddataAndEdittheUser();
			Thread.sleep(2000);
			String title = MUP.ActionMsg.getText();
			System.out.println(title);
			if (title.contains("User updated successfully")) {
				child3.log(LogStatus.PASS, "Validation successful because we are getting Message as '" + title
						+ "' when we Edit Manage User with valid data");
			} else {
				child3.log(LogStatus.FAIL, "Validation unsuccessful because we are not getting Message as '" + title
						+ "' when we Edit Manage User with valid data");

			}
		} catch (Exception e) {
			Thread.sleep(1000);
			child3.log(LogStatus.FAIL, e.fillInStackTrace());

		}
		_extent_report.endTest(child3);
	}

	@Test(priority = 5, enabled = true, description = "Verifying Manage User with valid data and Deactivate the User")
	public void VerificationOfManageUserwithvalidDataAndDeactivatetheUser() throws Throwable {

		child4 = _extent_report.startTest("Verifying Manage User with valid data and Deactivate the User");
		child4.assignCategory("Manage User");
		Thread.sleep(1000);
		try {
			Thread.sleep(2000);
			MUP.ResetSearchClick.click();
			Thread.sleep(2000);
			MUP.ValidateManageUserWithValiddataAndDeactivatetheUser();
			String title = MUP.ActionMsg.getText();
			System.out.println(title);
			if (title.contains("Status updated successfully")) {
				child4.log(LogStatus.PASS, "Validation successful because we are getting Message as '" + title
						+ "' when we Deactivate Manage User with valid data");
			} else {
				child4.log(LogStatus.FAIL, "Validation unsuccessful because we are not getting Message as '" + title
						+ "' when we Deactivate Manage User with valid data");

			}
		} catch (Exception e) {
			Thread.sleep(1000);
			child4.log(LogStatus.FAIL, e.fillInStackTrace());

		}

		_extent_report.endTest(child4);
	}

	@Test(priority = 6, enabled = true, description = "Verifying Manage User Page Search with valid data and Activate the User")
	public void VerificationOfManageUserwithvalidDataAndActivatetheUser() throws Throwable {

		child5 = _extent_report.startTest("Verifying Manage User Page Search with valid data and Activate the User");
		child5.assignCategory("Manage User");
		Thread.sleep(1000);
		try {
			Thread.sleep(2000);
			MUP.ResetSearchClick.click();
			Thread.sleep(2000);
			MUP.ValidateManageUserWithValiddataAndActivatetheUser();
			String title = MUP.ActionMsg.getText();
			System.out.println(title);
			if (title.contains("Status updated successfully")) {
				child5.log(LogStatus.PASS, "Validation successful because we are getting Message as '" + title
						+ "' when we Activate Manage User with valid data");
			} else {
				child5.log(LogStatus.FAIL, "Validation successful because we are getting Message as '" + title
						+ "' when we Activate Manage User with valid data");

			}
		} catch (Exception e) {
			Thread.sleep(1000);
			child5.log(LogStatus.FAIL, e.fillInStackTrace());

		}
		_extent_report.endTest(child5);
	}

	/*
	 * @Test(priority = 7, enabled = true, description =
	 * "Verifying Manage User Page Search with valid data and Delete the User")
	 * public void VerificationOfManageUserwithvalidDataAndDeletetheUser() throws
	 * Throwable {
	 * 
	 * child6 = _extent_report.
	 * startTest("Verifying Manage User with valid data and Delete the User");
	 * child6.assignCategory("Manage User"); Thread.sleep(1000); try {
	 * Thread.sleep(2000); MUP.ResetSearchClick.click(); Thread.sleep(2000);
	 * MUP.ValidateManageUserWithValiddataAndDeletetheUser(); String title =
	 * MUP.ActionMsg.getText(); System.out.println(title); if
	 * (title.contains("User deleted successfully")) { child6.log(LogStatus.PASS,
	 * "Validation successful because we are getting Message as '" + title +
	 * "' when we Delete Manage User with valid data"); } else {
	 * child6.log(LogStatus.FAIL,
	 * "Validation successful because we are getting Message as '" + title +
	 * "' when we Delete Manage User with valid data");
	 * 
	 * } } catch (Exception e) { Thread.sleep(1000); child6.log(LogStatus.FAIL,
	 * e.fillInStackTrace());
	 * 
	 * } _extent_report.endTest(child6); }
	 */

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

	@Test(priority = 7, enabled = true, description = "Verfying Manage User page Search with Role as Admin Of valid data")
	public void VerficationOfManageUserwithRoleasAdminOfvalidData() throws Throwable {

		child6 = _extent_report.startTest("Verifying Manage User Page Search with Role as Admin Of valid data");
		child6.assignCategory("Manage User");
		Thread.sleep(1000);
		try {
			Thread.sleep(2000);
			MUP.ResetSearchClick.click();
			Thread.sleep(1000);
			MUP.ValidateManageUserPagewithRoleasAdminOfvaliddata();

			Boolean flag = MUP.Actionsicon.isDisplayed();
			String title = flag.toString();
			System.out.println(title);
			if (title.contains("true")) {
				child6.log(LogStatus.PASS, "Validation successful because we are getting Message as '" + title
						+ "' when we search with Role as Admin of valid data");
			} else {
				child6.log(LogStatus.FAIL, "Validation successful because we are getting Message as '" + title
						+ "' when we search with Role as Admin of valid data");

			}
		} catch (Exception e) {
			Thread.sleep(1000);
			child6.log(LogStatus.FAIL, e.fillInStackTrace());

		}
		_extent_report.endTest(child6);
	}

	@Test(priority = 8, enabled = true, description = "Verifying Manage User page Search with Role as Admin and Edit User")
	public void VerificationOfManageUserwithRoleasAdminOfvalidDataAndEditUser() throws Throwable {

		child7 = _extent_report.startTest("Verifying Manage User Page Search with Role as Admin and Edit User");
		child7.assignCategory("Manage User");
		Thread.sleep(1000);
		try {
			Thread.sleep(2000);
			MUP.ResetSearchClick.click();
			Thread.sleep(2000);
			MUP.ValidateManageUserWithRoleasAdminAndEdittheUser();
			String title = MUP.ActionMsg.getText();
			if (title.contains("User updated successfully")) {
				child7.log(LogStatus.PASS, "Validation successful because we are getting Message as '" + title
						+ "' when we Edit Manage User with Role as Admin ");
			} else {
				child7.log(LogStatus.FAIL, "Validation successful because we are getting Message as '" + title
						+ "' when we Edit Manage User with Role as Admin ");

			}
		} catch (Exception e) {
			Thread.sleep(1000);
			child7.log(LogStatus.FAIL, e.fillInStackTrace());

		}
		_extent_report.endTest(child7);
	}

	@Test(priority = 9, enabled = true, description = "Verifying Manage User Page Search with Role as Admin of valid data and Deactivate the User")
	public void VerificationOfManageUserwithRoleasAdminAndDeactivatetheUser() throws Throwable {

		child8 = _extent_report.startTest(
				"Verifying Manage User Page Search with Role as Admin of valid data and Deactivate the User");
		child8.assignCategory("Manage User");
		Thread.sleep(1000);
		try {
			Thread.sleep(2000);
			MUP.ResetSearchClick.click();
			Thread.sleep(2000);
			MUP.ValidateManageUserWithRoleasAdminAndDeactivatetheUser();
			String title = MUP.ActionMsg.getText();
			if (title.contains("Status updated successfully")) {
				child8.log(LogStatus.PASS, "Validation successful because we are getting Message as '" + title
						+ "' when we Deactivate Manage User with Role as Admin of valid data");
			} else {
				child8.log(LogStatus.FAIL, "Validation successful because we are getting Message as '" + title
						+ "' when we Deactivate Manage User with Role as Admin of valid data");

			}
		} catch (Exception e) {
			Thread.sleep(1000);
			child8.log(LogStatus.FAIL, e.fillInStackTrace());

		}
		_extent_report.endTest(child8);
	}

	@Test(priority = 10, enabled = true, description = "Verifying Manage User Page Search with Role as Admin of valid data and Activate the User")
	public void VerificationOfManageUserwithRoleasAdminAndActivatetheUser() throws Throwable {

		child9 = _extent_report
				.startTest("Verifying Manage User Page Search with Role as Admin of valid data and Activate the User");
		child9.assignCategory("Manage User");
		Thread.sleep(1000);
		try {
			Thread.sleep(2000);
			MUP.ResetSearchClick.click();
			Thread.sleep(2000);
			MUP.ValidateManageUserWithRoleasAdminAndActivatetheUser();
			String title = MUP.ActionMsg.getText();
			if (title.contains("Status updated successfully")) {
				child9.log(LogStatus.PASS, "Validation successful because we are getting Message as '" + title
						+ "' when we Activate Manage User with Role as Admin of valid data");
			} else {
				child9.log(LogStatus.FAIL, "Validation successful because we are getting Message as '" + title
						+ "' when we Activate Manage User with Role as Admin of valid data");

			}
		} catch (Exception e) {
			Thread.sleep(1000);
			child9.log(LogStatus.FAIL, e.fillInStackTrace());

		}
		_extent_report.endTest(child9);
	}

	@Test(priority = 11, enabled = true, description = "Verifying Manage User Page Search with Role as Admin of valid data and Delete the User")
	public void VerificationOfManageUserwithRoleasAdminAndDeletetheUser() throws Throwable {

		child10 = _extent_report
				.startTest("Verifying Manage User with Role as Admin of valid data and Delete the User");
		child10.assignCategory("Manage User");
		Thread.sleep(1000);
		try {
			Thread.sleep(2000);
			MUP.ResetSearchClick.click();
			Thread.sleep(2000);
			MUP.ValidateManageUserWithRoleasAdminAndDeletetheUser();
			String title = MUP.ActionMsg.getText();
			if (title.contains("User deleted successfully")) {
				child10.log(LogStatus.PASS, "Validation successful because we are getting Message as '" + title
						+ "' when we Delete Manage User with Role as Admin of valid data");
			} else {
				child10.log(LogStatus.FAIL, "Validation successful because we are getting Message as '" + title
						+ "' when we Delete Manage User with Role as Admin of valid data");

			}
		} catch (Exception e) {
			Thread.sleep(1000);
			child10.log(LogStatus.FAIL, e.fillInStackTrace());

		}
		_extent_report.endTest(child10);
	}

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

	@Test(priority = 12, enabled = true, description = "Verifying Manage User Page search with only UserId")
	public void VerificationOfMUPwithUserId() throws InterruptedException {

		child11 = _extent_report.startTest("Verifying Manage User Page search with only UserId");
		child11.assignCategory("Manage User");
		Thread.sleep(1000);

		try {
			Thread.sleep(2000);
			MUP.ResetSearchClick.click();
			Thread.sleep(2000);

			MUP.validateMUPwithOnlyUserId();
			Thread.sleep(2000);
			Boolean flag = MUP.Actionsicon.isDisplayed();
			String title = flag.toString();
			System.out.println(title);
			if (title.contains("true")) {
				child11.log(LogStatus.PASS, "Validation successful because we are getting Message as '" + title
						+ "' when we search only with UserId");
			} else {
				child11.log(LogStatus.FAIL, "Validation Unsuccessful because we are getting Message as '" + title
						+ "' when we search only with UserId");

			}

		}

		catch (Exception e) {
			Thread.sleep(2000);

			child11.log(LogStatus.FAIL, e.fillInStackTrace());
			_extent_report.endTest(child11);
		}

	}

	@Test(priority = 13, enabled = true, description = "Verifying Manage User Page search with only UserId And Edit User")
	public void VerificationOfMUPwithUserIdAndEditUser() throws Throwable {

		child12 = _extent_report.startTest("Verifying Manage User Page search with only UserId And Edit User");
		child12.assignCategory("Manage User");
		Thread.sleep(1000);

		try {
			Thread.sleep(2000);
			MUP.ResetSearchClick.click();
			Thread.sleep(2000);
			MUP.validateMUPwithOnlyUserIdAndEdittheUser();
			String title = MUP.ActionMsg.getText();
			if (title.contains("User updated successfully")) {
				child12.log(LogStatus.PASS, "Validation successful because we are getting Message as '" + title
						+ "' when we search only with UserId And Edit User");
			} else {
				child12.log(LogStatus.FAIL, "Validation Unsuccessful because we are getting Message as '" + title
						+ "' when we search only with UserId And Edit User");

			}

		}

		catch (Exception e) {
			Thread.sleep(1000);

			child12.log(LogStatus.FAIL, e.fillInStackTrace());
			_extent_report.endTest(child12);
		}

	}

	@Test(priority = 14, enabled = true, description = "Verifying Manage User Page search with only UserId And Deactivate the User")
	public void VerificationOfMUPwithUserIdAndDeactivatetheUser() throws InterruptedException {

		child13 = _extent_report
				.startTest("Verifying Manage User Page search with only UserId And Deactivate the User");
		child13.assignCategory("Manage User");
		Thread.sleep(1000);

		try {
			Thread.sleep(2000);
			MUP.ResetSearchClick.click();
			Thread.sleep(2000);
			MUP.validateMUPwithOnlyUserIdAndDeactivatetheUser();
			String title = MUP.ActionMsg.getText();
			if (title.contains("Status updated successfully")) {
				child13.log(LogStatus.PASS, "Validation successful because we are getting Message as '" + title
						+ "' when we search only with UserId And Deactivate the User");
			} else {
				child13.log(LogStatus.FAIL, "Validation Unsuccessful because we are getting Message as '" + title
						+ "' when we search only with UserId And Deactivate the User");

			}

		}

		catch (Exception e) {
			Thread.sleep(1000);

			child13.log(LogStatus.FAIL, e.fillInStackTrace());
			_extent_report.endTest(child13);
		}

	}

	@Test(priority = 15, enabled = true, description = "Verifying Manage User Page search with only UserId And Activate the User")
	public void VerificationOfMUPwithUserIdAndActivatetheUser() throws InterruptedException {

		child14 = _extent_report.startTest("Verifying Manage User Page search with only UserId And Activate the User");
		child14.assignCategory("Manage User");
		Thread.sleep(1000);

		try {
			Thread.sleep(2000);
			MUP.ResetSearchClick.click();
			Thread.sleep(2000);
			MUP.validateMUPwithOnlyUserIdAndActivatetheUser();
			String title = MUP.ActionMsg.getText();
			if (title.contains("Status updated successfully")) {
				child14.log(LogStatus.PASS, "Validation successful because we are getting Message as '" + title
						+ "' when we search only with UserId And Activate the User");
			} else {
				child14.log(LogStatus.FAIL, "Validation Unsuccessful because we are getting Message as '" + title
						+ "' when we search only with UserId And Activate the User");

			}

		}

		catch (Exception e) {
			Thread.sleep(1000);

			child14.log(LogStatus.FAIL, e.fillInStackTrace());
			_extent_report.endTest(child14);
		}

	}

	/*
	 * @Test(priority = 17, enabled = true, description =
	 * "Verifying Manage User Page search with only UserId And Delete the User")
	 * public void VerificationOfMUPwithUserIdAndDeletetheUser() throws
	 * InterruptedException {
	 * 
	 * child16 = _extent_report.
	 * startTest("Verifying Manage User Page search with only UserId And Delete the User"
	 * ); child16.assignCategory("Manage User"); Thread.sleep(1000);
	 * 
	 * try { Thread.sleep(2000); MUP.ResetSearchClick.click(); Thread.sleep(2000);
	 * MUP.validateMUPwithOnlyUserIdAndDeletetheUser(); String title =
	 * MUP.ActionMsg.getText(); if (title.contains("User deleted successfully")) {
	 * child16.log(LogStatus.PASS,
	 * "Validation successful because we are getting Message as '" + title +
	 * "' when we search only with UserId And Delete the User"); } else {
	 * child16.log(LogStatus.FAIL,
	 * "Validation Unsuccessful because we are getting Message as '" + title +
	 * "' when we search only with UserId And Delete the User"); }
	 * 
	 * }
	 * 
	 * catch (Exception e) { Thread.sleep(1000);
	 * 
	 * child16.log(LogStatus.FAIL, e.fillInStackTrace());
	 * _extent_report.endTest(child16); }
	 * 
	 * }
	 */

	///////////////////////////////////////////////////////////////////////////////////////////

	@Test(priority = 16, enabled = true, description = "Verifying Manage User Page search with only Role")
	public void VerificationOfMUPwithUserRole() throws Throwable {

		child15 = _extent_report.startTest("Verifying Manage User Page search with only Role");
		child15.assignCategory("Manage User");
		Thread.sleep(1000);

		try {
			Thread.sleep(2000);
			MUP.ResetSearchClick.click();
			Thread.sleep(2000);
			MUP.validateMUPwithOnlyRole();
			Thread.sleep(2000);
			Boolean flag = MUP.Actionsicon.isDisplayed();
			String title = flag.toString();
			System.out.println(title);
			if (title.contains("true")) {
				child15.log(LogStatus.PASS, "Validation successful because we are getting Message as '" + title
						+ "' when we search only with Role");
			} else {
				child15.log(LogStatus.FAIL, "Validation Unsuccessful because we are getting Message as '" + title
						+ "' when we search only with Role");

			}
		}

		catch (Exception e) {
			Thread.sleep(1000);

			child15.log(LogStatus.FAIL, e.fillInStackTrace());
			_extent_report.endTest(child15);
		}

	}

	@Test(priority = 17, enabled = true, description = "Verifying Manage User Page search with only Role and Edit the User")
	public void VerificationOfMUPwithUserRoleAndEditUser() throws Throwable {

		child16 = _extent_report.startTest("Verifying Manage User Page search with only Role and Edit the User");
		child16.assignCategory("Manage User");
		Thread.sleep(1000);

		try {
			Thread.sleep(2000);
			MUP.ResetSearchClick.click();
			Thread.sleep(2000);
			MUP.validateMUPwithOnlyRoleAndEdittheUser();
			String title = MUP.ActionMsg.getText();
			if (title.contains("User updated successfully")) {
				child16.log(LogStatus.PASS, "Validation successful because we are getting Message as '" + title
						+ "' when we search only with Role and Edit the User");
			} else {
				child16.log(LogStatus.FAIL, "Validation Unsuccessful because we are getting Message as '" + title
						+ "' when we search only with Role and Edit the User");

			}
		}

		catch (Exception e) {
			Thread.sleep(1000);

			child16.log(LogStatus.FAIL, e.fillInStackTrace());
			_extent_report.endTest(child16);
		}

	}

	@Test(priority = 18, enabled = true, description = "Verifying Manage User Page search with only Role and Deactivate the User")
	public void VerificationOfMUPwithUserRoleAndDeactivatetheUser() throws Throwable {

		child17 = _extent_report.startTest("Verifying Manage User Page search with only Role and Deactivate the User");
		child17.assignCategory("Manage User");
		Thread.sleep(1000);

		try {
			Thread.sleep(2000);
			MUP.ResetSearchClick.click();
			Thread.sleep(2000);
			MUP.validateMUPwithOnlyRoleAndDeactivatetheUser();
			String title = MUP.ActionMsg.getText();
			if (title.contains("Status updated successfully")) {
				child17.log(LogStatus.PASS, "Validation successful because we are getting Message as '" + title
						+ "' when we search only with Role and Deactivate the User");
			} else {
				child17.log(LogStatus.FAIL, "Validation Unsuccessful because we are getting Message as '" + title
						+ "' when we search only with Role and Deactivate the User");

			}
		}

		catch (Exception e) {
			Thread.sleep(1000);

			child17.log(LogStatus.FAIL, e.fillInStackTrace());
			_extent_report.endTest(child17);
		}

	}

	@Test(priority = 19, enabled = true, description = "Verifying Manage User Page search with only Role and Activate the User")
	public void VerificationOfMUPwithUserRoleAndActivatetheUser() throws Throwable {

		child18 = _extent_report.startTest("Verifying Manage User Page search with only Role and Activate the User");
		child18.assignCategory("Manage User");
		Thread.sleep(1000);

		try {
			Thread.sleep(2000);
			MUP.ResetSearchClick.click();
			Thread.sleep(2000);
			MUP.validateMUPwithOnlyRoleAndActivatetheUser();
			String title = MUP.ActionMsg.getText();
			if (title.contains("Status updated successfully")) {
				child18.log(LogStatus.PASS, "Validation successful because we are getting Message as '" + title
						+ "' when we search only with Role and Activate the User");
			} else {
				child18.log(LogStatus.FAIL, "Validation Unsuccessful because we are getting Message as '" + title
						+ "' when we search only with Role and Activate the User");

			}
		}

		catch (Exception e) {
			Thread.sleep(1000);

			child18.log(LogStatus.FAIL, e.fillInStackTrace());
			_extent_report.endTest(child18);
		}

	}

	/*
	 * @Test(priority = 22, enabled = true, description =
	 * "Verifying Manage User Page search with only Role and Delete the User")
	 * public void VerificationOfMUPwithUserRoleAndDeletetheUser() throws Throwable
	 * {
	 * 
	 * child21 = _extent_report.
	 * startTest("Verifying Manage User Page search with only Role and Delete the User"
	 * ); child21.assignCategory("Manage User"); Thread.sleep(1000);
	 * 
	 * try { Thread.sleep(2000); MUP.ResetSearchClick.click(); Thread.sleep(2000);
	 * MUP.validateMUPwithOnlyRoleasAdminAndDeletetheUser(); String title =
	 * MUP.ActionMsg.getText(); if (title.contains("User deleted successfully")) {
	 * child21.log(LogStatus.PASS,
	 * "Validation successful because we are getting Message as '" + title +
	 * "' when we search only with Role and Delete the User"); } else {
	 * child21.log(LogStatus.FAIL,
	 * "Validation Unsuccessful because we are getting Message as '" + title +
	 * "' when we search only with Role and Delete the User");
	 * 
	 * } }
	 * 
	 * catch (Exception e) { Thread.sleep(1000);
	 * 
	 * child21.log(LogStatus.FAIL, e.fillInStackTrace());
	 * _extent_report.endTest(child21); }
	 * 
	 * }
	 */

	///////////////////////////////////////////////////////////////////////////////////////

	@Test(priority = 20, enabled = true, description = "Verifying Manage User Page search with only FirstNameData")
	public void VerificationOfMUPwithFirstName() throws InterruptedException {

		child19 = _extent_report.startTest("Verifying Manage User Page search with only FirstNameData");
		child19.assignCategory("Manage User");
		Thread.sleep(1000);
		try {
			Thread.sleep(2000);
			MUP.ResetSearchClick.click();
			Thread.sleep(2000);
			MUP.validateMUPwithOnlyFirstName();
			Boolean flag = MUP.Actionsicon.isDisplayed();
			String title = flag.toString();
			System.out.println(title);
			if (title.contains("true")) {
				child19.log(LogStatus.PASS, "Validation successful because we are getting Message as '" + title
						+ "' when we search only with FirstNameData");
			} else {
				child19.log(LogStatus.FAIL, "Validation Unsuccessful because we are getting Message as '" + title
						+ "' when we search only with FirstNameData");

			}
		}

		catch (Exception e) {
			Thread.sleep(1000);

			child19.log(LogStatus.FAIL, e.fillInStackTrace());
			_extent_report.endTest(child19);
		}

	}

	@Test(priority = 21, enabled = true, description = "Verifying Manage User Page search with only FirstName and Edit User")
	public void VerificationOfMUPwithFirstNameAndEditUser() throws Throwable {

		child20 = _extent_report.startTest("Verifying Manage User Page search with only FirstName and Edit User");
		child20.assignCategory("Manage User");
		Thread.sleep(1000);
		try {
			Thread.sleep(2000);
			MUP.ResetSearchClick.click();
			Thread.sleep(2000);
			MUP.validateMUPwithOnlyFirstNameAndEditUser();
			String title = MUP.ActionMsg.getText();
			if (title.contains("User updated successfully")) {
				child20.log(LogStatus.PASS, "Validation successful because we are getting Message as '" + title
						+ "' when we search only with FirstNameData and Edit User");
			} else {
				child20.log(LogStatus.FAIL, "Validation Unsuccessful because we are getting Message as '" + title
						+ "' when we search only with FirstNameData and Edit User");

			}
		}

		catch (Exception e) {
			Thread.sleep(1000);

			child20.log(LogStatus.FAIL, e.fillInStackTrace());
			_extent_report.endTest(child20);
		}

	}

	@Test(priority = 22, enabled = true, description = "Verifying Manage User Page search with only FirstName and Deactivate User")
	public void VerificationOfMUPwithFirstNameAndDeactivateUser() throws InterruptedException {

		child21 = _extent_report.startTest("Verifying Manage User Page search with only FirstName and Deactivate User");
		child21.assignCategory("Manage User");
		Thread.sleep(1000);
		try {
			Thread.sleep(2000);
			MUP.ResetSearchClick.click();
			Thread.sleep(2000);
			MUP.validateMUPwithOnlyFirstNameAndDeactivateUser();
			String title = MUP.ActionMsg.getText();
			if (title.contains("Status updated successfully")) {
				child21.log(LogStatus.PASS, "Validation successful because we are getting Message as '" + title
						+ "' when we search only with FirstNameData and Deactivate User");
			} else {
				child21.log(LogStatus.FAIL, "Validation Unsuccessful because we are getting Message as '" + title
						+ "' when we search only with FirstNameData and Deactivate User");

			}
		}

		catch (Exception e) {
			Thread.sleep(1000);

			child21.log(LogStatus.FAIL, e.fillInStackTrace());
			_extent_report.endTest(child21);
		}

	}

	@Test(priority = 23, enabled = true, description = "Verifying Manage User Page search with only FirstName and Activate User")
	public void VerificationOfMUPwithFirstNameAndActivateUser() throws InterruptedException {

		child22 = _extent_report.startTest("Verifying Manage User Page search with only FirstName and Activate User");
		child22.assignCategory("Manage User");
		Thread.sleep(1000);
		try {
			Thread.sleep(2000);
			MUP.ResetSearchClick.click();
			Thread.sleep(2000);
			MUP.validateMUPwithOnlyFirstNameAndActivateUser();
			String title = MUP.ActionMsg.getText();
			if (title.contains("Status updated successfully")) {
				child22.log(LogStatus.PASS, "Validation successful because we are getting Message as '" + title
						+ "' when we search only with FirstNameData and Activate User");
			} else {
				child22.log(LogStatus.FAIL, "Validation Unsuccessful because we are getting Message as '" + title
						+ "' when we search only with FirstNameData and Activate User");

			}
		}

		catch (Exception e) {
			Thread.sleep(1000);

			child22.log(LogStatus.FAIL, e.fillInStackTrace());
			_extent_report.endTest(child22);
		}

	}

	/*
	 * @Test(priority = 27, enabled = true, description =
	 * "Verifying Manage User Page search with only FirstName and Delete User")
	 * public void VerificationOfMUPwithFirstNameAndDeleteUser() throws
	 * InterruptedException {
	 * 
	 * child26 = _extent_report.
	 * startTest("Verifying Manage User Page search with only FirstName and Delete User"
	 * ); child26.assignCategory("Manage User"); Thread.sleep(1000); try {
	 * Thread.sleep(2000); MUP.ResetSearchClick.click(); Thread.sleep(2000);
	 * MUP.validateMUPwithOnlyFirstNameAndDeleteUser(); String title =
	 * MUP.ActionMsg.getText(); if (title.contains("User deleted successfully")) {
	 * child26.log(LogStatus.PASS,
	 * "Validation successful because we are getting Message as '" + title +
	 * "' when we search only with FirstNameData and Delete User"); } else {
	 * child26.log(LogStatus.FAIL,
	 * "Validation Unsuccessful because we are getting Message as '" + title +
	 * "' when we search only with FirstNameData and Delete User");
	 * 
	 * } }
	 * 
	 * catch (Exception e) { Thread.sleep(1000);
	 * 
	 * child26.log(LogStatus.FAIL, e.fillInStackTrace());
	 * _extent_report.endTest(child26); }
	 * 
	 * }
	 */

	///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

	@Test(priority = 24, enabled = true, description = "Verifying Manage User Page search with only LastName")
	public void VerificationOfMUPwithLastName() throws InterruptedException {

		child23 = _extent_report.startTest("Verifying Manage User  Page search with only LastName");
		child23.assignCategory("Manage User");

		try {
			Thread.sleep(2000);
			MUP.ResetSearchClick.click();
			Thread.sleep(2000);
			MUP.validateMUPwithOnlyLastName();
			Thread.sleep(2000);
			Boolean flag = MUP.Actionsicon.isDisplayed();
			String title = flag.toString();
			System.out.println(title);
			if (title.contains("true")) {
				child23.log(LogStatus.PASS, "Validation successful because we are getting Message as '" + title
						+ "' when we search only with LastNameData");
			} else {
				child23.log(LogStatus.FAIL, "Validation Unsuccessful because we are getting Message as '" + title
						+ "' when we search only with LastNameData");

			}
		}

		catch (Exception e) {
			Thread.sleep(1000);

			child23.log(LogStatus.FAIL, e.fillInStackTrace());
			_extent_report.endTest(child23);
		}

	}

	@Test(priority = 25, enabled = true, description = "Verifying Manage User Page search with only LastNameData and Edit User")
	public void VerificationOfMUPwithLastNameAndEditUser() throws Throwable {

		child24 = _extent_report.startTest("Verifying Manage User  Page search with only LastNameData and Edit User");
		child24.assignCategory("Manage User");

		try {
			Thread.sleep(2000);
			MUP.ResetSearchClick.click();
			Thread.sleep(2000);
			MUP.validateMUPwithOnlyLastNameAndEditUSer();
			String title = MUP.ActionMsg.getText();
			if (title.contains("User updated successfully")) {
				child24.log(LogStatus.PASS, "Validation successful because we are getting Message as '" + title
						+ "' when we search only with LastNameData and Edit User");
			} else {
				child24.log(LogStatus.FAIL, "Validation Unsuccessful because we are getting Message as '" + title
						+ "' when we search only with LastNameData and Edit User");

			}
		}

		catch (Exception e) {
			Thread.sleep(1000);

			child24.log(LogStatus.FAIL, e.fillInStackTrace());
			_extent_report.endTest(child24);
		}

	}

	@Test(priority = 26, enabled = true, description = "Verifying Manage User Page search with only LastName and Deactivate User")
	public void VerificationOfMUPwithLastNameAndDeactivateUser() throws InterruptedException {

		child25 = _extent_report.startTest("Verifying Manage User Page search with only LastName and Deactivate User");
		child25.assignCategory("Manage User");

		try {
			Thread.sleep(2000);
			MUP.ResetSearchClick.click();
			Thread.sleep(2000);
			MUP.validateMUPwithOnlyLastNameAndDeactivateUser();
			String title = MUP.ActionMsg.getText();
			if (title.contains("Status updated successfully")) {
				child25.log(LogStatus.PASS, "Validation successful because we are getting Message as '" + title
						+ "' when we search only with LastNameData and Deactivate User");
			} else {
				child25.log(LogStatus.FAIL, "Validation Unsuccessful because we are getting Message as '" + title
						+ "' when we search only with LastNameData and Deactivate User");

			}
		}

		catch (Exception e) {
			Thread.sleep(1000);

			child25.log(LogStatus.FAIL, e.fillInStackTrace());
			_extent_report.endTest(child25);
		}

	}

	@Test(priority = 27, enabled = true, description = "Verifying Manage User Page search with only LastName and Activate User")
	public void VerificationOfMUPwithLastNameAndActivateUser() throws InterruptedException {

		child26 = _extent_report.startTest("Verifying Manage User Page search with only LastName and Activate User");
		child26.assignCategory("Manage User");

		try {
			Thread.sleep(2000);
			MUP.ResetSearchClick.click();
			Thread.sleep(2000);
			MUP.validateMUPwithOnlyLastNameAndActivateUser();
			String title = MUP.ActionMsg.getText();
			if (title.contains("Status updated successfully")) {
				child26.log(LogStatus.PASS, "Validation successful because we are getting Message as '" + title
						+ "' when we search only with LastNameData and Activate User");
			} else {
				child26.log(LogStatus.FAIL, "Validation Unsuccessful because we are getting Message as '" + title
						+ "' when we search only with LastNameData and Activate User");

			}
		}

		catch (Exception e) {
			Thread.sleep(1000);

			child26.log(LogStatus.FAIL, e.fillInStackTrace());
			_extent_report.endTest(child26);
		}

	}

	/*
	 * @Test(priority = 32, enabled = true, description =
	 * "Verifying Manage User Page search with only LastName and Delete User")
	 * public void VerificationOfMUPwithLastNameAndDeleteUser() throws
	 * InterruptedException {
	 * 
	 * child31 = _extent_report.
	 * startTest("Verifying Manage User Page search with only LastName and Delete User"
	 * ); child31.assignCategory("Manage User");
	 * 
	 * try { Thread.sleep(2000); MUP.ResetSearchClick.click(); Thread.sleep(2000);
	 * MUP.validateMUPwithOnlyLastNameAndDeleteUser(); String title =
	 * MUP.ActionMsg.getText(); if (title.contains("User deleted successfully")) {
	 * child31.log(LogStatus.PASS,
	 * "Validation successful because we are getting Message as '" + title +
	 * "' when we search only with LastNameData and Delete User"); } else {
	 * child31.log(LogStatus.FAIL,
	 * "Validation Unsuccessful because we are getting Message as '" + title +
	 * "' when we search only with LastNameData and Delete User");
	 * 
	 * } }
	 * 
	 * catch (Exception e) { Thread.sleep(1000);
	 * 
	 * child31.log(LogStatus.FAIL, e.fillInStackTrace());
	 * _extent_report.endTest(child31); }
	 * 
	 * }
	 */

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

	@Test(priority = 28, enabled = true, description = "Veifying Manage UserPage search with only StatusDropDown")
	public void VerificationOfMUPwithStatusDropDown() throws Throwable {

		child27 = _extent_report.startTest("verifying Manage User Page search with only StatusDropDown");
		child27.assignCategory("Manage User");
		try {
			Thread.sleep(2000);
			MUP.ResetSearchClick.click();
			Thread.sleep(2000);
			MUP.validateMUPwithOnlyStatus();
			Thread.sleep(2000);
			Boolean flag = MUP.Actionsicon.isDisplayed();
			String title = flag.toString();
			System.out.println(title);
			if (title.contains("true")) {
				child27.log(LogStatus.PASS, "Validation successful because we are getting Message as '" + title
						+ "' when we search only with StatusDropDown");
			} else {
				child27.log(LogStatus.FAIL, "Validation successful because we are getting Message as '" + title
						+ "' when we search only with StatusDropDown");

			}
		}

		catch (Exception e) {
			Thread.sleep(1000);

			child27.log(LogStatus.FAIL, e.fillInStackTrace());

			_extent_report.endTest(child27);
		}

	}

	@Test(priority = 29, enabled = true, description = "Verifying Manage UserPage search with only Status and Edit User")
	public void VerificationOfMUPwithStatusAndEditUser() throws Throwable {

		child28 = _extent_report.startTest("Verifying Manage User Page search with only Status and Edit User");
		child28.assignCategory("Manage User");
		try {
			Thread.sleep(2000);
			MUP.ResetSearchClick.click();
			Thread.sleep(2000);
			MUP.validateMUPwithOnlyStatusAndEditUser();
			String title = MUP.ActionMsg.getText();
			if (title.contains("User updated successfully")) {
				child28.log(LogStatus.PASS, "Validation successful because we are getting Message as '" + title
						+ "' when we search only with Status and Edit User");
			} else {
				child28.log(LogStatus.FAIL, "Validation successful because we are getting Message as '" + title
						+ "' when we search only with Status and Edit User");

			}
		}

		catch (Exception e) {
			Thread.sleep(1000);

			child28.log(LogStatus.FAIL, e.fillInStackTrace());

			_extent_report.endTest(child28);
		}

	}

	@Test(priority = 30, enabled = true, description = "Verifying Manage UserPage search with only Status and Deactivate User")
	public void VerificationOfMUPwithStatusAndDeactivateUser() throws Throwable {

		child29 = _extent_report.startTest("Verifying Manage User Page search with only Status and Deactivate User");
		child29.assignCategory("Manage User");
		try {
			Thread.sleep(2000);
			MUP.ResetSearchClick.click();
			Thread.sleep(2000);
			MUP.validateMUPwithOnlyStatusAndDeactivateUser();
			String title = MUP.ActionMsg.getText();
			if (title.contains("Status updated successfully")) {
				child29.log(LogStatus.PASS, "Validation successful because we are getting Message as '" + title
						+ "' when we search only with Status and Deactivate User");
			} else {
				child29.log(LogStatus.FAIL, "Validation successful because we are getting Message as '" + title
						+ "' when we search only with Status and Deactivate User");

			}
		}

		catch (Exception e) {
			Thread.sleep(1000);

			child29.log(LogStatus.FAIL, e.fillInStackTrace());

			_extent_report.endTest(child29);
		}

	}

	@Test(priority = 31, enabled = true, description = "Verifying Manage UserPage search with only Status and Delete User")
	public void VerificationOfMUPwithStatusAndDeleteUser() throws Throwable {

		child30 = _extent_report.startTest("Verifying Manage User Page search with only Status and Delete User");
		child30.assignCategory("Manage User");
		try {
			Thread.sleep(2000);
			MUP.ResetSearchClick.click();
			Thread.sleep(2000);
			MUP.validateMUPwithOnlyStatusAndDeleteUser();
			String title = MUP.ActionMsg.getText();
			if (title.contains("User deleted successfully")) {
				child30.log(LogStatus.PASS, "Validation successful because we are getting Message as '" + title
						+ "' when we search only with Status and Delete User");
			} else {

				child30.log(LogStatus.FAIL, "Validation successful because we are getting Message as '" + title
						+ "' when we search only with Status and Delete User");

			}
		}

		catch (Exception e) {
			Thread.sleep(1000);

			child30.log(LogStatus.FAIL, e.fillInStackTrace());

			_extent_report.endTest(child30);
		}

	}

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

	@Test(priority = 32, enabled = true, description = "Verfying Manage User page Search with Role as OnBoarder Of valid data")
	public void VerficationOfManageUserwithRoleasOnBoarderOfvalidData() throws Throwable {

		child31 = _extent_report.startTest("Verifying Manage User Page Search with Role as OnBoarder Of valid data");
		child31.assignCategory("Manage User");
		Thread.sleep(1000);
		try {
			Thread.sleep(2000);
			MUP.ResetSearchClick.click();
			Thread.sleep(1000);
			MUP.ValidateManageUserPagewithRoleasOnBoarderOfvaliddata();
			Boolean flag = MUP.Actionsicon.isDisplayed();
			String title = flag.toString();
			System.out.println(title);
			if (title.contains("true")) {
				child31.log(LogStatus.PASS, "Validation successful because we are getting Message as '" + title
						+ "' when we search with Role as OnBoarder");
			} else {
				child31.log(LogStatus.FAIL, "Validation successful because we are getting Message as '" + title
						+ "' when we search with Role as OnBoarder");

			}
		} catch (Exception e) {
			Thread.sleep(1000);
			child31.log(LogStatus.FAIL, e.fillInStackTrace());

		}
		_extent_report.endTest(child31);
	}

	@Test(priority = 33, enabled = true, description = "Verifying Manage User page Search with Role as OnBoarder and Edit User")
	public void VerificationOfManageUserwithRoleasOnBoarderAndEditUser() throws Throwable {

		child32 = _extent_report.startTest("Verifying Manage User Page Search with Role as OnBoarder and Edit User");
		child32.assignCategory("Manage User");
		Thread.sleep(1000);
		try {
			Thread.sleep(2000);
			MUP.ResetSearchClick.click();
			Thread.sleep(2000);
			MUP.ValidateManageUserWithRoleasOnBoarderAndEdittheUser();
			String title = MUP.ActionMsg.getText();
			if (title.contains("User updated successfully")) {
				child32.log(LogStatus.PASS, "Validation successful because we are getting Message as '" + title
						+ "' when we Edit Manage User with Role as OnBoarder");
			} else {
				child32.log(LogStatus.FAIL, "Validation successful because we are getting Message as '" + title
						+ "' when we Edit Manage User with Role as OnBoarder");

			}
		} catch (Exception e) {
			Thread.sleep(1000);
			child32.log(LogStatus.FAIL, e.fillInStackTrace());

		}
		_extent_report.endTest(child32);
	}

	@Test(priority = 34, enabled = true, description = "Verifying Manage User Page Search with Role as OnBoarder of valid data and Deactivate the User")
	public void VerificationOfManageUserwithRoleasOnBoarderAndDeactivatetheUser() throws Throwable {

		child33 = _extent_report.startTest(
				"Verifying Manage User Page Search with Role as OnBoarder of valid data and Deactivate the User");
		child33.assignCategory("Manage User");
		Thread.sleep(1000);
		try {
			Thread.sleep(2000);
			MUP.ResetSearchClick.click();
			Thread.sleep(2000);
			MUP.ValidateManageUserWithRoleasOnBoarderAndDeactivatetheUser();
			String title = MUP.ActionMsg.getText();
			if (title.contains("Status updated successfully")) {
				child33.log(LogStatus.PASS, "Validation successful because we are getting Message as '" + title
						+ "' when we Deactivate Manage User with Role as OnBoarder");
			} else {
				child33.log(LogStatus.FAIL, "Validation successful because we are getting Message as '" + title
						+ "' when we Deactivate Manage User with Role as OnBoarder");

			}
		} catch (Exception e) {
			Thread.sleep(1000);
			child33.log(LogStatus.FAIL, e.fillInStackTrace());

		}
		_extent_report.endTest(child33);
	}

	@Test(priority = 35, enabled = true, description = "Verifying Manage User Page Search with Role as OnBoarder of valid data and Activate the User")
	public void VerificationOfManageUserwithRoleasOnBoarderAndActivatetheUser() throws Throwable {

		child34 = _extent_report.startTest(
				"Verifying Manage User Page Search with Role as OnBoarder of valid data and Activate the User");
		child34.assignCategory("Manage User");
		Thread.sleep(1000);
		try {
			Thread.sleep(2000);
			MUP.ResetSearchClick.click();
			Thread.sleep(2000);
			MUP.ValidateManageUserWithRoleasOnBoarderAndActivatetheUser();
			String title = MUP.ActionMsg.getText();
			if (title.contains("Status updated successfully")) {
				child34.log(LogStatus.PASS, "Validation successful because we are getting Message as '" + title
						+ "' when we Activate Manage User with Role as OnBoarder");
			} else {
				child34.log(LogStatus.FAIL, "Validation successful because we are getting Message as '" + title
						+ "' when we Activate Manage User with Role as OnBoarder");

			}
		} catch (Exception e) {
			Thread.sleep(1000);
			child34.log(LogStatus.FAIL, e.fillInStackTrace());

		}
		_extent_report.endTest(child34);
	}

	@Test(priority = 36, enabled = true, description = "Verifying Manage User Page Search with Role as OnBoarder of valid data and Delete the User")
	public void VerificationOfManageUserwithRoleasOnBoarderAndDeletetheUser() throws Throwable {

		child35 = _extent_report
				.startTest("Verifying Manage User with Role as OnBoarder of valid data and Delete the User");
		child35.assignCategory("Manage User");
		Thread.sleep(1000);
		try {
			Thread.sleep(2000);
			MUP.ResetSearchClick.click();
			Thread.sleep(2000);
			MUP.ValidateManageUserWithRoleasOnBoarderAndDeletetheUser();
			String title = MUP.ActionMsg.getText();
			if (title.contains("User deleted successfully")) {
				child35.log(LogStatus.PASS, "Validation successful because we are getting Message as '" + title
						+ "' when we Delete Manage User with Role as OnBoarder");
			} else {
				child35.log(LogStatus.FAIL, "Validation successful because we are getting Message as '" + title
						+ "' when we Delete Manage User with Role as OnBoarder");

			}
		} catch (Exception e) {
			Thread.sleep(1000);
			child35.log(LogStatus.FAIL, e.fillInStackTrace());

		}
		_extent_report.endTest(child35);
	}

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

	@Test(priority = 37, enabled = true, description = "Verfying Manage User page Search with Role as Business Admin Of valid data")
	public void VerficationOfManageUserwithRoleasBusinessAdminOfvalidData() throws Throwable {

		child36 = _extent_report
				.startTest("Verifying Manage User Page Search with Role as Business Admin Of valid data");
		child36.assignCategory("Manage User");
		Thread.sleep(1000);
		try {
			Thread.sleep(2000);
			MUP.ResetSearchClick.click();
			Thread.sleep(1000);
			MUP.ValidateManageUserPagewithRoleasBAdminOfvaliddata();
			Boolean flag = MUP.Actionsicon.isDisplayed();
			String title = flag.toString();
			System.out.println(title);
			if (title.contains("true")) {
				child36.log(LogStatus.PASS, "Validation successful because we are getting Message as '" + title
						+ "' when we search with Role as Business Admin");
			} else {
				child36.log(LogStatus.FAIL, "Validation successful because we are getting Message as '" + title
						+ "' when we search with Role as Business Admin");

			}
		} catch (Exception e) {
			Thread.sleep(1000);
			child36.log(LogStatus.FAIL, e.fillInStackTrace());

		}
		_extent_report.endTest(child36);
	}

	@Test(priority = 38, enabled = true, description = "Verifying Manage User page Search with Role as Business Admin and Edit User")
	public void VerificationOfManageUserwithRoleasBusinessAdminAndEditUser() throws Throwable {

		child37 = _extent_report
				.startTest("Verifying Manage User Page Search with Role as Business Admin and Edit User");
		child37.assignCategory("Manage User");
		Thread.sleep(1000);
		try {
			Thread.sleep(2000);
			MUP.ResetSearchClick.click();
			Thread.sleep(2000);
			MUP.ValidateManageUserWithRoleasBAdminAndEdittheUser();
			String title = MUP.ActionMsg.getText();
			if (title.contains("User updated successfully")) {
				child37.log(LogStatus.PASS, "Validation successful because we are getting Message as '" + title
						+ "' when we Edit Manage User with Role as Business Admin");
			} else {
				child37.log(LogStatus.FAIL, "Validation successful because we are getting Message as '" + title
						+ "' when we Edit Manage User with Role as Business Admin");

			}
		} catch (Exception e) {
			Thread.sleep(1000);
			child37.log(LogStatus.FAIL, e.fillInStackTrace());

		}
		_extent_report.endTest(child37);
	}

	@Test(priority = 39, enabled = true, description = "Verifying Manage User Page Search with Role as Business Admin and Deactivate the User")
	public void VerificationOfManageUserwithRoleasBusinessAdminAndDeactivatetheUser() throws Throwable {

		child38 = _extent_report
				.startTest("Verifying Manage User Page Search with Role as Business Admin and Deactivate the User");
		child38.assignCategory("Manage User");
		Thread.sleep(1000);
		try {
			Thread.sleep(2000);
			MUP.ResetSearchClick.click();
			Thread.sleep(2000);
			MUP.ValidateManageUserWithRoleasBAdminAndDeactivatetheUser();
			String title = MUP.ActionMsg.getText();
			if (title.contains("Status updated successfully")) {
				child38.log(LogStatus.PASS, "Validation successful because we are getting Message as '" + title
						+ "' when we Deactivate Manage User with Role as Business Admin");
			} else {
				child38.log(LogStatus.FAIL, "Validation successful because we are getting Message as '" + title
						+ "' when we Deactivate Manage User with Role as Business Admin");

			}
		} catch (Exception e) {
			Thread.sleep(1000);
			child38.log(LogStatus.FAIL, e.fillInStackTrace());

		}
		_extent_report.endTest(child38);
	}

	@Test(priority = 40, enabled = true, description = "Verifying Manage User Page Search with Role as Business Admin  and Activate the User")
	public void VerificationOfManageUserwithRoleasBusinessAdminAndActivatetheUser() throws Throwable {

		child39 = _extent_report
				.startTest("Verifying Manage User Page Search with Role as Business Admin and Activate the User");
		child39.assignCategory("Manage User");
		Thread.sleep(1000);
		try {
			Thread.sleep(2000);
			MUP.ResetSearchClick.click();
			Thread.sleep(2000);
			MUP.ValidateManageUserWithRoleasBAdminAndActivatetheUser();
			String title = MUP.ActionMsg.getText();
			if (title.contains("Status updated successfully")) {
				child39.log(LogStatus.PASS, "Validation successful because we are getting Message as '" + title
						+ "' when we Activate Manage User with Role as Business Admin");
			} else {
				child39.log(LogStatus.FAIL, "Validation successful because we are getting Message as '" + title
						+ "' when we Activate Manage User with Role as Business Admin");

			}
		} catch (Exception e) {
			Thread.sleep(1000);
			child39.log(LogStatus.FAIL, e.fillInStackTrace());

		}
		_extent_report.endTest(child39);
	}

	@Test(priority = 41, enabled = true, description = "Verifying Manage User Page Search with Role as Business Admin and Delete the User")
	public void VerificationOfManageUserwithRoleasBusinessAdminAndDeletetheUser() throws Throwable {

		child40 = _extent_report.startTest("Verifying Manage User with Role as Business Admin and Delete the User");
		child40.assignCategory("Manage User");
		Thread.sleep(1000);
		try {
			Thread.sleep(2000);
			MUP.ResetSearchClick.click();
			Thread.sleep(2000);
			MUP.ValidateManageUserWithRoleasBAdminAndDeletetheUser();
			String title = MUP.ActionMsg.getText();
			if (title.contains("User deleted successfully")) {
				child40.log(LogStatus.PASS, "Validation successful because we are getting Message as '" + title
						+ "' when we Delete Manage User with Role as Business Admin");
			} else {
				child40.log(LogStatus.FAIL, "Validation successful because we are getting Message as '" + title
						+ "' when we Delete Manage User with Role as Business Admin");

			}
		} catch (Exception e) {
			Thread.sleep(1000);
			child40.log(LogStatus.FAIL, e.fillInStackTrace());

		}
		_extent_report.endTest(child40);
	}

////////////////////////////////////////////////////////////////////////////////////////////////////

	@Test(priority = 42, enabled = true, description = "Verfying Manage User page Search with Role as Business User Of valid data")
	public void VerficationOfManageUserwithRoleasBusinessUserOfvalidData() throws Throwable {

		child41 = _extent_report
				.startTest("Verifying Manage User Page Search with Role as Business User Of valid data");
		child41.assignCategory("Manage User");
		Thread.sleep(1000);
		try {
			Thread.sleep(2000);
			MUP.ResetSearchClick.click();
			Thread.sleep(1000);
			MUP.ValidateManageUserPagewithRoleasBUserOfvaliddata();
			Boolean flag = MUP.Actionsicon.isDisplayed();
			String title = flag.toString();
			System.out.println(title);
			if (title.contains("true")) {
				child41.log(LogStatus.PASS, "Validation successful because we are getting Message as '" + title
						+ "' when we search with Role as Business User");
			} else {
				child41.log(LogStatus.FAIL, "Validation successful because we are getting Message as '" + title
						+ "' when we search with Role as Business User");

			}
		} catch (Exception e) {
			Thread.sleep(1000);
			child41.log(LogStatus.FAIL, e.fillInStackTrace());

		}
		_extent_report.endTest(child41);
	}

	@Test(priority = 43, enabled = true, description = "Verifying Manage User page Search with Role as Business User and Edit User")
	public void VerificationOfManageUserwithRoleasBusinessUserAndEditUser() throws Throwable {

		child42 = _extent_report
				.startTest("Verifying Manage User Page Search with Role as Business User and Edit User");
		child42.assignCategory("Manage User");
		Thread.sleep(1000);
		try {
			Thread.sleep(2000);
			MUP.ResetSearchClick.click();
			Thread.sleep(2000);
			MUP.ValidateManageUserWithRoleasBUserAndEdittheUser();
			String title = MUP.ActionMsg.getText();
			if (title.contains("User updated successfully")) {
				child42.log(LogStatus.PASS, "Validation successful because we are getting Message as '" + title
						+ "' when we Edit Manage User with Role as Business User");
			} else {
				child42.log(LogStatus.FAIL, "Validation successful because we are getting Message as '" + title
						+ "' when we Edit Manage User with Role as Business User");

			}
		} catch (Exception e) {
			Thread.sleep(1000);
			child42.log(LogStatus.FAIL, e.fillInStackTrace());

		}
		_extent_report.endTest(child42);
	}

	@Test(priority = 44, enabled = true, description = "Verifying Manage User Page Search with Role as Business User and Deactivate the User")
	public void VerificationOfManageUserwithRoleasBusinessUserAndDeactivatetheUser() throws Throwable {

		child43 = _extent_report
				.startTest("Verifying Manage User Page Search with Role as Business User and Deactivate the User");
		child43.assignCategory("Manage User");
		Thread.sleep(1000);
		try {
			Thread.sleep(2000);
			MUP.ResetSearchClick.click();
			Thread.sleep(2000);
			MUP.ValidateManageUserWithRoleasBUserAndDeactivatetheUser();
			String title = MUP.ActionMsg.getText();
			if (title.contains("Status updated successfully")) {
				child43.log(LogStatus.PASS, "Validation successful because we are getting Message as '" + title
						+ "' when we Deactivate Manage User with Role as Business User");
			} else {
				child43.log(LogStatus.FAIL, "Validation successful because we are getting Message as '" + title
						+ "' when we Deactivate Manage User with Role as Business User");

			}
		} catch (Exception e) {
			Thread.sleep(1000);
			child43.log(LogStatus.FAIL, e.fillInStackTrace());

		}
		_extent_report.endTest(child43);
	}

	@Test(priority = 45, enabled = true, description = "Verifying Manage User Page Search with Role as Business User  and Activate the User")
	public void VerificationOfManageUserwithRoleasBusinessUserAndActivatetheUser() throws Throwable {

		child44 = _extent_report
				.startTest("Verifying Manage User Page Search with Role as Business User and Activate the User");
		child44.assignCategory("Manage User");
		Thread.sleep(1000);
		try {
			Thread.sleep(2000);
			MUP.ResetSearchClick.click();
			Thread.sleep(2000);
			MUP.ValidateManageUserWithRoleasBUserAndActivatetheUser();
			String title = MUP.ActionMsg.getText();
			if (title.contains("Status updated successfully")) {
				child44.log(LogStatus.PASS, "Validation successful because we are getting Message as '" + title
						+ "' when we Activate Manage User with Role as Business User");
			} else {
				child44.log(LogStatus.FAIL, "Validation successful because we are getting Message as '" + title
						+ "' when we Activate Manage User with Role as Business User");

			}
		} catch (Exception e) {
			Thread.sleep(1000);
			child44.log(LogStatus.FAIL, e.fillInStackTrace());

		}
		_extent_report.endTest(child44);
	}

	@Test(priority = 46, enabled = true, description = "Verifying Manage User Page Search with Role as Business User and Delete the User")
	public void VerificationOfManageUserwithRoleasBusinessUserAndDeletetheUser() throws Throwable {

		child45 = _extent_report.startTest("Verifying Manage User with Role as Business User and Delete the User");
		child45.assignCategory("Manage User");
		Thread.sleep(1000);
		try {
			Thread.sleep(2000);
			MUP.ResetSearchClick.click();
			Thread.sleep(2000);
			MUP.ValidateManageUserWithRoleasBUserAndDeletetheUser();
			String title = MUP.ActionMsg.getText();
			if (title.contains("User deleted successfully")) {
				child45.log(LogStatus.PASS, "Validation successful because we are getting Message as '" + title
						+ "' when we Delete Manage User with Role as Business User");
			} else {
				child45.log(LogStatus.FAIL, "Validation successful because we are getting Message as '" + title
						+ "' when we Delete Manage User with Role as Business User");

			}
		} catch (Exception e) {
			Thread.sleep(1000);
			child45.log(LogStatus.FAIL, e.fillInStackTrace());

		}
		_extent_report.endTest(child45);
	}

////////////////////////////////////////////////////////////////////////////////////////////////////

	@Test(priority = 47, enabled = true, description = "Verfying Manage User page Search with Role as Data Processor Of valid data")
	public void VerficationOfManageUserwithRoleasDataProcessorOfvalidData() throws Throwable {

		child46 = _extent_report
				.startTest("Verifying Manage User Page Search with Role as Data Processor Of valid data");
		child46.assignCategory("Manage User");
		Thread.sleep(1000);
		try {
			Thread.sleep(2000);
			MUP.ResetSearchClick.click();
			Thread.sleep(1000);
			MUP.ValidateManageUserPagewithRoleasDataProcessorOfvaliddata();
			Boolean flag = MUP.Actionsicon.isDisplayed();
			String title = flag.toString();
			System.out.println(title);
			if (title.contains("true")) {
				child46.log(LogStatus.PASS, "Validation successful because we are getting Message as '" + title
						+ "' when we search with Role as Data Processor");
			} else {
				child46.log(LogStatus.FAIL, "Validation successful because we are getting Message as '" + title
						+ "' when we search with Role as Data Processor");

			}
		} catch (Exception e) {
			Thread.sleep(1000);
			child46.log(LogStatus.FAIL, e.fillInStackTrace());

		}
		_extent_report.endTest(child46);
	}

	@Test(priority = 48, enabled = true, description = "Verifying Manage User page Search with Role as Data Processor and Edit User")
	public void VerificationOfManageUserwithRoleasDataProcessorAndEditUser() throws Throwable {

		child47 = _extent_report
				.startTest("Verifying Manage User Page Search with Role as Data Processor and Edit User");
		child47.assignCategory("Manage User");
		Thread.sleep(1000);
		try {
			Thread.sleep(2000);
			MUP.ResetSearchClick.click();
			Thread.sleep(2000);
			MUP.ValidateManageUserWithRoleasDataProcessorAndEdittheUser();
			String title = MUP.ActionMsg.getText();
			if (title.contains("User updated successfully")) {
				child47.log(LogStatus.PASS, "Validation successful because we are getting Message as '" + title
						+ "' when we Edit Manage User with Role as Data Processor");
			} else {
				child47.log(LogStatus.FAIL, "Validation successful because we are getting Message as '" + title
						+ "' when we Edit Manage User with Role as Data Processor");

			}
		} catch (Exception e) {
			Thread.sleep(1000);
			child47.log(LogStatus.FAIL, e.fillInStackTrace());

		}
		_extent_report.endTest(child47);
	}

	@Test(priority = 49, enabled = true, description = "Verifying Manage User Page Search with Role as Data Processor and Deactivate the User")
	public void VerificationOfManageUserwithRoleasDataProcessorAndDeactivatetheUser() throws Throwable {

		child48 = _extent_report
				.startTest("Verifying Manage User Page Search with Role as Data Processor and Deactivate the User");
		child48.assignCategory("Manage User");
		Thread.sleep(1000);
		try {
			Thread.sleep(2000);
			MUP.ResetSearchClick.click();
			Thread.sleep(2000);
			MUP.ValidateManageUserWithRoleasDataProcessorAndDeactivatetheUser();
			String title = MUP.ActionMsg.getText();
			if (title.contains("Status updated successfully")) {
				child48.log(LogStatus.PASS, "Validation successful because we are getting Message as '" + title
						+ "' when we Deactivate Manage User with Role as Data Processor");
			} else {
				child48.log(LogStatus.FAIL, "Validation successful because we are getting Message as '" + title
						+ "' when we Deactivate Manage User with Role as Data Processor");

			}
		} catch (Exception e) {
			Thread.sleep(1000);
			child48.log(LogStatus.FAIL, e.fillInStackTrace());

		}
		_extent_report.endTest(child48);
	}

	@Test(priority = 50, enabled = true, description = "Verifying Manage User Page Search with Role as Data Processor  and Activate the User")
	public void VerificationOfManageUserwithRoleasDataProcessorAndActivatetheUser() throws Throwable {

		child49 = _extent_report
				.startTest("Verifying Manage User Page Search with Role as Data Processor and Activate the User");
		child49.assignCategory("Manage User");
		Thread.sleep(1000);
		try {
			Thread.sleep(2000);
			MUP.ResetSearchClick.click();
			Thread.sleep(2000);
			MUP.ValidateManageUserWithRoleasDataProcessorAndActivatetheUser();
			String title = MUP.ActionMsg.getText();
			if (title.contains("Status updated successfully")) {
				child49.log(LogStatus.PASS, "Validation successful because we are getting Message as '" + title
						+ "' when we Activate Manage User with Role as Data Processor");
			} else {
				child49.log(LogStatus.FAIL, "Validation successful because we are getting Message as '" + title
						+ "' when we Activate Manage User with Role as Data Processor");

			}
		} catch (Exception e) {
			Thread.sleep(1000);
			child49.log(LogStatus.FAIL, e.fillInStackTrace());

		}
		_extent_report.endTest(child49);
	}

	@Test(priority = 51, enabled = true, description = "Verifying Manage User Page Search with Role as Data Processor and Delete the User")
	public void VerificationOfManageUserwithRoleasDataProcessorAndDeletetheUser() throws Throwable {

		child50 = _extent_report.startTest("Verifying Manage User with Role as Data Processor and Delete the User");
		child50.assignCategory("Manage User");
		Thread.sleep(1000);
		try {
			Thread.sleep(2000);
			MUP.ResetSearchClick.click();
			Thread.sleep(2000);
			MUP.ValidateManageUserWithRoleasDataProcessorAndDeletetheUser();
			String title = MUP.ActionMsg.getText();
			if (title.contains("User deleted successfully")) {
				child50.log(LogStatus.PASS, "Validation successful because we are getting Message as '" + title
						+ "' when we Delete Manage User with Role as Data Processor");
			} else {
				child50.log(LogStatus.FAIL, "Validation successful because we are getting Message as '" + title
						+ "' when we Delete Manage User with Role as Data Processor");

			}
		} catch (Exception e) {
			Thread.sleep(1000);
			child50.log(LogStatus.FAIL, e.fillInStackTrace());

		}
		_extent_report.endTest(child50);
	}

////////////////////////////////////////////////////////////////////////////////////////////////////

	@Test(priority = 52, enabled = true, description = "Verfying Manage User page Search with Role as Data Processor Restricted Of valid data")
	public void VerficationOfManageUserwithRoleasDataProcessorRestrictedOfvalidData() throws Throwable {

		child51 = _extent_report
				.startTest("Verifying Manage User Page Search with Role as Data Processor Restricted Of valid data");
		child51.assignCategory("Manage User");
		Thread.sleep(1000);
		try {
			Thread.sleep(2000);
			MUP.ResetSearchClick.click();
			Thread.sleep(1000);
			MUP.ValidateManageUserPagewithRoleasDataProcessorResOfvaliddata();
			Boolean flag = MUP.Actionsicon.isDisplayed();
			String title = flag.toString();
			System.out.println(title);
			if (title.contains("true")) {
				child51.log(LogStatus.PASS, "Validation successful because we are getting Message as '" + title
						+ "' when we search with Role as Data Processor Restricted");
			} else {
				child51.log(LogStatus.FAIL, "Validation successful because we are getting Message as '" + title
						+ "' when we search with Role as Data Processor Restricted");

			}
		} catch (Exception e) {
			Thread.sleep(1000);
			child51.log(LogStatus.FAIL, e.fillInStackTrace());

		}
		_extent_report.endTest(child51);
	}

	@Test(priority = 53, enabled = true, description = "Verifying Manage User page Search with Role as Data Processor Restricted and Edit User")
	public void VerificationOfManageUserwithRoleasDataProcessorRestrictedAndEditUser() throws Throwable {

		child52 = _extent_report
				.startTest("Verifying Manage User Page Search with Role as Data Processor Restricted and Edit User");
		child52.assignCategory("Manage User");
		Thread.sleep(1000);
		try {
			Thread.sleep(2000);
			MUP.ResetSearchClick.click();
			Thread.sleep(2000);
			MUP.ValidateManageUserWithRoleasDataProcessorResAndEdittheUser();
			String title = MUP.ActionMsg.getText();
			if (title.contains("User updated successfully")) {
				child52.log(LogStatus.PASS, "Validation successful because we are getting Message as '" + title
						+ "' when we Edit Manage User with Role as Data Processor Restricted");
			} else {
				child52.log(LogStatus.FAIL, "Validation successful because we are getting Message as '" + title
						+ "' when we Edit Manage User with Role as Data Processor Restricted");

			}
		} catch (Exception e) {
			Thread.sleep(1000);
			child52.log(LogStatus.FAIL, e.fillInStackTrace());

		}
		_extent_report.endTest(child52);
	}

	@Test(priority = 54, enabled = true, description = "Verifying Manage User Page Search with Role as Data Processor Restricted and Deactivate the User")
	public void VerificationOfManageUserwithRoleasDataProcessorRestrictedAndDeactivatetheUser() throws Throwable {

		child53 = _extent_report.startTest(
				"Verifying Manage User Page Search with Role as Data Processor Restricted and Deactivate the User");
		child53.assignCategory("Manage User");
		Thread.sleep(1000);
		try {
			Thread.sleep(2000);
			MUP.ResetSearchClick.click();
			Thread.sleep(2000);
			MUP.ValidateManageUserWithRoleasDataProcessorResAndDeactivatetheUser();
			String title = MUP.ActionMsg.getText();
			if (title.contains("Status updated successfully")) {
				child53.log(LogStatus.PASS, "Validation successful because we are getting Message as '" + title
						+ "' when we Deactivate Manage User with Role as Data Processor Restricted");
			} else {
				child53.log(LogStatus.FAIL, "Validation successful because we are getting Message as '" + title
						+ "' when we Deactivate Manage User with Role as Data Processor Restricted");

			}
		} catch (Exception e) {
			Thread.sleep(1000);
			child53.log(LogStatus.FAIL, e.fillInStackTrace());

		}
		_extent_report.endTest(child53);
	}

	@Test(priority = 55, enabled = true, description = "Verifying Manage User Page Search with Role as Data Processor Restricted  and Activate the User")
	public void VerificationOfManageUserwithRoleasDataProcessorRestrictedAndActivatetheUser() throws Throwable {

		child54 = _extent_report.startTest(
				"Verifying Manage User Page Search with Role as Data Processor Restricted and Activate the User");
		child54.assignCategory("Manage User");
		Thread.sleep(1000);
		try {
			Thread.sleep(2000);
			MUP.ResetSearchClick.click();
			Thread.sleep(2000);
			MUP.ValidateManageUserWithRoleasDataProcessorResAndActivatetheUser();
			String title = MUP.ActionMsg.getText();
			if (title.contains("Status updated successfully")) {
				child54.log(LogStatus.PASS, "Validation successful because we are getting Message as '" + title
						+ "' when we Activate Manage User with Role as Data Processor Restricted");
			} else {
				child54.log(LogStatus.FAIL, "Validation successful because we are getting Message as '" + title
						+ "' when we Activate Manage User with Role as Data Processor Restricted");

			}
		} catch (Exception e) {
			Thread.sleep(1000);
			child54.log(LogStatus.FAIL, e.fillInStackTrace());

		}
		_extent_report.endTest(child54);
	}

	@Test(priority = 56, enabled = true, description = "Verifying Manage User Page Search with Role as Data Processor Restricted and Delete the User")
	public void VerificationOfManageUserwithRoleasDataProcessorRestrictedAndDeletetheUser() throws Throwable {

		child55 = _extent_report
				.startTest("Verifying Manage User with Role as Data Processor Restricted and Delete the User");
		child55.assignCategory("Manage User");
		Thread.sleep(1000);
		try {
			Thread.sleep(2000);
			MUP.ResetSearchClick.click();
			Thread.sleep(2000);
			MUP.ValidateManageUserWithRoleasDataProcessorResAndDeletetheUser();
			String title = MUP.ActionMsg.getText();
			if (title.contains("User deleted successfully")) {
				child55.log(LogStatus.PASS, "Validation successful because we are getting Message as '" + title
						+ "' when we Delete Manage User with Role as Data Processor Restricted");
			} else {
				child55.log(LogStatus.FAIL, "Validation successful because we are getting Message as '" + title
						+ "' when we Delete Manage User with Role as Data Processor Restricted");

			}
		} catch (Exception e) {
			Thread.sleep(1000);
			child55.log(LogStatus.FAIL, e.fillInStackTrace());

		}
		_extent_report.endTest(child55);
	}

////////////////////////////////////////////////////////////////////////////////////////////////////

	@Test(priority = 57, enabled = true, description = "ManageUser Page Search Result Verification with Reset Search")
	public void ManageUserPageTestWithResetSearch() throws Throwable {
		child56 = _extent_report.startTest("ManageUser Page Search Result Verification with Reset Search");
		child56.assignCategory("Manage User");
		try {
			Thread.sleep(1000);
			MUP.ResetSearchClick.click();
			Thread.sleep(1000);
			MUP.ValidateManageUserPagewithvaliddata();
			Thread.sleep(1000);

			MUP.SearchUserClick.click();
			Thread.sleep(1000);

			MUP.ResetSearchClick.click();
			Thread.sleep(2000);

			if (MUP.UserIdData.getText().isEmpty() && MUP.FirstNameData.getText().isEmpty()
					&& MUP.LastNameData.getText().isEmpty() && MUP.EmailData.getText().isEmpty()
					&& MUP.RoleDropDown.getText() != null) {
				child56.log(LogStatus.PASS,
						"Validation successful because Reset Search is Resetting All the Fields in Manage User page");
			} else {
				child56.log(LogStatus.FAIL,
						"Validation Unsuccessful because Reset Search is not Resetting All the Fields in Manage User page");
			}
		} catch (Exception e) {
			child56.log(LogStatus.FAIL, e.fillInStackTrace());
		}
		_extent_report.endTest(child56);
	}

	@Test(priority = 58, enabled = true, description = "Verifying Manage User Page search with invalid data")
	public void VerificationOfManageUserPageWithInvalidData() throws Throwable {

		child57 = _extent_report.startTest("Verifying Manage User Page search with invalid data");
		child57.assignCategory("Manage User");
		Thread.sleep(1000);

		try {
			Thread.sleep(2000);
			MUP.ResetSearchClick.click();
			Thread.sleep(2000);
			MUP.ValidateManageuserPageErrorResults();
			String title = MUP.ErrorMsg.getText();
			if (title.equals("No results found !")) {
				child57.log(LogStatus.PASS, "Validation successful because we are getting Message as '" + title
						+ "' when we search with invalid data");
			} else {
				child57.log(LogStatus.FAIL, "Validation Unsuccessful because we are getting Message as '" + title
						+ "' when we search with invalid data");

			}
		}

		catch (Exception e) {
			Thread.sleep(1000);

			child57.log(LogStatus.FAIL, e.fillInStackTrace());

			_extent_report.endTest(child57);
		}

	}

	@AfterTest
	public void tearDown() {

		_test_logger6.appendChild(Parent14);

		Parent14.appendChild(child1).appendChild(child2).appendChild(child3).appendChild(child4).appendChild(child5)
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
				.appendChild(child55).appendChild(child56).appendChild(child57);

		_extent_report.endTest(Parent14);

	//	_extent_report.endTest(_test_logger6);

		_extent_report.flush();

	}

}
