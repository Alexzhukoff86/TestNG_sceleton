package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by zhukov on 4/18/2017.
 */
public class RegisterAccountPage extends BasePage {
	public RegisterAccountPage(WebDriver webDriver) {
		super(webDriver);
	}

	@FindBy(xpath = "")
	private WebElement username_field;


}
