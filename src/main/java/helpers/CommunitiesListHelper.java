package helpers;

import com.codeborne.selenide.Configuration;
import page_objects.CommonElements;
import page_objects.CommunitiyPage;

import static org.testng.Assert.assertTrue;

public class CommunitiesListHelper {


    public CommunitiesListHelper goToFirstCommunityInList (String Platform) throws InterruptedException {
        Configuration.timeout = 10000;
        CommunitiyPage.getSelectFirstElementInList().click();
        return this;
    }
    public CommunitiesListHelper goToEvent (String Platform) throws InterruptedException {
        Configuration.timeout = 10000;
        CommunitiyPage.goToFirstEvent().click();
        return this;
    }
    public CommunitiesListHelper leaveEvent (String Platform)  {
        Configuration.timeout = 10000;
        CommunitiyPage.getLeaveEvent().click();
        CommunitiyPage.getLeaveEventTrigger().click();
        CommonElements.confirmLeave().click();
        CommunitiyPage.getReturnToCommunities().click();
        return this;
    }

    public CommunitiesListHelper leaveCommunity (String Platform) throws InterruptedException {
        Configuration.timeout = 10000;
        return this;
    }



//    public CommunitiesListHelper waitOpened() throws InterruptedException {
//        assertTrue(CommunitiyPage.getSelectFirstElementInList().isDisplayed());
//        return this;
//    }
}


