package selenium.pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import selenium.model.Post;

public class PostsPage extends Page{

	public PostsPage(PageManager pages) {
		super(pages);
	}
	
	private Actions action = new Actions(getWebDriver());
	
	@FindBy(id = "title")
	WebElement title;
	
	@FindBy(id = "publish")
	WebElement publish;
	
	@FindBy(id = "content")
	WebElement content;
	
	@FindBy(id = "content-html")
	WebElement content_html;
	
	public void Publish(Post post) {
		title.sendKeys(post.getTitleName());
		content_html.click();
		content.sendKeys(post.getBody());
		publish.click();
	}
	
	public static Boolean checkIfPostExists(String postTitle) {

		List<String> title = new ArrayList<String>();
		List<WebElement> rows = Helper.findAll(By.className("row-title"));

		for (WebElement row : rows) {
			if (row.getText().equals(postTitle)) {
				title.add(row.getText());
			}
		}

		if (title.contains(postTitle)) {
			return true;
		}
		return false;
	}
	
	public void tryToDeletePost(String titleName) {

		try {
			action.moveToElement(Helper.find(By.linkText(titleName))).perform();
			action.moveToElement(Helper.find(By.linkText("Trash"))).click().perform();
		} catch (Exception e) {
		}
	}

	public boolean searchPost(String post) {
			pages.internalPage.clickPostsLink();
			Helper.find(By.id("post-search-input")).sendKeys(post);
			Helper.find(By.id("search-submit")).click();
			
			return searchResult(post);
	}	
	
	private boolean searchResult(String searchPost) {
		
		List<String> title = new ArrayList<String>();
		List<WebElement> rows = Helper.findAll(By.className("row-title"));

		for (WebElement row : rows) {
			if (row.getText().equals(searchPost)) {
				title.add(row.getText());
			}
		}

		if (title.contains(searchPost)) {
			return true;
		}

		return false;
	}

	public void findPost(String post) {
		
		pages.internalPage.clickPostsLink();
		
		String titleName      = post;
		List<WebElement> rows = Helper.findAll(By.className("row-title"));

		try {
			for (WebElement row : rows) {
				if (row.getText().equals(titleName)) {
					row.click();
					break;
				}
			}
		} catch (Exception e) {}
	}

	public boolean editMode() {
		return Helper.isElementPresent(By.id("icon-edit"));
	}
}
