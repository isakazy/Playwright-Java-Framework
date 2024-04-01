package pages;

import com.microsoft.playwright.Page;
import utilities.FrameworkConfig;

public class CartPage {

    Page page = FrameworkConfig.LocalPage;
    String checkOutButton = "//button[@id='checkout']";

    public void ClickCheckOutButton(){
        page.click(checkOutButton);
    }
}
