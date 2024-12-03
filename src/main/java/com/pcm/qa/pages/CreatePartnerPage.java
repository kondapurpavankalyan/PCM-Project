package com.pcm.qa.pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.concurrent.Exchanger;
import java.util.function.ToIntFunction;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.service.DriverService;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import java.io.File;
import autoitx4java.AutoItX;
import com.jacob.com.LibraryLoader;
import com.pcm.qa.base.TestBase;
import com.sun.tools.xjc.Driver;
import com.jacob.com.LibraryLoader;

import autoitx4java.AutoItX;

public class CreatePartnerPage extends TestBase {
	
 
	public static int pn = 01;
	public static int pid = 01;
	public static int e = 01;
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

	/// AS2 YES ///

	@FindBy(xpath = "(//div[@class='mat-radio-inner-circle'])[1]")
	public WebElement AS2YClick;

	@FindBy(xpath = "(//input[@name='profileName'])[2]")
	public WebElement AS2YProfileNameData;

	@FindBy(xpath = "//input[@placeholder='AS2 Identifier *']")
	public WebElement AS2YIdentifierData;

	// @FindBy(xpath = "(//input[@name='emailId'])[2]")
	// public WebElement AS2YEmailAddrsData;

	@FindBy(xpath = "//mat-select[@aria-label='Exchange Certificate *']")
	public WebElement AS2YExchCertDD;

	@FindBy(xpath = "(//button[@class='btn btn-info ng-star-inserted'])[1]")
	public WebElement AS2YExchCertUpload;

	@FindBy(xpath = "//label[contains(text(),'Exchange Cert Upload')]/../../../../..")
	public WebElement AS2YExchCertUploadattach;

	@FindBy(xpath = "//input[@placeholder='Certificate Name']")
	public WebElement AS2YExchCertNameData;

	@FindBy(xpath = "//mat-select[@id='certType']")
	public WebElement AS2YExchCertTypeDD;

	@FindBy(xpath = "//input[@name='privateKeyPassword']")
	public WebElement AS2YExchPrivateKeyPwd;

	@FindBy(xpath = "//button/span[text()='UPLOAD']")
	public WebElement AS2YExcUploadClick;

	@FindBy(xpath = "//mat-select[@aria-label='Signing Certificate *']")
	public WebElement AS2YSignCertDD;

	@FindBy(xpath = "(//button[@class='btn btn-info ng-star-inserted'])[2]")
	public WebElement AS2YSignCertUpload;

	@FindBy(xpath = "//label[contains(text(),'Signing Cert Upload:')]/../../../../..")
	public WebElement AS2YSignCertUploadattach;

	@FindBy(xpath = "//input[@placeholder='Certificate Name']")
	public WebElement AS2YSignCertNameData;

	@FindBy(xpath = "//mat-select[@id='certType']")
	public WebElement AS2YSignCertTypeDD;

	@FindBy(xpath = "//input[@name='privateKeyPassword']")
	public WebElement AS2YSignPrivateKeyPwd;

	@FindBy(xpath = "//button/span[text()='UPLOAD']")
	public WebElement AS2YSignUploadClick;

	@FindBy(xpath = "//button[@class='btn btn-primary']")
	public WebElement SubmitClick;

	/// AS2 NO ///

	@FindBy(xpath = "(//div[@class='mat-radio-inner-circle'])[2]")
	public WebElement AS2NClick;

	@FindBy(xpath = "(//input[@name='profileName'])[2]")
	public WebElement AS2NprofileNameData;

	@FindBy(xpath = "//input[@placeholder='AS2 Identifier *']")
	public WebElement AS2NIdentifierData;

	@FindBy(xpath = "//input[@name='senderId']")
	public WebElement AS2NSenderIDData;

	@FindBy(xpath = "//input[@name='senderQualifier']")
	public WebElement AS2NSenderQualifierData;

	@FindBy(xpath = "//input[@name='endPoint']")
	public WebElement AS2NEndPointData;

	@FindBy(xpath = "//input[@name='responseTimeout']")
	public WebElement AS2NResponseTimeOutData;

	@FindBy(xpath = "//input[@name='httpclientAdapter']")
	public WebElement AS2NHTTPClientAdapterData;

	@FindBy(xpath = "//mat-select[@aria-label='Compress Data *']")
	public WebElement AS2NCompressDD;

	@FindBy(xpath = "//mat-select[@aria-label='Payload Type *']")
	public WebElement AS2NPayloadTypeData;

	@FindBy(xpath = "//mat-select[@aria-label='Mime Type *']")
	public WebElement AS2NMimeTypeDD;

	@FindBy(xpath = "//mat-select[@aria-label='Mime Sub-Type *']")
	public WebElement AS2NMimesubtypeDD;

	@FindBy(xpath = "//mat-select[@aria-label='Cipher Strength *']")
	public WebElement AS2NCipherStrengthDD;

	@FindBy(xpath = "//input[@name='retryInterval']")
	public WebElement AS2NRetryIntervalData;

	@FindBy(xpath = "//input[@name='numberOfRetries']")
	public WebElement AS2NNoOfRetriesData;

	@FindBy(xpath = "//mat-select[@aria-label='Exchange Certificate']")
	public WebElement AS2NExchCertDD;

	@FindBy(xpath = "(//button[@class='btn btn-info ng-star-inserted'])[1]")
	public WebElement AS2NExchCertUpload;

	@FindBy(xpath = "//label[contains(text(),'Upload Cert')]/../../../../..")
	public WebElement AS2NExchCertUploadattach;

	@FindBy(xpath = "//input[@name='certName']")
	public WebElement AS2NExchCertNameData;

	@FindBy(xpath = "//button/span[text()='UPLOAD']")
	public WebElement AS2NUploadExchCertClick;

	@FindBy(xpath = "//mat-select[@aria-label='Signing Certificate *']")
	public WebElement AS2NSignCertDD;

	@FindBy(xpath = "(//button[@class='btn btn-info ng-star-inserted'])[2]")
	public WebElement AS2NSignCertUpload;

	@FindBy(xpath = "//label[contains(text(),'Upload Cert')]/../../../../..")
	public WebElement AS2NSignCertUploadattach;

	@FindBy(xpath = "//input[@name='certName']")
	public WebElement AS2NSignCertNameData;

	@FindBy(xpath = "//button/span[text()='UPLOAD']")
	public WebElement AS2NUploadSignCertClick;

	@FindBy(xpath = "//mat-select[@aria-label='Certificate Name']")
	public WebElement AS2NCaCertDD;

	@FindBy(xpath = "(//button[@class='btn btn-info ng-star-inserted'])[3]")
	public WebElement AS2NCACertUpload;

	@FindBy(xpath = "//input[@name='certName']")
	public WebElement AS2NCACertNameData;

	@FindBy(xpath = "//label[contains(text(),'Upload Cert')]/../../../../..")
	public WebElement AS2NCertUploadattach;

	@FindBy(xpath = "//button/span[text()='UPLOAD']")
	public WebElement AS2NUploadCACertClick;

	@FindBy(xpath = "//input[@name='keyCertificatePassphrase']")
	public WebElement AS2NKeyCertPassPhaseData;

	@FindBy(xpath = "//mat-select[@aria-label='SSL Type *']")
	public WebElement AS2NSSLTypeDD;

	@FindBy(xpath = "//mat-select[@aria-label='Payload Security *']")
	public WebElement AS2NPayloadSec;

	// @FindBy(xpath = "//mat-select[@aria-label='Payload Security *']")
	// public WebElement AS2NPayLoadENCDD;

	@FindBy(xpath = "//mat-select[@aria-label='Encryption Algorithm *']")
	public WebElement AS2NEncAlgoDD;

	@FindBy(xpath = "//mat-select[@aria-label='Signing Algorithm *']")
	public WebElement AS2NSignAlgoDD;

	@FindBy(xpath = "(//div[@class='mat-radio-inner-circle'])[3]")
	public WebElement AS2NMDNREquiredY;

	@FindBy(xpath = "(//div[@class='mat-radio-inner-circle'])[4]")
	public WebElement AS2NMDNREquiredN;

	@FindBy(xpath = "//mat-select[@aria-label='MDN Type *']")
	public WebElement AS2NMdnTypeDD;

	@FindBy(xpath = "//mat-select[@aria-label='MDN Encryption *']")
	public WebElement AS2NMdnEncDD;

	@FindBy(xpath = "//textarea[@name='receiptToAddress']")
	public WebElement AS2NReceipt2AddressData;

	/// AWS-S3 ///

	@FindBy(xpath = "//input[@name='bucketName']")
	public WebElement AWSS3bucketnamedata;

	@FindBy(xpath = "//input[@name='fileName']")
	public WebElement AWSS3filenamedata;

	@FindBy(xpath = "//input[@name='accessKey']")
	public WebElement AWSS3accesskeydata;

	@FindBy(xpath = "//input[@name='secretKey']")
	public WebElement AWSS3secretkeydata;

	@FindBy(xpath = "(//div[@class='mat-checkbox-inner-container'])[1]")
	public WebElement AWSS3inboundpushData;

	@FindBy(xpath = "(//div[@class='mat-checkbox-inner-container'])[2]")
	public WebElement AWSS3outboundpullData;

	@FindBy(xpath = "//input[@name='inMailbox']")
	public WebElement AWSS3inmailboxData;

	/// B2Bi-CD ///

	@FindBy(xpath = "(//div[@class='mat-radio-inner-circle'])[1]")
	public WebElement CDYClick;

	@FindBy(xpath = "//div[contains(text(),' No ')]")
	public WebElement CDNClick;

	@FindBy(xpath = "//input[@name='localNodeName']")
	public WebElement CDLocalNodeNameData;

	@FindBy(xpath = "//input[@name='nodeName']")
	public WebElement CDNodeNameData;

	@FindBy(xpath = "//input[@name='remoteFileName']")
	public WebElement CDRemoteFileNameData;

	@FindBy(xpath = "//input[@name='sNodeId']")
	public WebElement CDSNodeIdData;

	@FindBy(xpath = "//input[@name='sNodeIdPassword']")
	public WebElement CDSNodePwdData;

	@FindBy(xpath = "//input[@name='hostName']")
	public WebElement CDHostNameData;

	@FindBy(xpath = "//input[@name='port']")
	public WebElement CDPortData;

	@FindBy(xpath = "//input[@name='directory']")
	public WebElement CDInDirectoryData;

	@FindBy(xpath = "(//div[@class='mat-checkbox-inner-container'])[1]")
	public WebElement CDInboundPushData;

	@FindBy(xpath = "(//div[@class='mat-checkbox-inner-container'])[2]")
	public WebElement CDOutboundPullData;

	@FindBy(xpath = "//mat-select[@aria-label='Checkpoint']")
	public WebElement CDCheckPointDD;

	@FindBy(xpath = "//input[@name='outDirectory']")
	public WebElement CDOutDirectoryData;

	@FindBy(xpath = "//mat-select[@aria-label='Operating System *']")
	public WebElement CDOpeartingSystemDD;

	@FindBy(xpath = "//input[@name='dcbParam']")
	public WebElement CDDcbParamData;

	@FindBy(xpath = "//input[@name='dnsName']")
	public WebElement CDDSNnameData;

	@FindBy(xpath = "//input[@name='unit']")
	public WebElement CDUnitData;

	@FindBy(xpath = "//input[@name='storageClass']")
	public WebElement CDStorageClassData;

	@FindBy(xpath = "//input[@name='space']")
	public WebElement CDSpaceData;

	@FindBy(xpath = "//input[@name='copySisOpts']")
	public WebElement CDCopySisOptsData;

	@FindBy(xpath = "//mat-select[@aria-label='Compression Level']")
	public WebElement CDCompressionDD;

	@FindBy(xpath = "//mat-select[@aria-label='DISPOSITION']")
	public WebElement CDDepositionDD;

	@FindBy(xpath = "//input[@name='submit']")
	public WebElement CDSubmitData;

	@FindBy(xpath = "//textarea[@name='runJob']")
	public WebElement CDRunjobData;

	@FindBy(xpath = "//textarea[@name='runTask']")
	public WebElement CDRunTaskData;

	@FindBy(xpath = "//mat-select[@aria-label='Security Protocol']")
	public WebElement CDSecurityProtocolDD;

	@FindBy(xpath = "//mat-select[@aria-label='Secure+ *']")
	public WebElement CDSecureDD;

	@FindBy(xpath = "//mat-select[@aria-label='CA Certification']")
	public WebElement CDCACertDD;

	@FindBy(xpath = "//mat-select[@aria-label='Cipher Suites']")
	public WebElement CDCipherSuitsDD;

	@FindBy(xpath = "//input[@name='adapterName']")
	public WebElement CDAdapterNameData;

	/// ///

	@FindBy(xpath = "//input[@id='host_name']")
	public WebElement DBHostNameData;

	@FindBy(xpath = "//input[@id='port_no']")
	public WebElement DBPortNoData;

	@FindBy(xpath = "//input[@id='user_id']")
	public WebElement DBUserIDData;

	@FindBy(xpath = "//input[@id='password']")
	public WebElement DBPasswordData;

	@FindBy(xpath = "//input[@id='sid']")
	public WebElement DBNameData;

	@FindBy(xpath = "//input[@id='database_type']")
	public WebElement DBTypeData;

	/// EXISTING CONNECTION ///

	@FindBy(xpath = "(//mat-select[@aria-label='Protocol *'])[2]")
	public WebElement ECProtocolDD;

	@FindBy(xpath = "//mat-select[@aria-label='Protocol Reference *']")
	public WebElement ECprotocolRefDD;

	/// FILESYSTEM ///

	@FindBy(xpath = "//input[@name='userName']")
	public WebElement FSUserNameData;

	@FindBy(xpath = "//input[@name='password']")
	public WebElement FSPasswordData;

	@FindBy(xpath = "//input[@name='fileType']")
	public WebElement FSFileTypeData;

	@FindBy(xpath = "//input[@name='inDirectory']")
	public WebElement FSInDirData;

	@FindBy(xpath = "//input[@name='outDirectory']")
	public WebElement FSOutDirData;

	@FindBy(xpath = "//div[@class='mat-checkbox-inner-container']")
	public WebElement FSDelAfterCollData;

	@FindBy(xpath = "//select[@id='fsPoolingInterval']")
	public WebElement FSPIDD;

	@FindBy(xpath = "//input[@name='adapterName']")
	public WebElement FSAdapNameData;

	/// B2Bi FTP H2P ///

	@FindBy(xpath = "(//div[@class='mat-radio-inner-circle'])[1]")
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

	/// HTTP ///

	@FindBy(xpath = "//input[@name='inMailBox']")
	public WebElement HTTPMailboxData;

	@FindBy(xpath = "//input[@name='outBoundUrl']")
	public WebElement HTTPOutboundURLData;

	@FindBy(xpath = "//input[@name='adapterName']")
	public WebElement HTTPAdapnamedata;

	/// HTTPS ///

	@FindBy(xpath = "//input[@name='inMailBox']")
	public WebElement HTTPSMailBoxData;

	@FindBy(xpath = "//input[@name='outBoundUrl']")
	public WebElement HTTPSOutboundUrlData;

	@FindBy(xpath = "//mat-select[@aria-label='Certificate Id *']")
	public WebElement HTTPSCertIdDD;

	@FindBy(xpath = "//button[contains(text(),'UPLOAD CERT')]")
	public WebElement HTTPSuploadCert;

	@FindBy(xpath = "//label[contains(text(),'Upload Cert')]/../../../../..")
	public WebElement HTTPSCertUploadattach;

	@FindBy(xpath = "//input[@name='certName']")
	public WebElement HTTPSCACertNameData;

	@FindBy(xpath = "//button/span[text()='UPLOAD']")
	public WebElement HTTPSUploadCertClick;

	@FindBy(xpath = "//select[@id='httpsPoolingInterval']")
	public WebElement HTTPSPIDD;

	@FindBy(xpath = "//input[@name='adapterName']")
	public WebElement HTTPSAdapNameData;

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

	/// MQ ///

	@FindBy(xpath = "//input[@name='hostName']")
	public WebElement MQHostNameData;

	@FindBy(xpath = "//input[@name='fileType']")
	public WebElement MQFileTypeData;

	@FindBy(xpath = "//input[@id='mqFileType']")
	public WebElement Mailboxfilter;

	@FindBy(xpath = "//input[@name='queueManager']")
	public WebElement MQQueueManagerData;

	@FindBy(xpath = "//input[@name='queueName']")
	public WebElement MQQueueNameData;

	@FindBy(xpath = "//mat-select[@aria-label='Pooling Interval']")
	public WebElement MQPIDD;

	@FindBy(xpath = "//input[@name='adapterName']")
	public WebElement MQAdapNameData;

	@FindBy(xpath = "//input[@id='name']")
	public WebElement OracleNameData;

	@FindBy(xpath = "//input[@id='tp_contract_send']")
	public WebElement OraclePartnerData;

	@FindBy(xpath = "//select[@id='date_time_oag']")
	public WebElement OracleinsertDateDD;

	@FindBy(xpath = "//input[@id='timeout_bod']")
	public WebElement OracleTimeOutData;

	@FindBy(xpath = "//input[@id='bp_rec_msgs']")
	public WebElement OracleBPMessagesData;

	@FindBy(xpath = "//input[@id='bp_unknown_bods']")
	public WebElement OracleBPBodsData;

