package com.pcm.qa.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.pcm.qa.base.TestBase;

public class PartnerExchangeProtocol extends TestBase {
	
	public static int pn = 1050;
	public static int pid = 1050;
	public static int e = 1;
	public static int p = 1;
	public static int A1 = 1;
	public static int A2 = 1;

	@FindBy(xpath = "//span//mat-icon[contains(text(),'menu')]")
	public WebElement ControlMenuClick;

	@FindBy(xpath = "//mat-drawer//mat-nav-list[3]//span[contains(text(),'Partner')]")
	public WebElement PartnerClick;

	@FindBy(xpath = "//div//mat-nav-list//span[contains(text(),'Create Partner')]")
	public WebElement CreatePartnerClick;

	@FindBy(xpath = "//div//mat-nav-list//span[contains(text(),'Manage Partner')]")
	public WebElement ManagePartnerClick;

	@FindBy(xpath = "//input[@placeholder='Partner Name *']")
	public WebElement PartnerNameData;

	@FindBy(xpath = "//input[@placeholder='Partner Id *']")
	public WebElement PartnerIdData;

	@FindBy(xpath = "//input[@placeholder='Email *']")
	public WebElement EmailData;

	@FindBy(xpath = "//input[@placeholder='Phone *']")
	public WebElement PhoneData;

	@FindBy(xpath = "//textarea[@placeholder='Address Line 1 ']")
	public WebElement AddressLine1Data;

	@FindBy(xpath = "//textarea[@placeholder='Address Line 2']")
	public WebElement AddressLine2Data;

	@FindBy(xpath = "//mat-select[@aria-label='Status *']")
	public WebElement StatusDD;

	@FindBy(xpath = "//mat-select[@aria-label='Protocol *']")
	public WebElement ProtocolDD;

	@FindBy(xpath = "(//div[@class='pcm-content centralize partner']//h3)[1]")
	public WebElement CreatePartnertitle;

	@FindBy(xpath = "//mat-select[@aria-label='Polling Interval *']")
	public WebElement PollingIntervalDD;

	@FindBy(xpath = "//mat-option/span[contains(.,' 1 Minute ')]")
	public WebElement PollingIntervalValue;
	
	/// B2Bi FTP H2P ///

		@FindBy(xpath = "//div[contains(text(),' HubConnToPartner ')]")
		public WebElement FTPH2PClick;

		@FindBy(xpath = "//mat-select[@aria-label='Connection Type *']")
		public WebElement FTPConnectionTypeDD;

		@FindBy(xpath = "//input[@name='remoteHost']")
		public WebElement FTPHostNameData;

		@FindBy(xpath = "//input[@name='remotePort']")
		public WebElement FTPPortNoData;

		@FindBy(xpath = "//input[@name='userName']")
		public WebElement FTPUsernameData;

		@FindBy(xpath = "//input[@name='password']")
		public WebElement FTPPwdData;

		@FindBy(xpath = "//input[@name='inDirectory']")
		public WebElement FTPInDirectoryData;

		@FindBy(xpath = "//input[@name='outDirectory']")
		public WebElement FTPOutDirectoryData;

		@FindBy(xpath = "//input[@name='noOfRetries']")
		public WebElement FTPNoofretriesData;

		@FindBy(xpath = "//input[@name='retryInterval']")
		public WebElement FTPRetryIntervalData;

		@FindBy(xpath = "//div[@class='mat-checkbox-inner-container']")
		public WebElement FTPDelAfterCollClick;

		@FindBy(xpath = "//input[@name='fileType']")
		public WebElement FTPRemotefilepattern;

		@FindBy(xpath = "//input[@name='adapterName']")
		public WebElement FTPAdapNameData;

		/// B2Bi FTP P2H ///

		@FindBy(xpath = "//div[contains(text(),' PartnerConnToHub ')]")
		public WebElement FTPP2HClick;

		@FindBy(xpath = "//input[@name='userName']")
		public WebElement FTPUserIdData;

		@FindBy(xpath = "//input[@name='password']")
		public WebElement FTPPwd1Data;

		@FindBy(xpath = "(//div[@class='mat-checkbox-inner-container'])[1]")
		public WebElement FTPMergeuserClick;

		@FindBy(xpath = "(//div[@class='mat-checkbox-inner-container'])[2]")
		public WebElement FTPCreateMailboxinSIClick;

