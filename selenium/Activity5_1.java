package automationFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Activity5_1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver Driver = new ChromeDriver();
		Driver.navigate().to("https://training-support.net/selenium/dynamic-controls");
		System.out.println(Driver.getTitle());
		
		Boolean CheckBoxDisplayed = Driver.findElement(By.xpath("//input[@class='willDisappear']")).isDisplayed();
		if (CheckBoxDisplayed==true) {
			System.out.println("CheckBox is displayed " + CheckBoxDisplayed);
		}
		Driver.findElement(By.id("toggleCheckbox")).click();
		Thread.sleep(2000);
		
		System.out.println("CheckBox is displayed " + CheckBoxDisplayed);

	}

}
