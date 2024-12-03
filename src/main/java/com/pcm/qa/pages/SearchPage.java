package com.pcm.qa.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.pcm.qa.base.TestBase;

public class SearchPage extends TestBase {

	@FindBy(xpath = "//span[contains(text(),'File Transfer')]")
	public static WebElement FileTransfersClick;

	@FindBy(xpath = "//span[contains(text(),'Search')]")
	public static WebElement Searchclick;

	@FindBy(xpath = "//input[@placeholder='File Arrived from']")
	public WebElement StartDateAndTime;

	@FindBy(xpath = "//input[@placeholder='File Arrived to']")
	public WebElement EndDateAndTime;

	@FindBy(xpath = "//mat-select[@id='flowInOut']")
	public WebElement DirectionDropDown;

	@FindBy(xpath = "//mat-select[@id='typeOfTransfer']")
	public WebElement TransferTypeDropDown;

	@FindBy(xpath = "//mat-select[@id='doctype']")
	public WebElement DocTypeDropDown;

	@FindBy(xpath = "//mat-select[@id='status']")
	public WebElement StatusDropDown;

	@FindBy(xpath = "//mat-select[@id='srcProtocol']")
	public WebElement SourceProtocolDropDown;

	@FindBy(xpath = "//mat-select[@id='destProtocol']")
	public WebElement DestProtocolDropDown;

	@FindBy(xpath = "(//mat-icon[@svgicon='menu-bar'])[1]")
	public WebElement Actionsicon;

	@FindBy(xpath = "(//h3)[2]")
	public WebElement ViewdetailsDetailspagetitle;

	@FindBy(xpath = "(//h2)[1]")
	public WebElement Viewactivitypagetitle;

	@FindBy(xpath = "//input[@name='partner']")
	public WebElement PartnerData;

	@FindBy(xpath = "//input[@name='application']")
	public WebElement ApplicationData;

	@FindBy(xpath = "//input[@name='senderId']")
	public WebElement SenderIdData;

	@FindBy(xpath = "//input[@name='receiverId']")
	public WebElement ReceiverIDData;

	@FindBy(xpath = "//input[@name='docTrans']")
	public WebElement TransactionData;

	@FindBy(xpath = "//input[@name='errorStatus']")
	public WebElement ErrorStatusData;

	@FindBy(xpath = "//mat-select[@aria-label='Items per page:']")
	public WebElement ShowDD;

	@FindBy(xpath = "//input[@name='srcFileName']")
	public WebElement SrcFileNameData;

	@FindBy(xpath = "//input[@name='destFileName']")
	public WebElement DestFileNameData;

	@FindBy(xpath = "//h3[@class='text-center p-5']")
	public WebElement Noresultfoundmessage;

	@FindBy(xpath = "//div//h3")
	public static WebElement FileTranferSearchTitle;

	@FindBy(xpath = "//*[text()[contains(.,' Advanced Search ')]]")
	public WebElement AdvanceSearchClick;

	@FindBy(xpath = "(//span[contains(text(),'Select Correlation')])[1]")
	public WebElement correlationDD;

	@FindBy(xpath = "//span[contains(text(),'Po Number')]")
	public WebElement PONumberData;

	@FindBy(xpath = "(//div[@class='form-group col-md-6 ng-star-inserted']//mat-form-field[2]//input)[1]")
	public WebElement correlationData1;

	@FindBy(xpath = "//input[@name='correlationValue2']")
	public WebElement GSControlNumberData;

	@FindBy(xpath = "//input[@name='correlationValue3']")
	public WebElement ShipmentIDData;

	@FindBy(xpath = "//input[@name='correlationValue4']")
	public WebElement ActionCodeData;

	@FindBy(xpath = "//input[@name='correlationValue5']")
	public WebElement InvoicNumberData;

	@FindBy(xpath = "//input[@name='correlationValue6']")
	public WebElement POAmountData;

	@FindBy(xpath = "//input[@name='correlationValue7']")
	public WebElement ACKStatusData;

	@FindBy(xpath = "//input[@name='correlationValue8']")
	public WebElement INVAmountData;

	@FindBy(xpath = "//input[@name='correlationValue9']")
	public WebElement ISAControlNumberData;

	@FindBy(xpath = "//input[@name='correlationValue10']")
	public WebElement DeliveryNumberData;

	@FindBy(xpath = "//input[@name='correlationValue11']")
	public WebElement CustomerIDData;

	// @FindBy(xpath="//input[@id='pageSize']")
	// public WebElement MaxNoHitsData;

	@FindBy(xpath = "//button[@class='btn btn-primary']")
	public WebElement SearchButtonClick;

	@FindBy(xpath = "//button[@class='btn btn-info']")
	public WebElement ResetButtonClick;

	@FindBy(xpath = "(//h3)[2]")
	public WebElement ErrorMsg;

	@FindBy(xpath = "(//ul[@class='errorMessage']//span)[2]")
	public WebElement DateErrorMsg;

	@FindBy(xpath = "//div[@id='swal2-content']")
	public WebElement ActionMsg;

	@FindBy(xpath = "//button[@type='button' and contains(text(),'OK')]")
	public WebElement Okbtn;

	@FindBy(xpath = "//tbody/tr[1]/td[3]/div")
	public WebElement FileTransferActionMsg;