		@FindBy(xpath = "(//div[@class='mat-checkbox-inner-container'])[3]")
		public WebElement FTPDelAfterColl1Click;

		@FindBy(xpath = "//input[@name='inDirectory']")
		public WebElement FTPInDirData;

		@FindBy(xpath = "//input[@name='outDirectory']")
		public WebElement FTPOutDir;

		@FindBy(xpath = "//mat-select[@aria-label='Transfer Type *']")
		public WebElement FTPTransferTypeData;

		@FindBy(xpath = "//input[@name='fileType']")
		public WebElement FTPFileTypeData;
		
		@FindBy(xpath = "//button[@class='btn btn-primary']")
		public WebElement SubmitClick;
		
		@FindBy(xpath = "//div[@id='swal2-content']")
		public WebElement Actionmsg;
		
		@FindBy(xpath="//button[text()='Search Partner']")
		public WebElement SearchClick;
		
		/// B2Bi FTPS H2P///

		@FindBy(xpath = "//div[contains(text(),' HubConnToPartner ')]")
		public WebElement FTPSH2PClick;

		@FindBy(xpath = "//mat-select[@aria-label='Connection Type *']")
		public WebElement FTPSConnectionTypeDD;

		@FindBy(xpath = "//input[@name='remoteHost']")
		public WebElement FTPSHostNameData;

		@FindBy(xpath = "//input[@name='remotePort']")
		public WebElement FTPSPortNoData;

		@FindBy(xpath = "//mat-select[@aria-label='Encryption Strength *']")
		public WebElement FTPSEncryptionStrengthDD;

		@FindBy(xpath = "//input[@name='userName']")
		public WebElement FTPSUsernameData;

		@FindBy(xpath = "//input[@name='password']")
		public WebElement FTPSPwdData;

		@FindBy(xpath = "//input[@name='inDirectory']")
		public WebElement FTPSInDirectoryData;

		@FindBy(xpath = "//input[@name='outDirectory']")
		public WebElement FTPSOutDirectoryData;

		@FindBy(xpath = "//input[@name='noOfRetries']")
		public WebElement FTPSNoofretriesData;

		@FindBy(xpath = "//input[@name='retryInterval']")
		public WebElement FTPSRetryIntervalData;

		@FindBy(xpath = "(//div[@class='mat-checkbox-inner-container'])[1]")
		public WebElement FTPSUseCCC;

		@FindBy(xpath = "(//div[@class='mat-checkbox-inner-container'])[2]")
		public WebElement FTPSUseImplicitSSl;

		@FindBy(xpath = "(//div[@class='mat-checkbox-inner-container'])[3]")
		public WebElement FTPSDelAfterCollClick;

		@FindBy(xpath = "//input[@name='fileType']")
		public WebElement FTPSFileTypeData;

		@FindBy(xpath = "//mat-select[@aria-label='Certificate Id *']")
		public WebElement FTPSCertIdDD;

		/// B2Bi-FTPS P2H ///

		@FindBy(xpath = "//div[contains(text(),' PartnerConnToHub ')]")
		public WebElement FTPSP2HClick;

		@FindBy(xpath = "//input[@name='userName']")
		public WebElement FTPSUserIdData;

		@FindBy(xpath = "//input[@name='password']")
		public WebElement FTPSPwd1Data;

		@FindBy(xpath = "(//div[@class='mat-checkbox-inner-container'])[1]")
		public WebElement FTPSMergeuserClick;

		@FindBy(xpath = "(//div[@class='mat-checkbox-inner-container'])[2]")
		public WebElement FTPSCreateMailboxinSIClick;

		@FindBy(xpath = "(//div[@class='mat-checkbox-inner-container'])[3]")
		public WebElement FTPSDelAfterColl1Click;

		@FindBy(xpath = "//input[@name='inDirectory']")
		public WebElement FTPSInDirData;

		@FindBy(xpath = "//input[@name='outDirectory']")
		public WebElement FTPSOutDir;

		@FindBy(xpath = "//mat-select[@aria-label='Transfer Type *']")
		public WebElement FTPSTransferTypeData;

		@FindBy(xpath = "//input[@name='fileType']")
		public WebElement FTPSFileType1Data;

		@FindBy(xpath = "//input[@name='adapterName']")
		public WebElement FTPSAdapNameData;
		
