package com.ciranet.community.communications.pages;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.ciranet.basepage.BasePage;
import com.ciranet.navigation.Navigation;
import com.ciranet.quicksearch.QuickSearch;
import com.ciranet.utilities.LoggerManager;

public class CommunicationLogsPage extends BasePage
{
	public CommunicationLogsPage(WebDriver driver) 
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

	@FindBy(xpath = "//span[contains(.,'Communication Logs')]")
	WebElement communicationlogsMenu;

	@FindBy(xpath="//h2[@class='page-header']")
	WebElement lblheader;

	@FindBy(xpath="//div[contains(@class, 'dx-loadindicator-icon')]")
	WebElement loaderIcon;

	@FindBy(xpath ="//i[@class='dx-icon fas fa-times']")
	WebElement communityAlertsClose;

	@FindBy(xpath ="(//*[@id=\"menutemplate\"]/div/div[2])[1]")
	WebElement actionsButton;

	@FindBy(xpath = "//input[@role='spinbutton'][1]")
	WebElement communicationLogsInPastTextbox;

	@FindBy(xpath = "//input[@role='combobox'][1]")
	WebElement dropdownButton;

	@FindBy(xpath = "//div[contains(text(),'Community Only')]")
	WebElement selectCommunityOnlydropdownValue;

	@FindBy(xpath = "//span[normalize-space()='Refresh']")
	WebElement refreshButton;

	@FindBy(xpath = "//span[contains(.,'Communication Logs')]")
	WebElement communicationLogsMenu;

	@FindBy(xpath = "//i[@class='dx-icon cc-icon fas fa-ban fa-flip-horizontal']")
	WebElement resetLayout;

	@FindBy(xpath = "//i[@class='fas fa-star fa-stack-1x dx-theme-accent-as-text-color']")
	WebElement columnChooser;

	@FindBy(xpath = "//i[@class='dx-icon dx-icon-close']")
	WebElement closeColChooser;

	@FindBy(xpath = "//i[@class='dx-icon cc-icon far fa-minus-square']")
	WebElement collapseIcon;

	@FindBy(xpath = "//i[@class='dx-icon cc-icon far fa-plus-square']")
	WebElement expandIcon;

	@FindBy(xpath = "//div//i[@class='dx-icon cc-icon fas fa-external-link-alt']")
	WebElement fullScreenIcon;

	@FindBy(xpath = "//i[@class='dx-icon cc-icon fas fa-external-link-alt fa-rotate-180']")
	WebElement normalScreenIcon;

	@FindBy(xpath ="//a[@class='fas fa-question-circle']")
	WebElement helpCommunicationLogs;

	@FindBy(xpath ="//a[normalize-space()='CiraNet Module: Communications Log']")
	WebElement ciraNetModuleCommunicationsLog;

	@FindBy(xpath ="//div[@class='menu-text'][contains(.,'View Details')]")
	WebElement actionsViewDetails;

	@FindBy(xpath ="//div[@class='menu-text'][contains(.,'Links')]")
	WebElement actionsLinks;

	@FindBy(xpath ="//div[@class='menu-text'][contains(.,'Internal Tasks')]")
	WebElement actionsLinksInternalTask;

	@FindBy(xpath ="//div[@class='menu-text'][contains(.,'Project Tasks')]")
	WebElement actionsLinksProjectTask;

	@FindBy(xpath ="//span[@class='dx-button-text'][contains(.,'New Internal Task')]")
	WebElement internalTaskNewInternalTask;

	@FindBy(xpath ="//div[@class='dx-toolbar-items-container'][contains(.,'Internal Task Link View')]")
	WebElement internalTasklinkViewpopup;

	@FindBy(xpath ="//span[@class='dx-button-text'][contains(.,'Refresh')]")
	WebElement internalTaskRefreshButton;

	@FindBy(xpath ="//i[contains(@class,'dx-icon dx-icon-close')]")
	WebElement addCloseButton;

	@FindBy(xpath ="(//tr[@class='dx-row dx-data-row dx-row-lines dx-column-lines'])[1]//td[3]")
	WebElement viewHyperlinks;

	@FindBy(xpath = "//div[contains(text(),'All')]")
	WebElement selectAlldropdownValue;