	@FindBy(xpath = "//button[@class='btn btn-pcm-4 ng-star-inserted']")
	public WebElement MultipleReprocessButtonClick;

	@FindBy(xpath = "//input[@id='getDropVal']")
	public WebElement DropButtonClick;

	@FindBy(xpath = "//td[@class='sorting_1']")
	public List<WebElement> Tablerow;

	@FindBy(xpath = "//td[@class='dataTables_empty']")
	public WebElement TableErrorMsg;

	@FindBy(xpath = "(//i[@class='icon-menu9'])[1]")
	public WebElement toggleBarClick;

	@FindBy(xpath = "//div[@id='pcmGroupResultsTbl_info']")
	public WebElement ShowDDMsg;

	@FindBy(xpath = "//button[contains(text(),'VIEW DETAILS')]")
	public WebElement ViewDetailsClick;

	@FindBy(xpath = "//h5[contains(text(), 'Transaction Details')]")
	public WebElement TransactionDetailsmsg;

	@FindBy(xpath = "//button[contains(text(),'VIEW ACTIVITY')]")
	public WebElement ViewActivityClick;

	@FindBy(xpath = "//button[contains(text(),'PICKUP NOW')]")
	public WebElement PickUpNowClick;

	@FindBy(xpath = "//button[contains(text(),'REPROCESS')]")
	public WebElement ReprocessClick;

	@FindBy(xpath = "//button[contains(text(),'DROP AGAIN')]")
	public WebElement DropAgainClick;

	@FindBy(xpath = "//button[contains(text(),' Configure Columns ')]")
	public WebElement ConfigureColumnsClick;

	@FindBy(xpath = "//div[contains(text(),' File Arrived ')]")
	public WebElement filearrivedcheckbox;

	@FindBy(xpath = "//b[contains(text(),'Select All')]//..//mat-checkbox//label//input")
	public WebElement Selectallcheckbox;

	@FindBy(xpath = "//span[contains(text(),'Ok')]")
	public WebElement configurecoloumokbtn;

	@FindBy(xpath = "//button[@class='mat-paginator-navigation-last mat-icon-button ng-star-inserted']/span")
	public WebElement LastpageIconClick;

	@FindBy(xpath = "//button[@class='mat-paginator-navigation-first mat-icon-button ng-star-inserted']/span")
	public WebElement FirstpageIconClick;

	@FindBy(xpath = "//button[@class='mat-paginator-navigation-previous mat-icon-button']/span")
	public WebElement PreviouspageIconClick;

	@FindBy(xpath = "//button[@class='mat-paginator-navigation-next mat-icon-button']/span")
	public WebElement NextpageIconClick;

	@FindBy(xpath = "//button[@class='mat-raised-button mat-primary']")
	public WebElement FileDownloadClick;

	@FindBy(xpath = "//button[@class='mat-raised-button mat-warn']")
	public WebElement FileCloseClick;

	@FindBy(xpath = "//input[@class='mat-input-element mat-form-field-autofill-control cdk-text-field-autofill-monitored']")
	public WebElement Searchfield;

	@FindBy(xpath = "//h5[contains(text(), 'Transaction Log')]")
	public WebElement TransactionLogmsg;

	@FindBy(xpath = "//input[@placeholder='Search ']")
	public WebElement FilterData;

	@FindBy(xpath = "//div/label[contains(text(),'PickBPId')]/following-sibling::input[@name='pickBpId']")
	public WebElement PickBpIdMsg;

	@FindBy(xpath = "//div/label[contains(text(),'CoreBPId')]/following-sibling::input[@name='coreBpId']")
	public WebElement CoreBpIdMsg;

	@FindBy(xpath = "//div/label[contains(text(),'DeliveryBPId')]/following-sibling::input[@name='deliverybpid']")
	public WebElement DeliveryBpIdMsg;

	@FindBy(xpath = "//i[@class='icon-circle-down2']")
	public WebElement ArrowDownClick;

	@FindBy(xpath = "//input[@id='reprocessStatus']")
	public WebElement ReprocessMsg;

	@FindBy(xpath = "//a[@class='sidebar-control sidebar-main-toggle hidden-xs legitRipple']/i")
	public WebElement ToggleButton;

	@FindBy(xpath = "//mat-select[@aria-label='Items per page:']")
	public WebElement itemsperpageDD;

	// Initializing the Page Objects:
	public SearchPage() {
		PageFactory.initElements(driver, this);
	}

	// Actions:
	public static String validateSearchPageTitle() throws InterruptedException {

		Thread.sleep(2000);

		return FileTranferSearchTitle.getText();

	}

	public void ValidateSearchResultWithValidDate() throws InterruptedException {

		Searchclick.click();
		Thread.sleep(2000);
		StartDateAndTime.sendKeys(Keys.chord(Keys.CONTROL, "a"), prop.getProperty("StartDateAndTime1"));
		EndDateAndTime.sendKeys(Keys.chord(Keys.CONTROL, "a"), prop.getProperty("EndDateAndTime1"));
		Thread.sleep(2000);
		SearchButtonClick.click();

	}

