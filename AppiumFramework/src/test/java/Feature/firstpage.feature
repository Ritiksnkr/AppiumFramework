Feature: User register themselves
@tag1
  Scenario: Firstpage
    Given open the emulator
    When the user enter the username
    And the mobile number
    Then the user clicks on submit button
@tag2
  Scenario: Secondpage
    When the user tap on the option
    And select the area
    Then click on the submit button
@tag3
  Scenario: Thirdpage
    And select the gender
    And select the qualification
    And select the medium
    And select the language
    When user scroll the page
    And select the Experience
    And select the year
    And Select the age
    And select the Interest
    Then Click the submit button
