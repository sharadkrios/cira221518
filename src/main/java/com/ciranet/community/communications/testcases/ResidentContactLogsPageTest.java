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
public class ResidentContactLogsPageTest extends TestBase {

    ResidentContactLogsPage residentContactLogs = createPage(ResidentContactLogsPage.class);

    @Test(priority = 0, description = "Verify Resident Contact Logs Community Search", groups = {Constants.SMOKE_TESTING}, alwaysRun = true)
    public void navigate() {
        LoggerManager.info("Starting test: Verifying Resident Contact Logs navigation");
        TestBase.setExtentReportSettings("Resident Contact Logs Test", Constants.SMOKE_TESTING, "Verify Resident Contact Logs navigation", "Verifying Resident Contact Logs navigation");

        residentContactLogs = new ResidentContactLogsPage(driver);
        String communitySearchKeyword = "Amberwood"; // Define the search keyword.

        // Validate navigation to the page.
        residentContactLogs.navigate(communitySearchKeyword);
    }

    @Test(priority = 1, description = "Verify Resident Contact Logs Historical Hyperlink", groups = {Constants.FUNCTIONAL_TESTING}, alwaysRun = true)
    public void verifyResidentContactLogsHistoricalHyperlink() throws TimeoutException {
        LoggerManager.info("Starting test: Verify Resident Contact Logs Historical Hyperlink");
        TestBase.setExtentReportSettings("Resident Contact Logs - Historical Hyperlink", Constants.FUNCTIONAL_TESTING, "Verify Resident Contact Logs Historical Hyperlink", "Verifying Resident Contact Logs Historical Hyperlink");

        residentContactLogs = new ResidentContactLogsPage(driver);

        // Validate historical hyperlink functionality.
        residentContactLogs.verifyResidentContactLogsHistoricalHyperlink();
        LoggerManager.info("Test passed: Historical hyperlinks in Resident Contact Logs verified successfully.");
    }
}
