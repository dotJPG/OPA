package gov.dol.bg.test.pages;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

import net.thucydides.core.pages.PageObject;

@DefaultUrl("http://www.dol.gov")
public class DOLHomepage extends PageObject {
    
	private String env = System.getProperty("environment");
	public String defaultUrl = "http://" + env + ".dol.gov";
	
	public DOLHomepage(WebDriver driver) {
		super(driver);
		driver.manage().window().maximize();

		//this.setImplicitTimeout(10, TimeUnit.SECONDS);
		
	}
	
	public void clearCookies() {
		this.getDriver().manage().deleteAllCookies();
	}
	
	//********************************************************************************
	
	//main nav
	@FindBy(xpath = "//*[@id='topicsMenu']/a")
    public WebElementFacade topicsNavButton;
	
	@FindBy(xpath = "//*[@id='agenciesMenu']/a")
	public WebElementFacade agenciesNavButton;
	
	@FindBy(xpath = "//*[@id='formsMenu']/a")
	public WebElementFacade formsNavButton;
	
	@FindBy(xpath = "//*[@id='faqMenu']/a")
	public WebElementFacade faqNavButton;
	
	@FindBy(xpath = "//*[@id='aboutMenu']/a")
	public WebElementFacade aboutNavButton;
	
	@FindBy(xpath = "//*[@id='pressMenu']/a")
	public WebElementFacade pressNavButton;
	
	@FindBy(xpath = "//*[@id='contactMenu']/a")
	public WebElementFacade contactNavButton;
	

	
	
	//sub nav - Topics
    
	@FindBy(xpath = "//*[@id='topicsMenu']/div/div[1]/div/div/div/div/ul/li[1]/div/span/a")
	public WebElementFacade breaksAndMealPeriodsSubNavButton;
	                 
	@FindBy(xpath = "//*[@id='topicsMenu']/div/div[1]/div/div/div/div/ul/li[2]/div/span/a")
	public WebElementFacade cobraSubNavButton;
	
	@FindBy(xpath = "//*[@id='cd-primary-nav-secondary-desktop']/li[7]/a")
	public WebElementFacade disabilitySubNavButton;
	
	@FindBy(xpath = "//*[@id='cd-primary-nav-secondary-desktop']/li[20]/a")
	public WebElementFacade retirementSubNavButton;
	
	//sub nav - Agencies 
	
	@FindBy(xpath = "(//*[@id='cd-primary-nav-secondary-desktop']/li[4]/a)[2]")
	public WebElementFacade ilabSubNavButton;
	
	@FindBy(xpath = "(//*[@id='cd-primary-nav-secondary-desktop']/li[8]/a)[2]")
	public WebElementFacade ebsaSubNavButton;
	
	//sub nav - Press
    
	@FindBy(xpath = "(//*[@id='cd-primary-nav-secondary-desktop']/li[1]/a)[4]")
	public WebElementFacade newsroomSubNavButton;
		
	@FindBy(xpath = "(//*[@id='cd-primary-nav-secondary-desktop']/li[2]/a)[4]")
	public WebElementFacade newsreleaseSubNavButton;
		
	@FindBy(xpath = "(//*[@id='cd-primary-nav-secondary-desktop']/li[4]/a)[4]")
	public WebElementFacade newsletterPlansSubNavButton;	
	
	
	//nav Footer

	@FindBy(xpath = "//*[@id='site-canvas']/footer/div[2]/div[4]/ul/li[6]/a")
	public WebElementFacade rssNavButton;

	@FindBy(xpath = "//*[@id='site-canvas']/footer/div[2]/div[4]/ul/li[3]/a")
	public WebElementFacade disclaimerNavButton;
		
	@FindBy(xpath = "//*[@id='site-canvas']/footer/div[2]/div[2]/ul/li[7]/a")
	public WebElementFacade nfaNavButton;	

	@FindBy(xpath = "//*[@id='site-canvas']/footer/div[2]/div[4]/ul/li[2]/a")
	public WebElementFacade pssNavButton;	
	
