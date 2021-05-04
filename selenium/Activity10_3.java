package automationFramework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
//import org.openqa.selenium.support.ui.Wait;

public class Activity10_3 {

	public static void main(String[] args) {
		WebDriver Driver = new FirefoxDriver();
		
		Driver.get(" https://training-support.net/selenium/drag-drop");
		
		Driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		
		System.out.println(Driver.getTitle());
		Actions actions = new Actions(Driver);
		
		WebElement DropZone1 = Driver.findElement(By.id("droppable"));

		
		WebElement DropZone2 = Driver.findElement(By.id("dropzone2"));
		
		WebElement Ball = Driver.findElement(By.id("draggable"));
		
	        actions.dragAndDrop(Ball, DropZone1).build().perform();
	        
	        // Wait for the Dropzone's color to change 
	        Wait.until(ExpectedConditions.attributeToBeNotEmpty(DropZone1, "background-color"));
	        System.out.println("ENTERED DROPZONE 1");
	        
	        // Repeat for the second dropzone
	        actions.dragAndDrop(Ball, DropZone2).build().perform();
	        
	        Wait.until(ExpectedConditions.attributeToBeNotEmpty(DropZone2, "background-color"));
	        System.out.println("ENTERED DROPZONE 2");
	        
	        // Close the browser
	        Driver.close();
	}

}
