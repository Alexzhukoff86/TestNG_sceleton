package Steps;

import Pages.LoggedMainPage;
import Pages.LoginPage;
import Pages.MainPage;

/**
 * Created by zhukov on 4/21/2017.
 */
public abstract class BaseStep {

    final public String USERNAME = "alex.testQA";
    final public String PASSWORD = "Password1";
    public LoginPage loginPage;
    public MainPage mainPage;
    public LoggedMainPage loggedMainPage;
}
