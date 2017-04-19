package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by Administrator on 4/18/2017.
 */
public class MainPage extends BasePage {
    public MainPage(WebDriver webDriver) {
        super(webDriver);
    }

	@FindBy(xpath = ".//*[@href='/antarcticle/signin']")
	public WebElement SignIn_button;



}
