package gov.benefits.bg.test.steps.serenity;

import gov.benefits.bg.test.pages.BGPage;
import net.thucydides.core.annotations.Step;
import org.junit.Assert;


public class User {

    BGPage bgPage;

    @Step
    public void onHomePage() {
        bgPage.open();
    }
    
    @Step
	public void open_page(String directoryPath) {
		bgPage.clearCookies();
		
		String url = bgPage.defaultUrl + directoryPath;
		if(bgPage.defaultUrl.contains("staging")) {
			url += "?mobile=unL9HuS";
		}
		
		bgPage.openAt(url);
		
		//System.out.print(directoryPath);
	}
    


    
    @Step
    public void clickNavNode(String node) {
    	

    	switch(node) {
		case "Topics": 
			bgPage.clickTopicsNav();
			break;
		case "Agencies": 
			bgPage.clickAgenciesNav();
			break;
		case "Forms": 
			bgPage.clickFormsNav();
			break;
		case "FAQ": 
			bgPage.clickFAQNav();
			break;
		case "About": 
			bgPage.clickAboutNav();
			break;
		case "Press": 
			bgPage.clickPressNav();
			break;
		case "Contact": 
			bgPage.clickContactNav();
			break;	
			
		case "Breaks and Meal Periods": 
			bgPage.clickSubNavButtons(bgPage.topicsNav, bgPage.breaksAndMealPeriodsNav);
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
			Assert.assertEquals(expectedPageName, bgPage.pullPageTitle());
			break;
		case "Agencies":
			Assert.assertEquals("Agencies & Programs", bgPage.pullPageTitle());
			break;
		case "About":
			Assert.assertEquals("Who We Are & What We Do", bgPage.pullPageTitle());
			break;
		case "Press":			
			Assert.assertEquals("Newsroom", bgPage.pullPageTitle());
			break;
		case "Contact":
			Assert.assertEquals("Contacting the Department of Labor", bgPage.pullPageTitle());
			break;
		case "FAQ":
			break;
			
		default:
			System.err.println("INVALID PAGE SENT");
			break;
		} 
	}

}