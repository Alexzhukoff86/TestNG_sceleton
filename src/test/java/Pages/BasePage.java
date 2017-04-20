package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.reporters.jq.Main;

/**
 * Created by zhukov on 4/18/2017.
 */
public class BasePage {
    WebDriver webDriver;

    public BasePage(WebDriver webDriver) {
        this.webDriver = webDriver;
        PageFactory.initElements(webDriver, this);
    }

    public MainPage openMainPage() {
        webDriver.get("http://qa.jtalks.org/antarcticle/");
        return new MainPage(webDriver);
    }

}
