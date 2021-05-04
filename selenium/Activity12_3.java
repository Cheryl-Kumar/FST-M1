package automationFramework;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity12_3 {
    public static void main(String[] args) {
        WebDriver Driver = new FirefoxDriver();
        WebDriverWait wait = new WebDriverWait(Driver, 10);
        Actions builder = new Actions(Driver);
        
        Driver.get("https://www.training-support.net/selenium/popups");
        
        WebElement button = Driver.findElement(By.xpath("//button[contains(@class, 'orange')]"));

        builder.moveToElement(button).pause(Duration.ofSeconds(1)).build().perform();
        String tooltipText = button.getAttribute("data-tooltip");
        System.out.println("Tooltip text: " + tooltipText);

        button.click();
        
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("signInModal")));

        Driver.findElement(By.id("username")).sendKeys("admin");
        Driver.findElement(By.id("password")).sendKeys("password");
        Driver.findElement(By.xpath("//button[text()='Log in']")).click();

        String message = Driver.findElement(By.id("action-confirmation")).getText();
        System.out.println(message);

        Driver.close();
    }
}