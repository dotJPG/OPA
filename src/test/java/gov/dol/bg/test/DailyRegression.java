package gov.dol.bg.test;

import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Named;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

//import gov.dol.bg.test.steps.serenity.User;

public class DailyRegression {

    @Steps
    User user;

    //Scenario: Verify all of the navbar tabs to assert that the pages open correctly
    @Given("the user is on the DOL home page")
    public void the_user_is_on_homepage() {
        user.onHomePage();
    }

    @When("the user clicks on <navMenuItem> within the top navigation bar")
    public void when_I_click_on_each_link_in_the_top_navigation_bar(@Named("navMenuItem") String navMenuItem) {
		user.clickNavNode(navMenuItem);
	}

    @Then("the <navMenuItem> page should open correctly")
    public void then_the_navigation_tab_should_open_correctly(@Named("navMenuItem") String navMenuItem) {
		user.shouldSeePage(navMenuItem);
	}
    
    //sub nav Topics
    @When("the user clicks on the <subNavMenuItem> within the top navigation bar")
    public void when_user_clicks_on_each_sublink_in_the_top_navigation_bar(@Named("subNavMenuItem") String subNavMenuItem) {
		user.clickNavNode(subNavMenuItem);
	}

    @Then("the <subNavMenuItem> page should open correctly")
    public void then_the_sub_navigation_page_should_open_correctly(@Named("subNavMenuItem") String subNavMenuItem) {
		user.shouldSeePage(subNavMenuItem);
	}
    
    //Sub nav Agencies
    @When("the user clicks on the <subNavMenuAgencies> within the Agencies navigation bar")
    public void the_user_clicks_on_the_subNavMenuAgencies_within_the_Agencies_navigation_bar(@Named("subNavMenuAgencies") String subNavMenuAgencies) {
		user.clickNavNode(subNavMenuAgencies);
	}

    @Then("the <subNavMenuAgencies> page should open correctly")
    public void the_subNavMenuAgencies_page_should_open_correctly(@Named("subNavMenuAgencies") String subNavMenuAgencies) {
		user.shouldSeePage(subNavMenuAgencies);
	}
    
    //Press
    @When("the user clicks on the <subNavMenuPress> within the Press navigation bar")
    public void the_user_clicks_on_the_subNavMenuPress_within_the_Press_navigation_bar(@Named("subNavMenuPress") String subNavMenuPress) {
		user.clickNavNode(subNavMenuPress);
	}

    @Then("the <subNavMenuPress> page should open correctly")
    public void the_subNavMenuPress_page_should_open_correctly(@Named("subNavMenuPress") String subNavMenuPress) {
		user.shouldSeePage(subNavMenuPress);
	}
    
    
    //Footer
    @When("the user clicks on the <navFooterItem> within the Footer")
    public void the_user_clicks_on_the_navFooterItem_within_the_Press_navigation_bar(@Named("navFooterItem") String navFooterItem) {
		user.clickNavNode(navFooterItem);
	}

    @Then("the <navFooterItem> page should open correctly")
    public void the_navFooterItem_page_should_open_correctly(@Named("navFooterItem") String navFooterItem) {
		user.shouldSeePage(navFooterItem);
	}

    //Social Media
    @When("the user clicks on the <socMediaLink> link")
    public void the_user_clicks_on_the_navFooterItem_within_the_Press_navigation_barr(@Named("socMediaLink") String socMediaLink) {
		user.clickNavNode(socMediaLink);
	}

    @Then("the <socMediaLink> page should open correctly")
    public void the_navFooterItem_page_should_open_correctlyy(@Named("socMediaLink") String socMediaLink) {
		user.shouldSeePage(socMediaLink);
	}
    
    
    //ILAB Homepage
    //******************************************************************************************************//
    @Given("the user is on the ILAB home page")
    public void the_user_is_on_ihomepage() {
        user.onILABPage();
    }
    
    @When("the user clicks on <aboutUsMenuItem> within the About Us tab on the menu bar")
    public void when_I_click_on_each_link_in_the_top_nav_bar(@Named("aboutUsMenuItem") String aboutUsMenuItem) {
		user.clickNavNode(aboutUsMenuItem);
	}
    @Then("the <aboutUsMenuItem> page should open correctly")
    public void then_the_nav_tab_should_open_correctly(@Named("aboutUsMenuItem") String aboutUsMenuItem) {
		user.shouldSeePage(aboutUsMenuItem);
	}
    
    @When("the user clicks on <ourWorkMenuItem> within the Our Work tab on the menu bar")
    public void when_I_click_on_each_link_in_the_top_nav_panel(@Named("ourWorkMenuItem") String ourWorkMenuItem) {
		user.clickNavNode(ourWorkMenuItem);
	}
    @Then("the <ourWorkMenuItem> page should open correctly")
    public void then_the_OurWorkMenuItem_tab_should_open_correctly(@Named("ourWorkMenuItem") String ourWorkMenuItem) {
		user.shouldSeePage(ourWorkMenuItem);
	}
    
