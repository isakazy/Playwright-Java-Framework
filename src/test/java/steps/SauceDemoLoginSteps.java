package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.*;
import utilities.Config;
import utilities.FrameworkConfig;

public class SauceDemoLoginSteps {


    ProductPage page = new ProductPage();
    CartPage cartPage = new CartPage();
    CostumerInformationPage costumerInformationPage = new CostumerInformationPage();
    OverviewPage overviewPage = new OverviewPage();
    CheckOutCompletePage checkOutCompletePage = new CheckOutCompletePage();



    @Given("user is in the login page")
    public void user_is_in_the_login_page() {
        FrameworkConfig.LocalPage.navigate(Config.getValue("sauceDemo"));


    }
    @Given("user provides a valid username")
    public void user_provides_a_valid_username() {
        FrameworkConfig.LocalPage.locator("//input[@id='user-name']").fill(Config.getValue("sauceDemoUsername"));

    }
    @Given("user provides a valid password")
    public void user_provides_a_valid_password() {
      FrameworkConfig.LocalPage.locator("//input[@id='password']").fill(Config.getValue("sauceDemoPassword"));
    }

    @Then("user clicks on login button")
    public void user_clicks_on_login_button() {
       FrameworkConfig.LocalPage.locator("//input[@id='login-button']").click();
    }

    @Then("verify user logged in to the application")
    public void verify_user_logged_in_to_the_application() {
        String newUrl = "https://www.saucedemo.com/inventory.html";
        Assert.assertEquals(newUrl, FrameworkConfig.LocalPage.url());

    }


    @Then("user selects a back pack")
    public void user_selects_a_back_pack() {
        page.AddBackPack();
    }
    @Then("user navigates to the cart")
    public void user_navigates_to_the_cart() {
        page.ClickCartButton();

    }
    @When("user clicks on checkout button")
    public void user_clicks_on_checkout_button() {
        cartPage.ClickCheckOutButton();
    }
    @Then("user provides valid credentials")
    public void user_provides_valid_credentials() {
        costumerInformationPage.InputInfo("Isakazy", "Amanbaev", "60656");
    }
    @Then("verify the item is displayed")
    public void verify_the_item_is_displayed() {
        overviewPage.itemIsDisplayed();
    }
    @Then("click finish button")
    public void click_finish_button() {
        overviewPage.clickFinishButton();

    }
    @Then("verify thank you text is visible")
    public void verify_thank_you_text_is_visible() {
        checkOutCompletePage.thankYouTextIsVisible();
    }

}
