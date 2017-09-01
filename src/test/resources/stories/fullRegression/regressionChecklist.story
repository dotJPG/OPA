Narrative:
In order to assert that the basic functionality of https://www.dol.gov/ is working
As a tester
I want to run the daily regressions at least twice a day

Meta:

Scenario: Verify all of the navbar tabs to assert that the pages open correctly
Meta: @skip
Given the user is on the DOL home page
When the user clicks on <navMenuItem> within the top navigation bar
Then the <navMenuItem> page should open correctly

Examples:
|navMenuItem|
|Topics|
|Agencies|
|Forms|
|FAQ|
|About|
|Press|
|Contact|


Scenario: Verify all of the sub-navigation tabs open correctly
Meta: 
Given the user is on the DOL home page
When the user clicks on the <subNavMenuItem> within the top navigation bar
Then the <subNavMenuItem> page should open correctly

Examples:
|subNavMenuItem|
|Breaks and Meal Periods|
|Cobra|


