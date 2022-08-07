@grid_feature
Feature: grid_feature
  Scenario: TC01_running_on_chrome
    Given user is on the app_url with chrome
    And verify the title of the page is "Blue Rental Cars | Cheap, Hygienic, VIP Car Hire"
    Then  close the remote driver

@grid_frefox
  Scenario: TC01_running_on_chrome
    Given user is on the app_url with frifox
    And verify the title of the page is "Blue Rental Cars | Cheap, Hygienic, VIP Car Hire"
    Then  close the remote driver