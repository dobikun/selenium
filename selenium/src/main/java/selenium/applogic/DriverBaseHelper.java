package selenium.applogic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import selenium.pages.PageManager;

public class DriverBaseHelper {
	
	 protected WebDriver driver;
	 protected WebDriverWait wait;
	 protected PageManager pages;

	 public DriverBaseHelper(WebDriver driver) {
	    this.driver = driver;
	    wait = new WebDriverWait(driver, 10);
	    pages = new PageManager(driver);
	 }
}
