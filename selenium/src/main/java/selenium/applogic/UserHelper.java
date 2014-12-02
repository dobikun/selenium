package selenium.applogic;

import selenium.model.User;

public class UserHelper extends DriverBaseHelper {
	
	public UserHelper(ApplicationManager manager) {
	    super(manager.getWebDriver());
	}

	public void loginAs(User user) {
		  pages.loginPage
		  .setUsernameField(user.getLogin())
	      .setPasswordField(user.getPassword())
	      .clickSubmitButton();
	}

	public Boolean isLoggedIn() {
		return pages.loginPage.isIn();
	}
	
	public Boolean isLoggedOut() {
		return pages.loginPage.isOut();
	}
	
	public void logout() {
		pages.internalPage.clickLogoutLink();
	}
	
	public String createNewUser(User user) {
		pages.internalPage.clickAddNewUserLink();
		String newUser = pages.usersPage.createUser(user);
		return newUser;
	}
	
	@SuppressWarnings("static-access")
	public boolean doesUserExists(String user){
		pages.internalPage.clickUsersLink();
		
		return pages.usersPage.checkIfUserExists(user);
	}
}
