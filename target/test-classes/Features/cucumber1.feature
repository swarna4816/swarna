Feature: To verifying the login functionality.
Scenario: Checking the functionality for valid data.
Given User on the webpage "https://unacademy.com/"
And User is able to click on loginButton        
And user enter the '<mobilenumber>'
When click on LoginButton 
Then user will get the otp 
And user can see aboutus link
Examples:
|mobilenumber|
|9392432671|
|9701338447|
