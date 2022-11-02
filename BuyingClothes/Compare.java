package BuyingClothes;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Compare extends BaseClass {

	public static By firstItem = By.xpath("//*[@class='columns']/div/div[3]/ol/li/div/div/strong/a");
	public static By secondItem = By.xpath("//*[@class='columns']/div/div[3]/ol/li[2]/div/div/strong/a");
	public static By addToCompare = By.xpath("//*[@class='columns']/div/div/div[5]/div/a[2]");
	public static By goToCompare = By.xpath("//*[@id=\"maincontent\"]/div[1]/div[2]/div/div/div/a");
	public static By gear = By.linkText("Gear");
	public static By watches = By.xpath("//*[@class='options']/dd/ol/li[3]/a");

	public static void goToWatches() {
		driver.findElement(gear).click();
		driver.findElement(watches).click();

		System.out.println("User is going to Watches page");
	}

	public static void goToFirstItem() {
		driver.findElement(firstItem).click();
		System.out.println("User has selected the first item in results");
	}

	public static CharSequence getFItemName() {
		String fItem = driver.findElement(By.xpath("//*[@class='page-title-wrapper product']/h1")).getText();
		System.out.println(fItem);
		return fItem;

	}

	public static void getSItemName() {
		String sItem = driver.findElement(By.xpath("//*[@class='page-title-wrapper product']/h1")).getText();
		System.out.println(sItem);

	}

	public static void goToSecondItem() {
		WebElement sI = new WebDriverWait(driver, Duration.ofSeconds(10))
				.until(ExpectedConditions.presenceOfElementLocated(secondItem));
		sI.click();
		System.out.println("User has selected the second item in results");
	}

	public static void goBack() { // go back a page
		driver.navigate().back();
	}

	public static void addToCompare() {
		WebElement add = new WebDriverWait(driver, Duration.ofSeconds(10))
				.until(ExpectedConditions.presenceOfElementLocated(addToCompare));
		add.click();
		System.out.println("User has added item to cart");
	}

	public static void goToCompare() {
		WebElement goComp = new WebDriverWait(driver, Duration.ofSeconds(10))
				.until(ExpectedConditions.presenceOfElementLocated(goToCompare));
		goComp.click();

		System.out.println("User has clicked to go to Compare page");
	}

	public static void inCompare() {
		String compare = "Compare Products";
		if (driver.getPageSource().contains(compare)) {
			System.out.println("User is in Compare Products page");
		} else {
			System.out.println("User is not in Compare Products page");
		}
	}

	public static void areItemsPresent() {
		String firstItem = driver.findElement(By.xpath("//*[@class='columns']/div/div[2]/table/tbody/tr/td/strong/a"))
				.getText();
		String secondItem = driver
				.findElement(By.xpath("//*[@class='columns']/div/div[2]/table/tbody/tr/td[2]/strong/a")).getText();
		System.out.println("The first Item in the Compare Page is " + firstItem);
		System.out.println("The second Item in the Compare Page is " + secondItem);
	}

}
