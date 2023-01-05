Feature: PLAYER creation, deletion and other management

  Scenario Outline: Create a new player
    Given the application is up and running
    And no player with data is available
      | birthDate   | firstname   | lastName   | playerNumber   |
      | <birthDate> | <firstName> | <lastName> | <playerNumber> |
    When a new request to create a player with data is made
      | birthDate   | firstname   | lastName   | playerNumber   |
      | <birthDate> | <firstName> | <lastName> | <playerNumber> |
    Then the player-request should return with a valid response

    Examples:
      | birthDate  | firstName | lastName | playerNumber |
      | 2000-01-01 | Test1     | Name1    | 111          |
      | 2000-02-02 | Test2     | Name2    | 222          |
      | 2000-03-03 | Test3     | Name3    | 333          |
      | 2000-04-04 | Test4     | Name4    | 444          |

  Scenario: Creating a player when it already exists should fail
    Given the application is up and running
    And a player with data is available
      | birthDate  | firstName | lastName | playerNumber |
      | 2000-01-01 | Test      | Name     | 666          |
    When a new request to create a player with data is made
      | birthDate  | firstName | lastName | playerNumber |
      | 2000-01-01 | Test      | Name     | 666          |
    Then the player-request should return with an invalid response

  Scenario: Get list of all players
    Given the application is up and running
    And all following players are added
      | birthDate  | firstName | lastName | playerNumber |
      | 2004-04-04 | Test4     | Name     | 444          |
      | 2005-05-05 | Test5     | Name     | 555          |
      | 2006-06-06 | Test6     | Name     | 666          |
    When a request is made to retrieve all players
    Then the player-list-request should return with a full list
      | birthDate  | firstName | lastName | playerNumber |
      | 2004-04-04 | Test4     | Name     | 444          |
      | 2005-05-05 | Test5     | Name     | 555          |
      | 2006-06-06 | Test6     | Name     | 666          |

