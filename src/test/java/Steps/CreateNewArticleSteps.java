package Steps;


import Pages.LoggedMainPage;
import cucumber.api.java.hu.Ha;

import java.util.HashMap;


/**
 * Created by zhukov on 4/25/2017.
 */
public class CreateNewArticleSteps extends BaseStep {


    public void createNewArticle(LoggedMainPage loggedMainPage, HashMap<String, String> article_fields) {
        newArticlePage = loggedMainPage.clickCreateButtonClick();
        newArticlePage.enter_article_title(article_fields.get("article_title"));
        newArticlePage.enter_article_content(article_fields.get("article_content"));
        newArticlePage.enter_article_tag(article_fields.get("article_tag"));
        articlePage = newArticlePage.click_create_article_button();
    }


    public HashMap<String, String> get_test_map_forAssert() {
        HashMap<String, String> test = new HashMap<>();
        test.put("article_title", articlePage.get_ArticleTitle());
        test.put("article_content", articlePage.get_ArticleContent());
        test.put("article_tag", articlePage.get_ArticleTag());
        test.put("article_author", articlePage.get_ArticleAuthor());
        return test;
    }


}