	public void ValidateSearchResultWithInValidDate() throws InterruptedException {

		ResetButtonClick.click();
		Thread.sleep(2000);
		StartDateAndTime.sendKeys(Keys.chord(Keys.CONTROL, "a"), "1/1/2020, 2:06 AM");
		EndDateAndTime.sendKeys(Keys.chord(Keys.CONTROL, "a"), "9/13/2021, 2:06 AM");
		Thread.sleep(2000);
		SearchButtonClick.click();

	}

	public void ValidateSearchResultWithDirection() throws Throwable {
		ResetButtonClick.click();
		StartDateAndTime.sendKeys(Keys.chord(Keys.CONTROL, "a"), prop.getProperty("StartDateAndTime1"));
		EndDateAndTime.sendKeys(Keys.chord(Keys.CONTROL, "a"), prop.getProperty("EndDateAndTime1"));
		Thread.sleep(2000);
		DropDownSelection(DirectionDropDown, prop.getProperty("Direction1"));
		SearchButtonClick.click();

	}

	public void ValidateSearchResultWithTransferType() throws Throwable {
		ResetButtonClick.click();
		Thread.sleep(2000);
		StartDateAndTime.sendKeys(Keys.chord(Keys.CONTROL, "a"), prop.getProperty("StartDateAndTime1"));
		EndDateAndTime.sendKeys(Keys.chord(Keys.CONTROL, "a"), prop.getProperty("EndDateAndTime1"));
		Thread.sleep(2000);
		DropDownSelection(TransferTypeDropDown, prop.getProperty("Transfertype1"));
		Thread.sleep(2000);
		SearchButtonClick.click();
	}

	public void ValidateSearchResultWithDocType() throws Throwable {
		ResetButtonClick.click();
		Thread.sleep(2000);
		StartDateAndTime.sendKeys(Keys.chord(Keys.CONTROL, "a"), prop.getProperty("StartDateAndTime1"));
		EndDateAndTime.sendKeys(Keys.chord(Keys.CONTROL, "a"), prop.getProperty("EndDateAndTime1"));
		Thread.sleep(2000);
		DropDownSelection(DocTypeDropDown, prop.getProperty("Doctype1"));
		Thread.sleep(2000);
		SearchButtonClick.click();
	}

	public void ValidateSearchResultWithStatus() throws Throwable {
		ResetButtonClick.click();
		Thread.sleep(2000);
		StartDateAndTime.sendKeys(Keys.chord(Keys.CONTROL, "a"), prop.getProperty("StartDateAndTime1"));
		EndDateAndTime.sendKeys(Keys.chord(Keys.CONTROL, "a"), prop.getProperty("EndDateAndTime1"));
		Thread.sleep(2000);
		DropDownSelection(StatusDropDown, prop.getProperty("Status1"));
		Thread.sleep(2000);
		SearchButtonClick.click();
	}

	public void ValidateSearchResultWithSourceProtocol() throws Throwable {
		ResetButtonClick.click();
		Thread.sleep(2000);
		StartDateAndTime.sendKeys(Keys.chord(Keys.CONTROL, "a"), prop.getProperty("StartDateAndTime1"));
		EndDateAndTime.sendKeys(Keys.chord(Keys.CONTROL, "a"), prop.getProperty("EndDateAndTime1"));
		Thread.sleep(2000);
		DropDownSelection(SourceProtocolDropDown, prop.getProperty("SrcProtocol1"));
		Thread.sleep(2000);
		SearchButtonClick.click();
	}

	public void ValidateSearchResultWithDestProtocol() throws Throwable {
		ResetButtonClick.click();
		Thread.sleep(2000);
		StartDateAndTime.sendKeys(Keys.chord(Keys.CONTROL, "a"), prop.getProperty("StartDateAndTime1"));
		EndDateAndTime.sendKeys(Keys.chord(Keys.CONTROL, "a"), prop.getProperty("EndDateAndTime1"));
		Thread.sleep(2000);
		DropDownSelection(DestProtocolDropDown, prop.getProperty("DestProtocol1"));
		Thread.sleep(2000);
		SearchButtonClick.click();
	}

	public void ValidateSearchResultWithSenderId() throws Throwable {
		ResetButtonClick.click();
		Thread.sleep(2000);
		StartDateAndTime.sendKeys(Keys.chord(Keys.CONTROL, "a"), prop.getProperty("StartDateAndTime1"));
		EndDateAndTime.sendKeys(Keys.chord(Keys.CONTROL, "a"), prop.getProperty("EndDateAndTime1"));
		Thread.sleep(2000);
		SenderIdData.sendKeys(Keys.chord(Keys.CONTROL, "a"), prop.getProperty("SenderId1"));
		Thread.sleep(2000);
		SearchButtonClick.click();
	}

	public void ValidateSearchResultWithReceiverId() throws Throwable {
		ResetButtonClick.click();
		Thread.sleep(2000);
		StartDateAndTime.sendKeys(Keys.chord(Keys.CONTROL, "a"), prop.getProperty("StartDateAndTime1"));
		EndDateAndTime.sendKeys(Keys.chord(Keys.CONTROL, "a"), prop.getProperty("EndDateAndTime1"));
		Thread.sleep(2000);
		ReceiverIDData.sendKeys(Keys.chord(Keys.CONTROL, "a"), prop.getProperty("ReceiverId1"));
		Thread.sleep(2000);
		SearchButtonClick.click();
	}

