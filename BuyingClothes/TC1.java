package BuyingClothes;

import java.util.concurrent.TimeUnit;

public class TC1 extends WhatsNew {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		// Test to add a pair of size 28 red shorts from the What's New section to the
		// Cart

		openDriver();
		openStore();
		clickWhatsNew();
		whatsNewPage();
		clickShorts();
		addFirstItem();
		chooseSize28();
		chooseRed();
		addToCart();
		goToCart();
		inShoppingCart();
		shortsPresent();
		closeDriver();

	}

}
