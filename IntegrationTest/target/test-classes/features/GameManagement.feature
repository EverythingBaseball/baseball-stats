Feature: GAME creation, deletion and other management

  Scenario: Create a new game
  Scenario: Create a new game which already exists
  Scenario: Retrieve all games
  Scenario: Retrieve all games for specific team
  Scenario: Delete a game



#
#    Given the application is up and running
#    And no player with data is available
#    When a new request to create a player with data is made
#    Then the player-request should return with a valid response
#      | birthDate  | firstName | lastName | playerNumber |
#      | 2000-01-01 | Test      | Name     | 666          |
#
#  Scenario: Creating a player when it already exists should fail
#    Given the application is up and running
#    And a player with data is available
#    When a new request to create a player with data is made
#    Then the player-request should return with an invalid response
#      | birthDate  | firstName | lastName | playerNumber |
#      | 2000-01-01 | Test      | Name     | 666          |
#
#  Scenario: Get list of all players
#    Given the application is up and running
#    And all following players are added
#      | birthDate  | firstName | lastName | playerNumber |
#      | 2004-04-04 | Test4     | Name     | 444          |
#      | 2005-05-05 | Test5     | Name     | 555          |
#      | 2006-06-06 | Test6     | Name     | 666          |
#    When a request is made to retrieve all players
#    Then the player-list-request should return with a full list
#      | birthDate  | firstName | lastName | playerNumber |
#      | 2004-04-04 | Test4     | Name     | 444          |
#      | 2005-05-05 | Test5     | Name     | 555          |
#      | 2006-06-06 | Test6     | Name     | 666          |
