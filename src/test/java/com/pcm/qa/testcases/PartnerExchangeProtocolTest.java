package com.pcm.qa.testcases;

import org.openqa.selenium.Keys;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.pcm.qa.base.TestBase;

import com.pcm.qa.pages.PartnerExchangeProtocol;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import autoitx4java.AutoItX;

public class PartnerExchangeProtocolTest extends TestBase{
	
	PartnerExchangeProtocol PEP;

	public AutoItX x;

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
	
	@BeforeTest(enabled=true)
	public void setup() throws Exception {
		
		Extentreport();
		initialization();
		
	}
	
	
	
	@BeforeMethod
	public void setUp() throws Exception {
		
		PEP = new PartnerExchangeProtocol();
	
	}
	
	
	@Test(priority = 1, enabled = true) 
	public void ParentNodeCreation() {
		_test_logger101 = _extent_report.startTest("Partner Exchange Protocol");
		Parent1 = _extent_report.startTest("Exchange Protocol");

	}
	
	@Test(priority = 2, enabled = true, description = "Validating Exchange Protocol from FTP H2P to FTP P2H")
	public void FTPH2PtoFTPP2H() throws Throwable {
		child1 = _extent_report
				.startTest("Validating Exchange Protocol from FTP H2P to FTP P2H");
		child1.assignCategory("FTP H2P to FTP P2H");
		try {
			Thread.sleep(2000);
			PEP.PartnerClick.click();
			Thread.sleep(1000);
			PEP.CreatePartnerClick.click();
			Thread.sleep(2000);
			PEP.Commondata();
			
			Thread.sleep(1000);
			DropDownSelection(PEP.ProtocolDD, "B2Bi-FTP");
			Thread.sleep(2000);
//			DropDownSelection(PEP.StatusDD, "Active");
//			Thread.sleep(2000);
			
			PEP.ValidateFTPH2PWithValidData();
			
			Thread.sleep(2000);
			PEP.SearchClick.click();
			Thread.sleep(2000);
			PEP.Actionsicon.click();
			Thread.sleep(1000);
			PEP.Editbtn.click();
			Thread.sleep(3000);
			
			PEP.FTPP2HClick.click();
			Thread.sleep(1000);

		
			PEP.FTPUsernameData.sendKeys(Keys.chord(Keys.CONTROL, "a"), "testing123");
			PEP.FTPPwdData.sendKeys(Keys.chord(Keys.CONTROL, "a"), "testing1234");
			Thread.sleep(1000);
			
			PEP.SubmitClick.click();
			
			String title = PEP.Actionmsg.getText();
			System.out.println(title);
			if (title.contains("Partner updated successfully")) {
				child1.log(LogStatus.PASS, "Validation successful because we are getting message as " + title
						+ "");
			} else {
				child1.log(LogStatus.FAIL, "Validation Unsuccessful because we are getting message as " + title
						+ "");
			}
		} catch (Exception e) {
			child1.log(LogStatus.FAIL, e.fillInStackTrace());
			
			PEP.Error1MessageOkclick.click();
			PEP.Cancelbtn.click();
			PEP.YesCancelitbtn.click();
		}
		_extent_report.endTest(child1);
	}

