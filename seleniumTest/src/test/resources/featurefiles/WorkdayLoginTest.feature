# https://auth.api.workday.com/v1/authorize?client_id=YmUwZTVkZjMtMWRjMy00YzE2LTlmM2UtYjBiYjUxMjU1N2Yx&response_type=code&state=9e0bf357b8975cc19906e8e0b9491841fc7e146ef44232ca906904a63db69e4d&redirect_uri=https%3A%2F%2Fdeveloper.workday.com%2Fwelcome&code_challenge_method=S256&code_challenge=VF5uwqtOgFg3ZWKAyTnPVO7DPPZXcjn_cYGK3c5GziI

Feature: Testing Workday Login Page

  Scenario: I navigate to the Workday login page and verify the page
    Given I navigate to Workday Login Page
    When I see the email textfield
    And I type in "johndoe@gmail.com"
    And I click the Workday "Next" button
    Then I should see the "Welcome back!" title
    And I type in the incorrect password "12345"
    And I click the Workday "Next" button
    Then I see the error message "Hmm... We don't recognize that email and password combination"


    # homework - type the wrong password and make sure the error message is dplayeed
    # homework 2 - when you click the next button on line 9, use the correct expected condition
    # rememebr to us ewebdirver wait for buttons and inputes