Feature: To verifying the login functionality.

Background:
Given User is able to open the url "https://unacademy.com/"


Scenario: Checking the functionality for valid data.
And User click on loginButton       
And user enters the '<mobilenumber>'
When user is able to click on LoginButton 
Then user will able to get the otp 
And user naviagted to aboutuspage 
Examples:
|mobilenumber|
|9392432671|
|9392432671|



Scenario: Checking abouts is clickable.
And User is able to tap on LoginButton
And user type the "9392432671"
When Tap on LoginButton
Then user can receive otp
And  User navigated to next page where he able to see about unacdemy

