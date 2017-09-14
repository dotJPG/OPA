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
    
    
    

}
