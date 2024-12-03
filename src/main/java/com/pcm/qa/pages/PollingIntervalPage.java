package com.pcm.qa.pages;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.pcm.qa.base.TestBase;

public class PollingIntervalPage  extends TestBase{
	
	
	@FindBy(xpath = "(//*[text()[contains(.,'Setting')]])[1]")
	public WebElement SettingClick;

	@FindBy(xpath = "(//*[text()[contains(.,'Polling Interval')]])[1]")
	public WebElement PoolingIntervalClick;

	@FindBy(xpath = "//button[@class='btn btn-primary pooling-btn']")
	public WebElement SavePoolingIntervalClick;

	@FindBy(xpath = "//button[@class='btn btn-pcm-1 pooling-btn']")
	public WebElement AddPoolingIntervalClick;

	@FindBy(xpath = "//td[2]//input")
	public WebElement IntervalValueData;

	@FindBy(xpath = "//td[3]//input")
	public WebElement IntervalNameData;

	@FindBy(xpath = "//td[4]//input")
	public WebElement DescriptionData;

	@FindBy(xpath = "//*[text()[contains(.,' CREATE ')]]")
	public WebElement CreateClick;

	@FindBy(xpath = "(//*[text()[contains(.,'CANCEL')]])[1]")
	public WebElement CancelClick;

	@FindBy(xpath = "(//*[text()[contains(.,' EDIT ')]])[4]") //modify int value according to row no
	public WebElement EditClick;

	@FindBy(xpath = "(//*[text()[contains(.,' DELETE ')]])[4]") //modify int value according to row no
	public WebElement DeleteClick;

	@FindBy(xpath = "//button[@class='swal-button swal-button--confirm swal-button--danger']")
	public WebElement DeleteOkbuttonClick;

	@FindBy(xpath = "//button[@class='swal-button swal-button--cancel']")
	public WebElement DeleteCancelbuttonClick;

	@FindBy(xpath = "(//button[contains(text(),'OK')])[2]")
	public WebElement OkButtonClick;
	
	@FindBy(xpath = "//*[text()[contains(.,' UPDATE ')]]")
	public WebElement UpdateClick;

	@FindBy(xpath = "(//h3//b)[2]")
	public WebElement PoolingIntervalpagetitle;

	@FindBy(xpath = "//div[@id='swal2-content']")
	public WebElement Actionmessage;

	//@FindBy(xpath = "(//*[text()[contains(.,'Create Partner')]])/../div[@class='mat-list-item-ripple mat-ripple']")
	//public WebElement CreatePartnerClick;

	//@FindBy(xpath = "(//*[text()[contains(.,'Partner')]])[1]/../div[@class='mat-list-item-ripple mat-ripple']")
	//public WebElement PartnerClick;
	
	@FindBy(xpath = "//*[text()[contains(.,'Correlation Names')]]")
	public WebElement CorrelationNamesClick;
	
	
	public PollingIntervalPage() {
		PageFactory.initElements(driver, this);
	}
	

	public String ValidatePollingIntervalPageTitle() throws InterruptedException {

		
//		SettingClick.click();
//		Thread.sleep(1000);
		
		PoolingIntervalClick.click();
		Thread.sleep(2000);
		return PoolingIntervalpagetitle.getText();

	}

	public void ValidatePollingIntervalwithValidData() throws InterruptedException, Exception {
		// Actionselection(driver, PoolingIntervalClick);
		Thread.sleep(1000);
		//Actionselection(driver, AddPoolingIntervalClick);
		AddPoolingIntervalClick.click();
		Thread.sleep(1000);
		IntervalValueData.sendKeys(Keys.chord(Keys.CONTROL, "a"), "1Y");
		Thread.sleep(1000);
		IntervalNameData.sendKeys(Keys.chord(Keys.CONTROL, "a"), "1Year");
		//IntervalNameData.sendKeys("1Year");
		Thread.sleep(1000);
		DescriptionData.sendKeys(Keys.chord(Keys.CONTROL, "a"), "1Year Pick");
		Thread.sleep(1000);
		//Actionselection(driver, CreateClick);
		CreateClick.click();
		//Actionselection(driver, SavePoolingIntervalClick);
		SavePoolingIntervalClick.click();
	}

	public void ValidatePollingIntervalwithEdit() throws InterruptedException {
		//Actionselection(driver, PoolingIntervalClick);
		//Thread.sleep(10000);
		//Actionselection(driver, AddPoolingIntervalClick);
		//Thread.sleep(1000);
		//Actionselection(driver, EditClick);
		EditClick.click();
		Thread.sleep(1000);
		IntervalValueData.sendKeys(Keys.chord(Keys.CONTROL, "a"), "1Y1");
		Thread.sleep(1000);
		IntervalNameData.sendKeys(Keys.chord(Keys.CONTROL, "a"), "1Year1");
		Thread.sleep(1000);
		DescriptionData.sendKeys(Keys.chord(Keys.CONTROL, "a"), "1Year1 Pick");
		Thread.sleep(1000);
		//Actionselection(driver, UpdateClick);
		UpdateClick.click();
		//Actionselection(driver, CreateClick);
		//Actionselection(driver, SavePoolingIntervalClick);
		SavePoolingIntervalClick.click();
	
	
	}
	
	public void ValidatePollingIntervalwithDelete() throws InterruptedException {
		//Actionselection(driver, PoolingIntervalClick);
		
		//Actionselection(driver, AddPoolingIntervalClick);
		//Thread.sleep(1000);
		//Actionselection(driver, DeleteClick);
		DeleteClick.click();
		Thread.sleep(1000);
		//Actionselection(driver, DeleteOkbuttonClick);
		DeleteOkbuttonClick.click();
		Thread.sleep(1000);
		//Actionselection(driver, SavePoolingIntervalClick);
		SavePoolingIntervalClick.click();
		
	}
	
	public void ValidatePollingIntervalwithEmptyFields() throws InterruptedException {
		//Actionselection(driver, PoolingIntervalClick);
		//Thread.sleep(1000);
		//Actionselection(driver, AddPoolingIntervalClick);
		AddPoolingIntervalClick.click();
		Thread.sleep(2000);
		//Actionselection(driver, CreateClick);
		CreateClick.click();
		Thread.sleep(2000);
		//OkButtonClick.click();
		//Thread.sleep(1000);
	   //Actionselection(driver, SavePoolingIntervalClick);
	//	SavePoolingIntervalClick.click();
	//	Thread.sleep(2000);
//		Thread.sleep(1000);
//		CancelClick.click();
//		SavePoolingIntervalClick.click();
	}
	
	
}
