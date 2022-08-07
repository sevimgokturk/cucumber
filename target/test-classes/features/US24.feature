@US24
  Feature: US24_Patient can view the test result and the invoice
    Scenario: AC01 Patient can view the test result
      Given User is on the login page
      Then User signs in as a patient.
      Then  Patient clicks on My Page
      Then  Patient clicks on My Appointments
      Then  Patient clicks on one of the Show Tests
      Then   Patient clicks on one of the View Results
      And   Patient verifies test results header is displayed
      And   Patient verifies all test items are displayed.
      And   Patent  closes the browser


    Scenario: AC02 Patient can view the invoice