	@FindBy(xpath = "//select[@id='auto_send_bod_rec_msgs']")
	public WebElement OracleSendMessagesDD;

	@FindBy(xpath = "//input[@id='name_bod']")
	public WebElement OracleNameOfBODData;

	@FindBy(xpath = "//input[@id='directory_bod']")
	public WebElement OracleDirectoryOfBODData;

	@FindBy(xpath = "//input[@id='http_endpoint']")
	public WebElement OracleHttpEndPointData;

	@FindBy(xpath = "//select[@id='request_type']")
	public WebElement OracleReqTypeDD;

	@FindBy(xpath = "//select[@id='protocol']")
	public WebElement OracleProtocolDD;

	@FindBy(xpath = "//input[@id='user_name']")
	public WebElement OracleUsernameData;

	@FindBy(xpath = "//input[@id='or_password']")
	public WebElement OraclePasswordData;

	/// SAP ///

	@FindBy(xpath = "//input[@name='adapterName']")
	public WebElement SAPAdapNameData;

	@FindBy(xpath = "//input[@name='sapRoute']")
	public WebElement SAPRouteData;

	///

	@FindBy(xpath = "//input[@id='smtp_name']")
	public WebElement SMTPNameData;

	@FindBy(xpath = "//select[@id='smtp_access_protocol']")
	public WebElement SMTPAccessProtocolDD;

	@FindBy(xpath = "//input[@id='smtp_mail_server']")
	public WebElement SMTPMailServerData;

	@FindBy(xpath = "//input[@id='smtp_mail_server_port']")
	public WebElement SMTPMailServerPortData;

	@FindBy(xpath = "//input[@id='smtp_uname']")
	public WebElement SMTPUserNameData;

	@FindBy(xpath = "//input[@id='smtp_password']")
	public WebElement SMTPPasswordData;

	@FindBy(xpath = "//input[@id='smtp_conn_retries']")
	public WebElement SMTPConnectionRetriesData;

	@FindBy(xpath = "//input[@id='smtp_retry_interval']")
	public WebElement SMTPRetryInterval;

	@FindBy(xpath = "//input[@id='smtp_max_msgs_session']")
	public WebElement SMTPMaxMessages;

	@FindBy(xpath = "//select[@id='smtp_remove_mail_msgs']")
	public WebElement SMTPRemovieMails;

	@FindBy(xpath = "//input[@id='smtp_ssl']")
	public WebElement SMTPSSLData;

	@FindBy(xpath = "//input[@id='smtp_key_cert_passphrase']")
	public WebElement SMTPKeyCertPassPhraseData;

	@FindBy(xpath = "//input[@id='smtp_cipher_strength']")
	public WebElement SMTPCipherStrengthData;

	@FindBy(xpath = "//input[@id='smtp_key_cert']")
	public WebElement SMTPKeyCertificateData;

	@FindBy(xpath = "//input[@id='smtp_ca_certificates']")
	public WebElement SMTPCACertificateData;

	@FindBy(xpath = "//input[@id='smtp_uri_name']")
	public WebElement SMTPUrlNamedata;

	@FindBy(xpath = "//select[@id='smtpPoolingInterval']")
	public WebElement SMTPPIDD;

	/// WEBSERVICE ///

	@FindBy(xpath = "//input[@name='name']")
	public WebElement WSNameData;

	@FindBy(xpath = "//input[@name='inMailBox']")
	public WebElement WSMailbox;

	@FindBy(xpath = "//input[@name='outBoundUrl']")
	public WebElement WSOutboundURLData;

	@FindBy(xpath = "//mat-select[@aria-label='Certificate Id *']")
	public WebElement WSCertIdDD;

	@FindBy(xpath = "//mat-select[@aria-label='Polling Interval *']")
	public WebElement WSPIDD;

	@FindBy(xpath = "//input[@name='adapterName']")
	public WebElement WSAdapName;

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

	/// ///

	@FindBy(xpath = "(//div[@class='mat-radio-inner-circle'])[1]")
	public WebElement SFGFTPHPType;

	@FindBy(xpath = "(//div[@class='mat-radio-inner-circle'])[2]")
	public WebElement SFGFTPPHType;

	@FindBy(xpath = "//mat-select[@aria-label='Connection Type*']")
	public WebElement SFGFTPHPConnType;

	@FindBy(xpath = "//input[@name='remoteHost']")
	public WebElement SFGFTPHPRemoteHostData;

	@FindBy(xpath = "//input[@name='remotePort']")
	public WebElement SFGFTPHPRemotePortData;

	@FindBy(xpath = "//input[@name='userName']")
	public WebElement SFGFTPHPUsernameData;

	@FindBy(xpath = "//input[@name='password']")
	public WebElement SFGFTPHPPasswordData;

	@FindBy(xpath = "//input[@name='inDirectory']")
	public WebElement SFGFTPHPInDirData;

	@FindBy(xpath = "//input[@name='outDirectory']")
	public WebElement SFGFTPHPOutDirData;

	@FindBy(xpath = "//input[@name='noOfRetries']")
	public WebElement SFGFTPHPNoOfRetriesData;

	@FindBy(xpath = "//input[@name='retryInterval']")
	public WebElement SFGFTPHPRetryIntervalData;

	@FindBy(xpath = "//div[@class='mat-checkbox-inner-container']")
	public WebElement SFGFTPHPDelAfterCollClick;

	@FindBy(xpath = "//mat-select[@aria-label='Pooling Interval']")
	public WebElement SFGFTPHPPIDD;

	@FindBy(xpath = "//input[@name='adapterName']")
	public WebElement SFGFTPHPAdapNameData;

	@FindBy(xpath = "//input[@name='userName']")
	public WebElement SFGFTPPHUserIDData;

	@FindBy(xpath = "//input[@name='password']")
	public WebElement SFGFTPPHPasswordData;

	@FindBy(xpath = "//mat-select[@aria-label='Transfer Type']")
	public WebElement SFGFTPPHTransferType;

	@FindBy(xpath = "//input[@name='inDirectory']")
	public WebElement SFGFTPPHIndirData;

	@FindBy(xpath = "//input[@name='outDirectory']")
	public WebElement SFGFTPPHOutDirData;

	@FindBy(xpath = "(//div[@class='mat-checkbox-inner-container'])[1]")
	public WebElement SFGFTPPHMailboxinSIClick;

	@FindBy(xpath = "//input[@name='fileType']")
	public WebElement SFGFTPPHFileType;

	@FindBy(xpath = "(//div[@class='mat-checkbox-inner-container'])[2]")
	public WebElement SFGFTPPHDelAfterCollClick;

	@FindBy(xpath = "//mat-select[@aria-label='Pooling Interval']")
	public WebElement SFGFTPPHPIDD;

	@FindBy(xpath = "//input[@name='adapterName']")
	public WebElement SFGFTPPHAdapNameData;

	@FindBy(xpath = "//select[@id='sfgFtpsConnectionType']")
	public WebElement SFGFTPSHPConnTypeDD;

	@FindBy(xpath = "//input[@id='sfgFtpsRemoteHost']")
	public WebElement SFGFTPSHPRemoteHostData;

	@FindBy(xpath = "//input[@id='sfgFtpsRemotePort']")
	public WebElement SFGFTPSHPRemotePortData;

	@FindBy(xpath = "//select[@id='sfgFtpsEncryptionStrength']")
	public WebElement SFGFTPSHPEncStrengthDD;

	@FindBy(xpath = "//input[@id='sfgFtpsUserName']")
	public WebElement SFGFTPSHPUsernameData;

	@FindBy(xpath = "//input[@id='sfgFtpsPassword']")
	public WebElement SFGFTPSHPPasswordData;

	@FindBy(xpath = "//input[@id='sfgFtpsInDirectory']")
	public WebElement SFGFTPSHPInDirData;

	@FindBy(xpath = "//input[@id='sfgFtpsOutDirectory']")
	public WebElement SFGFTPSHPOutDirData;

	@FindBy(xpath = "//input[@id='sfgFtpsUseCCC']")
	public WebElement SFGFTPSHPCCCClick;

	@FindBy(xpath = "//input[@id='sfgFtpsNOfRetries']")
	public WebElement SFGFTPSHPNoOfRetriesData;

	@FindBy(xpath = "//input[@id='sfgFtpsRetryInterval']")
	public WebElement SFGFTPSHPRetryIntervalData;

	@FindBy(xpath = "//input[@id='sfgFtpsUseImplicitSSL']")
	public WebElement SFGFTPSHPImplicitSSLClick;

	@FindBy(xpath = "//input[@id='sfgFtpsDeleteAfterCollection']")
	public WebElement SFGFTPSHPDelAfterCollClick;

	@FindBy(xpath = "//select[@id='sfgFtpsCertId']")
	public WebElement SFGFTPSHPCertIdDD;

	@FindBy(xpath = "//input[@id='sfgFtpsCertificate']")
	public WebElement SFGFTPSHPUploadCert;

	@FindBy(xpath = "//input[@id='sfgFtpsCertName']")
	public WebElement SFGFTPSHPCertNameData;

	@FindBy(xpath = "(//input[@id='newTradingPartner_uploadCACert'])[1]")
	public WebElement SFGFTPSHPUploadCertClick;

	@FindBy(xpath = "//select[@id='sfgFtpsPoolingInterval']")
	public WebElement SFGFTPSHPPIDD;

	@FindBy(xpath = "//input[@id='sfgFtpsAdapterName']")
	public WebElement SFGFTPSHPAdapterNameData;

	@FindBy(xpath = "//input[@id='pcSfgFtpsUserId']")
	public WebElement SFGFTPSPHUserIDData;

	@FindBy(xpath = "//input[@id='pcSfgFtpsPassword']")
	public WebElement SFGFTPSPHPasswordData;

	@FindBy(xpath = "//select[@id='pcSfgFtpsTransferType']")
	public WebElement SFGFTPSPHTransferTypeDD;

	@FindBy(xpath = "//input[@id='pcSfgFtpsInDir']")
	public WebElement SFGFTPSPHInDirData;

	@FindBy(xpath = "//input[@id='pcSfgFtpsOutDir']")
	public WebElement SFGFTPSPHOutDirData;

	@FindBy(xpath = "//input[@id='pcCreateSfgFtpsMailBox']")
	public WebElement SFGFTPSPHMailboxinSIClick;

	@FindBy(xpath = "//input[@id='pcSfgFtpsFileType']")
	public WebElement SFGFTPSPHFileTypeData;

	@FindBy(xpath = "//input[@id='pcSfgFtpsDeleteAfterCollection']")
	public WebElement SFGFTPSPHDelAfterCollClick;

	@FindBy(xpath = "//select[@id='pcSfgFtpsPoolingInterval']")
	public WebElement SFGFTPSPHPIDD;

	@FindBy(xpath = "//input[@id='pcSfgFtpsAdapterName']")
	public WebElement SFGFTPSPHAdapNameData;

	@FindBy(xpath = "//select[@id='sfgSftpType']")
	public WebElement SFGSFTPHPTypeDD;

	@FindBy(xpath = "//input[@id='sfgSftpRemoteHost']")
	public WebElement SFGSFTPHPRemoteHostData;

	@FindBy(xpath = "//input[@id='sfgSftpRemotePort']")
	public WebElement SFGSFTPHPRemotePortData;

	@FindBy(xpath = "//select[@id='sfgSftpPrefMacAlg']")
	public WebElement SFGSFTPHPAlgorithmDD;

	@FindBy(xpath = "//input[@id='sfgSftpRemoteUser']")
	public WebElement SFGSFTPHPRemoteUSerData;

	@FindBy(xpath = "//input[@id='sfgSftpSshPassword']")
	public WebElement SFGSFTPHPSSHPasswordData;

	@FindBy(xpath = "//input[@id='sfgSftpCharEncoding']")
	public WebElement SFGSFTPHPCharEncodingData;

	@FindBy(xpath = "//input[@id='sfgSftpDirectory']")
	public WebElement SFGSFTPHPIndirData;

	@FindBy(xpath = "//input[@id='sfgSftpOutDirectory']")
	public WebElement SFGSFTPHPOutDirData;

	@FindBy(xpath = "//input[@id='sfgSftpLocalPortRange']")
	public WebElement SFGSFTPHPLocalPortRangeData;

	@FindBy(xpath = "//select[@id='sfgSftpCompression']")
	public WebElement SFGSFTPHPCompDD;

	@FindBy(xpath = "//input[@id='sfgSftpRetryDelay']")
	public WebElement SFGSFTPHPRetryDelayData;

	@FindBy(xpath = "//input[@id='sfgSftpConnRetryCount']")
	public WebElement SFGSFTPHPConnRetryCountDelayData;

	@FindBy(xpath = "//select[@id='sfgSftpPreferredCipher']")
	public WebElement SFGSFTPHPPreCipherDD;

	@FindBy(xpath = "//select[@id='sfgSftpPreAuthType']")
	public WebElement SFGSFTPHPAuthTypeDD;

	@FindBy(xpath = "//input[@id='sfgSftpResponseTimeOut']")
	public WebElement SFGSFTPHPRespTimeOutData;

	@FindBy(xpath = "//input[@name='tpBean.sfgSftpFileType']")
	public WebElement SFGSFTPHPRemoteFilePatternData;

	@FindBy(xpath = "//input[@id='sfgSftpDeleteAfterCollection']")
	public WebElement SFGSFTPHPDelAfterCollClick;

	@FindBy(xpath = "//select[@id='sfgSftpUserIdentityKey']")
	public WebElement SFGSFTPHPUserIdKeyDD;

	@FindBy(xpath = "//input[@id='sfgSftpUserIdentityKeyCert']")
	public WebElement SFGSFTPHPUserIDUploadCert;

	@FindBy(xpath = "//input[@id='sfgSftpUserIdentityKeyCertName']")
	public WebElement SFGSFTPHPUserKeyNameData;

	@FindBy(xpath = "//input[@id='newTradingPartner_uploadSSHUIDKey']")
	public WebElement SFGSFTPHPUploadCertClick;

	@FindBy(xpath = "//select[@id='sfgSftpKnownHostKey']")
	public WebElement SFGSFTPHPKnownHostKeyDD;

	@FindBy(xpath = "//input[@id='sfgSftpSSHKey']")
	public WebElement SFGSFTPHPUploadCert;

	@FindBy(xpath = "//input[@id='sfgSftpKeyName']")
	public WebElement SFGSFTPHPKnownHostNameData;

	@FindBy(xpath = "(//input[@id='newTradingPartner_uploadSSHKey'])[1]")
	public WebElement SFGSFTPHPKHUploadCertClick;

	@FindBy(xpath = "//select[@id='sfgSftpPoolingInterval']")
	public WebElement SFGSFTPHPPIDD;

	@FindBy(xpath = "//input[@id='sfgSftpAdapterName']")
	public WebElement SFGSFTPHPAdapNameData;

	@FindBy(xpath = "//input[@id='pcSfgSftpUserId']")
	public WebElement SFGSFTPPHUserIDData;

	@FindBy(xpath = "//input[@id='pcSfgSftpPassword']")
	public WebElement SFGSFTPPHPasswordData;

	@FindBy(xpath = "//select[@id='pcSfgSftpTransferType']")
	public WebElement SFGSFTPPHTransferType;

	@FindBy(xpath = "//input[@id='pcSfgSftpInDir']")
	public WebElement SFGSFTPPHIndirData;

	@FindBy(xpath = "//input[@id='pcSfgSftpOutDir']")
	public WebElement SFGSFTPPHOutDirData;

	@FindBy(xpath = "//input[@id='pcCreateSfgSftpMailBox']")
	public WebElement SFGSFTPPHDirinSIClick;

	@FindBy(xpath = "//input[@id='pcSfgSftpFileType']")
	public WebElement SFGSFTPPHFileTypeData;

	@FindBy(xpath = "//input[@id='pcSfgSftpDeleteAfterCollection']")
	public WebElement SFGSFTPPHDelAfterCollClick;

	@FindBy(xpath = "//select[@id='pcSfgSftpPoolingInterval']")
	public WebElement SFGSFTPPHPIDD;

	@FindBy(xpath = "//input[@id='pcSfgSftpAdapterName']")
	public WebElement SFGSFTPPHAdapterNameData;

	@FindBy(xpath = "//select[@id='sfgFtpsType']")
	public WebElement SFGFTPSType;

	@FindBy(xpath = "//div[@id='swal2-content']")
	public WebElement Actionmsg;

	@FindBy(xpath = "//h4")
	public WebElement Partnertitle;

	@FindBy(xpath = "//div[@id='swal2-content']")
	public WebElement Error1;

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
	

	public CreatePartnerPage() {
		PageFactory.initElements(driver, this);
	}

	public String validatePartnerPageTitle() throws InterruptedException {

		// FileLifeCycleclick.click();
		Actionselection(driver, PartnerClick);
		Thread.sleep(3000);
		return Partnertitle.getText();

	}


	public String validateCreatePartnerPageTitle() throws InterruptedException {
		
		Thread.sleep(1000);
		PartnerClick.click();
		Thread.sleep(3000);
		CreatePartnerClick.click();
		Thread.sleep(3000);

		return CreatePartnertitle.getText();
	}

