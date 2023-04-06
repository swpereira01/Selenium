package purchasingAFlight;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseClass {
	
	public static String baseURL = "https://blazedemo.com/";
	public static WebDriver driver;
	
	
	public static void openDriver() {
		System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
		driver = new FirefoxDriver();
		System.out.println("Driver is open");
	}
	
	public static void openStore() {
		driver.get(baseURL);
		System.out.println("Store is opened");
	}
	public static void goBack() {//go back a page
		driver.navigate().back();
		System.out.println("User went back a page");
	}
	
	public static void closeDriver() {
		driver.quit();
		System.out.println("Driver is now closed");
	}
	
}