	@FindBy(xpath = "//*[@id='site-canvas']/footer/div[2]/div[4]/ul/li[1]/a")
	public WebElementFacade foiaNavButton;		
	
	@FindBy(xpath = "//*[@id='site-canvas']/footer/div[2]/div[1]/p/a[3]")
	public WebElementFacade ttyNavButton;
	
	//nav Blog
	@FindBy(xpath = "//*[@id='homepage-blog']/a")
	public WebElementFacade blogNavButton;	
	
	//nav Social Media

	@FindBy(xpath = "//*[@id='site-canvas']/div[4]/div/div[2]/div[2]/div/a[1]/span")
	public WebElementFacade twitterNavButton;

	@FindBy(xpath = "//*[@id='site-canvas']/div[4]/div/div[2]/div[2]/div/a[2]/span")
	public WebElementFacade facebookNavButton;

	@FindBy(xpath = "//*[@id='site-canvas']/div[4]/div/div[2]/div[2]/div/a[3]/span")
	public WebElementFacade linkedInNavButton;	
	
	@FindBy(xpath = "//*[@id='site-canvas']/div[4]/div/div[2]/div[2]/div/a[4]/span")
	public WebElementFacade youtubeNavButton;	

	@FindBy(xpath = "//*[@id='site-canvas']/div[4]/div/div[2]/div[2]/div/a[5]/span")
	public WebElementFacade emailNavButton;	
	
	
	
    // ***********************************************************************************
    // Functions
    
    public String pullPageTitle() {
    	
//      System.out.println("Waiting for page title to load");
//      WebDriverWait wait = new WebDriverWait(getDriver(), 10);
//      wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[@class='page-title'] | //*[contains(@class,'large')]/h2 | //*[@class='page-header'])")));
//      
//      String windowUrl = getDriver().getCurrentUrl();
//      System.out.println("current window url is: " + windowUrl);

     WebElement pageTitle = getDriver().findElement(By.xpath("(//*[@class='page-title'] |"
     		+ " //*[contains(@class,'large')]/h2 | //*[@class='page-header'] |"
     		+ " //*[@class='blog-connect-heading'] | //*[@id='content']/h2)"));
      return pageTitle.getText();
	}
    
    public String verifySocialMedia(){	
    	
    WebElement pageTitle = getDriver().findElement(By.xpath("(//*[@class='ProfileHeaderCard-nameLink u-textInheritColor js-nav'] | "
     		+ " //*[@id='seo_h1_tag']/div/div/span/div/span[1]/a |"
     		+ "//*[@id='stream-about-section']/div[2]/div[2]/ul/li[1]/h4 |"
     		+ "//*[@id='channel-title'] |"
     		+ "//*[@id='quick_subscribe_new']/h1)"));
      return pageTitle.getText();		
    }
    
    public String verifyMailingList(){
    	WebDriver driver = getDriver();
    	for (String winHandle : driver.getWindowHandles()){
    		driver.switchTo().window(winHandle);
    		
    	}
    	WebElement pageTitle = driver.findElement(By.xpath("//*[@id='quick_subscribe_new']/h1"));
    		
    	return pageTitle.getText();
    		
    }
    
    
    public void clickSubNavButtons(WebElementFacade nav, WebElementFacade subNav) {
        Actions action = new Actions(getDriver());
        action.moveToElement(nav).pause(1000).moveToElement(subNav).click().build().perform();
    }
    
    
    public void clickSocialMedia(){
    	WebElement newPage = getDriver().findElement(By.xpath("//*[@id='block-system-main']/div/div/div[2]/div/div/a"));
    	newPage.click();
    	
    	
    }
    
    public void fbLogin(){
    	WebElement un = getDriver().findElement(By.xpath("//*[@id='email']"));
    	un.sendKeys("dolautotest@gmail.com");
    	WebElement pw = getDriver().findElement(By.xpath("//*[@id='pass']"));
    	pw.sendKeys("Password123456");
    	pw.submit();
    	WebDriver driver = getDriver();
    	driver.navigate().back();
    }	
    
    
    
    
    
    
    
    public void pause(long time) {
		try {
			Thread.sleep(time);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}