Feature: to validate forgot password functionality
	@sanity
  Scenario: validate the forgot password with invalid mobile number
    Given user should lauch the chrome browser and launch the facebook url
    And user should pass the mobile number under find your account type
    And user should click search button
    Then user should navigate password recover page
