package com.pcm.qa.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.pcm.qa.base.TestBase;

public class TransVolReportPage extends TestBase {

	@FindBy(xpath = "(//span[contains(text(),'Transactions Volume')])[1]")
	public WebElement TransVolReportClick;
	
	@FindBy(xpath = "//input[@name='start']")
	public WebElement DateStartData;
	
	@FindBy(xpath = "//span[contains(text(),'Reports')]")
	public WebElement ReportClick;
	
	@FindBy(xpath = "//span//mat-icon[contains(text(),'menu')]")
	public WebElement ControlMenuClick;
	
	@FindBy(xpath = "//input[@name='end']")
	public WebElement DateEndData;
	
	@FindBy(xpath = "//button[contains(text(),' GENERATE REPORT ')]")
	public WebElement GeneratesReportClick;
	
	@FindBy(xpath = "//button[contains(text(),'RESET SEARCH')]")
	public WebElement ResetSearchClick;
	
	@FindBy(xpath = "(//div//h3)[2]")
	public WebElement transvolHeader;

	@FindBy(xpath = "(//div//mat-card//h3)[3]")
	public WebElement ErrorMsg;
	
	@FindBy(xpath = "//div[@id='swal2-content']")
	public WebElement ErrorMsg1;
	
	@FindBy(xpath = "//button[contains(text(),'OK')]")
	public WebElement Error1MessageOkclick;

	public TransVolReportPage() {
		PageFactory.initElements(driver, this);
	}

	public String validateTransVolReportPageTitle() throws Exception {
		
		Thread.sleep(2000);
		
		TransVolReportClick.click();
		Thread.sleep(3000);
		return transvolHeader.getText();
	}

	public void ValidatTransVolReportResultWithvalidData() throws InterruptedException {
		DateStartData.sendKeys(Keys.chord(Keys.CONTROL, "a"), "1/1/2021, 9:26 PM");
		Thread.sleep(1000);
		DateEndData.sendKeys(Keys.chord(Keys.CONTROL, "a"), "8/30/2021, 9:26 PM");
		Thread.sleep(2000);
		GeneratesReportClick.click();
	}

	public void ValidatTransVolReportResultWithInvalidData() throws InterruptedException {
		DateStartData.sendKeys(Keys.chord(Keys.CONTROL, "a"), "08/26/2018 15:09:10");
		Thread.sleep(1000);
		DateEndData.sendKeys(Keys.chord(Keys.CONTROL, "a"), "08/26/2018 15:09:10");
		Thread.sleep(2000);
		GeneratesReportClick.click();
	}

	public void ValidatTransVolReportResultWithInvalidFormat() throws InterruptedException {
		DateStartData.sendKeys(Keys.chord(Keys.CONTROL, "a"), "../,,/2018 15:09:10");
		Thread.sleep(1000);
		DateEndData.sendKeys(Keys.chord(Keys.CONTROL, "a"), "08/dfg/20.8 15:09:10");
		Thread.sleep(2000);
		GeneratesReportClick.click();
		
	}

}
