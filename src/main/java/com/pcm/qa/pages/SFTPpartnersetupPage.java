package com.pcm.qa.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.pcm.qa.base.TestBase;

public class SFTPpartnersetupPage extends TestBase {

	public String filename = "FILEPROCESS9090.txt";
	public String partnername = "SFTPpartner9090";
	public String applicationname = "STPapplication9090";

	public String connectiontype = "P2H"; // H2P or P2H
	public String directiontype = "INBOUND"; // INBOUND or OUTBOUND
	public String transfertype = "MFT"; // MFT or DOCHANDLING
	
	public String partnerindir = "/sftptest2021";
	public String partneroutdir = "/sftptest2021";
	
	public String p2husername = "testingsftp";
	public String p2hpassword = "password";
	
	WebDriverWait wait = new WebDriverWait(driver, 10);
	
	// --------------------------------------------------------------

	@FindBy(xpath = "//span//mat-icon[contains(text(),'menu')]")
	public WebElement ControlMenuClick;

	@FindBy(xpath = "//mat-drawer//mat-nav-list[3]//span[contains(text(),'Partner')]")
	public WebElement PartnerClick;

	@FindBy(xpath = "//div//mat-nav-list//span[contains(text(),'Create Partner')]")
	public WebElement CreatePartnerClick;

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

	// --------------------------------------------------------------------------------

	/// B2Bi FTPS H2P///

	@FindBy(xpath = "(//div[@class='mat-radio-inner-circle'])[1]")
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

	// -------------------------------------------------------------------

	/// MAILBOX ///

	@FindBy(xpath = "//input[@name='inMailBox']")
	public WebElement MBInMailboxData;

	@FindBy(xpath = "//input[@name='outMailBox']")
	public WebElement MBOutMailBoxData;

	@FindBy(xpath = "//input[@name='filter']")
	public WebElement MBFileTypeData;

	@FindBy(xpath = "//div[@class='mat-checkbox-inner-container']")
	public WebElement MBCreateMailboxInSIClick;

	@FindBy(xpath = "//mat-select[@aria-label='Pooling Interval']")
	public WebElement MBPIDD;

	// -----------------------------------------------------------------

	@FindBy(xpath = "//span[contains(text(),'Application')]")
	public WebElement ApplicationClick;

	@FindBy(xpath = "//span[contains(text(),'Create Application')]")
	public WebElement CreateApplicationClick;

	@FindBy(xpath = "//input[@placeholder='Application Name *']")
	public WebElement ApplicationNameData;

	@FindBy(xpath = "//input[@placeholder='Application Id *']")
	public WebElement ApplicationIdData;

	@FindBy(xpath = "//input[@placeholder='Email *']")
	public WebElement EmailAppData;

	@FindBy(xpath = "//input[@placeholder='Phone *']")
	public WebElement PhoneAppData;

	@FindBy(xpath = "//mat-select[@aria-label='Status']")
	public WebElement StatusAppDD;

	@FindBy(xpath = "//mat-select[@aria-label='Protocol *']")
	public WebElement ProtocolAppDD;

	/// B2Bi-SFTP H2P ///

	@FindBy(xpath = "(//div[@class='mat-radio-inner-circle'])[1]")
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



	// -----------------------------------------------------------------------------------------

	@FindBy(xpath = "//span[contains(text(),'Data Flows')]")
	public WebElement DataFlowsModuleClick;

	@FindBy(xpath = "//span[text()[contains(.,'Build Data Flow')]]")
	public WebElement BuildDataFlowModuleClick;

	@FindBy(xpath = "//mat-select[@aria-label='Partner/Producer']")
	public WebElement PartnerProfileDD;

	@FindBy(xpath = "(//mat-select[@aria-label='Partner/Producer'])[2]")
	public WebElement PartnerProfileDD1;

	@FindBy(xpath = "//mat-select[@aria-label='Application/Consumer']")
	public WebElement ApplicationProfileDD;

	@FindBy(xpath = "//mat-select[@aria-label='Application/Consumer'])[2]")
	public WebElement ApplicationProfileDD1;

	@FindBy(xpath = "//button[@class='btn btn-primary ng-star-inserted']")
	public WebElement SearchWorkFlowClick;

