package Steps;

import Pages.*;

/**
 * Created by zhukov on 4/20/2017.
 */
public class LoginSteps extends BaseStep {

    //Login method
    public void loginToSite(InitialPage initialPage) {
        mainPage = initialPage.openMainPage();
        loginPage = mainPage.clickSignInButton();
        loggedMainPage = loginPage.login_to_site(USERNAME, PASSWORD);
    }

    //
    public String getUserNameForAssert() {
        return loggedMainPage.get_usrename_from_dropmenu();
    }

    public void logoutFromSiteStep() {
        loggedMainPage.logoutFromSite();
    }

}
