package utilities;

import com.microsoft.playwright.*;

public class BrowserInitialize {
    public Browser GetBrowser(String BrowserName, BrowserType.LaunchOptions launchOptions){
        BrowserType browserType = null;

        if(BrowserName.equals("chromium")){
            browserType = Playwright.create().chromium();
        }
        if(BrowserName.equals("firefox")){
            browserType = Playwright.create().firefox();
        }
        if(BrowserName.equals("webkit")){
            browserType = Playwright.create().webkit();
        }
        return browserType.launch(launchOptions);

    }

    public BrowserContext browserContext(Browser browser, Browser.NewContextOptions newContextOptions){
return browser.newContext(newContextOptions);
    }

    public Page getPage(BrowserContext browserContext){
        return browserContext.newPage();
    }

}
