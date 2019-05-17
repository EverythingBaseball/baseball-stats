Feature: Creation, deletion and other management of players

  Scenario: Create a new player
    Given the application is up and running
    And no player with data is available
    When a new request to create a player with data is made
    Then the player-request should return with a valid response
      | birthDate  | firstName | lastName | playerNumber |
      | 2000-01-01 | Test      | Name     | 666          |

  Scenario: Creating a player when it already exists should fail
    Given the application is up and running
    And a player with data is available
    When a new request to create a player with data is made
    Then the player-request should return with an invalid response
      | birthDate  | firstName | lastName | playerNumber |
      | 2000-01-01 | Test      | Name     | 666          |

  Scenario: Find existing player

  Scenario: Find player which doesn't exist

  Scenario: Update player

