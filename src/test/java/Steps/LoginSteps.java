package Steps;

import Pages.BasePage;
import Pages.LoggedMainPage;
import Pages.LoginPage;
import Pages.MainPage;
import org.openqa.selenium.WebDriver;

/**
 * Created by zhukov on 4/20/2017.
 */
public class LoginSteps extends BaseStep {

    //Login method
    public void LoginStep(BasePage basePage) {
        mainPage = basePage.openMainPage();
        loginPage = mainPage.clickSignInButton();
        loggedMainPage = loginPage.login_to_site(USERNAME, PASSWORD);
    }

    //
    public String UserNameForAssert(){
        String username = loggedMainPage.check_name();
        return username;
    }

    public void logoutFromSiteStep() {
        loggedMainPage.logoutFromSite();
    }




}
