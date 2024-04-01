package utilities;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;

public class FrameworkInitialize {
    //initialize the Browser
    BrowserInitialize browserInitialize = new BrowserInitialize();

    // setUp launch options
    public Page initializePlaywright(){
        BrowserType.LaunchOptions launchOptions = new BrowserType.LaunchOptions();
        launchOptions.headless = false;
        launchOptions.devtools = false;

        var browser = browserInitialize.GetBrowser(Config.getValue("browser"), launchOptions);

        Browser.NewContextOptions contextOptions = new Browser.NewContextOptions();
        contextOptions.locale = "en/US";

        var context = browserInitialize.browserContext(browser, contextOptions);


                // Get Page
        return browserInitialize.getPage(context);
    }

}
