Feature: Login into Application

Scenario Outline: Positive test validating login
Given Initialize the browser with chrome
And Navigate to "http://QAClickacademy.com" site
And Click on Login link in home page to land on sign in Page
When User enters "<username>" and "<password>" logs in 
Then verify that user is successfully logged in
And close browsers

Examples:
|username			|password  |
|test99@gmail.com	|123456	   |
|test123@gmail.com	|12345     |