package testScript;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotEquals;
import static org.testng.Assert.assertNotNull;
import static org.testng.Assert.assertNull;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.Color;
import org.testng.annotations.Test;

public class AssertSamples extends Base {
	@Test
	public void verifyBackGroundColorGetTotalButton() {
		String expectedHexBackGroundColorGetTotal = "#007bff";
		WebElement getTotalButton=driver.findElement(By.xpath("//button[@id='button-two']"));
		boolean isGetTotalButtonIsDisplayed=getTotalButton.isDisplayed();
		assertTrue(isGetTotalButtonIsDisplayed,"Gettotal button is not available");
		String actualBackGroungColour=getTotalButton.getCssValue("background-color");
		//convert rgba to hex
		String actualHexBackGroundColorGetTotal = Color.fromString(actualBackGroungColour).asHex();
		assertEquals(expectedHexBackGroundColorGetTotal, actualHexBackGroundColorGetTotal,"Background colour of getTotal button is not"+expectedHexBackGroundColorGetTotal);
	}

	@Test
	public void verifyFontColorGetTotalButton() {
		
		String expectedHexBackFontColorGetTotal = "#ffffff";
		WebElement getFontColourGetTotal=driver.findElement(By.xpath("//button[@id='button-two']"));
		String actualRgbaFontColorGetTotal = getFontColourGetTotal.getCssValue("color");
		//Convert rgba to hex
		String actualHexFontColorGetTotal = Color.fromString(actualRgbaFontColorGetTotal).asHex();
		assertEquals(expectedHexBackFontColorGetTotal, actualHexFontColorGetTotal,"Font colour of getTotal button"+expectedHexBackFontColorGetTotal);
	}
	@Test
	public void verifyFontSizeGetTotalButton() {
		String expectedBackFontSizeGetTotal ="16px";
		WebElement getFontSizeOfGetTotal=driver.findElement(By.xpath("//button[@id='button-two']"));
		String actualFontSizeGetTotal = getFontSizeOfGetTotal.getCssValue("font-size");
		assertEquals(expectedBackFontSizeGetTotal, actualFontSizeGetTotal,"Font size of getTotal button"+expectedBackFontSizeGetTotal);		
		}
	@Test
	public void assertExamples()
	{
		int a=5,b=6;
		String c=null;
		String d="abc";
		assertNotEquals(a, b,"a and b are equal");
		assertNull(c,"c is not null");
		assertNotNull(d,"d is null");
	}

}
