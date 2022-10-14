package ContactUsNegativeTest;

public class ContactUsNegativeMessage  extends ContactUsNegativeBaseClass{

	public static void main(String[] args) throws InterruptedException {

		openBrowser();
		openStore();
		goToContactUs();
		Thread.sleep(10);
		ContactUsInformation.chooseSubject();
		Thread.sleep(10);
		ContactUsInformation.enterEmail("email@email.com");
		Thread.sleep(10);
		ContactUsInformation.enterOrderNumber("12345");
		Thread.sleep(10);
		ContactUsInformation.clickSend();
		Thread.sleep(10);
		ContactUsInformation.noMessage();
		Thread.sleep(10);
		driver.quit();

	}

}