	public void Commondata() throws InterruptedException {

		Thread.sleep(1000);
		PartnerNameData.sendKeys("PartnerAutomation" + pn++);
		
		PartnerIdData.sendKeys("PartnerAutomation" + pid++);
	
		EmailData.sendKeys("Partner" + e++ + "@gmail.com");
		
		PhoneData.sendKeys("123123123" + p++);
		
		AddressLine1Data.sendKeys("ADDr1" + A1++);
		
		AddressLine2Data.sendKeys("ADDR2" + A2++);
		Thread.sleep(1000);

	}

	public void CommondataAS2Yes() throws InterruptedException {

		Thread.sleep(1000);
		PartnerNameData.sendKeys("PartnerAutomationAS2yes" + pn++);
		
		PartnerIdData.sendKeys("PartnerAutomationAS2yes" + pid++);
	
		EmailData.sendKeys("Partner" + e++ + "@gmail.com");
		
		PhoneData.sendKeys("123123123" + p++);
		
		AddressLine1Data.sendKeys("ADDr1" + A1++);
		
		AddressLine2Data.sendKeys("ADDR2" + A2++);
		Thread.sleep(1000);

	}
	
	public void CommondataAS2No() throws InterruptedException {

		Thread.sleep(1000);
		PartnerNameData.sendKeys("PartnerAutomationAS2no" + pn++);
		
		PartnerIdData.sendKeys("PartnerAutomationAS2no" + pid++);
	
		EmailData.sendKeys("Partner" + e++ + "@gmail.com");
		
		PhoneData.sendKeys("123123123" + p++);
		
		AddressLine1Data.sendKeys("ADDr1" + A1++);
		
		AddressLine2Data.sendKeys("ADDR2" + A2++);
		Thread.sleep(2000);

	}
	
	public void CommondataAWSS3() throws InterruptedException {

		Thread.sleep(1000);
		PartnerNameData.sendKeys("PartnerAutomationAWSS3" + pn++);
		
		PartnerIdData.sendKeys("PartnerAutomationAWSS3" + pid++);
	
		EmailData.sendKeys("Partner" + e++ + "@gmail.com");
		
		PhoneData.sendKeys("123123123" + p++);
		
		AddressLine1Data.sendKeys("ADDr1" + A1++);
		
		AddressLine2Data.sendKeys("ADDR2" + A2++);
		Thread.sleep(1000);

	}
	
	public void CommondataCDyes() throws InterruptedException {

		Thread.sleep(1000);
		PartnerNameData.sendKeys("PartnerAutomationCDyes" + pn++);
		
		PartnerIdData.sendKeys("PartnerAutomationCDyes" + pid++);
	
		EmailData.sendKeys("Partner" + e++ + "@gmail.com");
		
		PhoneData.sendKeys("123123123" + p++);
		
		AddressLine1Data.sendKeys("ADDr1" + A1++);
		
		AddressLine2Data.sendKeys("ADDR2" + A2++);
		Thread.sleep(1000);

	}
	
	public void CommondataCDNo() throws InterruptedException {

		Thread.sleep(1000);
		PartnerNameData.sendKeys("PartnerAutomationCDno" + pn++);
		
		PartnerIdData.sendKeys("PartnerAutomationCDno" + pid++);
	
		EmailData.sendKeys("Partner" + e++ + "@gmail.com");
		
		PhoneData.sendKeys("123123123" + p++);
		
		AddressLine1Data.sendKeys("ADDr1" + A1++);
		
		AddressLine2Data.sendKeys("ADDR2" + A2++);
		Thread.sleep(1000);

	}
	
	public void CommondataFTPH2P() throws InterruptedException {

		Thread.sleep(1000);
		PartnerNameData.sendKeys("PartnerAutomationFTPh2p" + pn++);
		
		PartnerIdData.sendKeys("PartnerAutomationFTPh2p" + pid++);
	
		EmailData.sendKeys("Partner" + e++ + "@gmail.com");
		
		PhoneData.sendKeys("123123123" + p++);
		
		AddressLine1Data.sendKeys("ADDr1" + A1++);
		
		AddressLine2Data.sendKeys("ADDR2" + A2++);
		Thread.sleep(1000);

	}
	
	public void CommondataFTPP2H() throws InterruptedException {

		Thread.sleep(1000);
		PartnerNameData.sendKeys("PartnerAutomationFTPp2h" + pn++);
		
		PartnerIdData.sendKeys("PartnerAutomationFTPp2h" + pid++);
	
		EmailData.sendKeys("Partner" + e++ + "@gmail.com");
		
		PhoneData.sendKeys("123123123" + p++);
		
		AddressLine1Data.sendKeys("ADDr1" + A1++);
		
		AddressLine2Data.sendKeys("ADDR2" + A2++);
		Thread.sleep(1000);

	}
	
	
	public void CommondataFTPSH2P() throws InterruptedException {

		Thread.sleep(1000);
		PartnerNameData.sendKeys("PartnerAutomationFTPSh2p" + pn++);
		
		PartnerIdData.sendKeys("PartnerAutomationFTPSh2p" + pid++);
	
		EmailData.sendKeys("Partner" + e++ + "@gmail.com");
		
		PhoneData.sendKeys("123123123" + p++);
		
		AddressLine1Data.sendKeys("ADDr1" + A1++);
		
		AddressLine2Data.sendKeys("ADDR2" + A2++);
		Thread.sleep(1000);

	}
	
	public void CommondataFTPSP2H() throws InterruptedException {

		Thread.sleep(1000);
		PartnerNameData.sendKeys("PartnerAutomationFTPSp2h" + pn++);
		
		PartnerIdData.sendKeys("PartnerAutomationFTPSp2h" + pid++);
	
		EmailData.sendKeys("Partner" + e++ + "@gmail.com");
		
		PhoneData.sendKeys("123123123" + p++);
		
		AddressLine1Data.sendKeys("ADDr1" + A1++);
		
		AddressLine2Data.sendKeys("ADDR2" + A2++);
		Thread.sleep(1000);

	}
	
	
	public void CommondataSFTPH2P() throws InterruptedException {

		Thread.sleep(1000);
		PartnerNameData.sendKeys("PartnerAutomationSFTPh2p" + pn++);
		
		PartnerIdData.sendKeys("PartnerAutomationSFTPh2p" + pid++);
	
		EmailData.sendKeys("Partner" + e++ + "@gmail.com");
		
		PhoneData.sendKeys("123123123" + p++);
		
		AddressLine1Data.sendKeys("ADDr1" + A1++);
		
		AddressLine2Data.sendKeys("ADDR2" + A2++);
		Thread.sleep(1000);

	}
	
	public void CommondataSFTPP2H() throws InterruptedException {

		Thread.sleep(1000);
		PartnerNameData.sendKeys("PartnerAutomationSFTPp2h" + pn++);
		
		PartnerIdData.sendKeys("PartnerAutomationSFTPp2h" + pid++);
	
		EmailData.sendKeys("Partner" + e++ + "@gmail.com");
		
		PhoneData.sendKeys("123123123" + p++);
		
		AddressLine1Data.sendKeys("ADDr1" + A1++);
		
		AddressLine2Data.sendKeys("ADDR2" + A2++);
		Thread.sleep(1000);

	}
	
	public void CommondataExistingConnection() throws InterruptedException {

		Thread.sleep(1000);
		PartnerNameData.sendKeys("PartnerAutomationExistingConnection" + pn++);
		
		PartnerIdData.sendKeys("PartnerAutomationExistingConnection" + pid++);
	
		EmailData.sendKeys("Partner" + e++ + "@gmail.com");
		
		PhoneData.sendKeys("123123123" + p++);
		
		AddressLine1Data.sendKeys("ADDr1" + A1++);
		
		AddressLine2Data.sendKeys("ADDR2" + A2++);
		Thread.sleep(1000);

	}
	
	public void CommondataFileSystem() throws InterruptedException {

		Thread.sleep(1000);
		PartnerNameData.sendKeys("PartnerAutomationFileSystem" + pn++);
		
		PartnerIdData.sendKeys("PartnerAutomationFileSystem" + pid++);
	
		EmailData.sendKeys("Partner" + e++ + "@gmail.com");
		
		PhoneData.sendKeys("123123123" + p++);
		
		AddressLine1Data.sendKeys("ADDr1" + A1++);
		
		AddressLine2Data.sendKeys("ADDR2" + A2++);
		Thread.sleep(1000);

	}
	
	public void CommondataHTTP() throws InterruptedException {

		Thread.sleep(1000);
		PartnerNameData.sendKeys("PartnerAutomationHTTP" + pn++);
		
		PartnerIdData.sendKeys("PartnerAutomationHTTP" + pid++);
	
		EmailData.sendKeys("Partner" + e++ + "@gmail.com");
		
		PhoneData.sendKeys("123123123" + p++);
		
		AddressLine1Data.sendKeys("ADDr1" + A1++);
		
		AddressLine2Data.sendKeys("ADDR2" + A2++);
		Thread.sleep(1000);

	}
	
	public void CommondataHTTPS() throws InterruptedException {

		Thread.sleep(1000);
		PartnerNameData.sendKeys("PartnerAutomationHTTPS" + pn++);
		
		PartnerIdData.sendKeys("PartnerAutomationHTTPS" + pid++);
	
		EmailData.sendKeys("Partner" + e++ + "@gmail.com");
		
		PhoneData.sendKeys("123123123" + p++);
		
		AddressLine1Data.sendKeys("ADDr1" + A1++);
		
		AddressLine2Data.sendKeys("ADDR2" + A2++);
		Thread.sleep(1000);

	}
	
	public void CommondataMailbox() throws InterruptedException {

		Thread.sleep(1000);
		PartnerNameData.sendKeys("PartnerAutomationMailbox" + pn++);
		
		PartnerIdData.sendKeys("PartnerAutomationMailbox" + pid++);
	
		EmailData.sendKeys("Partner" + e++ + "@gmail.com");
		
		PhoneData.sendKeys("123123123" + p++);
		
		AddressLine1Data.sendKeys("ADDr1" + A1++);
		
		AddressLine2Data.sendKeys("ADDR2" + A2++);
		Thread.sleep(1000);

	}
	
	
	public void CommondataMQ() throws InterruptedException {

		Thread.sleep(1000);
		PartnerNameData.sendKeys("PartnerAutomationMQ" + pn++);
		
		PartnerIdData.sendKeys("PartnerAutomationMQ" + pid++);
	
		EmailData.sendKeys("Partner" + e++ + "@gmail.com");
		
		PhoneData.sendKeys("123123123" + p++);
		
		AddressLine1Data.sendKeys("ADDr1" + A1++);
		
		AddressLine2Data.sendKeys("ADDR2" + A2++);
		Thread.sleep(1000);

	}
	
	public void CommondataSAP() throws InterruptedException {

		Thread.sleep(1000);
		PartnerNameData.sendKeys("PartnerAutomationSAP" + pn++);
		
		PartnerIdData.sendKeys("PartnerAutomationSAP" + pid++);
	
		EmailData.sendKeys("Partner" + e++ + "@gmail.com");
		
		PhoneData.sendKeys("123123123" + p++);
		
		AddressLine1Data.sendKeys("ADDr1" + A1++);
		
		AddressLine2Data.sendKeys("ADDR2" + A2++);
		Thread.sleep(1000);

	}
	
	public void CommondataWebservice() throws InterruptedException {

		Thread.sleep(1000);
		PartnerNameData.sendKeys("PartnerAutomationWebservice" + pn++);
		
		PartnerIdData.sendKeys("PartnerAutomationWebservice" + pid++);
	
		EmailData.sendKeys("Partner" + e++ + "@gmail.com");
		
		PhoneData.sendKeys("123123123" + p++);
		
		AddressLine1Data.sendKeys("ADDr1" + A1++);
		
		AddressLine2Data.sendKeys("ADDR2" + A2++);
		Thread.sleep(1000);

	}
	
	public void Commondata1() throws InterruptedException {
		PartnerNameData.sendKeys("PartnerAutomation1");
		Thread.sleep(1000);
		PartnerIdData.sendKeys("PartnerAutomation1");
		EmailData.sendKeys("Partner" + e++ + "@gmail.com");
		PhoneData.sendKeys("100100100" + p++);
		AddressLine1Data.sendKeys("ADDr1" + A1++);
		AddressLine2Data.sendKeys("ADDR2" + A2++);
		Thread.sleep(1000);

	}

	public void Commondata2() throws InterruptedException {
		PartnerNameData.sendKeys("testing");
		Thread.sleep(1000);
		PartnerIdData.sendKeys("testing");
		EmailData.sendKeys("Partner" + e++ + "@gmail.com");
		PhoneData.sendKeys("100100100" + p++);
		AddressLine1Data.sendKeys("ADDr1" + A1++);
		AddressLine2Data.sendKeys("ADDR2" + A2++);
		Thread.sleep(1000);

	}

	public void ValidateAS2YWithValidData() throws Throwable {
		CommondataAS2Yes();
		DropDownSelection(ProtocolDD, "AS2");
		Thread.sleep(3000);
		AS2YClick.click();

		Thread.sleep(3000);
		//AS2YIdentifierData.sendKeys("test111" + pn++);
		AS2YIdentifierData.sendKeys("test111" + pn++);
		Thread.sleep(1000);
		DropDownSelection(AS2YExchCertDD, "ASISslCert");
		Thread.sleep(3000);
		DropDownSelection(AS2YSignCertDD, "ASISslCert");
		Thread.sleep(3000);

		SubmitClick.click();

	}

	public void ValidateAS2NWithValidData() throws Throwable {
		CommondataAS2No();
		DropDownSelection(ProtocolDD, "AS2");
		Thread.sleep(3000);

		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].scrollIntoView(true);", AS2NClick);

		driver.findElement(By.xpath("//div[contains(text(),' No ')]")).click(); // NO

		Thread.sleep(3000);

		AS2NIdentifierData.sendKeys("10" + pn++);
		Thread.sleep(1000);
	//	AS2NSenderIDData.sendKeys("12345");
	//	Thread.sleep(1000);
	//	AS2NSenderQualifierData.sendKeys("67890");
	//	Thread.sleep(1000);
		AS2NEndPointData.sendKeys("1001" + pn++);
		Thread.sleep(1000);
		AS2NResponseTimeOutData.sendKeys("100" + pn++);
		Thread.sleep(1000);
		
		// HTTPClientAdapter
		// DropDownSelection(AS2NCompressDD, "Default");
		// DropDownSelection(AS2NPayloadTypeData, "Plain Text");

		// DropDownSelection(AS2NMimeTypeDD, "Application");
		// DropDownSelection(AS2NMimesubtypeDD, "Plain");
		// DropDownSelection(AS2NCipherStrengthDD, "All");

		DropDownSelection(AS2NExchCertDD, "qwerty1");
		Thread.sleep(3000);
		DropDownSelection(AS2NSignCertDD, "qwerty2");
		Thread.sleep(3000);
		DropDownSelection(AS2NCaCertDD, "qwerty3");
		Thread.sleep(3000);
		// DropDownSelection(AS2NSSLTypeDD, "Must");

		// DropDownSelection(AS2NPayloadSec, "Plain Text");

		// DropDownSelection(AS2NEncAlgoDD, "Triple DES 168 CBC with PKCS5 padding");

		// DropDownSelection(AS2NSignAlgoDD, "MD5");

		AS2NMDNREquiredY.click();
		Thread.sleep(3000);
		DropDownSelection(AS2NMdnTypeDD, "Synchronous");
		Thread.sleep(1000);
		// DropDownSelection(AS2NMdnEncDD, "MD5");

	//	AS2NReceipt2AddressData.sendKeys("Receipt12as2");

