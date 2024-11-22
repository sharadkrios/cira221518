package com.ciranet.myworkqueue.communityonboarding.testcases;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import com.ciranet.constants.Constants;
import com.ciranet.myworkqueue.communityonboarding.pages.OnBoardingChecklistPage;
import com.ciranet.testbase.TestBase;
import com.ciranet.utilities.LoggerManager;
import com.ciranet.utilities.RequiresLogin;

@RequiresLogin
public class OnBoardingChecklistPageTest  extends TestBase
{
	// Create the OnBoardingChecklistPage object
	OnBoardingChecklistPage onBoardingChecklistPage = createPage(OnBoardingChecklistPage.class);

	@Test(priority = 0, description = "Verify On Boarding Checklist Page Title", groups = { Constants.SMOKE_TESTING }, alwaysRun=true)
	public void verifyOnBoardingChecklist() throws Exception 
	{
		LoggerManager.info("Verifying On Boarding Checklist Page Title");
		TestBase.setExtentReportSettings("On Boarding Checklist Page Title Test", Constants.SMOKE_TESTING, "Verify On Boarding Checklist Title", "Verifying On Boarding Checklist Page Title");
		onBoardingChecklistPage = new OnBoardingChecklistPage(driver);
		assertEquals(onBoardingChecklistPage.onBoardingChecklistMenu(),"On-Boarding Checklist");
	}
	
	@Test(priority = 1, description = "Verify Change Assign To", groups = {Constants.FUNCTIONAL_TESTING},alwaysRun=true)
	public void verifyChangeAssignedTo() throws Exception 
	{
		LoggerManager.info("Verifying Change Assign To");
		TestBase.setExtentReportSettings("Change Assign To", Constants.FUNCTIONAL_TESTING, "Verify Change Assign To", "Verifying Change Assign To");
		onBoardingChecklistPage = new OnBoardingChecklistPage(driver);
		assertEquals(onBoardingChecklistPage.changeAssignedToAction(), "Assigned To User");
	} 
	
	@Test(priority = 2, description = "Verify Email Reminder", groups = {Constants.FUNCTIONAL_TESTING},alwaysRun=true)
	public void verifyEmailReminderAction() throws Exception 
	{
		LoggerManager.info("Verifying Email Reminder");
		TestBase.setExtentReportSettings("Email Reminder Menu", Constants.FUNCTIONAL_TESTING, "Verify Email Reminder Menu", "Verifying Email Reminder Menu ");
		onBoardingChecklistPage = new OnBoardingChecklistPage(driver);
		assertTrue(onBoardingChecklistPage.emailReminderAction(), "Email Reminder Menu is clicked");
	} 
	
	@Test(priority = 3, description = "Verify Set Not Appplicable", groups = {Constants.FUNCTIONAL_TESTING},alwaysRun=true)
	public void verifySetNotAppplicableAction() throws Exception 
	{
		LoggerManager.info("Verifying Set Not Appplicable");
		TestBase.setExtentReportSettings("Set Not Appplicable Menu", Constants.FUNCTIONAL_TESTING, "Verify Set Not Appplicable Menu", "Verifying Set Not Appplicable Menu ");
		onBoardingChecklistPage = new OnBoardingChecklistPage(driver);
		assertEquals(onBoardingChecklistPage.setNotAppplicableAction(), "Confirmation");
	} 

	@Test(priority = 4, description = "Verify Approval Menu", groups = {Constants.FUNCTIONAL_TESTING},alwaysRun=true)
	public void verifyApproveAction() throws Exception 
	{
		LoggerManager.info("Verifying Approval Menu");
		TestBase.setExtentReportSettings("Verifying Approval Menu", Constants.FUNCTIONAL_TESTING, "Verify Approval Menu", "Verifying Approval Menu ");
		onBoardingChecklistPage = new OnBoardingChecklistPage(driver);
		assertTrue(onBoardingChecklistPage.approveAction(), "Approval Menu is clicked");
	}
	
	@Test(priority = 5, description = "Verify Manage Documents", groups = {Constants.FUNCTIONAL_TESTING},alwaysRun=true)
	public void verifyDocumentsAdding() throws Exception 
	{
		LoggerManager.info("Verifying Manage Documents");
		TestBase.setExtentReportSettings("Verifying Manage Documents", Constants.FUNCTIONAL_TESTING, "Verify Manage Documents", "Verifying Manage Documents");
		onBoardingChecklistPage = new OnBoardingChecklistPage(driver);
		assertEquals(onBoardingChecklistPage.documentsAdding(), "Manage Documents");
	} 
	
	@Test(priority = 6, description = "Verify Email Link", groups = {Constants.FUNCTIONAL_TESTING},alwaysRun=true)
	public void verifyEmailLinking() throws Exception 
	{
		LoggerManager.info("Verifying Email Link");
		TestBase.setExtentReportSettings("Verifying Email Link", Constants.FUNCTIONAL_TESTING, "Verify Email Link", "Verifying Email Link");
		onBoardingChecklistPage = new OnBoardingChecklistPage(driver);
		assertEquals(onBoardingChecklistPage.emailLinking(), "Emails");
	} 
	
	@Test(priority = 7, description = "Verify Logs icon", groups = {Constants.FUNCTIONAL_TESTING},alwaysRun=true)
	public void verifyLogHistory() throws Exception 
	{
		LoggerManager.info("Verifying Logs icon");
		TestBase.setExtentReportSettings("Verifying Logs icon", Constants.FUNCTIONAL_TESTING, "Verify Logs icon", "Verifying Logs icon");
		onBoardingChecklistPage = new OnBoardingChecklistPage(driver);
		assertTrue(onBoardingChecklistPage.logHistory(), "Logs icon is clicked");	
	} 
	
	@Test(priority = 8, description = "Verify Notes Icon", groups = {Constants.FUNCTIONAL_TESTING},alwaysRun=true)
	public void verifyAddingNotes() throws Exception 
	{
		LoggerManager.info("Verifying Notes Icon");
		TestBase.setExtentReportSettings("Verifying Notes Icon", Constants.FUNCTIONAL_TESTING, "Verify Notes Icon", "Verifying Notes Icon");
		onBoardingChecklistPage = new OnBoardingChecklistPage(driver);
		assertTrue(onBoardingChecklistPage.addingNotes(), "Notes icon is clicked");	
	} 

}
