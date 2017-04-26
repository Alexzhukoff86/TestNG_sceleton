package Tests;

import Pages.InitialPage;
import Steps.LoginSteps;
import org.testng.Assert;
import org.testng.annotations.*;


/**
 * Created by zhukov on 4/18/2017.
 */
public class UserIsAbleToLoginTest extends BaseTest {
    public LoginSteps loginSteps;

    @BeforeClass
    public void setUp() throws Exception {
        initialPage = new InitialPage(webDriver);
        loginSteps = new LoginSteps();
    }


    @Test(description = "Test for login")
    public void testLogin() throws Exception {
        loginSteps.loginToSite(initialPage);
        Assert.assertEquals(loginSteps.getUserNameForAssert(), "alex.testQA", "Error - user name is wrong");
    }

    @AfterClass
    public void tearDown() throws Exception {
        loginSteps.logoutFromSiteStep();
        System.out.println("Error");
    }

}
