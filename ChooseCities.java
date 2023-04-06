package purchasingAFlight;

import java.time.Duration;

import org.testng.Assert;
import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ChooseCities extends BaseClass {

	public static By destinationWeek = (By.xpath("//*[@class='jumbotron']/div/p[2]/a"));
	public static String hawaii = "Destination of the week: Hawaii";
	public static By departure = (By.xpath("//body/div[3]/form/select[1]"));
	public static By destination = (By.xpath("/html/body/div[3]/form/select[2]"));
	public static By findFlights = (By.xpath("//html/body/div[3]/form/div/input"));
	public static By flightList = (By.xpath("//html/body/div[2]/h3"));
	public static By aerLingus = (By.xpath("//html/body/div[2]/table/tbody/tr[3]"));
	public static By aerLingusAirline = (By.xpath("//html/body/div[2]/table/tbody/tr[3]/td[3]"));

	public static By selectAerLingus = (By.xpath("//html/body/div[2]/table/tbody/tr[3]/td[1]/input"));

	public static By name = (By.xpath("//html/body/div[2]/form/div[1]/div/input"));
	public static By address = (By.xpath("//html/body/div[2]/form/div[2]/div/input"));
	public static By city = (By.xpath("//html/body/div[2]/form/div[3]/div/input"));
	public static By state = (By.xpath("//html/body/div[2]/form/div[4]/div/input"));
	public static By zip = (By.xpath("//html/body/div[2]/form/div[5]/div/input"));
	public static By creditCard = (By.xpath("//html/body/div[2]/form/div[6]/div/select"));
	public static By creditCardNumber = (By.xpath("//html/body/div[2]/form/div[7]/div/input"));
	public static By month = (By.xpath("//html/body/div[2]/form/div[8]/div/input"));
	public static By year = (By.xpath("//html/body/div[2]/form/div[9]/div/input"));
	public static By creditCardName = (By.xpath("//html/body/div[2]/form/div[10]/div/input"));
	public static By rememberMe = (By.xpath("//html/body/div[2]/form/div[11]/div/label/input"));
	public static By purchaseFlight = (By.xpath("//html/body/div[2]/form/div[11]/div/input"));
	public static By flightPurchased = (By.xpath("//html/body/div[2]/div/h1"));

	public static void destinationWeek() {
		driver.findElement(destinationWeek).click();
		if (driver.getPageSource().contains(hawaii)) {
			System.out.println("User has reached Destination of the Week page");
		} else {
			System.out.println("User has not reached Destination of the Week page");
		}

	}

	public static void chooseDepart(String departingCity) {
		driver.findElement(departure).click();
		Select departCity = new Select(driver.findElement(departure));
		departCity.selectByVisibleText(departingCity);
		System.out.println("User has chosen to fly from " + departingCity);
	}

	public static void chooseDestination(String destinationCity) {
		driver.findElement(destination).click();
		Select arriveCity = new Select(driver.findElement(destination));
		arriveCity.selectByVisibleText(destinationCity);
		System.out.println("User has chosen to fly to " + destinationCity);
	}

	public static void findFlights() {
		driver.findElement(findFlights).click();
		System.out.println("Clicked the Find Flights button");
	}

	public static void reserveFlights() {
		WebElement flights = new WebDriverWait(driver, Duration.ofSeconds(10))
				.until(ExpectedConditions.presenceOfElementLocated(flightList));
		System.out.println("Text on top of the page: " + flights.getText());
	}

	public static void viewAerLingus() {
		WebElement aerLingusRow = new WebDriverWait(driver, Duration.ofSeconds(10))
				.until(ExpectedConditions.presenceOfElementLocated(aerLingus));
		System.out.println(aerLingusRow.getText());
	}

	public static void chooseAerLingus() {
		WebElement ae = new WebDriverWait(driver, Duration.ofSeconds(10))
				.until(ExpectedConditions.presenceOfElementLocated(selectAerLingus));
		ae.click();
		System.out.println("Selected the Aer Lingus Flight");
	}

	public static void purchasePage() {
		if (driver.getCurrentUrl().contains("https://blazedemo.com/purchase.php")) {
			System.out.println("User is in Purchase flight page");
		} else {
			System.out.println("User is not in Purchase flight page");
		}
	}

	public static void correctAirline() {
		String expectedAirline = "Airline: Aer Lingus";
		WebElement airline = driver.findElement(By.xpath("/html/body/div[2]/p[1]"));
		String actualAirline = airline.getText();
		Assert.assertEquals(actualAirline, expectedAirline);
	}

	public static void enterName(String n) {
		WebElement customerName = driver.findElement(name);
		customerName.sendKeys(n);
		String enteredName = customerName.getAttribute("value");
		System.out.println("User entered " + enteredName + " for name");
	}

	public static void enterAddress(String street) {
		WebElement streetName = driver.findElement(address);
		streetName.sendKeys(street);
		String enteredStreet = streetName.getAttribute("value");
		System.out.println("User entered " + enteredStreet + " for street");
	}

	public static void enterCity(String cityName) {
		WebElement nameOfCity = driver.findElement(city);
		nameOfCity.sendKeys(cityName);
		String enteredCity = nameOfCity.getAttribute("value");
		System.out.println("User entered " + enteredCity + " for street");
	}

	public static void enterState(String stateName) {
		WebElement nameOfState = driver.findElement(state);
		nameOfState.sendKeys(stateName);
		String enteredState = nameOfState.getAttribute("value");
		System.out.println("User entered " + enteredState + " for state");
	}

	public static void enterZip(String zipCode) {
		WebElement whichZip = driver.findElement(zip);
		whichZip.sendKeys(zipCode);
		String enteredZip = whichZip.getAttribute("value");
		System.out.println("User entered " + enteredZip + " for zipCode");
	}

	public static void enterCreditCard(String cc) {
		driver.findElement(creditCard).click();
		Select credit = new Select(driver.findElement(creditCard));
		credit.selectByVisibleText(cc);
		if (cc == "Visa") {
			System.out.println("User has chosen Visa");
		} else if (cc == "American Express") {
			System.out.println("User has chosen American Express");
		} else if (cc == "Diner's Club") {
			System.out.println("User has chosen Diner's Club");
		} else {
			System.out.println("User has not chosen a credit card type");
		}
	}

	// For the fields that ask for user input I'm using getAttribute() instead of
	// printing out the user input as I would want to see what text has been put
	// into the input box, not what the user has written

	public static void enterCreditCardNumber(String ccNumber) {
		WebElement creditCardNum = driver.findElement(creditCardNumber);
		creditCardNum.sendKeys(ccNumber);
		String enteredCreditCardNumber = creditCardNum.getAttribute("value");
		System.out.println("User entered " + enteredCreditCardNumber + " for credit card number");
	}

	public static void enterCreditCardMonth(String ccMonth) {
		driver.findElement(month).clear(); // there is text entered in by default
		WebElement creditMonth = driver.findElement(month);
		creditMonth.sendKeys(ccMonth);
		String enteredCreditCardMonth = creditMonth.getAttribute("value");
		System.out.println("User entered " + enteredCreditCardMonth + " for credit card month");
	}

	public static void enterCreditCardYear(String ccyear) {
		driver.findElement(year).clear(); // there is text entered in by default
		WebElement creditYear = driver.findElement(year);
		creditYear.sendKeys(ccyear);
		String enteredCreditCardYear = creditYear.getAttribute("value");
		System.out.println("User entered " + enteredCreditCardYear + " for credit card year");
	}

	public static void enterCreditCardName(String ccName) {
		WebElement creditName = driver.findElement(creditCardName);
		creditName.sendKeys(ccName);
		String enteredCreditCardName = creditName.getAttribute("value");
		System.out.println("User entered " + enteredCreditCardName + " for credit card name");
	}

	public static void rememberMe() {
		driver.findElement(rememberMe).click();
		System.out.println("User clicked 'Remember Me' checkbox");
	}

	public static void rememberMeOption() { // Optional test whether user does or does not click on option depending on
											// test
		if (driver.findElement(rememberMe).isSelected()) {
			System.out.println("User has selected the Remember Me checkbox");
		} else {
			System.out.println("User has not selected the Remember Me checkbox");
		}
	}

	public static void purchaseFlight() {
		driver.findElement(purchaseFlight).click();
		System.out.println("User has clicked to purchase flight");
	}

	public static void flightPurchased() {

		boolean isFlightpurchased = driver.findElement(flightPurchased).isDisplayed();
		System.out.println("User has purchased flight: " + isFlightpurchased);
	}

}
