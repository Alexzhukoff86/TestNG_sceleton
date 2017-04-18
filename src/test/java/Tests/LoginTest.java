package Tests;

import Factory.DriverFactory;
import Methods.Trash;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 * Created by zhukov on 4/18/2017.
 */
public class LoginTest {
   // DriverFactory driverFactory = new DriverFactory();
   public WebDriver webDriver;

    @BeforeMethod
    public void setUp() throws Exception {
        webDriver = DriverFactory.getDriver();
        webDriver.get("https://web2.0calc.com/");
    }

    @Test
    public void testLogin() throws Exception {
        Trash.Testing();
        Assert.assertEquals("sdfsfs", "sfsfs");
    }

    @AfterMethod
    public void tearDown() throws Exception {
        webDriver.quit();
    }
}