	@FindBy(xpath = "//button[@class='btn btn-pcm-3']")
	public WebElement ImportWorkFlowClick;

	@FindBy(xpath = "//button[@class='btn btn-pcm-1']")
	public WebElement SetUPWorkFlowClick;

	@FindBy(xpath = "(//button[@class='btn btn-info'])[1]")
	public WebElement ResetSearchClick;

	@FindBy(xpath = "(//div[@class='mat-form-field-infix'])[3]")
	public WebElement ImportWorkFlowChooseFileClick;

	@FindBy(xpath = "//button[@class='btn btn-primary mat-raised-button mat-primary']")
	public WebElement ImportWorkFlowSubmitClick;

	@FindBy(xpath = "//div[@class='mat-tab-label-content' and contains(text(),'INBOUND File Handling')]")
	public WebElement InboundClick;

	@FindBy(xpath = "//div[@class='mat-tab-label-content' and contains(text(),'OUTBOUND File Handling')]")
	public WebElement OutboundClick;

	@FindBy(xpath = "//div[@class='mat-tab-label-content' and contains(text(),'ACTIVITY')]")
	public WebElement ActivityClick;

	@FindBy(xpath = "//table[@id='pcmFaxActivityHistoryTbl']/tbody/tr")
	public WebElement ActivityLogTable;

	@FindBy(xpath = "//a[contains(text(),'Add Flow')]")
	public WebElement AddFlowbtn;

	@FindBy(xpath = "(//div[@class='mat-radio-inner-circle'])[1]")
	public WebElement IMFTRadiobuttonClick;

	@FindBy(xpath = " //div[contains(text(),' DocHandling ')] ")
	public WebElement IDocHandlingRadiobuttonClick;

	@FindBy(xpath = "(//input[@placeholder='File Name *'])[1]")
	public WebElement IMFTFilenameData;

	@FindBy(xpath = "(//input[@placeholder='Filter'])[1]")
	public WebElement IMFTFilterData;

	@FindBy(xpath = "//input[@id='inMftVersion']")
	public WebElement IMFTVersionData;

	@FindBy(xpath = "//input[@id='inMftTransaction']")
	public WebElement IMFTTransactionData;

	@FindBy(xpath = "//input[@id='inMftPartnerId']")
	public WebElement IMFTSenderIdData;

	@FindBy(xpath = "//input[@id='inMftReceiverId']")
	public WebElement IMFTReceiverIdData;

	@FindBy(xpath = "(//input[@placeholder='File Name'])[1]")
	public WebElement IDocFilenameData;

	@FindBy(xpath = "(//input[@placeholder='Doc Type *'])[1]")
	public WebElement IDocDocumentTypeData;

	@FindBy(xpath = "(//input[@placeholder='Version'])[1]")
	public WebElement IDocVersionData;

	@FindBy(xpath = "(//input[@placeholder='Transaction *'])[1]")
	public WebElement IDocTransactionData;

	@FindBy(xpath = "(//input[@placeholder='Sender Id *'])[1]")
	public WebElement IdocSenderIdData;

	@FindBy(xpath = "(//input[@placeholder='Receiver Id *'])[1]")
	public WebElement IDocReceiverIdData;

	@FindBy(xpath = "//a[contains(text(),'Add Flow')]")
	public WebElement InboundAddClick;

	@FindBy(xpath = "//a[contains(text(),'Create')]")
	public WebElement Createclick;

	@FindBy(xpath = "//a[contains(text(),'Rules')]")
	public WebElement Rulesclick;

	@FindBy(xpath = "//a[contains(.,'Update')]")
	public WebElement InboundUpdateClick;

	@FindBy(xpath = "//a[contains(text(),'Add Flow')]")
	public WebElement OutboundAddClick;

	@FindBy(xpath = "//a[contains(.,'Update')]")
	public WebElement OutboundUpdateClick;

	@FindBy(xpath = "(//div[@class='mat-radio-inner-circle'])[1]")
	public WebElement OutMFTClick;

	@FindBy(xpath = " //div[contains(text(),' DocHandling ')] ")
	public WebElement OutDocHandlingClick;

	@FindBy(xpath = "(//input[@placeholder='File Name *'])[1]")
	public WebElement OMftFileNameData;

	@FindBy(xpath = "(//input[@placeholder='Filter'])[1]")
	public WebElement OMftFilterData;

