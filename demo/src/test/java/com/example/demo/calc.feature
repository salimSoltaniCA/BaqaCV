#Author: salim.soltani@cgi.com

Feature: arithmetic operations
 
  Scenario: client wants to add two numbers
    When the client calls /calc/add with values 1 and 2
    Then the client receives answer as 3
    
    
  Scenario: client wants to subtract two numbers
    When the client calls /calc/sub with values 5 and 3
    Then the client receives answer as 2
 
  Scenario: client wants to divide two numbers
    When the client calls /calc/div with values 6 and 2
    Then the client receives answer as 3    
   