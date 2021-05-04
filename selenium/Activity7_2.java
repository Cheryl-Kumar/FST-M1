package automationFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity7_2 {

	public static void main(String[] args) {
		WebDriver Driver = new ChromeDriver();
		Driver.get("https://training-support.net/selenium/dynamic-attributes");
		System.out.println(Driver.getTitle());
		WebElement Username = Driver.findElement(By.xpath("(//input[@placeholder='Username'])[2]"));
		Username.sendKeys("admin");
		
		WebElement Password = Driver.findElement(By.xpath("(//input[@placeholder='Password'])[2]"));
		Password.sendKeys("password");
		
		WebElement ConfPassword = Driver.findElement(By.xpath("(//input[@placeholder='Password'])[3]"));
		ConfPassword.sendKeys("password");
		
		WebElement Email = Driver.findElement(By.xpath("//input[@type='email']"));
		Email.sendKeys("cherylkumar92@gmail.com");
		
		Driver.findElement(By.xpath("//button[contains (text(), 'Sign Up')]")).click();
		
		WebDriverWait wait = new WebDriverWait (Driver, 20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='action-confirmation']")));
		System.out.println(Driver.findElement(By.xpath("//div[@id='action-confirmation']")).getText());
		
		Driver.close();

	}

}
