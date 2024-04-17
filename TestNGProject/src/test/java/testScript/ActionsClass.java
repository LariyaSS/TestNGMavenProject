package testScript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class ActionsClass extends Base {

	@Test
	public void actionsClassSample()
	{
		driver.navigate().to("https://selenium.qabible.in/drag-drop.php");
		//WebElement dropzone=driver.findElement(By.xpath("//div[@id='mydropzone']"));
		WebElement dragOptions1=driver.findElement(By.xpath("//span[text()='Draggable n°1']"));
		WebElement dotBox=driver.findElement(By.xpath("//div[@id='mydropzone']"));
		Actions actions=new Actions(driver);
	    actions.moveToElement(dragOptions1).build().perform();
	}

}
