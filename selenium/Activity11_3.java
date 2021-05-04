package automationFramework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.interactions.Actions;

public class Activity11_3 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver Driver = new FirefoxDriver();
		
		Driver.get("https://www.training-support.net/selenium/javascript-alerts");
		
		Driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		
		System.out.println("Title of the page is: " + Driver.getTitle());
		//Actions actions = new Actions(Driver);
		
		Driver.findElement(By.id("prompt")).click();
		Alert PromtAlert = Driver.switchTo().alert();
		String PromtAlertText = PromtAlert.getText();
		PromtAlert.sendKeys("Yes, you are!");
		Thread.sleep(2000);
		System.out.println("Alert Text reads: " + PromtAlertText);

		PromtAlert.accept();
		
		Driver.close();
	}

}