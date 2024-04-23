package testScript;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class FileUpload extends Base {
	@Test
	public void fileUploadDemo()
	{
		driver.navigate().to("https://demo.guru99.com/test/upload/");
		WebElement chooseFile=driver.findElement(By.xpath("//input[@id='uploadfile_0']"));
		chooseFile.sendKeys("C:\\Users\\lariy\\Downloads\\automation.pdf");
		
	}
	@Test
	public void  pdfToWorldConverter() throws AWTException
	{
		driver.navigate().to("https://www.ilovepdf.com/pdf_to_word");
		WebElement choosePDFFile=driver.findElement(By.xpath("//a[@id='pickfiles']"));
		choosePDFFile.click();
		 StringSelection stringSelection = new StringSelection("C:\\Users\\lariy\\Downloads\\automation.pdf");
		   Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);
		   Robot robot = new Robot();
			robot.delay(250);
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);
		    robot.keyPress(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_V);
			robot.keyRelease(KeyEvent.VK_V);
			robot.keyRelease(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.delay(90);
			robot.keyRelease(KeyEvent.VK_ENTER);
		}
	}


