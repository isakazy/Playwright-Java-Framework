Feature: log in to sauceDemo functionality

  @login
  Scenario: user provides valid username and valid password
    Given user is in the login page
    And user provides a valid username
    And user provides a valid password
    Then user clicks on login button
    Then verify user logged in to the application


    @E2E
    Scenario: end to end test for sauceDemo
      Given user is in the login page
      And user provides a valid password
      And user provides a valid username
      Then user clicks on login button
      Then user selects a back pack
      And user navigates to the cart
      When user clicks on checkout button
      Then  user provides valid credentials
      Then verify the item is displayed
      And click finish button
      Then verify thank you text is visible
