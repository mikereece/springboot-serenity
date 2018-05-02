Feature: Login to Application
Description: Login to Application

Scenario: Login to Application

Given I have logged in to the Portal as "test and test" user
When The user has been authorised
Then the default "Home" page should be displayed