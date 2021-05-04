package automationFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity6_2 {

	public static void main(String[] args) {
		WebDriver Driver = new ChromeDriver();
		Driver.get("https://www.training-support.net/selenium/ajax");
		System.out.println(Driver.getTitle());
		Driver.findElement(By.xpath("//button[contains (@class, 'violet')]")).click();
		WebDriverWait wait = new WebDriverWait (Driver, 20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h1['HELLO']")));
		System.out.println(Driver.findElement(By.xpath("//div[@id='ajax-content']")).getText());
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h3[contains (text(), 'late')]")));
		System.out.println(Driver.findElement(By.xpath("//h3[contains (text(), 'late')]")).getText());
		Driver.close();

	}

}
