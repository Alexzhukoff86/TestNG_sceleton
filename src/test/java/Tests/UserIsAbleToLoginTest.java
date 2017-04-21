package Tests;


import Pages.BasePage;
import Steps.LoginSteps;
import org.testng.Assert;
import org.testng.annotations.*;


/**
 * Created by zhukov on 4/18/2017.
 */
public class UserIsAbleToLoginTest extends BaseTest {
    LoginSteps loginSteps;

    @BeforeClass
    public void setUp() throws Exception {
        basePage = new BasePage(webDriver);
        loginSteps = new LoginSteps();
    }


    @Test(description = "Test for login")
    public void testLogin() throws Exception {
        loginSteps.LoginStep(basePage);
        Assert.assertEquals(loginSteps.UserNameForAssert(), "alex.testQA");
    }

    @AfterClass
    public void tearDown() throws Exception {
        loginSteps.logoutFromSiteStep();
        System.out.println("Error");
    }

}
