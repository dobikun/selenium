package selenium.applogic;

import org.openqa.selenium.WebDriver;

import selenium.pages.Helper;
import selenium.util.*;
import selenium.webdriver.WebDriverFactory;


public class ApplicationManager {
	
	  private UserHelper userHelper;
	  private NavigationHelper instanceNavHelper;
	  private PostHelper postHelper;
	  private Helper helper;

	  private WebDriver driver;
	  private String baseUrl;
	  
	  public ApplicationManager(){
		  
		  baseUrl = PropertyLoader.loadProperty("site.url");
		  
		  Browser browser = new Browser();
		  browser.setName(PropertyLoader.loadProperty("browser.name"));
	 
		  driver = WebDriverFactory.getInstance(browser);
		  
		  if(instanceNavHelper == null){
			  instanceNavHelper  = new NavigationHelper(this);
		  }
		  userHelper = new UserHelper(this);
		  postHelper = new PostHelper(this);
		  helper     = new Helper(driver);
		  
		  getNavigationHelper().openMainPage();
	  }
	 
	  public UserHelper getUserHelper() {
	    return userHelper;
	  }
	  
	  public PostHelper getPostHelper() {
		    return postHelper;
	  }
	  
	  public Helper getHelper() {
		    return helper;
	  }
	
	  public NavigationHelper getNavigationHelper() {
	    return instanceNavHelper;
	  }

	  protected WebDriver getWebDriver() {
	    return driver;
	  }

	  protected String getBaseUrl() {
	    return baseUrl;
	  }

}
