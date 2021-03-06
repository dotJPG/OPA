package gov.dol.bg.test;

import net.thucydides.core.annotations.Step;
import org.junit.Assert;

import gov.dol.bg.test.pages.DOLHomepage;
import gov.dol.bg.test.pages.ILABHomepage;
import gov.dol.bg.test.pages.EBSAHomepage;
public class User {

	DOLHomepage dolHomepage;
	ILABHomepage ILABHomepage;
	EBSAHomepage ebsaHomepage;

    @Step
    public void onHomePage() {
    	dolHomepage.open();
    }
    
    @Step void onILABPage(){
    	ILABHomepage.open();
    }
    
    @Step void onEBSAPage(){
    	ebsaHomepage.open();
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
    	
    	
    	
    	//DOL HOMEPAGE
	    //********************************************************************************//	

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
			
		case "COBRA": 
			dolHomepage.clickSubNavButtons(dolHomepage.topicsNavButton, dolHomepage.cobraSubNavButton);
			break;	
		
		case "Disability Resources":
			dolHomepage.clickSubNavButtons(dolHomepage.topicsNavButton, dolHomepage.disabilitySubNavButton);
			break;
		
		case "Retirement Plans":
			dolHomepage.clickSubNavButtons(dolHomepage.topicsNavButton,  dolHomepage.retirementSubNavButton);
			break;
			
		//Sub nav - Agencies	
			
		case "ILAB":
			dolHomepage.clickSubNavButtons(dolHomepage.agenciesNavButton, dolHomepage.ilabSubNavButton);
			break;
			
		case "EBSA":
			dolHomepage.clickSubNavButtons(dolHomepage.agenciesNavButton, dolHomepage.ebsaSubNavButton);
			break;		
			
	    	//Sub nav - Press
    		
	   	case "Newsroom": 
	   		dolHomepage.clickSubNavButtons(dolHomepage.pressNavButton, dolHomepage.newsroomSubNavButton);
	   		break;	
	    			
	   	case "News Release": 
	   		dolHomepage.clickSubNavButtons(dolHomepage.pressNavButton, dolHomepage.newsreleaseSubNavButton);
    		break;	
	    		
	    case "News Letter": 
	   		dolHomepage.clickSubNavButtons(dolHomepage.pressNavButton, dolHomepage.newsletterPlansSubNavButton);
	   		break;	
	   		
	   		
	   	//Nav - Footer
	   		
	   		
	    case "RSS":
	    		
	    	dolHomepage.clickFooterNavButtons(dolHomepage.rssNavButton);
	    	break;
    	
	    	
	    case "Disclaimer":
	    	dolHomepage.clickFooterNavButtons(dolHomepage.disclaimerNavButton);
	    	break;
	    		
	    case "NFA":
	    	dolHomepage.clickFooterNavButtons(dolHomepage.nfaNavButton);
	    	break;

	    case "PSS":
	    	dolHomepage.clickFooterNavButtons(dolHomepage.pssNavButton);
	    	break;

	    case "FOIA":
	    	dolHomepage.clickFooterNavButtons(dolHomepage.foiaNavButton);
	    	break;
	    		
	    case "TTY":
	    	dolHomepage.clickFooterNavButtons(dolHomepage.ttyNavButton);
	    	break;
	    		
	    case "BLOG":
	    	dolHomepage.blogNavButton.click();
	    	break;
	    	
	    //Nav Social Media
	    case "Twitter":
	    	dolHomepage.twitterNavButton.click();
	    	dolHomepage.clickSocialMedia();
	    	break;
	    
	    case "Facebook":
	    	dolHomepage.facebookNavButton.click();
	    	dolHomepage.clickSocialMedia();
	    	dolHomepage.fbLogin();
	    	break;
	    	
	    case "LinkedIn":
	    	dolHomepage.linkedInNavButton.click();
	    	dolHomepage.clickSocialMedia();
	    	break;
	    
	    case "YouTube":
	    	dolHomepage.youtubeNavButton.click();
	    	dolHomepage.clickSocialMedia();
			break;
			
		
	    case "Email":
	    	dolHomepage.emailNavButton.click();
	    	break;
	    	
	    	
	    //Ilab Homepage	
	    //********************************************************************************//
			
	    //About Us
	    case "missionAndOffices":    	    	
	    	ILABHomepage.clickSubNavButtons(ILABHomepage.aboutUsNavButton, ILABHomepage.missionSubNavButton);
	    	break;

	    case "lawsAndRegulations":
	    	ILABHomepage.clickSubNavButtons(ILABHomepage.aboutUsNavButton, ILABHomepage.lawsAndRegsSubNavButton);
	    	break;
	    case "joinTheTeam":
	    	ILABHomepage.clickSubNavButtons(ILABHomepage.aboutUsNavButton, ILABHomepage.joinSubNavButton);
	    	break;
	    
	    //Our Work
	    case "childLabor":
	    	ILABHomepage.clickSubNavButtons(ILABHomepage.ourWorkNavButton, ILABHomepage.claborSubNavButton);
	    	break;
	    
	    case "projects":
	    	ILABHomepage.clickSubNavButtons(ILABHomepage.ourWorkNavButton, ILABHomepage.projectsSubNavButton);
	    	break;
	    
	    //Resources
	    case "reportsAndPublications":
	    	ILABHomepage.clickSubSubNavButtons(ILABHomepage.resourcesNavButton, ILABHomepage.reportsSubNavButton, ILABHomepage.reportsSubSubNavButton);
	    	break;
	    
	    case "grantsAndContracts":
	    	ILABHomepage.clickSubNavButtons(ILABHomepage.resourcesNavButton, ILABHomepage.grantsSubNavButton);
	    	break;
	    	
	    //ILAB in Action
	    case "newsReleases":
	    	ILABHomepage.clickSubNavButtons(ILABHomepage.actionNavButton , ILABHomepage.actionNewsSubNavButton);
	    	break;
	    
	    case "ourRightsOurVoices":
	    	ILABHomepage.clickSubNavButtons(ILABHomepage.actionNavButton, ILABHomepage.rightsvoicesSubNavButton);
	    	break;	    	
	    
	    //EBSA Homepage	
	    //*******************************************************************************************//
	    	
	    //Home and ASK
	    	
	    case "askEBSA":
	    	ebsaHomepage.askNavButton.click();
	    	break;
	    case "ebsaHomepage":
	    	ebsaHomepage.homeNavButton.click();
	    	break;
	    	
	    //About EBSA
	    case "enforcement":
	    	ebsaHomepage.clickSubSubSubNavButtons(ebsaHomepage.aboutNavButton, ebsaHomepage.activitiesSubNavButton, ebsaHomepage.newsroomSubSubNavButton, ebsaHomepage.enforcementSubSubSubNavButton);
	    	break;
	    	
	    case "ourOrganization":
	    	ebsaHomepage.clickSubSubNavButtons(ebsaHomepage.aboutNavButton, ebsaHomepage.aboutUsSubNavButton, ebsaHomepage.organizationSubSubNavButton);
	    	break;
	    
	    //Workers & Families
	    case "disasterRelief":
	    	ebsaHomepage.clickSubNavButtons(ebsaHomepage.workersNavButton, ebsaHomepage.disasterSubNavButton);
	    	break;
	    
	    case "separationAndDivorce":
	    	ebsaHomepage.clickSubNavButtons(ebsaHomepage.workersNavButton, ebsaHomepage.divorceSubNavButton);
	    	break;
	    	
		    
	    //Employers & Advisors
	    case "abandonedPlans":
	    	ebsaHomepage.clickSubSubNavButtons(ebsaHomepage.employersNavButton, ebsaHomepage.planSubNavButton, ebsaHomepage.abandonedplansSubSubNavButton);
	    	break;
	    
	    case "reportingGuidelines":
	    	ebsaHomepage.clickSubSubSubNavButtons(ebsaHomepage.employersNavButton, ebsaHomepage.smallbusinessSubNavButton, ebsaHomepage.complianceSubSubNavButton, ebsaHomepage.reportingSubSubSubNavButton);
	    	break;	    	
	    	
	    //Researchers
	    case "retirementResources":
	    	ebsaHomepage.clickSubSubNavButtons(ebsaHomepage.researchersNavButton, ebsaHomepage.analysisSubNavButton,ebsaHomepage.fundedRetirementSubSubNavButton);
	    	break;
	    
	    case "pensionPlan":
	    	ebsaHomepage.clickSubSubSubNavButtons(ebsaHomepage.researchersNavButton, ebsaHomepage.statisticsSubNavButton, ebsaHomepage.retirementBulletinSubSubNavButton, ebsaHomepage.pensionSubSubSubNavButton);
	    	break;	
	    	
	    //Key Topics
	    case "ACA":
	    	ebsaHomepage.clickSubSubNavButtons(ebsaHomepage.topicsNavButton , ebsaHomepage.healthSubNavButton, ebsaHomepage.acaSubSubNavButton);
	    	break;
	    
	    case "401k":
	    	ebsaHomepage.clickSubSubNavButtons(ebsaHomepage.topicsNavButton, ebsaHomepage.retirementSubNavButton, ebsaHomepage._401kSubSubNavButton);
	    	break;	
	    
	    //Laws & Regulations 
	    case "HIPAA":
	    	ebsaHomepage.clickSubSubNavButtons(ebsaHomepage.lawsNavButton, ebsaHomepage.lawsSubNavButton, ebsaHomepage.hippaSubSubNavButton);
	    	break;
	    	
	    case "federalRegister":
	    	ebsaHomepage.clickSubSubNavButtons(ebsaHomepage.lawsNavButton, ebsaHomepage.rulesSubNavButton, ebsaHomepage.fedRegisterSubSubNavButton);
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
			Assert.assertEquals("Topics", dolHomepage.pullPageTitle());
			break;
		case "Forms":
			Assert.assertEquals("Forms", dolHomepage.pullPageTitle());
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
			
		// sub Nav topics
		case "Breaks and Meal Periods":
			Assert.assertEquals("Breaks and Meal Periods", dolHomepage.pullPageTitle());
			break;

		case "COBRA":
			Assert.assertEquals("Health Plans & Benefits: Continuation of Health Coverage - COBRA", dolHomepage.pullPageTitle());
			break;

		case "Disability Resources":
			Assert.assertEquals("Disability Resources", dolHomepage.pullPageTitle());
			break;			
			
		case "Retirement Plans":
			Assert.assertEquals("Retirement Plans-Benefits & Savings", dolHomepage.pullPageTitle());
			break;	
			
		//sub Nav Agencies 	
			
		case "ILAB":
			Assert.assertEquals("Bureau Of International Labor Affairs", dolHomepage.pullPageTitle());
			break;
			
		case "EBSA":
			Assert.assertEquals("Employee Benefits Security Administration", dolHomepage.pullPageTitle());
			break;			
		
		//case subNav Press
		case "Newsroom":
			Assert.assertEquals("Newsroom", dolHomepage.pullPageTitle());
			break;
		case "News Release":
			Assert.assertEquals("News Releases", dolHomepage.pullPageTitle());
			break;
		case "News Letter":
			Assert.assertEquals("DOL Newsletter", dolHomepage.pullPageTitle());
			break;			
		
		//case Nav Footer

		case "RSS":
			Assert.assertEquals("Rss Landing Page", dolHomepage.pullPageTitle());
			break;
		case "Disclaimer":
			Assert.assertEquals("General Disclaimer", dolHomepage.pullPageTitle());
			break;			
			
		case "NFA":
			Assert.assertEquals("Overview of the American Recovery and Reinvestment Act of 2009 (Recovery Act)", dolHomepage.pullPageTitle());
			break;			

		case "PSS":
			Assert.assertEquals("Privacy and Security Statement", dolHomepage.pullPageTitle());
			break;	
			
		case "FOIA":
			Assert.assertEquals("Freedom of Information Act (FOIA)", dolHomepage.pullPageTitle());
			break;	
		
		case "TTY":
			Assert.assertEquals("Contact Us — National Contact Center", dolHomepage.pullPageTitle());
			break;	
						
			
			
		//case Nav Blog	
			
		case "BLOG":
			Assert.assertEquals("Featured Post", dolHomepage.pullPageTitle());
			break;
			
			
		//case Social Media
		case "Twitter":
			Assert.assertEquals("US Labor Department", dolHomepage.verifySocialMedia());
			break;
			
		case "Facebook":
			Assert.assertEquals("U.S. Department of Labor", dolHomepage.verifySocialMedia());
			break;		
			
		case "LinkedIn":
			Assert.assertEquals("Website", dolHomepage.verifySocialMedia());
			break;	
			
		case "YouTube":
			Assert.assertEquals("USDepartmentofLabor", dolHomepage.verifySocialMedia());
			break;			
			
		case "Email":
			Assert.assertEquals("Email Updates", dolHomepage.verifyMailingList());
			break;	
			
		//ILABHomepage	
		//*************************************************************************************//
		
		//About Us
		case "missionAndOffices":
			Assert.assertEquals("Mission & Offices", ILABHomepage.pullPageTitle());
			break;
			
		case "lawsAndRegulations":
			Assert.assertEquals("Laws and Regulations", ILABHomepage.pullPageTitle());
			break;				
			
		case "joinTheTeam":
			Assert.assertEquals("Join the Team", ILABHomepage.pullPageTitle());
			break;
			
		
		//Our Work
		case "childLabor":
			Assert.assertEquals("Child Labor, Forced Labor & Human Trafficking", ILABHomepage.pullPageTitle());
			break;
				
		case "projects":
			Assert.assertEquals("Projects", ILABHomepage.pullPageTitle());
			break;
		
		//Resources
		case "reportsAndPublications":
			Assert.assertEquals("Reports & Publications", ILABHomepage.pullPageTitle());
			break;	
			
		case "grantsAndContracts":
			Assert.assertEquals("Grants & Contracts", ILABHomepage.pullPageTitle());
			break;			
		
		//In Action
		case "newsReleases":
			Assert.assertEquals("News Releases", ILABHomepage.pullPageTitle());
			break;
			
		case "ourRightsOurVoices":
			Assert.assertEquals("Our Rights, Our Voices", ILABHomepage.pullPageTitle());
			break;
			
			
			
		//EBSA Homepage	
		//***********************************************************************************//	
			
		//Home and ASK
	    	
	    case "askEBSA":
	    	Assert.assertEquals("Ask EBSA", ebsaHomepage.pullPageTitle());
	    	break;
	    case "ebsaHomepage":
	    	Assert.assertEquals("", ebsaHomepage.pullPageTitle());
	    	break;
	    	
	    //About EBSA
	    case "enforcement":
	    	Assert.assertEquals("Joint Enforcement News Releases", ebsaHomepage.pullPageTitle());	    	
	    	break;
	    	
	    case "ourOrganization":
	    	Assert.assertEquals("Organization Chart", ebsaHomepage.pullPageTitle());	    	
	    	break;
	    
	    	//Workers & Families
	    case "disasterRelief":
	    	Assert.assertEquals("Disaster Relief", ebsaHomepage.pullPageTitle());
	    	break;
	    
	    case "separationAndDivorce":
	    	Assert.assertEquals("Separation & Divorce", ebsaHomepage.pullPageTitle());
	    	break;	
	   
	    //Employers & Advisors
	    case "abandonedPlans":
	    	Assert.assertEquals("Abandoned Plans", ebsaHomepage.pullPageTitle());	    	
	    	break;
	    
	    case "reportingGuidelines":
	    	Assert.assertEquals("Reporting and Filing", ebsaHomepage.pullPageTitle());	    	
	    	break;	    	
	    	
	    	
	    	
	    //Researchers	
	    case "retirementResources":
	    	Assert.assertEquals("Analysis", ebsaHomepage.pullPageTitle());
	    	break;
	    
	    case "pensionPlan":
	    	Assert.assertEquals("Private Pension Plan", ebsaHomepage.pullPageTitle());
	    	break;	
	    
	    //Key Topics
	    case "ACA":
	    	Assert.assertEquals("Affordable Care Act", ebsaHomepage.pullPageTitle());	    	
	    	break;
	    
	    case "401k":
	    	Assert.assertEquals("401(k) Plans", ebsaHomepage.pullPageTitle());	    	
	    	break;	
	    	
	    //Laws & Regulations
	    case "HIPAA":
	    	Assert.assertEquals("Health Insurance Portability and Accountability Act (HIPAA)", ebsaHomepage.pullPageTitle());	    	
	    	break;
	    	
	    case "federalRegister":
	    	Assert.assertEquals("Rules & Regulations", ebsaHomepage.pullPageTitle());	    	
	    	break;	    
	    
	    			
			
		default:
			System.err.println("INVALID PAGE SENT");
			break;
			

			
			
		} 
		
		
		
		
	}

}