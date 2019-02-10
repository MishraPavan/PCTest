/**
 * 
 */
package com.papercut.pages;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * @author pavan
 *
 */
public class MenuReportsLink {
	
	WebDriver driver;
    
	By Reports = By.xpath("//span[text()='Reports']");
	By User = By.xpath("//span(text()= 'User']");
	By Printer = By.xpath("//html/body/div[5]/div[2]/div[1]/ul/li[2]/div/a/span[2]/span");
	By Group = By.xpath("//html/body/div[5]/div[2]/div[1]/ul/li[3]/div/a/span[2]/span");
	By Account = By.xpath("html/body/div[5]/div[2]/div[1]/ul/li[4]/div/a/span[2]/span");
	By Environment = By.xpath("//span[contains(text(),'Environment')]");
	By Transaction = By.xpath("//span[contains(text(),'Transaction')]");
	By ScheduleEmailReports = By.xpath("//span[contains(text(),'Schedule / Email Reports ')]");

	
	// create a constructor
      public MenuReportsLink(WebDriver driver){
		
    	  this.driver = driver;
	  }
		public void VerifyMenuReportsLink(){
			
			    driver.findElement(Reports).click();
		        String ActualUserPageTitle = driver.getTitle();
		        assertEquals(ActualUserPageTitle.contains("Reports"),true);
		        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
				}
			public void ClickPrinter(){
				
				driver.findElement(Printer).click();
				driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
			}
			public void ClickGroup(){
				
				driver.findElement(Group).click();
				driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
			}
	        public void ClickAccount(){
				
				driver.findElement(Account).click();
				driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
			}
	        public void ClickEnvironment(){
		
	        	driver.findElement(Environment).click();
	        	driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	        }
	        public void ClickTransaction(){
		
	        	driver.findElement(Transaction).click();
	        	driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	        }
	    	public void ClickScheduleEmailReports(){
	    		
	    		driver.findElement(ScheduleEmailReports).click();
	    		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	    	}
			


}
