package selenium.webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;

import selenium.util.Browser;

public class WebDriverFactory {

	public static final String CHROME = "Chrome";
	public static final String FIREFOX = "FireFox";
	public static final String SAFARI = "Safari";
	public static final String INTERNET_EXPLORER = "ie";
	public static final String HTML_UNIT = "htmlunit";

	private static WebDriver webDriver = null;

	public static WebDriver getInstance(Browser browser) {

		if (webDriver != null) {
			return webDriver;
		}

		if (CHROME.equals(browser.getName())) {
			webDriver = new ChromeDriver();

		} else if (FIREFOX.equals(browser.getName())) {
			webDriver = new FirefoxDriver();
			
		} else if (INTERNET_EXPLORER.equals(browser.getName())) {
			webDriver = new InternetExplorerDriver();

		}  else if (SAFARI.equals(browser.getName())) {
			webDriver = new SafariDriver();

		}  else {
				webDriver = new HtmlUnitDriver();
		}
	

		return webDriver;
	}
}
