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
public class MenuLogsLink {
WebDriver driver;
    
	By Logs = By.xpath("//span[@class = 'content' and contains(text(),'Logs' )]");
	By JobLog = By.xpath("//span[@class = 'content' and contains(text(),'Job Log' )]");
	By ApplicationLog = By.xpath("//span[@class = 'content' and contains(text(),'Application Log' )]");
	By AuditLog = By.xpath("//span[@class = 'content' and contains(text(),'Audit Log' )]");
	
	
	// create a constructor
      public MenuLogsLink(WebDriver driver){
		
    	  this.driver = driver;
	  }
		public void VerifyMenuLogsLink(){
			
			    driver.findElement(Logs).click();
		        String ActualUserPageTitle = driver.getTitle();
		        assertEquals(ActualUserPageTitle.contains("Logs"),true);
		        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
				}
			public void ClickApplicationLog(){
				
				driver.findElement(ApplicationLog).click();
				String ActualApplicationLogTitle = driver.getTitle();
		        assertEquals(ActualApplicationLogTitle.contains("Logs"),true);
				driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
			}
			public void ClickAuditLog(){
				
				driver.findElement(AuditLog).click();
				String ActualAuditLogTitle = driver.getTitle();
		        assertEquals(ActualAuditLogTitle.contains("Logs"),true);
				driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
			}
}
