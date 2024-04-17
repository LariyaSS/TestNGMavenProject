package testScript;

import static org.testng.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class TableClass extends Base {
	@Test
	public void verifyTableHead()
	{
		String expectedTableHeaders=" Name, Position, Office, Age, Start date, Salary ";
		driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
		List<String> addTableHeaders=new ArrayList<String>(); 
		List <WebElement> tableRow=driver.findElements(By.xpath("//tr[@role='row']//child::th"));
		 for(WebElement listrow:tableRow)
		 {
			
			 String textOftableHeaders=listrow.getText();
			 addTableHeaders.add(textOftableHeaders);
			  			 
			
		 }
		// System.out.println(addTableHeaders);
		assertEquals(expectedTableHeaders,addTableHeaders,"Table headers"+expectedTableHeaders);
		
	}

}
