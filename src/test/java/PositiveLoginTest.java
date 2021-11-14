import helpers.CommunitiesListHelper;
import helpers.LoginHelper;
import org.testng.annotations.Test;


public class PositiveLoginTest {
    LoginHelper loginHelper = new LoginHelper();
    CommunitiesListHelper communitiesListHelper = new CommunitiesListHelper();


    @Test
    public void userCanLogin() {
        loginHelper.login("Android"); // Set platform name where to launch tests

    }

    @Test
    public void userCanSignUp() {
        loginHelper.signUp("Android");
    }

    @Test
    public void userCanLoginAndSeeCommunityEvents() throws InterruptedException {
        loginHelper.login("Android");
        communitiesListHelper.goToFirstCommunityInList("Android");
        communitiesListHelper.goToEvent("Android");
        communitiesListHelper.leaveEvent("Android");
        loginHelper.logOut("Android");
    }


}