	public void ValidateSearchResultWithpartner() throws InterruptedException {
		ResetButtonClick.click();
		Thread.sleep(2000);
		StartDateAndTime.sendKeys(Keys.chord(Keys.CONTROL, "a"), prop.getProperty("StartDateAndTime1"));
		EndDateAndTime.sendKeys(Keys.chord(Keys.CONTROL, "a"), prop.getProperty("EndDateAndTime1"));
		Thread.sleep(1000);
		PartnerData.sendKeys(Keys.chord(Keys.CONTROL, "a"), prop.getProperty("searchwithPartnername"));
		Thread.sleep(2000);
		SearchButtonClick.click();
	}

	public void ValidateSearchResultWithApplication() throws InterruptedException {
		ResetButtonClick.click();
		Thread.sleep(2000);
		StartDateAndTime.sendKeys(Keys.chord(Keys.CONTROL, "a"), prop.getProperty("StartDateAndTime1"));
		EndDateAndTime.sendKeys(Keys.chord(Keys.CONTROL, "a"), prop.getProperty("EndDateAndTime1"));
		Thread.sleep(1000);
		ApplicationData.sendKeys(Keys.chord(Keys.CONTROL, "a"), prop.getProperty("searchwithApplicationname"));
		Thread.sleep(2000);
		SearchButtonClick.click();
	}

	public void ValidateSearchResultWithTransaction() throws InterruptedException {
		ResetButtonClick.click();
		Thread.sleep(2000);
		StartDateAndTime.sendKeys(Keys.chord(Keys.CONTROL, "a"), prop.getProperty("StartDateAndTime1"));
		EndDateAndTime.sendKeys(Keys.chord(Keys.CONTROL, "a"), prop.getProperty("EndDateAndTime1"));
		TransactionData.sendKeys(Keys.chord(Keys.CONTROL, "a"), prop.getProperty("Transaction1"));
		// SearchButtonClick.click();
		Thread.sleep(2000);
		SearchButtonClick.click();
	}

	public void ValidateSearchResultWithErrorStatus() throws InterruptedException {
		ResetButtonClick.click();
		Thread.sleep(2000);
		StartDateAndTime.sendKeys(Keys.chord(Keys.CONTROL, "a"), prop.getProperty("StartDateAndTime1"));
		EndDateAndTime.sendKeys(Keys.chord(Keys.CONTROL, "a"), prop.getProperty("EndDateAndTime1"));
		ErrorStatusData.sendKeys(Keys.chord(Keys.CONTROL, "a"), prop.getProperty("Errorstatus1"));
		Thread.sleep(2000);
		SearchButtonClick.click();
	}

	public void ValidateSearchResultWithSrcFileName() throws InterruptedException {
		ResetButtonClick.click();
		Thread.sleep(2000);
		StartDateAndTime.sendKeys(Keys.chord(Keys.CONTROL, "a"), prop.getProperty("StartDateAndTime1"));
		EndDateAndTime.sendKeys(Keys.chord(Keys.CONTROL, "a"), prop.getProperty("EndDateAndTime1"));
		Thread.sleep(1000);
		SrcFileNameData.sendKeys(Keys.chord(Keys.CONTROL, "a"), prop.getProperty("SrcFilename1"));
		Thread.sleep(2000);
		SearchButtonClick.click();
	}

	public void ValidateSearchResultWithDestFileName() throws InterruptedException {
		ResetButtonClick.click();
		Thread.sleep(2000);
		StartDateAndTime.sendKeys(Keys.chord(Keys.CONTROL, "a"), prop.getProperty("StartDateAndTime1"));
		EndDateAndTime.sendKeys(Keys.chord(Keys.CONTROL, "a"), prop.getProperty("EndDateAndTime1"));
		Thread.sleep(1000);
		DestFileNameData.sendKeys(Keys.chord(Keys.CONTROL, "a"), prop.getProperty("DestFilename1"));
		Thread.sleep(2000);
		SearchButtonClick.click();
	}

	public void ValidateSearchResultWithMaxHits() throws InterruptedException {
		ResetButtonClick.click();
		StartDateAndTime.sendKeys(Keys.chord(Keys.CONTROL, "a"), prop.getProperty("StartDateAndTime1"));
		EndDateAndTime.sendKeys(Keys.chord(Keys.CONTROL, "a"), prop.getProperty("EndDateAndTime1"));
		// MaxNoHitsData.sendKeys(Keys.chord(Keys.CONTROL, "a"), "50");
		// SearchButtonClick.click();
		SearchButtonClick.click();
	}

	public void ValidateSearchResultWithShow() throws Throwable {
		ResetButtonClick.click();
		StartDateAndTime.sendKeys(Keys.chord(Keys.CONTROL, "a"), prop.getProperty("StartDateAndTime1"));
		EndDateAndTime.sendKeys(Keys.chord(Keys.CONTROL, "a"), prop.getProperty("EndDateAndTime1"));
		SearchButtonClick.click();
		// SearchButtonClick.click();
		DropDownSelection(ShowDD, "25");
	}

	public void ValidateSearchResultWithFilter() throws InterruptedException {
		ResetButtonClick.click();
		Thread.sleep(2000);
		StartDateAndTime.sendKeys(Keys.chord(Keys.CONTROL, "a"), prop.getProperty("StartDateAndTime1"));
		EndDateAndTime.sendKeys(Keys.chord(Keys.CONTROL, "a"), prop.getProperty("EndDateAndTime1"));
		Thread.sleep(2000);
		DropDownSelection(DestProtocolDropDown, "MAILBOX");
		Thread.sleep(2000);
		SearchButtonClick.click();

	}