	@FindBy(xpath = "//input[@id='outMftVersion']")
	public WebElement OMftVersionData;

	@FindBy(xpath = "//input[@id='outMftTransaction']")
	public WebElement OMftTransactionData;

	@FindBy(xpath = "//input[@id='outMftPartnerId']")
	public WebElement OMftSenderIdData;

	@FindBy(xpath = "//input[@id='outMftReceiverId']")
	public WebElement OMftReceiverIdData;

	@FindBy(xpath = "(//input[@placeholder='File Name'])[1]")
	public WebElement ODocFileNameData;

	@FindBy(xpath = "(//input[@placeholder='Doc Type *'])[1]")
	public WebElement ODocDocTypeData;

	@FindBy(xpath = "//input[@placeholder='Version']")
	public WebElement ODocVersionData;

	@FindBy(xpath = "//input[@placeholder='Transaction *']")
	public WebElement ODocTransactionData;

	@FindBy(xpath = "//input[@placeholder='Sender Id *']")
	public WebElement ODocSenderIdData;

	@FindBy(xpath = "//input[@placeholder='Receiver Id *']")
	public WebElement ODocReceiverIdData;

	@FindBy(xpath = "//ul//li[contains(text(),'SourceFileArchive')]")
	public WebElement OutboundRulesList1Click;

	@FindBy(xpath = "//ul//li[contains(text(),'DestFileArchive')]")
	public WebElement OutboundRulesList2Click;

	@FindBy(xpath = "//ul//li[text()='SourceFileArchive']")
	public WebElement InboundRulesList1Click;

	@FindBy(xpath = "//ul//li[text()='DestFileArchive']")
	public WebElement InboundRulesList2Click;

	@FindBy(xpath = "//ul//li[text()='DropProcess']")
	public WebElement InboundRulesList3Click;

	@FindBy(xpath = "(//button[@class='btn btn-info'])[2]")
	public WebElement CancelClick;

	@FindBy(xpath = "//button[@class='btn btn-primary']")
	public WebElement SaveWorkFlowClick;

	@FindBy(xpath = "(//input[@placeholder='Search'])[1]")
	public WebElement SearchRulesclick;

	@FindBy(xpath = "//button[contains(text(),' ADD ')]")
	public WebElement IAddRulesClick;

	@FindBy(xpath = "//button[contains(text(),' ADD ')]")
	public WebElement OAddRulesClick;

	@FindBy(xpath = "//button[contains(text(),' REMOVE ')]")
	public WebElement IRemoveRulesClick;

	@FindBy(xpath = "//button[contains(text(),' REMOVE ')]")
	public WebElement ORemoveRulesClick;

	@FindBy(xpath = "//button[@mattooltip='Move up']")
	public WebElement IMoveUpClick;

	@FindBy(xpath = "//button[@mattooltip='Move down']")
	public WebElement IMoveDownClick;

	@FindBy(xpath = "//button[@mattooltip='Move up']")
	public WebElement OMoveUpClick;

	@FindBy(xpath = "//button[@mattooltip='Move down']")
	public WebElement OMoveDownClick;

	@FindBy(xpath = "//button[@mattooltip='Edit Rule']")
	public WebElement Editrulebtn;

	@FindBy(xpath = "//button[@id='move-props-in']")
	public WebElement IPropertiesClick;

	@FindBy(xpath = "//button[@id='move-props-out']")
	public WebElement OPropertiesClick;

	@FindBy(xpath = "//input[@id='manageRulePropForm_ruleBean_propertyName1']")
	public WebElement IBuildTestProperty1Data;

	@FindBy(xpath = "//input[@id='manageRulePropForm_ruleBean_propertyName2']")
	public WebElement IBuildTestProperty2Data;

	@FindBy(xpath = "//div[@class='selected-list']//li[contains(.,' SourceFileArchive ')]")
	public WebElement IAppliedRulesListClick;

	@FindBy(xpath = "//input[@id='manageRulePropForm_submitBtn']")
	public WebElement ISavePropertiesClick;

	@FindBy(xpath = "//div[@id='swal2-content']")
	public WebElement ActionMessage;

	@FindBy(xpath = "//div[@id='swal2-content']")
	public WebElement MFTErrorMsg;

