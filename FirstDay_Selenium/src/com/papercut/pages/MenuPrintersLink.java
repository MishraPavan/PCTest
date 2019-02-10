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
public class MenuPrintersLink {
	WebDriver driver;
    
	By Printers = By.xpath("//span[text()='Printers']");
	By JobsPendingRelease = By.xpath("//span[contains(text(),'Jobs Pending Release')]");
	By NotificationOptions = By.xpath("//span[contains(text(),'Notification Options')]");
	By Charts = By.xpath("//span[contains(text(),'Charts')]");
	By Refunds = By.xpath("//span[contains(text(),'Refunds')]");

	
	// create a constructor
      public MenuPrintersLink(WebDriver driver){
		
    	  this.driver = driver;
	  }
		public void VerifyMenuPrintersLink() {
			
			    driver.findElement(Printers).click();
		        String ActualUserPageTitle = driver.getTitle();
		        assertEquals(ActualUserPageTitle.contains("Printers"),true);
							
			}
			public void ClickJobsPendingRelease() {
				
				driver.findElement(JobsPendingRelease).click();
			}
			public void ClickNotificationOptions() {
				
				driver.findElement(NotificationOptions).click();
			}
	        public void ClickCharts() {
				
				driver.findElement(Charts).click();
			}
	public void ClickRefunds() {
		
		driver.findElement(Refunds).click();
	}
			

}
