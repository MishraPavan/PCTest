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
public class MenuUserLink 
{
	
    WebDriver driver;
    
	By Users = By.xpath("//span[text()='Users']");
	
	// create a constructor
      public MenuUserLink(WebDriver driver){
		
    	  this.driver = driver;
	  }
		public void VerifyMenuUsersLink() 
		{
			    driver.findElement(Users).click();
		        String ActualUserPageTitle = driver.getTitle();
		        assertEquals(ActualUserPageTitle.contains("Users"),true);	
			}

}
