
Feature: Etsy Title Verification
  User story: As a user is I am on https://www.etsy.com
  I should able to see title is as expected.

  Background:
    Given User is on https: www.etsy.com

  Scenario: Etsy Title Verification
    #Given User is on https: www.etsy.com
    Then User sees title is as expected.

  Scenario: Etsy Search Functionality Title Verification (without parameterization)
    #Given User is on https: www.etsy.com
    When User types Wooden Spoon in the search box
    And User clicks search button
    Then User sees Wooden Spoon is in the title


  Scenario:  Etsy Search Functionality Title Verification (with parameterization)
    #Given User is on https: www.etsy.com
    When User types "Wooden Spoon" in the search box
    And User clicks search button
    Then User sees "Wooden Spoon" is in the title
