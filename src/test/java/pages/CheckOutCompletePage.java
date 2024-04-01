package pages;

import com.microsoft.playwright.Page;
import org.junit.Assert;
import utilities.FrameworkConfig;

public class CheckOutCompletePage {
    Page page = FrameworkConfig.LocalPage;
    String thankYouText = "//h2[.='Thank you for your order!']";

    public void thankYouTextIsVisible(){
        Assert.assertTrue(page.locator(thankYouText).isVisible());
    }

}
