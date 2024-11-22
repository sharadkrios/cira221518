package com.ciranet.community.compliance.pages;

import java.util.ArrayList;
import java.util.NoSuchElementException;
import java.util.Set;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import com.ciranet.basepage.BasePage;
import com.ciranet.utilities.LoggerManager;


public class DetailedViolationsLogPage extends BasePage {

	public DetailedViolationsLogPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = "(//div[@class='dx-button-content'])[4]")
	WebElement communityIcon;

	@FindBy(xpath = "//input[@role='textbox']")
	WebElement textBox;

	@FindBy(xpath = "//span[contains(text(),'Herff Ranch')]")
	WebElement herffRanchCommunity;

	@FindBy(xpath = "//i[@class='dx-icon fas fa-times']")
	WebElement crossMark;

	@FindBy(xpath = "//div[@class='header-text']//span[contains(text(),'Compliance')]")
	WebElement navigationCompliance;

	@FindBy(xpath = "//span[contains(text(),'Detailed Violations Log')]")
	WebElement detailedViolationsLog;

	@FindBy(xpath = "//h2[text()=' Detailed Violations Log ']")
	WebElement pageTitle;

	@FindBy(xpath = "//dx-button[@text='Refresh']")
	WebElement refreshButton;

	@FindBy(xpath = "//div[@title='Reset Layout']")
	WebElement resetIcon;

	@FindBy(xpath = "//div[@class='dx-group-panel-item dx-datagrid-action dx-datagrid-drag-action']")
	WebElement categoryColumnDrag;

	@FindBy(xpath = "//td[normalize-space()='Status']")
	WebElement categoryColumnDrop;

	@FindBy(xpath = "(//div[@class='dx-button-content']//span[contains(text(),'Action')])[2]")
	WebElement actionButton;

	@FindBy(xpath = "//div[contains(text(),'Escalate Violation')]")
	WebElement escalateViolationMenu;

	// Open Tab
	// Escalate Violations Menu

	@FindBy(xpath = "(//textarea[@role='textbox'])[2]")
	WebElement violationNotesTextbox;

	@FindBy(xpath = "(//div[@class='dx-dropdowneditor-icon'])[16]")
	WebElement actionDropdown;

	@FindBy(xpath = "//div[@class='dx-item-content dx-list-item-content'][normalize-space()='Not Fixed']")
	WebElement actionDropdownValue;

	@FindBy(xpath = "//div[@class='dx-button-content']//span[normalize-space()='Escalate Existing Violation']")
	WebElement escalateExistingViolationButton;

	// Close Violation Menu

	@FindBy(xpath = "//div[contains(text(),'Close Violation')]")
	WebElement closeViolationMenu;

	@FindBy(xpath = "//div[contains(text(),'Resolved Upon ACC Approval')]")
	WebElement resolvedUponACCApprovalMenu;

	@FindBy(xpath = "//div[contains(text(),'Close Reason')]")
	WebElement closeReasonLabel;

	@FindBy(xpath = "//textarea[@role='textbox']")
	WebElement reasonTextbox;

	@FindBy(xpath = "//div[@class='dx-template-wrapper dx-popup-title dx-has-close-button']")
	WebElement errorPopup;

	@FindBy(xpath = "//dx-button[@text='Close']")
	WebElement closeButton;

	@FindBy(xpath = "  //i[@class='dx-icon fas fa-save']")
	WebElement saveButton;

	// Custom Violation Letters Menu

	@FindBy(xpath = "//div[contains(text(),'Custom Violation Letters')]")
	WebElement customViolationLettersMenu;

	@FindBy(xpath = "//div[contains(text(),'TestResponse')]")
	WebElement letterMenu;

	@FindBy(xpath = "//button[@title='Horizontal line']//span[@class='tox-icon tox-tbtn__icon-wrap']//*[name()='svg']")
	WebElement horizontalLineIcon;

	@FindBy(xpath = "//span[normalize-space()='Generate and Save']")
	WebElement generateandSaveButton;

	// Refer to Attorney Menu

	@FindBy(xpath = "//div[contains(text(),'Refer to Attorney')]")
	WebElement referToAttorneyMenu;

	@FindBy(xpath = "//div[contains(text(),'Select Vendor')]")
	WebElement selectVendorLabel;

	@FindBy(xpath = "(//dx-button[@text='Select'])[1]")
	WebElement selectButton;

	@FindBy(xpath = "//dx-button[@text='OK']")
	WebElement okButton;

	// Clear Attorney Flag Menu

	@FindBy(xpath = "//td[normalize-space(.)='Referred to Attorney']//span[contains(@class, 'dx-header-filter')]")
	WebElement filterIcon;

	@FindBy(xpath = "(//span[@class='dx-checkbox-icon'])[3]")
	WebElement filterCheckbox;

	@FindBy(xpath = "(//span[@class='dx-checkbox-icon'])[2]")
	WebElement blankCheckbox;

	@FindBy(xpath = "//div[@aria-label='OK']//div[@class='dx-button-content']")
	WebElement filterOkButton;

	@FindBy(xpath = "//div[contains(text(),'Clear Attorney Flag')]")
	WebElement clearAttorneyFlagMenu;

	@FindBy(xpath = "//div[@class='dx-datagrid-filter-panel-clear-filter']")
	WebElement clearButton;

	// Report Violation Button

	@FindBy(xpath = "//dx-button[@aria-label='Report Violation']//div[@class='dx-button-content']")
	WebElement reportViolationButton;

	@FindBy(xpath = "//div[@class='dx-item-content dx-toolbar-item-content']//div[contains(text(),'Report a Violation')]")
	WebElement reportViolationLabel;

	@FindBy(xpath = "//div[@aria-label='fas fa-ellipsis-h']//i[@class='dx-icon fas fa-ellipsis-h']")
	WebElement propertyDropdown;

	@FindBy(xpath = "(//span[@class='dx-button-text'][normalize-space()='Select'])[2]")
	WebElement propertySelectButton;

	@FindBy(xpath = "(//div[@class='dx-dropdowneditor-icon'])[12]")
	WebElement categoryDropdownIcon;

	@FindBy(xpath = "(//div[@class='dx-item-content dx-list-item-content'])[6]")
	WebElement categoryDropdownValue;

	@FindBy(xpath = "(//div[@class='dx-dropdowneditor-icon'])[13]")
	WebElement subCategoryDropdownIcon;

	@FindBy(xpath = "(//div[@class='dx-item-content dx-list-item-content'])[17]")
	WebElement subCategoryDropdownValue;

	@FindBy(xpath = "(//div[@class='dx-dropdowneditor-icon'])[14]")
	WebElement locationDropdownIcon;

	@FindBy(xpath = "(//div[@class='dx-item-content dx-list-item-content'])[25]")
	WebElement locationDropdownValue;

	@FindBy(xpath = "(//textarea[@role='textbox'])[1]")
	WebElement regardingTextbox;

	@FindBy(xpath = "(//div[@class='dx-dropdowneditor-icon'])[16]")
	WebElement actionDropdownsIcon;

	@FindBy(xpath = "//div[contains(text(),'Request Inspector Follow up')]")
	WebElement actionDropdownsValue;

	@FindBy(xpath = "//span[normalize-space()='Submit New Violation']")
	WebElement submitNewViolationButton;

	// Closed Tab

	@FindBy(xpath = "//span[normalize-space()='Closed']")
	WebElement closedTab;

	@FindBy(xpath = "(//div[@class='dx-template-wrapper']//i[@title='History'])[1]")
	WebElement historyIcon;

	@FindBy(xpath = "//i[@title='Images']")
	WebElement imagesIcon;

	@FindBy(xpath = "(//div[@class='dx-widget dx-button dx-button-mode-text dx-button-normal dx-button-has-icon dx-closebutton'])[2]")
	WebElement imagesCloseButton;

	@FindBy(xpath = "//div[@class='dx-widget dx-button dx-button-mode-text dx-button-normal dx-button-has-icon dx-closebutton']")
	WebElement historyCloseButton;

	@FindBy(xpath = "//h4[normalize-space()='Violation History']")
	WebElement violationHistoryLable;

	@FindBy(xpath = "(//div//input[@aria-label='Filter cell'])[7]")
	WebElement searchFilterCell;

	@FindBy(xpath = "//tr[@class='dx-row dx-data-row dx-row-lines dx-column-lines']//span[contains(text(),'240 Mustang Run')]")
	WebElement propertyAddressColumn;

	@FindBy(xpath = "//div[@class='context-summary context-summary-lg']")
	WebElement propertyAddressDetails;

	// Allowances Tab
	@FindBy(xpath = "//span[contains(text(),'Allowances')]")
	WebElement allowancesTab;

	@FindBy(xpath = "//div[@class='dx-group-panel-item dx-datagrid-action dx-datagrid-drag-action']")
	WebElement typeColumnDrag;

	@FindBy(xpath = "//td[normalize-space()='Current Owner']")
	WebElement typeColumnDrop;

	@FindBy(xpath = "(//div[@class='dx-button-content']//span[contains(text(),'Action')])[1]")
	WebElement action;

	@FindBy(xpath = "//div[contains(text(),'Edit')]")
	WebElement editMenu;

	@FindBy(xpath = "//span[contains(text(),'Sub-Category:')]")
	WebElement subCategoryLabel;

	@FindBy(xpath = "//dx-button[@title='Update']")
	WebElement updateButton;

	@FindBy(xpath = "dx-loadindicator-icon")
	WebElement loaderIcon;

	
	public String detailedViolationsLogMenu() throws Exception {
	    try {
	        waitForInvisibility(loaderIcon);
	        clickElementJS(communityIcon);
	        waitForInvisibility(loaderIcon);

	        clickElementJS(textBox);
	        enterText(textBox, "Herff Ranch");
	        textBox.sendKeys(Keys.ENTER);

	        clickElementJS(herffRanchCommunity);
	        ArrayList<String> communityTabs = new ArrayList<>(driver.getWindowHandles());
	        driver.switchTo().window(communityTabs.get(1));
	        clickElementJS(crossMark);
	        waitForInvisibility(loaderIcon);
	        clickElementJS(navigationCompliance);
	        waitForInvisibility(loaderIcon);

	        clickElementJS(detailedViolationsLog);
	        waitForInvisibility(loaderIcon);

	        return pageTitle.getText();

	    } catch (NoSuchElementException e) {
	        LoggerManager.error("No such element exception in detailedViolationsLogMenu: " + e.getMessage());
	        throw e;  
	    } catch (Exception e) {
	        LoggerManager.error("Exception in detailedViolationsLogMenu: " + e.getMessage());
	        throw e;  
	    }
	}
	
	
	//Open Tab
	public String escalateViolationsAction() throws Exception {
	    String escalateExistingViolationLabel = "";
	    try {
	        waitForInvisibility(loaderIcon);
	        clickElementJS(refreshButton);
	        clickElementJS(resetIcon);
	        waitForInvisibility(loaderIcon);

	        scrollToElement(filterIcon);
	        clickElementJS(filterIcon);
	        clickElementJS(blankCheckbox);
	        clickElementJS(filterOkButton);
	        waitForInvisibility(loaderIcon);

	        Actions actions = new Actions(driver);
	        actions.dragAndDrop(categoryColumnDrag, categoryColumnDrop).build().perform();

	        waitForInvisibility(loaderIcon);

	        clickElement(actionButton);
	        clickElementJS(escalateViolationMenu);
	        waitForInvisibility(loaderIcon);
	        clickElementJS(violationNotesTextbox);
	        enterText(violationNotesTextbox, "Test");
	        waitForInvisibility(loaderIcon);

	        escalateExistingViolationLabel = escalateExistingViolationButton.getText();
	        clickElementJS(actionDropdown);
	        waitForInvisibility(loaderIcon);
	        clickElementJS(actionDropdownValue);
	        waitForInvisibility(loaderIcon);

	        clickElementJS(escalateExistingViolationButton);
	        waitForInvisibility(loaderIcon);

	    } catch (Exception e) {
	        LoggerManager.error("Exception in escalateViolationsAction: " + e.getMessage());
	        throw e;  
	    }
	    return escalateExistingViolationLabel;
	}

	public String closeViolationAction() throws Exception {
	    String popupTitle = "";
	    try {
	        waitForInvisibility(loaderIcon);
	        clickElementJS(actionButton);
	        waitForInvisibility(loaderIcon);

	        Actions actions = new Actions(driver);
	        actions.moveToElement(closeViolationMenu).perform();
	        waitForInvisibility(loaderIcon);

	        clickElementJS(resolvedUponACCApprovalMenu);
	        waitForInvisibility(loaderIcon);
	        popupTitle = closeReasonLabel.getText();
	        waitForInvisibility(loaderIcon);
	        clickElementJS(reasonTextbox);
	        enterText(reasonTextbox, "Detailed Violations Log testing purpose.");

	        if (isElementDisplayed(closeButton)) {
	            clickElement(closeButton);
	        }

	        clickElementJS(saveButton);
	        waitForInvisibility(loaderIcon);

	    } catch (Exception e) {
	        LoggerManager.error("Exception in closeViolationAction: " + e.getMessage());
	        throw e;  
	    }
	    return popupTitle;
	}

	public String customViolationLettersAction() throws Exception {
	    String generateAndSaveLabel = "";
	    try {
	        waitForInvisibility(loaderIcon);
	        clickElementJS(actionButton);
	        waitForInvisibility(loaderIcon);
	        clickElementJS(customViolationLettersMenu);
	        clickElementJS(letterMenu);
	        generateAndSaveLabel = generateandSaveButton.getText();
	        waitForInvisibility(loaderIcon);
	        clickElementJS(generateandSaveButton);

	    } catch (Exception e) {
	        LoggerManager.error("Exception in customViolationLettersAction: " + e.getMessage());
	        throw e;  
	    }
	    return generateAndSaveLabel;
	}

	public String referToAttorneyAction() throws Exception {
	    String popupTitle = "";
	    try {
	        waitForInvisibility(loaderIcon);
	        clickElementJS(actionButton);
	        clickElementJS(referToAttorneyMenu);
	        waitForInvisibility(loaderIcon);
	        clickElementJS(selectButton);
	        popupTitle = selectVendorLabel.getText();
	        waitForInvisibility(loaderIcon);

	    } catch (Exception e) {
	        LoggerManager.error("Exception in referToAttorneyAction: " + e.getMessage());
	        throw e;  
	    }
	    return popupTitle;
	}

	public boolean clearAttorneyFlag() throws Exception {
	    try {
	        waitForInvisibility(loaderIcon);
	        clickElementJS(refreshButton);
	        clickElementJS(resetIcon);
	        waitForInvisibility(loaderIcon);

	        scrollToElement(filterIcon);
	        clickElementJS(filterIcon);
	        clickElementJS(filterCheckbox);
	        clickElementJS(filterOkButton);
	        waitForInvisibility(loaderIcon);

	        Actions actions = new Actions(driver);
	        actions.dragAndDrop(categoryColumnDrag, categoryColumnDrop).build().perform();

	        clickElement(actionButton);
	        waitForInvisibility(loaderIcon);
	        clickElement(clearAttorneyFlagMenu);
	        waitForInvisibility(loaderIcon);
	        return true;
	    } catch (Exception e) {
	        LoggerManager.error("Exception in clearAttorneyFlag: " + e.getMessage());
	        throw e;  
	    }
	}

	public String reportViolation() throws Exception {
	    String violationLabel = "";
	    try {
	        waitForInvisibility(loaderIcon);
	        clickElementJS(reportViolationButton);

	        violationLabel = reportViolationLabel.getText();
	        waitForInvisibility(loaderIcon);
	        clickElementJS(propertyDropdown);
	        waitForInvisibility(loaderIcon);
	        clickElementJS(propertySelectButton);
	        waitForInvisibility(loaderIcon);
	        clickElementJS(categoryDropdownIcon);
	        waitForInvisibility(loaderIcon);
	        clickElementJS(categoryDropdownValue);
	        waitForInvisibility(loaderIcon);
	        clickElementJS(subCategoryDropdownIcon);
	        waitForInvisibility(loaderIcon);
	        clickElementJS(subCategoryDropdownValue);
	        waitForInvisibility(loaderIcon);
	        clickElementJS(locationDropdownIcon);
	        waitForInvisibility(loaderIcon);
	        clickElementJS(locationDropdownValue);
	        waitForInvisibility(loaderIcon);
	        clickElementJS(regardingTextbox);
	        enterText(regardingTextbox, "Test");
	        clickElementJS(violationNotesTextbox);
	        enterText(violationNotesTextbox, "Test");
	        clickElementJS(actionDropdownsIcon);
	        
	        clickElementJS(actionDropdownsValue);
	        waitForInvisibility(loaderIcon);
	        clickElementJS(submitNewViolationButton);
	        waitForInvisibility(loaderIcon);

	    } catch (Exception e) {
	        LoggerManager.error("Exception in reportViolation: " + e.getMessage());
	        throw e;  
	    }
	    return violationLabel;
	}

	//Close Tab
	public boolean closedViolationHistory() throws Exception {
	    try {
	        waitForInvisibility(loaderIcon);
	        clickElementJS(closedTab);
	        waitForInvisibility(loaderIcon);
	        clickElementJS(refreshButton);
	        clickElementJS(resetIcon);
	        waitForInvisibility(loaderIcon);

	        Actions actions = new Actions(driver);
	        actions.dragAndDrop(categoryColumnDrag, categoryColumnDrop).build().perform();
	        waitForInvisibility(loaderIcon);
	        clickElementJS(historyIcon);
	        waitForInvisibility(loaderIcon);
	        waitForInvisibility(loaderIcon);
	        if (isElementDisplayed(imagesIcon)) {
	            clickElementJS(imagesIcon);
	            waitForInvisibility(loaderIcon);
	            clickElement(imagesCloseButton);
	        }

	        clickElementJS(historyCloseButton);
	        return true;
	    } catch (Exception e) {
	        LoggerManager.error("Exception in closedViolationHistory: " + e.getMessage());
	        throw e;  
	    }
	}

	public boolean propertyAddress() throws Exception {
	    LoggerManager.info("Entered propertyAddress method.");
	    try {
	        waitForInvisibility(loaderIcon);
	        clickElementJS(closedTab);
	        waitForInvisibility(loaderIcon);
	        
	        clickElementJS(refreshButton);
	        clickElementJS(resetIcon);
	        waitForInvisibility(loaderIcon);

	        clickElementJS(searchFilterCell);
	        waitForInvisibility(loaderIcon);
	        enterText(searchFilterCell, "240 Mustang Run");
	        Actions actions = new Actions(driver);
	        actions.dragAndDrop(categoryColumnDrag, categoryColumnDrop).build().perform();
	        waitForInvisibility(loaderIcon);
	        
	        clickElementJS(propertyAddressColumn);
	        waitForInvisibility(loaderIcon);

	        Set<String> windowHandles = driver.getWindowHandles();
	        String[] windows = windowHandles.toArray(new String[0]);
	        driver.switchTo().window(windows[2]);
	        waitForInvisibility(loaderIcon);
	        
	        clickElementJS(crossMark);
	        waitForInvisibility(loaderIcon);

	        driver.switchTo().window(windows[1]);
	        return true;
	    } catch (Exception e) {
	        LoggerManager.error("Exception in propertyAddress method: " + e.getMessage());
	        throw e;  
	    }
	}

	// Allowances Tab
	public boolean editAllowances() throws Exception {
	    try {
	        waitForInvisibility(loaderIcon);
	        clickElement(allowancesTab);
	        waitForInvisibility(loaderIcon);
	        clickElementJS(refreshButton);
	        clickElementJS(resetIcon);
	        waitForInvisibility(loaderIcon);
	        Actions actions = new Actions(driver);
	        actions.dragAndDrop(typeColumnDrag, typeColumnDrop).build().perform();

	        waitForInvisibility(loaderIcon);
	        clickElement(action);
	        clickElement(editMenu);
	        waitForInvisibility(loaderIcon);
	        clickElementJS(updateButton);
	        return true;
	    } catch (Exception e) {
	        System.err.println("Exception in editAllowances: " + e.getMessage());
	        throw e;
	    }
	}

}
