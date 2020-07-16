#Author: dfrances@sqli.com
Feature: Init test

  Scenario: Init test
    Given I want to configure my firefox browser
    When I navigate to Google
    Then the title of the web page is Google
    And I want to close my browser
