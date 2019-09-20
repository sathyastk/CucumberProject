
Feature: Login
 
  
  Scenario Outline: Success Login
	  Given Enter "<name>" in the username field
	  And Enter "<password>" in the pwd field
	  When Click on login button
	  Then Home page is displayed
  
  Examples: 
      | name  | password |
      | name1 |    abcd |
      | name2 |     efgh |