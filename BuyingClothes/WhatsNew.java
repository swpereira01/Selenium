package BuyingClothes;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class WhatsNew extends BaseClass {

	public static By whatsNew = By.linkText("What's New");
	public static By shorts = By.xpath("//*[@class='columns']/div[2]/div/div/ul/li[6]/a");
	public static By firstItem = By.xpath("//*[@class='columns']/div/div[3]/ol/li/div/div/strong/a"); // we are adding
																										// the first
																										// pair of
																										// shorts to our
																										// cart
	public static By size28 = By.xpath("//*[@class='swatch-opt']/div[1]/div/div[1]");
	public static By red = By.xpath("//*[@id='option-label-color-93-item-58'] ");

	public static void clickWhatsNew() {
		driver.findElement(whatsNew).click();
		System.out.println("Whats New has been clicked");
	}

	public static void clickShorts() {
		driver.findElement(shorts).click();
		System.out.println("Category Shorts has been clicked");
	}

	public static void addFirstItem() {
		driver.findElement(firstItem).click();
		System.out.println("First Item result has been clicked");

	}

	public static void chooseSize28() throws InterruptedException {
		Thread.sleep(600);
		driver.findElement(size28).click();
		System.out.println("Size 28 has been selected");
	}

	public static void chooseRed() {
		driver.findElement(red).click();
		System.out.println("Red has been selected");
	}

	public static void whatsNewPage() {
		String whatsNewTitle = "What's New";
		if (driver.getTitle().contains(whatsNewTitle)) {
			System.out.println("We are in the What's New page");
		} else {
			System.out.println("We are not in the What's New page");
		}
	}

	public static void shortsPresent() {
		String shorts = "Short";
		if (driver.getPageSource().contains(shorts)) {
			System.out.println("User has added shorts from What's New");
		} else {
			System.out.println("User has not added shorts from What's New");
		}
	}

}
