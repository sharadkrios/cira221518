package com.ciranet.community.communications.pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
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

public class MailMergePage extends BasePage
{
	public MailMergePage(WebDriver driver) 
	{
		super(driver);
	}

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

	@FindBy(xpath = "//span[normalize-space()='Mail Merge']")
	WebElement mailMergeMenu;

	@FindBy(xpath="//h2[@class='page-header']")
	WebElement lblheader;

	//@FindBy(xpath = "dx-loadindicator-icon")
	//@FindBy(xpath = "")
	//WebElement loaderIcon;

	@FindBy(xpath="//div[contains(@class, 'dx-loadindicator-icon')]")
	WebElement loaderIcon;

	@FindBy(xpath = "//div[@class='dx-dropdowneditor-icon'][1]")
	WebElement dropdownClick;

	@FindBy(xpath = "//div[contains(text(),'Labels')]")
	WebElement labelsDropdownValue;

	@FindBy(xpath = "//div[contains(text(),'Letters')]")
	WebElement lettersDropdownValue;

	@FindBy(xpath = "//span[normalize-space()='Browse'][1]")
	WebElement browseButton;

	@FindBy(xpath ="//a[@class='fas fa-question-circle']")
	WebElement helpMailMerge;

	@FindBy(xpath ="//span[normalize-space()='Create Labels']")
	WebElement createLabelsButton;

	@FindBy(xpath ="//span[normalize-space()='Create Letters']")
	WebElement createLettersButton;

	@FindBy(xpath ="(//span[@class='dx-checkbox-icon'])[2]")
	WebElement checkBox;

	@FindBy(xpath ="//span[normalize-space()='View/Save Standard Letterhead Template']")
	WebElement viewSaveStandardLetterheadTemplate;

	@FindBy(xpath ="//span[normalize-space()='R0106756L0064612']")
	WebElement customerId;
	
	@FindBy(xpath ="(//a[@class='cc-hyperlink dx-theme-accent-as-text-color cc-hyperlink-hover'])[2]")
	WebElement combinedOwner;

	@FindBy(xpath ="//i[@class='dx-icon fas fa-times']")
	WebElement communityAlertsClose;
	
	QuickSearch quickSearch = new QuickSearch(driver);
	Navigation navigationSearch = new Navigation(driver);
	
