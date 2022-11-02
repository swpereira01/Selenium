package BuyingClothes;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Yoga extends BaseClass {

	public static By yogaLink = By.xpath("//*[@class='blocks-promo']/a");
	public static By materialFilter = By.xpath("//*[@class='filter-options']/div[9]");
	public static By evercool = By.xpath("//*[@class='filter-options']/div[9]/div[2]/ol/li[13]");
	public static By firstItem = By.xpath("//*[@class='columns']/div/div[3]/ol/li/div/div/strong/a");
	public static By sizeXL = By.xpath("//*[@id='option-label-size-143-item-170']");
	public static By red = By.xpath("//*[@id='option-label-color-93-item-58']");
	public static String ec = "EverCool™";

	public static void clickYoga() {
		driver.findElement(yogaLink).click();
		System.out.println("User has clicked Yoga link on Front page");
	}

	public static void materialFilter() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,400)", "");

		WebElement mFilter = new WebDriverWait(driver, Duration.ofSeconds(10))
				.until(ExpectedConditions.presenceOfElementLocated(materialFilter));
		mFilter.click();
		System.out.println("User has clicked the Material Filter");
	}

	public static void selectEverCool() {

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,400)", "");
		WebElement mChoices = new WebDriverWait(driver, Duration.ofSeconds(10))
				.until(ExpectedConditions.presenceOfElementLocated(evercool));
		mChoices.click();
		System.out.println("User has selected the EverCool material");
	}

	public static void chooseFirstItem() {

		WebElement first = new WebDriverWait(driver, Duration.ofSeconds(10))
				.until(ExpectedConditions.presenceOfElementLocated(firstItem));
		first.click();
		System.out.println("User has selected the First Item");
	}

	public static void chooseXL() {

		WebElement size = new WebDriverWait(driver, Duration.ofSeconds(10))
				.until(ExpectedConditions.presenceOfElementLocated(sizeXL));
		size.click();

		System.out.println("User has selected size XL");
	}

	public static void chooseRed() {
		WebElement color = new WebDriverWait(driver, Duration.ofSeconds(10))
				.until(ExpectedConditions.presenceOfElementLocated(red));
		color.click();

		System.out.println("User has selected Red");
	}

	public static void ecInCart() {
		if (driver.getPageSource().contains(ec)) {
			System.out.println("Item is added to the cart");
		} else {
			System.out.println("Item is not added to the cart");
		}
	}

}
