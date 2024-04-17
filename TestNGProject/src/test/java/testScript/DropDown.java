package testScript;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class DropDown extends Base {

	@Test
	public void verifySelectInputDemo() {

		driver.navigate().to("https://selenium.qabible.in/select-input.php");
		WebElement dropDown = driver.findElement(By.xpath("//select[@id='single-input-field']"));
		Select select = new Select(dropDown);
		select.selectByValue("Red");
		select.selectByVisibleText("Yellow");
		select.selectByIndex(3);
		

	}

	@Test
	public void verifyTwoInputFieldsDemo() {
		driver.navigate().to("https://selenium.qabible.in/select-input.php");
		WebElement multipleDropDown = driver.findElement(By.xpath("//select[@id='multi-select-field']"));
		Select selectforMultiple = new Select(multipleDropDown);
		List<WebElement> options = selectforMultiple.getOptions();
		int size = options.size();
		boolean isMultiSelectPossible = selectforMultiple.isMultiple();
		selectforMultiple.selectByValue("Red");
		selectforMultiple.selectByValue("Yellow");
	}
	@Test
	public void findElementssample()
	{
		driver.navigate().to("https://www.selenium.dev/");
		WebElement dropdownEnglishLanguage=driver.findElement(By.xpath("//a[text()='English']"));
		
		dropdownEnglishLanguage.click();
		List<WebElement> dropDownOptions=driver.findElements(By.xpath("//ul[@class='dropdown-menu show']//child::a"));
		for(WebElement option:dropDownOptions)
		{
			String textOfOptions=option.getText();
			if(textOfOptions.equals("Other"))
					{
				      option.click();
				      break;
					}
		}
	}

	
}
