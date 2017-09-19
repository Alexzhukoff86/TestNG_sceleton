package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by zhukov on 4/25/2017.
 */
public class ArticlePage extends BasePage {
    public ArticlePage(WebDriver webDriver) {
        super(webDriver);
    }

    //Page WebElements
    @FindBy(xpath = ".//*[@class='article-header']/h2")
    private WebElement article_title;

    @FindBy(xpath = ".//*[@class='footer-element']/a")
    private WebElement article_author;

    @FindBy(xpath = ".//*[@class='pull-right tm-tag tm-tag-default']")
    private WebElement article_tag;

    @FindBy(xpath = ".//*[@class='content clearfix']/p")
    private WebElement article_content;

    @FindBy(xpath = ".//*[@class='day']")
    private WebElement article_date_day;

    @FindBy(xpath = ".//*[@class='month']")
    private WebElement article_date_month;

    @FindBy(xpath = ".//*[@class='year']")
    private WebElement article_date_yaer;


    //Page Methods
    public String get_ArticleTitle() {
        return article_title.getText();
    }

    public String get_ArticleAuthor() {
        return article_author.getText();
    }

    public String get_ArticleContent() {
        return article_content.getText();
    }

    public String get_ArticleTag(){
        return article_tag.getText();
    }

}
