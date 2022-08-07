Feature: database_read_feature
  Background: connect_database
    Given user connects to the database

  @db_customer_ssn
  Scenario: TC01_read_customer_ssn_information

    And user gets "*" from "tp_customer" table
    And user reads all the "ssn" column data
    Then close the database connection


  @db_customer_address
  Scenario: TC01_read_customer_address_information

    And user gets "*" from "tp_customer" table
    And user reads all the "address" column data
    Then close the database connection


  @db_customer_email
  Scenario: TC03_read_customer_email_information

    And user gets "*" from "tp_customer" table
    And user reads all the "email" column data
    Then close the database connection


  @db_user_email
  Scenario: TC03_read_customer_email_information
    And user gets "*" from "jhi_user" table
    And user reads all the "email" column data
    Then close the database connection

  @db_user_email
  Scenario: TC03_read_customer_email_information
    And user gets "*" from "jhi_user" table
    And user reads all the "login" column data
    Then close the database connection

    @db_user_login_verify
    Scenario: TC06_verify_user_login
      And user gets "*" from "jhi_user" table
      Then verify "jhi_user" table "login" coulumn contains "murtaza"
      Then close the database connection


  @db_user_email_verify
  Scenario: TC06_verify_user_email
    And user gets "*" from "jhi_user" table
    Then verify "jhi_user" table "email" coulumn contains "miquel.okon@hotmail.com"
    Then close the database connection

  @db_user_account_verify
 Scenario Outline: TC06_verify_account
   # And user gets "*" from "tp_account" table
    Then verify "tp_account" table "account_type" coulumn contains "<SAVING>"
    Then close the database connection
    Examples: account_type
    |SAVING|
    |SAVING|
    |CREDIT_CARD|
    |CHECKING|
    |DEBIT|

    @db_user_count
    Scenario: TC09
      And user gets "*" from "jhi_user" table
      Then read the row count of "jhi_user" table
      And read column name of "jhi_user" table



