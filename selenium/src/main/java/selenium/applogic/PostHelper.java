package selenium.applogic;

import selenium.model.Post;

public class PostHelper extends DriverBaseHelper {

	public PostHelper(ApplicationManager manager) {
		 super(manager.getWebDriver());
	}
	
	public void CreatePost(Post post) {
		pages.internalPage.clickAddNewPostLink();
		pages.postsPage.Publish(post);
	}
	
	@SuppressWarnings("static-access")
	public Boolean isPostExists(String postTitle){
		pages.internalPage.clickPostsLink();
		return pages.postsPage.checkIfPostExists(postTitle);
	}
	
	public void deletePost(String titleName) {
		pages.internalPage.clickPostsLink();
		pages.postsPage.tryToDeletePost(titleName);
	}

	public boolean Search(String post) {
		return pages.postsPage.searchPost(post);
	}
	
	public void selectPost(String post) {
		pages.postsPage.findPost(post);
	}

	public boolean IsInEditMode() {
		return pages.postsPage.editMode();
	}
}
