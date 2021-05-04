package automationFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Activity2 {

	public static void main(String[] args) throws InterruptedException {
		//String Element();
		WebDriver Driver = new ChromeDriver();
		Driver.get("https://www.training-support.net/");
		Thread.sleep(2000);
System.out.println(Driver.getTitle());
WebElement Element = Driver.findElement(By.id("about-link"));
System.out.println(Element.getText());
Driver.close();
	}

}
