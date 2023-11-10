Feature: Play a song on spotify music.
  As a logged user i want to search for a song on youtube music and play it.

  Background:
    Given a user is on the spotify website
    And its logged in successfully

  Scenario: Song is played successfully
    Given the user is on the home screen
    When it clicks the search option
    And search for a song's name
    Then the user will be able to play that song from the results