    @When("the user clicks on <resourcesMenuItem> within the Resources tab on the menu bar")
    public void when_I_click_on_each_link_in_the_resources_panel(@Named("resourcesMenuItem") String resourcesMenuItem) {
		user.clickNavNode(resourcesMenuItem);
	}
    @Then("the <resourcesMenuItem> page should open correctly")
    public void then_the_resource_should_open_correctly(@Named("resourcesMenuItem") String resourcesMenuItem) {
		user.shouldSeePage(resourcesMenuItem);
	}
    
    @When("the user clicks on <actionMenuItem> within the ILAB In Action tab on the menu bar")
    public void when_I_click_on_each_link_in_the_action_panel(@Named("actionMenuItem") String actionMenuItem) {
		user.clickNavNode(actionMenuItem);
	}
    @Then("the <actionMenuItem> page should open correctly")
    public void then_the_action_should_open_correctly(@Named("actionMenuItem") String actionMenuItem) {
		user.shouldSeePage(actionMenuItem);
	}
    
    
    //EBSA Homepage
    //******************************************************************************************************//
    @Given("the user is on the EBSA home page")
    public void the_user_is_on_ehomepage() {
        user.onEBSAPage();
    }
    
    @When("the user clicks on <ebsaMenuItem> within the menu bar")
    public void when_I_click_on_each_link_in_the_top_nav(@Named("ebsaMenuItem") String ebsaMenuItem) {
		user.clickNavNode(ebsaMenuItem);
	}
    @Then("the <ebsaMenuItem> page should open correctly")
    public void then_the_ebsa_tab_should_open_correctly(@Named("ebsaMenuItem") String ebsaMenuItem) {
		user.shouldSeePage(ebsaMenuItem);
	}
 
    @When("the user clicks on <aboutEBSAMenuItem> within the About Us tab on the menu bar")
    public void when_I_click_on_each_link_in_the_aboutEBSA_tab(@Named("aboutEBSAMenuItem") String aboutEBSAMenuItem) {
		user.clickNavNode(aboutEBSAMenuItem);
	}
    @Then("the <aboutEBSAMenuItem> page should open correctly")
    public void then_the_aboutEBSA_tab_should_open_correctly(@Named("aboutEBSAMenuItem") String aboutEBSAMenuItem) {
		user.shouldSeePage(aboutEBSAMenuItem);
	}
    @When("the user clicks on <workFamMenuItem> within the Workers & Families tab on the menu bar")
    public void when_I_click_on_each_link_in_the_workFam_tab(@Named("workFamMenuItem") String workFamMenuItem) {
		user.clickNavNode(workFamMenuItem);
	}
    @Then("the <workFamMenuItem> page should open correctly")
    public void then_the_workFam_tab_should_open_correctly(@Named("workFamMenuItem") String workFamMenuItem) {
		user.shouldSeePage(workFamMenuItem);
	}    
    @When("the user clicks on <employerAdviserMenuItem> within the Employers & Advisers tab on the menu bar")
    public void when_I_click_on_each_link_in_the_employerAdviser_tab(@Named("employerAdviserMenuItem") String employerAdviserMenuItem) {
		user.clickNavNode(employerAdviserMenuItem);
	}
    @Then("the <employerAdviserMenuItem> page should open correctly")
    public void then_the_employerAdviser_tab_should_open_correctly(@Named("employerAdviserMenuItem") String employerAdviserMenuItem) {
		user.shouldSeePage(employerAdviserMenuItem);
	}    
    @When("the user clicks on <researchersMenuItem> within the Researchers tab on the menu bar")
    public void when_I_click_on_each_link_in_the_researchers_tab(@Named("researchersMenuItem") String researchersMenuItem) {
		user.clickNavNode(researchersMenuItem);
	}
    @Then("the <researchersMenuItem> page should open correctly")
    public void then_the__tab_should_open_correctly(@Named("researchersMenuItem") String researchersMenuItem) {
		user.shouldSeePage(researchersMenuItem);
	}    
    @When("the user clicks on <keyTopicMenuItem> within the Key Topics tab on the menu bar")
    public void when_I_click_on_each_link_in_the_keyTopic_tab(@Named("keyTopicMenuItem") String keyTopicMenuItem) {
		user.clickNavNode(keyTopicMenuItem);
	}
    @Then("the <keyTopicMenuItem> page should open correctly")
    public void then_the__keyTopic_should_open_correctly(@Named("keyTopicMenuItem") String keyTopicMenuItem) {
		user.shouldSeePage(keyTopicMenuItem);
	}  
    @When("the user clicks on <lawsregsMenuItem> within the Laws & Regulations tab on the menu bar")
    public void when_I_click_on_each_link_in_the_lawsregs_tab(@Named("lawsregsMenuItem") String lawsregsMenuItem) {
		user.clickNavNode(lawsregsMenuItem);
	}
    @Then("the <lawsregsMenuItem> page should open correctly")
    public void then_the__lawsregs_should_open_correctly(@Named("lawsregsMenuItem") String lawsregsMenuItem) {
		user.shouldSeePage(lawsregsMenuItem);
	}  
    
}