	@Test(priority = 3, enabled = true, description = "Validating Exchange Protocol from FTP P2H to FTP H2P")
	public void FTPP2HtoFTPH2P() throws Throwable {
		child2 = _extent_report
				.startTest("Validating Exchange Protocol from FTP P2H to FTP H2P");
		child2.assignCategory("FTP P2H to FTP H2P");
		try {
			Thread.sleep(2000);
			PEP.CreatePartnerClick.click();
			Thread.sleep(2000);
			PEP.Commondata();
			
			Thread.sleep(1000);
			DropDownSelection(PEP.ProtocolDD, "B2Bi-FTP");
			Thread.sleep(2000);
//			DropDownSelection(PEP.StatusDD, "Active");
//			Thread.sleep(2000);
			
			PEP.ValidateFTPP2HWithValidData();
			
			Thread.sleep(2000);
			PEP.SearchClick.click();
			Thread.sleep(2000);
			PEP.Actionsicon.click();
			Thread.sleep(1000);
			PEP.Editbtn.click();
			Thread.sleep(3000);
			
			PEP.FTPH2PClick.click();
			Thread.sleep(1000);
			
			PEP.FTPHostNameData.sendKeys(Keys.chord(Keys.CONTROL, "a"), "20.55.8.34");
			PEP.FTPPortNoData.sendKeys(Keys.chord(Keys.CONTROL, "a"), "10021");
			PEP.FTPUsernameData.sendKeys(Keys.chord(Keys.CONTROL, "a"), "testing1235");
			PEP.FTPPwdData.sendKeys(Keys.chord(Keys.CONTROL, "a"), "testing1234");
			Thread.sleep(1000);
			PEP.SubmitClick.click();
			Thread.sleep(1000);
			
			String title = PEP.Actionmsg.getText();
			System.out.println(title);
			if (title.contains("Partner updated successfully")) {
				child2.log(LogStatus.PASS, "Validation successful because we are getting message as " + title
						+ "");
			} else {
				child2.log(LogStatus.FAIL, "Validation Unsuccessful because we are getting message as " + title
						+ "");
			}
		} catch (Exception e) {
			child2.log(LogStatus.FAIL, e.fillInStackTrace());
			
			PEP.Error1MessageOkclick.click();
			PEP.Cancelbtn.click();
			PEP.YesCancelitbtn.click();
		}
		_extent_report.endTest(child2);
	}
	
	
	@Test(priority = 4, enabled = true, description = "Validating Exchange Protocol from FTP to FTPS ")
	public void FTPtoFTPS() throws Throwable {
		child3 = _extent_report
				.startTest("Validating Exchange Protocol from FTP to FTPS");
		child3.assignCategory("FTP to FTPS");
		try {
			
			Thread.sleep(2000);
			PEP.SearchClick.click();
			Thread.sleep(2000);
			PEP.Actionsicon.click();
			Thread.sleep(1000);
			PEP.Editbtn.click();
			Thread.sleep(3000);
			
			DropDownSelection(PEP.ProtocolDD, "B2Bi-FTPS");
			Thread.sleep(2000);

		
			PEP.ValidateFTPSH2PWithValidData();
			
			String title = PEP.Actionmsg.getText();
			System.out.println(title);
			if (title.contains("Partner updated successfully")) {
				child3.log(LogStatus.PASS, "Validation successful because we are getting message as " + title
						+ "");
			} else {
				child3.log(LogStatus.FAIL, "Validation Unsuccessful because we are getting message as " + title
						+ "");
			}
		} catch (Exception e) {
			child3.log(LogStatus.FAIL, e.fillInStackTrace());
			
			PEP.Error1MessageOkclick.click();
			PEP.Cancelbtn.click();
			PEP.YesCancelitbtn.click();
		}
		_extent_report.endTest(child3);
	}
	
	
	@Test(priority = 5, enabled = true, description = "Validating Exchange Protocol from FTPS H2P to FTPS P2H")
	public void FTPSH2PtoFTPSP2H() throws Throwable {
		child4 = _extent_report
				.startTest("Validating Exchange Protocol from FTPS H2P to FTPS P2H");
		child4.assignCategory("FTPS H2P to FTPS P2H");
		try {
			
			Thread.sleep(2000);
			PEP.CreatePartnerClick.click();
			Thread.sleep(2000);
			PEP.Commondata();
			
			Thread.sleep(1000);
			DropDownSelection(PEP.ProtocolDD, "B2Bi-FTPS");
			Thread.sleep(2000);
		//	DropDownSelection(PEP.StatusDD, "Active");
		//	Thread.sleep(2000);
			
			PEP.ValidateFTPSH2PWithValidData();
			
			Thread.sleep(2000);
			PEP.SearchClick.click();
			Thread.sleep(2000);
			PEP.Actionsicon.click();
			Thread.sleep(1000);
			PEP.Editbtn.click();
			Thread.sleep(3000);
			
			PEP.FTPSP2HClick.click();
			Thread.sleep(1000);

		
			PEP.FTPSUsernameData.sendKeys(Keys.chord(Keys.CONTROL, "a"), "testing123fghjk");
			PEP.FTPSPwdData.sendKeys(Keys.chord(Keys.CONTROL, "a"), "testing1234kjhgyu");
			Thread.sleep(1000);
			
			PEP.SubmitClick.click();
			
			String title = PEP.Actionmsg.getText();
			System.out.println(title);
			if (title.contains("Partner updated successfully")) {
				child4.log(LogStatus.PASS, "Validation successful because we are getting message as " + title
						+ "");
			} else {
				child4.log(LogStatus.FAIL, "Validation Unsuccessful because we are getting message as " + title
						+ "");
			}
		} catch (Exception e) {
			child4.log(LogStatus.FAIL, e.fillInStackTrace());
			
			PEP.Error1MessageOkclick.click();
			PEP.Cancelbtn.click();
			PEP.YesCancelitbtn.click();
		}
		_extent_report.endTest(child4);
	}

