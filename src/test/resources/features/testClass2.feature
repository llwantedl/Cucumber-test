# language: en
Feature: Append two strings method

  Scenario: Second method appending
    Given 2 args "some1" and "some2"
    When user do second method append
    Then user receive result "some1some2"
