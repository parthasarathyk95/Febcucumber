Feature: to validate the Facebook login Functionality

  Background: 
    Given user need to be in login page
	@smoke
  Scenario: to validate the login with invalid username and invalid password
    When user should enter invalid Username
      # Without header ----->1D List
      | username | abi | balu | chandru |
    And user should enter invalid Password
      # Without header ----->2D List
      | pass@123    | abi@456     | balu@789    |
      | chandru@012 | daniel@123  | edwin@456   |
      | Balu@789    | chandru@012 | pass@1234   |
      | abi@456     | balu@789    | chandru@012 |
    And user clicks the login button
    Then user will navigate to invalid credential page
	@sanity
  Scenario Outline:  to validate the login with valid username and invalid password
    When user should enter valid "<Username>" username and "<Password>" invalid password
    And user clicks the login button
    Then user will navigate to Invalid credential page

    Examples: 
      | Username  | Password  |
      | Java      | java      |