		/// B2Bi-SFTP H2P ///

		@FindBy(xpath = "//div[contains(text(),' HubConnToPartner ')]")
		public WebElement SFTPH2PClick;

		@FindBy(xpath = "//input[@name='remoteHost']")
		public WebElement SFTPHostNameData;

		@FindBy(xpath = "//input[@name='remotePort']")
		public WebElement SFTPPortNoData;

		@FindBy(xpath = "//mat-select[@aria-label='Preferred Mac Algorithm']")
		public WebElement SFTPMacAlgoDD;

		@FindBy(xpath = "//input[@name='userName']")
		public WebElement SFTPRemoteUserData;

		@FindBy(xpath = "//input[@name='password']")
		public WebElement SFTPSSHPwdData;

		@FindBy(xpath = "//input[@name='characterEncoding']")
		public WebElement SFTPCharEncData;

		@FindBy(xpath = "//input[@name='inDirectory']")
		public WebElement SFTPInDirectoryData;

		@FindBy(xpath = "//input[@name='outDirectory']")
		public WebElement SFTPOutDirectoryData;

		@FindBy(xpath = "//input[@name='localPortRange']")
		public WebElement SFTPLocalPortRangeData;

		@FindBy(xpath = "//mat-select[@aria-label='Compression']")
		public WebElement SFTPCompressionDD;

		@FindBy(xpath = "//input[@name='retryDelay']")
		public WebElement SFTPRetryDelayData;

		@FindBy(xpath = "//input[@name='retryDelay']")
		public WebElement SFTPConnRetryCountData;

		@FindBy(xpath = "//mat-select[@aria-label='Preferred Cipher']")
		public WebElement SFTPPrefCipherDD;

		@FindBy(xpath = "//mat-select[@aria-label='Authentication Type *']")
		public WebElement SFTPAuthTypeDD;

		@FindBy(xpath = "//input[@name='responseTimeOut']")
		public WebElement SFTPResponseTimeoutData;

		@FindBy(xpath = "//div[@class='mat-checkbox-inner-container']")
		public WebElement SFTPDelAfterCollClick;

		@FindBy(xpath = "//input[@name='fileType']")
		public WebElement SFTPRemotefilepattern;

		@FindBy(xpath = "//mat-select[@aria-label='User Identity Key']")
		public WebElement SFTPUserIdentityKeyDD;

		@FindBy(xpath = "//mat-select[@aria-label='Known Host Key']")
		public WebElement SFTPKnownHostKeyDD;

		/// B2Bi-SFTP P2H ///

		@FindBy(xpath = "//div[contains(text(),' PartnerConnToHub ')]")
		public WebElement SFTPP2HClick;

		@FindBy(xpath = "//input[@name='userName']")
		public WebElement SFTPUserNameData;

		@FindBy(xpath = "//input[@name='password']")
		public WebElement SFTPPasswordData;

		@FindBy(xpath = "(//div[@class='mat-checkbox-inner-container'])[1]")
		public WebElement SFTPMergeuserClick;

		@FindBy(xpath = "(//div[@class='mat-checkbox-inner-container'])[2]")
		public WebElement SFTPCreateMailboxinSIClick;

		@FindBy(xpath = "(//div[@class='mat-checkbox-inner-container'])[3]")
		public WebElement SFTPDelAfterColl1Click;

		@FindBy(xpath = "//input[@name='inDirectory']")
		public WebElement SFTPIndirData;

		@FindBy(xpath = "//input[@name='outDirectory']")
		public WebElement SFTPOutDirData;

		@FindBy(xpath = "//mat-select[@aria-label='Transfer Type *']")
		public WebElement SFTPTransferTypeData;

		@FindBy(xpath = "//input[@name='fileType']")
		public WebElement SFTPFileType1Data;

		@FindBy(xpath = "//mat-select[@aria-label='SSH Authorized User Keys']")
		public WebElement SFTPSSHAuthKeyDD;

		@FindBy(xpath = "//input[@name='adapterName']")
		public WebElement SFTPAdapNameData;
		
		@FindBy(xpath = "//button[contains(text(),'OK')]")
		public WebElement Error1MessageOkclick;

		@FindBy(xpath = "(//ul[@class='errorMessage']/li)[2]")
		public WebElement Error2;

		@FindBy(xpath = "(//ul[@class='errorMessage']/li)[3]")
		public WebElement Error3;
		
