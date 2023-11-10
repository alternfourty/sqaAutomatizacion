Feature: Login into a spotify account
  As a user i want to login into my spotify account

  Scenario: login successful
    Given a user is on the spotify website
    When the user pushes the log in button
    And fill in its login credentials
    Then it should be redirected to the home of the spotify player