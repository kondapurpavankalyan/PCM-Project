package com.pcm.qa.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.pcm.qa.base.TestBase;

public class ManageRulePage extends TestBase{
	
	@FindBy(xpath = "//span//mat-icon[contains(text(),'menu')]")
	public WebElement ControlMenuClick;
	
	@FindBy(xpath = "//span[contains(text(),'Data Flows')]")
	public WebElement DataFlowsClick;
	
	@FindBy(xpath = "//span[contains(text(),'Manage Rule')]")
	public WebElement ManageRuleClick;
	
	@FindBy(xpath = "//input[@placeholder='Rule Name']")
	public WebElement RuleNameData;
	
	@FindBy(xpath = "//span[contains(text(),'Business Process')]")
	public WebElement BuisinessProcessDD;
	
	@FindBy(xpath = "//button[@class='btn btn-primary']")
	public WebElement SearchActionClick;
	
	@FindBy(xpath = "//button[@class='btn btn-info']")
	public WebElement ResetSearchClick;
	
	@FindBy(xpath = "//input[@placeholder='Search ']")
	public WebElement SearchData;
	
	@FindBy(xpath = "//select[@name='pcmGroupResultsTbl_length']")
	public WebElement ShowDD;
	
	@FindBy(xpath = "//div[@id='swal2-content']")
	public WebElement ActionMsg;
	
	@FindBy(xpath = "//div[@id='swal2-content']")
	public WebElement ErrorMsg;
	
	@FindBy(xpath = "(//div//h3)[2]")
	public WebElement ErrorMsg1;
	
	@FindBy(xpath = "(//div//h4)[1]")
	public WebElement ManageRuletitle;
	
	@FindBy(xpath = "(//mat-icon[@svgicon='menu-bar'])[1]")
	public WebElement ActionIconClick;

	@FindBy(xpath = "//button[contains(text(),'Edit')]")
	public WebElement EditIconClick;

	@FindBy(xpath = "//button[contains(text(),'Delete')]")
	public WebElement DeleteIconClick;
	
	@FindBy(xpath = "//button[contains(text(),'Yes, delete it!')]")
	public WebElement yesdeleteitButton;
	
	public ManageRulePage(){
		PageFactory.initElements(driver, this);
	}
	
	public String ValidateManageRulePageTitle() throws InterruptedException{
		
		Thread.sleep(2000);
		
		DataFlowsClick.click();
		Thread.sleep(1000);
		
		
		ManageRuleClick.click();
		Thread.sleep(2000);
		return ManageRuletitle.getText();
	}
	
	
	public void ValidateManageRuleWithValidData(String ruleNameValue, String BPValue) throws Exception{
		//Actionselection(driver, ResetSearchClick);
		ResetSearchClick.click();
		RuleNameData.sendKeys(Keys.chord(Keys.CONTROL, "a"),ruleNameValue);
		DropDownSelection(BuisinessProcessDD, BPValue);
		//Actionselection(driver, SearchActionClick);
		SearchActionClick.click();
		
	}
	
	public void ValidateManageRuleWithReset(String ruleNameValue, String BPValue) throws Exception{
		//Actionselection(driver, ResetSearchClick);
		ResetSearchClick.click();
		RuleNameData.sendKeys(Keys.chord(Keys.CONTROL, "a"),ruleNameValue);
		DropDownSelection(BuisinessProcessDD, BPValue);
		//Actionselection(driver, SearchActionClick);
		ResetSearchClick.click();
		
	}
	
	public void ValidateManageRuleWithRuleName(String ruleNameValue) throws InterruptedException{
		//Actionselection(driver, ResetSearchClick);
		ResetSearchClick.click();
		RuleNameData.sendKeys(Keys.chord(Keys.CONTROL, "a"),ruleNameValue);
		//Actionselection(driver, SearchActionClick);
		SearchActionClick.click();
		
	}
	
	public void ValidateManageRuleWithBP(String BPValue) throws Exception{
		//Actionselection(driver, ResetSearchClick);
		ResetSearchClick.click();
		DropDownSelection(BuisinessProcessDD, BPValue);
		//Actionselection(driver, SearchActionClick);
		SearchActionClick.click();
	}
	
	public void ValidateManageRuleWithInvalidData(String ruleNameValue, String BPValue) throws Exception{
		//Actionselection(driver, ResetSearchClick);
		ResetSearchClick.click();
		RuleNameData.sendKeys(Keys.chord(Keys.CONTROL, "a"),ruleNameValue);
		DropDownSelection(BuisinessProcessDD, BPValue);
		//Actionselection(driver, SearchActionClick);
		SearchActionClick.click();
		
	}
	
	public void ValidateManageRuleWithEdit(String title,int colnum) throws InterruptedException{
		
		List<WebElement> col=driver.findElements(By.xpath("//table[@id='pcmGroupResultsTbl']/tbody/tr/td["+colnum+"]"));
		System.out.println(col.size());
		for(int i=0;i<col.size();i++)
		{
			
			System.out.println(col.get(i).getText());
			if(title.equals(col.get(i).getText()))
			{System.out.println("text");
			Thread.sleep(2000);
			i=i+1;
			System.out.println("text1");
				driver.findElement(By.xpath("//table[@id='pcmGroupResultsTbl']/tbody/tr["+i+"]/td[1]")).click();
				System.out.println("text2");
				Thread.sleep(2000);
				driver.findElement(By.xpath("//table[@id='pcmGroupResultsTbl']/tbody/tr["+i+"]/td[1]//button[@id='searchRule_editRuleLaunch']")).click();
				System.out.println("text3");
				break;
			}
			
		}
	}
	
	
	public void ValidateManageRuleWithDelete(String title, int colnum) throws InterruptedException{
		List<WebElement> col=driver.findElements(By.xpath("//table[@id='pcmGroupResultsTbl']/tbody/tr/td["+colnum+"]"));
		System.out.println(col.size());
		for(int i=0;i<col.size();i++)
		{
			
			System.out.println(col.get(i).getText());
			if(title.equals(col.get(i).getText()))
			{
				i=i+1;
				driver.findElement(By.xpath("//table[@id='pcmGroupResultsTbl']/tbody/tr["+i+"]/td[1]")).click();
				driver.findElement(By.xpath("//table[@id='pcmGroupResultsTbl']/tbody/tr["+i+"]/td[1]//button[@id='searchRule_deleteRule']")).click();
				driver.switchTo().alert().accept();
				break;
			}
			
		}
	}
	
}