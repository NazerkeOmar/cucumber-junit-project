@smoke @regression @login
Feature: Library app login feature
  As a user, I should be able to login with correct credentials to different accounts and
  dashboard should be displayed.

  Accounts are: librarian, student, admin

  Background: for the scenario in the feature file, user is expected to be
    Given user is on the library login page

  @smoke @librarian @employee
  Scenario: Login as a librarian
    #Given user is on the library login page
    When user enters librarian username
    And user enters librarian password
    Then user should see dashboard

  @student
  Scenario: Login as a student
    #Given user is on the library login page
    When user enters student username
    And user enters student password
    Then user should see dashboard

  @admin @employee @smoke
  Scenario: Login as a admin
    #Given user is on the library login page
    When user enters admin username
    And user enters admin password
    Then user should see dashboard
