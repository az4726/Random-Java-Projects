Feature: Testing Amazon Login Page

  Scenario: I navigate to the Amazon login page and verify the page
    Given I navigate to Amazon
    When I press the login button
    Then I should see the login page title "Sign in"
    Then I should see the email textfield "Email or mobile phone number"
    Then I type the email "johndoe@gmail.com"
    #can make it easier for yourself by only verifying in action lines instead of verification lines
    When I click the "Continue" button
    Then I should see the "Password" textfield
    Then I should see the "Sign in" button to login
    #remember switch statements and reusable lines