
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateAccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String baseUrl = "http://automationpractice.com/index.php";
		System.setProperty("webdriver.chrome.driver",
				"chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(baseUrl);
		// Locate and click to sign in
		driver.findElement(By.xpath("//*[@id='header']/div[2]/div/div/nav/div/a")).click();
		// check that we are in login page
		String auth = "Authentication";
		if (driver.getPageSource().contains("Auth")) {
			System.out.println("User is in Login page");
		} else {
			System.out.println("User is not in Login page");
		}

		String email = "email2@ooo.com";
		driver.findElement(By.xpath("//*[@id='center_column']/div/div/form/div/div[2]/input")).clear();
		driver.findElement(By.xpath("//*[@id='center_column']/div/div/form/div/div[2]/input")).sendKeys(email);
		driver.findElement(By.xpath("//*[@id='center_column']/div/div/form/div/div[3]/button")).click();

		// Enter in Personal information
		driver.findElement(By.id("id_gender2")).click();
		String fname = "fname";
		String lname = "lname";
		driver.findElement(By.xpath("//*[@class='account_creation']/div[2]/input")).sendKeys(fname);
		driver.findElement(By.xpath("//*[@class='account_creation']/div[3]/input")).sendKeys(lname);
		if (driver.getPageSource().contains(email)) {
			System.out.println("email displayed matches what the user entered in the previous page");
		} else {
			System.out.println("email displayed does not match what the user entered in the previous page");
		}
		driver.findElement(By.xpath("//*[@class='account_creation']/div[5]/input")).sendKeys("Password");

		Select date = new Select(driver.findElement(By.xpath("//*[@class='form-group']/div/div/div/select")));
		date.selectByValue("3");
		driver.findElement(By.xpath("//*[@class='form-group']/div/div[2]/div/select")).click();
		Select month = new Select(driver.findElement(By.xpath("//*[@class='form-group']/div/div[2]/div/select")));
		month.selectByIndex(4);
		;
		driver.findElement(By.xpath("//*[@class='form-group']/div/div[3]/div/select")).click();
		Select year = new Select(driver.findElement(By.xpath("//*[@class='form-group']/div/div[3]/div/select")));
		year.selectByIndex(4);
		driver.findElement(By.xpath("//*[@id='uniform-newsletter']")).click();
		driver.findElement(By.xpath("//*[@id='uniform-optin']")).click();
		/*
		 * first and last name are automatically populated when entered in the first
		 * section
		 * 
		 * Commenting out this test it was to verify that the automatically populated
		 * field matches what was entered in the first section it doesn't fully work yet
		 * as the text that was populated I cannot find in Elements
		 * 
		 * WebElement fname2 =
		 * driver.findElement(By.xpath("//*[@class='account_creation']/p[1]/input"));
		 * WebElement lname2 =
		 * driver.findElement(By.xpath("//*[@class='account_creation']/p[2]/input"));
		 * if(fname2.equals(fname)) { System.out.
		 * println("First Name that has been entered in Personal Information has been Populated in Address"
		 * ); }else { System.out.
		 * println("First Name that has been entered in Personal Information has  not been Populated in Address"
		 * ); } if(lname2.equals(lname)) { System.out.
		 * println("Last Name that has been entered in Personal Information has been Populated in Address"
		 * ); }else { System.out.
		 * println("Last Name that has been entered in Personal Information has  not been Populated in Address"
		 * ); }
		 */

		driver.findElement(By.xpath("//*[@class='form-group']/input")).sendKeys("Company");
		driver.findElement(By.xpath("//*[@class='account_creation']/p[4]/input")).sendKeys("Address123");
		driver.findElement(By.xpath("//*[@class='account_creation']/p[6]/input")).sendKeys("city123");
		driver.findElement(By.xpath("//*[@class='account_creation']/p[7]/div/select")).click();
		Select state = new Select(driver.findElement(By.xpath("//*[@class='account_creation']/p[7]/div/select")));
		state.selectByVisibleText("Arizona");
		;
		driver.findElement(By.xpath("//*[@class='account_creation']/p[8]/input")).sendKeys("85001");
		driver.findElement(By.xpath("//*[@id='account-creation_form']/div[2]/p[13]/input")).sendKeys("1-234-5678");
		driver.findElement(By.xpath("//*[@id='account-creation_form']/div[2]/p[14]/input")).clear();
		driver.findElement(By.xpath("//*[@id='account-creation_form']/div[2]/p[14]/input")).sendKeys("1234 Street");
		driver.findElement(By.xpath("//*[@id='account-creation_form']/div[4]/button")).click();

		// verify that user has successfully signed up by checking if they have been
		// redirected to My Account
		String myAccount = "My account";
		if (driver.getPageSource().contains("My account")) {
			System.out.println("User has successfully signed up");
		} else {
			System.out.println("User has not successfully signed up");
		}
		driver.quit();

	}

}
