package pages;

import com.microsoft.playwright.Page;
import utilities.FrameworkConfig;

public class SauceDemoLogin {
  Page page = FrameworkConfig.LocalPage;
    String usernameInput = "//input[@id='user-name']";
    String passwordInput = "//input[@id='password']";
    String button = "//input[@id='login-button']";

    public void login(String userName, String password){
        page.fill(usernameInput, userName);
        page.fill(passwordInput, password);
        page.click(button);
    }
}