		SubmitClick.click();
	}

	public void ValidateConnectDirectWithValidData(String ProtocolDDValue, String StatusDDValue, String SSP,
			String Secure, String pollingIntervalValue) throws Exception {

		Thread.sleep(3000);
		DropDownSelection(ProtocolDD, ProtocolDDValue);
		Thread.sleep(3000);
		DropDownSelection(StatusDD, StatusDDValue);
		Thread.sleep(3000);
		if (SSP.equalsIgnoreCase("Yes")) {

			CDYClick.click();
			Thread.sleep(3000);

		} else if (SSP.equalsIgnoreCase("No")) {

			CDNClick.click();
			Thread.sleep(3000);
		}

		CDLocalNodeNameData.sendKeys("CDLame" + pn++);
		Thread.sleep(1000);
		CDNodeNameData.sendKeys("CDaAme" + pn++);
		Thread.sleep(1000);
		CDRemoteFileNameData.sendKeys("CDReme" + pn++);
		Thread.sleep(1000);
		CDSNodeIdData.sendKeys("CDame" + pn++);
		Thread.sleep(1000);
		CDSNodePwdData.sendKeys("CDSname" + pn++);
		Thread.sleep(1000);
		CDHostNameData.sendKeys("20.55.8.64");
		Thread.sleep(1000);
		CDPortData.sendKeys("12345");
		CDInDirectoryData.sendKeys("/cd/in");
		Thread.sleep(1000);
		CDInboundPushData.click();
		Thread.sleep(1000);
		// DropDownSelection(CDCheckPointDD, "Select");
		// Thread.sleep(3000);
		CDOutDirectoryData.sendKeys("/cd/out");
		Thread.sleep(1000);
		CDOutboundPullData.click();
		Thread.sleep(1000);
		DropDownSelection(CDOpeartingSystemDD, "Windows"); 
		// CDDcbParamData.sendKeys("Paramdata");
		// CDDSNnameData.sendKeys("dsnname1");
		Thread.sleep(3000);
		// CDUnitData.sendKeys("Unit12");
		// CDStorageClassData.sendKeys("Storage123");
		// CDSpaceData.sendKeys("space12");

		// Thread.sleep(1000);

		// CDCopySisOptsData.sendKeys("copyui");
		// DropDownSelection(CDCompressionDD, "Select");
		// DropDownSelection(CDDepositionDD, "Select");
		// Thread.sleep(1000);
		//CDSubmitData.sendKeys("1234e");
//		Thread.sleep(1000);
//		CDRunjobData.sendKeys("runrun");
//		Thread.sleep(1000);
//		CDRunTaskData.sendKeys("tasktask");
//		Thread.sleep(1000);
		// DropDownSelection(CDSecurityProtocolDD, "Select");
		// Thread.sleep(1000);

		if (Secure.contains("Enable")) {
			
			Thread.sleep(3000);
			DropDownSelection(CDSecureDD, "Enable");
			Thread.sleep(3000);

			DropDownSelection(CDCACertDD, "10021");
			Thread.sleep(3000);
			
			Robot robot = new Robot();
			
			Thread.sleep(3000);
			
			robot.keyPress(KeyEvent.VK_ESCAPE);
			robot.keyPress(KeyEvent.VK_ESCAPE);
			
			Thread.sleep(1000);

			DropDownSelection(CDCipherSuitsDD, "ECDHE_RSA_WITH_AES_128_CBC_SHA");
			Thread.sleep(3000);
			
			robot.keyPress(KeyEvent.VK_ESCAPE);
			robot.keyPress(KeyEvent.VK_ESCAPE);

		} else if (Secure.contains("Disable")) {

			Thread.sleep(3000);
			DropDownSelection(CDSecureDD, "Disable");
			Thread.sleep(3000);
		}

		Thread.sleep(1000);

		DropDownSelection(PollingIntervalDD, pollingIntervalValue);
		Thread.sleep(3000);

		// CDAdapterNameData.sendKeys("CM_CDClientAdapter
		// | CDServrAdapter");
		SubmitClick.click();
	}

	public void ValidateAWSS3WithValidData(String ProtocolDDValue, String StatusDDValue, String pollingIntervalValue)
			throws Exception {

		Thread.sleep(3000);
		DropDownSelection(ProtocolDD, ProtocolDDValue);
		Thread.sleep(4000);
		DropDownSelection(StatusDD, StatusDDValue);
		Thread.sleep(3000);
		AWSS3bucketnamedata.sendKeys("test" + pn++);
		Thread.sleep(1000);
		AWSS3filenamedata.sendKeys("test" + pn++);
		Thread.sleep(1000);
		AWSS3accesskeydata.sendKeys("123" + pn++);
		Thread.sleep(1000);
		AWSS3secretkeydata.sendKeys("569" + pn++);
		Thread.sleep(1000);
		AWSS3inmailboxData.sendKeys("/aws/in");
		Thread.sleep(3000);
		AWSS3inboundpushData.click();
		Thread.sleep(3000);
		AWSS3outboundpullData.click();
		Thread.sleep(3000);
		DropDownSelection(PollingIntervalDD, pollingIntervalValue);
		Thread.sleep(3000);
		SubmitClick.click();
	}

	public void ValidateFileSystemWithValidData(String ProtocolDDValue, String StatusDDValue,
			String pollingIntervalValue) throws Exception {

		Thread.sleep(3000);
		DropDownSelection(ProtocolDD, ProtocolDDValue);
		Thread.sleep(3000);
		DropDownSelection(StatusDD, StatusDDValue);
		Thread.sleep(3000);
		FSUserNameData.sendKeys("FSUser21" + pn++);
		Thread.sleep(1000);
		FSPasswordData.sendKeys("FSPass21" + pn++);
		Thread.sleep(1000);
		FSFileTypeData.sendKeys("FSFile" + pn++);
		Thread.sleep(1000);
		FSInDirData.sendKeys("/fs/in");
		Thread.sleep(1000);
		FSOutDirData.sendKeys("/fs/out");
		Thread.sleep(1000);
		FSDelAfterCollData.click();
		Thread.sleep(1000);
		DropDownSelection(PollingIntervalDD, pollingIntervalValue);
		Thread.sleep(3000);
		// FSAdapNameData.sendKeys("CMFileSystem");

		SubmitClick.click();
	}

	public void ValidateFTPH2PWithValidData(String ProtocolDDValue, String StatusDDValue, String pollingIntervalValue)
			throws Throwable {

		Thread.sleep(3000);
		DropDownSelection(ProtocolDD, ProtocolDDValue);
		Thread.sleep(3000);
		DropDownSelection(StatusDD, StatusDDValue);
		Thread.sleep(3000);

		FTPH2PClick.click();
		Thread.sleep(1000);

		DropDownSelection(FTPConnectionTypeDD, "Active");
		Thread.sleep(3000);
		FTPHostNameData.sendKeys("20.55.8.64");
		FTPPortNoData.sendKeys("10021");
		Thread.sleep(1000);
		FTPUsernameData.sendKeys("FTPUser12" + pn++);
		FTPPwdData.sendKeys("FTPPass123" + pn++);
		Thread.sleep(1000);
		FTPInDirectoryData.sendKeys("/ftp/in");
		FTPOutDirectoryData.sendKeys("/ftp/out");
		Thread.sleep(1000);
		FTPNoofretriesData.sendKeys("10");
		FTPRetryIntervalData.sendKeys("10");
		Thread.sleep(1000);
		FTPDelAfterCollClick.click();
		Thread.sleep(1000);
		FTPRemotefilepattern.sendKeys("Test" + pn++);
		Thread.sleep(3000);
		DropDownSelection(PollingIntervalDD, pollingIntervalValue);
		Thread.sleep(3000);
		// FTPAdapNameData.sendKeys(Keys.chord(Keys.CONTROL, "a"),
		// "CM_FTPClientAdapter");
		SubmitClick.click();
	}

	public void ValidateFTPP2HWithValidData(String ProtocolDDValue, String StatusDDValue, String pollingIntervalValue)
			throws Throwable {
		Thread.sleep(3000);
		DropDownSelection(ProtocolDD, ProtocolDDValue);
		Thread.sleep(3000);
		DropDownSelection(StatusDD, StatusDDValue);
		Thread.sleep(3000);

		FTPP2HClick.click();
		Thread.sleep(1000);

		Thread.sleep(1000);
		FTPUserIdData.sendKeys("FTPUse12" + pn++);
		FTPPwd1Data.sendKeys("FTPPas123" + pn++);
		Thread.sleep(1000);
		FTPInDirData.sendKeys("/ftp/in");
		FTPOutDir.sendKeys("/ftp/out");
		Thread.sleep(1000);
		DropDownSelection(FTPTransferTypeData, "Binary");
		Thread.sleep(3000);
		FTPFileTypeData.sendKeys("filetype" + pn++);
		Thread.sleep(1000);
		FTPMergeuserClick.click();
		Thread.sleep(1000);
		FTPCreateMailboxinSIClick.click();
		Thread.sleep(1000);
		FTPDelAfterColl1Click.click();
		Thread.sleep(3000);
		DropDownSelection(PollingIntervalDD, pollingIntervalValue);
		Thread.sleep(3000);
		// FTPAdapNameData.sendKeys(Keys.chord(Keys.CONTROL, "a"),
		// "CM_FTPServerAdapter");
		
		SubmitClick.click();
	}

	public void ValidateFTPSH2PWithValidData(String ProtocolDDValue, String StatusDDValue, String pollingIntervalValue)
			throws Throwable {

		Thread.sleep(3000);
		DropDownSelection(ProtocolDD, ProtocolDDValue);
		Thread.sleep(3000);
		DropDownSelection(StatusDD, StatusDDValue);
		Thread.sleep(3000);

		FTPSH2PClick.click();
		Thread.sleep(3000);

		DropDownSelection(FTPConnectionTypeDD, "Active");
		Thread.sleep(3000);

		FTPSHostNameData.sendKeys("20.55.8.64");
		FTPSPortNoData.sendKeys("10022");
		Thread.sleep(3000);
		DropDownSelection(FTPSEncryptionStrengthDD, "All");
		Thread.sleep(3000);
		FTPSUsernameData.sendKeys("FTPSname12" + pn++);
		FTPSPwdData.sendKeys("FTPSword123" + pn++);
		Thread.sleep(1000);
		FTPSInDirectoryData.sendKeys("/ftps/in");
		FTPSOutDirectoryData.sendKeys("/ftps/out");
		Thread.sleep(1000);
		FTPSNoofretriesData.sendKeys("10");
		FTPSRetryIntervalData.sendKeys("10");
		Thread.sleep(1000);
		FTPSUseCCC.click();
		Thread.sleep(1000);
		FTPSUseImplicitSSl.click();
		Thread.sleep(1000);
		FTPSDelAfterCollClick.click();
		Thread.sleep(1000);
		FTPSFileTypeData.sendKeys("FTPSFileType" + pn++);
		Thread.sleep(3000);
		DropDownSelection(FTPSCertIdDD, "qwerty3");
		Thread.sleep(3000);
		DropDownSelection(PollingIntervalDD, pollingIntervalValue);
		Thread.sleep(3000);
		// FTPSAdapNameData.sendKeys(Keys.chord(Keys.CONTROL, "a"),
		// "CM_FTPSClientAdapter");
		SubmitClick.click();
	}

	public void ValidateFTPSP2HWithValidData(String ProtocolDDValue, String StatusDDValue, String pollingIntervalValue)
			throws Throwable {
		Thread.sleep(3000);
		DropDownSelection(ProtocolDD, ProtocolDDValue);
		Thread.sleep(3000);
		DropDownSelection(StatusDD, StatusDDValue);
		Thread.sleep(3000);

		FTPSP2HClick.click();
		Thread.sleep(3000);

		Thread.sleep(1000);
		FTPSUserIdData.sendKeys("FTPSUsd12" + pn++);
		FTPSPwd1Data.sendKeys("FTPSPrd123" + pn++);
		Thread.sleep(1000);
		FTPSInDirData.sendKeys("/ftps/in");
		FTPSOutDir.sendKeys("/ftps/out");
		Thread.sleep(1000);
		DropDownSelection(FTPTransferTypeData, "Binary");
		Thread.sleep(3000);
		FTPSFileTypeData.sendKeys("filebanh" + pn++);
		Thread.sleep(1000);
		FTPSMergeuserClick.click();
		Thread.sleep(1000);
		FTPSCreateMailboxinSIClick.click();
		Thread.sleep(1000);
		FTPSDelAfterColl1Click.click();
		Thread.sleep(3000);
		DropDownSelection(PollingIntervalDD, pollingIntervalValue);
		Thread.sleep(3000);
		// FTPSAdapNameData.sendKeys(Keys.chord(Keys.CONTROL, "a"),
		// "CM_FTPS_ServerAdapter");
		Thread.sleep(1000);
		SubmitClick.click();
	}

	/*
	 * public void ValidateFTPSWithHostName(String ProtocolDDValue, String
	 * StatusDDValue, String TransferTypeValue, String FTPSCertIdDDValue, String
	 * pollingIntervalValue) throws Throwable { Thread.sleep(1000);
	 * DropDownSelection(ProtocolDD, ProtocolDDValue); Thread.sleep(1000);
	 * DropDownSelection(StatusDD, StatusDDValue); //
	 * FTPSHostNameData.sendKeys("54.164.65.141");
	 * FTPSPortNoData.sendKeys("7080");
	 * Thread.sleep(1000); DropDownSelection(FTPTTDD, TransferTypeValue);
	 * FTPSUserIDData.sendKeys("FTPSUserID");
	 * FTPSPasswordData.sendKeys("FTPSPassword");
	 * Actionselection(driver, FTPSCreateUserinSIClick);
	 * FTPSInDirData.sendKeys("/FTPSInDir/in");
	 * FTPSOutDirData.sendKeys("/FTPSOutDir/out");
	 * Actionselection(driver, FTPSCreateDirInSIClick);
	 * FTPSFileTypeData.sendKeys("FTPSFileType");
	 * Actionselection(driver, FTPSDelAfterCollClick); Thread.sleep(1000);
	 * DropDownSelection(FTPSCertIdDD, FTPSCertIdDDValue); //
	 * FTPSCertNameData.sendKeys(Keys.chord(Keys.CONTROL,"a"), "FTPSCertName"); //
	 * FTPSUploadCertClick.click(); Thread.sleep(1000);
	 * DropDownSelection(PollingIntervalDD, pollingIntervalValue);
	 * FTPSAdapNameData.sendKeys(Keys.chord(Keys.CONTROL, "a"),
	 * "Pragma_FTPS_ServerAdapter"); // Actionselection(driver, SubmitClick); }
	 * 
	 * public void ValidateFTPSWithPortNumber(String ProtocolDDValue, String
	 * StatusDDValue, String TransferTypeValue, String FTPSCertIdDDValue, String
	 * pollingIntervalValue) throws Throwable { Thread.sleep(1000);
	 * DropDownSelection(ProtocolDD, ProtocolDDValue); Thread.sleep(1000);
	 * DropDownSelection(StatusDD, StatusDDValue);
	 * FTPSHostNameData.sendKeys("54.164.65.141"); //
	 * FTPSPortNoData.sendKeys("7080");
	 * Thread.sleep(1000); DropDownSelection(FTPTTDD, TransferTypeValue);
	 * FTPSUserIDData.sendKeys("FTPSUserID");
	 * FTPSPasswordData.sendKeys("FTPSPassword");
	 * Actionselection(driver, FTPSCreateUserinSIClick);
	 * FTPSInDirData.sendKeys("/FTPSInDir/in");
	 * FTPSOutDirData.sendKeys("/FTPSOutDir/out");
	 * Actionselection(driver, FTPSCreateDirInSIClick);
	 * FTPSFileTypeData.sendKeys("FTPSFileType");
	 * Actionselection(driver, FTPSDelAfterCollClick); Thread.sleep(1000);
	 * DropDownSelection(FTPSCertIdDD, FTPSCertIdDDValue); //
	 * FTPSCertNameData.sendKeys(Keys.chord(Keys.CONTROL,"a"), "FTPSCertName"); //
	 * FTPSUploadCertClick.click(); Thread.sleep(1000);
	 * DropDownSelection(PollingIntervalDD, pollingIntervalValue);
	 * FTPSAdapNameData.sendKeys(Keys.chord(Keys.CONTROL, "a"),
	 * "Pragma_FTPS_ServerAdapter"); // Actionselection(driver, SubmitClick); }
	 * 
	 * public void ValidateFTPSWithUserId(String ProtocolDDValue, String
	 * StatusDDValue, String TransferTypeValue, String FTPSCertIdDDValue, String
	 * pollingIntervalValue) throws Throwable { Thread.sleep(1000);
	 * DropDownSelection(ProtocolDD, ProtocolDDValue); Thread.sleep(1000);
	 * DropDownSelection(StatusDD, StatusDDValue);
	 * FTPSHostNameData.sendKeys("54.164.65.141");
	 * FTPSPortNoData.sendKeys("7080");
	 * Thread.sleep(1000); DropDownSelection(FTPTTDD, TransferTypeValue); //
	 * FTPSUserIDData.sendKeys("FTPSUserID");
	 * FTPSPasswordData.sendKeys("FTPSPassword");
	 * Actionselection(driver, FTPSCreateUserinSIClick);
	 * FTPSInDirData.sendKeys("/FTPSInDir/in");
	 * FTPSOutDirData.sendKeys("/FTPSOutDir/out");
	 * Actionselection(driver, FTPSCreateDirInSIClick);
	 * FTPSFileTypeData.sendKeys("FTPSFileType");
	 * Actionselection(driver, FTPSDelAfterCollClick); Thread.sleep(1000);
	 * DropDownSelection(FTPSCertIdDD, FTPSCertIdDDValue); //
	 * FTPSCertNameData.sendKeys(Keys.chord(Keys.CONTROL,"a"), "FTPSCertName"); //
	 * FTPSUploadCertClick.click(); Thread.sleep(1000);
	 * DropDownSelection(PollingIntervalDD, pollingIntervalValue);
	 * FTPSAdapNameData.sendKeys(Keys.chord(Keys.CONTROL, "a"),
	 * "Pragma_FTPS_ServerAdapter"); // Actionselection(driver, SubmitClick); }
	 * 
	 * public void ValidateFTPSWithPassword(String ProtocolDDValue, String
	 * StatusDDValue, String TransferTypeValue, String FTPSCertIdDDValue, String
	 * pollingIntervalValue) throws Throwable { Thread.sleep(1000);
	 * DropDownSelection(ProtocolDD, ProtocolDDValue); Thread.sleep(1000);
	 * DropDownSelection(StatusDD, StatusDDValue);
	 * FTPSHostNameData.sendKeys("54.164.65.141");
	 * FTPSPortNoData.sendKeys("7080");
	 * Thread.sleep(1000); DropDownSelection(FTPTTDD, TransferTypeValue);
	 * FTPSUserIDData.sendKeys("FTPSUserID"); //
	 * FTPSPasswordData.sendKeys("FTPSPassword");
	 * Actionselection(driver, FTPSCreateUserinSIClick);
	 * FTPSInDirData.sendKeys("/FTPSInDir/in");
	 * FTPSOutDirData.sendKeys("/FTPSOutDir/out");
	 * Actionselection(driver, FTPSCreateDirInSIClick);
	 * FTPSFileTypeData.sendKeys("FTPSFileType");
	 * Actionselection(driver, FTPSDelAfterCollClick); Thread.sleep(1000);
	 * DropDownSelection(FTPSCertIdDD, FTPSCertIdDDValue); //
	 * FTPSCertNameData.sendKeys(Keys.chord(Keys.CONTROL,"a"), "FTPSCertName"); //
	 * FTPSUploadCertClick.click(); Thread.sleep(1000);
	 * DropDownSelection(PollingIntervalDD, pollingIntervalValue);
	 * FTPSAdapNameData.sendKeys(Keys.chord(Keys.CONTROL, "a"),
	 * "Pragma_FTPS_ServerAdapter"); // Actionselection(driver, SubmitClick); }
	 * 
	 * public void ValidateFTPSWithInDirectoty(String ProtocolDDValue, String
	 * StatusDDValue, String TransferTypeValue, String FTPSCertIdDDValue, String
	 * pollingIntervalValue) throws Throwable { Thread.sleep(1000);
	 * DropDownSelection(ProtocolDD, ProtocolDDValue); Thread.sleep(1000);
	 * DropDownSelection(StatusDD, StatusDDValue);
	 * FTPSHostNameData.sendKeys("54.164.65.141");
	 * FTPSPortNoData.sendKeys("7080");
	 * Thread.sleep(1000); DropDownSelection(FTPTTDD, TransferTypeValue);
	 * FTPSUserIDData.sendKeys("FTPSUserID");
	 * FTPSPasswordData.sendKeys("FTPSPassword");
	 * Actionselection(driver, FTPSCreateUserinSIClick); //
	 * FTPSInDirData.sendKeys("/FTPSInDir/in");
	 * FTPSOutDirData.sendKeys("/FTPSOutDir/out");
	 * Actionselection(driver, FTPSCreateDirInSIClick);
	 * FTPSFileTypeData.sendKeys("FTPSFileType");
	 * Actionselection(driver, FTPSDelAfterCollClick); Thread.sleep(1000);
	 * DropDownSelection(FTPSCertIdDD, FTPSCertIdDDValue); //
	 * FTPSCertNameData.sendKeys(Keys.chord(Keys.CONTROL,"a"), "FTPSCertName"); //
	 * FTPSUploadCertClick.click(); Thread.sleep(1000);
	 * DropDownSelection(PollingIntervalDD, pollingIntervalValue);
	 * FTPSAdapNameData.sendKeys(Keys.chord(Keys.CONTROL, "a"),
	 * "Pragma_FTPS_ServerAdapter"); // Actionselection(driver, SubmitClick); }
	 * 
	 * public void ValidateFTPSWithAdapterName(String ProtocolDDValue, String
	 * StatusDDValue, String TransferTypeValue, String FTPSCertIdDDValue, String
	 * pollingIntervalValue) throws Throwable { Thread.sleep(1000);
	 * DropDownSelection(ProtocolDD, ProtocolDDValue); Thread.sleep(1000);
	 * DropDownSelection(StatusDD, StatusDDValue);
	 * FTPSHostNameData.sendKeys("54.164.645.11");
	 * FTPSPortNoData.sendKeys("7080");
	 * Thread.sleep(1000); DropDownSelection(FTPTTDD, TransferTypeValue);
	 * FTPSUserIDData.sendKeys("FTPSUserID");
	 * FTPSPasswordData.sendKeys("FTPSPassword");
	 * Actionselection(driver, FTPSCreateUserinSIClick);
	 * FTPSInDirData.sendKeys("/FTPSInDir/in");
	 * FTPSOutDirData.sendKeys("/FTPSOutDir/out");
	 * Actionselection(driver, FTPSCreateDirInSIClick);
	 * FTPSFileTypeData.sendKeys("FTPSFileType");
	 * Actionselection(driver, FTPSDelAfterCollClick); Thread.sleep(1000);
	 * DropDownSelection(FTPSCertIdDD, FTPSCertIdDDValue); //
	 * FTPSCertNameData.sendKeys(Keys.chord(Keys.CONTROL,"a"), "FTPSCertName"); //
	 * FTPSUploadCertClick.click(); Thread.sleep(1000);
	 * DropDownSelection(PollingIntervalDD, pollingIntervalValue); //
	 * FTPSAdapNameData.sendKeys(//
	 * "Pragma_FTPS_ServerAdapter"); // Actionselection(driver, SubmitClick); }
	 */

	public void ValidateSFTP_H2P_PwdWithValidData(String ProtocolDDValue, String StatusDDValue,
			String pollingIntervalValue) throws Throwable {
		Thread.sleep(3000);
		DropDownSelection(ProtocolDD, ProtocolDDValue);
		Thread.sleep(3000);
		DropDownSelection(StatusDD, StatusDDValue);
		Thread.sleep(3000);

		SFTPH2PClick.click();
		Thread.sleep(1000);

		SFTPHostNameData.sendKeys("20.55.8.64");
		SFTPPortNoData.sendKeys("13939");
		// DropDownSelection(SFTPMacAlgoDD, "Select");

		Thread.sleep(1000);

		SFTPUserNameData.sendKeys("SFTPUsame" + pn++);
		SFTPPasswordData.sendKeys("SFTPPord" + pn++);
		//SFTPCharEncData.sendKeys("SFTPCncc" + pn++);

		Thread.sleep(1000);

		SFTPIndirData.sendKeys("/sftp/in");
		SFTPOutDirData.sendKeys("/sftp/out");
		SFTPCharEncData.sendKeys("100");

		Thread.sleep(1000);

		// DropDownSelection(SFTPCompressionDD, "Select");
		SFTPRetryDelayData.sendKeys("10");
		SFTPConnRetryCountData.sendKeys("10");

		Thread.sleep(1000);

		// DropDownSelection(SFTPPrefCipherDD, "Select");
		DropDownSelection(SFTPAuthTypeDD, "Password");

		Thread.sleep(3000);

		SFTPResponseTimeoutData.sendKeys("10");
		SFTPRemotefilepattern.sendKeys("teest" + pn++);
		Thread.sleep(1000);
		SFTPDelAfterCollClick.click();
		Thread.sleep(1000);

		DropDownSelection(PollingIntervalDD, pollingIntervalValue);
		Thread.sleep(3000);
		// SFTPAdapNameData.sendKeys(Keys.chord(Keys.CONTROL, "a"),
		// "CM_SFTPClientAdapter");
		SubmitClick.click();

	}

	public void ValidateSFTP_H2P_PublickeyWithValidData(String ProtocolDDValue, String StatusDDValue,
			String pollingIntervalValue) throws Throwable {
		Thread.sleep(3000);
		DropDownSelection(ProtocolDD, ProtocolDDValue);
		Thread.sleep(3000);
		DropDownSelection(StatusDD, StatusDDValue);
		Thread.sleep(3000);

		SFTPH2PClick.click();
		Thread.sleep(3000);

		SFTPHostNameData.sendKeys("20.55.8.64");
		SFTPPortNoData.sendKeys("13939");
		// DropDownSelection(SFTPMacAlgoDD, "Select");

		Thread.sleep(1000);

		SFTPUserNameData.sendKeys("SFTPUName" + pn++);
		// SFTPPasswordData.sendKeys("SFTPPassword");
		//SFTPCharEncData.sendKeys("SFTPCharencc");

		Thread.sleep(1000);

		SFTPIndirData.sendKeys("/sftp/in");
		SFTPOutDirData.sendKeys("/sftp/out");
		SFTPCharEncData.sendKeys("100");

		Thread.sleep(1000);

		// DropDownSelection(SFTPCompressionDD, "Select");
		SFTPRetryDelayData.sendKeys("10");
		SFTPConnRetryCountData.sendKeys("10");

		Thread.sleep(1000);

		// DropDownSelection(SFTPPrefCipherDD, "Select");
		DropDownSelection(SFTPAuthTypeDD, "Public Key");

		Thread.sleep(3000);

		DropDownSelection(SFTPUserIdentityKeyDD, "qwerty");
		Thread.sleep(3000);
		DropDownSelection(SFTPKnownHostKeyDD, "qwerty");
		Thread.sleep(3000);

		SFTPResponseTimeoutData.sendKeys("10");
		SFTPRemotefilepattern.sendKeys("testtest" + pn++);
		Thread.sleep(1000);
		SFTPDelAfterCollClick.click();
		Thread.sleep(1000);

		DropDownSelection(PollingIntervalDD, pollingIntervalValue);
		Thread.sleep(3000);
		// SFTPAdapNameData.sendKeys(Keys.chord(Keys.CONTROL, "a"),
		// "CM_SFTPClientAdapter");
		SubmitClick.click();
	}

	public void ValidateSFTP_P2H_PwdWithValidData(String ProtocolDDValue, String StatusDDValue,
			String pollingIntervalValue) throws Throwable {
		Thread.sleep(3000);
		DropDownSelection(ProtocolDD, ProtocolDDValue);
		Thread.sleep(3000);
		DropDownSelection(StatusDD, StatusDDValue);
		Thread.sleep(3000);

		SFTPP2HClick.click();
		Thread.sleep(1000);
		
		FTPSUserIdData.sendKeys("SFTPd12" + pn++);
		FTPSPwd1Data.sendKeys("SFTPPasd123" + pn++);
		Thread.sleep(1000);
		FTPSInDirData.sendKeys("/sftp/in");
		FTPSOutDir.sendKeys("/sftp/in");
		Thread.sleep(1000);
		DropDownSelection(FTPTransferTypeData, "Binary");
		Thread.sleep(3000);
		FTPSFileTypeData.sendKeys("filetanh" + pn++);
		Thread.sleep(1000);
		FTPSMergeuserClick.click();
		Thread.sleep(1000);
		FTPSCreateMailboxinSIClick.click();
		Thread.sleep(1000);
		FTPSDelAfterColl1Click.click();
		Thread.sleep(1000);

		DropDownSelection(SFTPAuthTypeDD, "Password");
		Thread.sleep(3000);
		DropDownSelection(PollingIntervalDD, pollingIntervalValue);
		Thread.sleep(3000);
		//FTPSAdapNameData.sendKeys("CM_SFTPServerAdapter");
		Thread.sleep(1000);
		SubmitClick.click();
	}

	public void ValidateSFTP_P2H_PublickeyWithValidData(String ProtocolDDValue, String StatusDDValue,
			String pollingIntervalValue) throws Throwable {
		Thread.sleep(3000);
		DropDownSelection(ProtocolDD, ProtocolDDValue);
		Thread.sleep(3000);
		DropDownSelection(StatusDD, StatusDDValue);
		Thread.sleep(3000);

		SFTPP2HClick.click();

		Thread.sleep(1000);
		FTPSUserIdData.sendKeys("SFTP12" + pn++);
		// FTPSPwd1Data.sendKeys("SFTPPassword123");
		Thread.sleep(1000);
		FTPSInDirData.sendKeys("/sftp/in");
		FTPSOutDir.sendKeys("/sftp/out");
		Thread.sleep(1000);
		DropDownSelection(FTPTransferTypeData, "Binary");
		FTPSFileTypeData.sendKeys("filetypebanh" + pn++);
		Thread.sleep(1000);
		FTPSMergeuserClick.click();
		FTPSCreateMailboxinSIClick.click();
		FTPSDelAfterColl1Click.click();
		Thread.sleep(1000);

		DropDownSelection(SFTPAuthTypeDD, "Public Key");
		Thread.sleep(3000);

		DropDownSelection(SFTPSSHAuthKeyDD, "SSHKey");
		Thread.sleep(3000);
		
		Robot robot = new Robot();
		
		Thread.sleep(3000);
		
		robot.keyPress(KeyEvent.VK_ESCAPE);
		robot.keyPress(KeyEvent.VK_ESCAPE);

		DropDownSelection(PollingIntervalDD, pollingIntervalValue);
		Thread.sleep(3000);
	//	FTPSAdapNameData.sendKeys("CM_SFTPServerAdapter");
		Thread.sleep(1000);
		SubmitClick.click();
	}

	/*
	 * public void ValidateSFTPWithHostName(String ProtocolDDValue, String
	 * StatusDDValue, String TransferTypeValue, String pollingIntervalValue, String
	 * SFTPHostKeyDDValue) throws Throwable { Thread.sleep(1000);
	 * DropDownSelection(ProtocolDD, ProtocolDDValue); Thread.sleep(1000);
	 * DropDownSelection(StatusDD, StatusDDValue); //
	 * SFTPHostNameData.sendKeys("54.164.65.141");
	 * SFTPPortNoData.sendKeys("7080");
	 * Thread.sleep(1000); DropDownSelection(FTPTTDD, TransferTypeValue);
	 * SFTPUserNameData.sendKeys("SFTPUserName");
	 * SFTPPasswordData.sendKeys("SFTPPassword");
	 * Actionselection(driver, SFTPCreateUserinSIClick);
	 * SFTPIndirData.sendKeys("/SFTPIndir/in");
	 * SFTPOutDirData.sendKeys("/SFTPOutDir/out");
	 * Actionselection(driver, SFTPCreateDirinSI);
	 * SFTPFileTypeData.sendKeys("SFTPFileType");
	 * Actionselection(driver, SFTPDeleteAfterCollectionClick); Thread.sleep(1000);
	 * DropDownSelection(SFTPHostKeyDD, SFTPHostKeyDDValue);
	 * DropDownSelection(PollingIntervalDD, pollingIntervalValue);
	 * SFTPAdapNameData.sendKeys(Keys.chord(Keys.CONTROL, "a"),
	 * "Pragma_SFTPServerAdapter"); // Actionselection(driver, SubmitClick); }
	 * 
	 * public void ValidateSFTPWithPortNumber(String ProtocolDDValue, String
	 * StatusDDValue, String TransferTypeValue, String pollingIntervalValue, String
	 * SFTPHostKeyDDValue) throws Throwable { Thread.sleep(1000);
	 * DropDownSelection(ProtocolDD, ProtocolDDValue); Thread.sleep(1000);
	 * DropDownSelection(StatusDD, StatusDDValue);
	 * SFTPHostNameData.sendKeys("54.164.65.141"); //
	 * SFTPPortNoData.sendKeys("7080");
	 * Thread.sleep(1000); DropDownSelection(FTPTTDD, TransferTypeValue);
	 * SFTPUserNameData.sendKeys("SFTPUserName");
	 * SFTPPasswordData.sendKeys("SFTPPassword");
	 * Actionselection(driver, SFTPCreateUserinSIClick);
	 * SFTPIndirData.sendKeys("/SFTPIndir/in");
	 * SFTPOutDirData.sendKeys("/SFTPOutDir/out");
	 * Actionselection(driver, SFTPCreateDirinSI);
	 * SFTPFileTypeData.sendKeys("SFTPFileType");
	 * Actionselection(driver, SFTPDeleteAfterCollectionClick); Thread.sleep(1000);
	 * DropDownSelection(SFTPHostKeyDD, SFTPHostKeyDDValue);
	 * DropDownSelection(PollingIntervalDD, pollingIntervalValue);
	 * SFTPAdapNameData.sendKeys(Keys.chord(Keys.CONTROL, "a"),
	 * "Pragma_SFTPServerAdapter"); // Actionselection(driver, SubmitClick); }
	 * 
	 * public void ValidateSFTPWithUserId(String ProtocolDDValue, String
	 * StatusDDValue, String TransferTypeValue, String pollingIntervalValue, String
	 * SFTPHostKeyDDValue) throws Throwable { Thread.sleep(1000);
	 * DropDownSelection(ProtocolDD, ProtocolDDValue); Thread.sleep(1000);
	 * DropDownSelection(StatusDD, StatusDDValue);
	 * SFTPHostNameData.sendKeys("54.164.65.141");
	 * SFTPPortNoData.sendKeys("7080");
	 * Thread.sleep(1000); DropDownSelection(FTPTTDD, TransferTypeValue); //
	 * SFTPUserNameData.sendKeys("SFTPUserName");
	 * SFTPPasswordData.sendKeys("SFTPPassword");
	 * Actionselection(driver, SFTPCreateUserinSIClick);
	 * SFTPIndirData.sendKeys("/SFTPIndir/in");
	 * SFTPOutDirData.sendKeys("/SFTPOutDir/out");
	 * Actionselection(driver, SFTPCreateDirinSI);
	 * SFTPFileTypeData.sendKeys("SFTPFileType");
	 * Actionselection(driver, SFTPDeleteAfterCollectionClick); Thread.sleep(1000);
	 * DropDownSelection(SFTPHostKeyDD, SFTPHostKeyDDValue);
	 * DropDownSelection(PollingIntervalDD, pollingIntervalValue);
	 * SFTPAdapNameData.sendKeys(Keys.chord(Keys.CONTROL, "a"),
	 * "Pragma_SFTPServerAdapter"); // Actionselection(driver, SubmitClick); }
	 * 
	 * public void ValidateSFTPWithInDirectory(String ProtocolDDValue, String
	 * StatusDDValue, String TransferTypeValue, String pollingIntervalValue, String
	 * SFTPHostKeyDDValue) throws Throwable { Thread.sleep(1000);
	 * DropDownSelection(ProtocolDD, ProtocolDDValue); Thread.sleep(1000);
	 * DropDownSelection(StatusDD, StatusDDValue);
	 * SFTPHostNameData.sendKeys("54.164.65.141");
	 * SFTPPortNoData.sendKeys("7080");
	 * Thread.sleep(1000); DropDownSelection(FTPTTDD, TransferTypeValue);
	 * SFTPUserNameData.sendKeys("SFTPUserName");
	 * SFTPPasswordData.sendKeys("SFTPPassword");
	 * Actionselection(driver, SFTPCreateUserinSIClick); //
	 * SFTPIndirData.sendKeys("/SFTPIndir/in");
	 * SFTPOutDirData.sendKeys("/SFTPOutDir/out");
	 * Actionselection(driver, SFTPCreateDirinSI);
	 * SFTPFileTypeData.sendKeys("SFTPFileType");
	 * Actionselection(driver, SFTPDeleteAfterCollectionClick); Thread.sleep(1000);
	 * DropDownSelection(SFTPHostKeyDD, SFTPHostKeyDDValue);
	 * DropDownSelection(PollingIntervalDD, pollingIntervalValue);
	 * SFTPAdapNameData.sendKeys(Keys.chord(Keys.CONTROL, "a"),
	 * "Pragma_SFTPServerAdapter"); // Actionselection(driver, SubmitClick); }
	 * 
	 * public void ValidateSFTPWithAdapterName(String ProtocolDDValue, String
	 * StatusDDValue, String TransferTypeValue, String pollingIntervalValue, String
	 * SFTPHostKeyDDValue) throws Throwable { Thread.sleep(1000);
	 * DropDownSelection(ProtocolDD, ProtocolDDValue); Thread.sleep(1000);
	 * DropDownSelection(StatusDD, StatusDDValue);
	 * SFTPHostNameData.sendKeys("54.164.65.141");
	 * SFTPPortNoData.sendKeys("7080");
	 * Thread.sleep(1000); DropDownSelection(FTPTTDD, TransferTypeValue);
	 * SFTPUserNameData.sendKeys("SFTPUserName");
	 * SFTPPasswordData.sendKeys("SFTPPassword");
	 * Actionselection(driver, SFTPCreateUserinSIClick);
	 * SFTPIndirData.sendKeys("/SFTPIndir/in");
	 * SFTPOutDirData.sendKeys("/SFTPOutDir/out");
	 * Actionselection(driver, SFTPCreateDirinSI);
	 * SFTPFileTypeData.sendKeys("SFTPFileType");
	 * Actionselection(driver, SFTPDeleteAfterCollectionClick); Thread.sleep(1000);
	 * DropDownSelection(SFTPHostKeyDD, SFTPHostKeyDDValue);
	 * DropDownSelection(PollingIntervalDD, pollingIntervalValue); //
	 * SFTPAdapNameData.sendKeys(//
	 * "Pragma_SFTPServerAdapter"); // Actionselection(driver, SubmitClick); }
	 */

	public void ValidateHTTPWithValidData(String ProtocolDDValue, String StatusDDValue, String pollingIntervalValue)
			throws Throwable {
		Thread.sleep(1000);
		DropDownSelection(ProtocolDD, ProtocolDDValue);
		Thread.sleep(3000);
		DropDownSelection(StatusDD, StatusDDValue);
		Thread.sleep(1000);

		HTTPMailboxData.sendKeys("/http/in");
		Thread.sleep(1000);
		HTTPOutboundURLData.sendKeys("HTTPOutboundURL");
		Thread.sleep(1000);
		DropDownSelection(PollingIntervalDD, pollingIntervalValue);
		Thread.sleep(3000);
		// HTTPAdapnamedata.sendKeys(Keys.chord(Keys.CONTROL, "a"),
		// "CM_HTTPServerSync");
		SubmitClick.click();
	}

	public void ValidateHTTPSWithValidData(String ProtocolDDValue, String StatusDDValue, String pollingIntervalValue)
			throws Throwable {
		
		Thread.sleep(1000);
		
		DropDownSelection(ProtocolDD, ProtocolDDValue);

		Thread.sleep(3000);

		DropDownSelection(StatusDD, StatusDDValue);
		Thread.sleep(3000);

		HTTPSMailBoxData.sendKeys("/https/in");
		HTTPSOutboundUrlData.sendKeys("HTTPSOutboundUrl");
		DropDownSelection(HTTPSCertIdDD, "qwerty3");
		Thread.sleep(3000);

		DropDownSelection(PollingIntervalDD, pollingIntervalValue);
		Thread.sleep(3000);

		// HTTPSAdapNameData.sendKeys(Keys.chord(Keys.CONTROL, "a"),
		// "CM_HTTPSServerSync");

		SubmitClick.click();
	}

	public void ValidateMailboxWithValidData(String ProtocolDDValue, String StatusDDValue, String pollingIntervalValue)
			throws Throwable {
		
		Thread.sleep(1000);
		DropDownSelection(ProtocolDD, ProtocolDDValue);
		Thread.sleep(3000);

		DropDownSelection(StatusDD, StatusDDValue);
		Thread.sleep(3000);

		MBInMailboxData.sendKeys("/mail/in");

		MBOutMailBoxData.sendKeys("/mail/out");
		Thread.sleep(1000);
		MBCreateMailboxInSIClick.click();
		Thread.sleep(1000);
		MBFileTypeData.sendKeys("filter");

		DropDownSelection(PollingIntervalDD, pollingIntervalValue);
		Thread.sleep(3000);
		SubmitClick.click();
	}

	public void ValidateMQWithValidData(String ProtocolDDValue, String StatusDDValue, String pollingIntervalValue)
			throws Throwable {
		Thread.sleep(1000);
		DropDownSelection(ProtocolDD, ProtocolDDValue);
		Thread.sleep(3000);
		DropDownSelection(StatusDD, StatusDDValue);
		Thread.sleep(3000);
		MQHostNameData.sendKeys("35.169.145.51");
		MQFileTypeData.sendKeys("MQFileType");
		Thread.sleep(1000);
		MQQueueManagerData.sendKeys("MQQueueManager");
		MQQueueNameData.sendKeys("MQQueueName");
		Thread.sleep(1000);
		DropDownSelection(PollingIntervalDD, pollingIntervalValue);
		Thread.sleep(3000);
		//MQAdapNameData.sendKeys("CM_MQAdapter");
		SubmitClick.click();
	}

	public void ValidateMQWithHostName(String ProtocolDDValue, String StatusDDValue, String pollingIntervalValue)
			throws Throwable {
		Thread.sleep(1000);
		DropDownSelection(ProtocolDD, ProtocolDDValue);
		Thread.sleep(1000);
		DropDownSelection(StatusDD, StatusDDValue);
		// MQHostNameData.sendKeys("35.169.145.51");
		MQFileTypeData.sendKeys("MQFileType");
		MQQueueManagerData.sendKeys("MQQueueManager");
		MQQueueNameData.sendKeys("MQQueueName");
		DropDownSelection(PollingIntervalDD, pollingIntervalValue);
		MQAdapNameData.sendKeys("Pragma_MQAdapter");
		// Actionselection(driver, SubmitClick);
	}

	public void ValidateMQWithQueueManager(String ProtocolDDValue, String StatusDDValue, String pollingIntervalValue)
			throws Throwable {
		Thread.sleep(1000);
		DropDownSelection(ProtocolDD, ProtocolDDValue);
		Thread.sleep(1000);
		DropDownSelection(StatusDD, StatusDDValue);
		MQHostNameData.sendKeys("35.169.145.51");
		MQFileTypeData.sendKeys("MQFileType");
		// MQQueueManagerData.sendKeys("MQQueueManager");
		MQQueueNameData.sendKeys("MQQueueName");
		DropDownSelection(PollingIntervalDD, pollingIntervalValue);
		MQAdapNameData.sendKeys("Pragma_MQAdapter");
		// Actionselection(driver, SubmitClick);
	}

	public void ValidateMQWithQueueName(String ProtocolDDValue, String StatusDDValue, String pollingIntervalValue)
			throws Throwable {
		Thread.sleep(1000);
		DropDownSelection(ProtocolDD, ProtocolDDValue);
		Thread.sleep(1000);
		DropDownSelection(StatusDD, StatusDDValue);
		MQHostNameData.sendKeys("35.169.145.51");
		MQFileTypeData.sendKeys("MQFileType");
		MQQueueManagerData.sendKeys("MQQueueManager");
		// MQQueueNameData.sendKeys("MQQueueName");
		DropDownSelection(PollingIntervalDD, pollingIntervalValue);
		MQAdapNameData.sendKeys("Pragma_MQAdapter");
		// Actionselection(driver, SubmitClick);
	}

	public void ValidateMQWithAdapterName(String ProtocolDDValue, String StatusDDValue, String pollingIntervalValue)
			throws Throwable {
		Thread.sleep(1000);
		DropDownSelection(ProtocolDD, ProtocolDDValue);
		Thread.sleep(1000);
		DropDownSelection(StatusDD, StatusDDValue);
		MQHostNameData.sendKeys("35.169.145.51");
		MQFileTypeData.sendKeys("MQFileType");
		MQQueueManagerData.sendKeys("MQQueueManager");
		MQQueueNameData.sendKeys("MQQueueName");
		DropDownSelection(PollingIntervalDD, pollingIntervalValue);
		// MQAdapNameData.sendKeys("Pragma_MQAdapter");
		// Actionselection(driver, SubmitClick);
	}

	public void ValidateMQWithAllMandatoryFields(String ProtocolDDValue, String StatusDDValue,
			String pollingIntervalValue) throws Throwable {
		Thread.sleep(1000);
		DropDownSelection(ProtocolDD, ProtocolDDValue);
		Thread.sleep(1000);
		DropDownSelection(StatusDD, StatusDDValue);
		MQHostNameData.sendKeys("35.169.145.51");
		// MQFileTypeData.sendKeys("MQFileType");
		MQQueueManagerData.sendKeys("MQQueueManager");
		MQQueueNameData.sendKeys("MQQueueName");
		DropDownSelection(PollingIntervalDD, pollingIntervalValue);
		MQAdapNameData.sendKeys("Pragma_MQAdapter");
		// Actionselection(driver, SubmitClick);
	}

	public void ValidateSAPWithValidData(String ProtocolDDValue, String StatusDDValue) throws Throwable {

		Thread.sleep(1000);
		DropDownSelection(ProtocolDD, ProtocolDDValue);
		Thread.sleep(3000);
		DropDownSelection(StatusDD, StatusDDValue);
		Thread.sleep(3000);
		SAPAdapNameData.sendKeys("SAPAdapName");
		SAPRouteData.sendKeys("SAPRoute");
		Thread.sleep(1000);
		SubmitClick.click();
	}

	public void ValidateSAPWithAdapterName(String ProtocolDDValue, String StatusDDValue) throws Throwable {
		Thread.sleep(1000);
		DropDownSelection(ProtocolDD, ProtocolDDValue);
		Thread.sleep(1000);
		DropDownSelection(StatusDD, StatusDDValue);
		// SAPAdapNameData.sendKeys("SAPAdapName");
		SAPRouteData.sendKeys("SAPRoute");
		// Actionselection(driver, SubmitClick);
	}

	public void ValidateSAPWithSAPRoute(String ProtocolDDValue, String StatusDDValue) throws Throwable {
		Thread.sleep(1000);
		DropDownSelection(ProtocolDD, ProtocolDDValue);
		Thread.sleep(1000);
		DropDownSelection(StatusDD, StatusDDValue);
		SAPAdapNameData.sendKeys("SAPAdapName");
		// SAPRouteData.sendKeys("SAPRoute");
		// Actionselection(driver, SubmitClick);
	}

	public void ValidateSMTPWithValidData() throws Throwable {
		DropDownSelection(ProtocolDD, "SMTP");
		SMTPNameData.sendKeys("SMTPName");
		DropDownSelection(SMTPAccessProtocolDD, "IMAP");
		SMTPConnectionRetriesData.sendKeys("SMTPNoOfRetries");
		SMTPUserNameData.sendKeys("SMTPUserName");
		SMTPPasswordData.sendKeys("SMTPPassword");
		SMTPRetryInterval.sendKeys("SMTPRetryIntervalData");
		SMTPMailServerData.sendKeys("SMTPMailServer");
		SMTPMailServerPortData.sendKeys("SMTPMailServerPort");
		SMTPMaxMessages.sendKeys("SMTPMaxMessagesdata");
		DropDownSelection(SMTPRemovieMails, "No");
		SMTPSSLData.sendKeys("SMTPSSL");
		SMTPKeyCertPassPhraseData.sendKeys("SMTPKeyCertPassPhrase");
		SMTPCipherStrengthData.sendKeys("SMTPCipherStrength");
		SMTPKeyCertificateData.sendKeys("SMTPKeyCertificate");
		SMTPCACertificateData.sendKeys("SMTPCACertificate");
		SMTPUrlNamedata.sendKeys("SMTPUrlName");
		DropDownSelection(SMTPPIDD, "1 Minute");
		// Actionselection(driver, SubmitClick);
	}

	public void ValidateSFGFTPH2PWithValidData(String ProtocolDDValue, String StatusDDValue, String ConnTypeDDValue,
			String pollingIntervalValue) throws Throwable {

		DropDownSelection(ProtocolDD, ProtocolDDValue);
		Thread.sleep(1000);
		DropDownSelection(StatusDD, StatusDDValue);
		Thread.sleep(1000);
		Actionselection(driver, SFGFTPHPType);
		DropDownSelection(SFGFTPHPConnType, ConnTypeDDValue);
		SFGFTPHPRemoteHostData.sendKeys("3.220.216.18");
		SFGFTPHPRemotePortData.sendKeys("1080");
		SFGFTPHPUsernameData.sendKeys("Test");
		SFGFTPHPPasswordData.sendKeys("SFGFTPpassword");
		SFGFTPHPInDirData.sendKeys("/in");
		SFGFTPHPOutDirData.sendKeys("/out");
		SFGFTPHPNoOfRetriesData.sendKeys("2");
		SFGFTPHPRetryIntervalData.sendKeys("3");
		Actionselection(driver, SFGFTPHPDelAfterCollClick);
		DropDownSelection(SFGFTPHPPIDD, pollingIntervalValue);
		SFGFTPHPAdapNameData.sendKeys("Pragma_FTPClientAdapter");
		// Actionselection(driver, SubmitClick);
	}

	public void ValidateSFGFTPH2PWithHostName(String ProtocolDDValue, String StatusDDValue, String ConnTypeDDValue,
			String pollingIntervalValue) throws Throwable {

		DropDownSelection(ProtocolDD, ProtocolDDValue);
		Thread.sleep(1000);
		DropDownSelection(StatusDD, StatusDDValue);
		Thread.sleep(1000);
		Actionselection(driver, SFGFTPHPType);
		DropDownSelection(SFGFTPHPConnType, ConnTypeDDValue);
		// SFGFTPHPRemoteHostData.sendKeys(Keys.chord(Keys.CONTROL, "a"),
		// "3.220.216.18");
		SFGFTPHPRemotePortData.sendKeys("1080");
		SFGFTPHPUsernameData.sendKeys("Test");
		SFGFTPHPPasswordData.sendKeys("SFGFTPpassword");
		SFGFTPHPInDirData.sendKeys("/in");
		SFGFTPHPOutDirData.sendKeys("/out");
		SFGFTPHPNoOfRetriesData.sendKeys("2");
		SFGFTPHPRetryIntervalData.sendKeys("3");
		Actionselection(driver, SFGFTPHPDelAfterCollClick);
		DropDownSelection(SFGFTPHPPIDD, pollingIntervalValue);
		SFGFTPHPAdapNameData.sendKeys("Pragma_FTPClientAdapter");
		// Actionselection(driver, SubmitClick);
	}

	public void ValidateSFGFTPH2PWithRemotePortNo(String ProtocolDDValue, String StatusDDValue, String ConnTypeDDValue,
			String pollingIntervalValue) throws Throwable {

		DropDownSelection(ProtocolDD, ProtocolDDValue);
		Thread.sleep(1000);
		DropDownSelection(StatusDD, StatusDDValue);
		Thread.sleep(1000);
		Actionselection(driver, SFGFTPHPType);
		DropDownSelection(SFGFTPHPConnType, ConnTypeDDValue);
		SFGFTPHPRemoteHostData.sendKeys("3.220.216.18");
		// SFGFTPHPRemotePortData.sendKeys("1080");
		SFGFTPHPUsernameData.sendKeys("Test");
		SFGFTPHPPasswordData.sendKeys("SFGFTPpassword");
		SFGFTPHPInDirData.sendKeys("/in");
		SFGFTPHPOutDirData.sendKeys("/out");
		SFGFTPHPNoOfRetriesData.sendKeys("2");
		SFGFTPHPRetryIntervalData.sendKeys("3");
		Actionselection(driver, SFGFTPHPDelAfterCollClick);
		DropDownSelection(SFGFTPHPPIDD, pollingIntervalValue);
		SFGFTPHPAdapNameData.sendKeys("Pragma_FTPClientAdapter");
		// Actionselection(driver, SubmitClick);
	}

	public void ValidateSFGFTPH2PWithUserName(String ProtocolDDValue, String StatusDDValue, String ConnTypeDDValue,
			String pollingIntervalValue) throws Throwable {

		DropDownSelection(ProtocolDD, ProtocolDDValue);
		Thread.sleep(1000);
		DropDownSelection(StatusDD, StatusDDValue);
		Thread.sleep(1000);
		Actionselection(driver, SFGFTPHPType);
		DropDownSelection(SFGFTPHPConnType, ConnTypeDDValue);
		SFGFTPHPRemoteHostData.sendKeys("3.220.216.18");
		SFGFTPHPRemotePortData.sendKeys("1080");
		// SFGFTPHPUsernameData.sendKeys("Test");
		SFGFTPHPPasswordData.sendKeys("SFGFTPpassword");
		SFGFTPHPInDirData.sendKeys("/in");
		SFGFTPHPOutDirData.sendKeys("/out");
		SFGFTPHPNoOfRetriesData.sendKeys("2");
		SFGFTPHPRetryIntervalData.sendKeys("3");
		Actionselection(driver, SFGFTPHPDelAfterCollClick);
		DropDownSelection(SFGFTPHPPIDD, pollingIntervalValue);
		SFGFTPHPAdapNameData.sendKeys("Pragma_FTPClientAdapter");
		// Actionselection(driver, SubmitClick);
	}

	public void ValidateSFGFTPH2PWithPassword(String ProtocolDDValue, String StatusDDValue, String ConnTypeDDValue,
			String pollingIntervalValue) throws Throwable {

		DropDownSelection(ProtocolDD, ProtocolDDValue);
		Thread.sleep(1000);
		DropDownSelection(StatusDD, StatusDDValue);
		Thread.sleep(1000);
		Actionselection(driver, SFGFTPHPType);
		DropDownSelection(SFGFTPHPConnType, ConnTypeDDValue);
		SFGFTPHPRemoteHostData.sendKeys("3.220.216.18");
		SFGFTPHPRemotePortData.sendKeys("1080");
		SFGFTPHPUsernameData.sendKeys("Test");
		// SFGFTPHPPasswordData.sendKeys(Keys.chord(Keys.CONTROL, "a"),
		// "SFGFTPpassword");
		SFGFTPHPInDirData.sendKeys("/in");
		SFGFTPHPOutDirData.sendKeys("/out");
		SFGFTPHPNoOfRetriesData.sendKeys("2");
		SFGFTPHPRetryIntervalData.sendKeys("3");
		Actionselection(driver, SFGFTPHPDelAfterCollClick);
		DropDownSelection(SFGFTPHPPIDD, pollingIntervalValue);
		SFGFTPHPAdapNameData.sendKeys("Pragma_FTPClientAdapter");
		// Actionselection(driver, SubmitClick);
	}

	public void ValidateSFGFTPH2PWithIndirectory(String ProtocolDDValue, String StatusDDValue, String ConnTypeDDValue,
			String pollingIntervalValue) throws Throwable {

		DropDownSelection(ProtocolDD, ProtocolDDValue);
		Thread.sleep(1000);
		DropDownSelection(StatusDD, StatusDDValue);
		Thread.sleep(1000);
		Actionselection(driver, SFGFTPHPType);
		DropDownSelection(SFGFTPHPConnType, ConnTypeDDValue);
		SFGFTPHPRemoteHostData.sendKeys("3.220.216.18");
		SFGFTPHPRemotePortData.sendKeys("1080");
		SFGFTPHPUsernameData.sendKeys("Test");
		SFGFTPHPPasswordData.sendKeys("SFGFTPpassword");
		// SFGFTPHPInDirData.sendKeys("/in");
		SFGFTPHPOutDirData.sendKeys("/out");
		SFGFTPHPNoOfRetriesData.sendKeys("2");
		SFGFTPHPRetryIntervalData.sendKeys("3");
		Actionselection(driver, SFGFTPHPDelAfterCollClick);
		DropDownSelection(SFGFTPHPPIDD, pollingIntervalValue);
		SFGFTPHPAdapNameData.sendKeys("Pragma_FTPClientAdapter");
		// Actionselection(driver, SubmitClick);
	}

	public void ValidateSFGFTPH2PWithNoOfRetries(String ProtocolDDValue, String StatusDDValue, String ConnTypeDDValue,
			String pollingIntervalValue) throws Throwable {

		DropDownSelection(ProtocolDD, ProtocolDDValue);
		Thread.sleep(1000);
		DropDownSelection(StatusDD, StatusDDValue);
		Thread.sleep(1000);
		Actionselection(driver, SFGFTPHPType);
		DropDownSelection(SFGFTPHPConnType, ConnTypeDDValue);
		SFGFTPHPRemoteHostData.sendKeys("3.220.216.18");
		SFGFTPHPRemotePortData.sendKeys("1080");
		SFGFTPHPUsernameData.sendKeys("Test");
		SFGFTPHPPasswordData.sendKeys("SFGFTPpassword");
		SFGFTPHPInDirData.sendKeys("/in");
		SFGFTPHPOutDirData.sendKeys("/out");
		// SFGFTPHPNoOfRetriesData.sendKeys("2");
		SFGFTPHPRetryIntervalData.sendKeys("3");
		Actionselection(driver, SFGFTPHPDelAfterCollClick);
		DropDownSelection(SFGFTPHPPIDD, pollingIntervalValue);
		SFGFTPHPAdapNameData.sendKeys("Pragma_FTPClientAdapter");
		// Actionselection(driver, SubmitClick);
	}

	public void ValidateSFGFTPH2PWithRetryInterval(String ProtocolDDValue, String StatusDDValue, String ConnTypeDDValue,
			String pollingIntervalValue) throws Throwable {

		DropDownSelection(ProtocolDD, ProtocolDDValue);
		Thread.sleep(1000);
		DropDownSelection(StatusDD, StatusDDValue);
		Thread.sleep(1000);
		Actionselection(driver, SFGFTPHPType);
		DropDownSelection(SFGFTPHPConnType, ConnTypeDDValue);
		SFGFTPHPRemoteHostData.sendKeys("3.220.216.18");
		SFGFTPHPRemotePortData.sendKeys("1080");
		SFGFTPHPUsernameData.sendKeys("Test");
		SFGFTPHPPasswordData.sendKeys("SFGFTPpassword");
		SFGFTPHPInDirData.sendKeys("/in");
		SFGFTPHPOutDirData.sendKeys("/out");
		SFGFTPHPNoOfRetriesData.sendKeys("2");
		// SFGFTPHPRetryIntervalData.sendKeys("3");
		Actionselection(driver, SFGFTPHPDelAfterCollClick);
		DropDownSelection(SFGFTPHPPIDD, pollingIntervalValue);
		SFGFTPHPAdapNameData.sendKeys("Pragma_FTPClientAdapter");
		// Actionselection(driver, SubmitClick);
	}

	public void ValidateSFGFTPH2PWithAdapterName(String ProtocolDDValue, String StatusDDValue, String ConnTypeDDValue,
			String pollingIntervalValue) throws Throwable {

		DropDownSelection(ProtocolDD, ProtocolDDValue);
		Thread.sleep(1000);
		DropDownSelection(StatusDD, StatusDDValue);
		Thread.sleep(1000);
		Actionselection(driver, SFGFTPHPType);
		DropDownSelection(SFGFTPHPConnType, ConnTypeDDValue);
		SFGFTPHPRemoteHostData.sendKeys("3.220.216.18");
		SFGFTPHPRemotePortData.sendKeys("1080");
		SFGFTPHPUsernameData.sendKeys("Test");
		SFGFTPHPPasswordData.sendKeys("SFGFTPpassword");
		SFGFTPHPInDirData.sendKeys("/in");
		SFGFTPHPOutDirData.sendKeys("/out");
		SFGFTPHPNoOfRetriesData.sendKeys("2");
		SFGFTPHPRetryIntervalData.sendKeys("3");
		Actionselection(driver, SFGFTPHPDelAfterCollClick);
		DropDownSelection(SFGFTPHPPIDD, pollingIntervalValue);
		// SFGFTPHPAdapNameData.sendKeys(Keys.chord(Keys.CONTROL, "a"),
		// "Pragma_FTPClientAdapter");
		// Actionselection(driver, SubmitClick);
	}

	public void ValidateSFGFTPH2PWithAllMandatoryFields(String ProtocolDDValue, String StatusDDValue,
			String ConnTypeDDValue, String pollingIntervalValue) throws Throwable {

		DropDownSelection(ProtocolDD, ProtocolDDValue);
		Thread.sleep(1000);
		DropDownSelection(StatusDD, StatusDDValue);
		Thread.sleep(1000);
		Actionselection(driver, SFGFTPHPType);
		DropDownSelection(SFGFTPHPConnType, ConnTypeDDValue);
		SFGFTPHPRemoteHostData.sendKeys("3.220.216.18");
		SFGFTPHPRemotePortData.sendKeys("1080");
		SFGFTPHPUsernameData.sendKeys("Test");
		SFGFTPHPPasswordData.sendKeys("SFGFTPpassword");
		SFGFTPHPInDirData.sendKeys("/in");
		// SFGFTPHPOutDirData.sendKeys("/out");
		SFGFTPHPNoOfRetriesData.sendKeys("2");
		SFGFTPHPRetryIntervalData.sendKeys("3");
		// Actionselection(driver, SFGFTPHPDelAfterCollClick);
		DropDownSelection(SFGFTPHPPIDD, pollingIntervalValue);
		SFGFTPHPAdapNameData.sendKeys("Pragma_FTPClientAdapter");
		// Actionselection(driver, SubmitClick);
	}

	/*
	 * public void ValidateSFGFTPP2HWithValidData(String ProtocolDDValue, String
	 * StatusDDValue, String TransferTypeValue, String pollingIntervalValue) throws
	 * Throwable { Thread.sleep(1000); DropDownSelection(ProtocolDD,
	 * ProtocolDDValue); Thread.sleep(1000); DropDownSelection(StatusDD,
	 * StatusDDValue); Thread.sleep(1000); Actionselection(driver, SFGFTPPHType);
	 * SFGFTPPHUserIDData.sendKeys("Test123");
	 * SFGFTPPHPasswordData.sendKeys(Keys.chord(Keys.CONTROL, "a"),
	 * "SFGFTPPHpassword"); DropDownSelection(FTPTTDD, TransferTypeValue);
	 * SFGFTPPHIndirData.sendKeys("/in");
	 * SFGFTPPHOutDirData.sendKeys("/out");
	 * Actionselection(driver, SFGFTPPHMailboxinSIClick);
	 * SFGFTPPHFileType.sendKeys("*");
	 * Actionselection(driver, SFGFTPPHDelAfterCollClick);
	 * DropDownSelection(PollingIntervalDD, pollingIntervalValue);
	 * SFGFTPPHAdapNameData.sendKeys(Keys.chord(Keys.CONTROL, "a"),
	 * "PragmaFTPServerAdapter"); // Actionselection(driver, SubmitClick); }
	 * 
	 * public void ValidateSFGFTPP2HWithUserId(String ProtocolDDValue, String
	 * StatusDDValue, String TransferTypeValue, String pollingIntervalValue) throws
	 * Throwable { Thread.sleep(1000); DropDownSelection(ProtocolDD,
	 * ProtocolDDValue); Thread.sleep(1000); DropDownSelection(StatusDD,
	 * StatusDDValue); Thread.sleep(1000); Actionselection(driver, SFGFTPPHType); //
	 * SFGFTPPHUserIDData.sendKeys("Test123");
	 * SFGFTPPHPasswordData.sendKeys(Keys.chord(Keys.CONTROL, "a"),
	 * "SFGFTPPHpassword"); DropDownSelection(FTPTTDD, TransferTypeValue);
	 * SFGFTPPHIndirData.sendKeys("/in");
	 * SFGFTPPHOutDirData.sendKeys("/out");
	 * Actionselection(driver, SFGFTPPHMailboxinSIClick);
	 * SFGFTPPHFileType.sendKeys("*");
	 * Actionselection(driver, SFGFTPPHDelAfterCollClick);
	 * DropDownSelection(PollingIntervalDD, pollingIntervalValue);
	 * SFGFTPPHAdapNameData.sendKeys(Keys.chord(Keys.CONTROL, "a"),
	 * "PragmaFTPServerAdapter"); // Actionselection(driver, SubmitClick); }
	 * 
	 * public void ValidateSFGFTPP2HWithPassword(String ProtocolDDValue, String
	 * StatusDDValue, String TransferTypeValue, String pollingIntervalValue) throws
	 * Throwable { Thread.sleep(1000); DropDownSelection(ProtocolDD,
	 * ProtocolDDValue); Thread.sleep(1000); DropDownSelection(StatusDD,
	 * StatusDDValue); Thread.sleep(1000); Actionselection(driver, SFGFTPPHType);
	 * SFGFTPPHUserIDData.sendKeys("Test123"); //
	 * SFGFTPPHPasswordData.sendKeys(//
	 * "SFGFTPPHpassword"); DropDownSelection(FTPTTDD, TransferTypeValue);
	 * SFGFTPPHIndirData.sendKeys("/in");
	 * SFGFTPPHOutDirData.sendKeys("/out");
	 * Actionselection(driver, SFGFTPPHMailboxinSIClick);
	 * SFGFTPPHFileType.sendKeys("*");
	 * Actionselection(driver, SFGFTPPHDelAfterCollClick);
	 * DropDownSelection(PollingIntervalDD, pollingIntervalValue);
	 * SFGFTPPHAdapNameData.sendKeys(Keys.chord(Keys.CONTROL, "a"),
	 * "PragmaFTPServerAdapter"); // Actionselection(driver, SubmitClick); }
	 * 
	 * public void ValidateSFGFTPP2HWithIndirectory(String ProtocolDDValue, String
	 * StatusDDValue, String TransferTypeValue, String pollingIntervalValue) throws
	 * Throwable { Thread.sleep(1000); DropDownSelection(ProtocolDD,
	 * ProtocolDDValue); Thread.sleep(1000); DropDownSelection(StatusDD,
	 * StatusDDValue); Thread.sleep(1000); Actionselection(driver, SFGFTPPHType);
	 * SFGFTPPHUserIDData.sendKeys("Test123");
	 * SFGFTPPHPasswordData.sendKeys(Keys.chord(Keys.CONTROL,
	 * "a"),"SFGFTPPHpassword"); DropDownSelection(FTPTTDD, TransferTypeValue);
	 * //SFGFTPPHIndirData.sendKeys("/in");
	 * SFGFTPPHOutDirData.sendKeys("/out");
	 * Actionselection(driver, SFGFTPPHMailboxinSIClick);
	 * SFGFTPPHFileType.sendKeys("*");
	 * Actionselection(driver, SFGFTPPHDelAfterCollClick);
	 * DropDownSelection(PollingIntervalDD, pollingIntervalValue);
	 * SFGFTPPHAdapNameData.sendKeys(Keys.chord(Keys.CONTROL, "a"),
	 * "PragmaFTPServerAdapter"); // Actionselection(driver, SubmitClick); } public
	 * void ValidateSFGFTPP2HWithAdapterName(String ProtocolDDValue, String
	 * StatusDDValue, String TransferTypeValue, String pollingIntervalValue) throws
	 * Throwable { Thread.sleep(1000); DropDownSelection(ProtocolDD,
	 * ProtocolDDValue); Thread.sleep(1000); DropDownSelection(StatusDD,
	 * StatusDDValue); Thread.sleep(1000); Actionselection(driver, SFGFTPPHType);
	 * SFGFTPPHUserIDData.sendKeys("Test123");
	 * SFGFTPPHPasswordData.sendKeys(Keys.chord(Keys.CONTROL,
	 * "a"),"SFGFTPPHpassword"); DropDownSelection(FTPTTDD, TransferTypeValue);
	 * SFGFTPPHIndirData.sendKeys("/in");
	 * SFGFTPPHOutDirData.sendKeys("/out");
	 * Actionselection(driver, SFGFTPPHMailboxinSIClick);
	 * SFGFTPPHFileType.sendKeys("*");
	 * Actionselection(driver, SFGFTPPHDelAfterCollClick);
	 * DropDownSelection(PollingIntervalDD, pollingIntervalValue);
	 * //SFGFTPPHAdapNameData.sendKeys(Keys.chord(Keys.CONTROL, "a"),
	 * "PragmaFTPServerAdapter"); // Actionselection(driver, SubmitClick); } public
	 * void ValidateSFGFTPP2HWithAllMandatoryFields(String ProtocolDDValue, String
	 * StatusDDValue, String TransferTypeValue, String pollingIntervalValue) throws
	 * Throwable { Thread.sleep(1000); DropDownSelection(ProtocolDD,
	 * ProtocolDDValue); Thread.sleep(1000); DropDownSelection(StatusDD,
	 * StatusDDValue); Thread.sleep(1000); Actionselection(driver, SFGFTPPHType);
	 * SFGFTPPHUserIDData.sendKeys("Test123");
	 * SFGFTPPHPasswordData.sendKeys(Keys.chord(Keys.CONTROL,
	 * "a"),"SFGFTPPHpassword"); DropDownSelection(FTPTTDD, TransferTypeValue);
	 * SFGFTPPHIndirData.sendKeys("/in");
	 * //SFGFTPPHOutDirData.sendKeys("/out");
	 * //Actionselection(driver, SFGFTPPHMailboxinSIClick);
	 * //SFGFTPPHFileType.sendKeys("*");
	 * //Actionselection(driver, SFGFTPPHDelAfterCollClick);
	 * DropDownSelection(PollingIntervalDD, pollingIntervalValue);
	 * SFGFTPPHAdapNameData.sendKeys(Keys.chord(Keys.CONTROL, "a"),
	 * "PragmaFTPServerAdapter"); // Actionselection(driver, SubmitClick); }
	 * 
	 * public void ValidateSFGFTPP2HWithNonMandatoryFields(String ProtocolDDValue)
	 * throws Throwable { Thread.sleep(1000); DropDownSelection(ProtocolDD,
	 * ProtocolDDValue); Thread.sleep(1000); Actionselection(driver, SFGFTPPHType);
	 * //SFGFTPPHUserIDData.sendKeys("Test123");
	 * //SFGFTPPHPasswordData.sendKeys(Keys.chord(Keys.CONTROL,
	 * "a"),"SFGFTPPHpassword"); //DropDownSelection(FTPTTDD, TransferTypeValue);
	 * //SFGFTPPHIndirData.sendKeys("/in");
	 * SFGFTPPHOutDirData.sendKeys("/out");
	 * Actionselection(driver, SFGFTPPHMailboxinSIClick);
	 * SFGFTPPHFileType.sendKeys("*");
	 * Actionselection(driver, SFGFTPPHDelAfterCollClick);
	 * //DropDownSelection(PollingIntervalDD, pollingIntervalValue);
	 * //SFGFTPPHAdapNameData.sendKeys(Keys.chord(Keys.CONTROL, "a"),
	 * "PragmaFTPServerAdapter"); // Actionselection(driver, SubmitClick); } public
	 * void ValidateSFGFTPSH2PWithValidData() throws Throwable { int l = 0;
	 * DropDownSelection(ProtocolDD, "SFGFTPS"); DropDownSelection(SFGFTPSType,
	 * "HubConnectToPartner"); DropDownSelection(SFGFTPSHPConnTypeDD, "Active");
	 * SFGFTPSHPRemoteHostData.sendKeys("1080");
	 * SFGFTPSHPRemotePortData.sendKeys("1080");
	 * DropDownSelection(SFGFTPSHPEncStrengthDD, "Strong");
	 * SFGFTPSHPUsernameData.sendKeys("Test1" + l++);
	 * SFGFTPSHPPasswordData.sendKeys(Keys.chord(Keys.CONTROL, "a"),
	 * "SFGFTPSpassword"); SFGFTPSHPInDirData.sendKeys(Keys.chord(Keys.CONTROL,
	 * "a"), "/in"); SFGFTPSHPOutDirData.sendKeys(Keys.chord(Keys.CONTROL, "a"),
	 * "/out"); Actionselection(driver, SFGFTPSHPCCCClick);
	 * SFGFTPSHPNoOfRetriesData.sendKeys("2");
	 * SFGFTPSHPRetryIntervalData.sendKeys("3");
	 * Actionselection(driver, SFGFTPSHPImplicitSSLClick); Actionselection(driver,
	 * SFGFTPSHPDelAfterCollClick); DropDownSelection(SFGFTPSHPCertIdDD,
	 * "AS2_TrDemo"); // SFGFTPSHPUploadCert.sendKeys("E:\\Test_Testing (2).cer");
	 * // Runtime.getRuntime().exec(
	 * "C:\\Users\\Vishal.thogiti\\Documents\\AutoITcode\\ImportFile.exe"); //
	 * SFGFTPSHPCertNameData.sendKeys(//
	 * "CertificateNAme"); Actionselection(driver, SFGFTPSHPUploadCertClick);
	 * DropDownSelection(SFGFTPSHPPIDD, "1 Minute");
	 * SFGFTPSHPAdapterNameData.sendKeys(Keys.chord(Keys.CONTROL, "a"),
	 * "Pragma_FTPClientAdapter"); // Thread.sleep(3000); // Actionselection(driver,
	 * SubmitClick); Thread.sleep(3000); }
	 * 
	 * public void ValidateSFGFTPSP2HWithValidData() throws Throwable {
	 * DropDownSelection(ProtocolDD, "SFGFTPS"); DropDownSelection(SFGFTPSType,
	 * "PartnerConnectToHub"); SFGFTPSPHUserIDData.sendKeys(Keys.chord(Keys.CONTROL,
	 * "a"), "Test123"); SFGFTPSPHPasswordData.sendKeys(Keys.chord(Keys.CONTROL,
	 * "a"), "SFGFTPPHpassword"); DropDownSelection(SFGFTPSPHTransferTypeDD,
	 * "Binary"); SFGFTPSPHInDirData.sendKeys("/in");
	 * SFGFTPSPHOutDirData.sendKeys("/out");
	 * Actionselection(driver, SFGFTPSPHMailboxinSIClick);
	 * SFGFTPSPHFileTypeData.sendKeys("Filetype");
	 * Actionselection(driver, SFGFTPSPHDelAfterCollClick);
	 * DropDownSelection(SFGFTPSPHPIDD, "1 Minute");
	 * SFGFTPSPHAdapNameData.sendKeys(Keys.chord(Keys.CONTROL, "a"),
	 * "Pragma_FTPS_ServerAdapter"); // Actionselection(driver, SubmitClick); }
	 * 
	 * public void ValidateSFGSFTPH2PWithValidData() throws Throwable {
	 * DropDownSelection(ProtocolDD, "SFGSFTP"); DropDownSelection(SFGSFTPHPTypeDD,
	 * "HubConnectToPartner");
	 * SFGSFTPHPRemoteHostData.sendKeys(Keys.chord(Keys.CONTROL, "a"),
	 * "35.174.165.78"); SFGSFTPHPRemotePortData.sendKeys(Keys.chord(Keys.CONTROL,
	 * "a"), "1080"); DropDownSelection(SFGSFTPHPAlgorithmDD, "HMAC-MD5");
	 * SFGSFTPHPRemoteUSerData.sendKeys(Keys.chord(Keys.CONTROL, "a"),
	 * "RemoteUSer"); SFGSFTPHPSSHPasswordData.sendKeys(Keys.chord(Keys.CONTROL,
	 * "a"), "SSHPassword");
	 * SFGSFTPHPCharEncodingData.sendKeys(Keys.chord(Keys.CONTROL, "a"),
	 * "CharEncoding"); SFGSFTPHPIndirData.sendKeys(Keys.chord(Keys.CONTROL, "a"),
	 * "/in/in"); SFGSFTPHPOutDirData.sendKeys(Keys.chord(Keys.CONTROL, "a"),
	 * "/out/out"); SFGSFTPHPLocalPortRangeData.sendKeys(Keys.chord(Keys.CONTROL,
	 * "a"), "LocalPortRange"); DropDownSelection(SFGSFTPHPCompDD, "ZLIB");
	 * SFGSFTPHPRetryDelayData.sendKeys("2");
	 * SFGSFTPHPConnRetryCountDelayData.sendKeys(Keys.chord(Keys.CONTROL, "a"),
	 * "2"); DropDownSelection(SFGSFTPHPPreCipherDD, "AES128-CTR");
	 * DropDownSelection(SFGSFTPHPAuthTypeDD, "Public Key");
	 * SFGSFTPHPRespTimeOutData.sendKeys("3");
	 * SFGSFTPHPRemoteFilePatternData.sendKeys(Keys.chord(Keys.CONTROL, "a"),
	 * "HPRemoteFilePattern"); Actionselection(driver, SFGSFTPHPDelAfterCollClick);
	 * DropDownSelection(SFGSFTPHPUserIdKeyDD, "sftp_pragma_he"); //
	 * SFGSFTPHPUploadCert.sendKeys("E:\\Test_Testing (2).cer"); //
	 * Runtime.getRuntime().exec(
	 * "C:\\Users\\Vishal.thogiti\\Documents\\AutoITcode\\ImportFile.exe");
	 * SFGSFTPHPUserKeyNameData.sendKeys("Keyname");
	 * Actionselection(driver, SFGSFTPHPUploadCertClick);
	 * DropDownSelection(SFGSFTPHPKnownHostKeyDD, "Knownhost"); //
	 * SFGSFTPHPUploadCert.sendKeys("E:\\Test_Testing (2).cer"); //
	 * Runtime.getRuntime().exec(
	 * "C:\\Users\\Vishal.thogiti\\Documents\\AutoITcode\\ImportFile.exe");
	 * SFGSFTPHPKnownHostNameData.sendKeys(Keys.chord(Keys.CONTROL, "a"),
	 * "HostKeyname"); Actionselection(driver, SFGSFTPHPUploadCertClick);
	 * DropDownSelection(SFGSFTPHPPIDD, "1 Minute");
	 * SFGSFTPHPAdapNameData.sendKeys(Keys.chord(Keys.CONTROL, "a"),
	 * "Pragma_SFTPClientAdapter"); // Actionselection(driver, SubmitClick); }
	 * 
	 * public void ValidateSFGSFTPP2HWithValidData() throws Throwable {
	 * DropDownSelection(ProtocolDD, "SFGSFTP"); DropDownSelection(SFGSFTPHPTypeDD,
	 * "PartnerConnectToHub"); SFGSFTPPHUserIDData.sendKeys(Keys.chord(Keys.CONTROL,
	 * "a"), "Test123"); SFGSFTPPHPasswordData.sendKeys(Keys.chord(Keys.CONTROL,
	 * "a"), "SFGFTPPHpassword"); DropDownSelection(SFGSFTPPHTransferType,
	 * "Binary"); SFGSFTPPHIndirData.sendKeys("/in");
	 * SFGSFTPPHOutDirData.sendKeys("/out");
	 * Actionselection(driver, SFGSFTPPHDirinSIClick);
	 * SFGSFTPPHFileTypeData.sendKeys("Filetype");
	 * Actionselection(driver, SFGSFTPPHDelAfterCollClick);
	 * DropDownSelection(SFGSFTPPHPIDD, "1 Minute");
	 * SFGSFTPPHAdapterNameData.sendKeys(Keys.chord(Keys.CONTROL, "a"),
	 * "Pragma_SFTPServerAdapter"); // Actionselection(driver, SubmitClick); }
	 */

	public void ValidateOracleEBSWithValidData() throws Throwable {
		DropDownSelection(ProtocolDD, "OracleEBS");
		OracleNameData.sendKeys("OracleEBSName");
		OraclePartnerData.sendKeys("OraclePartner");
		DropDownSelection(OracleinsertDateDD, "No");
		OracleTimeOutData.sendKeys("OracleTimeout");
		OracleBPMessagesData.sendKeys("OracleBPMessage");
		OracleBPBodsData.sendKeys("OracleBPbods");
		DropDownSelection(OracleSendMessagesDD, "False");
		OracleNameOfBODData.sendKeys("OracleNameofBOD");
		OracleDirectoryOfBODData.sendKeys("OracleDirectoryofBOD");
		OracleUsernameData.sendKeys("OracleUsername");
		OraclePasswordData.sendKeys("OraclePassword");
		OracleHttpEndPointData.sendKeys("OracleHttpEndPoint");
		DropDownSelection(OracleReqTypeDD, "AUTH2");
		DropDownSelection(OracleProtocolDD, "HTTPS");
		// Actionselection(driver, SubmitClick);
	}

	public void ValidateWebServicesWithValidData(String ProtocolDDValue, String StatusDDValue,
			String pollingIntervalValue) throws Throwable {

		Thread.sleep(1000);
		DropDownSelection(ProtocolDD, ProtocolDDValue);
		Thread.sleep(3000);
		DropDownSelection(StatusDD, StatusDDValue);
		Thread.sleep(3000);

		WSNameData.sendKeys("WSName");

		WSOutboundURLData.sendKeys("/out");

		WSMailbox.sendKeys("/in");

		DropDownSelection(WSCertIdDD, "qwerty3");

		Thread.sleep(3000);

		DropDownSelection(WSPIDD, pollingIntervalValue);
		Thread.sleep(3000);

		// WSAdapName.sendKeys("CM_HTTPSServerSync");

		SubmitClick.click();
	}

	public void ValidateWebServicesWithName(String ProtocolDDValue, String StatusDDValue, String pollingIntervalValue,
			String CertIdDDValue) throws Throwable {
		// DropDownSelection(ProtocolDD, "Webservice");
		Thread.sleep(1000);
		DropDownSelection(ProtocolDD, ProtocolDDValue);
		Thread.sleep(1000);
		DropDownSelection(StatusDD, StatusDDValue);
		// WSNameData.sendKeys("WSName");
		WSOutboundURLData.sendKeys("//WSOutboundUrl");
		WSMailbox.sendKeys("/WSInMailBox");
		// DropDownSelection(WSCertIdDD, "pragmaedge_KMT");
		// DropDownSelection(WSPIDD, "1 Minute");
		DropDownSelection(WSCertIdDD, CertIdDDValue);
		Thread.sleep(1000);
		DropDownSelection(WSPIDD, pollingIntervalValue);
		WSAdapName.sendKeys("WSAdaptordata");
		// Actionselection(driver, SubmitClick);
	}

	public void ValidateWebServicesWithWebmailbox(String ProtocolDDValue, String StatusDDValue,
			String pollingIntervalValue, String CertIdDDValue) throws Throwable {
		// DropDownSelection(ProtocolDD, "Webservice");
		Thread.sleep(1000);
		DropDownSelection(ProtocolDD, ProtocolDDValue);
		Thread.sleep(1000);
		DropDownSelection(StatusDD, StatusDDValue);
		WSNameData.sendKeys("WSName");
		WSOutboundURLData.sendKeys("//WSOutboundUrl");
		// WSMailbox.sendKeys("WSInMailBox");
		// DropDownSelection(WSCertIdDD, "pragmaedge_KMT");
		// DropDownSelection(WSPIDD, "1 Minute");
		DropDownSelection(WSCertIdDD, CertIdDDValue);
		Thread.sleep(1000);
		DropDownSelection(WSPIDD, pollingIntervalValue);
		WSAdapName.sendKeys("WSAdaptordata");
		// Actionselection(driver, SubmitClick);
	}

	public void ValidateWebServicesWithAdapterName(String ProtocolDDValue, String StatusDDValue,
			String pollingIntervalValue, String CertIdDDValue) throws Throwable {
		// DropDownSelection(ProtocolDD, "Webservice");
		Thread.sleep(1000);
		DropDownSelection(ProtocolDD, ProtocolDDValue);
		Thread.sleep(1000);
		DropDownSelection(StatusDD, StatusDDValue);
		WSNameData.sendKeys("WSName");
		WSOutboundURLData.sendKeys("//WSOutboundUrl");
		WSMailbox.sendKeys("/WSInMailBox");
		// DropDownSelection(WSCertIdDD, "pragmaedge_KMT");
		// DropDownSelection(WSPIDD, "1 Minute");
		DropDownSelection(WSCertIdDD, CertIdDDValue);
		Thread.sleep(1000);
		DropDownSelection(WSPIDD, pollingIntervalValue);
		// WSAdapName.sendKeys("WSAdaptordata");
		// Actionselection(driver, SubmitClick);
	}

	public void ValidateWebServicesWithAllMandatoryFields(String ProtocolDDValue, String StatusDDValue,
			String pollingIntervalValue, String CertIdDDValue) throws Throwable {
		// DropDownSelection(ProtocolDD, "Webservice");
		Thread.sleep(1000);
		DropDownSelection(ProtocolDD, ProtocolDDValue);
		Thread.sleep(1000);
		DropDownSelection(StatusDD, StatusDDValue);
		WSNameData.sendKeys("WSName");
		// WSOutboundURLData.sendKeys("WSOutboundUrl");
		WSMailbox.sendKeys("/WSInMailBox");
		// DropDownSelection(WSCertIdDD, "pragmaedge_KMT");
		// DropDownSelection(WSPIDD, "1 Minute");
		DropDownSelection(WSCertIdDD, CertIdDDValue);
		Thread.sleep(1000);
		DropDownSelection(WSPIDD, pollingIntervalValue);
		WSAdapName.sendKeys("WSAdaptordata");
		// Actionselection(driver, SubmitClick);
	}

	public void ValidateWebServicesWithNonMandatoryFields(String ProtocolDDValue, String StatusDDValue)
			throws Throwable {
		// DropDownSelection(ProtocolDD, "Webservice");
		Thread.sleep(1000);
		DropDownSelection(ProtocolDD, ProtocolDDValue);
		Thread.sleep(1000);
		DropDownSelection(StatusDD, StatusDDValue);
		// WSNameData.sendKeys("WSName");
		WSOutboundURLData.sendKeys("//WSOutboundUrl");
	}

	public void ValidateExistingConnectionWithValidData() throws Throwable {
		DropDownSelection(ProtocolDD, "EXISTING-CONNECTION");
		Thread.sleep(3000);
		DropDownSelection(ECProtocolDD, "AS2");
		Thread.sleep(3000);
		DropDownSelection(ECprotocolRefDD, "TestPartnertestAS2");
		Thread.sleep(3000);
		SubmitClick.click();
	}

	public void FileUpload(String Filepath) throws Exception {
		System.setProperty(LibraryLoader.JACOB_DLL_PATH,
				"C:\\Users\\pavan.kondapur\\Eclipse_Workspace\\PCM\\resources\\jacob-1.19-x64.dll");
		AutoItX x = new AutoItX();
		// System.out.println("x"+x.toString());
		x.winWait("Open", "");
		Thread.sleep(1000);
		x.winActive("Open", "");
		Thread.sleep(1000);
		x.controlFocus("Open", "", "Edit1");
		Thread.sleep(1000);
		x.ControlSetText("Open", "", "Edit1", Filepath);
		Thread.sleep(1000);
		x.controlClick("Open", "", "Button1");
		Thread.sleep(1000);

		// Runtime.getRuntime().exec(filepath);

	}

}
