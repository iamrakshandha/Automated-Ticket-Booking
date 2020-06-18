Feature: Book Hotels


@run
@pre-requisite-hotels
@afterScenarioHotels
Scenario: Enter hotel details and search 
Given User on SpiceJet landing page
When User navigates to book hotels  
And Enters hotel details and search 
Then Respective hotels are displayed  
