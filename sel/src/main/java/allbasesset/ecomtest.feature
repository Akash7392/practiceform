
Feature:crate new account functionality for ecom site

#klhkjklj
Scenario Outline: to test entire create an account form 
Given navigate to website and click on sign in button
When  Enter e-mail Address "<emailid>"and click on create an account button
Then  display successfully open the form message
Then click on title radio button
Then Enter first name "<first_name>"last name "<last_name>"and password  "<password>"
Then Enter DOB day "<day>" month "<month> "year "<year>"
Then check sign up and release special offer box
Then Enter the address fields first name "<first_n>"last name "<last_n>"company "<company>"Address "<Address>" Address line two "<Addline2>" city "<city>"zipcode "<zipcode>"additional information "<additional_info>"home phone "<homephone>"mobile no "<mob_no>"enter adress alias "<add_alias>"
Then Select the value from state "<state_dropdown>"and country dropdown "<country_dropdown>"
Then click on register button and display the successfully registration message
Then quit the browser
Examples:
|emailid|first_name|last_name|password|day|month|year|first_n|last_n|company|Address|Addline2|city|zipcode|additional_info|homephone|mob_no|add_alias|state_dropdown|country_dropdown|
|ak.yesankar@outlook.com|junaid|patle|123456|2|March|2010|junaid|patle|bajaj|fuck you|galli no 2|Pune|444029|ok to share|6966584555|9856235689|multiple add|Alaska|United States|
