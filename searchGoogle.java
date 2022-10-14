import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class searchGoogle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getPageSource());
		WebElement searchBox = driver.findElement(By.xpath("//input[@title='Search' and @type = 'text']"));
		searchBox.sendKeys("testautomation");
		WebElement submitSearch = driver.findElement(By.name("btnK"));
		submitSearch.submit();
		driver.quit();
	}

}
