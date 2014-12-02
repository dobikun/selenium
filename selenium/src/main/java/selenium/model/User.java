package selenium.model;

import selenium.pages.Helper;

public class User {
	
	String randomData = Helper.randomData().toString().replaceAll("[\\]\\[]","");
	
	/*Login data*/
	private String id;
	private String login;
	private String email;
	private String password;
	private String role;
	
	/*Registration data*/
	private  String username 	= randomData;
	private  String e_mail		= randomData+"@mail.com";
	private  String firstname 	= randomData;
	private  String lastname 	= randomData;
	private  String website 	= "www."+randomData+".com";
	private  String password1 	= "123456";
	private  String password2 	= "123456";
	
	
	//-----------------------------------------------------------------------------//
	
	public User setUsername(String username) {
		this.username = username;
		return this;
	}
	public User setE_mail(String e_mail) {
		this.e_mail = e_mail;
		return this;
	}
	public User setFirstname(String firstname) {
		this.firstname = firstname;
		return this;
	}
	public User setLastname(String lastname) {
		this.lastname = lastname;
		return this;
	}
	public User setWebsite(String website) {
		this.website = website;
		return this;
	}
	public User setPassword1(String password1) {
		this.password1 = password1;
		return this;
	}
	public User setPassword2(String password2) {
		this.password2 = password2;
		return this;
	}
	
	//-----------------------------------------------------------------------------//
	
	public String get_Username() {
		return username;
	}
	
	public String getE_mail() {
		return e_mail;
	}
	public String getFirstname() {
		return firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public String getWebsite() {
		return website;
	}
	public String getPassword1() {
		return password1;
	}
	public String getPassword2() {
		return password2;
	}
	
	//-----------------------------------------------------------------------------//
	
	public String getId() {
		return id;
	}
	public User setId(String id) {
		this.id = id;
		return this;
	}
	public String getLogin() {
		return login;
	}
	public User setLogin(String login) {
		this.login = login;
		return this;
	}
	public String getEmail() {
		return email;
	}
	public User setEmail(String email) {
		this.email = email;
		return this;
	}
	public String getPassword() {
		return password;
	}
	public User setPassword(String password) {
		this.password = password;
		return this;
	}
	public String getRole() {
		return role;
	}
	public User setRole(String role) {
		this.role = role;
		return this;
	}
	
	//-----------------------------------------------------------------------------//
	
}
