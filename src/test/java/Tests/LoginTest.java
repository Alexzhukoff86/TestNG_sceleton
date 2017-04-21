package Tests;


import Pages.BasePage;
import Steps.TestLoginStep;
import org.testng.Assert;
import org.testng.annotations.*;


/**
 * Created by zhukov on 4/18/2017.
 */
public class LoginTest extends BaseTest {
    TestLoginStep testLoginStep;

    @BeforeClass
    public void setUp() throws Exception {
        basePage = new BasePage(webDriver);
        testLoginStep = new TestLoginStep();
    }


    @Test(description = "Test for login")
    public void testLogin() throws Exception {
        testLoginStep.LoginStep(basePage);
        Assert.assertEquals(testLoginStep.UserNameForAssert(), "alex.testQA");
    }

    @AfterClass
    public void tearDown() throws Exception {
        System.out.println("Error");
    }

}
