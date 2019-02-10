/**
 * 
 */
package com.papercut.pages;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * @author pavan
 *
 */
public class MenuAccountsLink 
{
	WebDriver driver;
    
	By Accounts = By.xpath("//span[text()='Accounts']");
	By BatchImportUpdate = By.xpath("//span[contains(text(),'Batch Import / Update')]");
	By SharedAccountSync = By.xpath("//span[contains(text(),'Shared Account Sync')]");

	
	// create a constructor
      public MenuAccountsLink(WebDriver driver){
		
    	  this.driver = driver;
	  }
		public void VerifyMenuAccountsLink() 
		{
			    driver.findElement(Accounts).click();
		        String ActualUserPageTitle = driver.getTitle();
		        assertEquals(ActualUserPageTitle.contains("Accounts"),true);
							
			}
			public void ClickBatchImportUpdate() {
				
				driver.findElement(BatchImportUpdate).click();
				 String ActualBatchImportUpdateTitle = driver.getTitle();
			     assertEquals(ActualBatchImportUpdateTitle.contains("Batch Import / Update"),true);
			}
			public void ClickSharedAccountSync() {
				
				driver.findElement(SharedAccountSync).click();
				 String ActualSharedAccountSyncTitle = driver.getTitle();
			     assertEquals(ActualSharedAccountSyncTitle.contains("Shared Account Sync"),true);
			}
			

}
