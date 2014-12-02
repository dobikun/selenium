package selenium.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class InternalPage extends Page {
	
	public InternalPage(PageManager pages) {
		super(pages);
	}
	
	private Actions action = new Actions(getWebDriver());
	
	@FindBy(linkText = "Posts")
	WebElement post_link;
	
	@FindBy(linkText = "Add New")
	WebElement addnew_link;

	@FindBy(linkText = "Users")
	WebElement users_link;
	
	@FindBy(linkText = "Add New")
	WebElement addNewUser_link;

	@FindBy(id = "wp-admin-bar-top-secondary")
	WebElement adminBar_link;
	
	@FindBy(id = "wp-admin-bar-logout")
	WebElement logout_link;
	
	public void clickAddNewPostLink() {
		clickPostsLink();
		addnew_link.click();
		Helper.waiting(1);
	}
	
	public void clickPostsLink() {
		post_link.click();
		Helper.acceptAlert();
		Helper.waiting(1);
	}
	
	public void clickAddNewUserLink() {
		clickUsersLink();
		addNewUser_link.click();
		Helper.waiting(1);
	}
	
	public void clickUsersLink() {
		users_link.click();
		Helper.waiting(1);
	}
	
	public void clickLogoutLink() {
		action.moveToElement(adminBar_link, 1, 1).build().perform();
		Helper.waiting(1);
		logout_link.click();
	}
	
}
