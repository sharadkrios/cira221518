package com.ciranet.community.communications.pages;

import java.awt.Robot;
import java.awt.event.KeyEvent;

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

	@FindBy(xpath ="(//a/span)[1]")
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
		}
	}

	public boolean navigate(String communitySearchKeyword)  
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
				waitForElementToBeVisible(communityAlertsClose);
				clickElement(communityAlertsClose);
				waitForInvisibility(loaderIcon);

				LoggerManager.info("Navigating to 'Resident Contact Logs' through side navigation.");
				navigationSearch.navigateBySideNavigation(By.xpath("//span[normalize-space()='Resident Contact Logs']"), "Resident Contact Logs");
				waitForInvisibility(loaderIcon);
				waitForInvisibility(loaderIcon);
				
				// Scroll and verify 'Mail Merge' menu visibility
				LoggerManager.info("Scrolling to locate 'Resident Contact Logs' menu");
				waitForElementToBeVisible(residentContactLogsMenu);
				waitForInvisibility(loaderIcon);

				LoggerManager.info("Resident Contact Logs is visible; attempting to click.");
				clickElement(residentContactLogsMenu);

				waitForInvisibility(loaderIcon);

				LoggerManager.info("Successfully accessed 'Resident Contact Logs' menu after community search.");

				boolean isHeaderCorrect= isElementDisplayed(lblheader);
				LoggerManager.info("Header text validation: " + (isHeaderCorrect ? "Passed" : "Failed"));

				return isHeaderCorrect;

			} 
			catch (Exception e) 
			{
				LoggerManager.error("An error occurred during navigation or menu access: " + e.getMessage());
				return false;
			}
		} 
		catch (Exception e) 
		{
			LoggerManager.error("An unexpected error occurred while verifying community search: " + e.getMessage());
			return false;
		}
	}

	public boolean verifyResidentContactLogsHistoricalHyperlink() 
	{
	    try 
	    {
	        // Wait for loader icon to disappear
	        waitForInvisibility(loaderIcon);

	        // Ensure the historical hyperlink is visible
	        waitForElementToBeVisible(historicalHyperlink);
	        waitForInvisibility(loaderIcon);

	        // Check if the hyperlink is displayed
	        if (isElementDisplayed(historicalHyperlink)) 
	        {
	            LoggerManager.info("Historical Hyperlink is displayed. Attempting to click.");

	            // Ensure the hyperlink is clickable before clicking
	            waitForElementToBeClickable(historicalHyperlink);
	            clickElement(historicalHyperlink);
	            LoggerManager.info("Successfully clicked on the Historical Hyperlink.");

	            return true;
	        }
	        else 
	        {
	            LoggerManager.warn("Historical Hyperlink is not displayed.");
	            return false;
	        }
	    } 
	    catch (Exception e) 
	    {
	        LoggerManager.error("An error occurred while verifying the Historical Hyperlink: " + e.getMessage());
	        return false;
	    }
	}
}
