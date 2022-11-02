package BuyingClothes;

public class TC3 extends Yoga {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Clicking on the Yoga modal on the front Page, Selecting the EverCool Material
		// filter, then adding the first item to the cart
		openDriver();
		openStore();
		clickYoga();
		materialFilter();
		selectEverCool();
		chooseFirstItem();
		chooseXL();
		chooseRed();
		addToCart();
		goToCart();
		inShoppingCart();
		ecInCart();
		closeDriver();
	}

}
