Feature: Enter the User details and Select Language

  Background: WorkindiaApp is Launching Before all scenarios
    Given WorkindiaApp Launched

  @test3
  Scenario Outline: Enter Details on the Application and Select Language
    Given User enters the "<username>" and "<mobile>" and "<near_place>"
    When User selects all the details on the page
    Then User goes to Qualification page

    Examples: 
      | username | mobile     | near_place |
      | Ritik   | 9335962112|Thane |

  @test4
  Scenario Outline: Enter Details on the Application and Select Language
    Given User enters the "<username>" and "<mobile>" and "<near_place>"
    When User selects all the details on the page
    When User selects selects the qualification
    Then User goes to Language page

    Examples: 
      | username | mobile     | near_place |
      | Ritik   | 9335962112 | Thane  |

  @test5
  Scenario Outline: Enter Details on the Application and Select Language
    Given User enters the "<username>" and "<mobile>" and "<near_place>"
    When User selects all the details on the page
    When User selects selects the qualification
    When User selects Language
    Then App is opened sucessfully

    Examples: 
      | username | mobile     | near_place |
      |Ritik  | 9335962112 | Thane  |