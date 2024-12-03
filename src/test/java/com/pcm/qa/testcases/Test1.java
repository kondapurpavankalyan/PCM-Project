package com.pcm.qa.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.pcm.qa.base.TestBase;
import com.pcm.qa.pages.ManageApiEndpointPage;

public class Test1 extends TestBase{
	
	public Test1() {
		super();
	}

	@BeforeMethod
	public void beforeTest() {
System.out.println("hi");

	}

	@BeforeTest(enabled = true)
	public void setup() throws Exception {

		Extentreport();
		initialization();
	}

	@Test(priority = 1, enabled = true)
	public void ParentNodeCreation() throws Exception {

		Thread.sleep(3000);

		driver.findElement(By.xpath("//span[contains(text(),'API Endpoint')]")).click();

		Thread.sleep(2000);

		driver.findElement(By.xpath("//span[contains(text(),'Create API Endpoint')]")).click();

		Thread.sleep(2000);

		WebElement DD = driver.findElement(By.xpath("//mat-select[@formcontrolname='proxyWebMethod']"));
		Thread.sleep(2000);

		DropDownSelection(DD, "POST");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//div[@role='tablist']/div/div[5]/div")).click();
		
		
		
		driver.findElement(By.xpath("//textarea")).sendKeys(Keys.chord(Keys.CONTROL, "a"),"{\r\n"
				+ "  \"addressLine1\": \"abc\",\r\n"
				+ "  \"addressLine2\": \"def\",\r\n"
				+ "  \"createMailBoxInSI\": true,\r\n"
				+ "  \"customProfileName\": \"\",\r\n"
				+ "  \"deleteAfterCollection\": true,\r\n"
				+ "  \"emailId\": \"tv100@gmail.com\",\r\n"
				+ "  \"filter\": \"\",\r\n"
				+ "  \"ipWhiteList\": \"\",\r\n"
				+ "  \"hubInfo\": true,\r\n"
				+ "  \"inMailBox\": \"/in\",\r\n"
				+ "  \"like\": true,\r\n"
				+ "  \"onlyPCM\": true,\r\n"
				+ "  \"outMailBox\": \"/out\",\r\n"
				+ "  \"pemIdentifier\": \"\",\r\n"
				+ "  \"pgpInfo\": \"test\",\r\n"
				+ "  \"phone\": \"1234564561\",\r\n"
				+ "  \"pkId\": \"\",\r\n"
				+ "  \"poolingInterval\": \"ON\",\r\n"
				+ "  \"profileId\": \"testmail200\",\r\n"
				+ "  \"profileName\": \"testmail200\",\r\n"
				+ "  \"protocol\": \"Mailbox\",\r\n"
				+ "  \"status\": true\r\n"
				+ "}");

	}
	
	

}
