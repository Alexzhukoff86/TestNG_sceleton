package Steps;

import Pages.BasePage;
import Pages.LoggedMainPage;
import Pages.LoginPage;
import Pages.MainPage;
import org.openqa.selenium.WebDriver;

/**
 * Created by zhukov on 4/20/2017.
 */
public class TestLoginStep {


    final public String USERNAME = "alex.testQA";
    final public String PASSWORD = "Password1";

    LoginPage loginPage;
    MainPage mainPage;
    LoggedMainPage loggedMainPage;


    public void LoginStep(BasePage basePage) {
        mainPage = basePage.openMainPage();
        loginPage = mainPage.clickSignInButton();
        loggedMainPage = loginPage.login_to_site(USERNAME, PASSWORD);
    }

    public String UserNameForAssert(){
        String username = loggedMainPage.check_name();
        return username;
    }


}
