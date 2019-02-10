package com.papercut.pages;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MenuGroupsLink 
{
	 WebDriver driver;
	    
		By Users = By.xpath("//span[text()='Groups']");
		
		// create a constructor
	      public MenuGroupsLink(WebDriver driver){
			
	    	  this.driver = driver;
		  }
			public void VerifyMenuGroupsLink() 
			{
				    driver.findElement(Users).click();
			        String ActualUserPageTitle = driver.getTitle();
			        assertEquals(ActualUserPageTitle.contains("Groups"),true);	
				}

}
