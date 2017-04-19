package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by zhukov on 4/18/2017.
 */
public class LoginPage extends BasePage {

    public LoginPage(WebDriver webDriver) {
        super(webDriver);
    }

    @FindBy(xpath = ".//*[@name='login' and @placeholder='Username']")
    public WebElement username_field;

    @FindBy(xpath = ".//*[@name='password' and @placeholder='Password']")
    public WebElement password_field;

    @FindBy(xpath = ".//*[@type='submit']")
    public WebElement sign_in_button;


}
