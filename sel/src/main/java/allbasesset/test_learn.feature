Feature: to sample account create form
Scenario Outline: to test few field of account create form
Given Navigate to site 
When click on sign in button
And enter email address "<emailid1>"
And  enter security password "<pass>"
Then click on sgin in button again
Then display the message
Then quit the only browser


Examples:
         |emailid1|pass|
         |ak.yesankar@outlook.com|okakash|
         
