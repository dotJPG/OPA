Narrative:
In order to assert that the basic functionality of https://www.dol.gov/ is working
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
|Topics|
|Agencies|
|Forms|
|FAQ|
|About|
|Press|
|Contact|


Scenario: Verify all of the Topics sub-navigation tabs open correctly
Meta: 
Given the user is on the DOL home page
When the user clicks on the <subNavMenuItem> within the top navigation bar
Then the <subNavMenuItem> page should open correctly

Examples:
|subNavMenuItem|
|Breaks and Meal Periods|
|COBRA|
|Disability Resources|
|Retirement Plans|


Scenario: Verify all of the Agencies sub-navigation tabs open correctly
Meta: 
Given the user is on the DOL home page
When the user clicks on the <subNavMenuAgencies> within the Agencies navigation bar
Then the <subNavMenuAgencies> page should open correctly

Examples:
|subNavMenuAgencies|
|ILAB|
|EBSA|

Scenario: Verify all of the Press sub-navigation tabs open correctly
Meta: 
Given the user is on the DOL home page
When the user clicks on the <subNavMenuPress> within the Press navigation bar
Then the <subNavMenuPress> page should open correctly

Examples:
|subNavMenuPress|
|Newsroom|
|News Release|
|News Letter|

Scenario: Verify all of the Footer navigation links open correctly
Meta:
Given the user is on the DOL home page
When the user clicks on the <navFooterItem> within the Footer
Then the <navFooterItem> page should open correctly

Examples:
|navFooterItem|
|RSS|
|Disclaimer|
|NFA|
|PSS|
|FOIA|
|TTY|

Scenario: Verify all of the Social Media navigation links open correctly
Meta: 
Given the user is on the DOL home page
When the user clicks on the <socMediaLink> link
Then the <socMediaLink> page should open correctly

Examples:
|socMediaLink|
|Twitter|
|Facebook|
|LinkedIn|
|YouTube|
|Email|





