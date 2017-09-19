package Steps;

import Pages.*;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zhukov on 4/20/2017.
 */
public class LoginSteps extends BaseStep {

    //Login method
    public void openMainPage(InitialPage initialPage) {
        mainPage = initialPage.openMainPage();
    }

    public String getUSERNAME() {
        return USERNAME;
    }

    public void loginToSite(InitialPage initialPage) {
        openMainPage(initialPage);
        loginPage = mainPage.clickSignInButton();
        loggedMainPage = loginPage.login_to_site(USERNAME, PASSWORD);
    }

    //
    public String getUserNameForAssert() {
        return loggedMainPage.get_usrename_from_dropmenu();
    }

    public String getListOfTagsForAssert(){
        List<WebElement> tags = loggedMainPage.getTagsListForAssert();
        String result = " ";
        return result ;
    }

    public void logoutFromSiteStep() {
        loggedMainPage.logoutFromSite();
    }
}


