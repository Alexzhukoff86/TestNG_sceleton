package Pages;

import org.openqa.selenium.WebDriver;

/**
 * Created by zhukov on 4/24/2017.
 */
public class InitialPage extends BasePage{
    public InitialPage(WebDriver webDriver) {
        super(webDriver);
    }

    public MainPage openMainPage() {
        webDriver.get("http://qa.jtalks.org/antarcticle/");
        return new MainPage(webDriver);
    }
}
