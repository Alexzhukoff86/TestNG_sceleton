package Tests;

import Factory.DriverFactory;
import Methods.LoginPageMethods;
import Pages.LoginPage;
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
        loginPage = new LoginPage(webDriver);
        loginPageMethods = new LoginPageMethods(loginPage);
    }

    @Test
    public void testLogin() throws Exception {
        loginPageMethods.login_to_site(USERNAME,PASSWORD);
        Assert.assertEquals("sdfsfs", "sfsfs");
    }

    @AfterClass
    public void tearDown() throws Exception {
        System.out.println("Error");
    }
}
