Feature: Adding, updating and removing statistics

  Scenario: Add a new player statistic
    Given the application is up and running
    When a new statistic is added with the following data for player Chris
      | birthDate   | firstname   | lastName   | playerNumber   |
      | <birthDate> | <firstName> | <lastName> | <playerNumber> |
    Then the statistics should be saved

  Scenario: Updating a player statistics
  Scenario: Deleting a player statistics
  Scenario: Retrieving player overal statistics
  Scenario: Retrieving team statistics
