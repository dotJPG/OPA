package gov.dol.bg.test.pages;




import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;


import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

import net.thucydides.core.pages.PageObject;

@DefaultUrl("http://www.dol.gov/agencies/ebsa")
public class EBSAHomepage extends PageObject {
    
	private String env = System.getProperty("environment");
	public String defaultUrl = "http://" + env + ".dol.gov/agencies/ebsa";
	
	public EBSAHomepage(WebDriver driver) {
		super(driver);
		driver.manage().window().maximize();

		//this.setImplicitTimeout(10, TimeUnit.SECONDS);
		
	}
	
	public void clearCookies() {
		this.getDriver().manage().deleteAllCookies();
	}
	
	//********************************************************************************
	
	//Nav	
	@FindBy(xpath = "//*[@id='cd-primary-nav-secondary-desktop']/li[1]/a")
	public WebElementFacade homeNavButton;
	
	@FindBy(xpath = "//*[@id='cd-primary-nav-secondary-desktop']/li[2]/a")
	public WebElementFacade askNavButton;
	
	@FindBy(xpath = "//*[@id='cd-primary-nav-secondary-desktop']/li[3]/a")
	public WebElementFacade aboutNavButton;
	
	@FindBy(xpath = "//*[@id='cd-primary-nav-secondary-desktop']/li[4]/a")
	public WebElementFacade workersNavButton;
	
	@FindBy(xpath = "//*[@id='cd-primary-nav-secondary-desktop']/li[5]/a")
	public WebElementFacade employersNavButton;
	
	@FindBy(xpath = "//*[@id='cd-primary-nav-secondary-desktop']/li[6]/a")
	public WebElementFacade researchersNavButton;
	
	@FindBy(xpath = "//*[@id='cd-primary-nav-secondary-desktop']/li[7]/a")
	public WebElementFacade topicsNavButton;
	
	@FindBy(xpath = "//*[@id='cd-primary-nav-secondary-desktop']/li[8]/a")
	public WebElementFacade lawsNavButton;
	
	
	//Sub Nav
	
	//about EBSA
	
	@FindBy(xpath = "//*[@id='cd-primary-nav-secondary-desktop']/li[3]/ul/li[4]/ul/li/a")
	public WebElementFacade activitiesSubNavButton;
	
	@FindBy(xpath = "//*[@id='cd-primary-nav-secondary-desktop']/li[3]/ul/li[4]/ul/li/ul/li[3]/a")
	public WebElementFacade newsroomSubSubNavButton;
		
	@FindBy(xpath = "//*[@id='cd-primary-nav-secondary-desktop']/li[3]/ul/li[4]/ul/li/ul/li[3]/ul/li[4]/a")
	public WebElementFacade enforcementSubSubSubNavButton;

	@FindBy(xpath = "//*[@id='cd-primary-nav-secondary-desktop']/li[3]/ul/li[3]/ul/li/a")
	public WebElementFacade aboutUsSubNavButton;	
	
	@FindBy(xpath = "//*[@id='cd-primary-nav-secondary-desktop']/li[3]/ul/li[3]/ul/li/ul/li[4]/a")
	public WebElementFacade organizationSubSubNavButton;

	//Workers & Families

	@FindBy(xpath = "//*[@id='cd-primary-nav-secondary-desktop']/li[4]/ul/li[5]/ul/li[3]/a")
	public WebElementFacade disasterSubNavButton;

	@FindBy(xpath = "//*[@id='cd-primary-nav-secondary-desktop']/li[4]/ul/li[4]/ul/li[3]/a")
	public WebElementFacade divorceSubNavButton;	
	
	
	
	
	
	//Employers and Advisors
	@FindBy(xpath = "//*[@id='cd-primary-nav-secondary-desktop']/li[5]/ul/li[4]/ul/li/a")
	public WebElementFacade planSubNavButton;

	@FindBy(xpath = "//*[@id='cd-primary-nav-secondary-desktop']/li[5]/ul/li[4]/ul/li/ul/li[3]/a")
	public WebElementFacade abandonedplansSubSubNavButton;

	
	@FindBy(xpath = "//*[@id='cd-primary-nav-secondary-desktop']/li[5]/ul/li[5]/ul/li/a")
	public WebElementFacade smallbusinessSubNavButton;
	
	@FindBy(xpath = "//*[@id='cd-primary-nav-secondary-desktop']/li[5]/ul/li[5]/ul/li/ul/li[4]/a")
	public WebElementFacade complianceSubSubNavButton;

	@FindBy(xpath = "//*[@id='cd-primary-nav-secondary-desktop']/li[5]/ul/li[5]/ul/li/ul/li[4]/ul/li[5]/a")
	public WebElementFacade reportingSubSubSubNavButton;
	
