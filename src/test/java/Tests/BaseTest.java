package Tests;

import Factory.DriverFactory;
import Methods.LoginPageMethods;
import Pages.LoginPage;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import java.util.concurrent.TimeUnit;

/**
 * Created by Administrator on 4/18/2017.
 */
public class BaseTest {

    public WebDriver webDriver;

    final public String URL = "http://qa.jtalks.org/antarcticle/";
    final public String USERNAME="alex.testQA";
    final public String PASSWORD="Password1";

    LoginPage loginPage ;
    LoginPageMethods loginPageMethods ;


    @BeforeSuite
    public void setBeforeSuite() throws Exception {
        webDriver = DriverFactory.getDriver();
        webDriver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        webDriver.get(URL);
    }

    @AfterSuite
    public void tearDown() throws Exception {
        webDriver.quit();
    }
}
