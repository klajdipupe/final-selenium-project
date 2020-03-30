@web @regression @results
Feature: results feature

 Background:
  # I am on location search result screen

 @results-1
 Scenario Outline: Verify user can only view the result by selected property class
  Given I am on default locations search result screen
  When I select property class <starValue>
  Then I verify system displays only <starValue> hotels on search result
  Examples:
   | starValue |
   | 5 stars   |
   | 4 stars   |
   | 3 stars   |



   @results-2
   Scenario:  List of all of hotels within 10 miles radius of airport or downtown
   When I am on default locations search result screen
   And I verify system displays all hotels within 10 miles radius of airport
   Then I verify Hilton Hotel is within radius

    @results-3
    Scenario: Verify today's deal price value
    When I am on default locations search result screen
    Then I verify today's deal is less than $200

    @results-4
    Scenario Outline: Verify room count dropdown
    When I am on hotels.com home page
    Then I select <select_rooms> from room dropdown
    And I verify <number_of_room_dropdown> is displayed

    Examples:
   | select_rooms | number_of_room_dropdown|
   | 1            | 1                      |
   | 2            | 2                      |
   | 3            | 3                      |
   | 4            | 4                      |
   | 5            | 5                      |
   | 6            | 6                      |
   | 7            | 7                      |
   | 8            | 8                      |
   | 9+           | 0                      |