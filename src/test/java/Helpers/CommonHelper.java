package Helpers;

import Pages.BasePage;
import Sites.SiteFactory;


public class CommonHelper extends BasePage {

    public CommonHelper() {
    }

    public void openWebSite() {
        webDriver.get(SiteFactory.getSite().siteUrl);
    }

    public void closeWebBrowser() {
        webDriver.quit();
    }

}