	@Test(priority = 6, enabled = true, description = "Validating Exchange Protocol from FTPS P2H to FTPS H2P")
	public void FTPSP2HtoFTPSH2P() throws Throwable {
		child5 = _extent_report
				.startTest("Validating Exchange Protocol from FTPS P2H to FTPS H2P");
		child5.assignCategory("FTPS P2H to FTPS H2P");
		try {
			Thread.sleep(2000);
			PEP.CreatePartnerClick.click();
			Thread.sleep(2000);
			PEP.Commondata();
			
			Thread.sleep(1000);
			DropDownSelection(PEP.ProtocolDD, "B2Bi-FTPS");
			Thread.sleep(2000);
		//	DropDownSelection(PEP.StatusDD, "Active");
		//	Thread.sleep(2000);
			
			PEP.ValidateFTPSP2HWithValidData();
			
			Thread.sleep(4000);
			PEP.SearchClick.click();
			Thread.sleep(2000);
			PEP.Actionsicon.click();
			Thread.sleep(1000);
			PEP.Editbtn.click();
			Thread.sleep(3000);
			
			PEP.FTPSH2PClick.click();
			Thread.sleep(1000);
			
			PEP.FTPHostNameData.sendKeys(Keys.chord(Keys.CONTROL, "a"), "20.55.8.34");
			PEP.FTPPortNoData.sendKeys(Keys.chord(Keys.CONTROL, "a"), "10022");
			DropDownSelection(PEP.FTPSEncryptionStrengthDD, "All");
			PEP.FTPUsernameData.sendKeys(Keys.chord(Keys.CONTROL, "a"), "testing12dfghytr");
			PEP.FTPPwdData.sendKeys(Keys.chord(Keys.CONTROL, "a"), "testing1234qwertf");
			DropDownSelection(PEP.FTPSCertIdDD, "qwerty3");
			Thread.sleep(1000);
			PEP.SubmitClick.click();
			Thread.sleep(1000);
			
			String title = PEP.Actionmsg.getText();
			System.out.println(title);
			if (title.contains("Partner updated successfully")) {
				child5.log(LogStatus.PASS, "Validation successful because we are getting message as " + title
						+ "");
			} else {
				child5.log(LogStatus.FAIL, "Validation Unsuccessful because we are getting message as " + title
						+ "");
			}
		} catch (Exception e) {
			child5.log(LogStatus.FAIL, e.fillInStackTrace());
			
			PEP.Error1MessageOkclick.click();
			PEP.Cancelbtn.click();
			PEP.YesCancelitbtn.click();
		}
		_extent_report.endTest(child5);
	}
	
	
	@Test(priority = 7, enabled = true, description = "Validating Exchange Protocol from FTPS to SFTP")
	public void FTPStoSFTP() throws Throwable {
		child6 = _extent_report
				.startTest("Validating Exchange Protocol from FTPS to SFTP");
		child6.assignCategory("FTP to FTPS");
		try {
			
			Thread.sleep(2000);
			PEP.SearchClick.click();
			Thread.sleep(2000);
			PEP.Actionsicon.click();
			Thread.sleep(1000);
			PEP.Editbtn.click();
			Thread.sleep(3000);
			
			DropDownSelection(PEP.ProtocolDD, "B2Bi-SFTP");
			Thread.sleep(2000);

		
			PEP.ValidateSFTP_H2P();
			
			String title = PEP.Actionmsg.getText();
			System.out.println(title);
			if (title.contains("Partner updated successfully")) {
				child6.log(LogStatus.PASS, "Validation successful because we are getting message as " + title
						+ "");
			} else {
				child6.log(LogStatus.FAIL, "Validation Unsuccessful because we are getting message as " + title
						+ "");
			}
		} catch (Exception e) {
			child6.log(LogStatus.FAIL, e.fillInStackTrace());
			
			PEP.Error1MessageOkclick.click();
			PEP.Cancelbtn.click();
			PEP.YesCancelitbtn.click();
		}
		_extent_report.endTest(child6);
	}
	
	
	@Test(priority = 8, enabled = true, description = "Validating Exchange Protocol from SFTP H2P to SFTP P2H")
	public void SFTPH2PtoSFTPP2H() throws Throwable {
		child7 = _extent_report
				.startTest("Validating Exchange Protocol from SFTP H2P to SFTP P2H");
		child7.assignCategory("SFTP H2P to SFTP P2H");
		try {
			Thread.sleep(2000);
			PEP.CreatePartnerClick.click();
			Thread.sleep(2000);
			PEP.Commondata();
			
			Thread.sleep(1000);
			DropDownSelection(PEP.ProtocolDD, "B2Bi-SFTP");
			Thread.sleep(2000);
//			DropDownSelection(PEP.StatusDD, "Active");
//			Thread.sleep(2000);
			
			PEP.ValidateSFTP_H2P();
			
			Thread.sleep(2000);
			PEP.SearchClick.click();
			Thread.sleep(2000);
			PEP.Actionsicon.click();
			Thread.sleep(1000);
			PEP.Editbtn.click();
			Thread.sleep(3000);
			
			PEP.SFTPP2HClick.click();
			Thread.sleep(1000);

		
			PEP.SFTPUserNameData.sendKeys(Keys.chord(Keys.CONTROL, "a"), "testing123");
			PEP.SFTPPasswordData.sendKeys(Keys.chord(Keys.CONTROL, "a"), "testing1234");
			Thread.sleep(1000);
			
			PEP.SubmitClick.click();
			
			String title = PEP.Actionmsg.getText();
			System.out.println(title);
			if (title.contains("Partner updated successfully")) {
				child7.log(LogStatus.PASS, "Validation successful because we are getting message as " + title
						+ "");
			} else {
				child7.log(LogStatus.FAIL, "Validation Unsuccessful because we are getting message as " + title
						+ "");
			}
		} catch (Exception e) {
			child7.log(LogStatus.FAIL, e.fillInStackTrace());
			
			PEP.Error1MessageOkclick.click();
			PEP.Cancelbtn.click();
			PEP.YesCancelitbtn.click();
		}
		_extent_report.endTest(child7);
	}

