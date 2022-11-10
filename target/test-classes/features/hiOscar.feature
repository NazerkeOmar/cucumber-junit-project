Feature: hioscar.com care options web app testing

  Scenario:hioscar.com care options web app testing
    Given Go to hiOscar web page
    When Click Search network
    And From Coverage year dropdown Select "2023" option
    And From Coverage access dropdown Select "Employer-provided" option
    And From Network partner dropdown Select "Oscar" option
    And From Coverage area dropdown Select "New Jersey"
    And Click Continue button
    Then Verify title contains “"Oscar"”




