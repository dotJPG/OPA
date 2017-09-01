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
	                 
	@FindBy(xpath = "//*[@id=/'topicsMenu']/div/div[1]/div/div/div/div/ul/li[2]/div/span/a")
	public WebElementFacade cobraSubNavButton;
	
	
    

	
    // ***********************************************************************************
    // Functions
    
    public String pullPageTitle() {
    	
    	System.out.println("Waiting for page title to load");
        WebDriverWait wait = new WebDriverWait(getDriver(), 20);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='page-title']")));
        
        String windowUrl = getDriver().getCurrentUrl();
        System.out.println("current window url is: " + windowUrl);

    	WebElement pageTitle = getDriver().findElement(By.xpath("//*[@class='page-title']"));
		return pageTitle.getText();
	}
    
    
    public void clickSubNavButtons(WebElementFacade nav, WebElementFacade subNav) {
        Actions action = new Actions(getDriver());
        action.moveToElement(nav).pause(1000).moveToElement(subNav).click().build().perform();
    }
    
    
    
    public void pause(long time) {
		try {
			Thread.sleep(time);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}