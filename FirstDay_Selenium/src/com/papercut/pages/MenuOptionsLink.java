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
public class MenuOptionsLink {
WebDriver driver;
    
	By Options = By.xpath("//span[text()='Options']");
	By General = By.xpath("//span[@class = 'content' and contains(text(),'General' )]");
	By Mobile = By.xpath("//span[contains(text(),'Mobile')]");
	By Notifications = By.xpath("//span[contains(text(),'Notifications' )]");
	By UserGroupSync = By.xpath("//span[contains(text(),'User/Group' )]");
	By AdminRights = By.xpath("//span[contains(text(),'Admin Rights')]");
	By Backups = By.xpath("//span[contains(text(),'Backups' )]");
	By Tools = By.xpath("//span[contains(text(),'Tools')]");
	By Advanced = By.xpath("//span[contains(text(),'Advanced' )]");

	
	// create a constructor
      public MenuOptionsLink(WebDriver driver){
		
    	  this.driver = driver;
	  }
		public void VerifyMenuOptionsLink(){
			
			    driver.findElement(Options).click();
		        String ActualUserPageTitle = driver.getTitle();
		        assertEquals(ActualUserPageTitle.contains("Options"),true);
		        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
				}
			public void ClickMobile(){
				
				driver.findElement(Mobile).click();
				driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
			}
			public void ClickNotifications(){
				
				driver.findElement(Notifications).click();
				driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
			}
	        public void ClickUserGroupSync(){
				
				driver.findElement(UserGroupSync).click();
				driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
			}
	        public void ClickAdminRights(){
		
	        	driver.findElement(AdminRights).click();
	        	driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	        }
	        public void ClickBackups(){
		
	        	driver.findElement(Backups).click();
	        	driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	        }
	    	public void ClickTools(){
	    		
	    		driver.findElement(Tools).click();
	    		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	    	}
	    	public void ClickAdvanced(){
	    		
	    		driver.findElement(Advanced).click();
	    		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	    	}



}
