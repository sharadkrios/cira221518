package com.ciranet.community.communications.testcases;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import com.ciranet.community.communications.pages.MailMergePage;
import com.ciranet.constants.Constants;
import com.ciranet.testbase.TestBase;
import com.ciranet.utilities.LoggerManager;
import com.ciranet.utilities.RequiresLogin;

@RequiresLogin
public class MailMergePageTest extends TestBase 
{
	MailMergePage mailMerge = createPage(MailMergePage.class);

	@Test(priority = 0, description = "Verify Mail Merge navigation", groups = {Constants.SMOKE_TESTING}, alwaysRun=true)
	public void verifymailMergenavigation()
	{
		LoggerManager.info("Verifying mailMerge navigation");
		TestBase.setExtentReportSettings("Mail Merge navigation Test", Constants.SMOKE_TESTING, "Verify Mail Merge navigation", "Verifying Mail Merge navigation");
		mailMerge = new MailMergePage(driver);
		String communitySearchKeyword = "Amberwood";
		assertTrue(mailMerge.navigate(communitySearchKeyword), "Error navigating to Mail Merge Page.");
	}

	@Test(priority = 1, description = "Verify Mail Merge Dropdown selection", groups = {Constants.FUNCTIONAL_TESTING }, alwaysRun=true)
	public void verifyDropdownselection() 
	{
		LoggerManager.info("Verifying Mail Merge Dropdown selection");
		TestBase.setExtentReportSettings("Mail Merge Dropdown selection", Constants.FUNCTIONAL_TESTING, "Verify Mail Dropdown selection", "Verifying Mail Merge Dropdown selection");
		mailMerge = new MailMergePage(driver);
		assertTrue(mailMerge.verifyMailMergeDropdownSelection(), "Mail Merge Dropdown selection are not seen");
	}
	
	@Test(priority = 2, description = "Verify Mail Merge Create Labels button", groups = {Constants.FUNCTIONAL_TESTING }, alwaysRun=true)
	public void verifyCreateLabels()
	{
		LoggerManager.info("Verifying mailMerge- Create Labels");
		TestBase.setExtentReportSettings("Mail Merge Create Labels", Constants.FUNCTIONAL_TESTING, "Verify Create Labels", "Verifying Create Labels");
		mailMerge = new MailMergePage(driver);
		assertTrue(mailMerge.verifyMailMergeCreateLabelsButton(), "Create Labels is not seen");
	}
	

	@Test(priority = 3, description = "Verify Mail Merge Browse button", groups = {Constants.FUNCTIONAL_TESTING }, alwaysRun=true)
	public void verifyBrowseButton() 
	{
		LoggerManager.info("Verifying mailMerge- Browse button");
		TestBase.setExtentReportSettings("Mail Merge Browse button", Constants.FUNCTIONAL_TESTING, "Verify Browse button", "Verifying Browse button");
		mailMerge = new MailMergePage(driver);
		assertTrue(mailMerge.verifyMailMergeBrowseButton(), "Browse button is not seen");
	}

	@Test(priority = 4, description = "Verify Mail Merge View or Save Standard Letter head Template", groups = {Constants.FUNCTIONAL_TESTING }, alwaysRun=true)
	public void verifyViewSaveStandardLetterheadTemplate()
	{
		LoggerManager.info("Verifying Mail Merge View or Save Standard Letter head Template");
		TestBase.setExtentReportSettings("Mail Merge View or Save Standard Letter head Template", Constants.FUNCTIONAL_TESTING, "Verify View or Save Standard Letter head Template hyperlink", "Verifying Mail Merge View or Save Standard Letter head Template");
		mailMerge = new MailMergePage(driver);
		assertTrue(mailMerge.verifyMailMergeViewOrSaveLetterheadTemplate(), "View or Save Standard Letter head Template hyperlink is not clicked");
	}

	@Test(priority = 5, description = "Verify CustomerId hyperlinks", groups = {Constants.FUNCTIONAL_TESTING }, alwaysRun=true)
	public void verifyCustomerIdhyperlink()
	{
		LoggerManager.info("Verifying CustomerId hyperlinks");
		TestBase.setExtentReportSettings("CustomerId hyperlinks", Constants.FUNCTIONAL_TESTING, "Verify CustomerId hyperlinks", "Verifying CustomerId hyperlinks");
		mailMerge = new MailMergePage(driver);
		assertTrue(mailMerge.verifyCustomerIdHyperlinks(),"CustomerId hyperlinks are not seen");
	}

	@Test(priority = 6, description = "Verify Combined Owner hyperlinks", groups = {Constants.FUNCTIONAL_TESTING }, alwaysRun=true)
	public void verifyCombinedOwnerhyperlink()
	{
		LoggerManager.info("Verifying Combined Owner hyperlinks");
		TestBase.setExtentReportSettings("Combined Owner hyperlinks", Constants.FUNCTIONAL_TESTING, "Verify Combined Owner hyperlinks", "Verifying Combined Owner hyperlinks");
		mailMerge = new MailMergePage(driver);
		assertTrue(mailMerge.verifyCombinedOwnerHyperlinks(),"Combined Owner hyperlinks are not seen");
	}

	@Test(priority = 7, description = "Verify Help Button", groups = {Constants.FUNCTIONAL_TESTING }, alwaysRun=true)
	public void verifyhelpMailMerge()
	{
		LoggerManager.info("Verifying Help");
		TestBase.setExtentReportSettings("Verify Mail Merge  Help", Constants.FUNCTIONAL_TESTING, "Verify Mail Merge", "Verifying Mail Merge Help");
		mailMerge = new MailMergePage(driver);
		assertTrue(mailMerge.verifyHelpButton(),"Help icon for Mail Merge is not seen");
	}
	
	

}
