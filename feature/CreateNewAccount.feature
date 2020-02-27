
Feature: Test JPetStore create new account

@CreateNewAccountTestCase1
Scenario Outline: Test JPetStore create new account		
		
 		Given User will start up the Chrome browser
		And   User go to the JPetStore page and entering the store then click on register now
		When  User enter valid "<Userid>","<password>","<password1>","<Fristname>","<Lastname>","<Email>","<Phone>","<Address1>","<Address2>" ,"<City>","<State>","<Zip>" and "<Country>"
		And 	User will click log in to his new account
		When 	User enter valid "<username>" and valid "<newpassword>" combination with new account
		Then  User can be able to login  
		
	
Examples: 
|Userid|password|password1|Fristname|  Lastname |       Email      |    Phone       | Address1  | Address2  |  City  | State |   Zip  |   County |username| newpassword |
|mo2354 |12345678|12345678 | john    |   mike    | mike@mtroyal.ca	 |   403-333-3333 | North east| south east| Calagry|  AB |  T3F5T9|  Canada  |		mo2354	  | 12345678    |
     
    
      
@CreateNewAccountTestCase2
Scenario Outline: Test JPetStore create new account	without the phone information	
		
 		Given User will start  the Chrome browser
		And   User go to the main JPetStore page and entering the store then click on register now
		When  User enter valid "<Userid>","<password>","<password1>","<Fristname>","<Lastname>","<Email>","<Address1>","<Address2>" ,"<City>","<State>","<Zip>" and "<Country>" without phone
		Then  User cannot be able to create an account and error message will be display 
		
	
Examples: 
|Userid|password|password1|Fristname|  Lastname |       Email      | Address1  | Address2  |  City  | State |   Zip |   County |
|jackie2354 |12345678|12345678 | jack    |   mike    | mike@mtroyal.ca	 | North east| south east| Calagry| AB |T3F5T9|  Canada  |	
           
      
  @CreateNewAccountTestCase3
Scenario Outline: Test JPetStore create new account		
		
 		Given User open the Chrome browser
		And   User go to the JPetStore page then click on register now
		When  User enter valid "<Userid>","<password>","<password1>","<Fristname>","<Lastname>","<Email>","<Phone>","<Address1>","<City>","<State>","<Zip>" and "<Country>" without address2
		And 	User will press log in to new account 
		When 	User enter valid "<username>" and valid "<newpassword>"  with new account
		Then  User can be able to login  successful 
		
	
Examples: 
|Userid|password|password1|Fristname|  Lastname |       Email      |    Phone       | Address1  | City  | State |   Zip  |   County |username| newpassword |
|mike34 |m12345678|m12345678 | john    |   mike | mike33@mtroyal.ca	 |   403-333-3333 | North east|  Calagry|  AB |  T3F5T9|  Canada  |		mike34	  | m12345678    |





      