package automationFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity6_1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver Driver = new ChromeDriver();
		Driver.get("https://training-support.net/selenium/dynamic-controls ");
		System.out.println(Driver.getTitle());
		//Driver.findElement(By.xpath("//input[@class='willDisappear']")).click();
		Driver.findElement(By.id("toggleCheckbox")).click();
		WebDriverWait wait = new WebDriverWait (Driver, 20);
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//label[@class='willDisappear']")));
		WebElement CheckBoxDisplayed = Driver.findElement(By.xpath("//input[@class='willDisappear']"));
		System.out.println("CheckBox is displayed " + CheckBoxDisplayed.isDisplayed());
Driver.findElement(By.id("toggleCheckbox")).click();
wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//label[@class='willDisappear']")));
Driver.findElement(By.xpath("//input[@class='willDisappear']")).click();
Thread.sleep(3000);
//Boolean CheckBoxDisplayed = Driver.findElement(By.xpath("//input[@class='willDisappear']")).isDisplayed();
System.out.println("CheckBox is displayed " + CheckBoxDisplayed.isDisplayed());
Driver.close();
}

}
