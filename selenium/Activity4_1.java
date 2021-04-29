package automationFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Activity4_1 {

public static void main(String[] args) throws InterruptedException {
WebDriver Driver = new ChromeDriver();
Driver.navigate().to("https://www.training-support.net/");
System.out.println(Driver.getTitle());
WebElement Element = Driver.findElement(By.xpath("//a[@id='about-link']"));
Thread.sleep(2000);
Element.click();
System.out.println(Driver.getTitle());
Driver.close();
	}

}