	@FindBy(xpath = "(//input[@aria-label='Filter cell'])[1]")
	WebElement typecolumnSearchbox;

	@FindBy(xpath = "//div[contains(@class,'dx-context-menu-container-border')]")
	WebElement typecolumnSearchIcon;

	@FindBy(xpath = "//span[normalize-space()='Equals']")
	WebElement typecolumnSearchIconEquals;

	@FindBy(css = "#dx-col-460 .dx-header-filter")
	WebElement typecolumnFilterSelection;

	@FindBy(xpath = "(//div[@class='dx-item-content dx-list-item-content'][contains(.,'Email')])[1]")
	WebElement emailCheckboxSelection;

	@FindBy(xpath = "//span[@class='dx-button-text'][contains(.,'OK')]")
	WebElement emailSelectionOkButton;

	@FindBy(xpath = "//div[@class='dx-group-panel-message'][contains(.,'Drag a column here to group')]")
	WebElement message;

	@FindBy(xpath = "//i[@class='dx-icon cc-icon fas fa-ban fa-flip-horizontal']")
	WebElement resetButton;



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

	public void actionButton() 
	{
		try 
		{
			LoggerManager.info("Checking if the Actions button is displayed.");
			if (isElementDisplayed(actionsButton)) 
			{
				LoggerManager.info("Actions button is displayed, attempting to click.");
				clickElement(actionsButton);
				waitForInvisibility(loaderIcon);
				LoggerManager.info("Actions button clicked successfully.");
			}
			else 
			{
				LoggerManager.warn("Actions button is not displayed, unable to click.");
			}
		} 
		catch (Exception e) 
		{
			LoggerManager.error("An error occurred while interacting with the Actions button: " + e.getMessage());
			throw new RuntimeException("Error while interacting with the Actions button", e); // Re-throwing as unchecked exception
		}
	}

