package BuyingClothes;

public class TC4 extends Sale {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Add a Red Size 34 mens sale item and add 64 of them to the cart

		openDriver();
		openStore();
		clickSale();
		clickMens();
		chooseFirst();
		size34();
		chooseRed();
		changeQuantity();
		addToCart();
		goToCart();
		inShoppingCart();
		itemInCart();
		correctQuantity();
		closeDriver();

	}

}
