package purchasingAFlight;

public class FlightToLondon extends ChooseCities {
	public static void main(String[] args) {

		//This test is supposed to fail!

		openDriver();
		openStore();
		destinationWeek();
		goBack();
		openStore();
		chooseDepart("Philadelphia");
		chooseDestination("London");
		findFlights();
		reserveFlights();
		viewAerLingus();
		chooseAerLingus();
		purchasePage();
		correctAirline();
		enterName("Customer Customer");
		enterAddress("123 Street");
		enterCity("Reno");
		enterState("Nevada");
		enterZip("89503");
		enterCreditCard("Diner's Club");
		enterCreditCardNumber("1234567890");
		enterCreditCardMonth("August");
		enterCreditCardYear("2024");
		enterCreditCardName("Customer Customer");
		rememberMe();
		rememberMeOption();
		purchaseFlight();
		flightPurchased();
		closeDriver();

	}

}
