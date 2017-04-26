package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by Administrator on 4/18/2017.
 */
public class MainPage extends BasePage {

    MainPage(WebDriver webDriver) {
        super(webDriver);
    }

    // Main Page Elements

    //Sign in button
    @FindBy(xpath = ".//*[@href='/antarcticle/signin']")
    private WebElement SignIn_button;



    //Main Page methods

    //Click "Sign in" button on main page
    public LoginPage clickSignInButton() {
        SignIn_button.click();
        return new LoginPage(webDriver);
    }


//end of class
}
