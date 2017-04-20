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


    //Main Page when user is logged in Methods

    //methods used in Assert for checkin of username on page in drop-down menu
    public String check_name (){
        String username = dropdown_menu_user.getText();
        return username;
    }


//end of class
}
