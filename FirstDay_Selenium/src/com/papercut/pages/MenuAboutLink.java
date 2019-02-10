/**
 * 
 */
package com.papercut.pages;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * @author pavan
 *
 */
public class MenuAboutLink {
	 WebDriver driver;
		
	 By About = By.xpath("//span[@class = 'content' and contains(text(),'About' )]");
	 
	
		// create a constructor
	public MenuAboutLink(WebDriver driver)
	{
	  this.driver = driver;	
			}
			public void VerifyAboutLink() {
				driver.findElement(About).click();
				String ActualDashboardPageTitle = driver.getTitle();
				assertEquals(ActualDashboardPageTitle.contains("About"), true);
                 }
			public void VerifyVersionBuildNumber() {
				WebElement AboutVersionBuildNumber = driver.findElement(By.xpath("//html/body/div[5]/div[2]/div/div[2]/table/tbody/tr[2]/td[2]/div/table/tbody/tr[1]/td/p[1]"));
				String ExpectedAboutVersionBuildNumber = AboutVersionBuildNumber.getText();
			
				assertEquals(ExpectedAboutVersionBuildNumber.contains(com.papercut.pages.HomePageLinks.ActualDashboardFooterBuildNumber), true);
				assertEquals(ExpectedAboutVersionBuildNumber.contains(com.papercut.pages.HomePageLinks.ActualDashboardFooterBuildNumber), true);
			}
			
}
