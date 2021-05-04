package automationFramework;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Activity8_2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver Driver = new ChromeDriver();
		Driver.get("https://www.training-support.net/selenium/tables");
		System.out.println(Driver.getTitle());
		
		List<WebElement> Columns = Driver.findElements(By.xpath("//table[@id='sortableTable']/tbody/tr[1]/td"));
		System.out.println("No. of Columns = " + Columns.size());
		Thread.sleep(2000);
		
		List<WebElement> Rows = Driver.findElements(By.xpath("//table[@id='sortableTable']/tbody/tr"));
		System.out.println("No. of Rows = " + Rows.size());
		Thread.sleep(2000);
		
	     WebElement cellValue2_2 = Driver.findElement(By.xpath("//table[@id='sortableTable']/tbody/tr[2]/td[2]"));
	     System.out.println("Second row, second column value: " + cellValue2_2.getText());

	     Driver.findElement(By.xpath("//table[@id='sortableTable']/thead/tr/th")).click();
	     
	     System.out.println("Second row, second column value: " + cellValue2_2.getText());
	     
	     WebElement Footer = Driver.findElement(By.xpath("//table[@id='sortableTable']/tfoot/tr"));
	     System.out.println("The footer of the table is " + Footer.getText());
	     
	     Driver.close();
	}

}
