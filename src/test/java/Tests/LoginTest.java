package Tests;


import Pages.BasePage;
import org.testng.Assert;
import org.testng.annotations.*;


/**
 * Created by zhukov on 4/18/2017.
 */
public class LoginTest extends BaseTest {

    @BeforeClass
    public void setUp() throws Exception {
        basePage = new BasePage(webDriver);
    }


    @Test(description = "Test for login")
    public void testLogin() throws Exception {
        mainPage = basePage.openMainPage();
        loginPage = mainPage.clickSignInButton();
        loggedMainPage = loginPage.login_to_site(USERNAME, PASSWORD);
        Assert.assertEquals(loggedMainPage.check_name(), "alex.testQA");
    }

    @AfterClass
    public void tearDown() throws Exception {
        System.out.println("Error");
    }
}
