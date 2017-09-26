package gov.dol.bg.test.pages;




import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;


import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

import net.thucydides.core.pages.PageObject;

@DefaultUrl("http://www.dol.gov/agencies/ilab")
public class ILABHomepage extends PageObject {
    
	private String env = System.getProperty("environment");
	public String defaultUrl = "http://" + env + ".dol.gov/agencies/ilab";
	
	public ILABHomepage(WebDriver driver) {
		super(driver);
		driver.manage().window().maximize();

		//this.setImplicitTimeout(10, TimeUnit.SECONDS);
		
	}
	
	public void clearCookies() {
		this.getDriver().manage().deleteAllCookies();
	}
	
	//********************************************************************************
	
	//Nav	
	

	
	@FindBy(xpath = "//*[@id='cd-primary-nav-secondary-desktop']/li[2]/a")
	public WebElementFacade aboutUsNavButton;
	
	@FindBy(xpath = "//*[@id='cd-primary-nav-secondary-desktop']/li[3]/a")
	public WebElementFacade ourWorkNavButton;
	
	@FindBy(xpath = "//*[@id='cd-primary-nav-secondary-desktop']/li[4]/a")
	public WebElementFacade resourcesNavButton;
	
	@FindBy(xpath = "//*[@id='cd-primary-nav-secondary-desktop']/li[5]/a")
	public WebElementFacade actionNavButton;	
	
	
	
	//sub Nav
	
	
	//About Us
	@FindBy(xpath = "//*[@id='cd-primary-nav-secondary-desktop']/li[2]/ul/li[3]/ul/li/a")
    public WebElementFacade missionSubNavButton;
		
	
	@FindBy(xpath = "//*[@id='cd-primary-nav-secondary-desktop']/li[2]/ul/li[5]/ul/li/a")
    public WebElementFacade lawsAndRegsSubNavButton;	
	
	@FindBy(xpath = "//*[@id='cd-primary-nav-secondary-desktop']/li[2]/ul/li[6]/ul/li/a")
    public WebElementFacade joinSubNavButton;	
	
	
	//Our Work 

	@FindBy(xpath = "//*[@id='cd-primary-nav-secondary-desktop']/li[3]/ul/li[3]/ul/li[1]/a")
    public WebElementFacade claborSubNavButton;	
	
	@FindBy(xpath = "//*[@id='cd-primary-nav-secondary-desktop']/li[3]/ul/li[3]/ul/li[1]/ul/li[1]/a")
    public WebElementFacade claborSubSubNavButton;	
	
	@FindBy(xpath = "//*[@id='cd-primary-nav-secondary-desktop']/li[3]/ul/li[5]/ul/li[2]/a")
    public WebElementFacade projectsSubNavButton;	
	
	//Resources
	
	@FindBy(xpath = "//*[@id='cd-primary-nav-secondary-desktop']/li[4]/ul/li[4]/ul/li/a")
    public WebElementFacade reportsSubNavButton;	
	
	@FindBy(xpath = "//*[@id='cd-primary-nav-secondary-desktop']/li[4]/ul/li[4]/ul/li/ul/li[1]/a")
    public WebElementFacade reportsSubSubNavButton;	
		
	
	@FindBy(xpath = "//*[@id='cd-primary-nav-secondary-desktop']/li[4]/ul/li[3]/ul/li/a")
    public WebElementFacade grantsSubNavButton;		

	//Ilab in action
	
	@FindBy(xpath = "//*[@id='cd-primary-nav-secondary-desktop']/li[5]/ul/li[3]/ul/li/a")
    public WebElementFacade actionNewsSubNavButton;	
	
	@FindBy(xpath = "//*[@id='cd-primary-nav-secondary-desktop']/li[5]/ul/li[5]/ul/li/a")
    public WebElementFacade rightsvoicesSubNavButton;	
	
	
	
	 // ***********************************************************************************
    // Functions

	   public String pullPageTitle() {
	    	
//	      System.out.println("Waiting for page title to load");
//	      WebDriverWait wait = new WebDriverWait(getDriver(), 10);
//	      wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[@class='page-title'] | //*[contains(@class,'large')]/h2 | //*[@class='page-header'])")));
//	      
//	      String windowUrl = getDriver().getCurrentUrl();
//	      System.out.println("current window url is: " + windowUrl);

	     WebElement pageTitle = getDriver().findElement(By.xpath("(//*[@class='page-title'] | //*[@id='content']/div[2]/h1 | "
	     		+ "//*[@id='rightColumn']/h1)"));
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
	
	
	
	
	
	
	
	
	
	
}