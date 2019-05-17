Feature: Creation, deletion and other management of teams

  Scenario: Create a new team
    Given the application is up and running
    And no team with name is available
    When a new request with name is made to create a team
    Then the team-request should return with a valid response
    And name should match with response data
      | name                |
      | Nieuwegein Diamonds |

  Scenario: Creating a team when it already exists should fail
    Given the application is up and running
    And a team with name is available
    When a new request with name is made to create a team
    Then the team-request should return with an invalid response
      | name                |
      | Nieuwegein Diamonds |

  Scenario: Find existing team
    Given the application is up and running
    And a team with name is available
    When a new requests is made to find team with name
    Then the team-request should return with a valid response
      | name                |
      | Nieuwegein Diamonds |

  Scenario: Find team which doesn't exist
    Given the application is up and running
    And no team with name is available
    When a new requests is made to find team with name
    Then the team-request should return with an invalid response
      | name                |
      | Nieuwegein Diamonds |

  Scenario: Update team
    Given the application is up and running
    And a team with name is available
    When a new requests is made to find team with name
    And a new request to update found team with new name "Nieuwegein Diamonds" is made
    Then the team-request should return with a valid response
    And name should match with response data
      | name                |
      | NG Diamonds |


