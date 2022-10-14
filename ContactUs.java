
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ContactUs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"chromedriver.exe");
		String baseUrl = "http://automationpractice.com/index.php";
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(baseUrl);
		
		//Navigate to Contact Us page
		driver.findElement(By.xpath("//*[@id='contact-link']/a")).click();
		//Verify that user is in Contact Us page
		String contact = "Contact us";
		if(driver.getPageSource().contains(contact)) {
			System.out.println("User is in Contact Us page");
		}else {
			System.out.println("User is not in Contact Us page");
		}
		//Select Subject Heading
		Select subject = new Select(driver.findElement(By.xpath("//*[@id='id_contact']")));
		subject.selectByVisibleText("Customer service");
		//Enter in Email Address
		driver.findElement(By.xpath("//*[@id='email']")).sendKeys("email@email.com");
		//Enter in Order reference
		driver.findElement(By.xpath("//*[@id='id_order']")).sendKeys("12345");
		//Attach a file
		driver.findElement(By.id("fileUpload")).sendKeys("C:\\Users\\Shanieka\\Desktop\\SeleniumPractice\\Selenium\\src\\NewMessage.txt");
		//Enter in a message
		driver.findElement(By.xpath("//*[@id='message']")).sendKeys("I would like to become a supplier");
		//Submit
		driver.findElement(By.xpath("//*[@id='submitMessage']")).click();
		//Verify that the message has been sent
		String sent = "successfully sent";
		if(driver.getPageSource().contains(sent)) {
			System.out.println("The message has been successfully sent");
		}else {
			System.out.println("The message has not been sent");
		}
		driver.quit();
		
		
	}

}
