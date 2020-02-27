
Feature: Test JPetStore Login

@loginTestCase1
 Scenario Outline: Test JPetStore Login with valid user name and password 
		Given User open Chrome browser
		And   User go to JPetStore page and click to enter the store and to sign in
		When  User enter valid "<username>" and "<password>" combination and User will click on login bottum
		Then  User should be able to login successfully and should see the sign out buttom 
@ExampleTestCase1
Examples:
|username|password |
|quality1|12345678|


@loginTestCase2
 Scenario Outline: Test JPetStore Login with valid user name and invalid password 
		Given User will open Chrome browser.
		And   User will go to JPetStore page and  click to enter the store and to sign in website.
		When  User enter valid "<username>" and unvalid"<password>" combination and User will click on login bottum
		Then  User should not be able to login successfully and User should not see the sign out buttom
		
@ExampleTestCase2
Examples:
|username|password |
|quality1|123456789|


@loginTestCase3
 Scenario Outline: Test JPetStore Login with invalid user name and valid password 

		Given User will go to open Chrome browser
		And   User will go the JPetStore page and  click to enter the store and to sign in into the store
		When  User enter unvalid "<username>" and valid"<password>" combination and User will click on login bottum
		Then  User should not be able to login successfully and will not see the sign out buttom
		
@ExampleTestCase3
Examples:
|username|password |
|quality|12345678|