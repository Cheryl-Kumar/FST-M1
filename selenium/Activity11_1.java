package automationFramework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.interactions.Actions;

public class Activity11_1 {

	public static void main(String[] args) {
		WebDriver Driver = new FirefoxDriver();
		
		Driver.get("https://www.training-support.net/selenium/javascript-alerts");
		
		Driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		
		System.out.println("Title of the page is: " + Driver.getTitle());
		//Actions actions = new Actions(Driver);
		
		Driver.findElement(By.id("simple")).click();
		Alert SimpleAlert = Driver.switchTo().alert();
		String SimpleAlertText = SimpleAlert.getText();
		System.out.println("Alert Text reads: " + SimpleAlertText);

		SimpleAlert.accept();
		
		Driver.close();
	}

}
