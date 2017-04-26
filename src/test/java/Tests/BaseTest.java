package Tests;

import Factory.DriverFactory;
import Pages.*;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import java.util.concurrent.TimeUnit;

/**
 * Created by Administrator on 4/18/2017.
 */
public class BaseTest {
    public WebDriver webDriver;
    InitialPage initialPage;

    @BeforeSuite
    public void setBeforeSuite() throws Exception {
        webDriver = DriverFactory.getDriver();
        webDriver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
    }


    @AfterSuite
    public void closeWebBrowser() throws Exception {
        webDriver.quit();
    }
}
