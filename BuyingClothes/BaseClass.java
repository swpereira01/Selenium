package BuyingClothes;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseClass {

	public static String baseUrl = "https://magento.softwaretestingboard.com/";
	public static WebDriver driver;

	public static void openDriver() {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();
		System.out.println("Driver is open");

	}

	public static void openStore() {
		driver.get(baseUrl);
		System.out.println("Store is opened");
	}

	public static void addToCart() {
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id='product-addtocart-button']")).click();
	}

	public static void goToCart() {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@class='page messages']/div[2]/div/div/div/a")).click();
		System.out.println("User has clicked to go to Shopping Cart");
	}

	public static void inShoppingCart() {
		if (driver.getPageSource().contains("Shopping Cart")) {
			System.out.println("User in Shopping Cart");
		} else {
			System.out.println("User in not in Shopping Cart");
		}
	}

	public static void closeDriver() {
		driver.quit();
		System.out.println("Driver is now closed");
	}

}
