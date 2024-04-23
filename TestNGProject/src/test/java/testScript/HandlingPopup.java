package testScript;

import java.util.Set;
import java.util.Iterator;



import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class HandlingPopup extends Base{
	@Test
	public void handlingPopUp()
	{
		driver.navigate().to("https://selenium.qabible.in/window-popup.php");
		WebElement facebookPoPUp=driver.findElement(By.xpath("//a[@class='btn btn-primary windowSingle']"));
		facebookPoPUp.click();
		String mainWindow=driver.getWindowHandle();
		Set<String> allWindows= driver.getWindowHandles();
		Iterator<String> i1=allWindows.iterator();		
		
        while(i1.hasNext())			
        {		
            String ChildWindow=i1.next();		
            		
            if(!mainWindow.equalsIgnoreCase(ChildWindow))			
            {    		
                 
                    // Switching to Child window
                    driver.switchTo().window(ChildWindow);
                    WebElement facebookLoginButton=driver.findElement(By.xpath("//form[@id='login_popup_cta_form']//div[@aria-label='Accessible login button']"));
            		facebookLoginButton.click();
            		driver.close();
                    }
            }

        driver.switchTo().window(mainWindow);
			
	}

}
