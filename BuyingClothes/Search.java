package BuyingClothes;

import org.openqa.selenium.By;

public class Search extends BaseClass {

	public static By searchbox = By.id("search");
	public static By searchButton = By.xpath("//*[@class='actions']/button");
	public static By listMode = By.xpath("//*[@class='modes']/a");
	public static By seconditem = By.xpath("//*[@class='columns']/div/div[2]/div[2]/ol/li[2]/div/div/div[3]/div[2]/a"); // Click
																														// to
																														// learn
																														// more
																														// for
																														// second
																														// item
	public static String s = "";

	public static void searchQuery(String s) {
		driver.findElement(searchbox).sendKeys(s);
		System.out.println("Search Query has been entered");
	}

	public static void enterSearch() {
		driver.findElement(searchButton).click();
		System.out.println("Search has been submitted");
	}

	public static void chooseList() {
		driver.findElement(listMode).click();
		System.out.println("List View has been selected");
	}

	public static void chooseSecondItem() {
		driver.findElement(seconditem).click();
		System.out.println("Second Item had been selected");
	}

	public static void inCart() {
		if (driver.getPageSource().contains(s)) {
			System.out.println("Searched item is added to the cart");
		} else {
			System.out.println("Searched item is not added to the cart");
		}
	}

}