	//Researchers
	
	@FindBy(xpath = "//*[@id='cd-primary-nav-secondary-desktop']/li[6]/ul/li[5]/ul/li/a")
	public WebElementFacade analysisSubNavButton;
	
	@FindBy(xpath = "//*[@id='cd-primary-nav-secondary-desktop']/li[6]/ul/li[5]/ul/li/ul/li[3]/a")
	public WebElementFacade fundedRetirementSubSubNavButton;	
	
	@FindBy(xpath = "//*[@id='cd-primary-nav-secondary-desktop']/li[6]/ul/li[4]/ul/li/a")
	public WebElementFacade statisticsSubNavButton;
	
	@FindBy(xpath = "//*[@id='cd-primary-nav-secondary-desktop']/li[6]/ul/li[4]/ul/li/ul/li[3]/a")
	public WebElementFacade retirementBulletinSubSubNavButton;
	
	@FindBy(xpath = "//*[@id='cd-primary-nav-secondary-desktop']/li[6]/ul/li[4]/ul/li/ul/li[3]/ul/li[3]/a")
	public WebElementFacade pensionSubSubSubNavButton;
	
	//Key Topics 
	@FindBy(xpath = "//*[@id='cd-primary-nav-secondary-desktop']/li[7]/ul/li[3]/ul/li/a")
	public WebElementFacade healthSubNavButton;
	
	@FindBy(xpath = "//*[@id='cd-primary-nav-secondary-desktop']/li[7]/ul/li[3]/ul/li/ul/li[3]/a")
	public WebElementFacade acaSubSubNavButton;
	
	@FindBy(xpath = "//*[@id='cd-primary-nav-secondary-desktop']/li[7]/ul/li[5]/ul/li/a")
	public WebElementFacade retirementSubNavButton;
	
	@FindBy(xpath = "//*[@id='cd-primary-nav-secondary-desktop']/li[7]/ul/li[5]/ul/li/ul/li[3]/a")
	public WebElementFacade _401kSubSubNavButton;
	
	//Laws & Regulations 
	
	@FindBy(xpath = "//*[@id='cd-primary-nav-secondary-desktop']/li[8]/ul/li[3]/ul/li/a")
	public WebElementFacade lawsSubNavButton;
	
	@FindBy(xpath = "//*[@id='cd-primary-nav-secondary-desktop']/li[8]/ul/li[3]/ul/li/ul/li[6]/a")
	public WebElementFacade hippaSubSubNavButton;	
	
	
	@FindBy(xpath = "//*[@id='cd-primary-nav-secondary-desktop']/li[8]/ul/li[4]/ul/li/a")
	public WebElementFacade rulesSubNavButton;
	
	@FindBy(xpath = "//*[@id='cd-primary-nav-secondary-desktop']/li[8]/ul/li[4]/ul/li/ul/li[3]/a")
	public WebElementFacade fedRegisterSubSubNavButton;
	
	
	
	
	
	
	
	 // ***********************************************************************************
    // Functions

	   public String pullPageTitle() {
	    	
//	      System.out.println("Waiting for page title to load");
//	      WebDriverWait wait = new WebDriverWait(getDriver(), 10);
//	      wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[@class='page-title'] | //*[contains(@class,'large')]/h2 | //*[@class='page-header'])")));
//	      
//	      String windowUrl = getDriver().getCurrentUrl();
//	      System.out.println("current window url is: " + windowUrl);

	     WebElement pageTitle = getDriver().findElement(By.xpath("(//*[@class='page-title'])"));
	      return pageTitle.getText();
		}
	
	
	    public void clickSubNavButtons(WebElementFacade nav, WebElementFacade subNav) {
	        Actions action = new Actions(getDriver());
	        action.moveToElement(nav).click().pause(1000).moveToElement(subNav).click().build().perform();
	    }
	    
	    public void clickSubSubNavButtons(WebElementFacade nav, WebElementFacade subNav, WebElementFacade subSubNav){
	    	Actions action = new Actions(getDriver());
	    	action.moveToElement(nav).click().pause(1000).moveToElement(subNav).click().pause(1000).moveToElement(subSubNav).click().build().perform();
	    	
	    }
	
	    public void clickSubSubSubNavButtons(WebElementFacade nav, WebElementFacade subNav, WebElementFacade subSubNav, WebElementFacade subSubSubNav){
	    	Actions action = new Actions(getDriver());
	    	action.moveToElement(nav).click().pause(1000).moveToElement(subNav).click().pause(1000).moveToElement(subSubNav).click().pause(1000).moveToElement(subSubSubNav).click().build().perform();
	    	
	    }	
	
	
	
	
	
	
	
	
}