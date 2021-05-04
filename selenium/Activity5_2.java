package automationFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Activity5_2 {

	public static void main(String[] args) {
		WebDriver Driver = new ChromeDriver();
		Driver.get("https://training-support.net/selenium/dynamic-controls ");
		System.out.println("CheckBoxSelected " + Driver.findElement(By.xpath("//input[@class='willDisappear']")).isSelected());
		Driver.findElement(By.xpath("//input[@class='willDisappear']")).click();
		System.out.println("CheckBoxSelected " + Driver.findElement(By.xpath("//input[@class='willDisappear']")).isSelected());
		Driver.close();

	}

}
