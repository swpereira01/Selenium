package ContactUsNegativeTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class ContactUsInformation extends ContactUsNegativeBaseClass {

	public static By subject = By.xpath("//*[@id='id_contact']");
	public static By email = By.xpath("//*[@id='email']");
	public static By order = By.xpath("//*[@id='id_order']");
	public static By file = By.id("fileUpload");
	public static By message = By.xpath("//*[@id='message']");
	public static By send = By.xpath("//*[@id='submitMessage']");
	public static String errorSubject = "Please select a subject from the list provided. ";
	public static String errorEmail = "Invalid email address.";
	public static String errorMessage = "The message cannot be blank.";

	public static void chooseSubject() throws InterruptedException {
		WebElement dropdown = driver.findElement(subject);
		dropdown.click();
		// Selecting Customer Service as a subject
		Select customer = new Select(dropdown);
		customer.selectByVisibleText("Customer service");
	}

	public static void enterEmail(String e) {
		driver.findElement(email).click();
		driver.findElement(email).sendKeys(e);
	}

	public static void enterOrderNumber(String o) {
		driver.findElement(order).click();
		driver.findElement(order).sendKeys(o);
	}

	public static void enterMessage(String m) {
		driver.findElement(message).sendKeys(m);
	}

	public static void clickSend() {
		driver.findElement(send).click();
	}

	// Check to see if correct error message is shown when Subject is missing
	public static void noSubject() {
		if (driver.getPageSource().contains(errorSubject)) {
			System.out.println("'" + errorSubject + "'" + " is shown when user does not choose a Subject");
		} else {
			System.out.println("'" + errorSubject + "'" + " is not shown when user does not choose a Subject");
		}
	}

	// Check to see if correct error message is shown when Email is missing
	public static void noEmail() {
		if (driver.getPageSource().contains(errorEmail)) {
			System.out.println("'" + errorEmail + "'" + " is shown when user does not enter an email");
		} else {
			System.out.println("'" + errorEmail + "'" + " is not shown when user does not enter an email");
		}
	}

	// Check to see if correct error message is shown when Message is missing
	public static void noMessage() {
		if (driver.getPageSource().contains(errorMessage)) {
			System.out.println("'" + errorMessage + "'" + " is shown when user does not enter a Message");
		} else {
			System.out.println("'" + errorMessage + "'" + " is not shown when user does not enter a Message");
		}
	}

}
