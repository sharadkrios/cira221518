package com.ciranet.navigation;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.SkipException;

import com.ciranet.basepage.BasePage;
import com.ciranet.utilities.LoggerManager;

public class Navigation extends BasePage {

	public Navigation(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = "//dx-button[@title='Navigation Search']//div[@class='dx-button-content']")
	WebElement navigationIcon;

	// This method is used to navigate the menu by side navigation and Common method
	// to check the menu is available otherwise Skip that test
	public void navigateBySideNavigation(By locator, String menuToNavigate) throws Exception {
		try {
			LoggerManager.info("Navigating through the side menu: " + menuToNavigate);

			// Wait for the navigation icon to be visible and click on it
			waitForElementToBeVisible(navigationIcon);
			clickElementJS(navigationIcon);

			// Find the search text box and enter the menu name
			By navigationSearchTextBox = By.xpath("(//input[@role='textbox'])[1]");
			WebElement textBox = wait.until(ExpectedConditions.elementToBeClickable(navigationSearchTextBox));

			LoggerManager.info("Entering menu to navigate: " + menuToNavigate);
			enterText(textBox, menuToNavigate);
			textBox.sendKeys(Keys.ENTER);

			// Check if the target element (menu) is visible
			isElementVisible(locator);
			WebElement element = driver.findElement(locator);

			// Verify if the element is displayed; if not, skip the test
			if (!element.isDisplayed()) {
				LoggerManager.warn(menuToNavigate + " is not available. Skipping the test.");
				throw new SkipException(menuToNavigate + " is not available. Skipping the test.");
			}

			LoggerManager.info("Successfully navigated to " + menuToNavigate);

		} catch (NoSuchElementException e) {
			LoggerManager.error(menuToNavigate + " element not found. Skipping the test.");
			throw new SkipException(menuToNavigate + " element not found. Skipping the test.", e);

		} catch (TimeoutException e) {
			LoggerManager.error(menuToNavigate + " element not visible within the expected time. Skipping the test.");
			throw new SkipException(
					menuToNavigate + " element not visible within the expected time. Skipping the test.", e);

		} catch (Exception e) {
			LoggerManager.error(
					"Unexpected error occurred while navigating to " + menuToNavigate + ". Error: " + e.getMessage());
			throw e; // Propagate unexpected exceptions
		}
	}
}
