package automationFramework;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Activity8_1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver Driver = new ChromeDriver();
		Driver.get("https://www.training-support.net/selenium/tables");
		System.out.println(Driver.getTitle());
		
		List<WebElement> Columns = Driver.findElements(By.xpath("//table[contains(@class, 'striped')]/tbody/tr[1]/td"));
		System.out.println("No. of Columns = " + Columns.size());
		Thread.sleep(2000);
		
		List<WebElement> Rows = Driver.findElements(By.xpath("//table[contains(@class, 'striped')]/tbody/tr"));
		System.out.println("No. of Rows = " + Rows.size());
		Thread.sleep(2000);
		
		List<WebElement> ThirdRow = (Driver.findElements(By.xpath("//table[contains(@class, 'striped')]/tbody/tr[3]/td")));
		for (WebElement cellValue:ThirdRow) {
			System.out.println("CellValues of third row are " + cellValue.getText());}
		
	     WebElement cellValue2_2 = Driver.findElement(By.xpath("//table[contains(@class, 'striped')]/tbody/tr[2]/td[2]"));
	        System.out.println("Second row, second column value: " + cellValue2_2.getText());
	        
	    Driver.close();
	}

}
