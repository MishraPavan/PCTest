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
 * This class will store all the locators and methods of login page
 *
 */
public class LoginPage 
{
	
	WebDriver driver;
	
By username = By.xpath("//input[@id='inputUsername']");
By password = By.xpath("//input[@name='inputPassword']");
By loginButton = By.xpath("//input[@name='$Submit$0']");

// create a constructor
public LoginPage(WebDriver driver)
{
  this.driver = driver;	
	
}
// Create a method for user logging in and verifying the user....

public void LogintoPapercut()
{
	
	driver.findElement(username).isDisplayed();
	driver.findElement(username).sendKeys("admin");
	driver.findElement(password).click();
	driver.findElement(password).sendKeys("Bh0l3nath1!");
	driver.findElement(loginButton).click();
	WebElement LoggedInUsername = driver.findElement(By.xpath("//span[@class='user']/span[@id = 'username']"));
	String ActualUsername = LoggedInUsername.getText();
	assertEquals(ActualUsername.contains("admin"), true);
}
}