package selenium;

import static org.junit.Assert.*;

import org.junit.*;
import selenium.model.Post;

public class DeletePostTest extends page.TestBase {
	 @Before
	 public void before(){
		 app.getUserHelper().loginAs(user);
		 Post post = new Post().setTitleName("This is the test post title").setBody("This is the body");
		 app.getPostHelper().CreatePost(post);
		 app.getPostHelper().deletePost("This is the test post title");
	 }
	 
	 @Test
	 public void testDeletePost() {
		 assertFalse("Cannot delete the post!", app.getPostHelper().isPostExists("This is the test post title"));
     }
	
	 @After
	 public void after(){	 
		 app.getUserHelper().logout();
	 }
}
