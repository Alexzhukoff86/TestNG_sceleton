package Tests;

import Factory.DriverFactory;
import Methods.LoginPageMethods;
import Methods.MainPageMethods;
import Pages.LoginPage;
import Pages.MainPage;
import Steps.LoginStep;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.*;

import java.util.concurrent.TimeUnit;

/**
 * Created by zhukov on 4/18/2017.
 */
public class LoginTest extends BaseTest {

    @BeforeClass
    public void setUp() throws Exception {
        //loginPage = new LoginPage(webDriver);
        loginPageMethods = new LoginPageMethods(new LoginPage(webDriver));
        //mainPage = new MainPage(webDriver);
        mainPageMethods = new MainPageMethods(new MainPage(webDriver));
        loginStep = new LoginStep(mainPageMethods,loginPageMethods);

    }

    @Test(description ="Test for login")
    public void testLogin() throws Exception {
        loginStep.login();

        Assert.assertEquals("sdfsfs", "sfsfs");
    }

    @AfterClass
    public void tearDown() throws Exception {
        System.out.println("Error");
    }
}
