
Feature: Test JPetStore change the password

@ChangePasswordTestCase1
Scenario Outline: Test JPetStore chagnePassword	 match password 	
		Given User will open Chrome browser
		And   User go to JPetStore page
		When  User enter valid "<username>" and valid "<password>" combination 
		And   User go to My Account After login
		When 	User enter valid new password "<Newpassword>" and re-type password "<Newpassword>"
		And 	User log out from their account
		When 	User enter valid "<username>" and valid "<Newpassword>" combination with new password change
		Then  User can be able to login with new password 

Examples: 
| username  | password | Newpassword| 
| quality1  | 12345678 |     1234   |  			

@ChangePasswordTestCase2
Scenario Outline: Test JPetStore chagnePassword	 with an match 
		Given User open Chrome Browser.
		And   User will go to JPetStore page
		When  User enter valid "<username>" and valid "<password>" combination to log im 
		And   User go to My Account information
		When 	User enter valid new password "<Newpassword>" but re-type invalid password "<Newpassword1>"
		Then  User will have an error message

Examples: 
| username  | password | Newpassword| Newpassword1|
| quality1  |     1234 |   12345678 |   123456789 | 	