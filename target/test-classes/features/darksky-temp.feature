@web @regression @temp
Feature: temp feature

    Background:
    # Given I am on darsky page

    @temp-1
    Scenario: Verify current temperature should not be greater or less then the Temperature from daily timeline
    Then I verify current temp is not greater or less than temps from daily timeline


    @temp-2
    Scenario: Verify the timeline is displayed in correct format
    Then I verify timeline is displayed with two hours incremented


    @temp-3
    Scenario: Verify individual day temp timeline
    When I expand today's timeline
    Then I verify lowest and highest temp is displayed correctly


    @temp-4
    Scenario: Verify invalid signup error message
        When I am on darksky Register Page
        Then I click on register button
        Then I verify I am on register page by asserting Register header
