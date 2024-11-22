package com.ciranet.myworkqueue.communityonboarding.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import com.ciranet.basepage.BasePage;
import com.ciranet.utilities.LoggerManager;

public class OnBoardingChecklistPage extends BasePage {
	public OnBoardingChecklistPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = "dx-loadindicator-icon")
	WebElement loaderIcon;

	@FindBy(xpath = "//div[@class='header-text']//span[contains(text(),'My Work Queue')]")
	WebElement myWorkQueue;

	@FindBy(xpath = "//span[normalize-space()='Community On-Boarding']")
	WebElement communityOnBoadingMenu;

	@FindBy(xpath = "//span[normalize-space()='On-Boarding Checklist']")
	WebElement onBoardingChecklist;

	@FindBy(xpath = "//h2[@class='page-header']")
	WebElement onBoardingChecklistPageTitle;

	@FindBy(xpath = "//dx-button[@title='Hide Menu']//i[@class='dx-icon dx-icon-menu']")
	WebElement hamburger;

	@FindBy(xpath = "(//div[@class='dx-dropdowneditor-icon'])[1]")
	WebElement departmentDropDown;

	@FindBy(xpath = "//div[contains(text(),'GrandManors Accounting')]")
	WebElement departmentDropDownValue;

	@FindBy(xpath = "(//div[@class='dx-dropdowneditor-icon'])[2]")
	WebElement statusDropDown;

	@FindBy(xpath = "//div[contains(text(),'In Production')]")
	WebElement statusDropDownValue;

	@FindBy(xpath = "//span[normalize-space()='Refresh']")
	WebElement refreshButton;

	@FindBy(xpath = "//div[@role='presentation']//div[text()='Status']")
	WebElement statusColumn;

	@FindBy(xpath = "(//div[@class='dx-button-content']//span[contains(text(),'Action')])[1]")
	WebElement actionButton;

	@FindBy(xpath = "//div[contains(text(),'Change Assign To')]")
	WebElement changeAssignToMenu;

	@FindBy(xpath = "//div[contains(text(),'Assigned To User')]")
	WebElement assignToUserPopUpTitle;

	@FindBy(xpath = "(//div[@class='dx-button-content']//span[contains(text(),'Select')])[1]")
	WebElement selectButton;

	@FindBy(xpath = "//div[@class='dx-template-wrapper dx-popup-title dx-has-close-button']")
	WebElement errorPopupTitle;

	@FindBy(xpath = "//dx-button[@aria-label='Close']//span[@class='dx-button-text'][normalize-space()='Close']")
	WebElement errorPopupCloseButton;

	@FindBy(xpath = "//i[@class='dx-icon fas fa-times']")
	WebElement closeAssignToUserPopupButton;

	@FindBy(xpath = "//div[@class='dx-button-content']//i[@class='dx-icon cc-icon fas fa-ban fa-flip-horizontal']")
	WebElement resetLayout;

	@FindBy(xpath = "//i[@class='dx-icon cc-icon far fa-plus-square']")
	WebElement expandAll;

	@FindBy(xpath = "//div[@class='menu-text'][normalize-space()='Approve']")
	WebElement approveMenu;

	@FindBy(xpath = "//div[contains(text(),'Notes for Approval without Documents')]")
	WebElement approvePopUPTitle;

	@FindBy(xpath = "(//div[@class='dx-texteditor-container']//textarea[@role='textbox'])[2]")
	WebElement approvingNotesTextBox;

	@FindBy(xpath = "//div[@class='dx-button-content']//span[normalize-space()='Save']")
	WebElement saveApprovingNotesButton;

	@FindBy(xpath = "(//div[@class='menu-item-container']//div[@class='menu-text'])[3]")
	WebElement emailReminderMenu;

	@FindBy(xpath = "//div[contains(text(),'Service Team')]")
	WebElement serviceTeamMenu;

	@FindBy(xpath = "//div[contains(text(),'CiraConnect Account Managers')]")
	WebElement serviceTeamMail;

	@FindBy(xpath = "//div[contains(text(),'Set Not Applicable')]")
	WebElement setNotApplicableMenu;

	@FindBy(xpath = "//div[@aria-label='No']//div[@class='dx-button-content']")
	WebElement noConfirmationPopup;

	@FindBy(xpath = "//div[contains(text(),'Confirmation')]")
	WebElement confirmationPopup;

	@FindBy(xpath = "(//div[@class='dx-template-wrapper']//i[@ng-reflect-ng-class='fas fa-paperclip'])[1]")
	WebElement attachmentIcon;

	@FindBy(xpath = "//div[@class='button-template-content dx-template-wrapper dx-button-content']")
	WebElement communityDocumentButton;

	@FindBy(xpath = "(//div[@class='dx-template-wrapper']//i[@class='dx-icon-folder'])[7]")
	WebElement communityDocumentTree;

	@FindBy(xpath = "(//div[@class='dx-checkbox-container']//span[@class='dx-checkbox-icon'])[2]")
	WebElement communityDocumentCheckList;

	@FindBy(xpath = "//div[@class='dx-button-content']//span[normalize-space()='Attach']")
	WebElement attachCommunityDocumentButton;

	@FindBy(xpath = "//div[contains(text(),'Manage Documents')]")
	WebElement manageDocumentPopUP;

	@FindBy(xpath = "(//div[@role='presentation'])[34]")
	WebElement approvedOnColumnHeader;

	@FindBy(xpath = "(//i[@class='cc-1-5x cc-blue-icon fas fa-envelope'])[1]")
	WebElement emailEnvelopIcon;

	@FindBy(xpath = "//div[@class='dx-item-content dx-toolbar-item-content']//div[contains(text(),'Emails')]")
	WebElement emailPopupTitle;

	@FindBy(xpath = "//span[normalize-space()='Link Emails']")
	WebElement linkEmailButton;

	@FindBy(xpath = "(//span[@class='dx-button-text'][normalize-space()='Close'])[1]")
	WebElement viewCloseIcon;

	@FindBy(xpath = "//span[normalize-space()='Close']")
	WebElement emailCloseIcon;

	@FindBy(xpath = "(//i[@class='cc-1-5x cc-blue-icon fas fa-history'])[1]")
	WebElement logIcon;

	@FindBy(xpath = "//div[@class='dx-item dx-toolbar-item dx-toolbar-label']")
	WebElement logPopupTitle;

	@FindBy(xpath = "//i[@class='dx-icon dx-icon-close']")
	WebElement logCloseIcon;

	@FindBy(xpath = "(//i[@class='cc-1-5x cc-icon-check fas fa-clipboard-check'])[1]")
	WebElement notesIconWithCheckMark;

	@FindBy(xpath = "(//i[@class='cc-1-5x cc-blue-icon far fa-clipboard'])[1]")
	WebElement notesIconWithUncheckMark;

	@FindBy(xpath = "(//div[@class='dx-item-content dx-toolbar-item-content'])[25]")
	WebElement notesPopupTitle;

	@FindBy(xpath = "(//div[@class='dx-texteditor-container']//textarea[@role='textbox'])[2]")
	WebElement notesTextArea;

	@FindBy(xpath = "//span[normalize-space()='Save']")
	WebElement saveNotesButton;

	@FindBy(xpath = "//span[normalize-space()='Close']")
	WebElement closeManageDocumentbutton;

	public String onBoardingChecklistMenu() throws Exception {
		try {			
			waitForInvisibility(loaderIcon);
			clickElementJS(myWorkQueue);
			clickElementJS(communityOnBoadingMenu);
			waitForInvisibility(loaderIcon);
			clickElementJS(onBoardingChecklist);
			waitForInvisibility(loaderIcon);			
			return onBoardingChecklistPageTitle.getText();
		} catch (Exception e) {
			LoggerManager.error("Exception in onBoardingChecklistMenu: " + e.getMessage());
			throw e; // Re-throw the exception after logging
		}
	}

	public String changeAssignedToAction() throws Exception {
		String popUpTitleAssignToUser = "";
		try {
			
			waitForInvisibility(loaderIcon);
			clickElement(hamburger);
			waitForInvisibility(loaderIcon);
			clickElement(departmentDropDown);
			clickElementJS(departmentDropDownValue);
			waitForInvisibility(loaderIcon);
			clickElement(statusDropDown);
			clickElementJS(statusDropDownValue);
			clickElement(refreshButton);
			waitForInvisibility(loaderIcon);
			clickElement(resetLayout);
			waitForInvisibility(loaderIcon);
			clickElement(expandAll);
			waitForInvisibility(loaderIcon);
			clickElementJS(actionButton);
			clickElementJS(changeAssignToMenu);
			waitForInvisibility(loaderIcon);
			popUpTitleAssignToUser = assignToUserPopUpTitle.getText();			
			clickElementJS(selectButton);
			waitForInvisibility(loaderIcon);

			if (isElementDisplayed(errorPopupTitle)) {
				clickElementJS(errorPopupCloseButton);
				LoggerManager.warn("Error popup displayed and closed.");
			}

			if (isElementDisplayed(closeAssignToUserPopupButton)) {
				clickElementJS(closeAssignToUserPopupButton);
				
			}
			waitForInvisibility(loaderIcon);
		} catch (Exception e) {
			LoggerManager.error("Exception in changeAssignedToAction: " + e.getMessage());
			throw e; // Re-throw the exception after logging it
		}
		return popUpTitleAssignToUser;
	}

	public boolean approveAction() throws Exception {
		try {			
			waitForInvisibility(loaderIcon);
			clickElementJS(actionButton);
			clickElementJS(approveMenu);
			if (isElementDisplayed(approvingNotesTextBox)) {				
				clickElementJS(approvingNotesTextBox);
				approvingNotesTextBox.sendKeys("Approving Notes Testing");
				waitForInvisibility(loaderIcon);
				clickElementJS(saveApprovingNotesButton);
			}
			return true;
		} catch (Exception e) {
			LoggerManager.error("Exception in approveAction: " + e.getMessage());
			throw e; // Re-throw the exception after logging it
		}
	}

	public boolean emailReminderAction() throws Exception {
		try {
			waitForInvisibility(loaderIcon); // Waiting for loader to disappear
			clickElementJS(actionButton);
			waitForInvisibility(loaderIcon);

			Actions actions = new Actions(driver);
			actions.moveToElement(emailReminderMenu).perform();
			waitForInvisibility(loaderIcon);
			actions.moveToElement(serviceTeamMenu).perform();
			waitForInvisibility(loaderIcon);
			actions.moveToElement(serviceTeamMail).perform();
			waitForInvisibility(loaderIcon);
			clickElement(serviceTeamMail);
			waitForInvisibility(loaderIcon);

			if (isElementDisplayed(errorPopupTitle)) {
				clickElement(errorPopupCloseButton);
			}

			waitForInvisibility(loaderIcon);
			return true;
		} catch (Exception e) {
			LoggerManager.error("Exception in emailReminderAction: " + e.getMessage());
			throw e; // Re-throwing the exception after logging it
		}
	}

	public String setNotAppplicableAction() throws Exception {
		String popupConfirmation = "";
		try {
			waitForInvisibility(loaderIcon);
			clickElementJS(actionButton);
			waitForInvisibility(loaderIcon);
			clickElementJS(setNotApplicableMenu);
			popupConfirmation = confirmationPopup.getText();
			LoggerManager.info("Confirmation popup displayed with message: " + popupConfirmation);
			waitForInvisibility(loaderIcon);
			clickElement(noConfirmationPopup);
			waitForInvisibility(loaderIcon);
		} catch (Exception e) {
			LoggerManager.error("Exception in setNotAppplicableAction: " + e.getMessage());
			throw e; // Re-throwing the exception after logging it
		}
		return popupConfirmation;
	}

	public String documentsAdding() throws Exception {
		String popUpManageDocument = "";
		try {
			waitForInvisibility(loaderIcon);
			scrollToElement(attachmentIcon);
			clickElementJS(attachmentIcon);
			waitForInvisibility(loaderIcon);
			popUpManageDocument = manageDocumentPopUP.getText();
			clickElementJS(communityDocumentButton);
			waitForInvisibility(loaderIcon);
			clickElementJS(communityDocumentTree);
			waitForInvisibility(loaderIcon);
			clickElementJS(communityDocumentCheckList);
			waitForInvisibility(loaderIcon);
			clickElementJS(attachCommunityDocumentButton);
			waitForInvisibility(loaderIcon);
			clickElementJS(closeManageDocumentbutton);
		} catch (Exception e) {
			LoggerManager.error("Exception in documentsAdding: " + e.getMessage());
			throw e; // Re-throw the exception after logging
		}
		return popUpManageDocument;
	}

	public String emailLinking() throws Exception {
		String popUpEmailTitle = "";
		try {
			waitForInvisibility(loaderIcon);
			scrollToElement(emailEnvelopIcon);
			clickElementJS(emailEnvelopIcon);
			popUpEmailTitle = emailPopupTitle.getText();
			LoggerManager.info("Email popup displayed with title: " + popUpEmailTitle);
			clickElementJS(linkEmailButton);
			waitForInvisibility(loaderIcon);
			clickElementJS(viewCloseIcon);
			waitForInvisibility(loaderIcon);
			clickElementJS(emailCloseIcon);
		} catch (Exception e) {
			LoggerManager.error("Exception in emailLinking: " + e.getMessage());
			throw e;
		}
		return popUpEmailTitle;
	}

	public boolean logHistory() throws Exception {
		try {
			waitForInvisibility(loaderIcon);
			scrollToElement(logIcon);
			clickElementJS(logIcon);
			waitForInvisibility(loaderIcon);
			clickElementJS(logCloseIcon);
			return true;
		} catch (Exception e) {
			LoggerManager.error("Exception in logHistory: " + e.getMessage());
			throw e;
		}
	}

	public boolean addingNotes() throws Exception {
		try {
			waitForInvisibility(loaderIcon);
			if (isElementDisplayed(notesIconWithCheckMark)) {
				clickElementJS(notesIconWithCheckMark);
			} else {
				clickElementJS(notesIconWithUncheckMark);
			}

			clickElementJS(notesTextArea);
			notesTextArea.sendKeys("Test the Notes");
			clickElementJS(saveNotesButton);
			return true;
		} catch (Exception e) {
			LoggerManager.error("Exception in addingNotes: " + e.getMessage());
			throw e; // Re-throw the exception after logging
		}
	}

}
