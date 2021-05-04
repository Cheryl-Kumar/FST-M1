package automationFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Activity5_3 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver Driver = new ChromeDriver();
		Driver.get("https://training-support.net/selenium/dynamic-controls ");
		System.out.println(Driver.getTitle());
		WebElement TextBox = Driver.findElement(By.xpath("//input[@type='text']"));
		System.out.println("TextBox is Enabled " + TextBox.isEnabled());
		Driver.findElement(By.id("toggleInput")).click();
		Thread.sleep(2000);
		System.out.println("TextBox is Enabled " + TextBox.isEnabled());
		Driver.close();
	}

}
