
Feature: Login
 
 @smoke 
  Scenario: Success Login
	  Given Enter "sam" and "abcd21"
	  When Click on login button
	  Then Home page is displayed
@sanity  
  Scenario: Login failure
	  Given Enter credentials
	  When Click on login button
	  Then Home page is not displayed
    