/**
 * 
 */
package com.papercut.TestCases;

import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.papercut.pages.HomePageLinks;
import com.papercut.pages.LoginPage;
import com.papercut.pages.MenuAboutLink;
import com.papercut.pages.MenuAccountsLink;
import com.papercut.pages.MenuDevicesLink;
import com.papercut.pages.MenuGroupsLink;
import com.papercut.pages.MenuLogsLink;
import com.papercut.pages.MenuOptionsLink;
import com.papercut.pages.MenuPrintersLink;
import com.papercut.pages.MenuReportsLink;
import com.papercut.pages.MenuUserLink;

/**
 * @author pavan
 *
 */
public class VerifyPaperCutLogin {
	
	WebDriver driver;
	
	@Test(priority=0)
	public void VerifyValidLogin()
		{
	System.setProperty("webdriver.firefox.marionette", "C:\\Users\\pavan\\Selenium\\geckodriver.exe");
	WebDriver driver = new FirefoxDriver();
	driver.manage().window().maximize();
	driver.get("http://localhost:9191/admin");
	
	LoginPage login = new LoginPage(driver);
	HomePageLinks MenuLinks = new HomePageLinks(driver);
	MenuUserLink UsersLink = new MenuUserLink(driver);
	MenuGroupsLink GroupsLink = new MenuGroupsLink(driver);
	MenuAccountsLink AccountsLink = new MenuAccountsLink(driver);
	MenuPrintersLink PrintersLink = new MenuPrintersLink(driver);
	MenuDevicesLink DevicesLink = new MenuDevicesLink(driver);
	MenuReportsLink ReportsLink = new MenuReportsLink(driver);
	MenuOptionsLink OptionsLink = new MenuOptionsLink(driver);
	MenuLogsLink LogsLink = new MenuLogsLink(driver);
	MenuAboutLink AboutLink = new MenuAboutLink(driver);
	
//	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	login.LogintoPapercut();
	//driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	MenuLinks.ClickDashboard();
	//driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	UsersLink.VerifyMenuUsersLink();
	//driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	GroupsLink.VerifyMenuGroupsLink();
	//driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
	AccountsLink.VerifyMenuAccountsLink();
	AccountsLink.ClickBatchImportUpdate();
	//driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	AccountsLink.ClickSharedAccountSync();
	//driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	PrintersLink.VerifyMenuPrintersLink();
	//driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	PrintersLink.ClickJobsPendingRelease();
	//driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	PrintersLink.ClickNotificationOptions();
	//driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	PrintersLink.ClickCharts();
	//driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	PrintersLink.ClickRefunds();
	//driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	DevicesLink.VerifyMenuDevicesLink();
	//driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	ReportsLink.VerifyMenuReportsLink();
	ReportsLink.ClickPrinter();
	ReportsLink.ClickGroup();
	ReportsLink.ClickAccount();
	ReportsLink.ClickEnvironment();
	ReportsLink.ClickTransaction();
	ReportsLink.ClickScheduleEmailReports();
	OptionsLink.VerifyMenuOptionsLink();
	OptionsLink.ClickMobile();
	OptionsLink.ClickNotifications();
	OptionsLink.ClickUserGroupSync();
	OptionsLink.ClickAdminRights();
	OptionsLink.ClickAdminRights();
	OptionsLink.ClickBackups();
	OptionsLink.ClickTools();
	OptionsLink.ClickAdvanced();
	LogsLink.VerifyMenuLogsLink();
	LogsLink.ClickApplicationLog();
	LogsLink.ClickAuditLog();
	AboutLink.VerifyAboutLink();
	AboutLink.VerifyVersionBuildNumber();
	
	driver.quit();
		}
	
	/*
	 * @Test(priority =1) public void ClickAllMenuItemsDashboard() { HomePageLinks
	 * homepage = new HomePageLinks(driver); homepage.ClickDashboard(); }
	 */
	
}


	


