package com.pcm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.pcm.qa.base.TestBase;

public class FileJobSchedularPage extends TestBase{
	
	
	
	@FindBy(xpath = "//button[@class='mat-icon-button']")
	public WebElement ControlMenuClick;
	
	@FindBy(xpath = "(//*[text()[contains(.,'Setting')]])[1]")
	public WebElement SettingClick;
	
	@FindBy(xpath = "//span[text()[contains(.,'File Job Scheduler')]]")
	public WebElement FileJobSchedularclick;
	
	@FindBy(xpath = "(//h4)[1]")
	public WebElement FileJobSchedularheadertitle;
	
	
	
	public FileJobSchedularPage() {
		
		PageFactory.initElements(driver, this);
	}
	
	
	public String FileJobSchedularPageTitle() throws InterruptedException {

		
		//SettingClick.click();
		Thread.sleep(1000);
		
		FileJobSchedularclick.click();
		Thread.sleep(2000);
		return FileJobSchedularheadertitle.getText();
		

	}
	

}
