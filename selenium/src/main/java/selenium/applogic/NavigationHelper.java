package selenium.applogic;

public class NavigationHelper extends DriverBaseHelper {

	 private String baseUrl;
	
	public NavigationHelper(ApplicationManager manager) {
	    super(manager.getWebDriver());
	    this.baseUrl = manager.getBaseUrl();
	}

	public void openMainPage() {
		 driver.get(baseUrl);	
	}

}
