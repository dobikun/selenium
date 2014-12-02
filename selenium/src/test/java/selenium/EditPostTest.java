package selenium;

import static org.junit.Assert.*;
import org.junit.*;

import selenium.model.Post;

public class EditPostTest extends page.TestBase {
	
	@Before
	public void before(){	
		 Post post = new Post().setTitleName("This is the test post title").setBody("This is the body");
		 app.getUserHelper().loginAs(user);
		 app.getPostHelper().CreatePost(post);
		 app.getPostHelper().selectPost("This is the test post title");
	}

	@Test
	public void testEditPost(){
		assertTrue("Edit post failed!",  app.getPostHelper().IsInEditMode());
	}
	
	@After
	public void after(){	 
		app.getPostHelper().deletePost("This is the test post title");
		app.getUserHelper().logout();
	}
	
}
