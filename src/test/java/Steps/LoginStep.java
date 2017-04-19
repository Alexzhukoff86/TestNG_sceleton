package Steps;

import Methods.LoginPageMethods;
import Methods.MainPageMethods;
import Pages.LoginPage;
import Tests.BaseTest;

/**
 * Created by Administrator on 4/18/2017.
 */
public class LoginStep extends BaseStep {
MainPageMethods mainPageMethods;
LoginPageMethods loginPageMethods;

    public LoginStep(MainPageMethods mainPageMethods, LoginPageMethods loginPageMethods) {
        this.mainPageMethods = mainPageMethods;
        this.loginPageMethods = loginPageMethods;
    }

    public void login(){
    mainPageMethods.clickSignInButton();
    loginPageMethods.login_to_site(USERNAME,PASSWORD);
}
}
