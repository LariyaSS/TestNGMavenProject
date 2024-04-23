package testScript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class FramesClass extends Base {
	@Test
	public void verifyFrames()
	{
		driver.navigate().to("https://demo.guru99.com/test/guru99home/");
		driver.switchTo().frame("a077aa5e");//frame id
		WebElement frameElement=driver.findElement(By.xpath("//img[@src='Jmeter720.png']"));
		frameElement.click();
	}

}
