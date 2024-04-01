package pages;

import com.microsoft.playwright.Page;
import org.junit.Assert;
import utilities.FrameworkConfig;

public class OverviewPage {
    Page page = FrameworkConfig.LocalPage;
    String finishButton = "//button[@id='finish']";

    public void itemIsDisplayed(){
       Assert.assertTrue(page.locator("//div[@class='cart_item_label']").isVisible());
    }

    public void clickFinishButton(){
        page.click(finishButton);
    }

}
