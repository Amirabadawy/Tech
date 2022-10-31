Feature: Registration Functionality

  Scenario Outline: Registration functionality
    Given website is opened
    When click on sign in button in home page
    And type email "<email>" in Authentication page
    And click on create an account button in Authentication page
    And type first name "<firstName>" in create account page
    And type last name "<lastName>" in create account page
    And choose title in create account page
    And type password "<password>" in create account page
    And select day of birth in create account page
    And select month of birth in create account page
    And select year of birth in create account page
    And type address "<companyAddress>" in create account page
    And type city "<city>" in create account page
    And select state in create account page
    And type postal code "<postalCode>" in create account page
    And type mobile phone "<mobilePhone>" in create account page
    And type address "<address>" alias for future reference in create account page
    And click on register button in create account page
    Then my wishlists button should be displayed in my account page
    When click on logout button in my account page
    And type login email "<email>" in Authentication page
    And type password "<password>" in Authentication page
    And click on login button in Authentication page
    Then my wishlists button should be displayed in my account page

    Examples:
    |email                  | firstName | lastName | password | companyAddress       | city | postalCode | mobilePhone  | address |
    |amira7505701@gmail.com| Amira     | Badawy   | Test@1234| Maddi,TestingCompany | Cairo| 25731       | 01015708282 | office  |
