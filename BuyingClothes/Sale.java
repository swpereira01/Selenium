package BuyingClothes;

import java.time.Duration;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Sale extends BaseClass {

	public static By sale = By.linkText("Sale");
	public static By mens = By.xpath("//*[@class='blocks-promo']/div/a");
	public static By firstItem = By.xpath("//*[@class='columns']/div/div[3]/ol/li/div/div/strong/a");
	public static By size34 = By.xpath("//*[@class='swatch-opt']/div[1]/div/div[3]");
	public static By red = By.xpath("//*[@id='option-label-color-93-item-58']");
	public static By quantity = By.xpath("//*[@class='product-options-bottom']/div/div/div/div/input");
	public static String s = "64";

	public static void clickSale() {
		driver.findElement(sale).click();
		System.out.println("User has clicked on Sale");
	}

	public static void clickMens() {
		driver.findElement(mens).click();
		System.out.println("User has clicked to view Mens Sale");
	}

	public static void chooseFirst() {
		driver.findElement(firstItem).click();
		System.out.println("User has clicked on the first item");
	}

	public static void size34() {
		WebElement mSize = new WebDriverWait(driver, Duration.ofSeconds(10))
				.until(ExpectedConditions.presenceOfElementLocated(size34));
		mSize.click();

		System.out.println("User has selected size 34");
	}

	public static void chooseRed() {
		WebElement color = new WebDriverWait(driver, Duration.ofSeconds(10))
				.until(ExpectedConditions.presenceOfElementLocated(red));
		color.click();

		System.out.println("User has selected Red");
	}

	public static void changeQuantity() {
		driver.findElement(quantity).clear();
		driver.findElement(quantity).sendKeys(s);
		System.out.println("User has changed the quantity to " + s);

	}

	public static void itemInCart() {
		String size = "34";
		String color = "Red";
		if (driver.getPageSource().contains(size) && driver.getPageSource().contains(color)) {
			System.out.println("User has added item from Sale");
		} else {
			System.out.println("User has not added item from Sale");
		}
	}

	public static void correctQuantity() {

		if (driver.getPageSource().contains(s)) {
			System.out.println("User has added " + s + " items from Sale");
		} else {
			System.out.println("User has not added " + s + " items from Sale");
		}

	}
}
