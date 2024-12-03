package com.pcm.qa.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.pcm.qa.base.TestBase;

public class EndpointFlowPage extends TestBase {

	@FindBy(xpath = "//span[contains(text(),'API Endpoint')]")
	public WebElement APIEndpointModuleClick;

	@FindBy(xpath = "//span[text()[contains(.,'Endpoint Flow')]]")
	public WebElement EndPointFlowFlowModuleClick;

	@FindBy(xpath = "//mat-select[@aria-label='Frontend Gateway']")
	public WebElement FrontendGatewayDD;

	@FindBy(xpath = "//button[@class='btn btn-primary ng-star-inserted']")
	public WebElement SearchFlowClick;

	@FindBy(xpath = "//button[@class='btn btn-pcm-1']")
	public WebElement SetUPFlowClick;

	@FindBy(xpath = "(//button[@class='btn btn-info'])[1]")
	public WebElement ResetSearchClick;

	@FindBy(xpath = "//div[@class='mat-tab-label-content' and contains(text(),'ACTIVITY')]")
	public WebElement ActivityClick;

	@FindBy(xpath = "//table[@id='pcmFaxActivityHistoryTbl']/tbody/tr")
	public WebElement ActivityLogTable;

	@FindBy(xpath = "//a[contains(text(),'Add Flow')]")
	public WebElement AddFlowbtn;

	@FindBy(xpath = "(//input[@placeholder='Method Name *'])[1]")
	public WebElement MethodNameData;

	@FindBy(xpath = "(//input[@placeholder='Filter'])[1]")
	public WebElement FilterData;

	@FindBy(xpath = "(//input[@placeholder='Description'])[1]")
	public WebElement DescriptionData;

	@FindBy(xpath = "//a[contains(text(),'Add Flow')]")
	public WebElement AddFlowClick;

	@FindBy(xpath = "//a[contains(text(),'Create')]")
	public WebElement Createclick;

	@FindBy(xpath = "//button[@class='btn btn-primary']")
	public WebElement SaveFlowClick;

	@FindBy(xpath = "//button[contains(text(),'OK')]")
	public WebElement ErrorMessageOKbtn;

	@FindBy(xpath = "//a[contains(text(),'Rules')]")
	public WebElement Rulesclick;

	@FindBy(xpath = "//a[contains(.,'Update')]")
	public WebElement UpdateClick;

	@FindBy(xpath = "//ul//li[text()='SourceFileArchive']")
	public WebElement OutboundRulesList1Click;

	@FindBy(xpath = "//ul//li[text()='DestFileArchive']")
	public WebElement OutboundRulesList2Click;

	@FindBy(xpath = "//ul//li[text()='SourceFileArchive']")
	public WebElement RulesList1Click;

	@FindBy(xpath = "//ul//li[text()='DestFileArchive']")
	public WebElement RulesList2Click;

	@FindBy(xpath = "//ul//li[text()='DropProcess']")
	public WebElement RulesList3Click;

	@FindBy(xpath = "(//button[@class='btn btn-info'])[2]")
	public WebElement CancelClick;

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

	@FindBy(xpath = "//div[@class='selected-list']//li[contains(.,' DropProcess ')]")
	public WebElement IAppliedRulesListClick1;
	
	@FindBy(xpath = "//div[@class='selected-list']//li[contains(.,' DestFileArchive ')]")
	public WebElement IAppliedRulesListClick2;

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

	@FindBy(xpath = "(//button[text()=' SAVE '])[2]")
	public WebElement SavePropertiesClick;

	@FindBy(xpath = "//mat-panel-title[contains(text(),' RULES ')]")
	public WebElement minimizerules;

	@FindBy(xpath = "(//button[text()=' SAVE '])[3]")
	public WebElement SaveRulesClick;

	@FindBy(xpath = "//div[@class='selected-list']//li[contains(.,' SourceFileArchive ')]")
	public WebElement OAppliedRulesListClick;

	@FindBy(xpath = "//div[@class='selected-list']//li[contains(.,' DestFileArchive ')]")
	public WebElement OAppliedRulesListClick1;

	@FindBy(xpath = "//div[@id='swal2-content']")
	public WebElement ErrorMessage;

	@FindBy(xpath = "//div[@id='swal2-content']")
	public WebElement ErrorMessageImport;

	@FindBy(xpath = "//button[contains(.,' DELETE DATAFLOW ')]")
	public WebElement DeleteWorkflowClick;

	@FindBy(xpath = "//button[contains(.,'Delete')]")
	public WebElement yesDelete;

	@FindBy(xpath = "(//div//h3)[2]")
	public WebElement EndpointFlowtitle;

	public EndpointFlowPage() {
		PageFactory.initElements(driver, this);
	}

	public String validateEndPointFlowPageTitle() throws InterruptedException {

		APIEndpointModuleClick.click();
		Thread.sleep(1000);

		EndPointFlowFlowModuleClick.click();
		Thread.sleep(2000);

		return EndpointFlowtitle.getText();
	}

	public void EPFProfileSelection(String FrontendgatewayName) throws Throwable {
		Thread.sleep(1000);
		DropDownSelection(FrontendGatewayDD, FrontendgatewayName);
		Thread.sleep(1000);

	}

	public void EndpointValues(String MethodNameValue, String FilterValue, String Descriptionvalue) {

		MethodNameData.sendKeys(Keys.chord(Keys.CONTROL, "a"), MethodNameValue);
		FilterData.sendKeys(Keys.chord(Keys.CONTROL, "a"), FilterValue);
		DescriptionData.sendKeys(Keys.chord(Keys.CONTROL, "a"), Descriptionvalue);

	}

	public void Table(String title, int colnum, String Rule_Edit_Delete) throws InterruptedException {
		List<WebElement> col = driver.findElements(By.xpath("//table//tbody/tr//td[" + colnum + "]"));
		for (int i = 0; i < col.size(); i++) {
			System.out.println(col.get(i).getText());
			if (Rule_Edit_Delete.equals("Rule") && (title.equals(col.get(i).getText()))) {
				i = i + 1;

				driver.findElement(By.xpath("(//table//tbody/tr[" + i + "]/td[5]//a)[1]")).click();
				break;

			} else if (Rule_Edit_Delete.equals("Edit") && (title.equals(col.get(i).getText()))) {
				i = i + 1;
				Thread.sleep(1000);
				driver.findElement(By.xpath("(//table//tbody/tr[" + i + "]/td[5]//a)[2]")).click();
				break;

			} else if (Rule_Edit_Delete.equals("Delete") && (title.equals(col.get(i).getText()))) {
				i = i + 1;

				Thread.sleep(1000);
				driver.findElement(By.xpath("(//table//tbody/tr[" + i + "]/td[5]//a)[3]")).click();
				yesDelete.click();

				break;

			}
		}
	}

	public void selectrule(String rulename) {

		List<WebElement> list = driver.findElements(By.xpath("//ul//li"));

		for (int i = 0; i <= list.size(); i++) {

			if (list.get(i).getText().equals(rulename)) {

				list.get(i).click();
				break;

			}

		}
	}

}
