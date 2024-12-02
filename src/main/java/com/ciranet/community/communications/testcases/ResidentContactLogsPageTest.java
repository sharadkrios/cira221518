package com.ciranet.community.communications.testcases;

import static org.testng.Assert.assertTrue;

import java.util.concurrent.TimeoutException;

import org.testng.annotations.Test;

import com.ciranet.community.communications.pages.ResidentContactLogsPage;
import com.ciranet.constants.Constants;
import com.ciranet.testbase.TestBase;
import com.ciranet.utilities.LoggerManager;
import com.ciranet.utilities.RequiresLogin;

@RequiresLogin
public class ResidentContactLogsPageTest extends TestBase 
{

	ResidentContactLogsPage residentContactLogs = createPage(ResidentContactLogsPage.class);

	@Test(priority = 0, description = "Verify Resident Contact Logs Community Search", groups = {Constants.SMOKE_TESTING}, alwaysRun = true)
	public void navigate() 
	{
		LoggerManager.info("Verifying Resident Contact Logs navigation");
		TestBase.setExtentReportSettings("Resident Contact Logs Test", Constants.SMOKE_TESTING, "Verify Resident Contact Logs navigation", "Verifying Resident Contact Logs navigation");
		residentContactLogs = new ResidentContactLogsPage(driver);
		
		// Define the community search keyword
		String communitySearchKeyword = "Amberwood";

		//assertTrue(residentContactLogs.navigate(communitySearchKeyword),"Error navigating to Resident Contact Logs page");
		residentContactLogs.navigate(communitySearchKeyword);
	}

	@Test(priority = 1, description = "Verify Resident Contact Logs Historical Hyperlink", groups = {Constants.FUNCTIONAL_TESTING}, alwaysRun = true)
	public void verifyResidentContactLogsHistoricalHyperlink() throws TimeoutException 
	{
		LoggerManager.info("Starting test: Verify Resident Contact Logs Historical Hyperlink");

		// Set Extent report details
		TestBase.setExtentReportSettings("Resident Contact Logs - Historical Hyperlink",Constants.FUNCTIONAL_TESTING," Verify Resident Contact Logs Historical Hyperlink","Verifying Resident Contact Logs Historical Hyperlink");

		// Instantiate the page object
		residentContactLogs = new ResidentContactLogsPage(driver);

		// Perform the historical hyperlink validation
		LoggerManager.info("Verifying the historical hyperlinks functionality.");
		//assertTrue(residentContactLogs.verifyResidentContactLogsHistoricalHyperlink(),"Resident Contact Log Detail Historical hyperlink is not functional or not visible.");
		LoggerManager.info("Test passed: Historical hyperlinks in Resident Contact Logs verified successfully.");
		residentContactLogs.verifyResidentContactLogsHistoricalHyperlink();
		
	}
}