		@FindBy(xpath = "//button[text()='Cancel']")
		public WebElement Cancelbtn;
		
		@FindBy(xpath = "//button[text()='Yes, cancel it!']")
		public WebElement YesCancelitbtn;
		
		
	//	---------------------------------------------------
		
		@FindBy(xpath = "(//*[@svgicon='menu-bar'])[1]")
		public WebElement Actionsicon;
		
		 @FindBy(xpath="//button[contains(text(),'Edit')]")
		 public WebElement Editbtn;
		 
		 @FindBy(xpath="//button[contains(text(),' Submit ')]")
		 public WebElement EditSubmitClick;
		 
		 
		 
		 
		 
		 
		
		public PartnerExchangeProtocol() {
			PageFactory.initElements(driver, this);
		}
		
		public void Commondata() throws InterruptedException {

			Thread.sleep(1000);
			PartnerNameData.sendKeys(Keys.chord(Keys.CONTROL, "a"), "PartnerAutomation" + pn++);
			Thread.sleep(1000);
			PartnerIdData.sendKeys(Keys.chord(Keys.CONTROL, "a"), "PartnerAutomationid" + pid++);
			Thread.sleep(1000);
			EmailData.sendKeys(Keys.chord(Keys.CONTROL, "a"), "Partner" + e++ + "@gmail.com");
			Thread.sleep(1000);
			PhoneData.sendKeys(Keys.chord(Keys.CONTROL, "a"), "123123123" + p++);
			Thread.sleep(1000);
			AddressLine1Data.sendKeys(Keys.chord(Keys.CONTROL, "a"), "ADDr1" + A1++);
			Thread.sleep(1000);
			AddressLine2Data.sendKeys(Keys.chord(Keys.CONTROL, "a"), "ADDR2" + A2++);
			Thread.sleep(1000);

		}
		
		public void ValidateFTPH2PWithValidData() throws Throwable {

			FTPH2PClick.click();
			Thread.sleep(1000);

			DropDownSelection(FTPConnectionTypeDD, "Active");
			Thread.sleep(2000);
			FTPHostNameData.sendKeys(Keys.chord(Keys.CONTROL, "a"), "20.55.8.34");
			FTPPortNoData.sendKeys(Keys.chord(Keys.CONTROL, "a"), "10021");
			Thread.sleep(1000);
			FTPUsernameData.sendKeys(Keys.chord(Keys.CONTROL, "a"), "FTPUse" + pn++);
			FTPPwdData.sendKeys(Keys.chord(Keys.CONTROL, "a"), "FTP"+ pn++);
			Thread.sleep(1000);
			FTPInDirectoryData.sendKeys(Keys.chord(Keys.CONTROL, "a"), "/ftp/in");
			FTPOutDirectoryData.sendKeys(Keys.chord(Keys.CONTROL, "a"), "/ftp/out");
			Thread.sleep(1000);
			FTPNoofretriesData.sendKeys(Keys.chord(Keys.CONTROL, "a"), "10");
			FTPRetryIntervalData.sendKeys(Keys.chord(Keys.CONTROL, "a"), "10");
			Thread.sleep(1000);
			FTPDelAfterCollClick.click();
			Thread.sleep(1000);
			FTPRemotefilepattern.sendKeys(Keys.chord(Keys.CONTROL, "a"), "Test"+ pn++);
			Thread.sleep(2000);
			DropDownSelection(PollingIntervalDD, "1 Minute");
			Thread.sleep(2000);
			// FTPAdapNameData.sendKeys(Keys.chord(Keys.CONTROL, "a"),
			// "CM_FTPClientAdapter");
			SubmitClick.click();
		}
		

