Narrative:
In order to assert that the basic functionality of https://www.dol.gov/agencies/ilab is working
As a tester
I want to run the daily regressions at least twice a day

Meta: 

Scenario: Verify all of the About Us tabs from the ILAB page
Meta: @skip
Given the user is on the ILAB home page
When the user clicks on <aboutUsMenuItem> within the About Us tab on the menu bar
Then the <aboutUsMenuItem> page should open correctly

Examples:
|aboutUsMenuItem|
|missionAndOffices|
|lawsAndRegulations|
|joinTheTeam|

Scenario: Verify all of the Our Work tabs from the ILAB page
Meta: @skip
Given the user is on the ILAB home page
When the user clicks on <ourWorkMenuItem> within the Our Work tab on the menu bar
Then the <ourWorkMenuItem> page should open correctly

Examples:
|ourWorkMenuItem|
|childLabor|
|projects|

Scenario: Verify all of the Resources tabs from the ILAB page
Meta: @skip
Given the user is on the ILAB home page
When the user clicks on <resourcesMenuItem> within the Resources tab on the menu bar
Then the <resourcesMenuItem> page should open correctly

Examples:
|resourcesMenuItem|
|reportsAndPublications|
|grantsAndContracts|


Scenario: Verify all of the ILAB In Action tabs from the ILAB page
Meta: 
Given the user is on the ILAB home page
When the user clicks on <actionMenuItem> within the ILAB In Action tab on the menu bar
Then the <actionMenuItem> page should open correctly

Examples:
|actionMenuItem|
|newsReleases|
|ourRightsOurVoices|