	public void pressTabKey(int tabCount) throws Exception 
	{
		if (tabCount <= 0) 
		{
			throw new IllegalArgumentException("Tab count must be greater than zero.");
		}

		LoggerManager.info("Creating Robot instance to simulate keyboard actions.");
		Robot robot = new Robot();

		try 
		{
			LoggerManager.info("Pressing the Tab key " + tabCount + " times.");
			for (int i = 0; i < tabCount; i++) {
				robot.keyPress(KeyEvent.VK_TAB);
				robot.keyRelease(KeyEvent.VK_TAB);
			}

			LoggerManager.info("Pressing the Enter key to execute the action.");
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);
			LoggerManager.info("Tab and Enter key sequence completed successfully.");
		}
		catch (Exception e) 
		{
			LoggerManager.error("Error occurred while pressing Tab or Enter key: " + e.getMessage());
			throw new RuntimeException("Keyboard simulation failed", e);
		}
	}

	public void typecolumnFilterselection() 
	{

		try 
		{
			// Open the type column filter selection
			clickElement(typecolumnFilterSelection);
			waitForElementToBeVisible(emailCheckboxSelection);

			// Check if the email checkbox is already selected
			if (emailCheckboxSelection.isSelected()) 
			{
				LoggerManager.info("Email checkbox is already selected. No action needed.");
			}
			else 
			{
				LoggerManager.info("Email checkbox is not selected. Selecting it now.");
				clickElement(emailCheckboxSelection);

				// Validate that the checkbox is now selected
				if (emailCheckboxSelection.isSelected()) 
				{
					LoggerManager.info("Email checkbox successfully selected.");
				}
				else 
				{
					LoggerManager.error("Failed to select the email checkbox.");
				}

				// Confirm the selection
				clickElement(emailSelectionOkButton);
				waitForInvisibility(loaderIcon);
			}

		} 
		catch (Exception e) 
		{
			// Handle any exceptions that occur
			LoggerManager.error("Error while selecting type column filter and email checkbox: " + e.getMessage());
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

				LoggerManager.info("Navigating to 'Communication Logs' through side navigation.");
				navigationSearch.navigateBySideNavigation(By.xpath("//span[normalize-space()='Communication Logs']"), "Communication Logs");
				waitForInvisibility(loaderIcon);

				// Scroll and verify 'Mail Merge' menu visibility
				LoggerManager.info("Scrolling to locate 'Communication Logs' menu");
				waitForElementToBeVisible(communicationlogsMenu);
				waitForInvisibility(loaderIcon);

				LoggerManager.info("'Communication Logs' menu is visible; attempting to click.");
				clickElement(communicationlogsMenu);

				waitForInvisibility(loaderIcon);

				LoggerManager.info("Successfully accessed 'Communication Logs' menu after community search.");
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

	public boolean verifyCommunicationLogsInPastDays() 
	{
		try 
		{
			// Ensure the communication logs input field is visible
			waitForElementToBeVisible(communicationLogsInPastTextbox);
			if (!isElementDisplayed(communicationLogsInPastTextbox)) 
			{
				LoggerManager.warn("Communication logs text box is not visible.");
				return false;
			}

			// Interact with the text box
			LoggerManager.info("Interacting with the Communication Logs in Past Days text box.");
			clickElement(communicationLogsInPastTextbox);
			//communicationLogsInPastTextbox.clear();
			//communicationLogsInPastTextbox.sendKeys("300");

			// Interact with the dropdown and select a value
			LoggerManager.info("Selecting 'Community Only' from the dropdown.");
			clickElement(dropdownButton);
			clickElement(selectCommunityOnlydropdownValue);

			// Refresh the logs
			LoggerManager.info("Clicking the Refresh button to update logs.");
			clickElement(refreshButton);
			waitForInvisibility(loaderIcon);

			//waitForElementToBeVisible(message);

			LoggerManager.info("Communication logs updated successfully for the past days.");
			return true;
		} 
		catch (Exception e) 
		{
			LoggerManager.error("An error occurred while verifying communication logs: " + e.getMessage());
			return false;
		}
	}

	public boolean verifyCommunicationLogsInPastDaysAll() 
	{
		try 
		{
			// Ensure the communication logs text box is visible
			waitForElementToBeVisible(communicationLogsInPastTextbox);
			if (!isElementDisplayed(communicationLogsInPastTextbox)) 
			{
				LoggerManager.warn("Communication logs text box is not visible.");
				return false;
			}

			// Interact with the communication logs input field
			LoggerManager.info("Interacting with the Communication Logs in Past Days text box.");
			clickElement(communicationLogsInPastTextbox);
			communicationLogsInPastTextbox.clear();
			communicationLogsInPastTextbox.sendKeys("300");

			// Interact with the dropdown and select 'All' value
			LoggerManager.info("Selecting 'All' from the dropdown.");
			clickElement(dropdownButton);
			clickElement(selectAlldropdownValue);

			// Click the Refresh button to update logs
			LoggerManager.info("Clicking the Refresh button to update logs.");
			clickElement(refreshButton);
			waitForInvisibility(loaderIcon);

			LoggerManager.info("Communication logs updated successfully for all entities in the past 300 days.");
			return true;
		} 
		catch (Exception e) 
		{
			LoggerManager.error("An error occurred while verifying communication logs for 'All': " + e.getMessage());
			return false;
		}
	}

	public boolean verifyActionsViewDetails() 
	{
		// Store the original window handle
		String originalWindow = driver.getWindowHandle();

		try 
		{
			typecolumnFilterselection();

			// Click on the action button
			actionButton();

			// Click on the "View Details" action
			clickElement(actionsViewDetails);
			waitForInvisibility(loaderIcon);

			// Wait for the new window/tab to open
			Set<String> allWindows = driver.getWindowHandles();
			if (allWindows.size() <= 1) 
			{
				LoggerManager.warn("No new window opened after clicking 'View Details'.");
				return false;
			}

			// Switch to the new window
			for (String windowHandle : allWindows) 
			{
				if (!windowHandle.equals(originalWindow)) 
				{
					LoggerManager.info("Switching to the new window.");
					driver.switchTo().window(windowHandle);
					waitForInvisibility(loaderIcon);
					break;
				}
			}

			LoggerManager.info("Successfully verified 'View Details' functionality.");
			return true;

		}
		catch (Exception e) 
		{
			LoggerManager.error("An error occurred while verifying 'View Details': " + e.getMessage());
			return false;
		} 
		finally 
		{
			// Ensure the driver switches back to the original window
			LoggerManager.info("Switching back to the original window.");
			driver.switchTo().window(originalWindow);
		}
	}

	public boolean verifyActionsLinksInternalTask() 
	{
		try 
		{
			// Initialize Robot instance for further use
			robot = new Robot();

			// Perform column filter selection
			typecolumnFilterselection();

			// Click on the action button
			actionButton();

			// Navigate through the internal task link
			clickElement(actionsLinks);
			clickElement(actionsLinksInternalTask);
			waitForInvisibility(loaderIcon);

			// Retrieve all window handles and switch to the new tab
			List<String> tabs = new ArrayList<>(driver.getWindowHandles());

			// Ensure a new tab has opened
			if (tabs.size() > 1) 
			{
				driver.switchTo().window(tabs.get(1));
				LoggerManager.info("Switched to Actions Links Internal Task pop-up.");

				// Perform actions on the pop-up
				clickElement(addCloseButton);

				LoggerManager.info("Successfully verified the Actions Links Internal Task.");
				return true;
			}
			else 
			{
				LoggerManager.warn("No new tab opened after clicking the Actions Links Internal Task.");
				return false;
			}

		} 
		catch (Exception e) 
		{
			LoggerManager.error("An error occurred while verifying Actions Links Internal Task: " + e.getMessage());
			return false;
		}


	}

	public boolean verifyActionsLinksProjectTask() 
	{

		try 
		{
			robot = new Robot();

			typecolumnFilterselection();

			// Click on the action button
			actionButton();

			// Navigate to the project task link
			clickElement(actionsLinks);
			clickElement(actionsLinksProjectTask);
			//waitForInvisibility(loaderIcon);
			waitForElementToBeVisible(addCloseButton);

			// Retrieve all window handles and switch to the new tab
			List<String> tabs = new ArrayList<>(driver.getWindowHandles());
			if (tabs.size() > 1) 
			{
				driver.switchTo().window(tabs.get(1));
				System.out.println("Switched to actions Links InternalTask pop-up");
				LoggerManager.info("Switched to ");
				clickElement(addCloseButton);
				LoggerManager.info("Successfully verified the Actions Links Internal Task.");
				return true;
			}
			else 
			{
				LoggerManager.warn("No new tab opened after clicking the property address hyperlink.");
				return false;
			}

		} 
		catch (Exception e) 
		{
			LoggerManager.error("An error occurred while verifying Actions Links Internal Task: " + e.getMessage());
			return false;
		}
	}

	public boolean verifyViewColumnHyperlinks()
	{
	    try 
	    {
	        // Click on the view hyperlinks element
	        clickElement(viewHyperlinks);
	        	        
	        LoggerManager.info("Clicked on the view hyperlinks element.");

	        
	        // Retrieve all open window handles
	        ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());

	        // Ensure there are multiple tabs to switch
	        if (tabs.size() > 1) 
	        {
	            // Switch to the newly opened tab
	            driver.switchTo().window(tabs.get(1));
	            waitForInvisibility(loaderIcon);
	            LoggerManager.info("Switched to the new tab foview hyperlinks.");

	            // Close the newly opened tab
	            driver.close();
	            LoggerManager.info("Closed the new tab for view hyperlinks.");

	            // Switch back to the original tab
	            driver.switchTo().window(tabs.get(0));
	            LoggerManager.info("Switched back to the original tab.");

	            return true;
	        }
	        else 
	        {
	            LoggerManager.warn("No additional tabs were opened after clicking the view hyperlinks element.");
	            return false;
	        }

	    }
	    catch (Exception e) 
	    {
	        LoggerManager.error("An error occurred while verifying view column hyperlinks: " + e.getMessage());
	        return false;
	    }
	}

	public boolean helpCommunicationLogs() 
	{
		try 
		{
			// Wait for loader icon to disappear and the help communication logs element to be visible
			waitForInvisibility(loaderIcon);
			waitForElementToBeVisible(helpCommunicationLogs);

			// Click the help communication logs element
			clickElement(helpCommunicationLogs);
			waitForInvisibility(loaderIcon);
			LoggerManager.info("Help Communication Logs clicked successfully.");

			return true;
		}
		catch (Exception e) 
		{
			// Log error and return false if an exception occurs
			LoggerManager.error("Failed to click on Help Communication Logs: " + e.getMessage());
			return false;
		}
	}

}