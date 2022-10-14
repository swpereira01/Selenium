

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestiFrame {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String baseUrl = "https://the-internet.herokuapp.com/";
		System.setProperty("webdriver.chrome.driver",
				"chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get(baseUrl);
		// we need to click the Frames link
		driver.findElement(By.linkText("Frames")).click();
		// click on iFrame link
		driver.findElement(By.linkText("iFrame")).click();
		Thread.sleep(30);
		// Switch to the text box which is in an iframe
		driver.switchTo().frame("mce_0_ifr");

		// This iframe does not allow user to clear the text after choosing the
		// formatting
		// we have to clear the text first then choose the formatting

		// Make textbox a variable
		WebElement textbox = driver.findElement(By.xpath("//*[@id='tinymce']"));
		textbox.clear();
		textbox.sendKeys("iFrame test");
		textbox.sendKeys(Keys.CONTROL+"a");
		// Switch out of iframe
		driver.switchTo().defaultContent();
		// Select the Italic font
		driver.findElement(By.xpath("//*[@class='tox-toolbar__primary']/div[3]/button[2]")).click();
		// click to change the alignment
		driver.findElement(By.xpath("//*[@class='tox-toolbar__primary']/div[4]/button[2]")).click();
		driver.quit();

	}

}