	public void pressEscapeKey() {
		try {
			Robot robot = new Robot();

			// Press the Escape key
			robot.keyPress(KeyEvent.VK_ESCAPE);
			LoggerManager.info("Escape key pressed.");

			// Release the Escape key
			robot.keyRelease(KeyEvent.VK_ESCAPE);
			LoggerManager.info("Escape key released.");

		} catch (AWTException e) {
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

			waitForInvisibility(loaderIcon);
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
				
				LoggerManager.info("Navigating to 'Mail Merge' through side navigation.");
				navigationSearch.navigateBySideNavigation(By.xpath("//span[normalize-space()='Mail Merge']"), "Mail Merge");
				waitForInvisibility(loaderIcon);

				// Scroll and verify 'Mail Merge' menu visibility
				LoggerManager.info("Scrolling to locate 'Mail Merge' menu.");
				waitForElementToBeVisible(mailMergeMenu);
				waitForInvisibility(loaderIcon);
				
				scrollToElement(mailMergeMenu);
				waitForInvisibility(loaderIcon);

				LoggerManager.info("Attempting to press Escape key to close any popups.");

				LoggerManager.info("'Mail Merge' menu is visible; attempting to click.");
				clickElement(mailMergeMenu);

				waitForInvisibility(loaderIcon);
				waitForInvisibility(loaderIcon);
				waitForInvisibility(loaderIcon);
				
				waitForElementToBeVisible(dropdownClick);
				waitForInvisibility(loaderIcon);

				LoggerManager.info("Successfully accessed 'Mail Merge' menu after community search.");
				return true;

			} 
			catch (Exception e) 
			{
				LoggerManager.error("An error occurred during navigation or menu access: " + e.getMessage() +e);
				throw new Exception("Error occurred during community search or navigation: " + communitySearchKeyword +e);
			}
		} 
		catch (Exception e) 
		{
			LoggerManager.error("An unexpected error occurred while verifying community search: " + e.getMessage() +e);
			return false;
		}
	}
	public boolean verifyDropdownSelection() 
	{
		try {
			// Ensure dropdown is visible and click it
			waitForElementToBeVisible(dropdownClick);
			if (!isElementDisplayed(dropdownClick)) {
				LoggerManager.warn("Dropdown is not displayed.");
				return false;
			}

			clickElement(dropdownClick);
			LoggerManager.info("Dropdown clicked.");

			// Select the 'Labels' option if available
			if (isElementDisplayed(labelsDropdownValue)) {
				clickElement(labelsDropdownValue);
				waitForInvisibility(loaderIcon);
				LoggerManager.info("Labels option selected.");
			} else {
				LoggerManager.warn("Labels dropdown value is not displayed.");
				return false;
			}

			// Click the dropdown again to select 'Letters'
			clickElement(dropdownClick);
			LoggerManager.info("Dropdown clicked again to select 'Letters'.");

			if (isElementDisplayed(lettersDropdownValue)) {
				clickElement(lettersDropdownValue);
				waitForInvisibility(loaderIcon);
				waitForElementToBeVisible(browseButton); // Ensure the 'Browse' button is visible
				LoggerManager.info("Letters option selected. 'Browse' button is now visible.");
				return true; // Successfully handled dropdown selections
			} else {
				LoggerManager.warn("Letters dropdown value is not displayed.");
				return false;
			}
		} catch (Exception e) {
			LoggerManager.error("Error in verifying dropdown selection: " + e.getMessage());
			return false;
		}
	}

	public boolean verifyCreateLabels() {
		try {
			// Wait for and click the dropdown
			waitForElementToBeVisible(dropdownClick);
			if (!isElementDisplayed(dropdownClick)) {
				LoggerManager.warn("Dropdown is not displayed.");
				return false;
			}
			clickElement(dropdownClick);
			LoggerManager.info("Dropdown clicked.");

			// Select 'Labels' from the dropdown
			if (isElementDisplayed(labelsDropdownValue)) {
				clickElement(labelsDropdownValue);
				waitForInvisibility(loaderIcon);
				LoggerManager.info("Labels option selected.");

				// Ensure checkbox is visible and clickable
				if (isElementDisplayed(checkBox)) {
					clickElement(checkBox);
					waitForInvisibility(loaderIcon);
					LoggerManager.info("Checkbox clicked.");
				} else {
					LoggerManager.warn("Checkbox is not displayed.");
					return false;
				}

				// Click the 'Create Labels' button
				if (isElementDisplayed(createLabelsButton)) {
					clickElement(createLabelsButton);
					waitForInvisibility(loaderIcon);
					LoggerManager.info("Labels created successfully.");
					return true;  // Successfully created labels
				} else {
					LoggerManager.warn("Create Labels button is not displayed.");
					return false;
				}
			} else {
				LoggerManager.warn("Labels dropdown value is not displayed.");
				return false;
			}
		} catch (Exception e) {
			LoggerManager.error("Error in verifying label creation: " + e.getMessage());
			return false;
		}
	}

	public boolean verifyBrowseButton() 
	{
		try 
		{
			// Click dropdown and select the 'Letters' option
			clickElement(dropdownClick);
			LoggerManager.info("Dropdown clicked to select 'Letters'.");
			clickElement(lettersDropdownValue);
			waitForInvisibility(loaderIcon);

			// Wait for the browse button to become visible
			waitForElementToBeVisible(browseButton);
			waitForInvisibility(loaderIcon);

			// Check if the browse button is displayed
			if (isElementDisplayed(browseButton)) 
			{
				
				Robot robot = new Robot();
				clickElement(browseButton);
				waitForInvisibility(loaderIcon);
				LoggerManager.info("Browse button clicked.");
			
				StringSelection s = new StringSelection(System.getProperty("user.dir")
						+ "\\src\\main\\java\\com\\ciranet\\testdata\\Template.rtf");
				waitForInvisibility(loaderIcon);
				Toolkit.getDefaultToolkit().getSystemClipboard().setContents(s, null);
				Thread.sleep(3000);

				// pressing ctrl+v
				robot.keyPress(KeyEvent.VK_CONTROL);
				waitForInvisibility(loaderIcon);

				robot.keyPress(KeyEvent.VK_V);
				waitForInvisibility(loaderIcon);

				// releasing ctrl+v
				robot.keyRelease(KeyEvent.VK_CONTROL);
				waitForInvisibility(loaderIcon);

				robot.keyRelease(KeyEvent.VK_V);
				waitForInvisibility(loaderIcon);

				// pressing enter
				robot.keyPress(KeyEvent.VK_ENTER);
				waitForInvisibility(loaderIcon);

				// releasing enter
				robot.keyRelease(KeyEvent.VK_ENTER);
				waitForInvisibility(loaderIcon);
				
				LoggerManager.info("File path pasted.");

				waitForInvisibility(loaderIcon); // Ensure any loader is invisible
				waitForElementToBeVisible(viewSaveStandardLetterheadTemplate);

				// Wait for checkbox to be visible and click it
				waitForElementToBeVisible(checkBox);
				clickElement(checkBox);
				waitForInvisibility(loaderIcon);
				LoggerManager.info("Checkbox clicked.");

				// Wait for 'Create Letters' button to be visible and click it
				waitForElementToBeVisible(createLettersButton);
				clickElement(createLettersButton);
				waitForInvisibility(loaderIcon);
				LoggerManager.info("'Create Letters' button clicked. File uploaded successfully.");

				return true; // Successfully handled file upload and creation
			} else {
				LoggerManager.warn("Browse button is not displayed.");
				return false;
			}
		} catch (AWTException e) {
			LoggerManager.error("AWT exception during file upload: " + e.getMessage());
			return false;
		} catch (Exception e) {
			LoggerManager.error("Error in verifying the browse button and file upload: " + e.getMessage());
			return false;
		}
	}

	public boolean verifyViewSaveStandardLetterheadTemplate() {
		try {
			// Click dropdown and select 'Letters' option
			clickElement(dropdownClick);
			LoggerManager.info("Dropdown clicked to select 'Letters' option.");
			clickElement(lettersDropdownValue);
			waitForInvisibility(loaderIcon);

			// Check if the 'View Save Standard Letterhead Template' button is displayed
			if (isElementDisplayed(viewSaveStandardLetterheadTemplate)) {
				clickElement(viewSaveStandardLetterheadTemplate);
				waitForInvisibility(loaderIcon);
				LoggerManager.info("'View Save Standard Letterhead Template' button clicked.");

				// Use Robot to press the Escape key (closing or confirming the action)
				pressEscapeKey();

				LoggerManager.info("Successfully viewed and saved the Standard Letterhead Template.");
				return true;  // Successfully viewed and saved the template
			} else {
				LoggerManager.warn("View Save Standard Letterhead Template button is not displayed.");
				return false;
			}
		} catch (Exception e) {
			LoggerManager.error("Error in viewing or saving the Standard Letterhead Template: " + e.getMessage());
			return false;
		}
	}

	public boolean helpMailMerge() {
		try {
			// Wait for the loader to disappear and the Mail Merge help element to be visible
			waitForInvisibility(loaderIcon);
			waitForElementToBeVisible(helpMailMerge);
			LoggerManager.info("Mail Merge help element is visible.");

			// Click the Mail Merge help element
			clickElement(helpMailMerge);
			LoggerManager.info("Clicked on the Mail Merge help element.");

			// Store all window handles
			ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());

			// Ensure there are enough tabs to switch
			if (tabs.size() > 2) {
				// Switch to the new tab (third tab)
				driver.switchTo().window(tabs.get(2));
				waitForInvisibility(loaderIcon);
				LoggerManager.info("Switched to the Mail Merge help tab.");

				// Close the third tab
				driver.close();
				LoggerManager.info("Closed the Mail Merge help tab.");

				// Switch back to the second tab (original tab)
				driver.switchTo().window(tabs.get(1));
				waitForElementToBeVisible(helpMailMerge);
				LoggerManager.info("Switched back to the main window.");

				return true; // Successfully navigated to help and returned
			} else {
				LoggerManager.warn("Not enough tabs available to switch to Mail Merge help.");
				return false;
			}
		} catch (Exception e) {
			LoggerManager.error("Error in navigating to the Mail Merge help: " + e.getMessage());
			return false;
		}
	}

	public boolean verifyCustomerIdhyperlink() {
		try {
			// Wait for the loader icon to disappear and the customer ID element to be visible
			waitForInvisibility(loaderIcon);
			waitForElementToBeVisible(customerId);
			LoggerManager.info("Customer ID element is visible.");

			// Click the customer ID hyperlink
			clickElement(customerId);
			waitForInvisibility(loaderIcon);
			LoggerManager.info("Clicked on the customer ID hyperlink.");

			// Get a list of all open window handles
			List<String> windowHandles = new ArrayList<>(driver.getWindowHandles());
			waitForInvisibility(loaderIcon);

			// Switch to the newly opened tab (third tab)
			if (windowHandles.size() > 2) {
				driver.switchTo().window(windowHandles.get(2));
				waitForInvisibility(loaderIcon);
				LoggerManager.info("Switched to the customer ID details tab.");

				// Attempt to press the escape key
				try {
					pressEscapeKey();
				} catch (Exception e) {
					LoggerManager.error("Error while pressing escape key: " + e.getMessage());
				}

				// Switch back to the original tab (second tab)
				driver.switchTo().window(windowHandles.get(1));
				LoggerManager.info("Switched back to the main window after viewing customer ID details.");
				return true;
			} else {
				LoggerManager.warn("Expected third window handle was not found.");
				return false;
			}
		} catch (Exception e) {
			LoggerManager.error("Error in verifying customer ID hyperlink: " + e.getMessage());
			return false;
		}
	}

	public boolean verifyCombinedOwnerhyperlink() 
	{
		try {
			// Wait for the loader icon to disappear and the combined owner element to be visible
			waitForInvisibility(loaderIcon);
			waitForElementToBeVisible(combinedOwner);
			LoggerManager.info("Combined owner element is visible.");

			clickElement(combinedOwner);
			waitForInvisibility(loaderIcon);
			LoggerManager.info("Clicked on the combined owner hyperlink.");

			// Get a list of all open window handles
			List<String> windowHandles = new ArrayList<>(driver.getWindowHandles());
			waitForInvisibility(loaderIcon);

			// Ensure we have at least three window handles before switching
			if (windowHandles.size() > 2) {
				// Switch to the new tab (third tab)
				driver.switchTo().window(windowHandles.get(2));
				waitForInvisibility(loaderIcon);
				LoggerManager.info("Switched to the combined owner details tab.");


				// Attempt to press the escape key
				try {
					pressEscapeKey();
				} catch (Exception e) {
					LoggerManager.error("Error while pressing escape key: " + e.getMessage());
				}

				// Switch back to the original tab (second tab)
				driver.switchTo().window(windowHandles.get(1));
				LoggerManager.info("Switched back to the main window after viewing combined owner details.");
				return true; // Successfully navigated to and returned from the hyperlink
			} else {
				LoggerManager.warn("Expected third window handle was not found.");
				return false;
			}
		} catch (Exception e) {
			LoggerManager.error("Error in verifying combined owner hyperlink: " + e.getMessage());
			return false;
		}
	}

}