	@Test(priority = 9, enabled = true, description = "Validating Exchange Protocol from SFTP P2H to SFTP H2P")
	public void SFTPP2HtoSFTPH2P() throws Throwable {
		child8 = _extent_report
				.startTest("Validating Exchange Protocol from SFTP P2H to SFTP H2P");
		child8.assignCategory("SFTP P2H to SFTP H2P");
		try {
			Thread.sleep(2000);
			PEP.CreatePartnerClick.click();
			Thread.sleep(2000);
			PEP.Commondata();
			
			Thread.sleep(1000);
			DropDownSelection(PEP.ProtocolDD, "B2Bi-SFTP");
			Thread.sleep(2000);
//			DropDownSelection(PEP.StatusDD, "Active");
//			Thread.sleep(2000);
			
			PEP.ValidateSFTP_P2H();
			
			Thread.sleep(4000);
			PEP.SearchClick.click();
			Thread.sleep(2000);
			PEP.Actionsicon.click();
			Thread.sleep(1000);
			PEP.Editbtn.click();
			Thread.sleep(3000);
			
			PEP.SFTPH2PClick.click();
			Thread.sleep(1000);
			
			PEP.SFTPHostNameData.sendKeys(Keys.chord(Keys.CONTROL, "a"), "20.55.8.34");
			PEP.SFTPPortNoData.sendKeys(Keys.chord(Keys.CONTROL, "a"), "10021");
			PEP.FTPUsernameData.sendKeys(Keys.chord(Keys.CONTROL, "a"), "testi235");
			PEP.FTPPwdData.sendKeys(Keys.chord(Keys.CONTROL, "a"), "testi234");
			Thread.sleep(2000);

			DropDownSelection(PEP.SFTPUserIdentityKeyDD, "qwerty");
			Thread.sleep(2000);
			DropDownSelection(PEP.SFTPKnownHostKeyDD, "qwerty");
			Thread.sleep(2000);
			PEP.SubmitClick.click();
			Thread.sleep(1000);
			
			String title = PEP.Actionmsg.getText();
			System.out.println(title);
			if (title.contains("Partner updated successfully")) {
				child8.log(LogStatus.PASS, "Validation successful because we are getting message as " + title
						+ "");
			} else {
				child8.log(LogStatus.FAIL, "Validation Unsuccessful because we are getting message as " + title
						+ "");
			}
		} catch (Exception e) {
			child8.log(LogStatus.FAIL, e.fillInStackTrace());
			
			PEP.Error1MessageOkclick.click();
			PEP.Cancelbtn.click();
			PEP.YesCancelitbtn.click();
		}
		_extent_report.endTest(child8);
	}
	

	
	@Test(priority = 10, enabled = true, description = "Validating Exchange Protocol from SFTP to FTP")
	public void SFTPtoFTP() throws Throwable {
		child9 = _extent_report
				.startTest("Validating Exchange Protocol from SFTP to FTP");
		child9.assignCategory("FTP to FTPS");
		try {
			
			Thread.sleep(2000);
			PEP.SearchClick.click();
			Thread.sleep(2000);
			PEP.Actionsicon.click();
			Thread.sleep(1000);
			PEP.Editbtn.click();
			Thread.sleep(3000);
			
			DropDownSelection(PEP.ProtocolDD, "B2Bi-FTPS");
			Thread.sleep(2000);

		
			PEP.ValidateFTPSH2PWithValidData();
			
			String title = PEP.Actionmsg.getText();
			System.out.println(title);
			if (title.contains("Partner updated successfully")) {
				child9.log(LogStatus.PASS, "Validation successful because we are getting message as " + title
						+ "");
			} else {
				child9.log(LogStatus.FAIL, "Validation Unsuccessful because we are getting message as " + title
						+ "");
			}
		} catch (Exception e) {
			child9.log(LogStatus.FAIL, e.fillInStackTrace());
			
			PEP.Error1MessageOkclick.click();
			PEP.Cancelbtn.click();
			PEP.YesCancelitbtn.click();
		}
		_extent_report.endTest(child9);
	}
	
	
	@AfterTest
	public void tearDown() {

		_test_logger101.appendChild(Parent1);

		Parent1.appendChild(child1).appendChild(child2).appendChild(child3).appendChild(child4).appendChild(child5).appendChild(child6).appendChild(child7).appendChild(child8).appendChild(child9);

		_extent_report.endTest(Parent1);

		_extent_report.endTest(_test_logger101);
		_extent_report.flush();
		
	}
	
	
	
	
	
	
	
	
	

}