		public void ValidateFTPP2HWithValidData()
				throws Throwable {

			FTPP2HClick.click();
			Thread.sleep(1000);

			Thread.sleep(1000);
			FTPUserIdData.sendKeys(Keys.chord(Keys.CONTROL, "a"), "FTPame"+ pn++);
			FTPPwd1Data.sendKeys(Keys.chord(Keys.CONTROL, "a"), "FTP156"+ pn++);
			Thread.sleep(1000);
			FTPInDirData.sendKeys(Keys.chord(Keys.CONTROL, "a"), "/ftp/in");
			FTPOutDir.sendKeys(Keys.chord(Keys.CONTROL, "a"), "/ftp/out");
			Thread.sleep(1000);
			DropDownSelection(FTPTransferTypeData, "Binary");
			Thread.sleep(2000);
			FTPFileTypeData.sendKeys(Keys.chord(Keys.CONTROL, "a"), "filetypebanh"+ pn++);
			Thread.sleep(1000);
			FTPMergeuserClick.click();
			Thread.sleep(1000);
			FTPCreateMailboxinSIClick.click();
			Thread.sleep(1000);
			FTPDelAfterColl1Click.click();
			Thread.sleep(2000);
			DropDownSelection(PollingIntervalDD, "1 Minute");
			Thread.sleep(2000);
			// FTPAdapNameData.sendKeys(Keys.chord(Keys.CONTROL, "a"),
			// "CM_FTPServerAdapter");
			
			SubmitClick.click();
		}
		
		public void ValidateFTPSH2PWithValidData()
				throws Throwable {

			FTPSH2PClick.click();
			Thread.sleep(2000);

			DropDownSelection(FTPConnectionTypeDD, "Active");
			Thread.sleep(2000);

			FTPSHostNameData.sendKeys(Keys.chord(Keys.CONTROL, "a"), "20.55.8.64");
			FTPSPortNoData.sendKeys(Keys.chord(Keys.CONTROL, "a"), "10022");
			Thread.sleep(2000);
			DropDownSelection(FTPSEncryptionStrengthDD, "All");
			Thread.sleep(2000);
			FTPSUsernameData.sendKeys(Keys.chord(Keys.CONTROL, "a"), "FTPSUs2"+ pn++);
			FTPSPwdData.sendKeys(Keys.chord(Keys.CONTROL, "a"), "FTPSP3"+ pn++);
			Thread.sleep(1000);
			FTPSInDirectoryData.sendKeys(Keys.chord(Keys.CONTROL, "a"), "/ftp/in");
			FTPSOutDirectoryData.sendKeys(Keys.chord(Keys.CONTROL, "a"), "/ftp/out");
			Thread.sleep(1000);
			FTPSNoofretriesData.sendKeys(Keys.chord(Keys.CONTROL, "a"), "10");
			FTPSRetryIntervalData.sendKeys(Keys.chord(Keys.CONTROL, "a"), "10");
			Thread.sleep(1000);
			FTPSUseCCC.click();
			Thread.sleep(1000);
			FTPSUseImplicitSSl.click();
			Thread.sleep(1000);
			FTPSDelAfterCollClick.click();
			Thread.sleep(1000);
			FTPSFileTypeData.sendKeys(Keys.chord(Keys.CONTROL, "a"), "FTPSFileType"+ pn++);
			Thread.sleep(2000);
			DropDownSelection(FTPSCertIdDD, "qwerty3");
			Thread.sleep(2000);
			DropDownSelection(PollingIntervalDD, "1 Minute");
			Thread.sleep(2000);
			// FTPSAdapNameData.sendKeys(Keys.chord(Keys.CONTROL, "a"),
			// "CM_FTPSClientAdapter");
			SubmitClick.click();
		}

