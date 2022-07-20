Feature: To verifying the Aboutus functionality
Scenario: Checking abouts is clickable.
Given User  open the url "https://unacademy.com/"
And User is able to click on LoginButton
And user enter '<mobile number>'
When click on Login
And user get otp
When User can click  on AboutUs
Examples:
|mobilenumber|
|8897904873|
|9391363851|
