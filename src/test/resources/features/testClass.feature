# language: en
Feature: Append two strings

  Scenario: Success appending
    Given 2 args "some1" and "some2"
    When user do append
    Then user receive result "some1some2"
