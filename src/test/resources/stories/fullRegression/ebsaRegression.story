Narrative:
In order to assert that the basic functionality of https://www.dol.gov/agencies/ebsa is working
As a tester
I want to run the daily regressions at least twice a day

Meta: 

Scenario: Verify the Ask EBSA and EBSA Home menu items
Meta: 
Given the user is on the EBSA home page
When the user clicks on <ebsaMenuItem> within the menu bar
Then the <ebsaMenuItem> page should open correctly

Examples:
|ebsaMenuItem|
|askEBSA|
|ebsaHomepage|

Scenario: Verify all of the About EBSA tabs from the EBSA page
Meta: 
Given the user is on the EBSA home page
When the user clicks on <aboutEBSAMenuItem> within the About Us tab on the menu bar
Then the <aboutEBSAMenuItem> page should open correctly

Examples:
|aboutEBSAMenuItem|
|enforcement|
|ourOrganization|


Scenario: Verify all of the Workers & Families tabs from the EBSA page
Meta: 
Given the user is on the EBSA home page
When the user clicks on <workFamMenuItem> within the Workers & Families tab on the menu bar
Then the <workFamMenuItem> page should open correctly

Examples:
|workFamMenuItem|
|disasterRelief|
|separationAndDivorce|

Scenario: Verify all of the Employers & Advisers tabs from the EBSA page
Meta: 
Given the user is on the EBSA home page
When the user clicks on <employerAdviserMenuItem> within the Employers & Advisers tab on the menu bar
Then the <employerAdviserMenuItem> page should open correctly

Examples:
|employerAdviserMenuItem|
|abandonedPlans|
|reportingGuidelines|


Scenario: Verify all of the Researchers tabs from the EBSA page
Meta: 
Given the user is on the EBSA home page
When the user clicks on <researchersMenuItem> within the Researchers tab on the menu bar
Then the <researchersMenuItem> page should open correctly

Examples:
|researchersMenuItem|
|retirementResources|
|pensionPlan|

Scenario: Verify all of the Key Topics tabs from the EBSA page
Meta: 
Given the user is on the EBSA home page
When the user clicks on <keyTopicMenuItem> within the Key Topics tab on the menu bar
Then the <keyTopicMenuItem> page should open correctly

Examples:
|keyTopicMenuItem|
|ACA|
|401k|

Scenario: Verify all of the Laws & Regulations tabs from the EBSA page
Meta: 
Given the user is on the EBSA home page
When the user clicks on <lawsregsMenuItem> within the Laws & Regulations tab on the menu bar
Then the <lawsregsMenuItem> page should open correctly

Examples:
|lawsregsMenuItem|
|HIPAA|
|federalRegister|
