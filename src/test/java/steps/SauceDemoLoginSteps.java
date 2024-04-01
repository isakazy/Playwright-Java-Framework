package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import utilities.Config;
import utilities.FrameworkConfig;

public class SauceDemoLoginSteps {
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

}
