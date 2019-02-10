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
public class MenuDevicesLink {
	WebDriver driver;
    
	By Devices = By.xpath("//span[text()='Devices']");
		
	// create a constructor
      public MenuDevicesLink(WebDriver driver){
		
    	  this.driver = driver;
	  }
		public void VerifyMenuDevicesLink() {
			    driver.findElement(Devices).click();
		        String ActualUserPageTitle = driver.getTitle();
		        assertEquals(ActualUserPageTitle.contains("Devices"),true);
							}		


}
