package selenium.model;

public class Post {
	
	private String titleName;
	private String body;
	
	
	public String getTitleName() {
		return titleName;
	}
	public Post setTitleName(String titleName) {
		this.titleName = titleName;
		return this;
	}
	public String getBody() {
		return body;
	}
	public Post setBody(String body) {
		this.body = body;
		return this;
	}
}
