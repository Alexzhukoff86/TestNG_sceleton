package Methods;

import Pages.MainPage;

/**
 * Created by zhukov on 4/19/2017.
 */
public class MainPageMethods extends BaseMethods{
    MainPage mainPage;

    public MainPageMethods(MainPage mainPage) {
        this.mainPage = mainPage;
    }

    public void clickSignInButton(){
        mainPage.SignIn_button.click();
    }

}
