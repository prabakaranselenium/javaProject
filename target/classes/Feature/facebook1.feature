#Author:Prabakaran
Feature: Facebook login feature

Scenario Outline: Facebook login Fuctionality Checking
Given User is on facebook page
When  User enters username and password "<username>","<password>"
And User clicking login button
Then Verify the user loggedin toi the facebook Sucessfully


 Examples:
      | username| password |
      |mail2prabakaran@gmail.com|pragate12345|