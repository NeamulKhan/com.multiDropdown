Feature: This feature is for multiple dropdown functionality

@MultiDropdown

Scenario: verify user can select dropdown options

Given Launch "<URL>"

When I select option from skills, country and date of birth
Then verify multiple dropdown successfully worked