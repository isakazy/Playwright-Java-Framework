package pages;

import com.microsoft.playwright.Page;
import utilities.BrowserInitialize;
import utilities.FrameworkConfig;
import utilities.FrameworkInitialize;

public class ProductPage {

    Page page = FrameworkConfig.LocalPage;
    String backPackProduct = "//button[@id='add-to-cart-sauce-labs-backpack']";
    String cartButton = "//a[@class='shopping_cart_link']";

    public void AddBackPack(){
        page.click(backPackProduct);
    }

    public void ClickCartButton(){
        page.click(cartButton);
    }

}
