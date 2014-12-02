package selenium.pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import selenium.model.User;

public class UsersPage extends Page {

	public UsersPage(PageManager pages) {
		super(pages);
	}
	
	@FindBy(id = "user_login")
	WebElement user_login;
	
	@FindBy(id = "email")
	WebElement email;
	
	@FindBy(id = "first_name")
	WebElement first_name;
	
	@FindBy(id = "last_name")
	WebElement last_name;
	
	@FindBy(id = "url")
	WebElement url;
	
	@FindBy(id = "pass1")
	WebElement pass1;
	
	@FindBy(id = "pass2")
	WebElement pass2;
	
	@FindBy(id = "createusersub")
	WebElement createusersub;

	public String createUser(User user) {
		
		user_login.sendKeys(user.get_Username());
		email.sendKeys(user.getE_mail());
		first_name.sendKeys(user.getFirstname());
		last_name.sendKeys(user.getLastname());
		url.sendKeys(user.getWebsite());
		pass1.sendKeys(user.getPassword1());
		pass2.sendKeys(user.getPassword2());
		
		createusersub.click();
		
		return user.get_Username();
	}
	
	public static Boolean checkIfUserExists(String user){
		
		List<String> title = new ArrayList<String>();
		List<WebElement> rows = Helper.findAll(By.className("username"));

		for (WebElement row : rows) {
			 if (row.getText().equals(user)) {
				title.add(row.getText());
			}
		}
		if (title.contains(user)) {
			return true;
		}
		
		return false;
	}
}
