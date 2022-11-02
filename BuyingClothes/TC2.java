package BuyingClothes;

public class TC2 extends Search {

	public static void main(String[] args) throws InterruptedException {
		// Search for a bag in List view and add the second item to cart
		openDriver();
		openStore();
		searchQuery("Bag");
		enterSearch();
		chooseList();
		chooseSecondItem();
		addToCart();
		goToCart();
		inShoppingCart();
		inCart();
		closeDriver();

	}

}
