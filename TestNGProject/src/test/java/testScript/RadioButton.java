package testScript;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class RadioButton extends Base{
	
	@Test
	public void verifyTheFunctionalityOfRadioButton()
	{
		driver.navigate().to("https://selenium.qabible.in/radio-button-demo.php");
		WebElement maleRadioButton = driver.findElement(By.xpath("//input[@id='inlineRadio1']"));
		boolean isMaleRadioButtonSelected=maleRadioButton.isSelected();
		assertFalse(isMaleRadioButtonSelected,"Male Radiobutton is selected");
		maleRadioButton.click();
		boolean isMalerRdioButtonSelectedAfterClick=maleRadioButton.isSelected();
		assertTrue(isMalerRdioButtonSelectedAfterClick,"Male radio button is not selected");
		WebElement femaleRadioButton = driver.findElement(By.xpath("//input[@id='inlineRadio2']"));
		boolean isFemaleRadioButtonSelected=femaleRadioButton.isSelected();
		assertFalse(isFemaleRadioButtonSelected,"Female radio button is selected");
		WebElement showSelectedValueButton = driver.findElement(By.xpath("//button[@id='button-one']"));
		showSelectedValueButton.click();
		WebElement showMessageText=driver.findElement(By.xpath("//div[@id='message-one']"));
		boolean  showMessageTextIsDisplayed=showMessageText.isDisplayed();
		assertTrue(showMessageTextIsDisplayed,"Show message is not displayed");
  }
}
