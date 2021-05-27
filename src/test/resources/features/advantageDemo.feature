#languaje:en

Feature: Sign in on Advantage Demo webpage

  @ScenarioOne
  Scenario Outline:
    Given The user is on the Homepage
    When the user wants to create an account with "<user>" and "<email>" and "<password>"
    Examples:
      | user| email|password|
      |TheTestUser|Pruebas1234567890|13246|



