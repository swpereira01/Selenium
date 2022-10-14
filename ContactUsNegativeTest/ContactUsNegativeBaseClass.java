package ContactUsNegativeTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ContactUsNegativeBaseClass {

	public static WebDriver driver;

	public static void openBrowser() {
		System.setProperty("webdriver.chrome.driver",
				"chromedriver.exe");
		driver = new ChromeDriver();
	}

	public static void openStore() {
		driver.get("http://automationpractice.com/index.php");

	}

	public static void goToContactUs() {
		driver.findElement(By.xpath("//*[@id='contact-link']/a")).click();
	}

	public static void click(By loc) {
		driver.findElement(loc).click();
	}

	public static void select(By loc, String data) {
		new Select(driver.findElement(loc)).selectByVisibleText(data);
	}
	public static void refresh() {
		driver.navigate().refresh();
	}

}
