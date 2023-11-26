Feature: Login into a spotify account and play a song
  As a user i want to login into my spotify account and play a song that i search

  Scenario Outline: login successful
    Given a user is on the spotify website
    When the user pushes the log in button
    And fill in its <email> and <password>
    Then it should be redirected to the home of its spotify account
    Examples:
      | email      | password      |
      | enterEmail | enterPassword |

  Scenario: Song is played successfully
    Given the user selects the search option
    When it types the name of a song and then hits enter
    Then the user will be able to play that song from the results