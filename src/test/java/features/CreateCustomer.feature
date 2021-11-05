Feature: Create customer account

Scenario: Registration
Given Customer navigave to the website without account
When Customer click on dont have account
Then They go and input all detail needed to create account

Scenario Outline:: Verify by OTP
Given Customer navigave to the OTP verify page
When Customer click and input <"1"> <"2"><"3"><"4">	
Then they will landing to successfull page
Examples:
|num1|num2|num3|num4|
|1	|2	|3	|4|