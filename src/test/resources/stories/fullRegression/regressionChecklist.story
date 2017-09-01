Narrative:
In order to assert that the basic functionality of https://www.benefits.gov/ is working
As a tester
I want to run the daily regressions at least twice a day

Meta:

Scenario: Verify all of the navbar tabs to assert that the pages open correctly
Meta: 
Given the user is on the DOL home page
When the user clicks on <navMenuItem> within the top navigation bar
Then the <navMenuItem> page should open correctly

Examples:
|navMenuItem|
|Breaks and Meal Periods|
|Topics|
|Agencies|
|Forms|
|FAQ|
|About|
|Press|
|Contact|





