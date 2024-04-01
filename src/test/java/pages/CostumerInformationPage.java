package pages;

import com.microsoft.playwright.Page;
import utilities.FrameworkConfig;

public class CostumerInformationPage {
    Page page = FrameworkConfig.LocalPage;
    String firstNameInput = "//input[@id='first-name']";
    String lastNameInput = "//input[@id='last-name']";
    String postalCodeInput = "//input[@id='postal-code']";
    String continueButton = "//input[@id='continue']";

    public void InputInfo(String firstName,String lastName, String postalCode){
        page.fill(firstNameInput, firstName);
        page.fill(lastNameInput, lastName);
        page.fill(postalCodeInput, postalCode );
        page.click(continueButton);
    }

}
