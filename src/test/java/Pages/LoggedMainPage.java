package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by zhukov on 4/19/2017.
 */
public class LoggedMainPage extends BasePage {
    public LoggedMainPage(WebDriver webDriver) {
        super(webDriver);
    }

    //Main Page when user is logged in
    @FindBy(xpath = ".//*[@class='dropdown-toggle' and @href='#']")
    public WebElement dropdown_menu_user;


    @FindBy(xpath = ".//*[@class='btn btn-lg btn-primary btn-new-article']")
    public WebElement create_article_button;

    @FindBy(xpath = ".//*[@href='/antarcticle/signout']")
    public WebElement sign_out_button;


    //Main Page when user is logged in Methods

    //methods used in Assert for checkin of username on page in drop-down menu
    public String check_name() {
        String username = dropdown_menu_user.getText();
        return username;
    }

    public MainPage logoutFromSite() {
        dropdown_menu_user.click();
        sign_out_button.click();
        return new MainPage(webDriver);
    }

    public NewArticlePage clickCreateButtonClick(){
        create_article_button.click();
        return new NewArticlePage(webDriver);
    }

//end of class
}