	public void ValidateSearchResultWithArrowDown() throws InterruptedException {

		// Actionselection(driver, ArrowDownClick);
		ArrowDownClick.click();

	}

	public void validateRecordWithViewDetails() throws Throwable {
		ResetButtonClick.click();
		StartDateAndTime.sendKeys(Keys.chord(Keys.CONTROL, "a"), prop.getProperty("StartDateAndTime1"));
		EndDateAndTime.sendKeys(Keys.chord(Keys.CONTROL, "a"), prop.getProperty("EndDateAndTime1"));
		DropDownSelection(DirectionDropDown, "Inbound");
		// SearchButtonClick.click();
		SearchButtonClick.click();
		toggleBarClick.click();
		// Actionselection(driver, ViewDetailsClick);
		ViewDetailsClick.click();
	}

	public void validateRecordWithViewActivity() throws InterruptedException {
		ValidateSearchResultWithValidDate();
		// toggleBarClick.click();
		toggleBarClick.click();
		// Actionselection(driver, ViewActivityClick);
		ViewActivityClick.click();
	}

	public void validateRecordWithPickupNow() throws InterruptedException {

		StartDateAndTime.sendKeys(Keys.chord(Keys.CONTROL, "a"), prop.getProperty("StartDateAndTime1"));
		EndDateAndTime.sendKeys(Keys.chord(Keys.CONTROL, "a"), prop.getProperty("EndDateAndTime1"));
		Thread.sleep(2000);
		PartnerData.sendKeys(Keys.chord(Keys.CONTROL, "a"), prop.getProperty("searchwithPartnername"));
		Thread.sleep(1000);
		ApplicationData.sendKeys(Keys.chord(Keys.CONTROL, "a"), prop.getProperty("searchwithApplicationname"));
		SearchButtonClick.click();

	}

	public void validateRecordWithReprocess() throws InterruptedException {

		StartDateAndTime.sendKeys(Keys.chord(Keys.CONTROL, "a"), prop.getProperty("StartDateAndTime1"));
		EndDateAndTime.sendKeys(Keys.chord(Keys.CONTROL, "a"), prop.getProperty("EndDateAndTime1"));
		Thread.sleep(2000);
		PartnerData.sendKeys(Keys.chord(Keys.CONTROL, "a"), prop.getProperty("searchwithPartnername"));
		Thread.sleep(1000);
		ApplicationData.sendKeys(Keys.chord(Keys.CONTROL, "a"), prop.getProperty("searchwithApplicationname"));
		SearchButtonClick.click();
	}

	public void validateRecordWithDropAgain() throws InterruptedException {
		StartDateAndTime.sendKeys(Keys.chord(Keys.CONTROL, "a"), prop.getProperty("StartDateAndTime1"));
		EndDateAndTime.sendKeys(Keys.chord(Keys.CONTROL, "a"), prop.getProperty("EndDateAndTime1"));
		Thread.sleep(2000);
		PartnerData.sendKeys(Keys.chord(Keys.CONTROL, "a"), prop.getProperty("searchwithPartnername"));
		Thread.sleep(1000);
		ApplicationData.sendKeys(Keys.chord(Keys.CONTROL, "a"), prop.getProperty("searchwithApplicationname"));
		SearchButtonClick.click();
	}

	public void ClearingAdvanceSearchData() throws Exception {

		PONumberData.clear();
		GSControlNumberData.clear();
		ShipmentIDData.clear();
		ActionCodeData.clear();
		InvoicNumberData.clear();
		POAmountData.clear();
		ACKStatusData.clear();
		INVAmountData.clear();
		ISAControlNumberData.clear();
		DeliveryNumberData.clear();
		CustomerIDData.clear();

	}

	public void ValidateSearchResultWithPONumber() throws Exception {
		ResetButtonClick.click();
		Thread.sleep(2000);
		StartDateAndTime.sendKeys(Keys.chord(Keys.CONTROL, "a"), prop.getProperty("StartDateAndTime1"));
		EndDateAndTime.sendKeys(Keys.chord(Keys.CONTROL, "a"), prop.getProperty("EndDateAndTime1"));
		Thread.sleep(2000);
		AdvanceSearchClick.click();
		Thread.sleep(2000);
		DropDownSelection(correlationDD, "PONUMBER");

		Thread.sleep(1000);
		correlationData1.sendKeys(Keys.chord(Keys.CONTROL, "a"), "2345");
		Thread.sleep(1000);
		SearchButtonClick.click();
	}

	public void ValidateSearchResultWithGSControlNumber() throws Exception {
		ResetButtonClick.click();
		AdvanceSearchClick.click();
		StartDateAndTime.sendKeys(Keys.chord(Keys.CONTROL, "a"), prop.getProperty("StartDateAndTime1"));
		EndDateAndTime.sendKeys(Keys.chord(Keys.CONTROL, "a"), prop.getProperty("EndDateAndTime1"));
		// ClearingAdvanceSearchData();
		GSControlNumberData.sendKeys(Keys.chord(Keys.CONTROL, "a"), "4904");
		SearchButtonClick.click();
	}