	@FindBy(xpath = "//input[@placeholder='FilePreFix']")
	public WebElement BuildTestProperty1Data;

	@FindBy(xpath = "//input[@placeholder='DateTimeFormate']")
	public WebElement BuildTestProperty2Data;

	@FindBy(xpath = "//input[@placeholder='Extension']")
	public WebElement BuildTestProperty3Data;

	@FindBy(xpath = "//input[@placeholder='LocationofArchive']")
	public WebElement BuildTestProperty4Data;

	@FindBy(xpath = "//mat-select[@aria-label='Protocol']")
	public WebElement dropProperty1Data;

	@FindBy(xpath = "//mat-select[@aria-label='ProtocolReference']")
	public WebElement dropProperty2Data;

	@FindBy(xpath = "(//button[text()=' SAVE '])[1]")
	public WebElement SavePropertiesClick;

	@FindBy(xpath = "//mat-panel-title[contains(text(),' RULES ')]")
	public WebElement minimizerules;

	@FindBy(xpath = "(//button[text()=' SAVE '])[2]")
	public WebElement SaveRulesClick;

	@FindBy(xpath = "//div[@class='selected-list']//li[contains(.,' SourceFileArchive ')]")
	public WebElement OAppliedRulesListClick;

	@FindBy(xpath = "//div[@id='swal2-content']")
	public WebElement ErrorMessage;

	@FindBy(xpath = "//div[@id='swal2-content']")
	public WebElement ErrorMessageImport;

	@FindBy(xpath = "//button[contains(text(),'OK')]")
	public WebElement ErrorMessageOKbtn;

	@FindBy(xpath = "//button[@id='exportRulesButton']")
	public WebElement ExportClick;

	@FindBy(xpath = "//button[contains(text(),' COPY DATAFLOW ')]")
	public WebElement CopyWorkflowClick;

	@FindBy(xpath = "(//input[@placeholder='Sender Id'])[1]")
	public WebElement CopyInSenderID;

	@FindBy(xpath = "(//input[@placeholder='Receiver Id'])[1]")
	public WebElement CopyInReceiverID;

	@FindBy(xpath = "(//input[@placeholder='Sender Id'])[2]")
	public WebElement CopyOutSenderID;

	@FindBy(xpath = "(//input[@placeholder='Receiver Id'])[2]")
	public WebElement CopyOutReceiverID;

	@FindBy(xpath = "//button[contains(.,' UPDATE ')]")
	public WebElement CopyUpdateClick;

	@FindBy(xpath = "//button[contains(.,' DELETE DATAFLOW ')]")
	public WebElement DeleteWorkflowClick;

	@FindBy(xpath = "//button[contains(.,'Delete')]")
	public WebElement yesDelete;

	@FindBy(xpath = "//button[@class='btn btn-primary']")
	public WebElement SubmitClick;

	@FindBy(xpath = "//button[@class='btn btn-primary']")
	public WebElement AppSubmitClick;

	@FindBy(xpath = "//mat-select[@aria-label='Polling Interval *']")
	public WebElement PollingIntervalDD;

	@FindBy(xpath = "//span[contains(text(),'File Transfer')]")
	public static WebElement FileTransfersClick;

	@FindBy(xpath = "//span[contains(text(),'Search')]")
	public static WebElement Searchclick;

	@FindBy(xpath = "//input[@placeholder='File Arrived from']")
	public WebElement StartDateAndTime;

	@FindBy(xpath = "//input[@placeholder='File Arrived to']")
	public WebElement EndDateAndTime;

	@FindBy(xpath = "//mat-select[@id='status']")
	public WebElement StatusDropDown;

	@FindBy(xpath = "//input[@name='srcFileName']")
	public WebElement SrcFileNameData;

	@FindBy(xpath = "//button[@class='btn btn-primary']")
	public WebElement SearchButtonClick;
	
	@FindBy(xpath = "//input[@id='filterInput']")
	public WebElement filtername;
	
	@FindBy(xpath = "//a[contains(text(),'Log Out')]")
	public WebElement mailboxlogout;
	

	public SFTPpartnersetupPage() {
		PageFactory.initElements(driver, this);
	}

