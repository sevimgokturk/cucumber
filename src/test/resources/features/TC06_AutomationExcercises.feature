@contact_us
Feature: Contact_us
  Scenario: Send_a_message_successfully
    Given usr lunches the browser
    When  user navigate to url
    Then  user verify home page is visible successfully
    When user clicks on Contact Us button
    And user verify GET IN TOUCH is visible
    And user  enters name, email, subject and message
    And user uploads file
    And user clicks Submit button
    When user clicks OK button
    And user verifies success message Success! Your details have been submitted successfully. is visible
    And user clicks Home button and verify that landed to home page successfully

