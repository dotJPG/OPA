package gov.benefits.bg.test.steps;

import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Named;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

import gov.benefits.bg.test.steps.serenity.User;

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
    

}
