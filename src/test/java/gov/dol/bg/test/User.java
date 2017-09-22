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
	    	dolHomepage.rssNavButton.click();
	    	break;
    	
	    	
	    case "Disclaimer":
	    	dolHomepage.disclaimerNavButton.click();
	    		break;
	    		
	    case "NFA":
	    	dolHomepage.nfaNavButton.click();
	    		break;

	    case "PSS":
	    	dolHomepage.pssNavButton.click();
	    		break;

	    case "FOIA":
	    	dolHomepage.foiaNavButton.click();
	    		break;
	    		
	    case "TTY":
	    	dolHomepage.ttyNavButton.click();
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
	    case "MISSION":    	    	
	    	ILABHomepage.clickSubNavButtons(ILABHomepage.aboutUsNavButton, ILABHomepage.missionSubNavButton);
	    	break;

	    case "LAWSANDREGS":
	    	ILABHomepage.clickSubNavButtons(ILABHomepage.aboutUsNavButton, ILABHomepage.lawsAndRegsSubNavButton);
	    	break;
	    case "JOIN":
	    	ILABHomepage.clickSubNavButtons(ILABHomepage.aboutUsNavButton, ILABHomepage.joinSubNavButton);
	    	break;
	    
	    //Our Work
	    case "CLABOR":
	    	ILABHomepage.clickSubNavButtons(ILABHomepage.ourWorkNavButton, ILABHomepage.claborSubNavButton);
	    	break;
	    
	    case "PROJECTS":
	    	ILABHomepage.clickSubNavButtons(ILABHomepage.ourWorkNavButton, ILABHomepage.projectsSubNavButton);
	    	break;
	    
	    //Resources
	    case "REPORTS":
	    	ILABHomepage.clickSubSubNavButtons(ILABHomepage.resourcesNavButton, ILABHomepage.reportsSubNavButton, ILABHomepage.reportsSubSubNavButton);
	    	break;
	    
	    case "GRANTS":
	    	ILABHomepage.clickSubNavButtons(ILABHomepage.resourcesNavButton, ILABHomepage.grantsSubNavButton);
	    	break;
	    	
	    //ILAB in Action
	    case "NEWS":
	    	ILABHomepage.clickSubNavButtons(ILABHomepage.actionNavButton , ILABHomepage.actionNewsSubNavButton);
	    	break;
	    
	    case "OURVOICES":
	    	ILABHomepage.clickSubNavButtons(ILABHomepage.actionNavButton, ILABHomepage.rightsvoicesSubNavButton);
	    	break;	    	
	    
	    //EBSA Homepage	
	    //*******************************************************************************************//
	    	
	    //Home and ASK
	    	
	    case "ASK":
	    	ebsaHomepage.askNavButton.click();
	    	break;
	    case "HOME":
	    	ebsaHomepage.homeNavButton.click();
	    	break;
	    	
	    //About EBSA
	    case "ENFORCEMENT":
	    	ebsaHomepage.clickSubSubSubNavButtons(ebsaHomepage.aboutNavButton, ebsaHomepage.activitiesSubNavButton, ebsaHomepage.newsroomSubSubNavButton, ebsaHomepage.enforcementSubSubSubNavButton);
	    	break;
	    	
	    case "ORGANIZATION":
	    	ebsaHomepage.clickSubSubNavButtons(ebsaHomepage.aboutNavButton, ebsaHomepage.aboutUsSubNavButton, ebsaHomepage.organizationSubSubNavButton);
	    	break;
	    
	    //Workers & Families
	    case "DISASTER":
	    	ebsaHomepage.clickSubNavButtons(ebsaHomepage.workersNavButton, ebsaHomepage.disasterSubNavButton);
	    	break;
	    
	    case "DIVORCE":
	    	ebsaHomepage.clickSubNavButtons(ebsaHomepage.workersNavButton, ebsaHomepage.divorceSubNavButton);
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
	    	
	    case "fedRegister":
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
			Assert.assertEquals("Equal Employment Opportunity Data Posted Pursuant to the No Fear Act", dolHomepage.pullPageTitle());
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
		case "MISSION":
			Assert.assertEquals("Mission & Offices", ILABHomepage.pullPageTitle());
			break;
			
		case "LAWSANDREGS":
			Assert.assertEquals("Laws and Regulations", ILABHomepage.pullPageTitle());
			break;				
			
		case "JOIN":
			Assert.assertEquals("Join the Team", ILABHomepage.pullPageTitle());
			break;
			
		
		//Our Work
		case "CLABOR":
			Assert.assertEquals("Child Labor, Forced Labor & Human Trafficking", ILABHomepage.pullPageTitle());
			break;
				
		case "PROJECTS":
			Assert.assertEquals("Projects", ILABHomepage.pullPageTitle());
			break;
		
		//Resources
		case "REPORTS":
			Assert.assertEquals("Reports & Publications", ILABHomepage.pullPageTitle());
			break;	
			
		case "GRANTS":
			Assert.assertEquals("Grants & Contracts", ILABHomepage.pullPageTitle());
			break;			
		
		//In Action
		case "NEWS":
			Assert.assertEquals("News Releases", ILABHomepage.pullPageTitle());
			break;
			
		case "OURVOICES":
			Assert.assertEquals("Our Rights, Our Voices", ILABHomepage.pullPageTitle());
			break;
			
			
			
		//EBSA Homepage	
		//***********************************************************************************//	
			
		//Home and ASK
	    	
	    case "ASK":
	    	Assert.assertEquals("Ask EBSA", ebsaHomepage.pullPageTitle());
	    	break;
	    case "HOME":
	    	Assert.assertEquals("", ebsaHomepage.pullPageTitle());
	    	break;
	    	
	    //About EBSA
	    case "ENFORCEMENT":
	    	Assert.assertEquals("Joint Enforcement News Releases", ebsaHomepage.pullPageTitle());	    	
	    	break;
	    	
	    case "ORGANIZATION":
	    	Assert.assertEquals("Organization Chart", ebsaHomepage.pullPageTitle());	    	
	    	break;
	    //Workers & Families
	    case "DISASTER":
	    	Assert.assertEquals("Disaster Relief", ebsaHomepage.pullPageTitle());
	    	break;
	    
	    case "DIVORCE":
	    	Assert.assertEquals("Separation & Divorce", ebsaHomepage.pullPageTitle());
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
	    	
	    case "fedRegister":
	    	Assert.assertEquals("Rules & Regulations", ebsaHomepage.pullPageTitle());	    	
	    	break;	    
	    
	    			
			
		default:
			System.err.println("INVALID PAGE SENT");
			break;
			

			
			
		} 
		
		
		
		
	}

}