package selenium;

import static org.junit.Assert.*;
import org.junit.*;
import selenium.model.Post;

public class SearchPostTest extends page.TestBase {
	 @Before
	 public void before(){
		 Post post = new Post().setTitleName("This is the test post title").setBody("This is the body");
		 app.getUserHelper().loginAs(user);
		 app.getPostHelper().CreatePost(post);
	 }
	 
	 @Test
	 public void testSearchPost() {
		 assertTrue("Failed to find the post!", app.getPostHelper().Search("This is the test post title"));
	 }
	
	 @After
	 public void after(){	 
		 app.getPostHelper().deletePost("This is the test post title");
		 app.getUserHelper().logout();
	 }
}
