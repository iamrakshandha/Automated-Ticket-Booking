Feature: Book Flights

@run
@pre-requisite-flights
@afterScenarioFlights
Scenario: Enter flight details and search 
Given User is on SpiceJet landing page
When User enters flight details and search 
Then Respective flights are displayed  

