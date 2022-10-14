import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String baseUrl = "http://the-internet.herokuapp.com/";
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(baseUrl);
		driver.findElement(By.linkText("Dropdown")).click();
		System.out.println(driver.getCurrentUrl()); //Make sure we have been redirected to the dropdown page
		driver.findElement(By.id("dropdown")).click();
		Select chooseOption = new Select(driver.findElement(By.id("dropdown")));
		chooseOption.selectByIndex(2);
		driver.quit();
		
	}

}
