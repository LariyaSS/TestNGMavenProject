package testScript;



import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;


public class SoftAssertSample extends Base {
	@Test
	public void verifyBackgroundColorOfShowMessageButton() {
		String expectedColor = "rgba(0, 123, 255, )";
		String fontColor = "rgba(255, 255, 255, 1)";
		String expectedSize ="16px";
	    SoftAssert softassert=new SoftAssert();
		
		WebElement showMessageButton = driver.findElement(By.xpath("//button[@id='button-one']"));
		boolean isshowMessageButtonDisplayed = showMessageButton .isDisplayed();
		
		softassert.assertTrue(isshowMessageButtonDisplayed,"showMessageButton is not available");
		String backGroundColorString = showMessageButton.getCssValue("background-color");
		
		softassert.assertEquals(expectedColor, backGroundColorString, "Background color of showMessageBuutonisnot " + expectedColor);
        String fontColorOfShowMessageButton = showMessageButton.getCssValue("color");
		
        softassert.assertEquals(fontColor, fontColorOfShowMessageButton,"Font Color"+expectedColor);
		String fontSize = showMessageButton.getCssValue("font-size");
		softassert.assertEquals(expectedSize, fontSize,"fontsize"+expectedSize);
		softassert.assertAll();
	}

}
