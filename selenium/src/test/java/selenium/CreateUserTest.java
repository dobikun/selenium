package selenium;

import static org.junit.Assert.*;
import org.junit.*;


public class CreateUserTest extends page.TestBase {
	
	 private String newUser;
	
	 @Before
	  public void before() {
		  //Set your own user or by default random "user"
		  //user.setUsername("test").setE_mail("test@mail.com").setPassword1("123456").setPassword2("123456");
		  app.getUserHelper().loginAs(user);	
		  newUser = app.getUserHelper().createNewUser(user);
	  }

	  @Test
	  public void testAddNewUser() {
	    assertTrue("Failed to create the user!", app.getUserHelper().doesUserExists(newUser));
	  }
	  
	  @After
	  public void after(){
		  app.getUserHelper().logout();
	  }
}
