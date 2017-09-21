package Tests;

import Users.UserFactory;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestGroup_second extends BaseTest {

    @BeforeClass
    public void openWebSite() throws Exception {
        app.common.openWebSite();
    }

    @Test (description = "test should check that valid user is able to login to site")
    public void validUserIsAbleToLogin() throws Exception {
        app.mainHelper.openSignInPage();
        app.loginHelper.loginValidUser();
        Assert.assertEquals(app.mainHelper.getUserNameForAssert(),UserFactory.getValidUser().getLogin());
    }

    @Test
    public void userIsAbleToCreateNewArticle() throws Exception {

    }

    @AfterClass
    public void closeWebBrowser() throws Exception {
        app.mainHelper.logOut_FromSite();
        app.common.closeWebBrowser();
    }
}
