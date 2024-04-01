Feature: log in to sauceDemo functionality

  @login
  Scenario: user provides valid username and valid password
    Given user is in the login page
    And user provides a valid username
    And user provides a valid password
    Then user clicks on login button
    Then verify user logged in to the application