	public void ValidateSearchResultWithShipmentID() throws Exception {
		ResetButtonClick.click();
		AdvanceSearchClick.click();
		StartDateAndTime.sendKeys(Keys.chord(Keys.CONTROL, "a"), prop.getProperty("StartDateAndTime1"));
		EndDateAndTime.sendKeys(Keys.chord(Keys.CONTROL, "a"), prop.getProperty("EndDateAndTime1"));
		// ClearingAdvanceSearchData();
		ShipmentIDData.sendKeys(Keys.chord(Keys.CONTROL, "a"), "5967 W1");
		SearchButtonClick.click();
	}

	public void ValidateSearchResultWithActionCode() throws Exception {
		ResetButtonClick.click();
		// AdvanceSearchClick.click();
		AdvanceSearchClick.click();
		StartDateAndTime.sendKeys(Keys.chord(Keys.CONTROL, "a"), prop.getProperty("StartDateAndTime1"));
		EndDateAndTime.sendKeys(Keys.chord(Keys.CONTROL, "a"), prop.getProperty("EndDateAndTime1"));
		// ClearingAdvanceSearchData();
		ActionCodeData.sendKeys(Keys.chord(Keys.CONTROL, "a"), "130");
		SearchButtonClick.click();
	}

	public void ValidateSearchResultWithInvoiceNumber() throws Exception {
		ResetButtonClick.click();
		AdvanceSearchClick.click();
		StartDateAndTime.sendKeys(Keys.chord(Keys.CONTROL, "a"), prop.getProperty("StartDateAndTime1"));
		EndDateAndTime.sendKeys(Keys.chord(Keys.CONTROL, "a"), prop.getProperty("EndDateAndTime1"));
		// ClearingAdvanceSearchData();
		InvoicNumberData.sendKeys(Keys.chord(Keys.CONTROL, "a"), "0091077079");
		SearchButtonClick.click();
	}

	public void ValidateSearchResultWithPOAmount() throws Exception {
		ResetButtonClick.click();
		AdvanceSearchClick.click();
		StartDateAndTime.sendKeys(Keys.chord(Keys.CONTROL, "a"), prop.getProperty("StartDateAndTime1"));
		EndDateAndTime.sendKeys(Keys.chord(Keys.CONTROL, "a"), prop.getProperty("EndDateAndTime1"));
		// ClearingAdvanceSearchData();
		POAmountData.sendKeys(Keys.chord(Keys.CONTROL, "a"), "010806 /");
		SearchButtonClick.click();
	}

	public void ValidateSearchResultWithAckStatus() throws Exception {
		ResetButtonClick.click();
		AdvanceSearchClick.click();
		StartDateAndTime.sendKeys(Keys.chord(Keys.CONTROL, "a"), prop.getProperty("StartDateAndTime1"));
		EndDateAndTime.sendKeys(Keys.chord(Keys.CONTROL, "a"), prop.getProperty("EndDateAndTime1"));
		// ClearingAdvanceSearchData();
		ACKStatusData.sendKeys(Keys.chord(Keys.CONTROL, "a"), "000000010  /    /");
		SearchButtonClick.click();
	}

	public void ValidateSearchResultWithInVoiceAmount() throws Exception {
		ResetButtonClick.click();
		AdvanceSearchClick.click();
		StartDateAndTime.sendKeys(Keys.chord(Keys.CONTROL, "a"), prop.getProperty("StartDateAndTime1"));
		EndDateAndTime.sendKeys(Keys.chord(Keys.CONTROL, "a"), prop.getProperty("EndDateAndTime1"));
		// ClearingAdvanceSearchData();
		INVAmountData.sendKeys(Keys.chord(Keys.CONTROL, "a"), "51270");
		SearchButtonClick.click();
	}

	public void ValidateSearchResultWithISAControlNumber() throws Exception {
		ResetButtonClick.click();
		AdvanceSearchClick.click();
		StartDateAndTime.sendKeys(Keys.chord(Keys.CONTROL, "a"), prop.getProperty("StartDateAndTime1"));
		EndDateAndTime.sendKeys(Keys.chord(Keys.CONTROL, "a"), prop.getProperty("EndDateAndTime1"));
		// ClearingAdvanceSearchData();
		ISAControlNumberData.sendKeys(Keys.chord(Keys.CONTROL, "a"), "297");
		SearchButtonClick.click();
	}

	public void ValidateSearchResultWithDeliveryNumber() throws Exception {
		ResetButtonClick.click();
		AdvanceSearchClick.click();
		StartDateAndTime.sendKeys(Keys.chord(Keys.CONTROL, "a"), prop.getProperty("StartDateAndTime1"));
		EndDateAndTime.sendKeys(Keys.chord(Keys.CONTROL, "a"), prop.getProperty("EndDateAndTime1"));
		// ClearingAdvanceSearchData();
		DeliveryNumberData.sendKeys(Keys.chord(Keys.CONTROL, "a"), "342449");
		SearchButtonClick.click();
	}

