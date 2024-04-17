package testScript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Base {

	WebDriver driver;

	@BeforeMethod
	public void intializeBrowser() {
		driver = new ChromeDriver();
		driver.get("https://selenium.qabible.in/simple-form-demo.php");
		driver.manage().window().maximize();

	}

	@AfterMethod
	public void browserQuit() {
		driver.quit();

	}

}
