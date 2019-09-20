
Feature: Create Account
 
  
  Scenario: Success
	  Given I want to create an account
	  When I enter my data
	   
      | name  | password |
      | sam |    abcd |
      | kim |     efgh |
      |ram    | awrsr |
	 
	  Then I verify the account
  
  