		public void ValidateFTPSP2HWithValidData()
				throws Throwable {

			FTPSP2HClick.click();
			Thread.sleep(2000);

			Thread.sleep(1000);
			FTPSUserIdData.sendKeys(Keys.chord(Keys.CONTROL, "a"), "FTPSUsa"+ pn++);
			FTPSPwd1Data.sendKeys(Keys.chord(Keys.CONTROL, "a"), "FTPSPsaa"+ pn++);
			Thread.sleep(1000);
			FTPSInDirData.sendKeys(Keys.chord(Keys.CONTROL, "a"), "/ftps/in");
			FTPSOutDir.sendKeys(Keys.chord(Keys.CONTROL, "a"), "/ftps/out");
			Thread.sleep(1000);
			DropDownSelection(FTPTransferTypeData, "Binary");
			Thread.sleep(2000);
			FTPSFileTypeData.sendKeys(Keys.chord(Keys.CONTROL, "a"), "filetypebanh"+ pn++);
			Thread.sleep(1000);
			FTPSMergeuserClick.click();
			Thread.sleep(1000);
			FTPSCreateMailboxinSIClick.click();
			Thread.sleep(1000);
			FTPSDelAfterColl1Click.click();
			Thread.sleep(2000);
			DropDownSelection(PollingIntervalDD, "1 Minute");
			Thread.sleep(2000);
			// FTPSAdapNameData.sendKeys(Keys.chord(Keys.CONTROL, "a"),
			// "CM_FTPS_ServerAdapter");
			Thread.sleep(1000);
			SubmitClick.click();
		}
		
		
		public void ValidateSFTP_H2P() throws Throwable {

			SFTPH2PClick.click();
			Thread.sleep(1000);

			SFTPHostNameData.sendKeys(Keys.chord(Keys.CONTROL, "a"), "20.55.8.64");
			SFTPPortNoData.sendKeys(Keys.chord(Keys.CONTROL, "a"), "13939");
			// DropDownSelection(SFTPMacAlgoDD, "Select");

			Thread.sleep(1000);

			SFTPUserNameData.sendKeys(Keys.chord(Keys.CONTROL, "a"), "SFTPUs"+ pn++);
			SFTPPasswordData.sendKeys(Keys.chord(Keys.CONTROL, "a"), "SFTP"+ pn++);
			//SFTPCharEncData.sendKeys(Keys.chord(Keys.CONTROL, "a"), "SFTPCharencc");

			Thread.sleep(1000);

			SFTPIndirData.sendKeys(Keys.chord(Keys.CONTROL, "a"), "/sftp/in");
			SFTPOutDirData.sendKeys(Keys.chord(Keys.CONTROL, "a"), "/sftp/out");
			SFTPCharEncData.sendKeys(Keys.chord(Keys.CONTROL, "a"), "100");

			Thread.sleep(1000);

			// DropDownSelection(SFTPCompressionDD, "Select");
			SFTPRetryDelayData.sendKeys(Keys.chord(Keys.CONTROL, "a"), "10");
			SFTPConnRetryCountData.sendKeys(Keys.chord(Keys.CONTROL, "a"), "10");

			Thread.sleep(1000);

			// DropDownSelection(SFTPPrefCipherDD, "Select");
			DropDownSelection(SFTPAuthTypeDD, "Password");

			Thread.sleep(2000);

			SFTPResponseTimeoutData.sendKeys(Keys.chord(Keys.CONTROL, "a"), "10");
			SFTPRemotefilepattern.sendKeys(Keys.chord(Keys.CONTROL, "a"), "testtest"+ pn++);
			Thread.sleep(1000);
			SFTPDelAfterCollClick.click();
			Thread.sleep(1000);

			DropDownSelection(PollingIntervalDD, "1 Minute");
			Thread.sleep(2000);
			// SFTPAdapNameData.sendKeys(Keys.chord(Keys.CONTROL, "a"),
			// "CM_SFTPClientAdapter");
			SubmitClick.click();

		}
		
		
		public void ValidateSFTP_P2H() throws Throwable {

			SFTPP2HClick.click();

			Thread.sleep(1000);
			FTPSUserIdData.sendKeys(Keys.chord(Keys.CONTROL, "a"), "SFTPUserid12"+ pn++);
			FTPSPwd1Data.sendKeys(Keys.chord(Keys.CONTROL, "a"), "SFTPPassword123"+ pn++);
			Thread.sleep(1000);
			FTPSInDirData.sendKeys(Keys.chord(Keys.CONTROL, "a"), "/sftp/in");
			FTPSOutDir.sendKeys(Keys.chord(Keys.CONTROL, "a"), "/sftp/in");
			Thread.sleep(1000);
			DropDownSelection(FTPTransferTypeData, "Binary");
			Thread.sleep(2000);
			FTPSFileTypeData.sendKeys(Keys.chord(Keys.CONTROL, "a"), "filetypebanh"+ pn++);
			Thread.sleep(1000);
			FTPSMergeuserClick.click();
			Thread.sleep(1000);
			FTPSCreateMailboxinSIClick.click();
			Thread.sleep(1000);
			FTPSDelAfterColl1Click.click();
			Thread.sleep(1000);

			DropDownSelection(SFTPAuthTypeDD, "Password");
			Thread.sleep(2000);
			DropDownSelection(PollingIntervalDD, "1 Minute");
			Thread.sleep(2000);
			//FTPSAdapNameData.sendKeys(Keys.chord(Keys.CONTROL, "a"), "CM_SFTPServerAdapter");
			Thread.sleep(1000);
			SubmitClick.click();
		}
		
		

}
