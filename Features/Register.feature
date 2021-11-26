Feature: Register

  Scenario: Successful registration with valid details
    Given User Launch Chrome Browser
    When User opens URL "https://www.nopcommerce.com/en/register"
    And User enters First Name as "Test_Chin"
    And User enters Last Name as "Test_Chin"
    And close browser




