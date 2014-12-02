package selenium.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class PageManager {
	
	private WebDriver driver; 
	public LoginPage loginPage;
	public InternalPage internalPage;
	public UsersPage usersPage;
	public PostsPage postsPage;
	
	public PageManager(WebDriver driver) {
	    this.driver = driver;
	    loginPage = initElements(new LoginPage(this));
	    internalPage = initElements(new InternalPage(this));
	    usersPage = initElements(new UsersPage(this));
	    postsPage = initElements(new PostsPage(this));
	}
	
	private <T extends Page> T initElements(T page) {
	    PageFactory.initElements(new AjaxElementLocatorFactory(driver, 5), page);
	    return page;
	}

	public WebDriver getWebDriver() {
		return driver;
	}
}
