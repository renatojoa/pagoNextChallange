 
Feature: CreateUser API
  Verify that the API can return the correct information
  Scenario: Create a new user
    Given a user has name "<Name>" and job "<Job>"
    When user creates a new user
    Then status code is 201
    And user receives a valid response for "<Name>" and job "<Job>"
    
    Examples:
    | Name            | Job             |
    | Renato Araujo   | QA              |
    | Samara Costa    | Tech Recruiter  |  
