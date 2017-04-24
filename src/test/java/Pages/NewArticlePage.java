package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by zhukov on 4/21/2017.
 */
public class NewArticlePage extends BasePage {
    public NewArticlePage(WebDriver webDriver) {
        super(webDriver);
    }

	@FindBy(xpath = ".//*[@type='text' and @name='title']")
	public WebElement article_title_field;

	@FindBy(xpath = ".//*[@name='content' and @id='content']")
	public WebElement article_content_field;

	@FindBy(xpath = ".//*[@id='tag_input' and @type='text']")
	public WebElement tag_field;

	@FindBy(xpath = ".//*[@type='submit' and @value='Create article']")
    public WebElement create_article_button;





}
