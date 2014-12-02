package selenium.pages;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class Helper {
	
	private static WebDriver driver; 
	
	@SuppressWarnings("static-access")
	public Helper(WebDriver driver) {
		this.driver = driver;
	}

	public static void waiting(int sec) {
		driver.manage().timeouts()
				.implicitlyWait(sec, TimeUnit.SECONDS);
	}

	public static boolean isElementPresent(By by) {
		try {
			driver.findElement(by);
			return true;
		} catch (NoSuchElementException e) {
			return false;
		}
	}

	public static WebElement find(By by) {
		WebElement resultOfBy = driver.findElement(by);
		return resultOfBy;
	}

	public static List<WebElement> findAll(By by) {
		List<WebElement> resultOfBy = driver.findElements(by);
		return resultOfBy;
	}

	public static void switchFame(String fame, String body) {
		driver.switchTo().frame(fame);
		driver.switchTo().activeElement().sendKeys(body);
		driver.switchTo().defaultContent();
		waiting(1);
	}
	
	public static void acceptAlert(){
		try {
			switchToAlert().accept();
		} catch (Exception e) {
		}
	}

	public static Alert switchToAlert() {
		return driver.switchTo().alert();
	}

	public static String getTitleOfPage() {
		return driver.getTitle();
	}
	
	public static void selectPost(String title) {

		String titleName = title;
		List<WebElement> rows = findAll(By.className("row-title"));

		try {
			for (WebElement row : rows) {
				if (row.getText().equals(titleName)) {
					row.click();
					break;
				}
			}
		} catch (Exception e) {}
	}
	
	public static Boolean doesPostExists(String postTitle) {

		List<String> title = new ArrayList<String>();
		List<WebElement> rows = findAll(By.className("row-title"));

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
	
	public void close() {
		driver.close();
	}
	
	public static Set<String> randomData() {

		Random rand = new Random();
		Set<String> words = new HashSet<String>();

		while(words.size() < 1) {
		    words.add(Long.toString(Math.abs(rand.nextLong() % 3656158440062976L), 36));
		}
		
        return words;
	}
}
