package ContactUsNegativeTest;

public class ContactUsNegativeSubject extends ContactUsNegativeBaseClass {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		openBrowser();
		openStore();
		goToContactUs();
		Thread.sleep(10);
		ContactUsInformation.enterEmail("email@email.com");
		Thread.sleep(10);
		ContactUsInformation.enterOrderNumber("12345");
		Thread.sleep(10);
		ContactUsInformation.enterMessage("Message");
		Thread.sleep(60);
		ContactUsInformation.clickSend();
		Thread.sleep(10);
		ContactUsInformation.noSubject();
		Thread.sleep(10);
		driver.quit();
	}

}
