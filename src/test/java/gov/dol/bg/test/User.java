package gov.dol.bg.test;

import gov.dol.bg.test.pages.DOLHomepage;
import net.thucydides.core.annotations.Step;
import org.junit.Assert;


public class User {

	DOLHomepage dolHomepage;

    @Step
    public void onHomePage() {
    	dolHomepage.open();
    }
    
    @Step
	public void open_page(String directoryPath) {
    	dolHomepage.clearCookies();
		
		String url = dolHomepage.defaultUrl + directoryPath;
		
		dolHomepage.openAt(url);
	
	}
    


    
    @Step
    public void clickNavNode(String node) {
    	

    	switch(node) {
    	//Main Nav
		case "Topics": 
			dolHomepage.topicsNavButton.click();
			break;
		case "Agencies": 
			dolHomepage.agenciesNavButton.click();
			break;
		case "Forms": 
			dolHomepage.formsNavButton.click();
			break;
		case "FAQ": 
			dolHomepage.faqNavButton.click();
			break;
		case "About": 
			dolHomepage.aboutNavButton.click();
			break;
		case "Press": 
			dolHomepage.pressNavButton.click();
			break;
		case "Contact": 
			dolHomepage.contactNavButton.click();
			break;	
			
		//Sub nav - Topics
		case "Breaks and Meal Periods": 
			dolHomepage.clickSubNavButtons(dolHomepage.topicsNavButton, dolHomepage.breaksAndMealPeriodsSubNavButton);
			break;	
			
		case "Cobra": 
			dolHomepage.clickSubNavButtons(dolHomepage.topicsNavButton, dolHomepage.cobraSubNavButton);
			break;	
			
			
			
		default:
			System.err.println("INVALID BUTTON CLICKED");
			break;
    	}	
    }
    
    @Step
	public void shouldSeePage(String expectedPageName) {
		
		
		switch(expectedPageName) {
		//case "welcome to benefits.gov":
		
		case "Topics": 
		case "Forms":
			Assert.assertEquals(expectedPageName, dolHomepage.pullPageTitle());
			break;
		case "Agencies":
			Assert.assertEquals("Agencies & Programs", dolHomepage.pullPageTitle());
			break;
		case "About":
			Assert.assertEquals("Who We Are & What We Do", dolHomepage.pullPageTitle());
			break;
		case "Press":			
			Assert.assertEquals("Newsroom", dolHomepage.pullPageTitle());
			break;
		case "Contact":
			Assert.assertEquals("Contacting the Department of Labor", dolHomepage.pullPageTitle());
			break;
		case "FAQ":
			break;
			
		default:
			System.err.println("INVALID PAGE SENT");
			break;
		} 
	}

}