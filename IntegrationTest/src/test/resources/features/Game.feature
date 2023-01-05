Feature: Registering a game and adding statistics

  Scenario: Send a complete game with statistics
    Given the application is up and running
    When a request to register a game is made
      | game  |
      | game1 |
    Then the game is successfully stored


#  Scenario: Create a new game which already exists
#  Scenario: Retrieve all games
#  Scenario: Retrieve all games for specific team
#  Scenario: Delete a game
