package Tests;

import Pages.InitialPage;
import Pages.LoggedMainPage;
import Steps.CreateNewArticleSteps;
import Steps.LoginSteps;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.HashMap;

/**
 * Created by zhukov on 4/21/2017.
 */
public class UserIsAbleCreateNewArticleTest extends BaseTest {

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
        loginSteps = new LoginSteps();
        loginSteps.loginToSite(new InitialPage(webDriver));
        createNewArticleSteps = new CreateNewArticleSteps();
        article_fields = createPositiveMapForFields();
    }

    @Test(description = "User is able to create new article")
    public void testUserIsAbleCreateNewArticle() throws Exception {
        createNewArticleSteps.createNewArticle(new LoggedMainPage(webDriver), article_fields);
        HashMap<String, String> testMap = createNewArticleSteps.get_test_map_forAssert();
        Assert.assertEquals(testMap, article_fields);
    }

    @AfterMethod
    public void tearDown() throws Exception {
        loginSteps.logoutFromSiteStep();
        System.out.println("Test completed");
    }
}
