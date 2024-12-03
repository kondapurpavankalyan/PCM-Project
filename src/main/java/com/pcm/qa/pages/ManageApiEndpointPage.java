package com.pcm.qa.pages;

import com.pcm.qa.base.TestBase;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ManageApiEndpointPage extends TestBase {

	public StringBuffer ActivitylogData;

	@FindBy(xpath = "//span//mat-icon[contains(text(),'menu')]")
	public WebElement ControlMenuClick;

	@FindBy(xpath = "//span[contains(text(),'API Endpoint')]")
	public WebElement APIEndpointModuleClick;

	@FindBy(xpath = "//span[contains(text(),'Manage API Endpoint')]")
	public WebElement ManageAPIEndpointModuleClick;

	@FindBy(xpath = "//span[text()[contains(.,'Endpoint Flow')]]")
	public WebElement EndPointFlowFlowModuleClick;

	@FindBy(xpath = "//mat-card//h4")
	public WebElement MEPpagetitle;

	@FindBy(xpath = "//input[@placeholder='API Name']")
	public WebElement APINameData;

	@FindBy(xpath = "//input[@placeholder='Server URL']")
	public WebElement ServerUrlData;

	@FindBy(xpath = "//mat-select[@aria-label='Web Method']")
	public WebElement WebMethodDD;

	@FindBy(xpath = "(//*[@svgicon='menu-bar'])[1]")
	public WebElement Actionsicon;

	@FindBy(xpath = "//button[contains(text(),'cancel')]")
	public WebElement CancelClick;

	@FindBy(xpath = "//button[contains(text(),'search')]")
	public WebElement SearchClick;

	@FindBy(xpath = "//button[contains(text(),'Update')]")
	public WebElement EditSubmitClick;

	@FindBy(xpath = "//button[contains(text(),'Edit')]")
	public WebElement Editbtn;

	@FindBy(xpath = "//span[contains(text(),'Manage API Endpoint')]")
	public WebElement ManagePartnerClick;

	@FindBy(xpath = "(//h3)")
	public WebElement Partnertitle;

	@FindBy(xpath = "(//h4)")
	public WebElement CreatePartnertitle;

	@FindBy(xpath = "//input[@placeholder='Partner Id']")
	public WebElement PartnerIdData;

	@FindBy(xpath = "//span[contains(text(),'Protocol')]")
	public WebElement ProtocolDD;

	@FindBy(xpath = "//span[contains(text(),'Select')]")
	public WebElement StatusDD;

	@FindBy(xpath = "(//div//h3)[2]")
	public WebElement ErrorMsg;

	@FindBy(xpath = "//div[@id='swal2-content']")
	public WebElement ActionMsg;

	@FindBy(xpath = "//mat-icon[@svgicon='menu-bar']")
	public WebElement Actionbtn;

	@FindBy(xpath = "//div[contains(text(),'Activity')]")
	public WebElement ViewActivityClick;

	@FindBy(xpath = "//table")
	public WebElement ActivityLogTable;

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

	public ManageApiEndpointPage() {
		PageFactory.initElements(driver, this);
	}

	public String ValidateManageApiPageTitle() throws InterruptedException {

		APIEndpointModuleClick.click();

		Thread.sleep(1000);

		ManageAPIEndpointModuleClick.click();

		Thread.sleep(3000);

		String title = MEPpagetitle.getText();

		return title;
	}

	public void ValidateManageAPIWithvalidData(String APINameValue,String WebMethodvalue, String ServerUrl) throws Exception {

		APINameData.sendKeys(Keys.chord(Keys.CONTROL, "a"), APINameValue);
		Thread.sleep(2000);
		DropDownSelection(WebMethodDD, WebMethodvalue);
		Thread.sleep(3000);
		ServerUrlData.sendKeys(Keys.chord(Keys.CONTROL, "a"), ServerUrl);
		Thread.sleep(3000);
		SearchClick.click();
	}

	public void validateManageAPIWithOnlyAPIName(String APINameValue) throws InterruptedException {
		
		Thread.sleep(2000);
		APINameData.sendKeys(Keys.chord(Keys.CONTROL, "a"), APINameValue);
		Thread.sleep(2000);
		SearchClick.click();

	}

	public void validateManageAPIWithOnlyWebMethod(String WebMethodvalue) throws InterruptedException {
		Thread.sleep(2000);
		DropDownSelection(WebMethodDD, WebMethodvalue);
		Thread.sleep(2000);
		SearchClick.click();

	}

	
	public void validateManageAPIWithOnlyServerUrl(String ServerUrl) throws InterruptedException {
		Thread.sleep(2000);
		ServerUrlData.sendKeys(Keys.chord(Keys.CONTROL, "a"), ServerUrl);
		Thread.sleep(3000);
		SearchClick.click();

	}

	public void validateManageAPIWithOnlyAPIName_WebMethod(String APIname, String WebMethod)
			throws InterruptedException {

		APINameData.sendKeys(Keys.chord(Keys.CONTROL, "a"), APIname);
		Thread.sleep(2000);
		DropDownSelection(WebMethodDD, WebMethod);
		Thread.sleep(3000);
		SearchClick.click();

	}

	public void validateManageAPIWithOnlyAPIName_ServerUrl(String APIname, String ServerUrl)
			throws InterruptedException {

		APINameData.sendKeys(Keys.chord(Keys.CONTROL, "a"), APIname);
		Thread.sleep(2000);
		ServerUrlData.sendKeys(Keys.chord(Keys.CONTROL, "a"), ServerUrl);
		Thread.sleep(3000);
		SearchClick.click();

	}
	
	public void validateManageAPIWithOnlyWebMethod_ServerUrl(String WebMethod, String ServerUrl)
			throws InterruptedException {

		Thread.sleep(3000);
		DropDownSelection(WebMethodDD, WebMethod);
		Thread.sleep(3000);
		ServerUrlData.sendKeys(Keys.chord(Keys.CONTROL, "a"), ServerUrl);
		Thread.sleep(3000);
		SearchClick.click();

	}

	public void ValidateManageAPIWithInvalidData(String APINameValue,String WebMethodvalue, String ServerUrl) throws Exception {

		Thread.sleep(1000);
		APINameData.sendKeys(Keys.chord(Keys.CONTROL, "a"), APINameValue);
		Thread.sleep(2000);
		DropDownSelection(WebMethodDD, WebMethodvalue);
		Thread.sleep(3000);
		ServerUrlData.sendKeys(Keys.chord(Keys.CONTROL, "a"), ServerUrl);
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
