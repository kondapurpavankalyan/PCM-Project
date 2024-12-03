package com.pcm.qa.pages;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeletePartner {
	
	public static WebDriver driver;

	public static void main(String[] args) throws Exception {
		
		// partner - managepartner - deleting multiple partners

				browser_initialization();

				login();

				Thread.sleep(3000);

				navigate_managepartner();

				Thread.sleep(3000);

				setup_partnerdetails("PartnerAutomation");


				searchpartner();

				Thread.sleep(4000);

				itemsperpage();

				Thread.sleep(2000);

				delete_action();

	}
	
	
	public static void browser_initialization() {

		System.setProperty("webdriver.chrome.driver", "C:\\IMP_Drivers\\Browsers\\chromedriver.exe");
		driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		driver.get("https://35.173.166.147:7080/#/login");

		driver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}

	public static void login() throws Exception {

		// Advanced Page Options chrome
		driver.findElement(By.xpath("//button[@id='details-button']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[@id='proceed-link']")).click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("//input[@placeholder='User Name']")).sendKeys("nagaraj"); // Entering Username
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("Pragma@05"); // Entering Password

		driver.findElement(By.xpath("//button[@class='btn__login mat-flat-button mat-warn']")).click(); // Clicking
																										// login btn

	}

	public static void navigate_managepartner() throws Exception {

		driver.findElement(By.xpath("//span[@class='side-nav-itm'][normalize-space()='Partner']")).click();

		Thread.sleep(1000);

		driver.findElement(By.xpath("//span[contains(text(),'Manage Partner')]")).click();

	}

	public static void setup_partnerdetails(String partnername) {

		driver.findElement(By.xpath("//input[@placeholder='Partner Name']")).sendKeys(partnername);

	}

	public static void searchpartner() {

		driver.findElement(By.xpath("//button[contains(text(),'Search Partner')]")).click();

	}

	public static void itemsperpage() throws Exception {

		driver.findElement(By.xpath("//div//span//span[text()='10']")).click();

		Thread.sleep(2000);

		driver.findElement(By.xpath("//div//mat-option//span[text()='100']")).click();

	}

	public static void delete_action() throws Exception {

		List<WebElement> partnerslist = driver.findElements(By.xpath("//tbody[@role='rowgroup']//tr//td/mat-icon"));

		System.out.println("the availabe fields in selected protocol are : " + partnerslist.size());

		for (int i = 0; i < partnerslist.size(); i++) {

			driver.findElement(By.xpath("(//tbody[@role='rowgroup']//tr//td/mat-icon)[1]")).click();

			Thread.sleep(2000);

			driver.findElement(By.xpath("//button[normalize-space()='Delete']")).click();

			Thread.sleep(1000);
			
			try {
				
				driver.findElement(By.xpath("//input[@type='checkbox' and @id='user']")).click(); //delete in si
				
				driver.findElement(By.xpath("//input[@type='checkbox' and @id='mailbox']")).click(); // delete in mailbox
				
			}
			catch(Exception e){
				
				e.fillInStackTrace();
				
			}
			
			driver.findElement(By.xpath("//button[text()='Yes, delete it!']")).click(); // yes delete it
			
			Thread.sleep(3000);

		}

	}

}
