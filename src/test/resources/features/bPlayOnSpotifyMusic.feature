Feature: Play a song on spotify music.
  As a logged user i want to search for a song on youtube music and play it.

  Background:
    Given a user is on the spotify website
    When the user pushes the log in button
    And fill in its email and password

  Scenario: Song is played successfully
    Given the user selects the search option
    When it types the name of a song and then hits enter
    Then the user will be able to play that song from the results


