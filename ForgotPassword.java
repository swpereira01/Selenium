import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ForgotPassword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String baseUrl = "http://the-internet.herokuapp.com/";
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(baseUrl);
		driver.findElement(By.linkText("Forgot Password")).click();
		driver.findElement(By.id("email")).sendKeys("email@email.com");
		driver.findElement(By.id("form_submit")).click();
		driver.quit();
	}

}
