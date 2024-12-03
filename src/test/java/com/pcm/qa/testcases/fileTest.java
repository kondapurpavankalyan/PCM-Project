package com.pcm.qa.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.pcm.qa.base.TestBase;

public class fileTest extends TestBase {

	@Test
	public void test1() throws Exception {

		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/resources/chromedriver.exe");

		driver = new ChromeDriver();
		
		driver.manage().window().maximize();

		driver.get("http://52.71.210.23:8787/#/sla/create-sla");
		driver.findElement(By.xpath("//input[@placeholder='User Name']")).sendKeys("username");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("password");
		driver.findElement(By.xpath("//span[text()='Login']")).click();

		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//span[text()='SLAs/KPIs']")).click();
		Thread.sleep(3000);

		driver.findElement(By.xpath("//span[text()='Create SLA']")).click();
		Thread.sleep(3000);
		
		WebElement cname = driver.findElement(By.xpath("//mat-select[@placeholder='Client Name']"));
		WebElement cid = driver.findElement(By.xpath("//mat-select[@placeholder='Client Id']"));
		WebElement tref = driver.findElement(By.xpath("//mat-select[@placeholder='Time Reference']"));
		WebElement tsa = driver.findElement(By.xpath("//mat-select[@placeholder='Type Of SLA']"));
		
	
		DropDownSelection(cname, "AGHGH");
		Thread.sleep(2000);
		DropDownSelection(cid, "AGHGH || ALL");
		Thread.sleep(2000);
		DropDownSelection(tref, "Fixed interval");
		Thread.sleep(2000);
		DropDownSelection(tsa, "Duration");
		Thread.sleep(2000);
		

	}

}
