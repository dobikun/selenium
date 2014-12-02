package page;

import org.junit.*;

import selenium.applogic.ApplicationManager;
import selenium.model.User;

public class TestBase {
	
	protected ApplicationManager app;
	public User user;
	
	@Before
	public void init() {
		user = new User().setLogin("admin").setPassword("demo123");
		app  = new ApplicationManager();
	}
	
	@After
	public void stop() {
	 // app.stop();
	}
}
