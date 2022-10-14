import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class AddDressToCart {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String baseUrl = "http://automationpractice.com/index.php";
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe" );	
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get(baseUrl);
		
		//Negative Search on Site
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("gng34892");
		driver.findElement(By.name("submit_search")).click();
		String o = "0 results have been found.";
		String n = "No results were found for your search \"gng34892\"";
		if(driver.getPageSource().contains("0 results have")) {
			System.out.println("Text: " + o + " is present");
			
		}else {
			System.out.println("Text: " + o + " is not present");
		}
		
		if (driver.getPageSource().contains("No results were")) {
			System.out.println("Text: " + n + " is present");
		}else {
			System.out.println("Text: " + n + " is not present");
		}
		
		//Positive search on Site
		driver.findElement(By.xpath("//input[@type='text']")).clear();
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("dress");
		driver.findElement(By.name("submit_search")).click();
		
		
		driver.findElement(By.xpath("//select[@id='selectProductSort']")).click();
		Select chooseOption = new Select(driver.findElement(By.xpath("//select[@id='selectProductSort']")));
		chooseOption.selectByVisibleText("Price: Highest first");
		WebElement dress = driver.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li/div/div[2]/div"));
		Actions action = new Actions(driver);
		action.moveToElement(dress).perform();
		driver.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li/div/div[2]/div[2]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/a")).click();
		
		//Check if Dress has been added to card;
		System.out.println(driver.getCurrentUrl());
		String p = "Printed Dress";
		
		if(driver.getPageSource().contains("Print")) {
			System.out.println("Text: " + p + " is present");
			
		}else {
			System.out.println("Text: " + p + " is not present");
		}
		
		
	}
	
}
