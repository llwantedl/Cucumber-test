# language: en
Feature: Append two strings first method

  Scenario: First method appending
    Given 2 args "some1" and "some2"
    When user do first method append
    Then user receive result "some1some2"
