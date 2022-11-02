package BuyingClothes;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Delete extends BaseClass {

	public static By promo = By.xpath("//*[@class='blocks-promo']/div/a");
	public static By firstItem = By.xpath("//*[@class='columns']/div/div[3]/ol/li/div/div/strong/a");
	public static By size28 = By.xpath("//*[@class='swatch-opt']/div[1]/div/div[1]");
	public static By green = By.xpath("//*[@id='option-label-color-93-item-53']");
	public static By delete = By.xpath("//*[@class='item-actions']/td/div/a[2]");
	public static String emptyCart = "You have no items in your shopping cart.";

	public static void clickPromo() {
		driver.findElement(promo).click();
		System.out.println("User has clicked on promo");
	}

	public static void clickFirstItem() {
		driver.findElement(firstItem).click();
		System.out.println("First Item result has been clicked");

	}

	public static CharSequence getFItemName() {
		String fItem = driver.findElement(By.xpath("//*[@class='page-title-wrapper product']/h1")).getText();
		System.out.println(fItem);
		return fItem;

	}

	public static void chooseSize28() throws InterruptedException {
		Thread.sleep(600);
		driver.findElement(size28).click();
		System.out.println("Size 28 has been selected");
	}

	public static void chooseGreen() {
		driver.findElement(green).click();
		System.out.println("Green has been selected");
	}

	public static void fIteminCart() {
		if (driver.getPageSource().contains(getFItemName())) {
			System.out.println("Selected item is in cart");
		} else {
			System.out.println("Selected item is not in cart");
		}
	}

	public static void areItemsPresent() {
		String firstItem = driver.findElement(By.xpath("//*[@id='shopping-cart-table']/tbody/tr/td/div/strong/a"))
				.getText();
		System.out.println("The item in the cart is " + firstItem);

	}

	public static void clickDelete() {
		WebElement deleteButton = new WebDriverWait(driver, Duration.ofSeconds(20))
				.until(ExpectedConditions.presenceOfElementLocated(delete));
		deleteButton.click();
		System.out.println("User has clicked to delete item");
	}

	public static void isCartEmpty() {
		if (driver.getPageSource().contains(emptyCart)) {
			System.out.println("Item has been deleted, cart is empty");
		} else {
			System.out.println("Item has not been deleted, cart is not empty");
		}
	}

}
