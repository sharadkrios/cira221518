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

    /**
     * Test to verify that the Resident Contact Logs page can successfully search a community.
     */
    @Test(priority = 0, description = "Verify Resident Contact Logs Community Search", groups = {Constants.SMOKE_TESTING}, alwaysRun = true)
    public void verifyHomeOwnerSearch() 
    {
        LoggerManager.info("Starting test: Verify Resident Contact Logs - Community Search");

        // Set Extent report details
        TestBase.setExtentReportSettings("Resident Contact Logs", Constants.SMOKE_TESTING, "Verify Community Search on Resident Contact Logs", "Validating Community Search functionality");

        // Instantiate the page object
        residentContactLogs = new ResidentContactLogsPage(driver);

        // Define the community search keyword
        String communitySearchKeyword = "Amberwood";

        // Perform the community search and validate
        LoggerManager.info("Performing community search for: " + communitySearchKeyword);
        assertTrue(residentContactLogs.verifySearchCommunity(communitySearchKeyword),"Resident Contact Logs is not visible after community search.");
        LoggerManager.info("Test passed: Community Search in Resident Contact Logs verified successfully.");
    }

    /**
     * Test to verify the historical hyperlink functionality in Resident Contact Logs.
     */
    @Test(priority = 1, description = "Verify Resident Contact Logs Historical Hyperlinks", groups = {Constants.FUNCTIONAL_TESTING}, alwaysRun = true)
    public void verifyHistoricalHyperlink() throws TimeoutException 
    {
        LoggerManager.info("Starting test: Verify Resident Contact Logs Historical Hyperlinks");

        // Set Extent report details
        TestBase.setExtentReportSettings("Resident Contact Logs - Historical Hyperlinks",Constants.FUNCTIONAL_TESTING,"Resident Contact Logs","Validating functionality of Resident Contact Logs Historical Hyperlinks");

        // Instantiate the page object
        residentContactLogs = new ResidentContactLogsPage(driver);

        // Perform the historical hyperlink validation
        LoggerManager.info("Verifying the historical hyperlinks functionality.");
        assertTrue(residentContactLogs.verifyHistoricalHyperlink(),"Resident Contact Log Detail Historical hyperlinks are not functional or not visible.");
        LoggerManager.info("Test passed: Historical hyperlinks in Resident Contact Logs verified successfully.");
    }
}
