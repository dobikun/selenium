package selenium;

import static org.junit.Assert.*;
import org.junit.*;

public class LoginTest extends page.TestBase {
	
  @Before
  public void before() {
	  app.getUserHelper().loginAs(user);
  }

  @Test
  public void testLogin() {
    assertTrue("The Login is faild!", app.getUserHelper().isLoggedIn());
  }
  
  @After
  public void after(){
	  app.getUserHelper().logout();
  }
}