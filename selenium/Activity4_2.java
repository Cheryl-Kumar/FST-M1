package automationFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Activity4_2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver Driver = new ChromeDriver();
		Driver.navigate().to("https://www.training-support.net/selenium/simple-form");
		System.out.println(Driver.getTitle());
		WebElement FirstName = Driver.findElement(By.xpath("//input[@id='firstName']"));
		FirstName.sendKeys("Cheryl");
		Thread.sleep(2000);
		
		WebElement LastName = Driver.findElement(By.xpath("//input[@id='lastName']"));
		LastName.sendKeys("Kumar");
		Thread.sleep(2000);
		
		WebElement Email = Driver.findElement(By.xpath("//input[@id='email']"));
		Email.sendKeys("cherylkumar92@gmail.com");
		Thread.sleep(2000);
		
		WebElement Contact = Driver.findElement(By.xpath("//input[@id='number']"));
		Contact.sendKeys("7405553165");
		Thread.sleep(2000);
		
		Driver.findElement(By.xpath("//input[@value='submit']")).click();
		//Driver.close();
	}

}