	public void ValidateSearchResultWithCustomerID() throws Exception {
		ResetButtonClick.click();
		Thread.sleep(2000);
		StartDateAndTime.sendKeys(Keys.chord(Keys.CONTROL, "a"), prop.getProperty("StartDateAndTime1"));
		EndDateAndTime.sendKeys(Keys.chord(Keys.CONTROL, "a"), prop.getProperty("EndDateAndTime1"));
		Thread.sleep(2000);
		AdvanceSearchClick.click();
		Thread.sleep(1000);
		DropDownSelection(correlationDD, "CUSTOMERID");
		Thread.sleep(1000);
		correlationData1.sendKeys(Keys.chord(Keys.CONTROL, "a"), "12345");
		Thread.sleep(1000);
		SearchButtonClick.click();
	}

	public void ValidateSearchResultWithPacketID1() throws Exception {
		ResetButtonClick.click();
		Thread.sleep(2000);
		StartDateAndTime.sendKeys(Keys.chord(Keys.CONTROL, "a"), prop.getProperty("StartDateAndTime1"));
		EndDateAndTime.sendKeys(Keys.chord(Keys.CONTROL, "a"), prop.getProperty("EndDateAndTime1"));
		Thread.sleep(1000);
		AdvanceSearchClick.click();
		Thread.sleep(1000);
		DropDownSelection(correlationDD, "PACKETID");
		Thread.sleep(1000);
		correlationData1.sendKeys(Keys.chord(Keys.CONTROL, "a"), "12345");
		Thread.sleep(1000);
		SearchButtonClick.click();
	}

	public void ValidateSearchpageitemsperpage() throws Exception {
		ResetButtonClick.click();
		Thread.sleep(2000);
		StartDateAndTime.sendKeys(Keys.chord(Keys.CONTROL, "a"), prop.getProperty("StartDateAndTime1"));
		EndDateAndTime.sendKeys(Keys.chord(Keys.CONTROL, "a"), prop.getProperty("EndDateAndTime1"));
		Thread.sleep(2000);
		SearchButtonClick.click();

	}

	public void ValidateSearchResultsWithExistingRecord() throws Throwable {
		ResetButtonClick.click();
		Thread.sleep(2000);
		StartDateAndTime.sendKeys(Keys.chord(Keys.CONTROL, "a"), prop.getProperty("StartDateAndTime1"));
		EndDateAndTime.sendKeys(Keys.chord(Keys.CONTROL, "a"), prop.getProperty("EndDateAndTime1"));
		Thread.sleep(2000);
	}

	public void ValidateSearchResultsAdvancedWithInvalidDetails() throws Throwable {
		ResetButtonClick.click();
		Thread.sleep(2000);
		StartDateAndTime.sendKeys(Keys.chord(Keys.CONTROL, "a"), prop.getProperty("StartDateAndTime1"));
		EndDateAndTime.sendKeys(Keys.chord(Keys.CONTROL, "a"), prop.getProperty("EndDateAndTime1"));
		Thread.sleep(2000);
		AdvanceSearchClick.click();
		Thread.sleep(2000);
		DropDownSelection(correlationDD, "PONUMBER");
		Thread.sleep(1000);
		correlationData1.sendKeys(Keys.chord(Keys.CONTROL, "a"), "2345");
		Thread.sleep(1000);
		SearchButtonClick.click();
		Thread.sleep(2000);

	}

	public void ValidateSrcDownload() throws InterruptedException {

		StartDateAndTime.sendKeys(Keys.chord(Keys.CONTROL, "a"), prop.getProperty("StartDateAndTime1"));
		EndDateAndTime.sendKeys(Keys.chord(Keys.CONTROL, "a"), prop.getProperty("EndDateAndTime1"));
		Thread.sleep(2000);
		PartnerData.sendKeys(Keys.chord(Keys.CONTROL, "a"), prop.getProperty("searchwithPartnername"));
		Thread.sleep(1000);
		ApplicationData.sendKeys(Keys.chord(Keys.CONTROL, "a"), prop.getProperty("searchwithApplicationname"));
		Thread.sleep(1000);
		SearchButtonClick.click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//tbody/tr[1]/td[6]/div/pcm-link-widget")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[contains(text(),' Download ')]")).click();

		/*
		 * driver.switchTo().defaultContent(); for (String handle :
		 * driver.getWindowHandles()) { driver.switchTo().window(handle); }
		 * Thread.sleep(1000);
		 * driver.findElement(By.xpath("//a[@id='download_ID']")).click();
		 * driver.findElement(By.xpath("//button[@class='btn btn-default legitRipple']")
		 * ).click();
		 */
	}

	public void ValidateSrcClose() throws InterruptedException {

		StartDateAndTime.sendKeys(Keys.chord(Keys.CONTROL, "a"), prop.getProperty("StartDateAndTime1"));
		EndDateAndTime.sendKeys(Keys.chord(Keys.CONTROL, "a"), prop.getProperty("EndDateAndTime1"));
		Thread.sleep(2000);
		PartnerData.sendKeys(Keys.chord(Keys.CONTROL, "a"), prop.getProperty("searchwithPartnername"));
		Thread.sleep(1000);
		ApplicationData.sendKeys(Keys.chord(Keys.CONTROL, "a"), prop.getProperty("searchwithApplicationname"));
		Thread.sleep(1000);
		SearchButtonClick.click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//tbody/tr[1]/td[6]/div/pcm-link-widget")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[contains(text(),' Close ')]")).click();

		/*
		 * driver.switchTo().defaultContent(); for (String handle :
		 * driver.getWindowHandles()) { driver.switchTo().window(handle); }
		 * Thread.sleep(1000);
		 * driver.findElement(By.xpath("//a[@id='download_ID']")).click();
		 * driver.findElement(By.xpath("//button[@class='btn btn-default legitRipple']")
		 * ).click();
		 */
	}

