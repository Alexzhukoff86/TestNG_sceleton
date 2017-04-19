package Methods;

import Factory.DriverFactory;
import Pages.LoginPage;
import Tests.BaseTest;
import Tests.LoginTest;
import org.openqa.selenium.WebDriver;

/**
 * Created by zhukov on 4/18/2017.
 */
public class LoginPageMethods{
    LoginPage loginPage;

    public LoginPageMethods(LoginPage loginPage) {
        this.loginPage = loginPage;
    }

    public void login_to_site(String username, String password) {
        loginPage.username_field.sendKeys(username);
        loginPage.password_field.sendKeys(password);
        loginPage.sign_in_button.click();
    }
}
