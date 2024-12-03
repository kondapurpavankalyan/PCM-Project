package com.pcm.qa.pages;

	import org.openqa.selenium.Keys;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;

	import com.pcm.qa.base.TestBase;

	public class TransVolbyDocTypePage extends TestBase{
		
	@FindBy(xpath = "//span[contains(text(),'Reports')]")
	public WebElement ReportClick;
	
	@FindBy(xpath = "//span//mat-icon[contains(text(),'menu')]")
	public WebElement ControlMenuClick;
	
	@FindBy(xpath="//span[contains(text(),'Transactions Volume By DocType')]")
	public WebElement TransVolbyDocTypeClick;
	
	@FindBy(xpath="//input[@name='start']")
	public WebElement DateStartData;
	
	@FindBy(xpath="//input[@name='end']")
	public WebElement DateEndData;
	
	@FindBy(xpath="//button[contains(text(),' GENERATE REPORT ')]")
	public WebElement GeneratesDocTypeReportClick;
	
	@FindBy(xpath="//button[contains(text(),'RESET SEARCH')]")
	public WebElement ResetSearchClick;
	
	@FindBy(xpath="(//div//h3)[2]")
	public WebElement transvolbyDocTypeHeader;
	
	@FindBy(xpath="(//div//mat-card//h3)[3]")
	public WebElement ErrorMsg;
	
	@FindBy(xpath="//h2[@class='swal2-title']")
	public WebElement ErrorMsg1;

	 public TransVolbyDocTypePage() {
	PageFactory.initElements(driver, this);
	}
	 
	public String validateTransVolbyDocTypePageTitle() throws Exception{
	
	Thread.sleep(2000);

	TransVolbyDocTypeClick.click();
	Thread.sleep(3000);
	return transvolbyDocTypeHeader.getText();
	}
	
	/* public void ValidatTransVolbyDocTypeResultWithvalidData() throws InterruptedException {
	DateStartData.sendKeys("08/23/2018 15:09:10");
	DateEndData.sendKeys("10/23/2018 15:09:10");
	GeneratesDocTypeReportClick.click();

	}*/

	public void ValidatTransVolbyDocTypeResultWithvalidData() throws InterruptedException {
	DateStartData.sendKeys(Keys.chord(Keys.CONTROL, "a"), "06/30/2021 15:09:10");
	Thread.sleep(1000);
	DateEndData.sendKeys(Keys.chord(Keys.CONTROL, "a"), "08/31/2021 15:09:10");
	Thread.sleep(2000);
	GeneratesDocTypeReportClick.click();
	}
	
	public void ValidatTransVolbyDocTypeResultWithInvalidData() throws InterruptedException {
	DateStartData.sendKeys(Keys.chord(Keys.CONTROL, "a"), "09/01/2018 15:09:10");
	Thread.sleep(1000);
	DateEndData.sendKeys(Keys.chord(Keys.CONTROL, "a"), "08/26/2018 15:09:10");
	Thread.sleep(2000);
	GeneratesDocTypeReportClick.click();
	}
	
	public void ValidatTransVolbyDocTypeResultWithInvalidFormat() throws InterruptedException {
	DateStartData.sendKeys(Keys.chord(Keys.CONTROL, "a"), "../,,/2018 15:09:10");
	Thread.sleep(1000);
	DateEndData.sendKeys(Keys.chord(Keys.CONTROL, "a"), "08/dfg/20.8 15:09:10");
	Thread.sleep(2000);
	GeneratesDocTypeReportClick.click();
	}
	

}
