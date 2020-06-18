Feature: Login/SignUp

@run
@pre-requisite1
@afterScenarios
Scenario: SignUp invalid email
Given User is on signup landing page
When Enter invalid user details and submit
|Rakshandha|Kannappan|Canada|8073576926|Selenium@1234567|Selenium@1234567|1990 - 2001|16|iamrakshandha@gmail|
Then Invalid email popup

@run
@pre-requisite1
@afterScenarios
Scenario: SignUp valid email
Given User is on signup landing page
When Enter valid user details and submit
|Rakshandha|Kannappan|Canada|8073576926|Selenium@1234567|Selenium@1234567|1990 - 2001|16|iamrakshandha@gmail.com|
Then opt 

@run
@pre-requisite1
@afterScenarios
Scenario: SignUp using existing user deatils
Given User is on signup landing page
When Enter existing user details and submit
|Rakshandha|Kannappan|India|9003190155|
Then User already existing popup

@run
@pre-requisite2
@afterScenarios
Scenario Outline: Login invalid email
Given User is on login landing page
When Enter <emailID> <password> and user submits
Then Login "Deals"
Examples:
|emailID|password|
|firstname@gmail.com|Selinium@1234567|
|lastname@gmail.com|Selinium@1234567|


@run
@pre-requisite2
@afterScenarios
Scenario: Login valid email
Given User is on login landing page
When Enter "swebdriver1@gmail.com" and "Selenium@1234567"
Then Login "Successful"








