package com.pcm.qa.pages;

import com.pcm.qa.base.TestBase;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ManageApplicationPage extends TestBase {

	public StringBuffer ActivitylogData;

	@FindBy(xpath = "//span//mat-icon[contains(text(),'menu')]")
	public WebElement ControlMenuClick;

	@FindBy(xpath = "//div[@class='mat-drawer-inner-container']//mat-nav-list[4]")
	public WebElement ApplicationClick;

	@FindBy(xpath = "//span[contains(text(),'Manage Application')]")
	public WebElement ManageApplicationClick;

	@FindBy(xpath = "(//h3)")
	public WebElement Applicationtitle;

	@FindBy(xpath = "(//h4)")
	public WebElement CreateApplicationtitle;

	@FindBy(xpath = "//input[@placeholder='Application Name']")
	public WebElement ApplicationNameData;

	@FindBy(xpath = "//input[@placeholder='Application Id']")
	public WebElement ApplicationIdData;

	@FindBy(xpath = "//span[contains(text(),'Protocol')]")
	public WebElement ProtocolDD;

	@FindBy(xpath = "//span[contains(text(),'Select')]")
	public WebElement StatusDD;

	@FindBy(xpath = "//button[contains(text(),'Reset Search')]")
	public WebElement ResetClick;

	@FindBy(xpath = "//button[contains(text(),'Search Application')]")
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

	@FindBy(xpath = "//button[contains(text(),'Submit')]")
	public WebElement EditSubmitClick;

	@FindBy(xpath = "//mat-card//h4")
	public WebElement MApagetitle;

	@FindBy(xpath = "//button[contains(text(),'Edit')]")
	public WebElement Editbtn;

	@FindBy(xpath = "//button[@class='btn btn-pcm-delete']")
	public WebElement DeleteClick;

	@FindBy(xpath = "//button[contains(text(),'Yes, delete it!')]")
	public WebElement yesDeleteitClick;

	@FindBy(xpath = "//button[text()='Deactivate']")
	public WebElement DeactivateClick;

	@FindBy(xpath = "//button[contains(text(),'Yes, deactivate it')]")
	public WebElement yesDeactivateitClick;

	@FindBy(xpath = "//button[text()='Activate']")
	public WebElement ActivateClick;

	@FindBy(xpath = "//button[contains(text(),'Yes, activate it')]")
	public WebElement yesActivateitClick;

	public ManageApplicationPage() {
		PageFactory.initElements(driver, this);
	}

	public String ValidateManageApplicationPageTitle() throws InterruptedException {

		 ApplicationClick.click();
		Thread.sleep(1000);

		ManageApplicationClick.click();

		Thread.sleep(2000);

		String title = MApagetitle.getText();

		return title;
	}

	public void ValidateManageApplicationWithInvalidData() throws Exception {

		ApplicationNameData.sendKeys(Keys.chord(Keys.CONTROL, "a"), "softwaretesting");
		ApplicationIdData.sendKeys(Keys.chord(Keys.CONTROL, "a"), "softwaretesting");
		Thread.sleep(2000);
		DropDownSelection(ProtocolDD, "B2Bi-FTP");
		Thread.sleep(2000);
		DropDownSelection(StatusDD, "Active");
		Thread.sleep(2000);
		SearchClick.click();
	}

	public void ValidateManageApplicationWithvalidData() throws Exception {

		ApplicationNameData.sendKeys(Keys.chord(Keys.CONTROL, "a"), "Applicationautomationtest");
		ApplicationIdData.sendKeys(Keys.chord(Keys.CONTROL, "a"), "Applicationautomationtest");
		Thread.sleep(2000);
		DropDownSelection(ProtocolDD, "SAP");
		Thread.sleep(2000);
		// DropDownSelection(StatusDD, "Inactive");
		Thread.sleep(2000);
		SearchClick.click();
	}

	public void ValidateManageApplicationWithvalidData1() throws Exception {

		ApplicationNameData.sendKeys(Keys.chord(Keys.CONTROL, "a"), "ApplicationAutomation1");
		ApplicationIdData.sendKeys(Keys.chord(Keys.CONTROL, "a"), "ApplicationAutomation1");
		Thread.sleep(2000);
		DropDownSelection(ProtocolDD, "SAP");
		Thread.sleep(2000);
		// DropDownSelection(StatusDD, "Inactive");
		Thread.sleep(2000);
		SearchClick.click();
	}

	
	public void validateManageApplicationWithOnlyApplicationName_Applicationid_protocol_statusasInactive(String ApplicationNameValue,
			String ApplicationIdValue, String ProtocolValue, String StatusValue) throws InterruptedException {

		ApplicationNameData.sendKeys(Keys.chord(Keys.CONTROL, "a"), ApplicationNameValue);
		ApplicationIdData.sendKeys(Keys.chord(Keys.CONTROL, "a"), ApplicationIdValue);
		Thread.sleep(2000);
		DropDownSelection(ProtocolDD, ProtocolValue);
		Thread.sleep(2000);
		DropDownSelection(StatusDD, StatusValue);

		Thread.sleep(2000);
		SearchClick.click();

	}
	
	public void validateManageApplicationWithOnlyApplicationName_Applicationid_protocol_statusasActive(String ApplicationNameValue,
			String ApplicationIdValue, String ProtocolValue, String StatusValue) throws InterruptedException {

		ApplicationNameData.sendKeys(Keys.chord(Keys.CONTROL, "a"), ApplicationNameValue);
		ApplicationIdData.sendKeys(Keys.chord(Keys.CONTROL, "a"), ApplicationIdValue);
		Thread.sleep(2000);
		DropDownSelection(ProtocolDD, ProtocolValue);
		Thread.sleep(2000);
		DropDownSelection(StatusDD, StatusValue);

		Thread.sleep(2000);
		SearchClick.click();

	}
	
	public void validateManageApplicationWithOnlyApplicationName(String ApplicationNameValue)
			throws InterruptedException {

		ApplicationNameData.sendKeys(Keys.chord(Keys.CONTROL, "a"), ApplicationNameValue);
		Thread.sleep(1000);
		SearchClick.click();

	}

	public void validateManageApplicationWithOnlyApplicationId(String ApplicationIdValue) throws InterruptedException {
		ApplicationIdData.sendKeys(Keys.chord(Keys.CONTROL, "a"), ApplicationIdValue);
		Thread.sleep(1000);
		SearchClick.click();

	}

	public void validateManageApplicationWithOnlyProtocol(String ProtocolValue, String ApplicationNameValue)
			throws InterruptedException {
		ApplicationNameData.sendKeys(Keys.chord(Keys.CONTROL, "a"), ApplicationNameValue);
		DropDownSelection(ProtocolDD, ProtocolValue);
		Thread.sleep(1000);
		SearchClick.click();

	}

	public void validateManageApplicationWithOnlyStatus(String StatusValue, String ApplicationNameValue)
			throws InterruptedException {
		ResetClick.click();
		ApplicationNameData.sendKeys(Keys.chord(Keys.CONTROL, "a"), ApplicationNameValue);
		DropDownSelection(StatusDD, StatusValue);
		SearchClick.click();
		SearchClick.click();
	}

	public void validateMPWithPNOfFTPandStatusInactive(String ApplicationNameValue, String StatusInactive)
			throws InterruptedException {
		ResetClick.click();
		ApplicationNameData.sendKeys(Keys.chord(Keys.CONTROL, "a"), ApplicationNameValue);
		DropDownSelection(StatusDD, StatusInactive);
		SearchClick.click();
		SearchClick.click();

	}

	public void validateMPWithPNOfFTPSandStatusActive(String ApplicationNameValue, String StatusActive)
			throws InterruptedException {
		ResetClick.click();
		ApplicationNameData.sendKeys(Keys.chord(Keys.CONTROL, "a"), ApplicationNameValue);
		DropDownSelection(StatusDD, StatusActive);
		SearchClick.click();
		SearchClick.click();

	}

	public void validateMPWithPNofSFTPandProtocolofSFTP(String ApplicationNameValue, String ProtocolValue)
			throws InterruptedException {
		ResetClick.click();
		ApplicationNameData.sendKeys(Keys.chord(Keys.CONTROL, "a"), ApplicationNameValue);
		DropDownSelection(ProtocolDD, ProtocolValue);
		SearchClick.click();
		SearchClick.click();
	}

	public void validateMPWithPNofHTTPandPIofHTTP(String ApplicationNameValue, String ApplicationIdValue)
			throws InterruptedException {
		ResetClick.click();
		ApplicationNameData.sendKeys(Keys.chord(Keys.CONTROL, "a"), ApplicationNameValue);
		ApplicationIdData.sendKeys(Keys.chord(Keys.CONTROL, "a"), ApplicationIdValue);
		SearchClick.click();
		SearchClick.click();
	}

	public void validateMPWithPIofHTTPSandProtocolofHTTPS(String IdValue, String ProtocolValue)
			throws InterruptedException {
		ResetClick.click();
		ApplicationIdData.sendKeys(Keys.chord(Keys.CONTROL, "a"), IdValue);
		DropDownSelection(ProtocolDD, ProtocolValue);
		SearchClick.click();
		SearchClick.click();
	}

	public void validateMPWithPIofMBandStatusofInactive(String IdValue, String StatusValue)
			throws InterruptedException {
		ResetClick.click();
		ApplicationIdData.sendKeys(Keys.chord(Keys.CONTROL, "a"), IdValue);
		DropDownSelection(StatusDD, StatusValue);
		SearchClick.click();
		SearchClick.click();
	}

	public void validateMPWithPIofMQandStatusofActive(String IdValue, String StatusValue) throws InterruptedException {
		ResetClick.click();
		ApplicationIdData.sendKeys(IdValue);
		DropDownSelection(StatusDD, StatusValue);
		SearchClick.click();
		SearchClick.click();
	}

	public void validateMPWithProtocolofSAPandStatusofInactive(String Protocol, String StatusValue)
			throws InterruptedException {
		ResetClick.click();
		DropDownSelection(ProtocolDD, Protocol);
		DropDownSelection(StatusDD, StatusValue);
		SearchClick.click();
		SearchClick.click();
	}

	public void validateMPWithProtocolofSMTPandStatusofActive(String Protocol, String StatusValue)
			throws InterruptedException {
		ResetClick.click();
		DropDownSelection(ProtocolDD, Protocol);
		DropDownSelection(StatusDD, StatusValue);
		SearchClick.click();
		SearchClick.click();
	}

	public void validateMPWithAllFieldsofSFGFTP(String ApplicationNameValue, String ApplicationIdValue,
			String ProtocolValue, String StatusValue) throws InterruptedException {
		ResetClick.click();
		ApplicationNameData.sendKeys(Keys.chord(Keys.CONTROL, "a"), ApplicationNameValue);
		ApplicationIdData.sendKeys(Keys.chord(Keys.CONTROL, "a"), ApplicationIdValue);
		DropDownSelection(ProtocolDD, ProtocolValue);
		DropDownSelection(StatusDD, StatusValue);
		SearchClick.click();
		SearchClick.click();
	}

	public void validateMPWithAllFieldsofSFGFTPSexceptPN(String ApplicationIdValue, String ProtocolValue,
			String StatusValue) throws InterruptedException {
		ResetClick.click();
		ApplicationIdData.sendKeys(Keys.chord(Keys.CONTROL, "a"), ApplicationIdValue);
		DropDownSelection(ProtocolDD, ProtocolValue);
		DropDownSelection(StatusDD, StatusValue);
		SearchClick.click();
		SearchClick.click();
	}

	public void validateMPWithAllFieldsofSFGSFTPexceptPI(String ApplicationNameValue, String ProtocolValue,
			String StatusValue) throws InterruptedException {
		ResetClick.click();
		ApplicationNameData.sendKeys(Keys.chord(Keys.CONTROL, "a"), ApplicationNameValue);
		DropDownSelection(ProtocolDD, ProtocolValue);
		DropDownSelection(StatusDD, StatusValue);
		SearchClick.click();
		SearchClick.click();
	}

	public void validateMPWithAllFieldsofOracleEBSexceptProtocol(String ApplicationNameValue, String ApplicationIdValue,
			String StatusValue) throws InterruptedException {
		ResetClick.click();
		ApplicationNameData.sendKeys(Keys.chord(Keys.CONTROL, "a"), ApplicationNameValue);
		ApplicationIdData.sendKeys(Keys.chord(Keys.CONTROL, "a"), ApplicationIdValue);
		DropDownSelection(StatusDD, StatusValue);
		SearchClick.click();
		SearchClick.click();
	}

	public void validateMPWithAllFieldsofWebServiceexceptStatus(String ApplicationNameValue, String ApplicationIdValue,
			String ProtocolValue) throws InterruptedException {
		ResetClick.click();
		ApplicationNameData.sendKeys(Keys.chord(Keys.CONTROL, "a"), ApplicationNameValue);
		ApplicationIdData.sendKeys(Keys.chord(Keys.CONTROL, "a"), ApplicationIdValue);
		DropDownSelection(ProtocolDD, ProtocolValue);
		SearchClick.click();
		SearchClick.click();
	}

	public void validateMPWithAllFieldsofExistingConnection(String ApplicationNameValue, String ApplicationIdValue,
			String ProtocolValue, String StatusValue) throws InterruptedException {
		ResetClick.click();
		ApplicationNameData.sendKeys(Keys.chord(Keys.CONTROL, "a"), ApplicationNameValue);
		ApplicationIdData.sendKeys(Keys.chord(Keys.CONTROL, "a"), ApplicationIdValue);
		DropDownSelection(ProtocolDD, ProtocolValue);
		DropDownSelection(StatusDD, StatusValue);
		SearchClick.click();
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
				Thread.sleep(2000);
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
		// Application')]")).click();
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
				Thread.sleep(3000);
				driver.findElement(By.xpath("//button[text()='Edit']")).click();
				Thread.sleep(7000);
				driver.findElement(By.xpath("//div[text()='Activity']")).click();
				Thread.sleep(3000);
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