	public void ValidateDestDownload() throws InterruptedException {

		StartDateAndTime.sendKeys(Keys.chord(Keys.CONTROL, "a"), prop.getProperty("StartDateAndTime1"));
		EndDateAndTime.sendKeys(Keys.chord(Keys.CONTROL, "a"), prop.getProperty("EndDateAndTime1"));
		Thread.sleep(2000);
		PartnerData.sendKeys(Keys.chord(Keys.CONTROL, "a"), prop.getProperty("searchwithPartnername"));
		Thread.sleep(1000);
		ApplicationData.sendKeys(Keys.chord(Keys.CONTROL, "a"), prop.getProperty("searchwithApplicationname"));
		Thread.sleep(1000);
		SearchButtonClick.click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//tbody/tr[1]/td[7]/div/pcm-link-widget")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[contains(text(),' Download ')]")).click();

		/*
		 * driver.switchTo().defaultContent(); for (String handle :
		 * driver.getWindowHandles()) { driver.switchTo().window(handle); }
		 * Thread.sleep(1000);
		 * driver.findElement(By.xpath("//a[@id='download_ID']")).click();
		 * driver.findElement(By.xpath("//button[@class='btn btn-default legitRipple']")
		 * ).click();
		 */
	}

	public void ValidateDestClose() throws InterruptedException {

		StartDateAndTime.sendKeys(Keys.chord(Keys.CONTROL, "a"), prop.getProperty("StartDateAndTime1"));
		EndDateAndTime.sendKeys(Keys.chord(Keys.CONTROL, "a"), prop.getProperty("EndDateAndTime1"));
		Thread.sleep(2000);
		PartnerData.sendKeys(Keys.chord(Keys.CONTROL, "a"), prop.getProperty("searchwithPartnername"));
		Thread.sleep(1000);
		ApplicationData.sendKeys(Keys.chord(Keys.CONTROL, "a"), prop.getProperty("searchwithApplicationname"));
		Thread.sleep(1000);
		SearchButtonClick.click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//tbody/tr[1]/td[7]/div/pcm-link-widget")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[contains(text(),' Close ')]")).click();

		/*
		 * driver.switchTo().defaultContent(); for (String handle :
		 * driver.getWindowHandles()) { driver.switchTo().window(handle); }
		 * Thread.sleep(1000);
		 * driver.findElement(By.xpath("//a[@id='download_ID']")).click();
		 * driver.findElement(By.xpath("//button[@class='btn btn-default legitRipple']")
		 * ).click();
		 */
	}

	public void exportpdf() throws Exception {

		StartDateAndTime.sendKeys(Keys.chord(Keys.CONTROL, "a"), prop.getProperty("StartDateAndTime1"));
		EndDateAndTime.sendKeys(Keys.chord(Keys.CONTROL, "a"), prop.getProperty("EndDateAndTime1"));
		Thread.sleep(2000);
		PartnerData.sendKeys(Keys.chord(Keys.CONTROL, "a"), prop.getProperty("searchwithPartnername"));
		Thread.sleep(1000);
		ApplicationData.sendKeys(Keys.chord(Keys.CONTROL, "a"), prop.getProperty("searchwithApplicationname"));
		Thread.sleep(1000);
		SearchButtonClick.click();
		Thread.sleep(3000);
		driver.findElement(By
				.xpath("(//div[@class='mat-checkbox-inner-container mat-checkbox-inner-container-no-side-margin'])[2]"))
				.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[contains(text(),' Export ')]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[contains(text(),' Export Pdf ')]")).click();

	}

	public void exportcsv() throws Exception {

		StartDateAndTime.sendKeys(Keys.chord(Keys.CONTROL, "a"), prop.getProperty("StartDateAndTime1"));
		EndDateAndTime.sendKeys(Keys.chord(Keys.CONTROL, "a"), prop.getProperty("EndDateAndTime1"));
		Thread.sleep(2000);
		PartnerData.sendKeys(Keys.chord(Keys.CONTROL, "a"), prop.getProperty("searchwithPartnername"));
		Thread.sleep(1000);
		ApplicationData.sendKeys(Keys.chord(Keys.CONTROL, "a"), prop.getProperty("searchwithApplicationname"));
		Thread.sleep(1000);
		SearchButtonClick.click();
		Thread.sleep(3000);
		driver.findElement(By
				.xpath("(//div[@class='mat-checkbox-inner-container mat-checkbox-inner-container-no-side-margin'])[2]"))
				.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[contains(text(),' Export ')]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[contains(text(),' Export CSV ')]")).click();

	}

	public String Getpartnername() throws Exception {

		Thread.sleep(2000);
		String name = driver.findElement(By.xpath("//tbody//tr[1]/td[4]//span")).getText();
		return name;

	}

	public String Getappname() throws Exception {

		Thread.sleep(2000);
		String name = driver.findElement(By.xpath("//tbody//tr[1]/td[5]//span")).getText();
		return name;

	}

}
