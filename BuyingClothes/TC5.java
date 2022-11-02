package BuyingClothes;

public class TC5 extends Compare {

	public static void main(String[] args) {
		// Add to watches to the Compare Page
		openDriver();
		openStore();
		goToWatches();
		goToFirstItem();
		getFItemName();
		addToCompare();
		goBack();
		goBack();
		goToSecondItem();
		getSItemName();
		addToCompare();
		goToCompare();
		areItemsPresent();
		closeDriver();

	}

}
