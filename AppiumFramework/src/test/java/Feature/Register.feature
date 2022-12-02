Feature: Registeration of the user and City on JobSearch Application

  Background: App Launching Before all scenarios
    Given WorkindiaApp is Launched

  @test1
  Scenario Outline: User Registers on the Application
    Given User is on JobSearch Register page
    When User enters the "<username>" and "<mobile>"
    When User click on Submit
    Then User redirects to Citypage

    Examples: 
      | username | mobile     |
      | Ritik   | 8178892260 |

  @test2
  Scenario Outline: User Select the city and Fill the near_place
    Given User enters the "<username>" and "<mobile>" to register and get to city page
    When User selects a city and Enter "<near_place>"
    When User click on Submit button
    Then User Redirect to Detailpage

    Examples: 
      | username | mobile     | near_place |
      | Ritik  | 8178892260 |Thane |