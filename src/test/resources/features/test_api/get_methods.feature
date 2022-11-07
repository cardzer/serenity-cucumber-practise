Feature: Test bakery Vehicle API
  to ensure that the data returned is correct

  Scenario: Check that the API is online and running correctly
    Given i want to check status of the API
    When i hit the bakery endpoint
    Then the status code returned should be 200

#  Scenario Outline: Check that the API is online and running correctly
#    Given i want to check status of the API
#    When i hit the bakery endpoint
#    Then the status code returned should be 200
#    And the first type should be <type>
#    Examples:
#      | type   |
#      | muffin |