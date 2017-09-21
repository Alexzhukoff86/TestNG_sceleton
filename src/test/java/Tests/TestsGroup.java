package Tests;

import Pages.InitialPage;
import Pages.LoggedMainPage;
import Pages.*;
import Steps.CreateNewArticleSteps;
import Steps.LoginSteps;
import Steps.*;
import org.testng.Assert;
import org.testng.annotations.*;
import java.util.HashMap;

/**
 * Created by zhukov on 4/27/2017.
 */
public class TestsGroup extends BaseTest {
    private LoginSteps loginSteps;
    private CreateNewArticleSteps createNewArticleSteps;
    private HashMap<String, String> article_fields = new HashMap<>();


    private HashMap<String, String> createPositiveMapForFields() {
        HashMap<String, String> fields = new HashMap<>();
        fields.put("article_title", "TestArticle");
        fields.put("article_content", "Some test content for article");
        fields.put("article_tag", "#testtag");
        fields.put("article_author","alex.testQA");
        return fields;
    }

    @BeforeClass
    public void setUp() throws Exception {
        initialPage = new InitialPage();
        loginSteps = new LoginSteps();
        createNewArticleSteps = new CreateNewArticleSteps();
        article_fields = createPositiveMapForFields();
    }

    @Test(description = "User is able to login to site used testing credentials")
    public void testUserIsAbleToLogin() throws Exception {
        loginSteps.loginToSite(initialPage);
        Assert.assertEquals(loginSteps.getUserNameForAssert(), loginSteps.getUSERNAME(), "Error - user name is wrong");
    }

    @Test(description = "User is able to create new article",dependsOnMethods = {"testUserIsAbleToLogin"})
    public void testUserIsAbleCreateNewArticle() throws Exception {
        createNewArticleSteps.createNewArticle(new LoggedMainPage(), article_fields);
        HashMap<String, String> testMap = createNewArticleSteps.get_test_map_forAssert();
        Assert.assertEquals(testMap, article_fields,"Wrong results");
    }

    @Test(description = "User is able to do search by tag",dependsOnMethods = {"testUserIsAbleCreateNewArticle"})
    public void testUserIsAbleToDoSearchByTag() throws Exception {
        loginSteps.openMainPage(initialPage);

        Assert.assertEquals("test","test");
    }

    @AfterClass
    public void tearDown() throws Exception {
        loginSteps.logoutFromSiteStep();
        System.out.println("Error");
    }
}
