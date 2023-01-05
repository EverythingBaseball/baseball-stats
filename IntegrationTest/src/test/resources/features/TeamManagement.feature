Feature: TEAM creation, deletion and other management

  Scenario: Create a new team
    Given the application is up and running
    And no team with Nieuwegein Diamonds is available
    When a new request with Nieuwegein Diamonds is made to create a team
    Then the team is created properly

  Scenario: Creating a team when it already exists should fail
    Given the application is up and running
    And a team with Nieuwegein Diamonds is available
    When a new request with Nieuwegein Diamonds is made to create a team
    Then the team-request should fail with team already exists error

  Scenario: Find existing team
    Given the application is up and running
    And a team with Nieuwegein Diamonds is available
    When a new requests is made to find team with Nieuwegein Diamonds
    Then the team-request should return with a valid response

  Scenario: Find team which doesn't exist
    Given the application is up and running
    And no team with ND is available
    When a new requests is made to find team with ND
    Then the team-request should return with an invalid response

#  Scenario: Update team name
#    Given the application is up and running
#    And a team with Nieuwegein Diamonds is available
#    When a new requests is made to find team with Nieuwegein Diamonds
#    And a new request to update found team with new name "Nieuwegein Diamonds" is made
#      | name        |
#      | NG Diamonds |
#    Then the team-request should return with a valid response
#    And name should match with response data


