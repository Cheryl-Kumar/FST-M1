package automationFramework;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

		public class Activity11_4 {
		    public static void main(String[] args) {
		        // Create a new instance of the Firefox driver
		        WebDriver Driver = new FirefoxDriver();
		        WebDriverWait wait = new WebDriverWait(Driver, 5);

		        //Open browser
		        Driver.get("https://www.training-support.net/selenium/tab-opener");

		        //Print title of page and heading on page
		        System.out.println("Page title is: " + Driver.getTitle());

		        //Get parent window handle
		        String parentWindow = Driver.getWindowHandle();
		        System.out.println("Parent Window: " + parentWindow);

		        //Find link to open new tab and click it
		        Driver.findElement(By.linkText("Click Me!")).click();
		        wait.until(ExpectedConditions.numberOfWindowsToBe(2));

		        //Get Window handles
		        Set<String> allWindowHandles = Driver.getWindowHandles();
		        System.out.println("All window handles: " + allWindowHandles);

		        //Loop through each handle
		        for (String handle : Driver.getWindowHandles()) {
		            Driver.switchTo().window(handle);
		        }

		        //Print the handle of the current window
		        System.out.println("Current window handle: " + Driver.getWindowHandle());

		        //Wait for page to load completely
		        wait.until(ExpectedConditions.titleIs("Newtab"));

		        //Print New Tab Title
		        System.out.println("New Tab Title is: " + Driver.getTitle());

		        //Get heading on new page
		        String newTabText = Driver.findElement(By.xpath("(//div[contains(@class,'content')])[2]")).getText();
		        System.out.println("New tab heading is: " + newTabText);

		        //Open Another Tab
		        Driver.findElement(By.linkText("Open Another One!")).click();
		        wait.until(ExpectedConditions.numberOfWindowsToBe(3));

		        //Make sure the new tab's handle is part of the handles set
		        allWindowHandles = Driver.getWindowHandles();
		        System.out.println("All window handles: " + allWindowHandles);

		        //Loop through the handles set till we get to the newest handle
		        for (String handle : Driver.getWindowHandles()) {
		            Driver.switchTo().window(handle);
		        }

		        //Print the handle of the current window
		        System.out.println("New tab handle: " + Driver.getWindowHandle());

		        //Wait for the newest tab to load completely
		        wait.until(ExpectedConditions.titleIs("Newtab2"));

		        //Print New Tab Title
		        System.out.println("New Tab Title is: " + Driver.getTitle());

		        //Get heading on new page
		        newTabText = Driver.findElement(By.cssSelector("div.content")).getText();
		        System.out.println("New tab heading is: " + newTabText);

		        //Close the browser
		        Driver.quit();
		    }
		}


