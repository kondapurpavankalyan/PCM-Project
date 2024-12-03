package com.pcm.qa.pages;

import com.pcm.qa.base.TestBase;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ManagePartnerPage extends TestBase {

	public StringBuffer ActivitylogData;

	@FindBy(xpath = "//span//mat-icon[contains(text(),'menu')]")
	public WebElement ControlMenuClick;

	@FindBy(xpath = "//div[@class='mat-drawer-inner-container']//mat-nav-list[3]")
	public WebElement PartnerClick;

	@FindBy(xpath = "//span[contains(text(),'Manage Partner')]")
	public WebElement ManagePartnerClick;

	@FindBy(xpath = "(//h3)")
	public WebElement Partnertitle;

	@FindBy(xpath = "(//h4)")
	public WebElement CreatePartnertitle;

	@FindBy(xpath = "//input[@placeholder='Partner Name']")
	public WebElement PartnerNameData;

	@FindBy(xpath = "//input[@placeholder='Partner Id']")
	public WebElement PartnerIdData;

	@FindBy(xpath = "//span[contains(text(),'Protocol')]")
	public WebElement ProtocolDD;

	@FindBy(xpath = "//span[contains(text(),'Select')]")
	public WebElement StatusDD;

	@FindBy(xpath = "//button[contains(text(),'Reset Search')]")
	public WebElement ResetClick;

	@FindBy(xpath = "//button[contains(text(),'Search Partner')]")
	public WebElement SearchClick;

	@FindBy(xpath = "(//div//h3)[2]")
	public WebElement ErrorMsg;

	@FindBy(xpath = "//div[@id='swal2-content']")
	public WebElement ActionMsg;

	@FindBy(xpath = "//mat-icon[@svgicon='menu-bar']")
	public WebElement Actionbtn;

	@FindBy(xpath = "(//*[@svgicon='menu-bar'])[1]")
	public WebElement Actionsicon;

	@FindBy(xpath = "//div[contains(text(),'Activity')]")
	public WebElement ViewActivityClick;

	@FindBy(xpath = "//table")
	public WebElement ActivityLogTable;

	@FindBy(xpath = "//button[contains(text(),' Submit ')]")
	public WebElement EditSubmitClick;

	@FindBy(xpath = "//mat-card//h4")
	public WebElement MPpagetitle;

	@FindBy(xpath = "//button[contains(text(),'Edit')]")
	public WebElement Editbtn;

	@FindBy(xpath = "//button[@class='btn btn-pcm-delete']")
	public WebElement DeleteClick;

	@FindBy(xpath = "//button[contains(text(),'Yes, delete it!')]")
	public WebElement yesDeleteitClick;

	@FindBy(xpath = "//button[text()='Deactivate']")
	public WebElement DeactivateClick;

	@FindBy(xpath = "//button[contains(text(),'Yes, deactivate it!')]")
	public WebElement yesDeactivateitClick;

	@FindBy(xpath = "//button[text()='Activate']")
	public WebElement ActivateClick;

	@FindBy(xpath = "//button[contains(text(),'Yes, activate it')]")
	public WebElement yesActivateitClick;

	@FindBy(xpath = "//input[@placeholder='Email *']")
	public WebElement EmailData;

	@FindBy(xpath = "//input[@placeholder='Phone *']")
	public WebElement PhoneData;

	@FindBy(xpath = "//textarea[@placeholder='Address Line 1 ']")
	public WebElement AddressLine1Data;

	@FindBy(xpath = "//textarea[@placeholder='Address Line 2']")
	public WebElement AddressLine2Data;

	public ManagePartnerPage() {
		PageFactory.initElements(driver, this);
	}

	public String ValidateManagePartnerPageTitle() throws InterruptedException {

		PartnerClick.click();

		Thread.sleep(1000);

		ManagePartnerClick.click();

		Thread.sleep(3000);

		String title = MPpagetitle.getText();

		return title;
	}

	public void createpartner() throws Exception {

	}

	public void ValidateManagePartnerWithInvalidData() throws Exception {

		Thread.sleep(1000);
		PartnerNameData.sendKeys(Keys.chord(Keys.CONTROL, "a"), "softwaretesting");
		PartnerIdData.sendKeys(Keys.chord(Keys.CONTROL, "a"), "softwaretesting");
		Thread.sleep(1000);
		DropDownSelection(ProtocolDD, "B2Bi-FTP");
		Thread.sleep(3000);
		DropDownSelection(StatusDD, "Active");
		Thread.sleep(3000);
		SearchClick.click();
	}

	public void ValidateManagePartnerWithvalidData() throws Exception {

		PartnerNameData.sendKeys(Keys.chord(Keys.CONTROL, "a"), "partnerautomationtest");
		PartnerIdData.sendKeys(Keys.chord(Keys.CONTROL, "a"), "partnerautomationtest");
		Thread.sleep(3000);
		DropDownSelection(ProtocolDD, "SAP");
		Thread.sleep(3000);
		// DropDownSelection(StatusDD, "Inactive");
		// Thread.sleep(3000);
		SearchClick.click();
	}

	public void ValidateManagePartnerWithvalidData1() throws Exception {
		Thread.sleep(3000);
		PartnerNameData.sendKeys(Keys.chord(Keys.CONTROL, "a"), "PartnerAutomation1");
		PartnerIdData.sendKeys(Keys.chord(Keys.CONTROL, "a"), "PartnerAutomation1");
		Thread.sleep(3000);
		DropDownSelection(ProtocolDD, "SAP");
		Thread.sleep(3000);
		// DropDownSelection(StatusDD, "Inactive");
		// Thread.sleep(3000);
		SearchClick.click();
	}

	public void validateManagePartnerWithOnlyPartnerName(String PartnerNameValue) throws InterruptedException {

		PartnerNameData.sendKeys(Keys.chord(Keys.CONTROL, "a"), PartnerNameValue);
		Thread.sleep(1000);
		SearchClick.click();

	}

	public void validateManagePartnerWithOnlyPartnerId(String PartnerIdValue) throws InterruptedException {
		PartnerIdData.sendKeys(Keys.chord(Keys.CONTROL, "a"), PartnerIdValue);
		Thread.sleep(1000);
		SearchClick.click();

	}

	public void validateManagePartnerWithOnlyProtocol(String ProtocolValue, String PartnerNameValue)
			throws InterruptedException {
		PartnerNameData.sendKeys(Keys.chord(Keys.CONTROL, "a"), PartnerNameValue);
		Thread.sleep(3000);
		DropDownSelection(ProtocolDD, ProtocolValue);
		Thread.sleep(3000);
		SearchClick.click();

	}

	public void validateManagePartnerWithOnlyStatus(String StatusValue, String PartnerNameValue)
			throws InterruptedException {
		ResetClick.click();
		Thread.sleep(3000);
		PartnerNameData.sendKeys(Keys.chord(Keys.CONTROL, "a"), PartnerNameValue);
		Thread.sleep(3000);
		DropDownSelection(StatusDD, StatusValue);
		Thread.sleep(3000);
		SearchClick.click();
		
	}

	public void validateMPWithPNOfFTPandStatusInactive(String PartnerNameValue, String StatusInactive)
			throws InterruptedException {
		ResetClick.click();
		Thread.sleep(3000);
		PartnerNameData.sendKeys(Keys.chord(Keys.CONTROL, "a"), PartnerNameValue);
		Thread.sleep(3000);
		DropDownSelection(StatusDD, StatusInactive);
		Thread.sleep(3000);
		SearchClick.click();
		

	}

	public void validateMPWithPNOfFTPSandStatusActive(String PartnerNameValue, String StatusActive)
			throws InterruptedException {
		ResetClick.click();
		Thread.sleep(3000);
		PartnerNameData.sendKeys(Keys.chord(Keys.CONTROL, "a"), PartnerNameValue);
		Thread.sleep(3000);
		DropDownSelection(StatusDD, StatusActive);
		Thread.sleep(3000);
		SearchClick.click();
		

	}

	public void validateManagePartnerWithOnlyPartnerName_partnerid_protocol_statusasInactive(String PartnerNameValue,
			String PartnerIdValue, String ProtocolValue, String StatusValue) throws InterruptedException {

		PartnerNameData.sendKeys(Keys.chord(Keys.CONTROL, "a"), PartnerNameValue);
		PartnerIdData.sendKeys(Keys.chord(Keys.CONTROL, "a"), PartnerIdValue);
		Thread.sleep(3000);
		DropDownSelection(ProtocolDD, ProtocolValue);
		Thread.sleep(3000);
		DropDownSelection(StatusDD, StatusValue);
		Thread.sleep(3000);
		SearchClick.click();

	}

	public void validateManagePartnerWithOnlyPartnerName_partnerid_protocol_statusasActive(String PartnerNameValue,
			String PartnerIdValue, String ProtocolValue, String StatusValue) throws InterruptedException {

		PartnerNameData.sendKeys(Keys.chord(Keys.CONTROL, "a"), PartnerNameValue);
		PartnerIdData.sendKeys(Keys.chord(Keys.CONTROL, "a"), PartnerIdValue);
		Thread.sleep(3000);
		DropDownSelection(ProtocolDD, ProtocolValue);
		Thread.sleep(3000);
		DropDownSelection(StatusDD, StatusValue);
		Thread.sleep(3000);
		SearchClick.click();

	}

	public void validateMPWithPNofSFTPandProtocolofSFTP(String PartnerNameValue, String ProtocolValue)
			throws InterruptedException {
		ResetClick.click();
		Thread.sleep(3000);
		PartnerNameData.sendKeys(Keys.chord(Keys.CONTROL, "a"), PartnerNameValue);
		Thread.sleep(3000);
		DropDownSelection(ProtocolDD, ProtocolValue);
		Thread.sleep(3000);
		SearchClick.click();
		
	}

	public void validateMPWithPNofHTTPandPIofHTTP(String PartnerNameValue, String PartnerIdValue)
			throws InterruptedException {
		ResetClick.click();
		Thread.sleep(3000);
		PartnerNameData.sendKeys(Keys.chord(Keys.CONTROL, "a"), PartnerNameValue);
		PartnerIdData.sendKeys(Keys.chord(Keys.CONTROL, "a"), PartnerIdValue);
		Thread.sleep(3000);
		SearchClick.click();
		
	}

	public void validateMPWithPIofHTTPSandProtocolofHTTPS(String IdValue, String ProtocolValue)
			throws InterruptedException {
		ResetClick.click();
		Thread.sleep(3000);
		PartnerIdData.sendKeys(Keys.chord(Keys.CONTROL, "a"), IdValue);
		Thread.sleep(3000);
		DropDownSelection(ProtocolDD, ProtocolValue);
		Thread.sleep(3000);
		SearchClick.click();
		
	}

	public void validateMPWithPIofMBandStatusofInactive(String IdValue, String StatusValue)
			throws InterruptedException {
		ResetClick.click();
		Thread.sleep(3000);
		PartnerIdData.sendKeys(Keys.chord(Keys.CONTROL, "a"), IdValue);
		Thread.sleep(3000);
		DropDownSelection(StatusDD, StatusValue);
		Thread.sleep(3000);
		SearchClick.click();
		
	}

	public void validateMPWithPIofMQandStatusofActive(String IdValue, String StatusValue) throws InterruptedException {
		ResetClick.click();
		Thread.sleep(3000);
		PartnerIdData.sendKeys(IdValue);
		Thread.sleep(3000);
		DropDownSelection(StatusDD, StatusValue);
		Thread.sleep(3000);
		SearchClick.click();
		
	}

	public void validateMPWithProtocolofSAPandStatusofInactive(String Protocol, String StatusValue)
			throws InterruptedException {
		ResetClick.click();
		Thread.sleep(3000);
		DropDownSelection(ProtocolDD, Protocol);
		Thread.sleep(3000);
		DropDownSelection(StatusDD, StatusValue);
		Thread.sleep(3000);
		SearchClick.click();
		
	}

	public void validateMPWithProtocolofSMTPandStatusofActive(String Protocol, String StatusValue)
			throws InterruptedException {
		ResetClick.click();
		Thread.sleep(3000);
		DropDownSelection(ProtocolDD, Protocol);
		Thread.sleep(3000);
		DropDownSelection(StatusDD, StatusValue);
		Thread.sleep(3000);
		SearchClick.click();
	}

	public void validateMPWithAllFieldsofSFGFTP(String PartnerNameValue, String PartnerIdValue, String ProtocolValue,
			String StatusValue) throws InterruptedException {
		ResetClick.click();
		Thread.sleep(3000);
		PartnerNameData.sendKeys(Keys.chord(Keys.CONTROL, "a"), PartnerNameValue);
		PartnerIdData.sendKeys(Keys.chord(Keys.CONTROL, "a"), PartnerIdValue);
		Thread.sleep(3000);
		DropDownSelection(ProtocolDD, ProtocolValue);
		Thread.sleep(3000);
		DropDownSelection(StatusDD, StatusValue);
		Thread.sleep(3000);
		SearchClick.click();
		
	}

	public void validateMPWithAllFieldsofSFGFTPSexceptPN(String PartnerIdValue, String ProtocolValue,
			String StatusValue) throws InterruptedException {
		ResetClick.click();
		Thread.sleep(3000);
		PartnerIdData.sendKeys(Keys.chord(Keys.CONTROL, "a"), PartnerIdValue);
		Thread.sleep(3000);
		DropDownSelection(ProtocolDD, ProtocolValue);
		Thread.sleep(3000);
		DropDownSelection(StatusDD, StatusValue);
		Thread.sleep(3000);
		SearchClick.click();
		
	}

	public void validateMPWithAllFieldsofSFGSFTPexceptPI(String PartnerNameValue, String ProtocolValue,
			String StatusValue) throws InterruptedException {
		ResetClick.click();
		Thread.sleep(3000);
		PartnerNameData.sendKeys(Keys.chord(Keys.CONTROL, "a"), PartnerNameValue);
		Thread.sleep(3000);
		DropDownSelection(ProtocolDD, ProtocolValue);
		Thread.sleep(3000);
		DropDownSelection(StatusDD, StatusValue);
		Thread.sleep(3000);
		
		SearchClick.click();
	}

	public void validateMPWithAllFieldsofOracleEBSexceptProtocol(String PartnerNameValue, String PartnerIdValue,
			String StatusValue) throws InterruptedException {
		ResetClick.click();
		Thread.sleep(3000);
		PartnerNameData.sendKeys(Keys.chord(Keys.CONTROL, "a"), PartnerNameValue);
		PartnerIdData.sendKeys(Keys.chord(Keys.CONTROL, "a"), PartnerIdValue);
		Thread.sleep(3000);
		DropDownSelection(StatusDD, StatusValue);
		Thread.sleep(3000);
		
		SearchClick.click();
	}

	public void validateMPWithAllFieldsofWebServiceexceptStatus(String PartnerNameValue, String PartnerIdValue,
			String ProtocolValue) throws InterruptedException {
		ResetClick.click();
		Thread.sleep(3000);
		PartnerNameData.sendKeys(Keys.chord(Keys.CONTROL, "a"), PartnerNameValue);
		PartnerIdData.sendKeys(Keys.chord(Keys.CONTROL, "a"), PartnerIdValue);
		Thread.sleep(3000);
		DropDownSelection(ProtocolDD, ProtocolValue);
		Thread.sleep(3000);
		
		SearchClick.click();
	}

	public void validateMPWithAllFieldsofExistingConnection(String PartnerNameValue, String PartnerIdValue,
			String ProtocolValue, String StatusValue) throws InterruptedException {
		ResetClick.click();
		Thread.sleep(3000);
		PartnerNameData.sendKeys(Keys.chord(Keys.CONTROL, "a"), PartnerNameValue);
		PartnerIdData.sendKeys(Keys.chord(Keys.CONTROL, "a"), PartnerIdValue);
		Thread.sleep(3000);
		DropDownSelection(ProtocolDD, ProtocolValue);
		Thread.sleep(3000);
		DropDownSelection(StatusDD, StatusValue);
		Thread.sleep(3000);
		
		SearchClick.click();
	}

	public void ValidateMpRecordWithUpdateStatus(String title, int colnum) throws InterruptedException {
		// Find the specific record and clicks on Action Toggle.
		// driver.findElement(By.xpath("//td[text()='"+Activate+"'] [@class='sorting_1']
		// /preceding-sibling::td[@class='text-center']")).click();
		// After Clicking on action toggle again it will click on Activate Button.
		// driver.findElement(By.xpath("//td[text()='"+Activate+"'] [@class='sorting_1']
		// /preceding-sibling::td[@class='text-center']
		// //button[contains(text(),'Activate')]")).click();
		List<WebElement> col = driver.findElements(By.xpath("//table/tbody/tr/td[" + colnum + "]"));
		for (int i = 0; i < col.size(); i++) {

			System.out.println(col.get(i).getText());
			if (title.equals(col.get(i).getText())) {
				i = i + 1;
				JavascriptExecutor jse = (JavascriptExecutor) driver;
				jse.executeScript("window.scrollBy(0,250)", "");
				System.out.println("1");
				driver.findElement(By.xpath("//table/tbody/tr[" + i + "]/td[1]//mat-icon")).click();
				System.out.println("2");
				driver.findElement(By.xpath("(//mat-list//button)[1]")).click();
				driver.findElement(By.xpath("//div[@class='swal2-actions']//button[1]")).click();
				Thread.sleep(3000);
				// button[text()='Yes, activate it']

				break;
			}

		}

	}

	public void ValidateMpRecordWithDeActivate(String DeActivate) throws InterruptedException {
		// Find the specific record and clicks on Action Toggle.
		driver.findElement(By.xpath(
				"//td[text()='" + DeActivate + "']  [@class='sorting_1'] /preceding-sibling::td[@class='text-center']"))
				.click();
		// After Clicking on action toggle again it will click on Activate Button.
		driver.findElement(By.xpath("//td[text()='" + DeActivate
				+ "']  [@class='sorting_1'] /preceding-sibling::td[@class='text-center']  //button[contains(text(),'Deactivate')]"))
				.click();
	}

	public void ValidateMpRecordWithDelete(String title, int colnum) throws InterruptedException {
		// Find the specific record and clicks on Action Toggle.
		// driver.findElement(By.xpath("//td[text()='"+Delete+"'] [@class='sorting_1']
		// /preceding-sibling::td[@class='text-center']")).click();
		// After Clicking on action toggle again it will click on Activate Button.
		// driver.findElement(By.xpath("//td[text()='"+Delete+"'] [@class='sorting_1']
		// /preceding-sibling::td[@class='text-center']
		// //button[contains(text(),'Delete')]")).click();
		// driver.switchTo().alert().accept();
		List<WebElement> col = driver.findElements(By.xpath("//table/tbody/tr/td[" + colnum + "]"));
		for (int i = 0; i < col.size(); i++) {

			System.out.println(col.get(i).getText());
			if (title.equals(col.get(i).getText())) {
				i = i + 1;
				JavascriptExecutor jse = (JavascriptExecutor) driver;
				jse.executeScript("window.scrollBy(0,250)", "");
				driver.findElement(By.xpath("//table/tbody/tr[" + i + "]/td[1]")).click();
				Thread.sleep(1000);
				driver.findElement(By.xpath("//button[text()='Delete']")).click();
				driver.switchTo().alert().accept();
				break;
			}

		}
	}

	public void ValidateMpRecordWithEdit(String title, int colnum) throws InterruptedException {
		// Find the specific record and clicks on Action Toggle.
		// driver.findElement(By.xpath("//td[text()='"+Edit+"'] [@class='sorting_1']
		// /preceding-sibling::td[@class='text-center']")).click();
		// After Clicking on action toggle again it will click on Activate Button.
		// driver.findElement(By.xpath("//td[text()='"+Edit+"'] [@class='sorting_1']
		// /preceding-sibling::td[@class='text-center']
		// //button[contains(text(),'Edit')]")).click();
		List<WebElement> col = driver.findElements(By.xpath("//table/tbody/tr/td[" + colnum + "]"));
		for (int i = 0; i < col.size(); i++) {

			System.out.println(col.get(i).getText());
			if (title.equals(col.get(i).getText())) {
				i = i + 1;
				JavascriptExecutor jse = (JavascriptExecutor) driver;
				jse.executeScript("window.scrollBy(0,250)", "");
				driver.findElement(By.xpath("//table/tbody/tr[" + i + "]/td[1]//mat-icon")).click();
				Thread.sleep(1000);
				driver.findElement(By.xpath("//button[text()='Edit']")).click();
				break;
			}

		}
	}

	public void ValidateMpRecordWithViewActivity(String title, int colnum) throws InterruptedException {
		// Find the specific record and clicks on Action Toggle.
		// driver.findElement(By.xpath("//td[text()='"+Activity+"'] [@class='sorting_1']
		// /preceding-sibling::td[@class='text-center']")).click();
		// After Clicking on action toggle again it will click on Activate Button.
		// driver.findElement(By.xpath("//td[text()='"+Activity+"'] [@class='sorting_1']
		// /preceding-sibling::td[@class='text-center'] //button[contains(text(),'View
		// Partner')]")).click();
		// Actionselection(driver, ViewActivityClick);
		List<WebElement> col = driver.findElements(By.xpath("//table/tbody/tr/td[" + colnum + "]"));
		for (int i = 0; i < col.size(); i++) {

			System.out.println(col.get(i).getText());
			if (title.equals(col.get(i).getText())) {
				i = i + 1;
				JavascriptExecutor jse = (JavascriptExecutor) driver;
				jse.executeScript("window.scrollBy(0,250)", "");
				Thread.sleep(1000);
				driver.findElement(By.xpath("//table/tbody/tr[" + i + "]/td[1]//mat-icon")).click();
				Thread.sleep(1000);
				driver.findElement(By.xpath("//button[text()='Edit']")).click();
				Thread.sleep(5000);
				driver.findElement(By.xpath("//div[text()='Activity']")).click();
				Thread.sleep(1000);
				// ViewActivityClick.click();
				break;
			}

		}
		List<WebElement> row = ActivityLogTable.findElements(By.tagName("tr"));
		ActivitylogData = new StringBuffer();
		for (int j = 1; j < row.size(); j++) {
			ActivitylogData.append(row.get(j).getText() + ", ");
			// System.out.println(ActivityLogdata);
		}
		System.out.println(ActivitylogData.toString());

	}

}
