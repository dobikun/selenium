package selenium.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends Page {

	public LoginPage(PageManager pages) {
		super(pages);
	}
	
	@FindBy(id = "user_login")
	WebElement login_field;
	
	@FindBy(id = "user_pass")
	WebElement password_field;
	
	@FindBy(id = "wp-submit")
	WebElement submit;

	public LoginPage setUsernameField(String login) {
		login_field.clear();
		login_field.sendKeys(login);
		login_field.clear();
		login_field.sendKeys(login);
		return this;
	}

	public LoginPage setPasswordField(String password) {
		password_field.clear();
		password_field.sendKeys(password);
		
		return this;
	}

	public void clickSubmitButton() {
		submit.click();
	}
	
	public Boolean isIn() {
		return Helper.isElementPresent(By.id("wpcontent"));
	}
	
	public Boolean isOut() {
		if (Helper.isElementPresent(By.id("login"))) {
			return true;
		}
		return false;
	}
}
