package selenium;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class LogoutTest extends page.TestBase{
	
	  @Before
	  public void before() {
		  app.getUserHelper().loginAs(user);
		  app.getUserHelper().logout();
	  }
	  
	  @Test
	  public void testLogout() {
	    assertTrue("The Logout is faild!", app.getUserHelper().isLoggedOut());
	  }
}
