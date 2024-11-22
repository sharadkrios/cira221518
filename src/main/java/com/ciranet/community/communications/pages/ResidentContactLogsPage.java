package com.ciranet.community.communications.pages;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.ciranet.basepage.BasePage;
import com.ciranet.navigation.Navigation;
import com.ciranet.quicksearch.QuickSearch;
import com.ciranet.utilities.LoggerManager;

public class ResidentContactLogsPage extends BasePage
{
	public ResidentContactLogsPage(WebDriver driver) 
	{
		super(driver);
	}

	Robot robot;

	@FindBy(xpath = "//dx-button[@title='Community Search']")
	public WebElement communityIcon;

	@FindBy(xpath = "//i[@class='dx-icon far fa-compass fa-2x']")
	WebElement navigationSearchIcon;

	@FindBy(xpath = "//i[@class='dx-icon dx-icon-menu']")
	WebElement toolbarMenu;

	@FindBy(xpath = "//div[@class='cc-community-search-component-container']//input")
	public WebElement communitysearchBox;

	@FindBy(xpath = "//div[@class='cc-community-search-component-container']//div[@class='dx-button-content']//i[@class='dx-icon fas fa-search']")
	public WebElement communitysearchButton;

	@FindBy(linkText = "Amberwood")
	public WebElement amberwoodLink;

	@FindBy(xpath = "//span[normalize-space()='Community']")
	WebElement communityMenu;

	@FindBy(xpath = "//span[normalize-space()='Communications']")
	WebElement communicationsMenu;

	@FindBy(xpath = "//span[normalize-space()='Resident Contact Logs']")
	WebElement residentContactLogsMenu;

	@FindBy(xpath="//h2[@class='page-header']")
	WebElement lblheader;

	@FindBy(xpath="//div[contains(@class, 'dx-loadindicator-icon')]")
	WebElement loaderIcon;

	@FindBy(xpath ="//i[@class='dx-icon fas fa-times']")
	WebElement communityAlertsClose;
	
	@FindBy(xpath = "//span[normalize-space()='2403']")
	WebElement historicalHyperlink;
	
	

	QuickSearch quickSearch = new QuickSearch(driver);
	Navigation navigationSearch = new Navigation(driver);
	
	public void pressEscapeKey() 
	{
		try 
		{
			Robot robot = new Robot();

			// Press the Escape key
			robot.keyPress(KeyEvent.VK_ESCAPE);
			LoggerManager.info("Escape key pressed.");

			// Release the Escape key
			robot.keyRelease(KeyEvent.VK_ESCAPE);
			LoggerManager.info("Escape key released.");

		}
		catch (Exception e) 
		{
			LoggerManager.error("Error in pressing the Escape key: " + e.getMessage());
			// Handle exception here as needed, without re-throwing
		}
	}


	public boolean verifySearchCommunity(String communitySearchKeyword) 
	{
		waitForInvisibility(loaderIcon);

		try 
		{
			waitForElementToBeVisible(communityIcon);

			// Perform community search
			quickSearch.searchCommunity(communitySearchKeyword);
			waitForInvisibility(loaderIcon);
			LoggerManager.info("Community search completed for keyword: " + communitySearchKeyword);

			// Attempt to press Escape key to close any popups
			try 
			{
				LoggerManager.info("Attempting to press Escape key to close any popups.");
				pressEscapeKey(); // Assuming this method handles escape key events
			}
			catch (Exception e) 
			{
				LoggerManager.error("Error pressing the Escape key: " + e.getMessage() +e);
				throw new Exception("Failed to press Escape key", e); // Propagate the exception for better error handling
			}

			try 
			{
				waitForInvisibility(loaderIcon);
				waitForInvisibility(loaderIcon);
				waitForElementToBeVisible(communityAlertsClose);
				clickElement(communityAlertsClose);
				waitForInvisibility(loaderIcon);
				waitForInvisibility(loaderIcon);

				LoggerManager.info("Navigating to 'Resident Contact Logs' through side navigation.");
				navigationSearch.navigateBySideNavigation(By.xpath("//span[normalize-space()='Resident Contact Logs']"), "Resident Contact Logs");
				waitForInvisibility(loaderIcon);

				// Scroll and verify 'Mail Merge' menu visibility
				LoggerManager.info("Scrolling to locate 'Resident Contact Logs' menu");
				waitForElementToBeVisible(residentContactLogsMenu);
				waitForInvisibility(loaderIcon);

				LoggerManager.info("'Communication Logs' menu is visible; attempting to click.");
				clickElement(residentContactLogsMenu);

				waitForInvisibility(loaderIcon);

				LoggerManager.info("Successfully accessed 'Resident Contact Logs' menu after community search.");
				return true;

			} 
			catch (Exception e) 
			{
				LoggerManager.error("An error occurred during navigation or menu access: " + e.getMessage());
				throw new Exception("Error occurred during community search or navigation: " + communitySearchKeyword +e);
			}
		} 
		catch (Exception e) 
		{
			LoggerManager.error("An unexpected error occurred while verifying community search: " + e.getMessage() +e);
			return false;
		}
	}
	
	public boolean verifyHistoricalHyperlink() 
	{
	    try 
	    {
	        // Wait for the historical hyperlink to be visible
	        waitForElementToBeVisible(historicalHyperlink);

	        if (isElementDisplayed(historicalHyperlink)) 
	        {
	            // Click the historical hyperlink
	            clickElement(historicalHyperlink);
	            waitForInvisibility(loaderIcon);
	            
	            Thread.sleep(5000);
	            
				// Retrieve all window handles and switch to the new tab
				List<String> tabs = new ArrayList<>(driver.getWindowHandles());

				// Ensure a new tab has opened
				if (tabs.size() > 1) 
				{
					driver.switchTo().window(tabs.get(1));
					LoggerManager.info("Switched to historical Hyperlink browser");
					
		            // Maximize the new window
		            driver.manage().window().maximize();
		            waitForInvisibility(loaderIcon);
		            
					// Perform actions on the pop-up
					driver.close();

					LoggerManager.info("Successfully verified historical Hyperlink browser");
					return true;
				}
				else 
				{
					LoggerManager.warn("No new tab browser window is displayed after clicking historicalHyperlink");
					return false;
				}
	        }

	        else 
	        {
	            LoggerManager.warn("Historical Hyperlink is not displayed.");
	            
	        }
	    } 
	    catch (Exception e) 
	    {
	        LoggerManager.error("An error occurred while verifying the Historical Hyperlink: " + e.getMessage());
	        return false;
	    }
		return false;
	}

}