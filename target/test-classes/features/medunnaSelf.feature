@test112
Feature: firstFeature
  Scenario: TC_login_as_doc
    Given doctor is on the login page Medunna
    Then doctor clicks on account menu
    Then doctor clicks on signin
    And doctor enters username
    And doctor enters password
    And  doctor clicks on signin button
    And doctor verifies that hs page is displayed
    And doctor clicks on mypage
    And doctor clicks on myaccountement
    And doctor verifies Appointement page is displayed
    And doctor clicks on Edit button
    And User verifies that the Create or Edit an Appointment page is displayed
    And User clicks on the Request A Test button.
    And User verifies that the Test Items page is displayed
    And User can choose the test item:team87Sodium
    And User can choose the test item:team87Potassium
    And User can choose the test item:team87Hemoglobin
    And User can choose the test item:team87Cholesterol
    And User can choose the test item:team87Urea
    And User can choose the test item:team87TotalProtein
    And User can choose the test item:team87Albumin
    And User can choose the test item:team87Vitamin D
    And User can choose the test item:team87Albimo
    And User click on save button
    And user close the browser

