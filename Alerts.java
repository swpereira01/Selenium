import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String baseUrl = "https://demo.guru99.com/test/delete_customer.php";
		System.setProperty("webdriver.chrome.driver",
				"chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(baseUrl);

		// Check that we are on the delete customer form
		String delete = "Delete Customer Form";
		if (driver.getPageSource().contains("Delete")) {
			System.out.println("This is the " + delete + " page");
		} else {
			System.out.println("This is not the " + delete + " page");
		}
		// Enter customer id
		driver.findElement(By.xpath("//*[@name='cusid']")).sendKeys("12345");
		// Click to submit
		driver.findElement(By.xpath("//*[@name='submit']")).click();
		// Switch to alert
		Alert alert = driver.switchTo().alert();
		// Get text from alert
		System.out.println(alert.getText());
		// Cancel the alert
		alert.dismiss();
		System.out.println("The alert is closed");
		// Reopen the alert
		driver.findElement(By.xpath("//*[@name='submit']")).click();
		// Accept the alert
		alert.accept();
		System.out.println("Alert has been accepted");
		// Switch to new alert
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Alert confirm = driver.switchTo().alert();
		// Print confirmation message
		System.out.println(confirm.getText());
		// Accept the message
		confirm.accept();
		System.out.println("Alert has been accepted");
		driver.close();

	}

}
