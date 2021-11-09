Feature: To Check the functionality from the homepage

Scenario Outline: Login check
Given Navigate to the Login page
Then Validate the Shop products 
And validate the Search Bar to search <data>
Then Validate Learn more option
And Close the driver


Examples:
|data         |
|antibacterial|