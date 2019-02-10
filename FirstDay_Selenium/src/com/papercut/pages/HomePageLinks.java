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
public class HomePageLinks 

{
	
	public static String ActualDashboardFooterBuildNumber;
	public static String ActualDashboardFooterVersionNumber;
	
	WebDriver driver;
	
	 By Dashboard = By.xpath("//span[text()='Dashboard']");
	
		// create a constructor
	public HomePageLinks(WebDriver driver)
	{
	  this.driver = driver;	
			}
			public void ClickDashboard() {
				driver.findElement(Dashboard).click();
				String ActualDashboardPageTitle = driver.getTitle();
				assertEquals(ActualDashboardPageTitle.contains("Dashboard"), true);
				
				//getting Dashboard version and build number for Dashboard footer and saving it to local variable
				
				WebElement DashboardFooterVersion = driver.findElement(By.xpath("//div[@class='product-details']/span[2]"));
				WebElement DashboardFooterBuild = driver.findElement(By.xpath("//div[@class='product-details']/span[3]"));
				ActualDashboardFooterVersionNumber = DashboardFooterVersion.getText();
				ActualDashboardFooterBuildNumber = DashboardFooterBuild.getText();
                 }
     }