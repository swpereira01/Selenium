package BuyingClothes;

public class TC6 extends Delete {

	public static void main(String[] args) throws InterruptedException {
		// Delete an item that has been added to the cart
		openDriver();
		openStore();
		clickPromo();
		clickFirstItem();
		getFItemName();
		chooseSize28();
		chooseGreen();
		addToCart();
		goToCart();
		inShoppingCart();
		areItemsPresent();
		clickDelete();
		isCartEmpty();
		closeDriver();

	}

}
