package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.reporters.jq.Main;

/**
 * Created by zhukov on 4/18/2017.
 */
public abstract class BasePage {
    WebDriver webDriver;

    public BasePage(WebDriver webDriver) {
        this.webDriver = webDriver;
        PageFactory.initElements(webDriver, this);
    }

    public BasePage() {
        //
    }
}