	public void SFTP_Protocoltype(String ConnectionType) throws Exception {

		Thread.sleep(3000);
		PartnerClick.click();

		Thread.sleep(1000);
		CreatePartnerClick.click();

		Thread.sleep(2000);
		PartnerNameData.sendKeys(Keys.chord(Keys.CONTROL, "a"), partnername);
		PartnerIdData.sendKeys(Keys.chord(Keys.CONTROL, "a"), partnername);
		EmailData.sendKeys(Keys.chord(Keys.CONTROL, "a"), "pavankalayan.kondapur@pragmaedge.com");
		PhoneData.sendKeys(Keys.chord(Keys.CONTROL, "a"), "1234567890");
		AddressLine1Data.sendKeys(Keys.chord(Keys.CONTROL, "a"), "ADDr1");
		AddressLine2Data.sendKeys(Keys.chord(Keys.CONTROL, "a"), "ADDR2");

		Thread.sleep(1000);
		DropDownSelection(ProtocolDD, "B2Bi-SFTP");
		Thread.sleep(2000);
		DropDownSelection(StatusDD, "Active");
		Thread.sleep(1000);

		if (ConnectionType.equalsIgnoreCase("H2P")) {

			SFTPH2PClick.click();
			Thread.sleep(1000);

			SFTPHostNameData.sendKeys(Keys.chord(Keys.CONTROL, "a"), "20.55.8.64");
			SFTPPortNoData.sendKeys(Keys.chord(Keys.CONTROL, "a"), "13939");
			// DropDownSelection(SFTPMacAlgoDD, "Select");

			Thread.sleep(1000);

			SFTPUserNameData.sendKeys(Keys.chord(Keys.CONTROL, "a"), "admin");
			SFTPPasswordData.sendKeys(Keys.chord(Keys.CONTROL, "a"), "password");

			Thread.sleep(1000);

			SFTPIndirData.sendKeys(Keys.chord(Keys.CONTROL, "a"), partnerindir + "/in");
			SFTPOutDirData.sendKeys(Keys.chord(Keys.CONTROL, "a"), partneroutdir + "/out");
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
			SFTPRemotefilepattern.sendKeys(Keys.chord(Keys.CONTROL, "a"), "teest");
			Thread.sleep(1000);
			SFTPDelAfterCollClick.click();
			Thread.sleep(1000);

			DropDownSelection(PollingIntervalDD, "1 Minute");
			Thread.sleep(2000);
			// SFTPAdapNameData.sendKeys(Keys.chord(Keys.CONTROL, "a"),
			// "CM_SFTPClientAdapter");
			SubmitClick.click();


		}

		else if (ConnectionType.equalsIgnoreCase("P2H")) {

			SFTPP2HClick.click();
			SFTPP2HClick.click();
			Thread.sleep(1000);
			
			FTPSUserIdData.sendKeys(Keys.chord(Keys.CONTROL, "a"), p2husername);
			FTPSPwd1Data.sendKeys(Keys.chord(Keys.CONTROL, "a"), p2hpassword);
			Thread.sleep(1000);
			FTPSInDirData.sendKeys(Keys.chord(Keys.CONTROL, "a"), partnerindir + "/in");
			FTPSOutDir.sendKeys(Keys.chord(Keys.CONTROL, "a"), partnerindir + "/out");
			Thread.sleep(1000);
			DropDownSelection(SFTPTransferTypeData, "Binary");
			Thread.sleep(2000);
			FTPSFileTypeData.sendKeys(Keys.chord(Keys.CONTROL, "a"), "filetanh");
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

	public void ValidateAppMailbox() throws Throwable {

		ApplicationClick.click();
		Thread.sleep(1000);
		CreateApplicationClick.click();
		Thread.sleep(2000);

		ApplicationNameData.sendKeys(Keys.chord(Keys.CONTROL, "a"), applicationname);
		Thread.sleep(1000);
		ApplicationIdData.sendKeys(Keys.chord(Keys.CONTROL, "a"), applicationname);
		EmailData.sendKeys(Keys.chord(Keys.CONTROL, "a"), "pavankalayan.kondapur@pragmaedge.com");
		PhoneData.sendKeys(Keys.chord(Keys.CONTROL, "a"), "1234567890");

		Thread.sleep(1000);

		DropDownSelection(ProtocolDD, "MAILBOX");
		Thread.sleep(1000);

		DropDownSelection(StatusAppDD, "Active");
		Thread.sleep(1000);

		MBInMailboxData.sendKeys(Keys.chord(Keys.CONTROL, "a"), "/" + applicationname + "/in");
		Thread.sleep(1000);
		MBOutMailBoxData.sendKeys(Keys.chord(Keys.CONTROL, "a"), "/" + applicationname + "/out");
		Thread.sleep(1000);
		MBCreateMailboxInSIClick.click();
		Thread.sleep(1000);
		MBFileTypeData.sendKeys(Keys.chord(Keys.CONTROL, "a"), "SFTP");

		Thread.sleep(2000);
		DropDownSelection(PollingIntervalDD, "1 Minute");
		Thread.sleep(2000);

		SubmitClick.click();
	}

	public void DFProfileSelection(String PartnerProfile, String ApplicationProfile) throws Throwable {
		
		wait.until(ExpectedConditions.or( ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(),'Data Flows')]"))));
		DataFlowsModuleClick.click();
		Thread.sleep(1000);
		BuildDataFlowModuleClick.click();
		Thread.sleep(3000);
		wait.until(ExpectedConditions.or( ExpectedConditions.visibilityOfElementLocated(By.xpath("//mat-select[@aria-label='Partner/Producer']"))));
		DropDownSelection(PartnerProfileDD, PartnerProfile);
		Thread.sleep(2000);
		DropDownSelection(ApplicationProfileDD, ApplicationProfile);
		Thread.sleep(2000);

		SearchWorkFlowClick.click();
		Thread.sleep(1000);
		SetUPWorkFlowClick.click();
		Thread.sleep(1000);
	}

	public void SFTP_FileType(String DirectionType, String TransferType) throws Exception {

		if (DirectionType.equalsIgnoreCase("INBOUND")) {

			if (TransferType.equalsIgnoreCase("MFT")) {

				InboundClick.click();
				Thread.sleep(1000);

				IMFTRadiobuttonClick.click();
				Thread.sleep(2000);

				InboundAddClick.click();
				Thread.sleep(2000);

				IMFTFilenameData.sendKeys(Keys.chord(Keys.CONTROL, "a"), filename);
				IMFTFilterData.sendKeys(Keys.chord(Keys.CONTROL, "a"), "MFT");

			} else if (TransferType.equalsIgnoreCase("DOCHANDLING")) {

				InboundClick.click();
				Thread.sleep(1000);

				IDocHandlingRadiobuttonClick.click();
				Thread.sleep(2000);

				InboundAddClick.click();
				Thread.sleep(2000);

				IDocFilenameData.sendKeys(Keys.chord(Keys.CONTROL, "a"), filename);
				Thread.sleep(1000);
				IDocDocumentTypeData.sendKeys(Keys.chord(Keys.CONTROL, "a"), "X12");
				Thread.sleep(1000);
				IDocVersionData.sendKeys(Keys.chord(Keys.CONTROL, "a"), "1.0");
				Thread.sleep(1000);
				IDocTransactionData.sendKeys(Keys.chord(Keys.CONTROL, "a"), "850");
				Thread.sleep(1000);
				IdocSenderIdData.sendKeys(Keys.chord(Keys.CONTROL, "a"), "101010");
				Thread.sleep(1000);
				IDocReceiverIdData.sendKeys(Keys.chord(Keys.CONTROL, "a"), "2020201");
				Thread.sleep(1000);

			}

		}

		else if (DirectionType.equalsIgnoreCase("OUTBOUND")) {

			if (TransferType.equalsIgnoreCase("MFT")) {

				OutboundClick.click();
				Thread.sleep(1000);
				OutMFTClick.click();
				Thread.sleep(2000);

				OutboundAddClick.click();
				Thread.sleep(2000);

				OMftFileNameData.sendKeys(Keys.chord(Keys.CONTROL, "a"), filename);
				Thread.sleep(1000);
				OMftFilterData.sendKeys(Keys.chord(Keys.CONTROL, "a"), "MFT");
				Thread.sleep(1000);

			} else if (TransferType.equalsIgnoreCase("DOCHANDLING")) {

				OutboundClick.click();
				Thread.sleep(1000);
				OutDocHandlingClick.click();
				Thread.sleep(2000);

				OutboundAddClick.click();
				Thread.sleep(2000);

				ODocFileNameData.sendKeys(Keys.chord(Keys.CONTROL, "a"), filename);
				Thread.sleep(1000);
				ODocDocTypeData.sendKeys(Keys.chord(Keys.CONTROL, "a"), "X12");
				Thread.sleep(1000);
				ODocVersionData.sendKeys(Keys.chord(Keys.CONTROL, "a"), "1.0");
				Thread.sleep(1000);
				ODocTransactionData.sendKeys(Keys.chord(Keys.CONTROL, "a"), "850");
				Thread.sleep(1000);
				ODocSenderIdData.sendKeys(Keys.chord(Keys.CONTROL, "a"), "101010");
				Thread.sleep(1000);
				ODocReceiverIdData.sendKeys(Keys.chord(Keys.CONTROL, "a"), "2020201");
				Thread.sleep(1000);

			}

		}

		Thread.sleep(2000);
		Createclick.click();

	}

	public void TableMFT(String title, int colnum, String Rule_Edit_Delete) throws InterruptedException {
		List<WebElement> col = driver.findElements(By.xpath("//table//tbody/tr//td[" + colnum + "]"));
		for (int i = 0; i < col.size(); i++) {
			System.out.println(col.get(i).getText());
			if (Rule_Edit_Delete.equals("Rule") && (title.equals(col.get(i).getText()))) {
				i = i + 1;

				driver.findElement(By.xpath("(//table//tbody/tr[" + i + "]/td[4]//a)[1]")).click();
				break;

			} else if (Rule_Edit_Delete.equals("Edit") && (title.equals(col.get(i).getText()))) {
				i = i + 1;
				Thread.sleep(1000);
				driver.findElement(By.xpath("(//table//tbody/tr[" + i + "]/td[4]//a)[2]")).click();
				break;

			} else if (Rule_Edit_Delete.equals("Delete") && (title.equals(col.get(i).getText()))) {
				i = i + 1;

				Thread.sleep(1000);
				driver.findElement(By.xpath("(//table//tbody/tr[" + i + "]/td[4]//a)[3]")).click();
				yesDelete.click();

				break;

			}
		}
	}

	public void TableDOC(String title, int colnum, String Rule_Edit_Delete) throws InterruptedException {
		List<WebElement> col = driver.findElements(By.xpath("//table//tbody/tr//td[" + colnum + "]"));
		for (int i = 0; i < col.size(); i++) {
			System.out.println(col.get(i).getText());
			if (Rule_Edit_Delete.equals("Rule") && (title.equals(col.get(i).getText()))) {
				i = i + 1;

				driver.findElement(By.xpath("(//table//tbody/tr[" + i + "]/td[8]//a)[1]")).click();
				break;

			} else if (Rule_Edit_Delete.equals("Edit") && (title.equals(col.get(i).getText()))) {
				i = i + 1;
				Thread.sleep(1000);
				driver.findElement(By.xpath("(//table//tbody/tr[" + i + "]/td[8]//a)[2]")).click();
				break;

			} else if (Rule_Edit_Delete.equals("Delete") && (title.equals(col.get(i).getText()))) {
				i = i + 1;

				Thread.sleep(1000);
				driver.findElement(By.xpath("(//table//tbody/tr[" + i + "]/td[8]//a)[3]")).click();
				yesDelete.click();

				break;

			}
		}
	}

	public void InboundRules(String DirectionType) throws Throwable {

		InboundRulesList1Click.click();
		InboundRulesList1Click.click();
		Thread.sleep(1000);
		IAddRulesClick.click();
		Thread.sleep(2000);

		BuildTestProperty1Data.sendKeys("SRC");
		Thread.sleep(1000);
		BuildTestProperty2Data.sendKeys("yyyyMMDDhhmmss");
		Thread.sleep(1000);
		BuildTestProperty3Data.sendKeys("txt");
		Thread.sleep(1000);
		BuildTestProperty4Data.sendKeys("/b2b/IBM/PCM/PCMArc");

		Thread.sleep(2000);
		SavePropertiesClick.click();
		Thread.sleep(2000);

		InboundRulesList2Click.click();
		InboundRulesList2Click.click();
		Thread.sleep(1000);
		IAddRulesClick.click();
		Thread.sleep(2000);

		BuildTestProperty1Data.sendKeys("DES");
		Thread.sleep(1000);
		BuildTestProperty2Data.sendKeys("yyyyMMDDhhmmss");
		Thread.sleep(1000);
		BuildTestProperty3Data.sendKeys("txt");
		Thread.sleep(1000);
		BuildTestProperty4Data.sendKeys("/b2b/IBM/PCM/PCMArc");

		Thread.sleep(2000);
		SavePropertiesClick.click();
		Thread.sleep(2000);

		InboundRulesList3Click.click();
		InboundRulesList3Click.click();
		Thread.sleep(1000);
		IAddRulesClick.click();
		Thread.sleep(2000);

		if (DirectionType.equalsIgnoreCase("INBOUND")) {

			DropDownSelection(dropProperty1Data, "MAILBOX");
			Thread.sleep(2000);
			DropDownSelection(dropProperty2Data, applicationname);
			Thread.sleep(2000);

		} else if (DirectionType.equalsIgnoreCase("OUTBOUND")) {

			DropDownSelection(dropProperty1Data, "B2Bi-SFTP");
			Thread.sleep(2000);
			DropDownSelection(dropProperty2Data, partnername);
			Thread.sleep(2000);

		}

		Thread.sleep(1000);
		SavePropertiesClick.click();
		Thread.sleep(1000);
		minimizerules.click();
		Thread.sleep(2000);

		SaveRulesClick.click();
		Thread.sleep(2000);
		SaveWorkFlowClick.click();
	}

	/////////////////////////////////////////////////////////////////////////////////////

	public void SImailboxpathfilter(String mailboxpath) {

		List<WebElement> list = driver.findElements(By.xpath("//table[@id='mailboxlist']//tbody//tr"));

		for (int i = 1; i <= list.size(); i++) {

			if (list.get(i).getText().equals(mailboxpath)) {

				list.get(i).click();
				break;
			}

		}
	}

	public void SIDashboardConnection() throws Exception {

		driver.findElement(By.xpath("//input[@name='autho']")).sendKeys("fg_sysadmin");

		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("password");

		driver.findElement(By.xpath("//input[@name='submit']")).click();

		Thread.sleep(4000);

		driver.findElement(By.xpath("//a[contains(text(),'Deployment')]")).click(); // deployment

		Thread.sleep(2000);

		driver.findElement(By.xpath("//a[contains(text(),'Schedules')]")).click(); // schedules

		Thread.sleep(2000);

		driver.switchTo().frame(0);

		driver.findElement(By.xpath("//input[@name='searchname']")).sendKeys("1min"); // entering 1min

		Thread.sleep(1000);

		driver.findElement(By.xpath("//input[@name='Go2']")).click(); // go btn

		Thread.sleep(1000);

	}

	public void Minutecheckboxactivity() {

		WebElement checkbox = driver.findElement(By.xpath("(//tr//td[@class='editSelection']//a)[1]")); // 1min checkbox

		if (checkbox.isSelected()) {

			driver.findElement(By.xpath("//input[@name='Return']")).click();

		} else {

			checkbox.click();

		}

	}

	public void ValidateSearchResultWithStatus() throws Throwable {
		FileTransfersClick.click();
		Thread.sleep(1000);
		Searchclick.click();
		Thread.sleep(2000);
		StartDateAndTime.sendKeys(Keys.chord(Keys.CONTROL, "a"), "10/1/2021, 5:59 PM");
		EndDateAndTime.sendKeys(Keys.chord(Keys.CONTROL, "a"), "10/26/2021, 5:59 PM");
		Thread.sleep(2000);
		DropDownSelection(StatusDropDown, "Success");
		Thread.sleep(2000);
		SrcFileNameData.sendKeys(Keys.chord(Keys.CONTROL, "a"), filename);
		Thread.sleep(1000);
		SearchButtonClick.click();

		Thread.sleep(5000);
	}

	public String filevalidation(String srcfilename) {
		String data = null;
		List<WebElement> list = driver.findElements(By.xpath("//table//tbody//tr//td[6]"));

		for (int j = 0; j <= list.size(); j++) {

			if (list.get(j).getText().equals(srcfilename)) {
				data = list.get(j).getText();

				System.out.println("File Processed Successfully");
				break;

			}

		}
		return data;
	}

}
