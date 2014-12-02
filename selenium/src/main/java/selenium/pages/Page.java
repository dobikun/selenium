package selenium.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public abstract class Page {
	protected WebDriver driver;
	protected WebDriverWait wait;
	protected PageManager pages;
	
	public Page(PageManager pages) {
		this.pages = pages;
	    driver = pages.getWebDriver();
	    wait= new WebDriverWait(driver, 10); 
	}
	
	public WebDriver getWebDriver() {
		return driver;
	}

	public String getTitle() {
		return driver.getTitle();
	}
}
