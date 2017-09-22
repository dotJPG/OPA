Narrative:
In order to assert that the basic functionality of https://www.dol.gov/agencies/ilab is working
As a tester
I want to run the daily regressions at least twice a day

Meta: 

Scenario: Verify all of the About Us tabs from the ILAB page
Meta: 
Given the user is on the ILAB home page
When the user clicks on <aboutUsMenuItem> within the top nav bar
Then the <aboutUsMenuItem> pages should open correctly

Examples:
|aboutUsMenuItem|
|MISSION|
|LAWSANDREGS|
|JOIN|

Scenario: Verify all of the Our Work tabs from the ILAB page
Meta: 
Given the user is on the ILAB home page
When the user clicks on <ourWorkMenuItem> within the top nav panel
Then the <ourWorkMenuItem> pages should open correctlyy

Examples:
|ourWorkMenuItem|
|CLABOR|
|PROJECTS|

Scenario: Verify all of the Resources tabs from the ILAB page
Meta: 
Given the user is on the ILAB home page
When the user clicks on <resourcesMenuItem> within the top nav panel
Then the <resourcesMenuItem> pages should open correctlyy

Examples:
|resourcesMenuItem|
|REPORTS|
|GRANTS|


Scenario: Verify all of the ILAB In Action tabs from the ILAB page
Meta: 
Given the user is on the ILAB home page
When the user clicks on <actionMenuItem> within the top nav panel
Then the <actionMenuItem> pages should open correctlyy

Examples:
|actionMenuItem|
|NEWS|
|OURVOICES|



