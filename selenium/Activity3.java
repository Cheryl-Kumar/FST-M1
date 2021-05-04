package automationFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Activity3 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver Driver = new ChromeDriver();
		Driver.navigate().to("https://training-support.net/selenium/simple-form");
System.out.println(Driver.getTitle());
WebElement FName = Driver.findElement(By.id("firstName"));
WebElement LName = Driver.findElement(By.id("lastName"));
WebElement Email = Driver.findElement(By.id("email"));
WebElement Contact = Driver.findElement(By.id("number"));
FName.sendKeys("Cheryl");
Thread.sleep(1000);
LName.sendKeys("Kumar");
Thread.sleep(1000);
Email.sendKeys("cherylkumar92@gmail.com");
Thread.sleep(1000);
Contact.sendKeys("07405553165");
Thread.sleep(1000);
Driver.findElement(By.cssSelector(".ui.green.button")).click();
Thread.sleep(1000);
Driver.close();
	}

}
